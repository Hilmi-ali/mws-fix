package com.example.responsi

import android.os.Bundle
import android.renderscript.RenderScript.Priority
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import com.androidnetworking.interfaces.JSONObjectRequestListener
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject


class Register : AppCompatActivity() {

    private lateinit var btnDaftar: Button
    private lateinit var login: Button
    private lateinit var editNama : EditText
    private lateinit var editEmail : EditText
    private lateinit var editPassword : EditText
    private lateinit var checkBox: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)

        btnDaftar = findViewById(R.id.btnDaftar)
        login = findViewById(R.id.login)
        editNama = findViewById(R.id.editNama)
        editEmail = findViewById(R.id.editEmail)
        editPassword = findViewById(R.id.editPassword)
        checkBox = findViewById(R.id.checkbox)

        btnDaftar.setOnClickListener {

            if (editNama.text.toString().trim().isEmpty()) {
                editNama.error = "Nama tidak boleh kosong"
                editNama.requestFocus()
            }

            else if (editEmail.text.toString().trim().isEmpty()) {
                editEmail.error = "Email tidak boleh kosong"
                editEmail.requestFocus()
            }

            else if (editPassword.text.toString().trim().length < 8) {
                editPassword.error = "Password kurang dari 8 karakter"
                editPassword.requestFocus()
            }

            else if (!checkBox.isChecked) {
                checkBox.error = "Wajib centang persetujuan"
                checkBox.requestFocus()
            }

            else {
                val jsonObject = JSONObject()
                try {
                    jsonObject.put("name", editNama.text.toString().trim())
                    jsonObject.put("email",editEmail.text.toString().trim())
                    jsonObject.put("password",editPassword.text.toString().trim())
                    jsonObject.put("terms",1)
                } catch (e: JSONException) {
                    e.printStackTrace()
                }

                AndroidNetworking.post("https://grocery-api.tonsu.site/auth/register")
                    .addJSONObjectBody(jsonObject) // posting json
                    .addHeaders("Content-Type", "application/json")
                    .setPriority(com.androidnetworking.common.Priority.MEDIUM)
                    .build()
                    .getAsJSONObject(object : JSONObjectRequestListener {
                        override fun onResponse(response: JSONObject) {
                            // do anything with response
                            Log.d("ini cek respon", response.toString())
                            try {
                                if (response?.getString("success").equals("true")){
                                    Toast.makeText(this@Register, "Register Berhasil", Toast.LENGTH_SHORT).show()
                                }
                            }
                            catch ( e : JSONException){

                            }
                        }

                        override fun onError(error: ANError?) {
                            // handle error
                        }
                    })

            }
        }
}
    private fun register(){

    }
}
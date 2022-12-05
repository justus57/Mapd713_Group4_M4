package com.example.mapd713_group4_m2

import android.app.DatePickerDialog
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Website.URL
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.util.*


class AddPatient : AppCompatActivity() {
    lateinit var date_picker: Button
    lateinit var button: Button
    var datePickerDialog: DatePickerDialog? = null
    lateinit var date: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_patient)
       button = findViewById(R.id.AddNewPatient)
        date_picker = findViewById(R.id.date_picker)
        date = findViewById(R.id.tvSelectedDate);
        val c = Calendar.getInstance()
        var year= c.get(Calendar.YEAR)
        var month= c.get(Calendar.MONTH)
        val dayOfMonth= c.get(Calendar.DAY_OF_MONTH)
        date_picker.setOnClickListener(View.OnClickListener {

            datePickerDialog = DatePickerDialog(this@AddPatient,
                { datePicker, year, month, day -> date.setText(day.toString() + "/" + (month + 1) + "/" + year) },
                year,
                month,
                dayOfMonth
            )
            datePickerDialog!!.show()
        })

        button.setOnClickListener {
            fun sendPostRequest(userName:String, password:String) {
                var reqParam = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(userName, "UTF-8")
                reqParam += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8")
                val mURL = URL("http://127.0.0.1:5000/patient")

                with(mURL.openConnection() as HttpURLConnection) {
                    // optional default is GET
                    requestMethod = "POST"

                    val wr = OutputStreamWriter(getOutputStream());
                    wr.write(reqParam);
                    wr.flush();

                    println("URL : $url")
                    println("Response Code : $responseCode")

                    BufferedReader(InputStreamReader(inputStream)).use {
                        val response = StringBuffer()
                        var inputLine = it.readLine()
                        while (inputLine != null) {
                            response.append(inputLine)
                            inputLine = it.readLine()
                        }
                        println("Response : $response")
                    }
                }
            }
        }
    }
}
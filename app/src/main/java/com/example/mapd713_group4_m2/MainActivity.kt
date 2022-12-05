package com.example.mapd713_group4_m2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

public class MainActivity : AppCompatActivity() {
    lateinit var addPatient: Button
    lateinit var patientInfo: Button
    lateinit var patientRec: Button
    lateinit var patientTest: Button
    lateinit var PatientList: Button

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addPatient = findViewById(R.id.addPatient)
        patientInfo = findViewById(R.id.patientInfo)
        patientRec = findViewById(R.id.patientRec)
        patientTest = findViewById(R.id.patientTest)
        PatientList = findViewById(R.id.PatientList)

        addPatient.setOnClickListener {
            val intent = Intent(this, AddPatient::class.java)
            startActivity(intent)
        }
        patientInfo.setOnClickListener {
            val intent = Intent(this, EditPatientInfo::class.java)
            startActivity(intent)
        }
        patientRec.setOnClickListener {
            val intent = Intent(this, AddPatient::class.java)
            startActivity(intent)
        }
        patientTest.setOnClickListener {
            val intent = Intent(this, AddPatient::class.java)
            startActivity(intent)
        }
        PatientList.setOnClickListener {
            val intent = Intent(this, ViewPatientList::class.java)
            startActivity(intent)
        }

    }
}
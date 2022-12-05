package com.example.mapd713_group4_m2

import android.os.Bundle
import android.view.View.OnCreateContextMenuListener
import android.widget.Button
import androidx.core.os.bundleOf
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class MainActivityTest {
 private  lateinit var viewModel:MainActivity
    @Before
    fun setUp() {
        viewModel = MainActivity()

    }
    @Test
    fun `on clicking addPatient`(){
      val button =viewModel.findViewById<Button>(R.id.addPatient)
        assertEquals("addPatient", button)
    }
    @Test
    fun `onClicking addPatient`(){
        val button =viewModel.findViewById<Button>(R.id.patientInfo)
        assertEquals("patientInfo", button)
    }
    @Test
    fun `onPress addPatient`(){
        val button =viewModel.findViewById<Button>(R.id.patientRec)
        assertEquals("patientRec", button)
    }

}
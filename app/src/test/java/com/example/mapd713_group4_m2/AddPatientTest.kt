package com.example.mapd713_group4_m2

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class AddPatientTest {
 private  lateinit var  View:AddPatient
    @Before
    fun setUp() {
        View = AddPatient()
    }

    @Test
    fun getDate_picker() {
        assertFalse(View.date_picker.isActivated)
    }
}


package com.kijja.patientdoctorscheduler.database.patient

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "patient")
data class Patient(
    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String,
    @ColumnInfo(name = "date_of_birth") val dob: Double,
    @ColumnInfo(name = "gender") val gender: String
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "patient_id")
    var id: Long = 0

    @ColumnInfo(name = "age")
    val age: Int = 0
}
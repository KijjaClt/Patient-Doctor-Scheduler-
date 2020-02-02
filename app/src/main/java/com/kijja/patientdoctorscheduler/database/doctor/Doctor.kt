package com.kijja.patientdoctorscheduler.database.doctor

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "doctor")
data class Doctor(
    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String,
    @ColumnInfo(name = "speciality") val speciality: String
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "doctor_id")
    var id: Long = 0
}
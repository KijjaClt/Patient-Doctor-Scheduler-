package com.kijja.patientdoctorscheduler.database.appointment

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "appointment", primaryKeys = ["patient_id", "doctor_id"])
data class AppointmentCrossRef(
    @ColumnInfo(name = "patient_id") val patientID: Long,
    @ColumnInfo(name = "doctor_id") val doctorID: Long
)
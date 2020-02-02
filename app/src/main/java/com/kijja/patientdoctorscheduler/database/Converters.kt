package com.kijja.patientdoctorscheduler.database

import androidx.room.TypeConverter

class Converters {
    @TypeConverter
    fun datestampToAge(dob: Double): Int {
        return 0
    }
}
package com.kijja.patientdoctorscheduler.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kijja.patientdoctorscheduler.database.doctor.Doctor
import com.kijja.patientdoctorscheduler.database.patient.Patient
import com.kijja.patientdoctorscheduler.util.DATABASE_NAME

/**
 * The Room database for this app
 */
@Database(entities = [Patient::class, Doctor::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
//    abstract fun patientDao(): PatientDao
//    abstract fun doctorDao(): DoctorDao

    companion object {
        fun getAppDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
        }
    }
}
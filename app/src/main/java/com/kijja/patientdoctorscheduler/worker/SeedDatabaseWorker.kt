package com.kijja.patientdoctorscheduler.worker

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.kijja.patientdoctorscheduler.database.AppDatabase
import com.kijja.patientdoctorscheduler.database.patient.Patient
import com.kijja.patientdoctorscheduler.util.DATA_FILENAME
import kotlinx.coroutines.coroutineScope

class SeedDatabaseWorker(context: Context, workerParams: WorkerParameters) :
    CoroutineWorker(context, workerParams) {
    override suspend fun doWork(): Result = coroutineScope {
        try {
            applicationContext.assets.open(DATA_FILENAME).use { inputStream ->
                JsonReader(inputStream.reader()).use { jsonReader ->
                    val patientType = object : TypeToken<List<Patient>>() {}.type
                    val patientList: List<Patient> = Gson().fromJson(jsonReader, patientType)

                    val database = AppDatabase.getAppDatabase(applicationContext)
//                    database.patientDao().insertAll(patientList)

                    Result.success()
                }
            }
        } catch (ex: Exception) {
            Log.e(TAG, "Error seeding database", ex)
            Result.failure()
        }
    }

    companion object {
        private val TAG = SeedDatabaseWorker::class.java.simpleName
    }
}
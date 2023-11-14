package com.example.docapp2.data.reservation

import com.example.docapp2.data.dom.ReservationDataSource
import com.example.docapp2.data.dom.Reservation
import com.example.docapp2.database.DocDatabase

class SqlDelightReservationDataSource(db: DocDatabase): ReservationDataSource {

    private val queries = db.docQueries

    override suspend fun insertReservation(doc: Reservation) {
        queries.insertDoctor(
            doc.id,
            doc.name,
            doc.speciality,
            doc.time)
    }

    override suspend fun getReservationById(id: Long): Reservation? {
        return queries.getDoctorbyId(id).executeAsOneOrNull()?.toReservation()
    }

    override suspend fun getAllReservations(): List<Reservation> {
        return queries.getAllDoctors().executeAsList().map { it.toReservation() }
    }

    override suspend fun deleteReservationById(id: Long) {
        queries.deleteDoctorById(id)
    }
}
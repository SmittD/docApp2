package com.example.docapp2.data.dom

interface ReservationDataSource {
    suspend fun insertReservation (doc: Reservation)
    suspend fun getReservationById(id:Long): Reservation?
    suspend fun getAllReservations(): List<Reservation>
    suspend fun deleteReservationById(id: Long)
}
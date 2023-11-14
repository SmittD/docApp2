package com.example.docapp2.data.dom

class SearchReservations {
    fun execute(reservations: List<Reservation>, query: String): List<Reservation>{
        if(query.isBlank()){
            return reservations
        }
        return reservations.filter {
            it.name.trim().lowercase().contains(query.lowercase()) ||
                    it.speciality.trim().lowercase().contains(query.lowercase())
        }.sortedByDescending {it.time}
    }
}
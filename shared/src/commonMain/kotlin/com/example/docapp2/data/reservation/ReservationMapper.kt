package com.example.docapp2.data.reservation

import com.example.docapp2.data.dom.Reservation
import database.DocEntity

fun DocEntity.toReservation(): Reservation {
    return Reservation(
        id = id,
        name = name,
        speciality = specialty,
        time = time,
    )
}
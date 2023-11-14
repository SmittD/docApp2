package com.example.docapp2.android.reservation_list

import com.example.docapp2.data.dom.Reservation

data class ReservationListState(
    val reservations: List<Reservation> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)

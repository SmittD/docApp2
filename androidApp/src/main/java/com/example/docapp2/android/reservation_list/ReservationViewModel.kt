package com.example.docapp2.android.reservation_list

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.docapp2.data.dom.ReservationDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ReservationViewModel @Inject constructor(
    private val reservationDataSource: ReservationDataSource,
    private val savedStateHandle: SavedStateHandle
): ViewModel()


}
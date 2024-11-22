package com.example.p6meeting8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.p6meeting8.ui.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
class MahasiswaViewModel : ViewModel() {

    // State untuk status UI
    private val _statusUI = MutableStateFlow(Mahasiswa())
    val statusUI: StateFlow<Mahasiswa> = _statusUI.asStateFlow()

    // Fungsi untuk menyimpan data mahasiswa
    fun saveDataMahasiswa(ls: MutableList<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nim= ls[0],
                nama = ls[1],
                email = ls[2],
            )
        }
    }
}

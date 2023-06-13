package com.bishal.hilt_gerenic_activity_viewmodel.viewmodel


import android.util.Log
import androidx.lifecycle.viewModelScope
import com.bishal.hilt_gerenic_activity_viewmodel.persistence.sharedpref.SharedPrefs
import com.bishal.hilt_gerenic_activity_viewmodel.viewmodel.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val sharedPrefs: SharedPrefs) : BaseViewModel() {



}
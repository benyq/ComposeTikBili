package com.benyq.tikbili

import androidx.lifecycle.ViewModel
import com.benyq.tikbili.mvi.extension.containers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class MainViewModel: ViewModel() {
    private val homeContainer by containers<HomeState, HomeEvent>(HomeState())

    private val _uiState = MutableStateFlow(HomeState())
    val uiState: StateFlow<HomeState> = _uiState.asStateFlow()
}
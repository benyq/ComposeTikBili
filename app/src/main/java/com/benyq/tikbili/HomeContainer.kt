package com.benyq.tikbili

import com.benyq.tikbili.mvi.UiEvent
import com.benyq.tikbili.mvi.UiState


data class HomeState(
    val currentPage: Page = Page.Home
): UiState {
    enum class Page {
        Home, Me
    }
}

sealed class HomeEvent: UiEvent {
    data class ToastEvent(val message: String) : HomeEvent()
}
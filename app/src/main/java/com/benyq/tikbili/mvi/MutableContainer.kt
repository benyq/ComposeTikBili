package com.benyq.tikbili.mvi

import com.benyq.tikbili.mvi.Container

interface MutableContainer<STATE : UiState, SINGLE_EVENT : UiEvent> :
    Container<STATE, SINGLE_EVENT> {

    fun updateState(action: STATE.() -> STATE)

    fun sendEvent(event: SINGLE_EVENT)

}
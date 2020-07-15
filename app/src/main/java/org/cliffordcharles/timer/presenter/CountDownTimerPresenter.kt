package org.cliffordcharles.timer.presenter

import org.cliffordcharles.timer.Contract
import org.cliffordcharles.timer.Timer

class CountDownTimerPresenter (timer: Timer): Contract.Presenter {
    lateinit var timer: Timer

    override fun resetTimer() {
        TODO("Not yet implemented")
    }

}
package org.cliffordcharles.timer

import android.app.Application
import android.os.CountDownTimer
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class Timer(application: Application, timerDuration: Long, onTickIntervals: Long, lifecycleOwner
:LifecycleOwner) : LifecycleObserver {

    private var isStarted = false
    private val lifecycle = lifecycleOwner.lifecycle

    init {
        lifecycle.addObserver(this)
    }

    private val countDownTimer = object : CountDownTimer(timerDuration, onTickIntervals) {
        override fun onFinish() {
            TODO("Not yet implemented")
        }
        override fun onTick(millisUntilFinished: Long) {
            if(lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED))
            TODO("Not yet implemented")
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startTimer() {
        if (!isStarted)
            isStarted = true
            countDownTimer.start()

    }

    fun finished() {
        countDownTimer.onFinish()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun cancelTimer() {
        countDownTimer.cancel()
    }
}
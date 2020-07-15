package org.cliffordcharles.timer

interface Contract {

    interface View {
        fun displayTime()
    }
    interface Presenter {
        fun resetTimer()
    }
}
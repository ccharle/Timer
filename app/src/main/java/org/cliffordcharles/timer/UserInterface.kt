package org.cliffordcharles.timer

interface UserInterface {

   fun setTimer(lengthOfTimer:Long, countDownInterval:Long){}

    fun reset(){}
}
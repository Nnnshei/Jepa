package ru.ucoz.columbiapictures.vombat

import android.util.Log

class SomeText(val number: Int): Text(){
    override fun printText() {
        super.printText()
        Log.e("SomeText", number.toString())
    }
}
package models

import android.annotation.SuppressLint
import android.view.View

interface SearchCLick {
    fun searchOpen()
    fun searchClose()
}

@SuppressLint("StaticFieldLeak")
object SearchViewB{
    var s:View? = null
}
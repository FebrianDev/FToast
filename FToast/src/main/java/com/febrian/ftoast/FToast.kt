package com.febrian.ftoast

import android.content.Context
import android.widget.Toast

class FToast(private val context: Context){
    /**
     * Show toast from id string resource
     *
     * @param id the id string resource
     */
    fun show(id: Int) {
        Toast.makeText(context, context.getString(id), Toast.LENGTH_SHORT).show()
    }

    /**
     * Show toast from string message
     *
     * @param message the string message
     */
    fun show(message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    /**
     * Show toast from char sequence message
     *
     * @param message the char sequence message
     */
    fun show(message: CharSequence?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}
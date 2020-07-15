package org.cliffordcharles.timer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import org.cliffordcharles.timer.R
private val arrayOfNumbers = arrayOf(0..10)
class NumberPadAdapter(private val context: Context) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var keyPadButton = convertView

        if (keyPadButton != null) {
            keyPadButton = LayoutInflater.from(context).inflate(R.layout.keypad_layout,
                                                                parent,
                                                                false) as Button;
            keyPadButton.text = arrayOfNumbers[position].toString()
        }
        return keyPadButton
    }

    override fun getItem(position: Int): Any {
        return arrayOfNumbers[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return arrayOfNumbers.size
    }
}
package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_move_for_result.*

class MoveForResultActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnChoose: Button
    private lateinit var rgNumber: RadioGroup
    companion object {
        const val EXTRA_SELECTED_VALUE = "extra_selected_value"
        const val RESULT_CODE = 110
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        btnChoose = findViewById(R.id.btn_choose)
        rgNumber = findViewById(R.id.rg_number)

        btnChoose.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_choose) {
            if (rg_number.checkedRadioButtonId != 0) {
                var value = 0
                when (rg_number.checkedRadioButtonId) {
                    R.id.rb_7 -> value = 7
                    R.id.rb_14 -> value = 14
                    R.id.rb_33 -> value = 33
                    R.id.rb_39 -> value = 39
                }

                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, value)
                setResult(RESULT_CODE, resultIntent)
                finish()
            }
        }
    }
}
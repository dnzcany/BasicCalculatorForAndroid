package com.denobaba.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.denobaba.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun sum(view: View){
        var a = binding.editTextTextPersonName2.text.toString().toFloatOrNull()
        var b = binding.editTextTextPersonName3.text.toString().toFloatOrNull()

        if (a== null || b == null){
            binding.textView3.text = "error"


        }else {
            binding.textView3.text = "${a+b}"

        }


    }

    fun minus(view: View){
        var a = binding.editTextTextPersonName2.text.toString().toFloatOrNull()
        var b = binding.editTextTextPersonName3.text.toString().toFloatOrNull()

        if (a== null || b == null){
            binding.textView3.text = "error"


        }else {
            binding.textView3.text = "${a-b}"

        }


    }

    fun times(view: View){
        var a = binding.editTextTextPersonName2.text.toString().toFloatOrNull()
        var b = binding.editTextTextPersonName3.text.toString().toFloatOrNull()
        if (a== null || b == null){
            binding.textView3.text = "error"


        }else {
            binding.textView3.text = "${a*b}"

        }

    }

    fun divide(view: View){
        var a = binding.editTextTextPersonName2.text.toString().toFloatOrNull()
        var b = binding.editTextTextPersonName3.text.toString().toFloatOrNull()
        if (a== null || b == null){
            binding.textView3.text = "error"


        }else {
            binding.textView3.text = "${a/b}"

        }


    }


}
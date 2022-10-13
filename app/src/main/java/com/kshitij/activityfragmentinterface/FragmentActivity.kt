package com.kshitij.activityfragmentinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.kshitij.activityfragmentinterface.ActivityInterface
import com.kshitij.activityfragmentinterface.ActivityInterface2
import com.kshitij.activityfragmentinterface.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    lateinit var binding : ActivityFragmentBinding
    lateinit var activityInterface : ActivityInterface
    lateinit var activityInterface2: ActivityInterface2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnred.setOnClickListener {
            activityInterface.changeColor(1)
            activityInterface2.changeColor(1)
        }
        binding.btngreen.setOnClickListener {
            activityInterface.changeColor(2)
            activityInterface2.changeColor(2)
        }
        binding.btnblue.setOnClickListener {
            activityInterface.changeColor(3)
            activityInterface2.changeColor(3)
        }    }

    fun btnfunction(count: Int) {
        activityInterface2.changeColor(count+3)
    }
}
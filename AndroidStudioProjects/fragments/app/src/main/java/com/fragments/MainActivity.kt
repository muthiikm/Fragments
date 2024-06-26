package com.fragments

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.Fragment
import com.fragments.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContent {binding.root }

        binding.fragmentBtn.setOnClickListener(){

            replaceFragment(FirstFragment())


        }

        binding.fragmentBtn.setOnClickListener(){

            replaceFragment(SecondFragment())


        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
//        fragmentTransaction.addToBackStack(null)  // Optional: adds this transaction to the back stack
        fragmentTransaction.commit()  // Don't forget to commit the transaction
    }

}

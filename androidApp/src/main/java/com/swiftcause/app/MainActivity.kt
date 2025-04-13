package com.swiftcause.app

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.firebase.auth.FirebaseAuth
import com.swiftcause.swiftcause.Greeting

class MainActivity : ComponentActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    auth = FirebaseAuth.getInstance()

                    // Test signUp and login
                    signUp("test@example.com", "password123")
                }
            }
        }
    }

    fun signUp(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // User created, proceed
                    Log.d("Firebase", "User created successfully")
                } else {
                    // Handle error
                    Log.e("Firebase", "Error creating user: ${task.exception?.message}")
                }
            }
    }

    // Login function
    fun login(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // User logged in successfully
                    Log.d("Firebase", "User logged in successfully")
                } else {
                    // Handle error
                    Log.e("Firebase", "Error logging in: ${task.exception?.message}")
                }
            }
    }
}




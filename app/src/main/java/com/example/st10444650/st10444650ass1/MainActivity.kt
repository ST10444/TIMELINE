package com.example.st10444650.st10444650ass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Declarations */

        val GenerateButton = findViewById<Button>(R.id.GenerateButton)
        val ClearButton = findViewById<Button>(R.id.ClearButton)
        val NumTextNumber = findViewById<EditText>(R.id.NumText)
        val ResultTextView = findViewById<TextView>(R.id.ResultText)
        GenerateButton.setOnClickListener {

            /* if else statement */
            val age = NumTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                ResultTextView.text = "Please enter a valid age"


            } else {

                if (age < 20 || age > 100) {
                    ResultTextView.text = "please enter a valid age between 20 to 100"
                    NumTextNumber.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                        40 -> "Paul Walker was a American actor, He was best known for his role as Brian O'Conner in Fast and Furious franchise."
                        50 -> "Michael Jackson was an American singer,songwriter,dancer and philanthropist,Known as the King of Pop."
                        43 -> "Chadwick Boseman One of the greatest actors in the world, known for his role as T'challa the Black Panther in the MCU Universe, black superhero."
                        25 -> "Angus Cloud,was an American actor,He was best known for his portrayal of Fezco in HBO drama series Euphoria"
                        20 -> "Cameron Boyce was an American actor,He began his career as a child actor appearing in 2008 films Mirrors and Eagle Eye."
                        63 -> "Robin Willams, was an American actor and comedian. Known for his improvisational skills and the wide variety of characters."
                        36 -> "Marilyn Monroe,was an American actress and model. Known for playing comic Blonde Bombshell characters."
                        28 -> "Heath Ledger, was an Australian actor.After playing roles in several Australian television and film productions during 1990s, he moved to the United States of America."
                        27 -> "Jimi Hendrix,was an American guitarist,songwriter and singer,although his mainstream career spanned only for four years."
                        42 -> "Elvis Presley,also known mononymously as Elvis ,was an american singer and actor,known as the King of Rock and Roll  ."

                        else -> "No one Died at this age, try a different one!"

                    }
                    ResultTextView.text = result

                }

            }
            ClearButton.setOnClickListener {
                NumTextNumber.text.clear()
                ResultTextView.text = ""
            }



        }



    }


}


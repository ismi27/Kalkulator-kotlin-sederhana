package com.tugas4sc6.android3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etNumber1 = findViewById<EditText>(R.id.et1)
        val etNumber2 = findViewById<EditText>(R.id.et2)
        val etHasil = findViewById<EditText>(R.id.etHasil)

        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKurang = findViewById<Button>(R.id.btnKurang)
        val btnKali = findViewById<Button>(R.id.btnKali)
        val btnBagi = findViewById<Button>(R.id.btnBagi)

        btnTambah.setOnClickListener {
            if (etNumber1.text.toString().isEmpty() && etNumber2.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
                etNumber2.setError("input semua bilangan,jangan kosong")

            }
            else if (etNumber1.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
            }
            else if (etNumber2.text.toString().isEmpty()) {
                etNumber2.setError("input semua bilangan,jangan kosong")
            }
                else {
                val a = etNumber1.text.toString().toDouble()
                val b = etNumber2.text.toString().toDouble()
                val c = a + b
                etHasil.setText(c.toString())
            }
        }

        btnKurang.setOnClickListener {
            if (etNumber1.text.toString().isEmpty() && etNumber2.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
                etNumber2.setError("input semua bilangan,jangan kosong")

            }
            else if (etNumber1.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
            }
            else if (etNumber2.text.toString().isEmpty()) {
                etNumber2.setError("input semua bilangan,jangan kosong")
            }
            else {
                val a = etNumber1.text.toString().toDouble()
                val b = etNumber2.text.toString().toDouble()
                val c = a - b
                etHasil.setText(c.toString())
            }
        }

        btnKali.setOnClickListener {
            if (etNumber1.text.toString().isEmpty() && etNumber2.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
                etNumber2.setError("input semua bilangan,jangan kosong")

            }
            else if (etNumber1.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
            }
            else if (etNumber2.text.toString().isEmpty()) {
                etNumber2.setError("input semua bilangan,jangan kosong")
            } else {
                val a = etNumber1.text.toString().toDouble()
                val b = etNumber2.text.toString().toDouble()
                val c = a * b
                etHasil.setText(c.toString())
            }
        }

        btnBagi.setOnClickListener {
            if (etNumber1.text.toString().isEmpty() && etNumber2.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
                etNumber2.setError("input semua bilangan,jangan kosong")

            }
            else if (etNumber1.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
            }
            else if (etNumber2.text.toString().isEmpty()) {
                etNumber2.setError("input semua bilangan,jangan kosong")
            } else {
                val a = etNumber1.text.toString().toDouble()
                val b = etNumber2.text.toString().toDouble()
                val c = a / b
                etHasil.setText(c.toString())
            }
        }

        btnModulo.setOnClickListener {
            if (etNumber1.text.toString().isEmpty() && etNumber2.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
                etNumber2.setError("input semua bilangan,jangan kosong")

            }
            else if (etNumber1.text.toString().isEmpty()) {
                etNumber1.setError("input semua bilangan,jangan kosong")
            }
            else if (etNumber2.text.toString().isEmpty()) {
                etNumber2.setError("input semua bilangan,jangan kosong")
            }else {
                val a = etNumber1.text.toString().toDouble()
                val b = etNumber2.text.toString().toDouble()
                val c = a % b
                etHasil.setText(c.toString())
            }
        }
    }
}

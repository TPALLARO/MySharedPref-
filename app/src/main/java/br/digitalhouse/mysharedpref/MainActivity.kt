package br.digitalhouse.mysharedpref

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnExibir = findViewById<Button>(R.id.btnSave)
        var txtNome = findViewById<EditText>(R.id.textName)
        var txtIdade = findViewById<EditText>(R.id.textIdade)


        btnExibir.setOnClickListener{
            var sharedPreferences = getSharedPreferences("mySharedPreferences", MODE_PRIVATE)
            var editor = sharedPreferences.edit()
            editor.putString("nome",txtNome.text.toString())
            editor.putString("idade",txtIdade.text.toString())
            editor.commit()

            var intent = Intent(this, MainActivity2 :: class.java)
            startActivity(intent)
        }


    }
}
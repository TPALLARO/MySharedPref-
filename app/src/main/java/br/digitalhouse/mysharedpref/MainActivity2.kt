package br.digitalhouse.mysharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var sharedPreferences = getSharedPreferences("mySharedPreferences", MODE_PRIVATE)
        var nome = sharedPreferences.getString("nome", "nenhum")
        var idade = sharedPreferences.getString("idade","0 anos")
        var textView = findViewById<TextView>(R.id.textView)
        textView.text = "O nome do usuário logado é $nome e tem $idade anos"
    }
}
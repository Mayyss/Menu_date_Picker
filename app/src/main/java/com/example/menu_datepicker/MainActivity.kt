package com.example.menu_datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Log.i("xpto", "onCreate")*/
    }
    // Metodo para criar o menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.menu_cadastro, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Log.i("xpto","Clicou no menu " + item.title)
        //return super.onOptionsItemSelected(item)

        if (item.itemId == R.id.menu_sair)
        {
            //Chama o onDestroy
            finish()
        }
        else if(item.itemId == R.id.menu_salvar)
        {
            Log.i("xpto","Salvando...")
        }

        return true


    }


/* Metodos de ciclo de vida
    override fun onStop() {
        super.onStop()
        Log.i("xpto", "onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.i("xpto", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("xpto", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("xpto", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("xpto", "onDestroy")
    }
*/
}
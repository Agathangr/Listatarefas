package com.example.listatarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.listatarefas.databinding.ActivityItemTarefaBinding

class item_tarefa : AppCompatActivity() {

    private val binding by lazy {
        ActivityItemTarefaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(binding.root)
    }
}
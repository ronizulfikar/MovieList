package com.example.mymovielist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymovielist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.title = "My Books"

        setBookList()
    }

    private fun setBookList() {
        val rvBookListAdapter = BookListAdapter()

        binding.rvBookList.layoutManager = LinearLayoutManager(this)
        binding.rvBookList.adapter = rvBookListAdapter

        rvBookListAdapter.addBookList(BookList.bookList)
    }
}
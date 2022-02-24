package com.cahrusat.recyclerviewdemo23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arrStudent:ArrayList<Student> = ArrayList()
        arrStudent.add(Student("Nilay", 1))
        arrStudent.add(Student("Rakesh", 2))
        arrStudent.add(Student("Hiyan", 3))
        arrStudent.add(Student("Kartik", 4))
        arrStudent.add(Student("Tirth", 5))
        arrStudent.add(Student("Nand", 6))
        myrecycle.adapter=MyAdapter(arrStudent)
        myrecycle.addItemDecoration(DividerItemDecoration(applicationContext,
            DividerItemDecoration.VERTICAL))

    }
}
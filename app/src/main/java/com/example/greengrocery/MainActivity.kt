package com.example.greengrocery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list_item = ArrayList<Vegetables>()
    val adapt = MyAdapter(this, list_item)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycle = findViewById<RecyclerView>(R.id.recyclerView)

        recycle.adapter = adapt
        recycle.layoutManager = LinearLayoutManager(this)
        recycle.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        createListData()


    }


    private fun createListData(){


        var planet= Vegetables("aubergine", "Fresh Aubergine come on!", R.drawable.auberginr)
        list_item.add(planet)

        var planet1= Vegetables("Cucumber", "Fresh Cucumber come on!", R.drawable.cucumber)
        list_item.add(planet1)
        var planet2= Vegetables("Garlic", "Fresh Garlic come on!", R.drawable.garlic)
        list_item.add(planet2)
        var planet3= Vegetables("Green peas", "Fresh Green Peas come on!", R.drawable.greenpeas)
        list_item.add(planet3)
        var planet4= Vegetables("Onion", "Fresh Onion come on!", R.drawable.onion)
        list_item.add(planet4)
        var planet5= Vegetables("Potatoe", "Fresh Potatoe come on!", R.drawable.potatoe)
        list_item.add(planet5)
        var planet6= Vegetables("Tomatoe", "Fresh Tomatoe come on!", R.drawable.tomatoe)
        list_item.add(planet6)

        adapt.notifyDataSetChanged()
    }
}
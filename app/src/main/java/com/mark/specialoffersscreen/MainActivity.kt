package com.mark.specialoffersscreen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val offersList = listOf(
            Offer(R.drawable.food_mush_burger, "30%", "06:32:45"),
            Offer(R.drawable.food_big_meal, "25%", "06:32:45"),
            Offer(R.drawable.food_pizza1, "20%", "06:32:45"),
            Offer(R.drawable.food_pizza2, "15%", "06:32:45"),
            Offer(R.drawable.food_share_meal, "10%", "06:32:45"),
            Offer(R.drawable.food_mush_burger, "30%", "06:32:45"),
        )

        val rvOffers = findViewById<RecyclerView>(R.id.rvOffers)


        val adapter = OfferAdapter(offersList)
        rvOffers.adapter = adapter
        rvOffers.layoutManager = LinearLayoutManager(this)





    }
}
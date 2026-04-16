package com.mark.specialoffersscreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class OfferAdapter (
    val offers: List<Offer>
) : RecyclerView.Adapter<OfferAdapter.OfferViewHolder>()
{

    inner class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageOffer: ImageView = itemView.findViewById(R.id.imageOffer)
        val textDiscount: TextView = itemView.findViewById(R.id.textDiscount)
        val textTime: TextView = itemView.findViewById(R.id.textTime)
        val btnOrder: Button = itemView.findViewById(R.id.btnOrder)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OfferViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_offer, parent, false)
        return OfferViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: OfferViewHolder,
        position: Int
    ) {
         val offer = offers[position]
         holder.itemView.apply {
             holder.imageOffer.setImageResource(offer.image)
             holder.textDiscount.text = offer.discount
             holder.textTime.text = offer.time
             holder.btnOrder.setOnClickListener {
                 Toast.makeText(context, "Order Now Clicked", Toast.LENGTH_SHORT).show()
             }
         }
    }

    override fun getItemCount(): Int {
        return offers.size
    }
}
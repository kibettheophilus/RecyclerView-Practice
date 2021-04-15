package ke.co.topup.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private var titles:List<String>, private var details:List<String>) :
RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>(){

    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemTitle: TextView = itemView.findViewById(R.id.tv_title)
        val itemdetails: TextView = itemView.findViewById(R.id.tv_details)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,
                parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemdetails.text = details[position]
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}
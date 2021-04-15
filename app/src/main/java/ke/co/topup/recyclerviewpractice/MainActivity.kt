package ke.co.topup.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var titleList = mutableListOf<String>()
    private var detailsList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewAdapter(titleList, detailsList)
    }

    //add items to list
    private fun addList(title: String, details: String){
        titleList.add(title)
        detailsList.add(details)
    }
    //create sample items
    private fun postToList(){
        for (i in 1..25){
            addList("Title $i", "Details $i")
        }
    }
}
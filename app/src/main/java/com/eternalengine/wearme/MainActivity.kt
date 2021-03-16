package com.eternalengine.wearme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvWear: RecyclerView
    private var list: ArrayList<Wear> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvWear = findViewById(R.id.rv_wear)
        rvWear.setHasFixedSize(true)

        list.addAll(WearData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvWear.layoutManager = LinearLayoutManager(this)
        val listWearAdapter = ListWearAdapter(list)
        rvWear.adapter = listWearAdapter

        listWearAdapter.setOnItemClickCallback(object : ListWearAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Wear) {
                showSelectedWear(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveIntent)
        return super.onOptionsItemSelected(item)
    }

    private fun showSelectedWear(wear: Wear) {
        val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy")
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_WEAR, wear)
        startActivity(moveWithDataIntent)
//        Toast.makeText(this, "Kamu memilih " + wear.name, Toast.LENGTH_SHORT).show()
    }
}

package uk.co.jakelee.databindingexperiments.vogella

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uk.co.jakelee.databindingexperiments.R
import java.util.Arrays.asList


class SecondActivity : Activity() {

    private var recyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vogella_second_activity)
        recyclerView = findViewById(R.id.my_recycler_view)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView!!.setHasFixedSize(true)

        // use a linear layout manager
        layoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = layoutManager

        val items = asList(TemperatureData("Hamburg", "5"), TemperatureData("Berlin", "6"))

        // define an adapter
        mAdapter = MyAdapter(items)
        recyclerView!!.adapter = mAdapter
    }
}
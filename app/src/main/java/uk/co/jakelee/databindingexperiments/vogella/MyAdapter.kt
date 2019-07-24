package uk.co.jakelee.databindingexperiments.vogella

import uk.co.jakelee.databindingexperiments.R

class MyAdapter(
    internal var data: List<TemperatureData>
) : MyBaseAdapter() {
    override fun getDataAtPosition(position: Int): Any {
        return data[position]
    }

    override fun getLayoutIdForType(viewType: Int): Int {
        return R.layout.vogella_rowlayout
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
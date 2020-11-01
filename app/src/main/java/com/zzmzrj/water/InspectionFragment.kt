package com.zzmzrj.water

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amap.api.maps2d.AMap
import kotlinx.android.synthetic.main.map_view.*

class InspectionFragment:Fragment() {

    private lateinit var aMap: AMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_inspection, container, false)
        // return View.inflate(context, R.layout.fragment_inspection, null)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // inspection_text.text = "这是我的内容"
        initView(savedInstanceState)
    }


    private fun initView(savedInstanceState: Bundle?){
        if (savedInstanceState != null) {
            mMapView.onCreate(savedInstanceState)
            aMap = mMapView.map
        }else{
            Log.d("savedInstanceState", savedInstanceState.toString())
        }

    }

}
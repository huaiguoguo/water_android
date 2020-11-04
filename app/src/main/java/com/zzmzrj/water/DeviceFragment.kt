package com.zzmzrj.water

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amap.api.maps2d.AMap
import com.amap.api.maps2d.AMapOptions
import com.amap.api.maps2d.CameraUpdateFactory
import com.amap.api.maps2d.UiSettings
import kotlinx.android.synthetic.main.map_view.*


class DeviceFragment : Fragment() {

    private lateinit var aMap: AMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_device, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView(savedInstanceState)
    }




    private fun initView(savedInstanceState: Bundle?){
        mapView.onCreate(savedInstanceState)
        // aMap =

        // myLocationStyle = MyLocationStyle()
        // myLocationStyle.strokeColor(Color.TRANSPARENT) // 设置圆形的边框颜色
        //
        // myLocationStyle.radiusFillColor(Color.argb(0, 0, 0, 0)) // 设置圆形的填充颜色
        //
        // myLocationStyle.strokeWidth(1.0f) // 设置圆形的边框粗细
        //
        // aMap.setMyLocationStyle(myLocationStyle)
        // aMap.setMyLocationStyle(myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATE))
        mapView.map.uiSettings.isMyLocationButtonEnabled = false // 设置默认定位按钮是否显示

        mapView.map.isMyLocationEnabled = true // 设置为true表示显示定位层并可触发定位，false表示隐藏定位层并不可触发定位，默认是false

        // val uiSettings = aMap.uiSettings

        mapView.map.uiSettings.isZoomControlsEnabled = true
        mapView.map.uiSettings.zoomPosition = AMapOptions.ZOOM_POSITION_RIGHT_BUTTOM;

        // aMap.mapType = AMap.MAP_TYPE_NORMAL
        // aMap.moveCamera(CameraUpdateFactory.zoomTo(10f)) //地图默认缩放比例


    }


    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }


    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        // CameraPosition = mMapView
        super.onDestroy()
        mapView.onDestroy()
    }



}
package com.zzmzrj.water

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SectionsPagerAdapter(private val context: Context, fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTitles = arrayOf("巡检工音", "维修工单")

    override fun getCount(): Int {
        return tabTitles.size
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                InspectionFragment()
            }
            1 -> {
                RepairFragment()
            }
            else -> {
                InspectionFragment()
            }
        }
    }


    override fun getPageTitle(position: Int): CharSequence? {
        // return super.getPageTitle(position)
        return tabTitles[position]
    }
}
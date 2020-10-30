package com.zzmzrj.water

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(DeviceFragment())
        // BottomNavigationView
        bottom_navigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.device_menu->{
                    // "您点击了设备菜单".showToast(this)
                    loadFragment(DeviceFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.worker_order_menu->{
                    // "您点击了工单管理菜单".showToast(this)
                    loadFragment(WorkOrderFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.waring_menu->{
                    // "您点击了警告菜单".showToast(this)
                    loadFragment(WarningFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.mine_menu->{
                    // "您点击了个人中心".showToast(this)
                    loadFragment(Mine())
                    return@setOnNavigationItemSelectedListener true
                }
                else -> return@setOnNavigationItemSelectedListener false
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    
}



package com.example.tabbarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //viewpager

        vp_stamp_activity.run {
            adapter = StampFragmentStatePagerAdapter(supportFragmentManager).apply {
                addFragment(MaskStampFragment())
                addFragment(RemoteStampFragment())
            }

            offscreenPageLimit = 2
        }

        //Tablayout
        tl_stamp_activity.run {

            val navigationLayout : View =
                LayoutInflater.from(this@MainActivity).inflate(R.layout.tabbar_stamp_activity, null,false)

            setupWithViewPager(vp_stamp_activity)

            getTabAt(0)!!.customView =
                navigationLayout.findViewById(R.id.rl_mask_stamp_tabbar) as RelativeLayout
            getTabAt(1)!!.customView =
                navigationLayout.findViewById(R.id.rl_remote_stamp_tabbar) as RelativeLayout


        }

    }
}




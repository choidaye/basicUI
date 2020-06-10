package com.example.tabbarview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class StampFragmentStatePagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {
    private val setOfFragments: MutableSet<Fragment> = mutableSetOf()

    override fun getItem(position: Int): Fragment {
        return setOfFragments.elementAt(position)
    }

    override fun getCount(): Int = setOfFragments.size

    fun addFragment(fragment: Fragment) {
        setOfFragments.add(fragment)
        notifyDataSetChanged()
    }
}

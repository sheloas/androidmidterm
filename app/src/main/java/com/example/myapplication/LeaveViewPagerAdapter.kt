package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class LeaveViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> LeaveReviewFragment()
            1 -> LeaveApprovedFragment()
            2 -> LeaveRejectedFragment()
            else -> throw IllegalArgumentException("Invalid position $position")
        }
    }
} 
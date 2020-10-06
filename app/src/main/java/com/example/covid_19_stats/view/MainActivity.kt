package com.example.covid_19_stats.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.covid_19_stats.R
import com.example.covid_19_stats.fragment.CountryFragment
import com.example.covid_19_stats.fragment.StateFragment
import com.example.covid_19_stats.view.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        setTabLayoutAdapter()
    }

    private fun setTabLayoutAdapter() {
        val countryFragment = CountryFragment()
        val stateFragment = StateFragment()

        tabLayout.setupWithViewPager(viewPager)

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, 0)
        viewPagerAdapter.addFragment(countryFragment, "PAÍSES")
        viewPagerAdapter.addFragment(stateFragment, "ESTADOS (BR)")

        viewPager.adapter = viewPagerAdapter
    }
}
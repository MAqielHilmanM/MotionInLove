package com.motion.motioninlove.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mikelau.views.shimmer.ShimmerRecyclerViewX
import com.motion.motioninlove.R
import com.motion.motioninlove.profile.ProfileActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initToolbar()
        initListener()
        initRecycler()
        initDummy()

    }

    fun initListener(){
        ivHomeProfile.setOnClickListener{
            //TODO : Put Action Here!
            ProfileActivity.startActivity(this)
        }
    }

    fun initToolbar() {
        setSupportActionBar(toolbar)
    }

    var listData: MutableList<HomeModel> = mutableListOf()
    lateinit var recyclerView: ShimmerRecyclerViewX

    private fun initRecycler() {
        recyclerView = rvHome

        recyclerView.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            adapter = HomeAdapter(listData)
        }
    }

    private fun initDummy() {
        recyclerView.showShimmerAdapter()
        listData.add(HomeModel("1", "Andini", "https://previews.123rf.com/images/domenicogelermo/domenicogelermo1709/domenicogelermo170901470/86704733-beauty-face-of-the-young-beautiful-woman-gorgeous-female-portrait-with-slicked-brown-hair-young-adul.jpg", "", 0f))
        listData.add(HomeModel("2", "Randini", "https://files.brightside.me/files/news/part_22/223005/preview-6210455-1200x630-99-1508149182.jpg", "", 0f))
        listData.add(HomeModel("3", "Sendini", "https://wallpaperaccess.com/full/812899.jpg", "", 0f))
        recyclerView.adapter?.notifyDataSetChanged()
        recyclerView.hideShimmerAdapter()
    }

    companion object {
        fun startActivity(context: Context){
            context.startActivity(Intent(context,HomeActivity::class.java))
        }
    }

}

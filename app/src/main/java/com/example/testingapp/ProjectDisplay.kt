package com.example.testingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectDisplay : AppCompatActivity(), UsersAdapter.ClickListener {
    private lateinit var usersAdapter: UsersAdapter
    private lateinit var rvUsers: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_display)
        initData()
    }

    private fun initData(){
        rvUsers = findViewById(R.id.rvUsers)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        usersAdapter = UsersAdapter(this)
        rvUsers.adapter = usersAdapter
        showData()
    }

    private fun populateUsers():List<UserModel>{

        val userList = ArrayList<UserModel>()
        userList.add(UserModel("Count Click"))
        userList.add(UserModel("Age In Minutes"))
        userList.add(UserModel("Calculator"))
        userList.add(UserModel(" "))

        //var element = userList.get(0)

        return userList
    }

    private fun showData(){
        usersAdapter.setData(populateUsers())
    }

    override fun clickedItem(userModel: UserModel) {

        startActivity(Intent(this, ClickCount::class.java).putExtra("countClick", userModel.username))
        

    }

}

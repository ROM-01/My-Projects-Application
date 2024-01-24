package com.example.testingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectDisplay : AppCompatActivity(), ProjectAdapter.ClickListener {
    private lateinit var projectAdapter: ProjectAdapter
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
        projectAdapter = ProjectAdapter(this)
        rvUsers.adapter = projectAdapter
        showData()
    }

    private fun populateUsers():List<ProjectModel>{

        val userList = ArrayList<ProjectModel>()
        userList.add(ProjectModel("Count Click"))
        userList.add(ProjectModel("Age In Minutes"))
        userList.add(ProjectModel("Calculator"))
        userList.add(ProjectModel(" "))

        //var element = userList.get(0)

        return userList
    }

    private fun showData(){
        projectAdapter.setData(populateUsers())
    }

    override fun clickedItem(userModel: ProjectModel) {

        startActivity(Intent(this, ClickCount::class.java).putExtra("countClick", userModel.projectName))
        

    }

}

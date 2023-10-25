package com.example.testingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView.OnChildClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class UsersAdapter(private var clickListener: ClickListener): RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

   private var userModelList: List<UserModel> = arrayListOf();
   private lateinit var context: Context;

    public fun setData(userModel: List<UserModel>){
        this.userModelList = userModel
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_users,parent,false))
    }

    override fun getItemCount(): Int {
        return userModelList.size
    }

    interface ClickListener{
        fun clickedItem(userModel: UserModel)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val userModel = userModelList[position]
        val username = userModel.username;
        val prefix = username.substring(0,1)

        holder.tvUsername.text = username;
        holder.tvPrefix.text = prefix;

        holder.itemView.setOnClickListener(){
            clickListener.clickedItem(userModel)
        }

    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvUsername = itemView.findViewById<TextView>(R.id.tvUsername)
        var tvPrefix = itemView.findViewById<TextView>(R.id.tvPrefix)
    }

    companion object {
        private const val COUNT_CLICK = 0
        private const val AGE_IN_MINUTES = 1
        private const val CALCULATOR = 2
    }
}

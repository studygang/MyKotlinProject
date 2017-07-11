package com.gangzi.mykotlin.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.gangzi.mykotlin.kotlin.Users
import com.gangzi.mykotlin.utils.ListItem
import org.jetbrains.anko.AnkoContext

/**
 * Created by dan on 2017/7/11.
 */
class ListAdapter(var context:Context,val dataList:ArrayList<Users>):BaseAdapter (){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ListItem(position,dataList[position],position!=dataList.size-1).createView(AnkoContext.Companion.create(
                parent!!.context,parent))
    }

    override fun getItem(position: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return dataList[position]
    }

    override fun getItemId(position: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return position.toLong()
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return dataList.size
    }
}
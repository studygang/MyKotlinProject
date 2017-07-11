package com.gangzi.mykotlin.utils

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.gangzi.mykotlin.kotlin.Users
import org.jetbrains.anko.*

/**
 * Created by dan on 2017/7/11.
 */
class ListItem(index:Int,user:Users,showDivider:Boolean):AnkoComponent<ViewGroup>{
    var mIndex:Int=0
    var mUser: Users
    var mShowDivider: Boolean
    init {
        mIndex=index
        mUser=user
        mShowDivider=showDivider
    }
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return with(ui){
            linearLayout{
                orientation = LinearLayout.VERTICAL
                leftPadding = dip(15)
                rightPadding = dip(15)
                topPadding = dip(0)

                linearLayout{
                    orientation=LinearLayout.HORIZONTAL
                    gravity=Gravity.CENTER_VERTICAL
                    textView{
                        text=mUser.name
                        textSize=15f
                    }.lparams{
                        width= wrapContent
                        height= wrapContent
                    }
                    textView {
                        text= mUser.age.toString()
                        textSize=18f
                    }.lparams{
                        width= wrapContent
                        height= wrapContent
                    }
                }
            }
        }
    }

}
package com.gangzi.mykotlin.java;

import com.gangzi.mykotlin.kotlin.ExtensionMethodKt;
import com.gangzi.mykotlin.kotlin.Overloads;
import com.gangzi.mykotlin.kotlin.PackageKt;
import com.gangzi.mykotlin.kotlin.SingTop;
import com.gangzi.mykotlin.kotlin.User;

/**
 * Created by dan on 2017/7/6.
 */

public class HelloJava {
    public static void main(String args[]){
        User user=new User(1,"gangzi");
        System.out.println(user.id);
        System.out.println(user.getName());
        user.id=2;
        user.setName("yuxia");
        user.setName(null);
        System.out.println(user.id);
        System.out.print(user.getName());
        SingTop.INSTANCE.printHello();

        Overloads overloads=new Overloads();
        overloads.OverloadTest(1,3,5);
        overloads.OverloadTest(1);
        PackageKt.printBye();
        System.out.println(ExtensionMethodKt.notEmpty(""));
    }
}

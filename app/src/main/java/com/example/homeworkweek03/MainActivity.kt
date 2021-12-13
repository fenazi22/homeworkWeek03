package com.example.homeworkweek03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    private var edUser:EditText?=null
    private var edpassword:EditText?=null
    private var edbutton:Button?=null
    private var tv:TextView?=null
    private var checkbox:CheckBox?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectView()
        checkLogin()

    }
private fun connectView(){edUser=findViewById(R.id.edUser);
    edpassword=findViewById(R.id.edpassword);edbutton=findViewById(R.id.edbutton);
    tv=findViewById(R.id.tv);checkbox=findViewById(R.id.checkbox)
    }
    private fun checkLogin(){
        edbutton?.setOnClickListener {

        val userName=edUser?.text
        val password=edpassword?.text
        if (userName?.isEmpty()==true ||password?.isEmpty()==true ||checkbox?.isChecked!=true){
            tv?.setText("userName , password , checkbox is Empty")
        }else{
            tv?.setText("Login Successful $userName")

        }

        }
    }
}
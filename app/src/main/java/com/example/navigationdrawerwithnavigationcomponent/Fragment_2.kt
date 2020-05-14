package com.example.navigationdrawerwithnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_2.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        gologin.setOnClickListener {
            var name="Hello "+edt_username.text.toString()+" your password is: " +edt_password.text.toString()
            var dir=Fragment_2Directions.actionMenu2ToMenu3(name)
            findNavController().navigate(dir)

        }
    }

}

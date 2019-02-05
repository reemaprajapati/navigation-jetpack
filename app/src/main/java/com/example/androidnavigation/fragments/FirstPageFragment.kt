package com.example.androidnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.androidnavigation.R

class FirstPageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.first_page_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_go_last_page)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_go_home)
        )
        val safeArgs = FirstPageFragmentArgs.fromBundle(arguments)
        val flowStepNumber = safeArgs.testNumber
        Toast.makeText(activity, "testNumber number $flowStepNumber", Toast.LENGTH_SHORT).show()
    }
}
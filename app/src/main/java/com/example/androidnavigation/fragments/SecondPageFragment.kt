package com.example.androidnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.androidnavigation.R
import kotlinx.android.synthetic.main.second_page_fragment.*
import kotlinx.android.synthetic.main.second_page_fragment.view.*

class SecondPageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.second_page_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_go_to_last).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_go_home)
            )
    }
}
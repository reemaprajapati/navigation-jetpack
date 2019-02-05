package com.example.androidnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.androidnavigation.R
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_click_me)?.setOnClickListener {
            sendArguments(view)
        }

        view.findViewById<Button>(R.id.btn_click_two)?.setOnClickListener {
            findNavController().navigate(R.id.second_page_fragment)
        }
    }

    fun sendArguments(view: View) {
        var action: HomeFragmentDirections.ActionGoto1 =
            HomeFragmentDirections.actionGoto1()
        action.setTestNumber(1234)
        Navigation.findNavController(view).navigate(action);
    }
}
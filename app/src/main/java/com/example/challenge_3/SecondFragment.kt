package com.example.challenge_3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.challenge_3.databinding.FragmentMainBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val params = arguments?.getString(MainFragment.PARAMS)
        val dataList = mutableListOf<String>()
//        val dataList = params?.let{mutableListOf(params ?: "")}

        val selectedWord = Words.values().find { it.char == params }
        selectedWord?.let {
            dataList.addAll(it.words)
        }

        val adapter = ListAdapter {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/search?q=$it"))
            activity?.startActivity(intent)
        }

        dataList?.let { adapter.submitList(dataList) }
        binding.rvWord.adapter = adapter
        binding.rvWord.layoutManager = LinearLayoutManager(activity)


    }
    companion object {
        const val PARAMS = "PARAMS"
    }

}
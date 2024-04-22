package com.example.challenge_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.challenge_3.databinding.FragmentMainBinding

class MainFragment : Fragment() {
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

        val adapter = ListAdapter {
            val bundle = Bundle()
            bundle.putString(PARAMS, it)
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment, bundle)
        }


        adapter.submitList(alphabets)
        binding.rvWord.adapter = adapter
        binding.rvWord.layoutManager = LinearLayoutManager(activity)


    }
    companion object {
        const val PARAMS = "PARAMS"
    }

}
package com.littleapp.dogs.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.littleapp.dogs.R
import com.littleapp.dogs.Unit.DATA
import com.littleapp.dogs.databinding.FragmentDogBinding
import com.littleapp.dogs.viewmodel.DogViewModel

class DogFragment : Fragment(), AdapterView.OnItemClickListener {

    private lateinit var binding: FragmentDogBinding
    private val viewModel: DogViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentDogBinding.inflate(inflater, container, false)
        loadingBreedsList()
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

        with(binding.recyclerViewDog) {
            adapter = DogAdapter()
            layoutManager = LinearLayoutManager(requireContext())
        }

        binding.toolbar.nameSpace.text = DATA.DOGS

        observer()
    }

    private fun observer() {
        viewModel.breedsList.observe(viewLifecycleOwner) { newList ->
            val adapter = ArrayAdapter(requireContext(), R.layout.list_breeds, newList)

            with(binding.autoCompleteTextView) {
                setAdapter(adapter)
                onItemClickListener = this@DogFragment
            }
        }
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val item = parent?.getItemAtPosition(position).toString()
        Toast.makeText(requireContext(), item, Toast.LENGTH_LONG).show()
        viewModel.getDogPhotosList(item)
    }

    private fun loadingBreedsList() {
        val list = resources.getStringArray(R.array.breeds_list)
        viewModel.setBreedsList(list)
    }
}
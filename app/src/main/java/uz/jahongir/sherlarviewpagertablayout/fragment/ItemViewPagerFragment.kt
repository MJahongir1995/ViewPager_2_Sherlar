package uz.jahongir.sherlarviewpagertablayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.jahongir.sherlarviewpagertablayout.MyData
import uz.jahongir.sherlarviewpagertablayout.databinding.FragmentHomeBinding

private const val ARG_PARAM1 = "param1"

class HomeFragment : Fragment() {
    private var myData: MyData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

            myData = it.getSerializable(ARG_PARAM1) as MyData
        }
    }

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.img1.setBackgroundResource(myData!!.backgroundImage)
        binding.title.text = myData?.title
        binding.sher.text = myData?.sher

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(myData: MyData) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, myData)
                }
            }
    }
}
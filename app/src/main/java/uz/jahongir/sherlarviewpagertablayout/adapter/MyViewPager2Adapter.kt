package uz.jahongir.sherlarviewpagertablayout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent
import uz.jahongir.sherlarviewpagertablayout.MyData
import uz.jahongir.sherlarviewpagertablayout.databinding.FragmentHomeBinding

class MyViewPager2Adapter(private val list: ArrayList<MyData>) :
    RecyclerView.Adapter<MyViewPager2Adapter.VH>() {

    lateinit var binding:FragmentHomeBinding

    inner class VH(binding: FragmentHomeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(myData: MyData): ConstraintLayout {

            binding.img1.setBackgroundResource(myData.backgroundImage)
            binding.title.text = myData.title
            binding.sher.text = myData.sher

            return binding.root
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(FragmentHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
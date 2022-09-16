package uz.jahongir.sherlarviewpagertablayout.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.jahongir.sherlarviewpagertablayout.MyData
import uz.jahongir.sherlarviewpagertablayout.User.list
import uz.jahongir.sherlarviewpagertablayout.fragment.HomeFragment

class MyFragmentPagerAdapter(fm: FragmentActivity, private val list: List<MyData>) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return HomeFragment.newInstance(list[position])
    }
}
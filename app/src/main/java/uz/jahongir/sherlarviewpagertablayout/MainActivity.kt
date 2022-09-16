package uz.jahongir.sherlarviewpagertablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import uz.jahongir.sherlarviewpagertablayout.adapter.MyFragmentPagerAdapter
import uz.jahongir.sherlarviewpagertablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myFragmentPagerAdapter: MyFragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        User.addList()

        myFragmentPagerAdapter = MyFragmentPagerAdapter(this, User.list)
        binding.myViewPager.adapter = myFragmentPagerAdapter

        binding.btn1.setOnClickListener {
            binding.myViewPager.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
        }

        binding.myViewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                changeColor()
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                changeColor()
            }
        })
    }

    fun changeColor() {
        when (binding.myViewPager.currentItem) {

            0 -> {
                binding.iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.orange))
                binding.iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
            }
            1 -> {
                binding.iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.orange))
                binding.iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
            }
            2 -> {
                binding.iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.orange))
                binding.iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
            }
            3 -> {
                binding.iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                binding.iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.orange))
            }
        }
    }
}
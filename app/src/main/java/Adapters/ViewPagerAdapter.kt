package Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.developer.adiblarapp.Save_authors
import com.developer.adiblarapp.Setting
import com.developer.adiblarapp.books_list

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, var count: Int) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        val adiblarListFragment = books_list()
        val count = count
        return when (count) {
            0 -> {
                adiblarListFragment
            }
            1 -> {
                Save_authors(adiblarListFragment)
            }
            2 -> {
                Setting()
            }
            else -> {
                Fragment()
            }

        }
    }
}

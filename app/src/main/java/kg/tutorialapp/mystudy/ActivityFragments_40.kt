package kg.tutorialapp.mystudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.fragment.app.Fragment

class ActivityFragments_40 : AppCompatActivity() {
    lateinit var btnFragment1: Button
    lateinit var btnFragment2:Button
    lateinit var btnFragment3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments_40)
        openActivityFragment1()
        openActivityFragment2()
        openActivityFragment3()
    }

    private fun openActivityFragment1() {
        btnFragment1 = findViewById(R.id.btn_fragment1)
        btnFragment1.setOnClickListener{
            val fragment1Intent = Intent(this, Activity_HW40::class.java)
            startActivity(fragment1Intent)
        }
    }
    private fun openActivityFragment2() {
        btnFragment2 = findViewById(R.id.btn_fragment2)
        btnFragment2.setOnClickListener{
            val fragment2Intent = Intent(this, Activity_HW40_2::class.java)
            startActivity(fragment2Intent)
        }
    }
    private fun openActivityFragment3() {
        btnFragment3 = findViewById(R.id.btn_fragment3)
        btnFragment3.setOnClickListener{
            val fragment3Intent = Intent(this, Activity_HW40_3::class.java)
            startActivity(fragment3Intent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate((R.menu.menu_fragments), menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val fragment1 = Fragment_40_1()
        val fragment2 = Fragment_40_2()
        val fragment3 = Fragment_40_3()

        when (item.itemId) {
            R.id.item_1 -> openFragment(fragment1)
            R.id.item_2 -> openFragment(fragment2)
            R.id.item_3 -> openFragment(fragment3)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun openFragment(fragment: Fragment) : Fragment {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragments_container, fragment)
            .addToBackStack(null)
            .attach(fragment)
            .commit()
        return fragment
    }
}
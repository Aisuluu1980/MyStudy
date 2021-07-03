package kg.tutorialapp.mystudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FragmentActivity : AppCompatActivity() {

    lateinit var firstFragment: Button
    lateinit var secondFragment: Button
    lateinit var thirdFragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
//        второй способ создания фрагмента в activity_fragment.xml обязательно нужно указать FrameLayout
//        setupFragment()
        firstFragmentRun()
        secondFragmentRun()
        thirdFragmentRun()
    }

//    private fun setupFragment() {
//        val transaction = supportFragmentManager.beginTransaction()   //создаем основу для упраления фрагментом
//        transaction.replace(R.id.container, FragmentA())    //сделали действие
//        transaction.commit()                         //все что до этого написали, чтобы эти действия запустились
//    }
    private fun firstFragmentRun(){
        firstFragment = findViewById(R.id.first_fragment)
        firstFragment.setOnClickListener{
            val fragFirst = Intent(this, Activity_36_2::class.java )
            startActivity(fragFirst)
        }
    }
    private fun secondFragmentRun(){
        secondFragment = findViewById(R.id.second_fragment)
        secondFragment.setOnClickListener{
            val fragSecond = Intent(this, Activity_36_3::class.java )
            startActivity(fragSecond)
        }
    }
    private fun thirdFragmentRun(){
        thirdFragment = findViewById(R.id.third_fragment)
        thirdFragment.setOnClickListener{
            val fragThird = Intent(this, Activity_36_4::class.java )
            startActivity(fragThird)
        }
    }
}
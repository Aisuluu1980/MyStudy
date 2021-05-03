package kg.tutorialapp.mystudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
//        второй способ создания фрагмента в activity_fragment.xml обязательно нужно указать FrameLayout
        setupFragment()
    }

    private fun setupFragment() {
        val transaction = supportFragmentManager.beginTransaction()   //создаем основу для упраления фрагментом
        transaction.replace(R.id.container, FragmentA())    //сделали действие
        transaction.commit()                         //все что до этого написали, чтобы эти действия запустились
    }
}
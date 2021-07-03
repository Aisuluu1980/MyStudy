package kg.tutorialapp.mystudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity_36_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_36_4)

        setupFragment()
    }
    private fun setupFragment() {
        val transaction = supportFragmentManager.beginTransaction()   //создаем основу для упраления фрагментом
        transaction.replace(R.id.container_36_3, Fragment_36_3())    //сделали действие
        transaction.commit()                         //все что до этого написали, чтобы эти действия запустились
    }

}
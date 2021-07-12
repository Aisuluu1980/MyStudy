package kg.tutorialapp.mystudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity_HW40 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw40)
        setUp()
    }
    private fun setUp() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_40_1, Fragment_40_1())
            .commit()
}

}
package kg.tutorialapp.mystudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity__hw37.*

class Activity_HW37 : AppCompatActivity() {
    lateinit var secondActivity: Button
    lateinit var textFrom: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__hw37)
        runText()
    }
    private fun runText() {
        secondActivity= findViewById(R.id.btn_done_37)
        secondActivity.setOnClickListener{

            val textMy = ed_text_37.text.toString()

            val secondActivity = Intent(this, ActivitySecondHw_37::class.java)
            secondActivity.putExtra("String", textMy)
            startActivity(secondActivity)
        }
    }
}


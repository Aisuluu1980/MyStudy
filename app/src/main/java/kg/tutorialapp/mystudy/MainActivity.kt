package kg.tutorialapp.mystudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var btnGestures: Button
    lateinit var textMain: TextView
    lateinit var btnLessons:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lessonsRun()
        gesturesRun()

        textMain = findViewById(R.id.text_main)
        textMain.text = getString(R.string.main_text)

    }
    private fun lessonsRun(){
        btnLessons = findViewById(R.id.btn_lessons)
        btnLessons.setOnClickListener {
            val lessonsIntent = Intent(this, LessonActivity::class.java)
            startActivity(lessonsIntent)
        }
    }
    private fun gesturesRun(){
    btnGestures = findViewById(R.id.btn_gestures)
    btnGestures.setOnClickListener{
            val gesturesIntent = Intent(this, GesturesActivity::class.java)
            startActivity(gesturesIntent)
        }
    }
}
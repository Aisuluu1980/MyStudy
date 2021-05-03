package kg.tutorialapp.mystudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class LessonActivity : AppCompatActivity() {

    lateinit var lessonsText: TextView
    lateinit var btn_34:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)
        lessonsText = findViewById(R.id.lessons_text)
        lessonsText.text = getString(R.string.lesson_text)

        runLesson_34()
    }
    private fun runLesson_34(){
        btn_34 = findViewById(R.id.btn_34)
        btn_34.setOnClickListener{
            val activityStackIntent = Intent(this, ActivityA::class.java )
            startActivity(activityStackIntent)
        }
    }

}
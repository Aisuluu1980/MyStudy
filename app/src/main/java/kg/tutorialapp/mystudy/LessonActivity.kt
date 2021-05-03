package kg.tutorialapp.mystudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_lesson.*


class LessonActivity : AppCompatActivity() {

//    lateinit var lessonsText: TextView
    lateinit var btn_34:Button
    lateinit var btn_36:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)
//        lessonsText = findViewById(R.id.lessons_text)
        lessons_text.text = getString(R.string.lesson_text)
        //смогла подключить synthetic чтобы сразу из разметки доставал по id и тогда не надо делать
//        findViewById но в больших проектах лучше работать без synthetic

        runLesson_34()
        runLesson_36()
    }
    private fun runLesson_34(){
        btn_34 = findViewById(R.id.btn_34)
        btn_34.setOnClickListener{
            val activityStackIntent = Intent(this, ActivityA::class.java )
            startActivity(activityStackIntent)
        }
    }
    private fun runLesson_36(){
        btn_36 = findViewById(R.id.btn_36)
        btn_36.setOnClickListener{
            val activityFragments = Intent(this, FragmentActivity::class.java )
            startActivity(activityFragments)
        }
    }

}
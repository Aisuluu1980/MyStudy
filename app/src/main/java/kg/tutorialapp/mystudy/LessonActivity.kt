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
    lateinit var btn_37: Button
    lateinit var btn_38: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)
//        lessonsText = findViewById(R.id.lessons_text)
        lessons_text.text = getString(R.string.lesson_text)
        //смогла подключить synthetic чтобы сразу из разметки доставал по id и тогда не надо делать
//        findViewById но в больших проектах лучше работать без synthetic

        runLesson_34()
        runLesson_37()
        runLesson38()

    }

    private fun runLesson38() {
        btn_38 = findViewById(R.id.btn_38)
        btn_38.setOnClickListener{
            val activityLesson38 = Intent(this, Activity_38::class.java)
            startActivity((activityLesson38))
        }
    }

    private fun runLesson_37() {
        btn_37 = findViewById(R.id.btn_37)
        btn_37.setOnClickListener{
            val activityArgument = Intent(this, ActivityArguments_37::class.java)
            startActivity((activityArgument))
        }
    }

    private fun runLesson_34(){
        btn_34 = findViewById(R.id.btn_34)
        btn_34.setOnClickListener{
            val activityStackIntent = Intent(this, ActivityA::class.java )
            startActivity(activityStackIntent)
        }
    }


}
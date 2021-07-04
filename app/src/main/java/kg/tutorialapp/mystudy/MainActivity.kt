
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
    lateinit var btnPoster: Button
    lateinit var btnFragments: Button
    lateinit var btn_hw37: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lessonsRun()
        gesturesRun()
        posterRun()
        fragmentsRun()
        hwRun37()


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
    private fun posterRun(){
        btnPoster = findViewById(R.id.btn_poster)
        btnPoster.setOnClickListener{
            val posterIntent = Intent(this, PosterActivity::class.java)
            startActivity(posterIntent)
        }
    }
    private fun fragmentsRun(){
        btnFragments= findViewById(R.id.btn_36)
        btnFragments.setOnClickListener{
            val activityFragments = Intent(this, FragmentActivity::class.java )
            startActivity(activityFragments)
        }
    }
    private fun hwRun37() {
        btn_hw37 = findViewById(R.id.btn_37)
        btn_hw37.setOnClickListener {
            val hwIntent = Intent(this, Activity_HW37::class.java)
            startActivity(hwIntent)
        }

    }
}
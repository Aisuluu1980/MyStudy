package kg.tutorialapp.mystudy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class ActivityA : AppCompatActivity() {
    lateinit var btnA: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        btnA = findViewById(R.id.btn_A)
        btnA.setOnClickListener {ActivityB.start(this) }
//        передаем контекст активити
}
    companion object{
        fun start(context:Context){
            val intent = Intent(context, ActivityA::class.java)
            context.startActivity(intent)
//            передает контекст активите А
        }
    }
}
//функция находится в companion object поэтому не надо в каждом активити создавать новый инстанс
//Instance
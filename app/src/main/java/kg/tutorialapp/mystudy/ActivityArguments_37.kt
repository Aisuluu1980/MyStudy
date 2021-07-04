package kg.tutorialapp.mystudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_arguments_37.*

class ActivityArguments_37 : AppCompatActivity(), Fragment37Listerner {
    lateinit var btnSendArguments: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arguments_37)
        setup( )
    }
    private fun setup() {
        btnSendArguments = findViewById(R.id.btn_send)
        btnSendArguments.setOnClickListener{
//            достаем текст из нашего поля ввода и переводим в стринг
            val text = edText.text.toString()
//            создаем фрагмент
            val fragmentArgs = Fragment_37()
//   передаем аргументы во фрагмент (Ключ-"String" и значение-text)
            val args = Bundle()
            args.putString("String", text)
//            помещаем этот Bundle во фрагмент
            fragmentArgs.arguments = args

            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container_37,fragmentArgs, Fragment_37.TAG)
                    .commit()

        }
    }
    override fun showToast(): String {
        val textNew = Toast.makeText(this, "Fragment 37 told me do it", Toast.LENGTH_LONG).show()
        return textNew.toString()
    }
}
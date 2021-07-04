package kg.tutorialapp.mystudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ActivitySecondHw_37 : AppCompatActivity(), Fragment37Listerner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_hw_37)
        secondRun()
    }
    private fun secondRun() {
//            достаем текст из нашего поля ввода и переводим в стринг
        val fromFirstActivity:String = (intent?.getStringExtra("String")?: showToast())
/* создаем фрагмент */
        val fragmentData = Fragment_HW37()
//   передаем аргументы во фрагмент (Ключ-"String" и значение-text)
        val textInput = Bundle()
        textInput.putString("String2", fromFirstActivity)
//            помещаем этот Bundle во фрагмент
        fragmentData.arguments = textInput

        supportFragmentManager
                .beginTransaction()
                .add(R.id.container_hw_37, fragmentData, Fragment_HW37.TAG)
                .commit()
    }

    override fun showToast():String {
        val textMes = Toast.makeText(this, "Поле ввода пустое ", Toast.LENGTH_LONG).show()
        return textMes.toString()
    }
}

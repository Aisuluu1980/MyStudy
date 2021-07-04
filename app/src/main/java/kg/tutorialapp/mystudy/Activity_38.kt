package kg.tutorialapp.mystudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity_38 : AppCompatActivity(), Fragment_38_Listener, Fragment_38_2_Listener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_38)

        setup()
    }
    private fun setup(){

        supportFragmentManager
                .beginTransaction()
//                добавляем фрагменты в контейнеры
                .add(R.id.container_38_1, Fragment_38_1(), Fragment_38_1.TAG)
                .add(R.id.container_38_2, Fragment_38_2(), Fragment_38_2.TAG)
                .commit()

                    }


//эта функция нужна для того, чтобы найти фрагмент B по тегу и нужно обязательно сделать кастинг as Fragment_38_2 потому что чтобы испоьзовать setNewText()
    override fun setTextToFragment38_2(text: String) {
        (supportFragmentManager.findFragmentByTag(Fragment_38_2.TAG) as Fragment_38_2).setNewText(text)
    }

    override fun setTextToFragment38_1(text: String) {
        (supportFragmentManager.findFragmentByTag(Fragment_38_1.TAG) as Fragment_38_1).setNewText(text)
    }
}
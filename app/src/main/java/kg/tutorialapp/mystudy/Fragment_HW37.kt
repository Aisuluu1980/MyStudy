package kg.tutorialapp.mystudy

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import kotlinx.android.synthetic.main.fragment__hw37.*

class Fragment_HW37:Fragment(R.layout.fragment__hw37) {

    private lateinit var listerner: Fragment37Listerner

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        достаем текст которые передали через аргументы
        val textForSecond = arguments?.getString("String2")
//        тот же самый arguments который передали
        text_hw_37.text = textForSecond

        if (textForSecond == "")
            listerner.showToast()
        else text_hw_37.text = textForSecond
        }
//проверяем переопределяет ли контекст
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Fragment37Listerner){
            listerner = context
        }
    }
    companion object{
        const val TAG ="A"
    }
}


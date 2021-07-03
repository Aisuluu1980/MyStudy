package kg.tutorialapp.mystudy

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ContentFrameLayout
import kotlinx.android.synthetic.main.activity_arguments_37.*
import kotlinx.android.synthetic.main.fragment_37.*

class Fragment_37:Fragment(R.layout.fragment_37) {

    private lateinit var listerner: Fragment37Listerner

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        достаем текст которые передали через аргументы
        val textFromArguments = arguments?.getString("String")
//        тот же самый arguments который передали
        tv_text.text = textFromArguments

        btn_listner.setOnClickListener{
            listerner.showToast()

        }
    }
//проверяем переопредяет ли контекст
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Fragment37Listerner){
            listerner = context
        }

    }

    companion object{
        const val TAG ="37"
    }

}
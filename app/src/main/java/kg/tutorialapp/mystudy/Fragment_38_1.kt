package kg.tutorialapp.mystudy

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import kotlinx.android.synthetic.main.fragment_38_1.*
import kotlinx.android.synthetic.main.fragment_38_2.*

class Fragment_38_1:Fragment(R.layout.fragment_38_1) {
    private lateinit var listener: Fragment_38_Listener


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        btn_38_1.setOnClickListener{
//            достаем текст и передаем во второй фрагмент
            val text = inputText_38_1.text.toString()
            listener.setTextToFragment38_2(text)
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is Fragment_38_Listener)listener = context
    }
    fun setNewText(text:String){
        textFromB.text = text
    }

    companion object{
        const val TAG = "Fragment A"
    }
}

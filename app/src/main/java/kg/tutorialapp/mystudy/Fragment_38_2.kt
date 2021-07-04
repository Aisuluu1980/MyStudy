package kg.tutorialapp.mystudy

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_38_2.*

class Fragment_38_2:Fragment(R.layout.fragment_38_2) {

    private lateinit var listener: Fragment_38_2_Listener

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_38_2.setOnClickListener{
            val textB = inputText_38_2.text.toString()
            listener.setTextToFragment38_1(textB)

        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is Fragment_38_2_Listener)listener = context
    }

    fun setNewText(text:String){
        textFromA.text = text
    }

    companion object{
        const val TAG = "Fragment B"
    }
}

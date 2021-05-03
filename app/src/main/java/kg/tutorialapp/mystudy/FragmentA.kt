package kg.tutorialapp.mystudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

//class FragmentA:Fragment() {
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_a, container)   // указываем какой layout показывать
//        return inflater.inflate(R.layout.fragment_a, container, false) //если создаю фрагмент вторым способом, указываю false
//    }
//}

//2 способ можно все указать в конструкторе и все
class FragmentA:Fragment(R.layout.fragment_a) {

}
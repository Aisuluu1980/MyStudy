package kg.tutorialapp.mystudy

import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat

private const val DEBUG_TAG = "Gestures"

class GesturesActivity: AppCompatActivity(),

        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    lateinit var gestureName: TextView
    lateinit var gestureView: TextView

    private lateinit var myDetector: GestureDetectorCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestures2)
        gestureName = findViewById(R.id.name_gesture)
        gestureView = findViewById(R.id.view_gesture)

        myDetector = GestureDetectorCompat(this, this)
        myDetector.setOnDoubleTapListener(this)
    }

    override fun onDown(event: MotionEvent): Boolean {
//        gestureName.setText("Вниз")
//        gestureView.setText(event.toString())
        Log.d(DEBUG_TAG, "onDown: $event")

        return true
    }
    override fun onShowPress(event: MotionEvent) {
        gestureName.setText("Показ нажатия.")
        gestureView.setText(event.toString())
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {
        TODO("Not yet implemented")
    }

    override fun onLongPress(event: MotionEvent) {
        gestureName.setText("Долгое нажатие.")
        gestureView.setText(event.toString())
    }

    override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {
        TODO("Not yet implemented")
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }
}

//

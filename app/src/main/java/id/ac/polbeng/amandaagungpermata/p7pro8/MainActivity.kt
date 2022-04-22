package id.ac.polbeng.amandaagungpermata.p7pro8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Coordinator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBookChange(index: Int) {
        val frag = fBookDescription
        if (frag is BookDescription) {
            frag.changeDescription(index)
        }
    }

}
package id.restuindrawan.modul5

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rifqi_19104031.modul5.R

class Pratice5ForFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_practice5_first)

        val mFragmentManager = supportFragmentManager
        val mFirstFragment = Practice5FirstFragment()
        val fragment = mFragmentManager.findFragmentByTag(Practice5FirstFragment::class.java.simpleName)
        if (fragment !is Practice5FirstFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + Practice5FirstFragment::class.java.simpleName)
            mFragmentManager
                    .beginTransaction()
                    .add(R.id.frame_container, mFirstFragment, Practice5FirstFragment::class.java.simpleName)
                    .commit()
        }
    }


}
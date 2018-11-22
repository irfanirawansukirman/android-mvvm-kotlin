package id.gits.gitsmvvmkotlin.mvvm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.gits.gitsmvvmkotlin.R
import id.gits.gitsmvvmkotlin.util.keyboardVisibility
import id.gits.gitsmvvmkotlin.util.replaceFragmentInActivity
import kotlinx.android.synthetic.main.test_activity.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_activity)

        btn_test_open.setOnClickListener {
            keyboardVisibility(this.currentFocus, this, true)
        }

        btn_test_hide.setOnClickListener {
            keyboardVisibility(this.currentFocus, this, false)
        }

        btn_test_replace.setOnClickListener {
            replaceFragmentInActivity(TestFragment.newInstance(), R.id.frame_container)
        }
    }
}

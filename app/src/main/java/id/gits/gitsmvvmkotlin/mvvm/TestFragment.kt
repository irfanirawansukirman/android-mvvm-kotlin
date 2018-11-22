package id.gits.gitsmvvmkotlin.mvvm

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.gits.gitsmvvmkotlin.R
import id.gits.gitsmvvmkotlin.util.keyboardVisibility
import id.gits.gitsmvvmkotlin.util.putArgs
import kotlinx.android.synthetic.main.test_fragment.*

/**
 * Dibuat oleh Irfan Irawan Sukirman
 * @Copyright 2018
 */
class TestFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.test_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_test_open.setOnClickListener {
            keyboardVisibility(etext_test, context, true)
        }

        btn_test_hide.setOnClickListener {
            keyboardVisibility(etext_test, context, false)
        }
    }

    companion object {
        fun newInstance() = TestFragment().putArgs { }
    }
}
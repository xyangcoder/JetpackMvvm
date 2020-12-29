package me.hgj.jetpackmvvm.demo.app.widget.loadCallBack

import com.kingja.loadsir.callback.Callback
import me.hgj.jetpackmvvm.demo.R


class ErrorCallback : Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_error
    }

}
package com.example.baselibrary.lifecycle

import androidx.lifecycle.MutableLiveData
import com.example.baselibrary.bean.DialogBean

/**
 * 用来显示加载中dialog的MutableLiveData
 *
 * @author 猿小蔡
 */
class DialogLiveData<T> : MutableLiveData<T>() {
    private val mDialogBean = DialogBean()
    fun setValue(isShow: Boolean) {
        mDialogBean.isShow = isShow
        mDialogBean.msg = ""
        value = mDialogBean as T
    }

    fun setValue(isShow: Boolean, msg: String?) {
        mDialogBean.isShow = isShow
        mDialogBean.msg = msg
        value = mDialogBean as T
    }
}
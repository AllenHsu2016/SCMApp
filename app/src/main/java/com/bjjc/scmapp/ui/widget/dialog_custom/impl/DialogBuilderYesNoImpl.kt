package com.bjjc.scmapp.ui.widget.dialog_custom.impl

import android.content.Context
import com.bjjc.scmapp.R

/**
 * Created by Allen on 2019/03/15 10:45
 */
class DialogBuilderYesNoImpl(mContext:Context):AbstractDialogBuilderImpl(mContext){
    override fun setLayOutId() {
        mLayoutId= R.layout.layout_dialog_custom_yes_no
    }
}
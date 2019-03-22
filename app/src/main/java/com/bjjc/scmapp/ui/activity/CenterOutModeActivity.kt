package com.bjjc.scmapp.ui.activity

import android.content.Context
import android.content.Intent
import android.support.v7.widget.Toolbar
import android.view.Menu
import com.bjjc.scmapp.R
import com.bjjc.scmapp.adapter.CenterOutModeGridAdapter
import com.bjjc.scmapp.ui.activity.base.BaseActivity
import com.bjjc.scmapp.util.ToolbarManager
import kotlinx.android.synthetic.main.layout_aty_center_out_mode.*
import org.jetbrains.anko.find

class CenterOutModeActivity : BaseActivity(), ToolbarManager {
    override val context: Context by lazy { this }
    private val buttonArray: ArrayList<String> = arrayListOf("配送出库", "中心库出库", "移库出库", "反向订单出库")
    private val centerOutModeGridViewAdapter:CenterOutModeGridAdapter by lazy {CenterOutModeGridAdapter(this) }
    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolbar) }
    override fun getLayoutId(): Int = R.layout.layout_aty_center_out_mode
    override fun initData() {
        initToolBar("出库模式选择")//Sets toolbar title.
        centerOutModeGridViewAdapter.setData(buttonArray)
        gvCenterOutMode.adapter = centerOutModeGridViewAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val itemId= intArrayOf(R.id.setting)
        setToolBarMenu(R.menu.menu_center_out_mode,*itemId).setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.setting -> {
                    //Toast.makeText(toolbar.context,"点击了设置按钮",Toast.LENGTH_SHORT).show()
                    //goto setting activity.
                    toolbar.context?.startActivity(Intent(toolbar.context, SettingActivity::class.java))
                }
            }
            true
        }
        return true
    }
}

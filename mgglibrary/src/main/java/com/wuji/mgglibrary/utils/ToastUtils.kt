package com.wuji.mgglibrary.utils

import android.content.Context
import android.widget.Toast

/**
 *    Create by 金KingMgg  kingmgg
 *    on 2023/7/7 10:18
 *    程序人员写程序，又拿程序换酒钱
 *
 */
class ToastUtils {
    companion object {
        fun toast(context: Context, str: String) {
            Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
        }
    }
}
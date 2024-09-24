package com.rideincab.driver.common.custompalette

/**
 * @package com.cloneappsolutions.cabmedriver.common.custompalette
 * @subpackage custompalette
 * @category FontEditText
 * @author SMR IT Solutions
 *
 */

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText

/* ************************************************************
                   Its used for FontEditText
*************************************************************** */
class FontEditText : EditText {




    /*constructor(context: Context) : super(context) {

        CustomFontUtils.applyCustomFont(this, context, null)
    }*/


    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

        CustomFontUtils.applyCustomFont(this, context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {

        CustomFontUtils.applyCustomFont(this, context, attrs)
    }
}

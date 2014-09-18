package com.gtotek.football.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;


public class FontizeEdittext extends EditText {

	public FontizeEdittext(Context context) {
		super(context);
	}

	public FontizeEdittext(Context context, AttributeSet attrs) {
		super(context, attrs);
		if(this.isInEditMode())
			return;
		FontManager.setFontFromAttributeSet(getContext(), attrs, this);
	}

}

package com.gtotek.football.ui;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontizeTextView extends TextView {

	public FontizeTextView(Context context) {
		super(context);
	}

	public FontizeTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		if(this.isInEditMode())
			return;
		FontManager.setFontFromAttributeSet(getContext(), attrs, this);
	}

}

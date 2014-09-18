package com.gtotek.football.ui;

import com.gtotek.footballquiz.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView; 

public class FontManager {

	public enum Font {

		//
		DroidSansBold("fonts/DroidSans-Bold.ttf"),
		//
		DroidSans("fonts/DroidSans.ttf"),
		//
		DroidSerif("fonts/DroidSerif.ttf"),
		//
		MyriadPro("fonts/MyriadPro.ttf"),
		//
		MyriadProBold("fonts/MyriadPro-Bold.otf");

		/** The font file path */
		private final String fileName;

		private Font(String name) {
			fileName = name;
		}

		@Override
		public String toString() {
			return fileName;
		}
	}

	public static void setFont(TextView tv, Font font) {
		Typeface typeface = Typeface.createFromAsset(tv.getContext()
				.getAssets(), font.fileName);
		tv.setTypeface(typeface);
	}

	public static void setFont(EditText edt, Font font) {
		Typeface typeface = Typeface.createFromAsset(edt.getContext()
				.getAssets(), font.fileName);
		edt.setTypeface(typeface);
	}

	public static void setFontFromAttributeSet(Context context,
			AttributeSet attrs, TextView tv) {
		TypedArray a = context.obtainStyledAttributes(attrs,
				R.styleable.FontizeTextView);
		if (a.length() > 0) {
			int fontId = -1;
			for (int i = 0; i < a.length(); i++) {
				int attr = a.getIndex(i);
				if (attr == R.styleable.FontizeTextView_textfont) {
					fontId = a.getInt(attr, -1);
				}
			}

			if (fontId != -1) {
				switch (fontId) {
				case 0:
					setFont(tv, Font.DroidSans);
					break;
				case 1:
					setFont(tv, Font.DroidSansBold);
					break;
				case 2:
					setFont(tv, Font.DroidSerif);
					break;
				case 3:
					setFont(tv, Font.MyriadPro);
					break;
				case 4:
					setFont(tv, Font.MyriadProBold);
				default:
					break;
				}
			}
		}
		a.recycle();
	}

	public static void setFontFromAttributeSet(Context context,
			AttributeSet attrs, EditText edt) {
		TypedArray a = context.obtainStyledAttributes(attrs,
				R.styleable.FontizeTextView);
		if (a.length() > 0) {
			int fontId = -1;
			for (int i = 0; i < a.length(); i++) {
				int attr = a.getIndex(i);
				if (attr == R.styleable.FontizeTextView_textfont) {
					fontId = a.getInt(attr, -1);
				}
			}

			if (fontId != -1) {
				switch (fontId) {
				case 0:
					setFont(edt, Font.DroidSans);
					break;
				case 1:
					setFont(edt, Font.DroidSansBold);
					break;
				case 2:
					setFont(edt, Font.DroidSerif);
					break;
				case 3:
					setFont(edt, Font.MyriadPro);
					break;
				case 4:
					setFont(edt, Font.MyriadProBold);
				default:
					break;
				}
			}
		}
		a.recycle();
	}
}
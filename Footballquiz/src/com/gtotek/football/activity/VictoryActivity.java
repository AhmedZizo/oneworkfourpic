package com.gtotek.football.activity; 
import com.gtotek.football.base.Constans;
import com.gtotek.football.util.PreferenceUtil;
import com.gtotek.football.util.SoundUtil;
import com.gtotek.footballquiz.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class VictoryActivity extends Activity {

	private Context mContext = this;
	private TextView mTvBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_victory);
		
		mTvBack = (TextView)this.findViewById(R.id.tv_back);
		mTvBack.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				finish();
			}
		}); 

		PreferenceUtil.removeValue(mContext, Constans.KEY_INDEX_IMAGE);
		
		SoundUtil.hexat(mContext, SoundUtil.M_CONGRAT);
	}
}

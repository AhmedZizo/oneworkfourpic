package com.gtotek.football.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.GridView;
import android.widget.TextView;

import com.gtotek.football.adapter.DecodingAdapter;
import com.gtotek.football.base.Constans;
import com.gtotek.football.dao.QuestionEntity;
import com.gtotek.football.util.SoundUtil;
import com.gtotek.footballquiz.R;

public class WinActivity extends Activity {

	private TextView mTvContinue;

	private GridView mGrvDecoding;

	private Context mContext = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_win);

		mTvContinue = (TextView) this.findViewById(R.id.tv_continue);
		mTvContinue.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});

		Bundle bundle = getIntent().getExtras();

		QuestionEntity questionEntity = (QuestionEntity) bundle
				.getSerializable(Constans.KEY_QUESTIONENTITY);

		DecodingAdapter decodingAdapter = new DecodingAdapter(mContext,
				questionEntity);

		mGrvDecoding = (GridView) this.findViewById(R.id.gv_win);
		mGrvDecoding.setAdapter(decodingAdapter);

		SoundUtil.hexat(mContext, SoundUtil.SFX_PASS);

	}
}

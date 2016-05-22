package com.vivanov.material.materialexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;


public class ChatActivity extends FragmentActivity {

	private ImageView mImageView;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chat);

		mImageView = (ImageView) findViewById(R.id.card_avatar);
		mImageView.setTransitionName(getString(R.string.transition_chat_avatar));
	}
}

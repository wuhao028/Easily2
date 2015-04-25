package com.spring.usecenter;

import com.spring.gowhere.R;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class ProjectActivity extends TabActivity {
	
	private RadioGroup group;
	private TabHost tabHost;
	public static final String TAB_SEARCH = "tabSearch";
	public static final String TAB_DOWNLOADED = "tabDownloaded";
	private LinearLayout layout;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.uc_project);
		initData();
	}
	
	private void initData(){
		TextView textView	=(TextView)findViewById(R.id.title_text);
		textView.setText("我的投资项目");
		layout			=(LinearLayout) findViewById(R.id.title_back);
		layout.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				onBackPressed();
			}
		});

		group = setTopGroup();
	}
	
	// 添加顶部的功能按钮,并监听切换
			private RadioGroup setTopGroup() {
				RadioGroup g = (RadioGroup) findViewById(R.id.top_radio);
				tabHost = this.getTabHost();
				//Log.i("msg1","1");
				tabHost.addTab(tabHost.newTabSpec(TAB_SEARCH).setIndicator(TAB_SEARCH)
					.setContent(new Intent(this, SearchUnProjectSearch.class)));
				
				tabHost.addTab(tabHost.newTabSpec(TAB_DOWNLOADED).setIndicator(TAB_DOWNLOADED)
						.setContent(new Intent(this, SearchProjectSearch.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)));
				 ((RadioButton) g.getChildAt(0)).toggle();
				g.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					public void onCheckedChanged(RadioGroup group, int checkedId) {
						switch (checkedId) {
						case R.id.radio_search:
							tabHost.setCurrentTabByTag(TAB_SEARCH);
							break;
						case R.id.radio_downloaded:

							tabHost.setCurrentTabByTag(TAB_DOWNLOADED);
							break;
						default:
							break;
						}
					}
				});

				return g;
			}

}

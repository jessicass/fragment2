package com.example.fragment2.fragment;

import com.example.fragment2.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingFragment extends Fragment {

	private View rootView;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.v("SettingFragment", "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.v("SettingFragment", "onCreateView");
		if (rootView == null) {
			rootView = inflater.inflate(R.layout.fragment_setting, container,
					false);
		} else {
			ViewGroup parent = (ViewGroup) rootView.getParent();
			if (parent != null) {
				parent.removeView(rootView);
			}
		}
		return rootView;
	}

	@Override
	public void onAttach(Activity activity) {
		Log.v("SettingFragment", "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.v("SettingFragment", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.v("SettingFragment", "onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.v("SettingFragment", "onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.v("SettingFragment", "onPause");
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.v("SettingFragment", "onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.v("SettingFragment", "onStart");
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.v("SettingFragment", "onStop");
		super.onStop();
	}
}

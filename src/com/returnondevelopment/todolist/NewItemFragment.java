package com.returnondevelopment.todolist;

import android.app.Activity; 
import android.app.Fragment;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class NewItemFragment extends Fragment {
		
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.new_item_fragment,  container, false);
	}
	
	public interface OnNewItemAddedListener {
		public void onNewItemAdded(String newItem);		
	}
	
	private OnNewItemAddedListener onNewItemAddedListener;
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
		try {
			onNewItemAddedListener = (OnNewItemAddedListener)activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString() + " must implement OnNewItemAddedListener");
		}
		
	}


}

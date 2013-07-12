package com.returnondevelopment.todolist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class ToDoListItemView extends TextView {
	public ToDoListItemView (Context context, AttributeSet ats, int ds) {
		super(context, ats, ds);
		init();
	}
	
	public ToDoListItemView (Context context) {
		super(context);
		init();
	}
	
	public ToDoListItemView (Context context, AttributeSet attrs) {
		super(context, attrs);
		init();		
	}
	
	private void init() {
				
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		// use the base textview to render the text
		super.onDraw(canvas);		
	}
}

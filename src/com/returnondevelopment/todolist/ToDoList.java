package com.returnondevelopment.todolist;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class ToDoList extends Activity
	implements NewItemFragment.OnNewItemAddedListener {    
    private ArrayAdapter<String> aa;
    private ArrayList<String> todoItems;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // get references to the fragments
        FragmentManager fm = getFragmentManager();
        ToDoListFragment todoListFragment = (ToDoListFragment)fm.findFragmentById(R.id.ToDoListFragment);
                
        // create the array list of to do items
        todoItems = new ArrayList<String>();
        
        // create the Array Adapter to bind the array to the List View       
        int resID = R.layout.todolist_item;        
        aa = new ArrayAdapter<String>(this, resID, todoItems);
        
        // bind the array adapter to the list view
        todoListFragment.setListAdapter(aa);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public void onNewItemAdded(String newItem) {
		todoItems.add(newItem);
		aa.notifyDataSetChanged();
	}

}

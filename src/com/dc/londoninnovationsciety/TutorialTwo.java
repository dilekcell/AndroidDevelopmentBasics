package com.dc.londoninnovationsciety;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TutorialTwo extends ListActivity{

		String classNames[] = {"MainActivity", "menu", "Sweet","TutorialOne"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classNames));
	}
	
	@Override
	protected void onListItemClick(ListView lv, View v, int position, long id){
		super.onListItemClick(lv, v, position, id);
		String openClass= classNames[position];
		
		//ListButonlarininIslemleriniYapiyoz
		try{
			Class selected = Class.forName("com.dc.londoninnovationsciety." + openClass);
			Intent selectedIntent=new Intent(this, selected);
			startActivity(selectedIntent);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}

	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
}

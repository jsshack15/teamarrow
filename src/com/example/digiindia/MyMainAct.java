package com.example.digiindia;


import java.io.IOException;





import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder.DeathRecipient;
import android.app.Activity;
import android.app.AlertDialog;
//import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.TotalCaptureResult;
//import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MyMainAct extends FragmentActivity {
	SQLiteDatabase db;
	Cursor c;
	String[] menu;
	     DrawerLayout dLayout;
	     ListView dList;
	     ArrayAdapter<String> adapter;
	     private ActionBarDrawerToggle mDrawerToggle;
	     String s,p,ck;
	     ProgressDialog mProgressDialog;
	     String pass_value1[];
	     int lo=0;
	     private static final String TAG = MyMainAct.class.getSimpleName();
	       Integer[] imageId = {
R.drawable.settings48,R.drawable.listing12,R.drawable.phone325,R.drawable.phone325,R.drawable.phone325,R.drawable.phone325,R.drawable.rti1
	  		      };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		   setContentView(R.layout.activity_main);
		 String pass_value[]=new String[6];
		 //pass_value[0]=user;
		 
		 lo++;

		   getActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
           
	     	menu = new String[]{"Settings","Category","Ambulance","Police","Women's Helpline","Fire","RTI Request"};
	        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
	        
	        dList = (ListView) findViewById(R.id.left_drawer);

	       // adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
	        imagecustom2 adapter = new
	    	        imagecustom2(MyMainAct.this, menu, imageId);
	    	
			  dList.setAdapter(adapter);
	        dLayout.openDrawer(Gravity.START);
	       // dList.setSelector(android.R.color.holo_blue_dark);
			dList.setBackgroundColor(Color.BLACK);	
			
	        dList.setOnItemClickListener(new OnItemClickListener(){

				@Override
				public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
							
					Toast.makeText(getApplicationContext(), menu[position], 3000).show();
					navigateTo(position);
					
				}
	        	
	        });
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	        getActionBar().setHomeButtonEnabled(true);
	 
	        mDrawerToggle = new ActionBarDrawerToggle(this, dLayout,
	                R.drawable.text1566, //nav menu toggle icon
	                R.string.app_name, // nav drawer open - description for accessibility
	                R.string.app_name // nav drawer close - description for accessibility
	        ){
	            public void onDrawerClosed(View view) {
	                getActionBar().setTitle("E GOV");
	                // calling onPrepareOptionsMenu() to show action bar icons
	                  invalidateOptionsMenu();
	            }
	 
	            public void onDrawerOpened(View drawerView) {
	                getActionBar().setTitle("OPTIONS");
	                // calling onPrepareOptionsMenu() to hide action bar icons
	                invalidateOptionsMenu();
	            }
	        };
	        dLayout.setDrawerListener(mDrawerToggle);
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	        getActionBar().setHomeButtonEnabled(true);
	        mDrawerToggle.syncState();
	        pass_value1=pass_value;
    	     //dLayout.setDrawerListener(mDrawerToggle);
	 
	        if (savedInstanceState == null) {
	            // on first time display view for first nav item
	        //    displayView();
	        	navigateTo(1);
	        	
	        }
	}
	        private void navigateTo(int position) {
//	    		Log.v(TAG, "List View Item: " + position);
	    	//	Fragment detail =new DetailFragment();
	    		Log.v(TAG, "List View Item: " + position);
	    		dLayout.closeDrawers();			
    			
	    	//	Fragment tbb =new TabbedActivity();
	    		//Bundle args = new Bundle();
	    		switch(position) {
	    		
	    		case 1:
	    			
	    		//dLayout.closeDrawers();
	    		Events ev=Events.newInstance();
	    		
	    		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,ev).commit();
			
	    			break;
	    		
	    		case 2:
	    			
	    			String mydata2="tel:102" ;
	    			Intent myActivity2 = new Intent(Intent.ACTION_CALL,
	    					Uri.parse(mydata2));
	    			startActivity(myActivity2);
	    		
	    		   		break;
	    		case 3:String mydata3="tel:100" ;
    					Intent myActivity3 = new Intent(Intent.ACTION_CALL,
    					Uri.parse(mydata3));
    					startActivity(myActivity3);
    					break;
	    		case 4:String mydata4="tel:181" ;
     					Intent myActivity4 = new Intent(Intent.ACTION_CALL,
    					Uri.parse(mydata4));
     					startActivity(myActivity4);		
	    		        break;
	    		case 5:
	    			//finish();
	    			String mydata5="tel:101" ;
	    			Intent myActivity5 = new Intent(Intent.ACTION_CALL,
	    					Uri.parse(mydata5));
	    			startActivity(myActivity5);
	    		
	    			  break;
	    		case 0:
	    			Intent i=new Intent(MyMainAct.this,Settings_noti.class);
	    			startActivity(i);
	    			break;
	    		case 6:
	    			if(isNetworkAvailable())
	    			{
Fb_page ev5=Fb_page.newInstance();
	
	 	    		getSupportFragmentManager()
	 				.beginTransaction()
	 				.replace(R.id.content_frame,ev5).commit();

	    			}
	    			else
	    			{
	    				AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    				builder.setMessage("Internet Connection Not Available")
	    				       .setCancelable(false)
	    				       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    				           public void onClick(DialogInterface dialog, int id) {
	    				                //do things
	    				           }
	    				       });
	    				AlertDialog alert = builder.create();
	    				alert.show();
	    			}
	    			break;

	    			
	    		   				
	    			
	    		}
	    	
	}
	        
	    	
@Override
	        public boolean onOptionsItemSelected(MenuItem item) {
	            // Pass the event to ActionBarDrawerToggle, if it returns
	            // true, then it has handled the app icon touch event
	    		//Toast.makeText(getApplicationContext(),"CLick",3000).show();
	            if (mDrawerToggle.onOptionsItemSelected(item)) {
	              return true;
	            }
	            return super.onOptionsItemSelected(item);
	            
	        }
private boolean isNetworkAvailable() {
    ConnectivityManager connectivityManager 
          = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    
}
}
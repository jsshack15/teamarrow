package com.example.digiindia;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.os.Build;
import android.preference.PreferenceManager;

public class Settings_noti extends Activity {

    
	CheckBox c1,c2;
	Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
SharedPreferences set=PreferenceManager.getDefaultSharedPreferences(this);
		Boolean b11=set.getBoolean("blue",false);
		Boolean b22=set.getBoolean("green",false);
		Boolean b33=set.getBoolean("yellow",false);
		Boolean b44=set.getBoolean("white",false);
		if(b11==true)
		{

		     NotificationManager   nm=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
		      
		     /*Notification n=	new Notification(android.R.drawable.stat_sys_headset,"HEADPHONE PLUGGED IN",System.currentTimeMillis()); 
		        n.defaults=Notification.DEFAULT_ALL;
		        
		       */ Intent i=new Intent(getApplicationContext(),Mynotification.class);
		        PendingIntent p=PendingIntent.getActivity(getApplicationContext(),0,i,0);
		        Notification n=new Notification.Builder(getApplicationContext())
		        .setContentTitle("NEW MAIL FROM"+"test@gmail.com").setContentTitle("Subject").setSmallIcon(R.drawable.ic_launcher).setContentIntent(p).setAutoCancel(true).addAction(R.drawable.ic_launcher, "call", p).addAction(R.drawable.ic_launcher, "more", p).build();
		        n.flags |=Notification.FLAG_NO_CLEAR;
				nm.notify(0,n);
		         
		        
			}
		if(b22==true)
		{

		     NotificationManager   nm=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
		      
		     /*Notification n=	new Notification(android.R.drawable.stat_sys_headset,"HEADPHONE PLUGGED IN",System.currentTimeMillis()); 
		        n.defaults=Notification.DEFAULT_ALL;
		        
		       */ Intent i=new Intent(getApplicationContext(),Mynotification.class);
		        PendingIntent p=PendingIntent.getActivity(getApplicationContext(),0,i,0);
		        Notification n=new Notification.Builder(getApplicationContext())
		        .setContentTitle("NEW MAIL FROM"+"test@gmail.com").setContentTitle("Subject").setSmallIcon(R.drawable.ic_launcher).setContentIntent(p).setAutoCancel(true).addAction(R.drawable.ic_launcher, "call", p).addAction(R.drawable.ic_launcher, "more", p).build();
		        n.flags |=Notification.FLAG_NO_CLEAR;
				nm.notify(0,n);
		         
		        	
		}
		if(b33==true)
		{

		     NotificationManager   nm=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
		      
		     /*Notification n=	new Notification(android.R.drawable.stat_sys_headset,"HEADPHONE PLUGGED IN",System.currentTimeMillis()); 
		        n.defaults=Notification.DEFAULT_ALL;
		        
		       */ Intent i=new Intent(getApplicationContext(),Mynotification.class);
		        PendingIntent p=PendingIntent.getActivity(getApplicationContext(),0,i,0);
		        Notification n=new Notification.Builder(getApplicationContext())
		        .setContentTitle("NEW MAIL FROM"+"test@gmail.com").setContentTitle("Subject").setSmallIcon(R.drawable.ic_launcher).setContentIntent(p).setAutoCancel(true).addAction(R.drawable.ic_launcher, "call", p).addAction(R.drawable.ic_launcher, "more", p).build();
		        n.flags |=Notification.FLAG_NO_CLEAR;
				nm.notify(0,n);
		         
		        
		}
		if(b44==true)
		{

		     NotificationManager   nm=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
		      
		     /*Notification n=	new Notification(android.R.drawable.stat_sys_headset,"HEADPHONE PLUGGED IN",System.currentTimeMillis()); 
		        n.defaults=Notification.DEFAULT_ALL;
		        
		       */ Intent i=new Intent(getApplicationContext(),Mynotification.class);
		        PendingIntent p=PendingIntent.getActivity(getApplicationContext(),0,i,0);
		        Notification n=new Notification.Builder(getApplicationContext())
		        .setContentTitle("NEW MAIL FROM"+"test@gmail.com").setContentTitle("Subject").setSmallIcon(R.drawable.ic_launcher).setContentIntent(p).setAutoCancel(true).addAction(R.drawable.ic_launcher, "call", p).addAction(R.drawable.ic_launcher, "more", p).build();
		        n.flags |=Notification.FLAG_NO_CLEAR;
				nm.notify(0,n);
		         
		        
		}		


						}
		
        
    }






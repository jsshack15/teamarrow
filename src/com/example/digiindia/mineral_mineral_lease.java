package com.example.digiindia;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.example.digiindia.hospitals.MyLocation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.ActionBar.LayoutParams;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filterable;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class mineral_mineral_lease extends Activity{
	int start1=0,start2=0,start3=0,start4=0,start5=0,start6=0,start7=0,start8=0;
	TextView tvv,tvv1,tvv2,tvv3,tvv4,tvv5,tvv6,tvv7;
	imagecustom_minerals_lease adapter3;
	ListView lv1;
	EditText e1;
	Button b1;
	ArrayAdapter<String> ad;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
    WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.mineral_lease_layout);
	Spinner dropdown1=(Spinner)findViewById(R.id.spinner1);
	//ArrayAdapter<String> adapter1 =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,category);
	//dropdown2=(Spinner)findViewById(R.id.spinner2);
//	dropdown1.setOnItemSelectedListener(this);
	//ArrayAdapter<String> adapter2 =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,distct);
	lv1=(ListView)findViewById(R.id.listView1);
	e1=(EditText)findViewById(R.id.editText1);
	tvv=(TextView)findViewById(R.id.textView1);
	//et1=(EditText)findViewById(R.id.editText1);
	tvv1=(TextView)findViewById(R.id.textView2);
	tvv2=(TextView)findViewById(R.id.textView3);
	tvv3=(TextView)findViewById(R.id.textView4);
	tvv4=(TextView)findViewById(R.id.textView5);
	tvv5=(TextView)findViewById(R.id.textView6);
	tvv6=(TextView)findViewById(R.id.textView7);
	tvv7=(TextView)findViewById(R.id.textView8);

	try {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		DefaultHandler handler = new DefaultHandler() {
		boolean name = false;
		boolean salary = false;
		boolean salary1=false;
		boolean salary2 = false;
		boolean salary3=false;

		boolean salary4 = false;
		boolean salary5=false;
		boolean salary6=false;

		public void startElement(String uri, String localName,String qName,
		Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("Mineral")) {
		name = true;
		}
		if (qName.equalsIgnoreCase("NO_OF_LEASES")) {
		salary = true;
		}
		if (qName.equalsIgnoreCase("LEASE_AREA_HECT")) {
		salary1 = true;
		}
		}
		public void endElement(String uri, String localName,
		String qName) throws SAXException {
			

		}

		public void characters(char ch[], int start, int length) throws SAXException {
		if (name) {
		//tv.setText(tv.getText()+"\n\n Name : " + new String(ch, start, length));
			if(start1==0)
			{
				tvv.setText(new String(ch, start, length));
				start1=1;
				
			}
			else
			{
		 tvv.setText(tvv.getText()+"-" + new String(ch, start, length));
		 }
			
		//tv[i]=tvv.getText().toString();
		//Toast.makeText(getApplicationContext(),new String(ch, start, length)+"",3000).show();
		//i++;

		name= false;

		}
		if (salary) {
		//tv.setText(tv.getText()+"\n Salary : " + new String(ch, start, length));
			//tvv1.setText(tvv1.getText()+"-" + new String(ch, start, length));
			if(start2==0)
			{
				tvv1.setText(new String(ch, start, length));
				start2=1;
				
			}
			else
			{
		 tvv1.setText(tvv1.getText()+"-" + new String(ch, start, length));
		 }
			salary = false;
		}
		if (salary1) {
			//tv.setText(tv.getText()+"\n Salary : " + new String(ch, start, length));
			if(start3==0)
			{
				tvv2.setText(new String(ch, start, length));
				start3=1;
				
			}
			else
			{
		 tvv2.setText(tvv2.getText()+"-" + new String(ch, start, length));
		 }
			///tvv2.setText(tvv2.getText()+"-" + new String(ch, start, length));
			salary1 = false;
			}
		}
		};

		InputStream is = getAssets().open("mineral_lease_m.xml");
		saxParser.parse(is, handler);
		} catch (Exception e) {e.printStackTrace();}

	String Str=tvv.getText().toString();
	String Str1=tvv1.getText().toString();
	String Str2=tvv2.getText().toString();
	int h=0,h1=0,h2=0;
	for (String retval: Str.split("-", 0)){
	    //System.out.println(retval);
		//tv1[h]=retval;
		h++;
	 }
	for (String retval: Str1.split("-", 0)){
	    //System.out.println(retval);
		//tv1[h]=retval;
		h1++;
	 }for (String retval: Str2.split("-", 0)){
		    //System.out.println(retval);
			//tv1[h]=retval;
			h2++;
		 }
	 final String tv1[] =new String[h];
	 final String tv2[] =new String[h1];
	 final String tv3[] =new String[h2];
		 h=0;
	 for (String retval: Str.split("-", 0)){
	     //System.out.println(retval);
	 	tv1[h]=retval;
	 	h++;
	  }

	 h=0;
	 for (String retval: Str1.split("-", 0)){
	     //System.out.println(retval);
	 	tv2[h]=retval;
	 	h++;
	  }

	 h=0;
	 for (String retval: Str2.split("-", 0)){
	     //System.out.println(retval);
	 	tv3[h]=retval;
	 	h++;
	  }

		 tvv.setVisibility(View.GONE);
	 tvv1.setVisibility(View.GONE);
	 tvv2.setVisibility(View.GONE);
	 tvv3.setVisibility(View.GONE);
	 tvv4.setVisibility(View.GONE);
	 tvv5.setVisibility(View.GONE);
	 tvv6.setVisibility(View.GONE);
	 tvv7.setVisibility(View.GONE);

	 		final int h9=h;
	 		
	 		 ad=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,tv1);
	 		
	 adapter3=new imagecustom_minerals_lease(mineral_mineral_lease.this, tv1, tv2,tv3);
	 lv1.setAdapter(adapter3);
	 e1.addTextChangedListener(new TextWatcher() {
	     
		    @Override
		    public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
		        // When user changed the Text
		       // ((Filterable) mineral_mineral_lease.this.tvv1).getFilter().filter(cs);
		    	;
		    }
		     
		    @Override
		    public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
		            int arg3) {
		        // TODO Auto-generated method stub
		         
		    }
		     

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});


	 	//dropdown1.setOnItemClickListener(clickb);
	 		//Toast.makeText(getApplicationContext(), dropdown1.getItemAtPosition(dropdown1.getSelectedItemPosition()).toString(),3000).show();
	 		//dropdown1.seto
	 	/*	b1.setOnClickListener(new View.OnClickListener() {
	 			
	 			@Override
	 			public void onClick(View v) {
	 				// TODO Auto-generated method stub
	 			//imagecustom_pin adapter3=new imagecustom_pin(hospitals.this, name1, name2,name3);	
	 				int pos=-1;
	 				int pos1=0;
	 				myloca_long_lang=e1.getText().toString();
	 				if(get_pos==0)
	 				{
	 					String serch_str=e1.getText().toString();
	 					for(int i=0;i<h9;i++)
	 					{
	 						if(tv1[i].equalsIgnoreCase(serch_str))
	 						{
	 							pos=i;
	 							pos1++;
	 						}
	 					}
	 				}
	 				if(get_pos==1)
	 				{
	 					String serch_str=e1.getText().toString();
	 					for(int i=0;i<h9;i++)
	 					{
	 						if(tv2[i].equalsIgnoreCase(serch_str))
	 						{
	 							pos=i;
	 							pos1++;
	 						}
	 					}
	 				}
	 				if(get_pos==2)
	 				{ 	int ob1=0;
	 					for (String retval: myloca_long_lang.split("  ", 0)){
	 				    //System.out.println(retval);
	 					if(ob1==0)
	 						{
	 						latt1=retval;
	 						ob1=1;
	 						}
	 					else
	 					{
	 						latt2=retval;
	 					}
	 					}

	 					//String serch_str=e1.getText().toString();
	 					float distance=0,sqdis;
	 					for(int i=0;i<h9;i++)
	 					{ if((!tv7[i].equalsIgnoreCase("NA"))&&(!tv8[i].equalsIgnoreCase("NA")))
	 					{
	 						sqdis=((Float.parseFloat(tv7[i])-(Float.parseFloat(latt1)))*(Float.parseFloat(tv7[i])-(Float.parseFloat(latt1))))
	 								+((Float.parseFloat(tv8[i])-(Float.parseFloat(latt2)))*(Float.parseFloat(tv8[i])-(Float.parseFloat(latt2))));
	 						distance=(float) Math.sqrt(sqdis);
	 						if(distance<1)
	 						{
	 							pos=i;
	 							pos1++;
	 						}
	 					}
	 				}
	 				}
	 				if(get_pos==3)
	 				{int ob1=0;
	 					for (String retval: myloca_long_lang.split("  ", 0)){
	 				    //System.out.println(retval);
	 					if(ob1==0)
	 						{
	 						latt1=retval;
	 						ob1=1;
	 						}
	 					else
	 					{
	 						latt2=retval;
	 					}
	 					}
	 					//String serch_str=e1.getText().toString();
	 					float distance=0,sqdis;
	 					for(int i=0;i<h9;i++)
	 					{ if((!tv7[i].equalsIgnoreCase("NA"))&&(!tv8[i].equalsIgnoreCase("NA")))
	 					{
	 						sqdis=((Float.parseFloat(tv7[i])-(Float.parseFloat(latt1)))*(Float.parseFloat(tv7[i])-(Float.parseFloat(latt1))))
	 								+((Float.parseFloat(tv8[i])-(Float.parseFloat(latt2)))*(Float.parseFloat(tv8[i])-(Float.parseFloat(latt2))));
	 						distance=(float) Math.sqrt(sqdis);
	 						if(distance<1)
	 						{
	 							pos=i;
	 							pos1=1;
	 							pos2++;
	 						}
	 					}
	 				}
	 				}
	 			
	 				
	 				if(pos1!=0)
	 				{
	 				final String utt1[]=new String[pos1];
	 final				String utt2[]=new String[pos1];

	 	final			String utt3[]=new String[pos1];
	 		final		String utt4[]=new String[pos1];
	 			final	String utt5[]=new String[pos1];
	 				final String utt6[]=new String[pos1];
	 				final String utt7[]=new String[pos1];
	 				final String utt8[]=new String[pos1];
	 				final float utt9[]=new float[pos2];
	 				final String utt1l[]=new String[pos2];
	 				final				String utt2l[]=new String[pos2];

	 					final			String utt3l[]=new String[pos2];
	 						final		String utt4l[]=new String[pos2];
	 							final	String utt5l[]=new String[pos2];
	 								final String utt6l[]=new String[pos2];
	 								final String utt7l[]=new String[pos2];
	 								final String utt8l[]=new String[pos2];
	 								//final float utt9[]=new float[pos1];

	 				pos1=0;
	 				pos2=0;
	 				if(get_pos==0)
	 				{
	 					String serch_str=e1.getText().toString();
	 					for(int i=0;i<h9;i++)
	 					{
	 						if(tv1[i].equalsIgnoreCase(serch_str))
	 						{
	 							pos=i;
	 							utt1[pos1]=tv1[i];
	 							utt2[pos1]=tv2[i];
	 							utt3[pos1]=tv3[i];
	 							utt4[pos1]=tv4[i];
	 							utt5[pos1]=tv5[i];
	 							utt6[pos1]=tv6[i];
	 							utt7[pos1]=tv7[i];
	 							utt8[pos1]=tv8[i];
	 							pos1++;
	 						}
	 					}
	 				}
	 				if(get_pos==1)
	 				{
	 					String serch_str=e1.getText().toString();
	 					for(int i=0;i<h9;i++)
	 					{
	 						if(tv2[i].equalsIgnoreCase(serch_str))
	 						{

	 							pos=i;
	 							utt1[pos1]=tv1[i];
	 							utt2[pos1]=tv2[i];
	 							utt3[pos1]=tv3[i];
	 							utt4[pos1]=tv4[i];
	 							utt5[pos1]=tv5[i];
	 							utt6[pos1]=tv6[i];
	 							utt7[pos1]=tv7[i];
	 							utt8[pos1]=tv8[i];
	 							pos1++;
	 						}
	 					}
	 					
	 				}
	 				if(get_pos==2)
	 				{
	 					int ob1=0;
	 					for (String retval: myloca_long_lang.split("  ", 0)){
	 				    //System.out.println(retval);
	 					if(ob1==0)
	 						{
	 						latt1=retval;
	 						ob1=1;
	 						}
	 					else
	 					{
	 						latt2=retval;
	 					}
	 					}
	 					//String serch_str=e1.getText().toString();
	 					float distance=0,sqdis;
	 					for(int i=0;i<h9;i++)
	 					{  if((!tv7[i].equalsIgnoreCase("NA"))&&(!tv8[i].equalsIgnoreCase("NA")))
	 					{
	 						sqdis=((Float.parseFloat(tv7[i])-(Float.parseFloat(latt1)))*(Float.parseFloat(tv7[i])-(Float.parseFloat(latt1))))
	 								+((Float.parseFloat(tv8[i])-(Float.parseFloat(latt2)))*(Float.parseFloat(tv8[i])-(Float.parseFloat(latt2))));
	 						distance=(float) Math.sqrt(sqdis);
	 						if(distance<1)
	 						{

	 							pos=i;
	 							utt1[pos1]=tv1[i];
	 							utt2[pos1]=tv2[i];
	 							utt3[pos1]=tv3[i];
	 							utt4[pos1]=tv4[i];
	 							utt5[pos1]=tv5[i];
	 							utt6[pos1]=tv6[i];
	 							utt7[pos1]=tv7[i];
	 							utt8[pos1]=tv8[i];
	 							pos1++;
	 						}
	 					}
	 					
	 					}
	 				}
	 				if(get_pos==3)
	 				{
	 					int ob1=0;
	 					for (String retval: myloca_long_lang.split("  ", 0)){
	 				    //System.out.println(retval);
	 					if(ob1==0)
	 						{
	 						latt1=retval;
	 						ob1=1;
	 						}
	 					else
	 					{
	 						latt2=retval;
	 					}
	 					}//String serch_str=e1.getText().toString();
	 					float distance=0,sqdis;
	 					for(int i=0;i<h9;i++)
	 					{  if((!tv7[i].equalsIgnoreCase("NA"))&&(!tv8[i].equalsIgnoreCase("NA")))
	 					{
	 						sqdis=((Float.parseFloat(tv7[i])-(Float.parseFloat(latt1)))*(Float.parseFloat(tv7[i])-(Float.parseFloat(latt1))))
	 								+((Float.parseFloat(tv8[i])-(Float.parseFloat(latt2)))*(Float.parseFloat(tv8[i])-(Float.parseFloat(latt2))));
	 						distance=(float) Math.sqrt(sqdis);
	 						if(distance<1)
	 						{

	 							pos=i;
	 							utt1l[pos2]=tv1[i];
	 							utt2l[pos2]=tv2[i];
	 							utt3l[pos2]=tv3[i];
	 							utt4l[pos2]=tv4[i];
	 							utt5l[pos2]=tv5[i];
	 							utt6l[pos2]=tv6[i];
	 							utt7l[pos2]=tv7[i];
	 							utt8l[pos2]=tv8[i];
	 							utt9[pos2]=distance;
	 							
	 							pos2++;
	 						
	 							
	 						}
	 					}
	 					
	 					}
	 					float mmin_loc=utt9[0];
	 					int min_loc_hos=0;
	 					for(int i=0;i<pos2;i++)
	 					{
	 						if(mmin_loc>utt9[i])
	 						{
	 							mmin_loc=utt9[i];
	 							min_loc_hos=i;
	 							
	 						}
	 					}
	 					utt1[0]=utt1l[min_loc_hos];
	 					utt2[0]=utt2l[min_loc_hos];
	 					utt3[0]=utt3l[min_loc_hos];
	 					utt4[0]=utt4l[min_loc_hos];
	 					utt5[0]=utt5l[min_loc_hos];
	 					utt6[0]=utt6l[min_loc_hos];
	 					utt7[0]=utt7l[min_loc_hos];
	 					utt8[0]=utt8l[min_loc_hos];
	 					
	 				}
	 				
	 			
	 if(pos!=-1)
	 	{
	 /*	String utt1[]={tv1[pos]};
	 	String utt2[]={tv2[pos]};

	 	String utt3[]={tv3[pos]};
	 	String utt4[]={tv4[pos]};
	 	String utt5[]={tv5[pos]};
	 	String utt6[]={tv6[pos]};
	 	String utt7[]={tv7[pos]};
	 	String utt8[]={tv8[pos]};
	 */	//imagecustom_pin adapter3=new imagecustom_pin(allindiapincode.this, utt1, utt2,utt3);
	 /*
	 	imagecustom_hospitals adapter4=new imagecustom_hospitals(hospitals.this, utt1,utt2,utt3, utt4,utt5,utt6, utt7,utt8);
	 	lv1.setAdapter(adapter4);

	 	lv1.setOnItemClickListener(new OnItemClickListener() {

	 		@Override
	 		public void onItemClick(AdapterView<?> parent, View view, int position,
	 				long id) {
	 			// TODO Auto-generated method stub
	 			listview3 cdd1=new listview3(utt1[position],utt2[position],utt3[position],utt4[position],utt5[position],utt6[position],utt7[position],utt8[position],hospitals.this);
	 			
	 		 	
	 			cdd1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
	 			cdd1.show();
	 			Window window = cdd1.getWindow();
	 			window.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	 	  
	 		}
	 	});

	 	}
	 				}
	 else
	 	{
	 	Toast.makeText(getApplicationContext(), "Search Result Not Found", 3000).show();
	 	}
	 	
	 			}
	 		});
	 		
	 	}
	 	
	 	@Override
	 	public void onItemSelected(AdapterView<?> parent, View view, int position,
	 			long id) {

	 		if(position==0)
	 		{
	 			get_pos=0;
	 			
	 		}
	 		else if(position==1)
	 		{
	 			get_pos=1;
	 		}
	 		else if(position==2)
	 		{
	 			get_pos=2;
	 			 mProgressDialog = new ProgressDialog(this);
	 				mProgressDialog.setTitle("Location");
	 				mProgressDialog.setMessage("Fetching...");
	 				mProgressDialog.setIndeterminate(false);
	 				mProgressDialog.show();
	 				LocationManager lm=(LocationManager)getSystemService(LOCATION_SERVICE);
	 				LocationListener ll=new MyLocation();
	 				lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,ll);
	 		}
	 		else if(position==3)
	 		{
	 			get_pos=3;
	 			 mProgressDialog = new ProgressDialog(this);
	 				mProgressDialog.setTitle("Location");
	 				mProgressDialog.setMessage("Fetching...");
	 				mProgressDialog.setIndeterminate(false);
	 				mProgressDialog.show();
	 				LocationManager lm=(LocationManager)getSystemService(LOCATION_SERVICE);
	 				LocationListener ll=new MyLocation();
	 				lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,ll);
	 		}


	 		
	 	}
	 	int j=0;
	 	public class MyLocation implements LocationListener
	 	{

	 		@Override
	 		public void onLocationChanged(Location arg0) {
	 			// TODO Auto-generated method stub
	 			arg0.getLatitude();
	 			arg0.getLongitude();
	 			String lattt1=""+arg0.getLatitude();
	 			String lattt2=""+arg0.getLongitude();
	 		//Toast.makeText(getApplicationContext(), str, 7000).show();
	 		//	String myData= text1.getText().toString();
	 			//String mydata2=text2.getText().toString();
	 			if(j==0)
	 				{
	 			j=1;
	 			e1.setText(lattt1+"  "+lattt2);
	 			myloca_long_lang=e1.getText().toString();
	 				mProgressDialog.dismiss();
	 				}
	 		}

	 		@Override
	 		public void onProviderDisabled(String arg0) {
	 			// TODO Auto-generated method stub

	 			Toast.makeText(getApplicationContext(), "GPS Disabled", 3000).show();
	 		}

	 		@Override
	 		public void onProviderEnabled(String arg0) {
	 			// TODO Auto-generated method stub
	 			Toast.makeText(getApplicationContext(), "GPS Enabled", 3000).show();
	 		}

	 		@Override
	 		public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
	 			// TODO Auto-generated method stub
	 			
	 		}
	 		
	 		}
	 	

	 	@Override
	 	public void onNothingSelected(AdapterView<?> parent) {
	 		// TODO Auto-generated method stub
	 		
	 	}	}
	 		*/
}}
	 	





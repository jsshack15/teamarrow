package com.example.digiindia;

import java.util.Locale;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class MyMainActivity extends ActionBarActivity implements TextToSpeech.OnInitListener{
	String alph[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	TextToSpeech speech;
	GridView view1;
	int posi=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_main
				);
		speech=new TextToSpeech(this,this);
		
		view1=(GridView)findViewById(R.id.gridView1);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alph);
		view1.setAdapter(adapter);
		view1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				//Toast.makeText(getApplicationContext(), alph[arg2], 3000).show();
posi=arg2;
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onInit(int status) {
		// TODO Auto-generated method stub
		if(status==speech.SUCCESS)
		{
			int result=speech.setLanguage(Locale.US);
			if(result==TextToSpeech.LANG_MISSING_DATA||result==TextToSpeech.LANG_NOT_SUPPORTED)
			{
				Toast.makeText(getApplicationContext(), "Not Supported", 3000).show();
			}
			else
			{
				view1.setEnabled(true);
				//getMyVoice();
			}
		}
	}
		
		public void getMyVoice()
		{
			String string=alph[posi];
			//speech.speak(string, TextToSpeech.QUEUE_FLUSH,null);
			speech.speak(alph[posi], TextToSpeech.QUEUE_FLUSH, null);
		}
		}

		
	



package com.kamera;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	Button button1;
	ImageView image1;
	Intent intent1;
	Bundle bundle1;
	Bitmap bitmap1;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button1 = (Button) findViewById(R.id.button1);        
        image1 = (ImageView) findViewById(R.id.imageView1);
        button1.setOnClickListener(this);
        
        
    }


	@Override
	public void onClick(View v) {
		intent1 = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		this.startActivityForResult(intent1, 0);
				
	}

		
	public void onActivityResult(int requestCode, int resultCode, Intent data) { 
		super.onActivityResult(requestCode, resultCode, data);
		
		bundle1 = data.getExtras();
		bitmap1 = (Bitmap) bundle1.get("data");
		
		bitmap1 = Bitmap.createScaledBitmap(bitmap1, 800, 500, true);
		
		image1.setImageBitmap(bitmap1);
	}
	
		
		
		
	

	
}

	
	
	
	
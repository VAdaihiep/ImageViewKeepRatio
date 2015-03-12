package com.va.imageviewkeepratiosample;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.va.imageviewkeepratio.ImageViewKeepRatio;

import android.app.Activity;
import android.os.Bundle;

/**
 * Sample load image from internet using Universal Image Loader. Delay load
 * image 3 second.
 * 
 * @author VAdaihiep
 * 
 */
public class MainActivity extends Activity {

	String imageUrl = "http://www.amthucgiadinh.vn/wp-content/uploads/2014/02/img45539JAYHL-ngoctrinh1jpg1359359194.jpg";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
				this).build();
		ImageLoader.getInstance().init(config);

		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.delayBeforeLoading(3000).build();

		ImageLoader.getInstance().displayImage(imageUrl,
				(ImageViewKeepRatio) findViewById(R.id.img),
				displayImageOptions);
	}

}

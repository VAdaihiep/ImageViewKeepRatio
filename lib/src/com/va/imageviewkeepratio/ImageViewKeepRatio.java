package com.va.imageviewkeepratio;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Keep ratio width / height via attr: width_height_ratio. If not set, ratio of
 * image view will be drawable's width / drawable's height
 * 
 * @author VAdaihiep
 * 
 */
public class ImageViewKeepRatio extends ImageView {

	private float mWidthHeightRatio;

	public ImageViewKeepRatio(Context context) {
		super(context);
	}

	public ImageViewKeepRatio(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
				R.styleable.ImageViewKeepRatio, 0, 0);
		try {
			mWidthHeightRatio = a.getFloat(
					R.styleable.ImageViewKeepRatio_width_height_ratio, -1);
		} finally {
			a.recycle();
		}
	}

	public ImageViewKeepRatio(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int width = MeasureSpec.getSize(widthMeasureSpec);
		int height = 0;
		if (mWidthHeightRatio > -1) {
			// Calculate height via attr
			height = (int) (width / mWidthHeightRatio);
		} else if (getDrawable() != null) {
			// Calculate height via image drawable
			height = width * getDrawable().getIntrinsicHeight()
					/ getDrawable().getIntrinsicWidth();
		}

		setMeasuredDimension(width, height);
	}
}
# ImageViewKeepRatio
Android ImageView keep ratio width/height.

Usage:
<com.va.imageviewkeepratio.ImageViewKeepRatio
        xmlns:va="http://schemas.android.com/apk/res/com.va.imageviewkeepratiosample"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:scaleType="centerCrop"
        va:width_height_ratio="0.5" />
        
width_height_ratio = width/height.   
If not set, ImageView's ratio will be image resource's width / image resource's height.

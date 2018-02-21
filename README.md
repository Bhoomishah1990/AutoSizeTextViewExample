# AutoSizeTextViewExample
It allows you to instruct a TextView to let the text size expand or contract automatically to fill its layout based on the TextView's characteristics and boundaries. This setting makes it easier to optimise the text size on different screens with dynamic content.
It is new feature in android 8.0.

User can add TextView Property 
```java
 <TextView
        android:id="@+id/tvAutoSize"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:text="@string/app_name"
        app:autoSizeMaxTextSize="100sp"
        app:autoSizeMinTextSize="12sp"
        app:autoSizeStepGranularity="2sp"
        app:autoSizeTextType="uniform"
        tools:ignore="MissingPrefix" />
```

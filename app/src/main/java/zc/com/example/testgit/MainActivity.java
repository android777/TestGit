package zc.com.example.testgit;


import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	public static String tag="zc";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		Log.i(tag,"hello");
    }
}

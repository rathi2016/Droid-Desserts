package com.bequite.rathind.fragreyclerpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity{
//
//    private static final String LOG_TAG = MainActivity.class.getSimpleName();
//    public static  final String EXTRA_MSG = "com.example.android.twoactivities.extra.MESSAGE";
//    private EditText mMessageEditTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: Started");

//
//        SharedPreferences sharedPreferences = this.getSharedPreferences("com.bequite.rathind.fragreyclerpractice", Context.MODE_PRIVATE);
//        ArrayList<String> friends = new ArrayList<>();
//        friends.add("Rathi");
//        friends.add("Mickey");
//        friends.add("Sanddy");
//        Gson gson = new Gson();
//        String json = gson.toJson(friends);
//
//        try{
//            sharedPreferences.edit().putString("friends",json).apply();
//            Log.i("friends",json);
//
//        }catch(Exception e){
//             e.printStackTrace();
//        }
//        ArrayList<String> newfriends = new ArrayList<>();
//        Gson newjson = new Gson();



//   sharedPreferences.edit().putString("userName","r2d2").apply();
//       String username = sharedPreferences.getString("userName","");
//       Log.i("this is the username", username);
//
//        mMessageEditTxt = findViewById(R.id.textView2);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

//    public void launchSecondActivity(View view) {
//        Log.d(LOG_TAG, "Button clicked!");
//        Intent intent = new Intent(this, SecondActivity.class);
//        String message = mMessageEditTxt.getText().toString();
//        intent.putExtra(EXTRA_MSG,message);
//        startActivity(intent);
//    }
}

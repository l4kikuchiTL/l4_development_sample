package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.buttonChangeMessage);
//        button.setOnClickListener(new MyOnClickListener());

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();

        myRef.child("message").setValue("Hello, World!",null);

        MyValueEventListener listener = new MyValueEventListener();

        myRef.child("key").addValueEventListener(listener);

    }

//    class MyOnClickListener implements View.OnClickListener{
//        @Override
//        public void onClick(View view){
//            TextView text = findViewById(R.id.textViewMessage);
//            text.setText("こんにちは　Android!");
//        }

    class MyValueEventListener implements ValueEventListener {
        public void onDataChange(DataSnapshot snapshot) {
            String key = snapshot.getKey();
            Object value = snapshot.getValue();
            System.out.println("データを受信しました。" + key + "=" + value);
        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データがキャンセルされました。" + error.toString());
        }
    }
}

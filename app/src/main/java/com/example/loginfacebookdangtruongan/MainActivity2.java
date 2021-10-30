package com.example.loginfacebookdangtruongan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        AccessToken accessToken = AccessToken.getCurrentAccessToken();
//        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();
//
//        LoginManager.getInstance().logInWithReadPermissions(MainActivity2.this, Arrays.asList("public_profile"));

    }
}
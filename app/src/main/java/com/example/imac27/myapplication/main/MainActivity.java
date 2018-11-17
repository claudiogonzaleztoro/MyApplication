package com.example.imac27.myapplication.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.imac27.myapplication.R;

/**
*   Displays the Main screen.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
    }
}

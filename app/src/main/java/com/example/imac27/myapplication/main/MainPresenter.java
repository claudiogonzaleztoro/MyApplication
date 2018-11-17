package com.example.imac27.myapplication.main;


/**
 * Responsable for handling actions from the View and updating the Ui as required
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        this.mView = view;
    }
}

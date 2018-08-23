package com.yukaiboy.orderingsystem;


import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public final class Tools {

    public static void WriteDataToSharedPreferences(SharedPreferences _SharedPreferences, String _Key, String _Value) {
        _SharedPreferences.edit()
                .putString(_Key, _Value)
                .commit();
    }

    public static void ReadDataFromSharedPreferences(SharedPreferences _SharedPreferences, String _Key, String _DefauleValue) {
        _SharedPreferences.getString(_Key, _DefauleValue);
    }


    public static void AddIndexFragment(FragmentManager fragmentManager, Fragment fragment) {
        FragmentTransaction trans = fragmentManager.beginTransaction();
        trans.add(R.id.coordinatorLayout, fragment);
        trans.commit();
    }

    public static void SwapFragment(FragmentManager fragmentManager,Fragment fragment) {
        FragmentTransaction trans = fragmentManager.beginTransaction();
        trans.replace(R.id.coordinatorLayout, fragment);
        trans.commit();
    }

    public static void AddFragment(FragmentManager fragmentManager,Fragment sourceFragment, Fragment destFragment) {
        FragmentTransaction trans = fragmentManager.beginTransaction();
        trans.hide(sourceFragment);
        trans.add(R.id.coordinatorLayout, destFragment);
        trans.addToBackStack(null);
        trans.commit();
    }



    public static void ReturnSwapFragment(FragmentManager fragmentManager) {
        FragmentTransaction trans = fragmentManager.beginTransaction();
        fragmentManager.popBackStack();
        trans.commit();
    }
}

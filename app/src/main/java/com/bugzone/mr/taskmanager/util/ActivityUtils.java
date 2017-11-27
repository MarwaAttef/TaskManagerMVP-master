package com.bugzone.mr.taskmanager.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Marwa on 11/28/2017.
 */

public class ActivityUtils {
    public static Boolean addFragmentToActivity (@NonNull FragmentManager fragmentManager,
                                                 @NonNull Fragment fragment, int frameId) {
        if(fragmentManager!=null ){
            if(fragment!=null) {

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(frameId, fragment);
                transaction.commit();
            }}
        return true;
    }

}

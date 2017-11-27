package com.bugzone.mr.taskmanager.data.mainModel.source.remote;

import android.support.annotation.NonNull;

import com.bugzone.mr.taskmanager.data.mainModel.MainActivityModel;
import com.bugzone.mr.taskmanager.data.mainModel.source.MainModelDataSource;

/**
 * Created by Marwa on 11/27/2017.
 */

public class MainModelRemoteDataSource implements MainModelDataSource {
    private static MainModelRemoteDataSource INSTANCE;


    public static MainModelRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainModelRemoteDataSource();
        }
        return INSTANCE;
    }



    @Override
    public void getData(@NonNull MainDataCallBack callBack) {
        MainActivityModel mainActivityModel =new MainActivityModel();
        mainActivityModel.setName("remoteData");
        callBack.onSuccess(mainActivityModel);
    }
}

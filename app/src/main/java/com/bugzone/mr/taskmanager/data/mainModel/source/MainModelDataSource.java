package com.bugzone.mr.taskmanager.data.mainModel.source;

import android.support.annotation.NonNull;

import com.bugzone.mr.taskmanager.data.mainModel.MainActivityModel;

/**
 * Created by Marwa on 11/27/2017.
 */

public interface MainModelDataSource {
    public void getData(@NonNull MainDataCallBack callBack);

    public interface MainDataCallBack {
        void onSuccess(MainActivityModel data);
    }
}

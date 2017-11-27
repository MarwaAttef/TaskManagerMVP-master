package com.bugzone.mr.taskmanager.data.mainModel.source.locale;

import android.support.annotation.NonNull;

import com.bugzone.mr.taskmanager.data.mainModel.MainActivityModel;
import com.bugzone.mr.taskmanager.data.mainModel.source.MainModelDataSource;
import com.bugzone.mr.taskmanager.data.mainModel.source.remote.MainModelRemoteDataSource;

/**
 * Created by Marwa on 11/27/2017.
 */

public class MainModelLocaleDataSource  implements MainModelDataSource {
    private static MainModelLocaleDataSource INSTANCE;


    public static MainModelLocaleDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainModelLocaleDataSource();
        }
        return INSTANCE;
    }


    @Override
    public void getData(@NonNull MainDataCallBack callBack) {
        MainActivityModel mainActivityModel =new MainActivityModel();
        mainActivityModel.setName("localeData");
        callBack.onSuccess(mainActivityModel);    }
}

package com.bugzone.mr.taskmanager.data.mainModel.source;

import android.support.annotation.NonNull;

import com.bugzone.mr.taskmanager.data.mainModel.MainActivityModel;

/**
 * Created by Marwa on 11/27/2017.
 */

public class MainModelRepository implements MainModelDataSource {


    private static MainModelRepository INSTANCE = null;

    private final MainModelDataSource remoteMainModelDataSource;
    private final MainModelDataSource localeMainModelDataSource;


    // Prevent direct instantiation.
    private MainModelRepository(@NonNull MainModelDataSource remoteMainModelDataSource, @NonNull MainModelDataSource localeMainModelDataSource) {
        this.remoteMainModelDataSource = remoteMainModelDataSource;
        this.localeMainModelDataSource = localeMainModelDataSource;

    }

    public static MainModelRepository getInstance(MainModelDataSource remoteMainModelDataSource, MainModelDataSource localeMainModelDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new MainModelRepository(remoteMainModelDataSource, localeMainModelDataSource);
        }
        return INSTANCE;
    }

    @Override
    public void getData(@NonNull final MainDataCallBack callBack) {
        remoteMainModelDataSource.getData(new MainDataCallBack() {
            @Override
            public void onSuccess(MainActivityModel data) {
                callBack.onSuccess(data);
            }
        });
    }
}

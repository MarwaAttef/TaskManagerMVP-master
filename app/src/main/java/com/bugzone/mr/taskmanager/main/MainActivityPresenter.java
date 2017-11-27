package com.bugzone.mr.taskmanager.main;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;

import com.bugzone.mr.taskmanager.data.mainModel.MainActivityModel;
import com.bugzone.mr.taskmanager.data.mainModel.source.MainModelDataSource;
import com.bugzone.mr.taskmanager.data.mainModel.source.MainModelRepository;
import com.bugzone.mr.taskmanager.second.SecondActivity;

/**
 * Created by Ragabz on 21/11/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter{
    private final MainModelRepository mainModelRepository;
    private final MainActivityContract.View mainView;

    public MainActivityPresenter(@NonNull MainModelRepository mainModelRepository, @NonNull MainActivityContract.View mainView) {
        this.mainModelRepository = mainModelRepository;
        this.mainView = mainView;
        this.mainView.setPresenter(this);
    }

// *********** presenter just connect data layer with view layer by callback *************//
    // ***** mlo4 d3wa el data gaya mnin mn local wla remote **************//
    // el repository hwa el bykrr el data locale or remote//
    // fel code m5lyah ygib mn el remote always//
    @Override
    public void getData() {
        mainModelRepository.getData(new MainModelDataSource.MainDataCallBack() {
            @Override
            public void onSuccess(MainActivityModel data) {
                mainView.setData(data.getName());
            }
        });
    }
}

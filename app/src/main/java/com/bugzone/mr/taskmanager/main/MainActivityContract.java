package com.bugzone.mr.taskmanager.main;

import android.support.annotation.NonNull;

import com.bugzone.mr.taskmanager.BaseView;

/**
 * Created by Ragabz on 21/11/2017.
 */

public interface MainActivityContract {
    interface View  extends BaseView<Presenter> {
        void setData(String string);
    }
    interface Presenter{
        void getData( );
    }
}

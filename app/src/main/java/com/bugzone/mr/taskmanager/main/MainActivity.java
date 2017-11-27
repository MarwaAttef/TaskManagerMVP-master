package com.bugzone.mr.taskmanager.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bugzone.mr.taskmanager.R;
import com.bugzone.mr.taskmanager.data.mainModel.source.MainModelRepository;
import com.bugzone.mr.taskmanager.data.mainModel.source.locale.MainModelLocaleDataSource;
import com.bugzone.mr.taskmanager.data.mainModel.source.remote.MainModelRemoteDataSource;
import com.bugzone.mr.taskmanager.main.MainActivityContract;
import com.bugzone.mr.taskmanager.main.MainActivityPresenter;
import com.bugzone.mr.taskmanager.util.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    private MainActivityPresenter presenter;
    private MainActivityFragment mainActivityFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startFragment();
    }


    protected void startFragment() {
        mainActivityFragment =
                (MainActivityFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (mainActivityFragment == null) {
            // Create the fragment
            mainActivityFragment = MainActivityFragment.newInstance();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), mainActivityFragment, R.id.contentFrame);
            // Create the presenter
            presenter = new MainActivityPresenter(MainModelRepository.getInstance(MainModelRemoteDataSource.getInstance(), MainModelLocaleDataSource.getInstance()), mainActivityFragment);

        } else if (presenter == null) {
            presenter = new MainActivityPresenter(MainModelRepository.getInstance(MainModelRemoteDataSource.getInstance(), MainModelLocaleDataSource.getInstance()), mainActivityFragment);
        }
    }




}

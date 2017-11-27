package com.bugzone.mr.taskmanager.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bugzone.mr.taskmanager.BaseView;
import com.bugzone.mr.taskmanager.R;


public class MainActivityFragment extends Fragment implements MainActivityContract.View {
    private MainActivityContract.Presenter presenter;
    private TextView mTextView;
    private Button mBtton;
    private ProgressBar progressBar;
    private View view;

    public static MainActivityFragment newInstance() {
        return new MainActivityFragment();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);
        initView();
        return view;
    }

    @Override
    public void setPresenter(MainActivityContract.Presenter presenter) {
        if (presenter != null)
            this.presenter = presenter;
    }


    public void initView() {
        mTextView = (TextView) view.findViewById(R.id.textView);
        mBtton = (Button) view.findViewById(R.id.button);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);

        mBtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                presenter.getData();
            }
        });
    }

    @Override
    public void setData(String string) {
        mTextView.setText(string);
    }
}

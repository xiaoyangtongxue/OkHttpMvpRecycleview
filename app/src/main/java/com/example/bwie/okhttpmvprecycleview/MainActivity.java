package com.example.bwie.okhttpmvprecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

import adapter.MyAdapter;
import bean.Bean;
import model.IView;
import presenter.NewsPresenter;

public class MainActivity extends AppCompatActivity implements IView {


    private NewsPresenter newsPresenter;

     MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        newsPresenter=new NewsPresenter();
        newsPresenter.attachView(this);
        Map<String,String>map=new HashMap<>();
        newsPresenter.get("",map,"one", Bean.class);
        adapter=new MyAdapter();

    }

    @Override
    public void onSuccess(String tag, Object o) {

    }

    @Override
    public void onFailed(String tag, Exception e) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        newsPresenter.deleteView();
    }
}

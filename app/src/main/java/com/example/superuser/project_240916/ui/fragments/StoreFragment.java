package com.example.superuser.project_240916.ui.fragments;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.superuser.project_240916.Config;
import com.example.superuser.project_240916.R;
import com.example.superuser.project_240916.model.StoreTest;
import com.example.superuser.project_240916.ui.adapters.StoreAdapter;

import java.util.ArrayList;


/**
 * Created by SuperUser on 24.09.2016.
 */
public class StoreFragment extends Fragment {

    private Context context = getActivity();
    private RecyclerView recycler;
    private ArrayList<StoreTest> stores;
    private StoreAdapter adapter;
    private final String TAG = "myLogs";

    public StoreFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_store, container, false);
        stores = new ArrayList<>();
        Config data = new Config();
        stores = data.getStoreData();
        recycler = (RecyclerView) v.findViewById(R.id.recicler_view_store);
        recycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);
        adapter = new StoreAdapter(context , stores);
        recycler.setAdapter(adapter);
        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

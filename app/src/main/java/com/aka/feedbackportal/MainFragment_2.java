package com.aka.feedbackportal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aksha on 8/26/2015.
 */
public class MainFragment_2 extends Fragment {

    LinearLayoutManager layoutManager;

    public MainFragment_2() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_2, container, false);

        List<RowData> rowListItem = getRowList();
        layoutManager = new LinearLayoutManager(getActivity());

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(), rowListItem);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<RowData> getRowList() {

        List<RowData> currentItem = new ArrayList<RowData>();
        currentItem.add(new RowData("Ali Connors", "Mobile, 53 minutes ago"));
        currentItem.add(new RowData("Jonathan Lee", "Work, 53 minutes ago"));
        currentItem.add(new RowData("Sandra Adams", "United States, 2 days ago"));
        currentItem.add(new RowData("Trever Hansen", "India, 3 days ago"));
        currentItem.add(new RowData("Britta holt", "Dubai, 5 days ago"));
        currentItem.add(new RowData("Ali Connors", "Mobile, 53 minutes ago"));
        currentItem.add(new RowData("Jonathan Lee", "Work, 53 minutes ago"));
        currentItem.add(new RowData("Sandra Adams", "United States, 2 days ago"));
        currentItem.add(new RowData("Trever Hansen", "India, 3 days ago"));
        currentItem.add(new RowData("Britta holt", "Dubai, 5 days ago"));
        currentItem.add(new RowData("Britta holt", "Dubai, 5 days ago"));
        currentItem.add(new RowData("Ali Connors", "Mobile, 53 minutes ago"));
        currentItem.add(new RowData("Jonathan Lee", "Work, 53 minutes ago"));
        currentItem.add(new RowData("Sandra Adams", "United States, 2 days ago"));
        currentItem.add(new RowData("Trever Hansen", "India, 3 days ago"));
        currentItem.add(new RowData("Britta holt", "Dubai, 5 days ago"));
        return currentItem;
    }
}
package com.ifactorinc.imageexercise;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by albertwold on 5/31/16.
 */
public class NewsListAdapter extends ArrayAdapter<NewsItem> {

    public NewsListAdapter(Context context) {
        super(context, R.layout.news_item, R.id.headlineTextView, new NewsItem[]{
                new NewsItem("News Item 1", "Something interesting happened"),
                new NewsItem("News Item 2", "Something else happened")
        });
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        TextView headlineTextView = (TextView) view.findViewById(R.id.headlineTextView);
        TextView summaryTextView = (TextView) view.findViewById(R.id.summaryTextView);
        NewsItem item = getItem(position);
        headlineTextView.setText(item.getHeadline());
        summaryTextView.setText(item.getSummary());
        return view;
    }
}

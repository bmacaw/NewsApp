package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link ArticleAdapter} knows how to create a list item layout for each news article
 * in the data source (a list of {@link Article} objects).
 * Created by Rebecca on 2/10/2017.
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {

    /*
    * Create a new {@link ArticleAdapter} object.
    *
    * @param context of the app
    * @param articles is the list of articles, which is the data source of the adapter
    */
    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of articles
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view(called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the title of the current article
        titleView.setText(currentArticle.getWebTitle());

        // Find the TextView with view ID section_name
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section_name);
        // Display the section name of the article
        sectionView.setText(currentArticle.getSectionName());

        // Return the whole list item layout (containing two TextViews) so that it
        // can be shown in the ListView
        return listItemView;

    }
}

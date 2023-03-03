package com.example.videoreproductor;

import android.view.View;
import android.view.ViewGroup;

public abstract class BaseAdapter {

    /**
     * Returns the number of items in the data set represented by this adapter.
     *
     * @return The number of items in the data set
     */
    public abstract int getCount();

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's data set.
     * @return The data at the specified position
     */
    public abstract Object getItem(int position);

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position
     */
    public abstract long getItemId(int position);

    /**
     * Get a View that displays the data at the specified position in the data set.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible.
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    public abstract View getView(int position, View convertView, ViewGroup parent);

}

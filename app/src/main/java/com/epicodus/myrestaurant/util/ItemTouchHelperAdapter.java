package com.epicodus.myrestaurant.util;

/**
 * Created by Guest on 7/18/16.
 */
public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPostition);
    void onItemDismiss(int position);
}

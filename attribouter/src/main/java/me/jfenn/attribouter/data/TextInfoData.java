package me.jfenn.attribouter.data;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.View;

public class TextInfoData extends InfoData {

    public TextInfoData(XmlResourceParser parser) {
        super(0);
    }

    @Override
    public ViewHolder getViewHolder(View v) {
        return null;
    }

    @Override
    public void bind(Context context, ViewHolder viewHolder) {

    }

}
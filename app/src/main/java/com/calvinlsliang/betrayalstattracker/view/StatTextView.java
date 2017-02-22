package com.calvinlsliang.betrayalstattracker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.calvinlsliang.betrayalstattracker.R;

public class StatTextView extends TextView {

    public StatTextView(Context context) {
        this(context, null);
    }

    public StatTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StatTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void disableStartingStat() {
        setTextColor(getResources().getColor(R.color.gray));
        setEnabled(false);
    }

    public void enableStartingStat() {
        setTextColor(getResources().getColor(R.color.state_selected_color));
        setEnabled(true);
    }

    private void init() {
        setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        setTextSize(getResources().getDimension(R.dimen.stat_text_size));

        final int padding = (int) getResources().getDimension(R.dimen.stat_padding);
        setPadding(padding, padding, padding, padding);
        setBackground(getResources().getDrawable(R.drawable.state_selected_stat));
        setTextColor(getResources().getColor(R.color.gray));
        setEnabled(false);
    }
}

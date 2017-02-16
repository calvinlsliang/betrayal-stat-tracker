package com.calvinlsliang.betrayalstattracker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.calvinlsliang.betrayalstattracker.R;

public class StatPickerLayout extends LinearLayout {

    final static int STATS_LENGTH = 8;

    private int currentPosition;

    private Button minus;
    private Button plus;
    private StatTextView dead;
    private StatTextView health1;
    private StatTextView health2;
    private StatTextView health3;
    private StatTextView health4;
    private StatTextView health5;
    private StatTextView health6;
    private StatTextView health7;
    private StatTextView health8;

    public StatPickerLayout(Context context) {
        this(context, null);
    }

    public StatPickerLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StatPickerLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.stat_picker_layout, this);
        minus = (Button) view.findViewById(R.id.minus);
        plus = (Button) view.findViewById(R.id.plus);
        dead = (StatTextView) view.findViewById(R.id.dead);
        health1 = (StatTextView) view.findViewById(R.id.health1);
        health2 = (StatTextView) view.findViewById(R.id.health2);
        health3 = (StatTextView) view.findViewById(R.id.health3);
        health4 = (StatTextView) view.findViewById(R.id.health4);
        health5 = (StatTextView) view.findViewById(R.id.health5);
        health6 = (StatTextView) view.findViewById(R.id.health6);
        health7 = (StatTextView) view.findViewById(R.id.health7);
        health8 = (StatTextView) view.findViewById(R.id.health8);

        initButtonListeners();

    }

    public void updateStats(String[] stats, int startingPosition) {
        if (stats.length != STATS_LENGTH) {
            return;
        }

        updateText(stats);
        updateEnabled(startingPosition);
    }

    private void updateText(String[] stats) {
        int counter = 0;
        health1.setText(stats[counter++]);
        health2.setText(stats[counter++]);
        health3.setText(stats[counter++]);
        health4.setText(stats[counter++]);
        health5.setText(stats[counter++]);
        health6.setText(stats[counter++]);
        health7.setText(stats[counter++]);
        health8.setText(stats[counter]);
    }

    private void updateEnabled(int startingPosition) {
        currentPosition = startingPosition;

        dead.setEnabled(false);
        health1.setEnabled(false);
        health2.setEnabled(false);
        health3.setEnabled(false);
        health4.setEnabled(false);
        health5.setEnabled(false);
        health6.setEnabled(false);
        health7.setEnabled(false);
        health8.setEnabled(false);

        switch(startingPosition) {
            case 0:
                health1.setEnabled(true);
                break;
            case 1:
                health2.setEnabled(true);
                break;
            case 2:
                health3.setEnabled(true);
                break;
            case 3:
                health4.setEnabled(true);
                break;
            case 4:
                health5.setEnabled(true);
                break;
            case 5:
                health6.setEnabled(true);
                break;
            case 6:
                health7.setEnabled(true);
                break;
            case 7:
                health8.setEnabled(true);
                break;

        }
    }

    private void initButtonListeners() {
        minus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int newPosition = Math.max(currentPosition - 1, 0);
                if (newPosition == currentPosition) {
                    return;
                }

                getStatTextView(currentPosition).setEnabled(false);
                getStatTextView(newPosition).setEnabled(true);

                currentPosition = newPosition;
            }
        });

        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int newPosition = Math.min(currentPosition + 1, STATS_LENGTH);
                if (newPosition == currentPosition) {
                    return;
                }

                getStatTextView(currentPosition).setEnabled(false);
                getStatTextView(newPosition).setEnabled(true);

                currentPosition = newPosition;
            }
        });
    }

    private StatTextView getStatTextView(int currentPosition) {
        switch(currentPosition) {
            case 0:
                return dead;
            case 1:
                return health1;
            case 2:
                return health2;
            case 3:
                return health3;
            case 4:
                return health4;
            case 5:
                return health5;
            case 6:
                return health6;
            case 7:
                return health7;
            case 8:
                return health8;
            default:
                return dead;

        }
    }
}

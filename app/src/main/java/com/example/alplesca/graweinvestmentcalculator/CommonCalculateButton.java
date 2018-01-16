package com.example.alplesca.graweinvestmentcalculator;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;


public class CommonCalculateButton extends ConstraintLayout {
    public CommonCalculateButton(Context context) {
        super(context);
        setUpView(context);
    }

    public CommonCalculateButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUpView(context);
    }

    public CommonCalculateButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setUpView(context);
    }

    public void setUpView(Context context){
        inflate(context, R.layout.common_calculate_button, this);
    }
}

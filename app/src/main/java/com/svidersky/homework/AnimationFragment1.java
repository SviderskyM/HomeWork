package com.svidersky.homework;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.svidersky.homework.R;

public class AnimationFragment1 extends Fragment implements Animation.AnimationListener {

    Animation animRotate;


    public AnimationFragment1(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_animation1, container, false);
        ImageView imgLogo = (ImageView) rootView.findViewById(R.id.imgLogo);

        // load the animation
        animRotate = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.rotate);
        imgLogo.setVisibility(View.VISIBLE);

        // start the animation
        imgLogo.startAnimation(animRotate);
        return rootView;
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
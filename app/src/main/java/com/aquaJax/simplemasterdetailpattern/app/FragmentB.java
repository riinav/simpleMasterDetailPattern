package com.aquaJax.simplemasterdetailpattern.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by riinav on 17/3/14.
 */
public class FragmentB extends Fragment {

    TextView textDescription;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textDescription = (TextView) getActivity().findViewById(R.id.textDescription);
    }

    public void setTextDescription(String description) {
        textDescription.setText(description);
    }
}

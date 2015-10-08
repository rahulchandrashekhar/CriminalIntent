package com.rahulchandrashekhar.criminalintent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.*;
import android.text.*;
import android.widget.EditText;

/**
 * Created by Rahul Chandrashekhar on 10/6/2015.
 */
public class CrimeFragment extends android.support.v4.app.Fragment {
    private Crime mCrime;
    private EditText mTitleField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container, false);
        mTitleField = (EditText) v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { // Intentionally blank
            }


            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mCrime.setTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {  // Intentionally blank
            }
        });
        return v;
    }

}

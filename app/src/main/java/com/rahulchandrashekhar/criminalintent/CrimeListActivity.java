package com.rahulchandrashekhar.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Rahul Chandrashekhar on 10/15/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

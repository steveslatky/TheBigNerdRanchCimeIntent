package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by steve on 5/4/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

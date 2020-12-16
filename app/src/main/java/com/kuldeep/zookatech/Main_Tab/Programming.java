package com.kuldeep.zookatech.Main_Tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kuldeep.zookatech.Programming.Android;
import com.kuldeep.zookatech.Programming.C;
import com.kuldeep.zookatech.Programming.Chash;
import com.kuldeep.zookatech.Programming.Django;
import com.kuldeep.zookatech.Programming.Java;
import com.kuldeep.zookatech.Programming.JavaScript;
import com.kuldeep.zookatech.Programming.PhpAndMySql;
import com.kuldeep.zookatech.Programming.Python;
import com.kuldeep.zookatech.Programming.Swift;
import com.kuldeep.zookatech.Programming.Unity;
import com.kuldeep.zookatech.Programming.VisualStudio;
import com.kuldeep.zookatech.R;

public class Programming extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.nestedtab, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return view;

    }


    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return PhpAndMySql.newInstance(1);
                case 1:
                    return Django.newInstance(4);
                case 2:
                    return C.newInstance(2);
                case 3:
                    return Chash.newInstance(3);
                case 4:
                    return Java.newInstance(5);
                case 5:
                    return JavaScript.newInstance(6);
                case 6:
                    return Android.newInstance(7);
                case 7:
                    return Python.newInstance(8);
                case 8:
                    return Swift.newInstance(9);
                case 9:
                    return Unity.newInstance(10);
                case 10:
                    return VisualStudio.newInstance(11);
                default:
                    return PhpAndMySql.newInstance(12);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 11;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "PHP & MYSQL";
                case 1:
                    return "C";
                case 2:
                    return "C#";
                case 3:
                    return "DJANGO";
                case 4:
                    return "JAVA";
                case 5:
                    return "JAVASCRIPT";
                case 6:
                    return "ANDROID";
                case 7:
                    return "PYTHON";
                case 8:
                    return "SWIFT";
                case 9:
                    return "UNITY";
                case 10:
                    return "VISUAL-STUDIO";
            }

            return null;
        }
    }


}
package com.kuldeep.zookatech.Main_Tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kuldeep.zookatech.Ebook.BCA;
import com.kuldeep.zookatech.Ebook.BTECH;
import com.kuldeep.zookatech.Ebook.MCA;
import com.kuldeep.zookatech.Ebook.MTECH;
import com.kuldeep.zookatech.Project_Tab.Android;
import com.kuldeep.zookatech.Project_Tab.C;
import com.kuldeep.zookatech.Project_Tab.Chash;
import com.kuldeep.zookatech.Project_Tab.Django;
import com.kuldeep.zookatech.Project_Tab.Java;
import com.kuldeep.zookatech.Project_Tab.JavaScript;
import com.kuldeep.zookatech.Project_Tab.PhpAndMySql;
import com.kuldeep.zookatech.Project_Tab.Python;
import com.kuldeep.zookatech.Project_Tab.Swift;
import com.kuldeep.zookatech.Project_Tab.Unity;
import com.kuldeep.zookatech.Project_Tab.VisualStudio;
import com.kuldeep.zookatech.R;

public class Ebook extends Fragment {


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
                    return BCA.newInstance(1);
                case 1:
                    return MCA.newInstance(2);
                case 2:
                    return BTECH.newInstance(3);
                case 3:
                    return MTECH.newInstance(4);
                default:
                    return BCA.newInstance(1);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "BCA";
                case 1:
                    return "MCA";
                case 2:
                    return "B.TECH";
                case 3:
                    return "M.TECH";
            }

            return null;
        }
    }


}
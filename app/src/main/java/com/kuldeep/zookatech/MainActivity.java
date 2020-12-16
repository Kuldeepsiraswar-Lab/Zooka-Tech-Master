package com.kuldeep.zookatech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.kuldeep.zookatech.Main_Tab.Design;
import com.kuldeep.zookatech.Main_Tab.Ebook;
import com.kuldeep.zookatech.Main_Tab.JobsAndIntern;
import com.kuldeep.zookatech.Main_Tab.ModalPaper;
import com.kuldeep.zookatech.Main_Tab.News;
import com.kuldeep.zookatech.Main_Tab.Programming;
import com.kuldeep.zookatech.Main_Tab.Latest;
import com.kuldeep.zookatech.Main_Tab.Projects;
import com.kuldeep.zookatech.Main_Tab.FreeCourse;

public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new Latest();
                case 1:
                    return new Projects();
                case 2:
                    return new FreeCourse();
                case 3:
                    return new JobsAndIntern();
                case 4:
                    return new Programming();
                case 5:
                    return new Ebook();
                case 6:
                    return new ModalPaper();
                case 7:
                    return new News();
                case 8:
                    return new Design();
                default:
                    return new Latest();
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 9;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "TODAY'S POST";
                case 1:
                    return "PROJECTS";
                case 2:
                    return "FREE-COURSE";
                case 3:
                    return "JOBS&INTERN";
                case 4:
                    return "PROG.LANG.";
                case 5:
                    return "EBOOK";
                case 6:
                    return "MODELPAPER";
                case 7:
                    return "NEWS";
                case 8:
                    return "DESIGN";
            }
            return null;
        }
    }
}
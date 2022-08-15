package com.xj.library.base;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author：xujun on 2016/4/28 17:34
 * gdutxiaoxu@163.com
 */
public class BaseFragmentAdapter extends FragmentPagerAdapter {

    protected List<Fragment> fragmentList;

    protected String[] mTitles;

    public void setData(List<Fragment> fragmentList, String[] mTitles){
        this.fragmentList=fragmentList;
        this.mTitles=mTitles;
    }

    public BaseFragmentAdapter(FragmentManager fm) {
        this(fm, null, null);
    }

    public BaseFragmentAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        this(fm, fragmentList, null);
    }

    public BaseFragmentAdapter(FragmentManager fm, List<Fragment> fragmentList, String[] mTitles) {
        super(fm);
        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
        }
        this.fragmentList = fragmentList;

        this.mTitles = mTitles;
    }

    public void add(Fragment fragment) {
        if (isEmpty()) {
            fragmentList = new ArrayList<>();

        }
        fragmentList.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        //        Logger.i("BaseFragmentAdapter position=" +position);
        return isEmpty() ? null : fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return isEmpty() ? 0 : fragmentList.size();
    }

    public boolean isEmpty() {
        return fragmentList == null;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    /*  @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }*/


}

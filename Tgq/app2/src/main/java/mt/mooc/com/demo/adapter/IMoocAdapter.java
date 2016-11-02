package mt.mooc.com.demo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by T-W
 * on 2016/10/31.
 * project mt.mooc.com.demo.adapter
 */

public class IMoocAdapter extends FragmentPagerAdapter {
    protected Context context;
    protected  List<Fragment> fragments;

    public IMoocAdapter(FragmentManager fm,Context context, List<Fragment> fragments) {
        super(fm);
        this.context=context;
        this.fragments=fragments;
    }

    @Override
    public int getCount() {
        return fragments!=null?fragments.size():0;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
}

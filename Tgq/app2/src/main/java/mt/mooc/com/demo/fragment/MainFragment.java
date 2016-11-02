package mt.mooc.com.demo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import mt.mooc.com.demo.R;
import mt.mooc.com.demo.adapter.MenuOptionAdapter;
import mt.mooc.com.demo.util.DataUtil;

/**
 * Created by T-W
 * on 2016/10/31.
 * project mt.mooc.com.demo.fragment
 */

public class MainFragment extends Fragment {



    protected  String menuNames[];
    protected  ViewPager  mViewPagerAd;//adds
    //menu icons
    protected int menuIcons[]={R.mipmap.menu_airport,R.mipmap.menu_hatol,
            R.mipmap.menu_trav,R.mipmap.menu_nearby,
            R.mipmap.menu_ticket,R.mipmap.menu_car,
            R.mipmap.menu_course,R.mipmap.menu_trav};
    //ads
    protected int addIcons[]={R.mipmap.header_pic_ad1,R.mipmap.header_pic_ad2,
            R.mipmap.header_pic_ad1};
    protected RecyclerView mRcycleViewMenu;//menu

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.frament_main,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menuNames=this.getActivity().getResources()
                .getStringArray(R.array.menu_option_name);
        mViewPagerAd= (ViewPager) getView().findViewById(R.id.vpager_ad);
       mViewPagerAd.setAdapter(mPagerAdapter);

        mRcycleViewMenu= (RecyclerView) getView().findViewById(R.id.recycleview_menu_option);
        mRcycleViewMenu.setLayoutManager(new GridLayoutManager(this.getActivity(),4));
        mRcycleViewMenu.setAdapter(new MenuOptionAdapter(getActivity(), DataUtil.getMenuOptions(menuNames,menuIcons)));
    }

    protected PagerAdapter mPagerAdapter=new PagerAdapter() {
        @Override
        public int getCount() {
            return addIcons.length;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

          View itemView=  LayoutInflater.from(getActivity()).inflate(R.layout.item_header_ad,null);
            ImageView  imageView= (ImageView) itemView.findViewById(R.id.img_header_ad);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setBackgroundResource(addIcons[position]);
            container.addView(imageView);
            return itemView;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {

            return view==object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    };


}

package mt.mooc.com.demo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import mt.mooc.com.demo.adapter.IMoocAdapter;
import mt.mooc.com.demo.fragment.FindFragment;
import mt.mooc.com.demo.fragment.MainFragment;
import mt.mooc.com.demo.fragment.MeFragment;

public class MainActivity extends AppCompatActivity {

   //find view
    protected ViewPager mViewPager;
    protected RadioGroup mRgbMenu;

    //init fragment
    protected MainFragment  mMainFragment=new MainFragment();//首页
    protected FindFragment mFindFragment=new FindFragment();//发现
    protected MeFragment mMeFragment=new MeFragment();//我的
    protected List<Fragment> fragments=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager= (ViewPager) this.findViewById(R.id.viewpager);
        mRgbMenu= (RadioGroup) this.findViewById(R.id.rgp);
        //add fragments
        fragments.add(mMainFragment);
        fragments.add(mFindFragment);
        fragments.add(mMeFragment);

        //set adapter
        IMoocAdapter adapter=new IMoocAdapter(getSupportFragmentManager(),this,fragments);
        mViewPager.setAdapter(adapter);


        //register  event
        mViewPager.addOnPageChangeListener(mOnPageChangeListener);
        mRgbMenu.setOnCheckedChangeListener(mOnCheckedChangeListener);
    }
   private ViewPager.OnPageChangeListener mOnPageChangeListener=new ViewPager.OnPageChangeListener() {
       @Override
       public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

       }

       @Override
       public void onPageSelected(int position) {

       }

       @Override
       public void onPageScrollStateChanged(int state) {

       }
   } ;

   private RadioGroup.OnCheckedChangeListener mOnCheckedChangeListener=new RadioGroup.OnCheckedChangeListener() {
       @Override
       public void onCheckedChanged(RadioGroup group, int checkedId) {

       }
   };

}

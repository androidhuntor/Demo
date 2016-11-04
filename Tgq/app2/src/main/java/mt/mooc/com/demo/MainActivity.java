package mt.mooc.com.demo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import mt.mooc.com.demo.adapter.IMoocAdapter;
import mt.mooc.com.demo.fragment.FindFragment;
import mt.mooc.com.demo.fragment.MainFragment;
import mt.mooc.com.demo.fragment.MeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    //init fragment
    protected MainFragment  mMainFragment=new MainFragment();//首页
    protected FindFragment mFindFragment=new FindFragment();//发现
    protected MeFragment mMeFragment=new MeFragment();//我的
    protected List<Fragment> fragments=new ArrayList<>();

    protected LinearLayout mContentMain;
    protected LinearLayout mContentFind;
    protected LinearLayout mContentMe;
    protected TextView mTxtNameMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContentMain= (LinearLayout) this.findViewById(R.id.layout_main);
        mTxtNameMain= (TextView) this.findViewById(R.id.txt_name_main);
        mContentFind= (LinearLayout) this.findViewById(R.id.layout_find);
        mContentMe= (LinearLayout) this.findViewById(R.id.layout_me);
        mContentMain.setOnClickListener(this);
        mContentFind.setOnClickListener(this);
        mContentMe.setOnClickListener(this);
        this.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_content,mMainFragment)
                .add(R.id.container_content,mFindFragment)
                .hide(mFindFragment)
                .add(R.id.container_content,mMeFragment)
                .hide(mMeFragment)
                .commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.layout_main:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(mMainFragment)
                        .hide(mFindFragment)
                        .hide(mMeFragment)
                        .commit();

                break;
            case  R.id.layout_find:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mMainFragment)
                        .show(mFindFragment)
                        .hide(mMeFragment)
                        .commit();
                break;
            case  R.id.layout_me:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mMainFragment)
                        .hide(mFindFragment)
                        .show(mMeFragment)
                        .commit();
                break;
        }
    }
}

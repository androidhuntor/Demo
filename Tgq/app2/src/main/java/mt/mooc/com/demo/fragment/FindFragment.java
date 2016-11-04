package mt.mooc.com.demo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import mt.mooc.com.demo.R;
import mt.mooc.com.demo.adapter.HotInfosAdapter;
import mt.mooc.com.demo.util.DataUtil;

/**
 * Created by T-W
 * on 2016/10/31.
 * project mt.mooc.com.demo.fragment
 */

public class FindFragment extends Fragment {

    protected ListView mLstHotInfos;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_find,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLstHotInfos= (ListView) getView().findViewById(R.id.lst_hot_infos);

        mLstHotInfos.setAdapter(new HotInfosAdapter(getActivity(), DataUtil.getHotInfos()));
    }
}

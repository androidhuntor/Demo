package mt.mooc.com.demo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mt.mooc.com.demo.LoginActivity;
import mt.mooc.com.demo.R;

/**
 * Created by T-W
 * on 2016/10/31.
 * project mt.mooc.com.demo.fragment
 */

public class MeFragment extends Fragment {

    protected Button mBtnLogin;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnLogin= (Button) getView().findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(mOnClickListener);
    }

    private View.OnClickListener mOnClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getActivity(), LoginActivity.class));
        }
    };
}

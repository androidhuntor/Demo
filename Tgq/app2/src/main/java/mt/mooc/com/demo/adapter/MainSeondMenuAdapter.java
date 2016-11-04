package mt.mooc.com.demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mt.mooc.com.demo.R;
import mt.mooc.com.demo.entity.SecondMenu;

/**
 * Created by John on 2016/11/3.
 */
public class MainSeondMenuAdapter extends BaseAdapter{

    Context context;
    List<SecondMenu> secondMenus;
    public MainSeondMenuAdapter(Context context, List<SecondMenu> secondMenus){
        this.context=context;
        this.secondMenus=secondMenus;
    }
    @Override
    public int getCount() {
        return secondMenus.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        SecondMenu  secondMenu=secondMenus.get(i);
       View itemView=LayoutInflater.from(context).inflate(R.layout.item_main_second_menu,null);
        ImageView imgIcon= (ImageView) itemView.findViewById(R.id.img_icon);
        TextView txtName= (TextView) itemView.findViewById(R.id.txt_second_name);
        imgIcon.setImageResource(secondMenu.iconId);
        txtName.setText(secondMenu.name);
        return itemView;
    }
}

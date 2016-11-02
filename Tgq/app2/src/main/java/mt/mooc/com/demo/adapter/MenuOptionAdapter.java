package mt.mooc.com.demo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mt.mooc.com.demo.R;
import mt.mooc.com.demo.entity.Menu;

/**
 * Created by T-W
 * on 2016/11/1.
 * project mt.mooc.com.demo.adapter
 */

public class MenuOptionAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    protected Context mContext;
    protected List<Menu> menus;
    public  MenuOptionAdapter(Context context, List<Menu> menus){
        mContext=context;
        this.menus=menus;
    }
    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MenuViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_menu_option,null));
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        holder.mImgMenuIcon.setImageResource(menus.get(position).menuIcon);
        holder.mTxtMenuName.setText(menus.get(position).menuName);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
    class MenuViewHolder extends RecyclerView.ViewHolder{


        ImageView  mImgMenuIcon;
        TextView mTxtMenuName;
        public MenuViewHolder(View itemView) {
            super(itemView);
            mImgMenuIcon= (ImageView) itemView.findViewById(R.id.img_menu_icon);
            mTxtMenuName= (TextView) itemView.findViewById(R.id.txt_menu_name);
        }
    }




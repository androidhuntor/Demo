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
import mt.mooc.com.demo.entity.HotInfo;

/**
 * Created by John on 2016/11/3.
 */
public class HotInfosAdapter extends BaseAdapter{
    private Context mContext;
    private  List<HotInfo> hotInfos;
    public  HotInfosAdapter(Context context,List<HotInfo> hotInfos){
        this.mContext=context;
       this. hotInfos=hotInfos;
    }
    @Override
    public int getCount() {
        return hotInfos.size();
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

       View itemView= LayoutInflater.from(mContext).inflate(R.layout.item_find_hot_info,null);
        TextView txtHotContent= (TextView) itemView.findViewById(R.id.txt_hot_content);
        TextView txtHotFrom= (TextView) itemView.findViewById(R.id.txt_hot_from);
        TextView txtHotFollow= (TextView) itemView.findViewById(R.id.txt_hot_follow);
        TextView txtHotPraise= (TextView) itemView.findViewById(R.id.txt_hot_praise);
        ImageView imgHotPic= (ImageView) itemView.findViewById(R.id.img_hot_pic);


       HotInfo  hotInfo= hotInfos.get(i);
        txtHotContent.setText(hotInfo.content);
        txtHotFrom.setText(hotInfo.from+"");
        txtHotFollow.setText(hotInfo.follow+"");
        txtHotPraise.setText(hotInfo.praise+"");
        imgHotPic.setImageResource(hotInfo.iconId);
        return itemView;
    }
}

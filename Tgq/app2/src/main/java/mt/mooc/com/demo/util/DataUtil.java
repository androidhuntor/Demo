package mt.mooc.com.demo.util;

import java.util.ArrayList;
import java.util.List;

import mt.mooc.com.demo.R;
import mt.mooc.com.demo.entity.HotInfo;
import mt.mooc.com.demo.entity.Menu;
import mt.mooc.com.demo.entity.SecondMenu;

/**
 * Created by T-W
 * on 2016/11/1.
 * project mt.mooc.com.demo.util
 */

public class DataUtil {

    /**
     * menu datas
     * @param menuNames
     * @param icons
     * @return
     */
    public static List<Menu> getMenuOptions(String menuNames[],int icons[]){
        List<Menu>  menus=new ArrayList<>();

        for (int i = 0; i <menuNames.length ; i++) {
            menus.add(new Menu(icons[i],menuNames[i]));
        }
        return  menus;
    }

    public static List<HotInfo> getHotInfos() {

        List<HotInfo> hotInfos=new ArrayList<>();
        HotInfo  info=new HotInfo("从东莞去广州仅需半个小时","来源：羊城攻略",R.mipmap.find_hot_city,10526,23);
        hotInfos.add(info);
        HotInfo  info2=new HotInfo("旅行前最最应该准备的10件事情","来源：冬夏旅游",R.mipmap.find_hot_home,10002,15);
        hotInfos.add(info2);
        HotInfo  info3=new HotInfo("北京周边尽然藏着20多个绝美仙境","来源：北京攻略",R.mipmap.find_hot_jiangnan,10006,10);
        hotInfos.add(info3);
        return hotInfos;

    }

    /**
     *
     * @param ids
     * @param names
     * @return
     */
    public static List<SecondMenu>  getSecondMenus(int [] ids,String names[]){
        List<SecondMenu> secondMenus=new ArrayList<>();

        for (int i = 0; i <ids.length ; i++) {
            SecondMenu  second=new SecondMenu(ids[i],names[i]);
            secondMenus.add(second);
        }
        return secondMenus;
    }
  }

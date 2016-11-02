package mt.mooc.com.demo.util;

import java.util.ArrayList;
import java.util.List;

import mt.mooc.com.demo.entity.Menu;

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

    public static int[] getHeaderAds(int icons[]) {
        return null;

    }
    }

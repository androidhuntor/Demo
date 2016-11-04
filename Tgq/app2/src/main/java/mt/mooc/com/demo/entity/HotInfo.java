package mt.mooc.com.demo.entity;

/**
 * Created by John on 2016/11/3.
 */
public class HotInfo {

    public String  content;
    public String from;
    public  int iconId;
    public  int follow;
    public int praise;

    public HotInfo(String content, String from, int iconId, int follow, int praise) {
        this.content = content;
        this.from = from;
        this.iconId = iconId;
        this.follow = follow;
        this.praise = praise;
    }
}

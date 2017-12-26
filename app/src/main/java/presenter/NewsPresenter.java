package presenter;

import java.util.Map;

import model.CallBack;
import model.IView;
import utils.HttpUtils;

/**
 * Created by Administrator on 2017/12/26.
 */

public class NewsPresenter {

         private IView inv;
    public void attachView(IView inv){
        this.inv=inv;
    }
    public void get(String url, Map<String,String>map,String tag,Class cla){
        HttpUtils.getInstance().get(url, map, new CallBack() {
            @Override
            public void onSuccess(String tag, Object o) {
                if(o!=null){
                    inv.onSuccess(tag,o);
                }
            }

            @Override
            public void onFailed(String tag, Exception e) {
                inv.onFailed(tag,e);
            }
        },cla,tag);
    }

    public void  deleteView(){
        if(inv!=null){
            inv=null;
        }
    }
}

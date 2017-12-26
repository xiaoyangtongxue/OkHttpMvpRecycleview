package utils;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2017/12/26.
 */
public class GsonUtils {

       private static Gson gson;
    public static Gson getInstance(){
        if(gson==null){
            gson=new Gson();
        }
        return  gson;
    }


}

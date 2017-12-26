package model;

/**
 * Created by Administrator on 2017/12/26.
 */

public interface IView {

    void onSuccess(String tag, Object o);

    void onFailed(String tag, Exception e);
}

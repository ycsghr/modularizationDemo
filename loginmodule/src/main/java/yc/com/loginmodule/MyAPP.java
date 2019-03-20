package yc.com.loginmodule;

import android.app.Application;

import yc.com.common.InitApplicationImp;

/**
 * Created by 5C_R&D on 2019/3/20.
 *
 * @author yc
 */

public class MyAPP extends Application implements InitApplicationImp {
    private static Application application;
    public static Application getInstance(){
        return application;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    @Override
    public void init(Application app) {
        application=app;
    }
}

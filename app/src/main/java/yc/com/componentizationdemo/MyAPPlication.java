package yc.com.componentizationdemo;

import android.app.Application;

import yc.com.common.InitApplicationImp;

/**
 * Created by 5C_R&D on 2019/3/20.
 *
 * @author yc
 */

public class MyAPPlication extends Application  implements InitApplicationImp {
    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }


    @Override
    public void init(Application application) {
        try {
            Class<?> aClass = Class.forName("yc.com.loginmodule.MyApp");
            Object o = aClass.newInstance();
            if (o instanceof InitApplicationImp){
                ((InitApplicationImp)o).init(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

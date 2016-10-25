//记得添加包名

import android.content.Context;
import android.content.Intent;

/**
 * Created by nesger.zhan on 2016/10/25.
 */
public class ActivityUtil {
    /**
     * 启动Activity
     * @param context  原启动上下文
     * @param dstClass 目标Activity
     */
    public static void startActivity(Context context,Class dstClass){
        startActivity(context,new Intent(context,dstClass));
    }

    /**
     * 启动Activity
     * @param context 原启动上下文
     * @param intent  目标意图
     */
    public static void startActivity(Context context,Intent intent){
        context.startActivity(intent);
    }
}

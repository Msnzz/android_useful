# android_useful
    自己记录一些android有用的东西

尺寸说明：

    Android系统使用**mdpi**即密度值为160的屏幕作为标准,在这个屏幕上**1px=1dp**.  
    各个分辨率直接的换算比例为_ldpi:mdpi:hdpi:xhdpi:xxhdpi=3:4:6:8:12_  
    换算比例可以通过context.getResources().getDisplayMetrics().density获得。  
    
判断系统是否允许应用显示通知：  
_NotificationManagerCompat.from(this).areNotificationsEnabled()_  
true表示允许,false表示不允许  


    
工具类:  
[util](https://github.com/nesger/android_useful/tree/master/util)  
Activity相关的工具类：   
[ActivityUtil.java](https://github.com/nesger/android_useful/blob/master/util/ActivityUtil.java)  
尺寸相关的工具类：  
    [DisplayUtil.java](https://github.com/nesger/android_useful/blob/master/util/DisplayUtil.java)  
ViewHolder模式超简洁写法：  
    [ViewHolder模式超简洁写法](https://github.com/nesger/android_useful/blob/master/util/ViewHolder.java)  
单例模式4种写法：  
    [单例模式4种写法](https://github.com/nesger/android_useful/tree/master/singleton)

get method caller stack
StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace()

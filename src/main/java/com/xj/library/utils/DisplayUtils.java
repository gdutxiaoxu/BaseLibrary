package com.xj.library.utils;

import android.content.Context;
import android.util.DisplayMetrics;

public class DisplayUtils {

    private static final String XIAOMI_FULLSCREEN_GESTURE = "force_fsg_nav_bar";

    public static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static float getFontDensity(Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static int dp2px(Context context, float dp) {
        return (int) (getDensity(context) * dp + 0.5);
    }

    public static int sp2px(Context context, float sp) {
        return (int) (getFontDensity(context) * sp + 0.5);
    }

    public static int px2dp(Context context, float px) {
        return (int) (px / getDensity(context) + 0.5);
    }

    public static int px2sp(Context context, float px) {
        return (int) (px / getFontDensity(context) + 0.5);
    }

    public static int getScreenWidth(Context context) {
        return getDisplayMetrics(context).widthPixels;
    }

    public static int getScreenHeight(Context context) {
        int screenHeight = getDisplayMetrics(context).heightPixels;
        return screenHeight;
    }

}

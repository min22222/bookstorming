package edu.sungshin.bookstorming;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class ThemeUtil extends AppCompatActivity {
    public static final String LIGHT_MODE = "light";
    public static final String DARK_MODE = "dark";
    public static final String DEFAULT_MODE = "default";
    private static final String TAG = "ThemeUtil";

    public static void applyTheme(String themeColor) {
        switch (themeColor) {
            case LIGHT_MODE:
                Log.d(TAG, "라이트 모드 적용");
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case DARK_MODE:
                Log.d(TAG, "다크 모드 적용");
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
//변경
            default:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                break;
        }
    }

    public static void modSave(Context context, String select_mod) {
        SharedPreferences sp;
        sp = context.getSharedPreferences("mod", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("mod", select_mod);
        editor.commit();
    }
}

    //public static String modLoad (Context context) {
    //SharedPreferences sp;
    //sp = context.getSharedPreferences("mod", context.MODE_PRIVATE);
    //String load_mod = sp.getString("mod", "light");
    //return load_mod;
    //}



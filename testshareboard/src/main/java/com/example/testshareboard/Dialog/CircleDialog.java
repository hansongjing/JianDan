package com.example.testshareboard.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by hanhansongjiang on 16/4/20.
 */
public class CircleDialog extends  Dialog{

    private static int default_width=160;
    private static int defulat_heigth=120;

    public  CircleDialog(Context context, View layout,int style){
        super(context, style);
        setContentView(layout);
        Window window = getWindow();
        WindowManager wm = (WindowManager) getContext()
                .getSystemService(Context.WINDOW_SERVICE);

        WindowManager.LayoutParams params = window.getAttributes();
        params.height= (int) (wm.getDefaultDisplay().getHeight()*0.35);
        params.width= (int) (wm.getDefaultDisplay().getWidth()*0.65);
        params.gravity = Gravity.CENTER;
        window.setAttributes(params);

    }





}







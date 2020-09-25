package com.aof.mcinabox.launcher.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.aof.mcinabox.MainActivity;
import com.aof.mcinabox.R;

public class ContributorsDialog extends Dialog {

    public ContributorsDialog(Context context){
        super(context);
        setContentView(R.layout.dialog_contributors);
        setCanceledOnTouchOutside(true);
    }
}

package jsondroid.android.com.pushdemo01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by wenbaohe on 2018/8/9.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"已启动！！！！",Toast.LENGTH_SHORT).show();

        Intent i = new Intent(context, MainActivity.class);
        // To put activity on the top of the stack since activity is launched from context outside activity
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        // EDITED
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        context.startActivity(i);
    }
}

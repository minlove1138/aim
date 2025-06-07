
package com.kangmin.aimassist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("강민님 전용 오프라인 테스트앱입니다!");
        setContentView(tv);
    }
}

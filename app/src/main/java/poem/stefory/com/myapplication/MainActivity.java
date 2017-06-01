package poem.stefory.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

/**
 * @author stefory
 */
public class MainActivity extends SwipeBackActivity implements View.OnClickListener {

    private SwipeBackLayout mSwipeBackLayout;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwipeBackLayout = getSwipeBackLayout();
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
        setSwipeBackEnable(false); //首页禁止滑动删除
        mSwipeBackLayout.setEdgeSize(480);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn){
            startActivity(new Intent(this, TestActivity1.class));
        }
    }
}

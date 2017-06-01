package poem.stefory.com.myapplication;

import android.os.Bundle;

import me.imid.swipebacklayout.lib.SwipeBackLayout;

/**
 * @Description
 * @Author stefory
 * @Date 2015/6/12 11:43.
 */
public class TestActivity2 extends BaseActivity {

    private SwipeBackLayout mSwipeBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        mSwipeBackLayout = getSwipeBackLayout();
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
    }
}

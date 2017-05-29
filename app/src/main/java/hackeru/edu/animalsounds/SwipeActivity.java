package hackeru.edu.animalsounds;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SwipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        //setAdapter:
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    class MyPagerAdapter extends FragmentStatePagerAdapter{

        //Constructor:
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        //get Fragment by position
        @Override
        public Fragment getItem(int position) {
            if (position == 0 )
                return new RedFragment();
            else if (position == 1)
                return new Fragment();
            return null;
        }
        @Override
        public int getCount() {
            return 2;
        }
    }
}

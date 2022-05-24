package s.d.morningbatchproject.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

import s.d.morningbatchproject.R;

public class ImageContainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_contain);
        viewPager2 = findViewById(R.id.viewpager2_new);
        List<SliderItems> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItems(R.drawable.ic_home));
        sliderItems.add(new SliderItems(R.drawable.ic_login));
        sliderItems.add(new SliderItems(R.drawable.ic_logout));
        sliderItems.add(new SliderItems(R.drawable.ic_payment));
        sliderItems.add(new SliderItems(R.drawable.ic_product));
        sliderItems.add(new SliderItems(R.drawable.ic_profile));

        viewPager2.setAdapter(new SliderImageAdapter(sliderItems,viewPager2));

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 2000);





            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });







    }


    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };
}
package s.d.morningbatchproject.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import s.d.morningbatchproject.R;

public class ImageContainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
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

        imageView1=findViewById(R.id.image1);
        imageView2=findViewById(R.id.image2);
        imageView3=findViewById(R.id.image3);
        imageView4=findViewById(R.id.image4);
        imageView5=findViewById(R.id.image5);
        imageView6=findViewById(R.id.image6);



        viewPager2.setAdapter(new SliderImageAdapter(sliderItems,viewPager2));

        imageView1.setImageResource(R.drawable.selectedimage);
        imageView2.setImageResource(R.drawable.unselectedimage);
        imageView3.setImageResource(R.drawable.unselectedimage);
        imageView4.setImageResource(R.drawable.unselectedimage);
        imageView5.setImageResource(R.drawable.unselectedimage);
        imageView6.setImageResource(R.drawable.unselectedimage);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if(position==0)
                {
                    imageView1.setImageResource(R.drawable.selectedimage);
                    imageView2.setImageResource(R.drawable.unselectedimage);
                    imageView3.setImageResource(R.drawable.unselectedimage);
                    imageView4.setImageResource(R.drawable.unselectedimage);
                    imageView5.setImageResource(R.drawable.unselectedimage);
                    imageView6.setImageResource(R.drawable.unselectedimage);
                }
                else if (position==1)
                {
                    imageView1.setImageResource(R.drawable.unselectedimage);
                    imageView2.setImageResource(R.drawable.selectedimage);
                    imageView3.setImageResource(R.drawable.unselectedimage);
                    imageView4.setImageResource(R.drawable.unselectedimage);
                    imageView5.setImageResource(R.drawable.unselectedimage);
                    imageView6.setImageResource(R.drawable.unselectedimage);
                }
                else if (position==2)
                {
                    imageView1.setImageResource(R.drawable.unselectedimage);
                    imageView2.setImageResource(R.drawable.unselectedimage);
                    imageView3.setImageResource(R.drawable.selectedimage);
                    imageView4.setImageResource(R.drawable.unselectedimage);
                    imageView5.setImageResource(R.drawable.unselectedimage);
                    imageView6.setImageResource(R.drawable.unselectedimage);
                }
                else if (position==3)
                {
                    imageView1.setImageResource(R.drawable.unselectedimage);
                    imageView2.setImageResource(R.drawable.unselectedimage);
                    imageView3.setImageResource(R.drawable.unselectedimage);
                    imageView4.setImageResource(R.drawable.selectedimage);
                    imageView5.setImageResource(R.drawable.unselectedimage);
                    imageView6.setImageResource(R.drawable.unselectedimage);
                }
                else if (position==4)
                {
                    imageView1.setImageResource(R.drawable.unselectedimage);
                    imageView2.setImageResource(R.drawable.unselectedimage);
                    imageView3.setImageResource(R.drawable.unselectedimage);
                    imageView4.setImageResource(R.drawable.unselectedimage);
                    imageView5.setImageResource(R.drawable.unselectedimage);
                    imageView6.setImageResource(R.drawable.selectedimage);
                }
                else if (position==5)
                {
                    imageView1.setImageResource(R.drawable.selectedimage);
                    imageView2.setImageResource(R.drawable.unselectedimage);
                    imageView3.setImageResource(R.drawable.unselectedimage);
                    imageView4.setImageResource(R.drawable.unselectedimage);
                    imageView5.setImageResource(R.drawable.unselectedimage);
                    imageView6.setImageResource(R.drawable.unselectedimage);
                }
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
package s.d.morningbatchproject.imageslider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import s.d.morningbatchproject.R;

public class SliderImageAdapter extends RecyclerView.Adapter<SliderImageAdapter.SliderViewHolder> {
    private List<SliderItems> sliderItems;
    private ViewPager2 viewPager2;

    public SliderImageAdapter(List<SliderItems> sliderItems, ViewPager2 viewPager2) {
        this.sliderItems = sliderItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderImageAdapter.SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.activity_slider_image_adapter, parent, false
                ) );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderImageAdapter.SliderViewHolder holder, int position) {

        holder.setImage(sliderItems.get(position));
        if (position == sliderItems.size()- 1){
            viewPager2.post(new Runnable() {
                @Override
                public void run() {

                    sliderItems.addAll(sliderItems);
                    notifyDataSetChanged();



                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return sliderItems.size();
    }

    public class SliderViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.slider_imageview);
        }

        public void setImage(SliderItems sliderItems) {
            imageView.setImageResource(sliderItems.getImage());
        }
    }
}
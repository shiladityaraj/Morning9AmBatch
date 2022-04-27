package s.d.morningbatchproject.Adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import s.d.morningbatchproject.Fragment.HomeFragment;
import s.d.morningbatchproject.Fragment.ProfileFragment;
import s.d.morningbatchproject.R;

public class NavAdapter extends RecyclerView.Adapter<NavAdapter.ViewHolder> {
    String str[]={"Home","Profile","Product","Payment","Login","Logout"};
    Integer img[]={R.drawable.ic_home,R.drawable.ic_profile,R.drawable.ic_product,R.drawable.ic_payment,R.drawable.ic_login,R.drawable.ic_logout};

    Context context;
    DrawerLayout drawerLayout;

    public NavAdapter(Context context, DrawerLayout drawerLayout) {
        this.context = context;
        this.drawerLayout = drawerLayout;
    }

    @NonNull
    @Override
    public NavAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_nav_adapter,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NavAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(img[position]);
        holder.tv.setText(str[position]);


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (holder.getAdapterPosition()==0)
                {
                    ((FragmentActivity)context).
                            getSupportFragmentManager().
                            beginTransaction().
                            replace(R.id.mainlayout,
                                    new HomeFragment()).
                            commit();

                    drawerLayout.closeDrawers();

                }

                else if (holder.getAdapterPosition()==1)
                {
                    ((FragmentActivity)context).
                            getSupportFragmentManager().
                            beginTransaction().
                            replace(R.id.mainlayout,
                                    new ProfileFragment()).
                            commit();
                    drawerLayout.closeDrawers();

                }





            }
        });

    }

    @Override
    public int getItemCount() {
        return str.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tv;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.nav_imageview);
            tv=itemView.findViewById(R.id.nav_textview);
            cardView=itemView.findViewById(R.id.nav_card);
        }
    }
}
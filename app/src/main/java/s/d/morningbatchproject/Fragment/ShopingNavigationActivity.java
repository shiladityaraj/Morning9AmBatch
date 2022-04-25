package s.d.morningbatchproject.Fragment;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import s.d.morningbatchproject.Adapter.NavAdapter;
import s.d.morningbatchproject.R;
import s.d.morningbatchproject.databinding.ActivityShopingNavigationBinding;

public class ShopingNavigationActivity extends AppCompatActivity {

//    String str[]={"Home","Profile","Product","Payment","Login","Logout"};
    RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping_navigation);

        DrawerLayout drawerLayout=findViewById(R.id.drawer_layout);
        Toolbar toolbar=findViewById(R.id.toolbar);

        ActionBarDrawerToggle  actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        actionBarDrawerToggle.syncState();
        RecyclerView mRecyclerView=findViewById(R.id.nav_recyclerview);
        mLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(new NavAdapter(ShopingNavigationActivity.this));






//        ListView listView=findViewById(R.id.mylist);
//        ArrayAdapter<String> ad=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,str);
//        listView.setAdapter(ad);


//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
//
//                if (pos==0)
//                {
//                    FragmentManager fm=getSupportFragmentManager();
//                    FragmentTransaction ft=fm.beginTransaction();
//                    HomeFragment homeFragment=new HomeFragment();
//                    ft.replace(R.id.mainlayout,homeFragment);
//                    ft.commit();
//                    //for closing drawer
//                    drawerLayout.closeDrawers();
//
//
//                }
//                else if (pos==1)
//                {
//                    FragmentManager fm=getSupportFragmentManager();
//                    FragmentTransaction ft=fm.beginTransaction();
//                    ProfileFragment profileFragment=new ProfileFragment();
//                    ft.replace(R.id.mainlayout,profileFragment);
//                    ft.commit();
//                    drawerLayout.closeDrawers();
//
//                }
//
//            }
//        });
    }




}
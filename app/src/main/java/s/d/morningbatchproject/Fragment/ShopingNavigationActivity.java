package s.d.morningbatchproject.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
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
import s.d.morningbatchproject.activity.MainActivity;
import s.d.morningbatchproject.activity.SecondActivity;
import s.d.morningbatchproject.databinding.ActivityShopingNavigationBinding;

public class ShopingNavigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

//    String str[]={"Home","Profile","Product","Payment","Login","Logout"};
    RecyclerView.LayoutManager mLayoutManager;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping_navigation);

        drawerLayout=findViewById(R.id.drawer_layout);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle  actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        actionBarDrawerToggle.syncState();
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);









//        RecyclerView mRecyclerView=findViewById(R.id.nav_recyclerview);
//        mLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        mRecyclerView.setAdapter(new NavAdapter(ShopingNavigationActivity.this,drawerLayout));






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






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.home:
                Toast.makeText(this, "HOME", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(this, "Setings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.update:
                Intent i=new Intent(ShopingNavigationActivity.this, SecondActivity.class);
                startActivity(i);


        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.home:
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.mainlayout, new HomeFragment());
                ft.commit();
                drawerLayout.closeDrawers();

                break;
            case R.id.settings:
                FragmentManager fm1=getSupportFragmentManager();
                FragmentTransaction ft1=fm1.beginTransaction();
                ft1.replace(R.id.mainlayout, new ProfileFragment());
                ft1.commit();
                drawerLayout.closeDrawers();
                break;
        }

        return false;
    }
}
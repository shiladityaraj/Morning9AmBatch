package s.d.morningbatchproject.Fragment;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import s.d.morningbatchproject.R;
import s.d.morningbatchproject.databinding.ActivityShopingNavigationBinding;

public class ShopingNavigationActivity extends AppCompatActivity {

    String str[]={"Home","Profile","Product","Payment","Login","Logout"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping_navigation);

        DrawerLayout drawerLayout=findViewById(R.id.drawer_layout);
        Toolbar toolbar=findViewById(R.id.toolbar);

        ActionBarDrawerToggle  actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        actionBarDrawerToggle.syncState();
        ListView listView=findViewById(R.id.mylist);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,str);
        listView.setAdapter(ad);
    }




}
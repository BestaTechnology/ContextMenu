package voice_to_text.sandy148101.com.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView)findViewById(R.id.textView);
        registerForContextMenu(textView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.my_context_menu,menu);

    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId())
        {


            case  R.id.java:
                Toast.makeText(getApplicationContext(),"Java is selected", Toast.LENGTH_SHORT).show();


            case  R.id.oops:
                Toast.makeText(getApplicationContext(),"Oops is selected", Toast.LENGTH_SHORT).show();

                default:

             return super.onContextItemSelected(item);
        }
    }
}

package androidsqlite.com.toolbarandradiobutton;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title);
        getSupportActionBar().setSubtitle(R.string.subtitle);
        getSupportActionBar().setIcon(R.drawable.ic_action_toolbar);

        text_result=(TextView)findViewById(R.id.text_result_xml);
        text_result.setEnabled(false);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu1:
                Toast.makeText(getApplicationContext(),"First position",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Toast.makeText(getApplicationContext(),"Second position",Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu3:
                Toast.makeText(getApplicationContext(),"Third position",Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu4:
                Toast.makeText(getApplicationContext(),"Fourth position",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu5:
                Toast.makeText(getApplicationContext(),"Fifth position",Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu6:
                Toast.makeText(getApplicationContext(),"Six position",Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }



    public void selectitem(View myview){

        boolean checked=((RadioButton) myview).isChecked();
        switch (myview.getId()){

            case R.id.fruit_apple:

                if (checked){
                    text_result.setEnabled(true);
                    text_result.setText("You select Apple");
                  //  Toast.makeText(getApplicationContext(),"Apple",Toast.LENGTH_SHORT).show();

      //custom Alert dialog start from here

                    AlertDialog.Builder mydialog=new AlertDialog.Builder(MainActivity.this);

                    LayoutInflater myinflater=LayoutInflater.from(MainActivity.this);

                    View myviewl=myinflater.inflate(R.layout.custom,null);

                    mydialog.setView(myviewl);

                    final AlertDialog builder=mydialog.create();

                    builder.setCancelable(false);

                    Button btndialog=(Button)myviewl.findViewById(R.id.oki_button_xml);

                    btndialog.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_SHORT).show();

                            builder.dismiss();

                        }
                    });
                    builder.show();



     //custom alert dialog end from here



                }

                else {
                    text_result.setEnabled(false);
                }
                break;

            case R.id.fruit_banan:

                if (checked)
                {
                    text_result.setEnabled(true);
                    text_result.setText("You select banana");
                    Toast.makeText(getApplicationContext(),"Banan",Toast.LENGTH_SHORT).show();

                }

                else
                {
                    text_result.setEnabled(false);
                }
                break;

            case R.id.grapsh:

                if (checked)
                {
                    text_result.setEnabled(true);
                    text_result.setText("You select grapsh");
                    Toast.makeText(getApplicationContext(),"Grapsh",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    text_result.setEnabled(false);
                }
                break;

            case R.id.lichi:

                if (checked)
                {
                    text_result.setEnabled(true);
                    text_result.setText("You select lichi");
                    Toast.makeText(getApplicationContext(),"Lichi",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    text_result.setEnabled(false);
                }
                break;


        }


    }


    @Override
    public void onBackPressed() {


        AlertDialog.Builder myexitdiaolg=new AlertDialog.Builder(MainActivity.this);

        LayoutInflater inflate=LayoutInflater.from(MainActivity.this);

        View myexitview=inflate.inflate(R.layout.exit_layout,null);

        myexitdiaolg.setView(myexitview);

        final AlertDialog builder=myexitdiaolg.create();

        builder.setCancelable(false);

        Button btnno=(Button)myexitview.findViewById(R.id.button_no);

        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.cancel();
            }
        });


        Button btnyes=(Button)myexitview.findViewById(R.id.button_yes);

        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(getApplicationContext(),"You successfully exit",Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();



    }

}

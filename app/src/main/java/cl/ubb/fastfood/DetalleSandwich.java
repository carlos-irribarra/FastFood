package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetalleSandwich extends AppCompatActivity {
    TextView var;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_sandwich);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Sandwich BarrosLuco = (Sandwich) getIntent().getSerializableExtra("sandwich");
        Sandwich Lomito = (Sandwich) getIntent().getSerializableExtra("sandwich2");
        Sandwich Mechada = (Sandwich) getIntent().getSerializableExtra("sandwich3");
        Sandwich Churrasco = (Sandwich) getIntent().getSerializableExtra("sandwich4");
        Sandwich Chacarero = (Sandwich) getIntent().getSerializableExtra("sandwich5");


        TextView textView = findViewById(R.id.textView);

        Resources res = getResources();
        int resID = res.getIdentifier("barros", "drawable", getPackageName());
        if(BarrosLuco!=null){

                textView.setText(
                        BarrosLuco.nombre + "\n"
                        + BarrosLuco.descripcion + "\n"
                        + BarrosLuco.precio
                );
        }
        if(Lomito!=null){

            textView.setText(
                    Lomito.nombre + "\n"
                            + Lomito.descripcion + "\n"
                            + Lomito.precio
            );
        }
        if(Mechada!=null){
            textView.setText(
                    Mechada.nombre + "\n"
                            + Mechada.descripcion + "\n"
                            + Mechada.precio
            );
        }
        if(Churrasco!=null){
            textView.setText(
                    Churrasco.nombre + "\n"
                            + Churrasco.descripcion + "\n"
                            + Churrasco.precio
            );
        }
        if(Chacarero!=null){
            textView.setText(
                    Chacarero.nombre + "\n"
                            + Chacarero.descripcion + "\n"
                            + Chacarero.precio
            );
        }














    }




}

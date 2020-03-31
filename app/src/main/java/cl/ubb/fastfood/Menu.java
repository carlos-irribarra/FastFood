package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends AppCompatActivity{

    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), DetalleSandwich.class);

                Sandwich BarrosLuco = new Sandwich("Barros Luco", "Contiene 400 grs. de lomo en láminas, 4 láminas de queso mantecoso, mantequilla, sal, 2 panes marraqueta", "5000", R.drawable.barros);
                intent3.putExtra("sandwich", BarrosLuco);
                startActivity(intent3);

            }

        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), DetalleSandwich.class);

                Sandwich Lomito = new Sandwich("Lomito", "Contiene 200 grs. de lomito, Mayonesa, sal, 2 panes marraqueta", "4000", R.drawable.barros);
                intent4.putExtra("sandwich2", Lomito);
                startActivity(intent4);
            }

        });

        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(), DetalleSandwich.class);

                Sandwich Mechada = new Sandwich("Mechada", "Contiene 150 grs. de carne, Mayonesa, sal, palta, tomate, 2 panes marraqueta", "5000", R.drawable.barros);
                intent5.putExtra("sandwich3", Mechada);
                startActivity(intent5);

            }

        });

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getApplicationContext(), DetalleSandwich.class);

                Sandwich Churrasco = new Sandwich("Churrasco Italiano", "400 grs. de bistec de posta (en láminas), Mayonesa, sal, palta, tomate, 2 panes marraqueta", "6000", R.drawable.barros);
                intent6.putExtra("sandwich4", Churrasco);
                startActivity(intent6);

            }

        });

        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(getApplicationContext(), DetalleSandwich.class);

                Sandwich Chacarero = new Sandwich("Chacarero", "Contiene Carne para churrasco cortada muy delgada, Porotos verdes, aji verde, mayonesa", "3500", R.drawable.barros);
                intent7.putExtra("sandwich5", Chacarero);
                startActivity(intent7);

            }

        });




    }



}

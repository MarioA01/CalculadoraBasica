package app.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtResult;
    EditText txtA, txtB;
    ImageButton btnSumar, btnRestar, btnMultiplicar, btnDividir, btnPotencia, btnPorcentaje;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_calcu);
        init();
    }


        private void init() {
        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtResult = findViewById(R.id.txtResultado);

        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnPotencia = findViewById(R.id.btnPotencia);
        btnPorcentaje = findViewById(R.id.btnPorcentaje);

        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnPotencia.setOnClickListener(this);
        btnPorcentaje.setOnClickListener(this);
    }

        @Override
        public void onClick(View view) {
            Double num1 = Double.parseDouble(txtA.getText().toString());
            Double num2 = Double.parseDouble(txtB.getText().toString());
            switch(view.getId()){
                case R.id.btnSumar:
                    double suma = num1 + num2;
                    txtResult.setText(String.valueOf(suma));
                    break;
                case R.id.btnRestar:
                    double resta = num1 - num2;
                    txtResult.setText(String.valueOf(resta));
                    break;
                case R.id.btnDividir:
                    try{
                        double division = num1 / num2;
                        txtResult.setText(String.valueOf(division));
                    }catch(Exception e){
                        txtResult.setText("No se puede dividir");
                    }
                    break;
                case R.id.btnMultiplicar:
                    double multiplicacion = num1 * num2;
                    txtResult.setText(String.valueOf(multiplicacion));
                    break;
                case R.id.btnPotencia:
                    int potencia = (int) (Math.pow(num1, num2));
                    txtResult.setText(String.valueOf(potencia));
                    break;
                case R.id.btnPorcentaje:
                    float porcentaje = (float) ((num1 * 100)/ num2);
                    txtResult.setText(String.valueOf(porcentaje));
                    break;
            }


    }
}

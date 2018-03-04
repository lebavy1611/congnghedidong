package problem.lebavy.phuongtrinhbac1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnKetQua;
    EditText txtA, txtB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtA = (EditText)findViewById(R.id.edtSoA);
        txtB = (EditText)findViewById(R.id.edtSoB);
        btnKetQua = (Button) findViewById(R.id.btnKetQua);
        btnKetQua.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                int a = Integer.parseInt(txtA.getText().toString());
                int b = Integer.parseInt(txtB.getText().toString());

                Bundle bundle = new Bundle();
                bundle.putInt("soA", a);
                bundle.putInt("soB", b);

                intent.putExtra("MyPackage", bundle);

                startActivity(intent);
            }

        });
    }
}

package problem.lebavy.phuongtrinhbac1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtKetQua = (TextView)findViewById(R.id.txtKetQua);
        Intent callerIntent = getIntent();

        Bundle packBundle = callerIntent.getBundleExtra("MyPackage");

        int a = packBundle.getInt("soA");
        int b = packBundle.getInt("soB");

        giaiPTBN(a,b);
    }

    public void giaiPTBN(int a,int b){
        if (a == 0) {
            if (b == 0) {
                txtKetQua.setText("Phương trình vô số nghiệm");
                return;
            }else {
                txtKetQua.setText("Phương trình vô nghiệm");
            }
        }else{
            txtKetQua.setText(String.valueOf((float)-b/a));
        }
    }
}

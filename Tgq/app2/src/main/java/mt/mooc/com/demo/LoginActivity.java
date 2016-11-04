package mt.mooc.com.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    protected Button mBtnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mBtnRegister= (Button) this.findViewById(R.id.btn_free_regiser);
        mBtnRegister.setOnClickListener(mClickListener);
    }

    private View.OnClickListener  mClickListener =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
        }
    };
}

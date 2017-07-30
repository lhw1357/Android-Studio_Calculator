package com.example.user_lhw.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList calist = new ArrayList();
    TextView result;
    int count=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView) findViewById(R.id.result);
        Button btn_0 = (Button) findViewById(R.id.btn_0);
        Button btn_1 = (Button) findViewById(R.id.btn_1);
        Button btn_2 = (Button) findViewById(R.id.btn_2);
        Button btn_3 = (Button) findViewById(R.id.btn_3);
        Button btn_4 = (Button) findViewById(R.id.btn_4);
        Button btn_5 = (Button) findViewById(R.id.btn_5);
        Button btn_6 = (Button) findViewById(R.id.btn_6);
        Button btn_7 = (Button) findViewById(R.id.btn_7);
        Button btn_8 = (Button) findViewById(R.id.btn_8);
        Button btn_9 = (Button) findViewById(R.id.btn_9);
        Button dot = (Button) findViewById(R.id.dot);
        Button equal = (Button) findViewById(R.id.equal);
        Button btn_clear = (Button) findViewById(R.id.btn_clear);
        Button btn_slash = (Button) findViewById(R.id.btn_slash);
        Button btn_x = (Button) findViewById(R.id.btn_x);
        Button btn_minus = (Button) findViewById(R.id.btn_minus);
        Button btn_plus = (Button) findViewById(R.id.btn_plus);
        TextView result = (TextView) findViewById(R.id.result) ;

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_slash.setOnClickListener(this);
        btn_x.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        result.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_clear:

                calist.clear();
                result.setText("");
                break;
            case R.id.btn_0:
                result.setText(result.getText().toString()+"0");
                break;
            case R.id.btn_1:
                result.setText(result.getText().toString()+"1");
                break;
            case R.id.btn_2:
                result.setText(result.getText().toString()+"2");
                break;
            case R.id.btn_3:
                result.setText(result.getText().toString()+"3");
                break;
            case R.id.btn_4:
                result.setText(result.getText().toString()+"4");
                break;
            case R.id.btn_5:
                result.setText(result.getText().toString()+"5");
                break;
            case R.id.btn_6:
                result.setText(result.getText().toString()+"6");
                break;
            case R.id.btn_7:
                result.setText(result.getText().toString()+"7");
                break;
            case R.id.btn_8:
                result.setText(result.getText().toString()+"8");
                break;
            case R.id.btn_9:
                result.setText(result.getText().toString()+"9");
                break;

            case R.id.btn_plus:
                calist.add(result.getText().toString());
                result.setText("");
                count=1;
                break;
            case R.id.btn_minus:
                calist.add(result.getText().toString());
                result.setText("");
                count=2;
                break;
            case R.id.btn_x:
                calist.add(result.getText());
                result.setText("");
                count=3;
                break;
            case R.id.btn_slash:
                result.setText("");
                count=4;
                break;

            case R.id.equal:
                int sum1=0,sum2=0,total,chk=0;
                double fsum1=0,fsum2=0,ftotal;
                String val="";

                if(calist.isEmpty()){
                    result.setText("");
                }else{
                    Object obj=calist.get(0);
                    String num1 = (String) obj;
                    String num2 = result.getText().toString();

                    if (num1.contains(".")||num2.contains(".")){
                        chk=1;
                        fsum1=Float.parseFloat(num1);
                        fsum2=Float.parseFloat(num2);
                    }else{
                        sum1= Integer.parseInt(num1);
                        sum2= Integer.parseInt(num2);
                    }
                    switch(count){
                        case 0:

                            result.setText("");
                            break;
                        case 1:
                            if(chk==1){
                                ftotal=fsum1+fsum2;
                                val=String.valueOf(ftotal);

                            }else{
                                total=sum1+sum2;
                                val=String.valueOf(total);
                            }
                            result.setText(val);
                            calist.clear();

                            break;
                        case 2:
                            if(chk==1){
                                ftotal=fsum1-fsum2;
                                val=String.valueOf(ftotal);
                            }else{
                                total=sum1-sum2;
                                val=String.valueOf(total);
                            }
                            result.setText(val);
                            calist.clear();

                            break;
                        case 3:
                            if(chk==1){
                                ftotal=fsum1*fsum2;
                                val=String.valueOf(ftotal);
                            }else{
                                total=sum1*sum2;
                                val=String.valueOf(total);
                            }
                            result.setText(val);
                            calist.clear();

                            break;
                        case 4:
                            if(chk==1){
                                ftotal=fsum1/fsum2;
                                val=String.valueOf(ftotal);
                            }else{
                                total=sum1/sum2;
                                val=String.valueOf(total);
                            }
                            result.setText(val);
                            calist.clear();

                            break;

                    }
                }


        }
    }
}

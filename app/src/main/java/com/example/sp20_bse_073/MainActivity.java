package com.example.sp20_bse_073;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,open,back;
    TextView text;
    int i,j,k,l,jj,ii,ll;
    int tt=5;
    int oo;
    int yyy,yy,y,n=3;
    int firstDigit;
    String h,b="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        open = findViewById(R.id.open);
        back = findViewById(R.id.back);
        text = findViewById(R.id.text);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if(tt==5) {
                        text.setText(""+1);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    }
                    else {
                        text.setText(jj + "" + 1);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if (tt == 5) {
                        text.setText("" + 0);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    } else {
                        text.setText(jj + "" + 0);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if (tt == 5) {
                        text.setText("" + 2);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    } else {
                        text.setText(jj + "" + 2);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if(tt==5) {
                        text.setText(""+3);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    }
                    else {
                        text.setText(jj + "" + 3);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }}
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if(tt==5) {
                        text.setText(""+4);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    }
                    else {
                        text.setText(jj + "" + 4);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }}
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if(tt==5) {
                        text.setText(""+5);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    }
                    else {
                        text.setText(jj + "" + 5);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }}
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if(tt==5) {
                        text.setText(""+6);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    }
                    else {
                        text.setText(jj + "" + 6);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }}
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if(tt==5) {
                        text.setText(""+7);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    }
                    else {
                        text.setText(jj + "" + 7);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }}
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if(tt==5) {
                        text.setText(""+8);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    }
                    else {
                        text.setText(jj + "" + 8);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }}
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 4) {
                    if(tt==5) {
                        text.setText(""+9);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                        tt++;
                    }
                    else {
                        text.setText(jj + "" + 9);
                        ii++;
                        jj = Integer.parseInt(text.getText().toString());
                    }
                }}
        });
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (jj == 1111) {
                    Intent i = new Intent(MainActivity.this, safee.class);
                    oo=0;
                    n=3;
                    startActivity(i);
                } else {
                    oo++;
                    Toast.makeText(MainActivity.this, "wrong password " +n+ " chances left", Toast.LENGTH_SHORT).show();
                    n--;
                }
                if (oo == 5) {
                    MainActivity.this.finish();
                    System.exit(0);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii!=0) {
                    if (ii == 1){
                        text.setText("");
                        tt=5;
                    }
                    if (ii==2){
                        y=Integer.parseInt(String.valueOf(String.valueOf(jj).charAt(0)));
                        text.setText(""+y);
                        jj = Integer.parseInt(text.getText().toString());
                    }
                    if(ii==3){
                        y=Integer.parseInt(String.valueOf(String.valueOf(jj).charAt(0)));
                        yy=Integer.parseInt(String.valueOf(String.valueOf(jj).charAt(1)));
                        text.setText(""+y+""+yy);
                        jj = Integer.parseInt(text.getText().toString());
                    }
                    if(ii==4){
                        y=Integer.parseInt(String.valueOf(String.valueOf(jj).charAt(0)));
                        yy=Integer.parseInt(String.valueOf(String.valueOf(jj).charAt(1)));
                        yyy=Integer.parseInt(String.valueOf(String.valueOf(jj).charAt(2)));
                        text.setText(""+y+""+yy+""+yyy);
                        jj = Integer.parseInt(text.getText().toString());
                    }
                    ii--;
                }

            }
        });
    }
}
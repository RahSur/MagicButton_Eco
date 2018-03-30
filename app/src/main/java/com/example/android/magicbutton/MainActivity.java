package com.example.android.magicbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity
{
    MagicButton mg1,mg2,mg3,mg4,mg5,mg6,mg7;
    TextView txthead,txtnormal,txtnormaltext,txteco,txtecotext,timertext;
    ImageView img,time1,time2,time3;
    //Spinner spn;
    LinearLayout l1,l2;
//    String[] time= {" ","5 sec", "5 min","8 min", "10 min"};
//    ArrayAdapter<String> ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mg1 = (MagicButton) findViewById(R.id.magicheater);
        mg2 = (MagicButton) findViewById(R.id.magicmotor);
        mg3 = (MagicButton) findViewById(R.id.magiciron);
        mg4 = (MagicButton) findViewById(R.id.magiclight);
        mg5 = (MagicButton) findViewById(R.id.magicfan);
        mg6 = (MagicButton) findViewById(R.id.magicstreet);
        mg7 = (MagicButton) findViewById(R.id.magicwash);

        txthead = (TextView) findViewById(R.id.txthead);
        txtnormal = (TextView) findViewById(R.id.txtnormal);
        txtnormaltext = (TextView) findViewById(R.id.txtnormaltext);
        txteco = (TextView) findViewById(R.id.txteco);
        txtecotext = (TextView) findViewById(R.id.txtecotext);
        img = (ImageView) findViewById(R.id.imgview);
        time1 = (ImageView) findViewById(R.id.time1);
        time2 = (ImageView) findViewById(R.id.time2);
        time3 = (ImageView) findViewById(R.id.time3);
        timertext = (TextView) findViewById(R.id.timertxt);
        //spn = (Spinner) findViewById(R.id.spn);
        l1 = (LinearLayout) findViewById(R.id.layout1);
        l2 = (LinearLayout) findViewById(R.id.layout2);

       // ab = new ArrayAdapter<String>(this, simple_spinner_dropdown_item,time);





//        implements View.OnClickListener
//        mg1.setMagicButtonClickListener((View.OnClickListener) getApplicationContext());
//        mg2.setMagicButtonClickListener((View.OnClickListener) getApplicationContext());
//        mg3.setMagicButtonClickListener(this);
//        mg4.setMagicButtonClickListener(this);
//        mg5.setMagicButtonClickListener(this);
//        mg6.setMagicButtonClickListener(this);
//        mg7.setMagicButtonClickListener(this);

        mg1.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Water heater Clicked",Toast.LENGTH_SHORT).show();
                txthead.setText("Water Heater");
                txthead.setVisibility(View.VISIBLE);
                txtnormal.setVisibility(View.VISIBLE);
                txtnormaltext.setVisibility(View.VISIBLE);
                txteco.setVisibility(View.VISIBLE);
                txtecotext.setText("In this mode you can make use of the timer functionality and set timer for the heater for automatic cutoff");
                txtecotext.setVisibility(View.VISIBLE);
                timertext.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(getApplicationContext(),"Alert Comes here",Toast.LENGTH_SHORT).show();
                        //spn.setVisibility(View.VISIBLE);
                        //spn.setAdapter(ab);
                        l1.setVisibility(View.VISIBLE);
                        l2.setVisibility(View.VISIBLE);
                    }
                });

                time1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext()," cutoff @ 5 seconds",Toast.LENGTH_LONG).show();
                    }
                });
                time2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"cutoff @ 5 minutes",Toast.LENGTH_LONG).show();
                    }
                });
                time3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"cutoff @ 10 minutes",Toast.LENGTH_LONG).show();
                    }
                });

            }
        });


        mg2.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Water Motor Clicked",Toast.LENGTH_SHORT).show();
                txthead.setText("Water Motor");
                txthead.setVisibility(View.VISIBLE);
                txtnormal.setVisibility(View.VISIBLE);
                txtnormaltext.setVisibility(View.VISIBLE);
                txteco.setVisibility(View.VISIBLE);
                txtecotext.setText("In this eco-mode you can use the timer functionality to auomatically switch off the motor based on the water level in the tank");
                timertext.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);
                //spn.setVisibility(View.INVISIBLE);
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.VISIBLE);

                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(getApplicationContext(),"Alert Comes here",Toast.LENGTH_SHORT).show();
                        //spn.setVisibility(View.VISIBLE);
                        //spn.setAdapter(ab);
                        l1.setVisibility(View.VISIBLE);
                        l2.setVisibility(View.VISIBLE);
                    }
                });

                time1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"cutoff @ 5 seconds",Toast.LENGTH_SHORT).show();
                    }
                });
                time2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"cutoff @ 5 minutes",Toast.LENGTH_SHORT).show();
                    }
                });
                time3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"cutoff @ 10 minutes",Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });

        mg3.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(),"Iron Box Clicked",Toast.LENGTH_SHORT).show();
                txthead.setText("Iron Box");
                txthead.setVisibility(View.VISIBLE);
                txtnormal.setVisibility(View.VISIBLE);
                txtnormaltext.setVisibility(View.VISIBLE);
                txteco.setVisibility(View.VISIBLE);
                txtecotext.setText("In this eco-mode the state of the iron box is noticed continuously and if its unused it goes to the OFF state automatically");
                timertext.setVisibility(View.INVISIBLE);
                img.setVisibility(View.INVISIBLE);
                //spn.setVisibility(View.INVISIBLE);
                l1.setVisibility(View.INVISIBLE);
                l2.setVisibility(View.INVISIBLE);

            }
        });

        mg4.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Bedroom Light Clicked",Toast.LENGTH_SHORT).show();
                txthead.setText("Bedroom Light");
                txthead.setVisibility(View.VISIBLE);
                txtnormal.setVisibility(View.VISIBLE);
                txtnormaltext.setVisibility(View.VISIBLE);
                txteco.setVisibility(View.VISIBLE);
                txtecotext.setText("In this eco-mode the bedroom light is switched on and off with the help of a motion sensor where it goes to ON state when humans are detected else to OFF state if no motion is going.");
                timertext.setVisibility(View.INVISIBLE);
                img.setVisibility(View.INVISIBLE);
                //spn.setVisibility(View.INVISIBLE);
                l1.setVisibility(View.INVISIBLE);
                l2.setVisibility(View.INVISIBLE);

            }
        });

        mg5.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Bedroom Fan Clicked",Toast.LENGTH_SHORT).show();
                txthead.setText("Bedroom Fan");
                txthead.setVisibility(View.VISIBLE);
                txtnormal.setVisibility(View.VISIBLE);
                txtnormaltext.setVisibility(View.VISIBLE);
                txteco.setVisibility(View.VISIBLE);
                txtecotext.setText("In this eco-mode the bedroom fan is switched on and off with the help of a motion sensor where it goes to ON state when humans are detected else to OFF state if no motion is going.");
                timertext.setVisibility(View.INVISIBLE);
                img.setVisibility(View.INVISIBLE);
                //spn.setVisibility(View.INVISIBLE);
                l1.setVisibility(View.INVISIBLE);
                l2.setVisibility(View.INVISIBLE);
            }
        });

        mg6.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Outside Light Clicked",Toast.LENGTH_SHORT).show();
                txthead.setText("Outside Light");
                txthead.setVisibility(View.VISIBLE);
                txtnormal.setVisibility(View.VISIBLE);
                txtnormaltext.setVisibility(View.VISIBLE);
                txteco.setVisibility(View.VISIBLE);
                txtecotext.setText("In this eco-mode the outside light is switched on and off with the help of a light dependent sensor where it goes to OFF state when light is detected else to ON state if no light is detected.");
                timertext.setVisibility(View.INVISIBLE);
                img.setVisibility(View.INVISIBLE);
                //spn.setVisibility(View.INVISIBLE);
                l1.setVisibility(View.INVISIBLE);
                l2.setVisibility(View.INVISIBLE);

            }
        });

        mg7.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Washing Machine Clicked",Toast.LENGTH_SHORT).show();
                txthead.setText("Washing Machine");
                txthead.setVisibility(View.VISIBLE);
                txtnormal.setVisibility(View.VISIBLE);
                txtnormaltext.setVisibility(View.VISIBLE);
                txteco.setVisibility(View.VISIBLE);
                txtecotext.setText("In this eco-mode the washing machine is used with the timer functionality so that after a particular period of time it can be switched off or on");
                timertext.setVisibility(View.INVISIBLE);
                img.setVisibility(View.INVISIBLE);
               // spn.setVisibility(View.INVISIBLE);
                l1.setVisibility(View.INVISIBLE);
                l2.setVisibility(View.INVISIBLE);

            }
        });


    }

//    @Override
//    public void onClick(View view)
//    {
//        if(view.getId() == R.id.magicheater)
//        {
//            Toast.makeText(this,"Water heater Clicked",Toast.LENGTH_SHORT).show();
//        }
//        if (view.getId() == R.id.magicmotor)
//        {
//            Toast.makeText(this,"Water motor Clicked",Toast.LENGTH_SHORT).show();
//        }
//        if (view.getId() == R.id.magiciron)
//        {
//            Toast.makeText(this,"Iron box Clicked",Toast.LENGTH_SHORT).show();
//        }
//
//        if(view.getId() == R.id.magiclight)
//        {
//            Toast.makeText(this,"Bedroom Light Clicked",Toast.LENGTH_SHORT).show();
//        }
//        if (view.getId() == R.id.magicfan)
//        {
//            Toast.makeText(this,"Bedroom Fan Clicked",Toast.LENGTH_SHORT).show();
//        }
//        if (view.getId() == R.id.magicstreet)
//        {
//            Toast.makeText(this,"Outside Light Clicked",Toast.LENGTH_SHORT).show();
//        }
//        if (view.getId() == R.id.magicwash)
//        {
//            Toast.makeText(this,"Washing Machine Clicked",Toast.LENGTH_SHORT).show();
//        }
//
//
//    }
}

package com.shailersolutions.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String sss="02 04 60 01 10 00 75 03";
private int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] strArr =sss.split(" ");
        System.out.println(Arrays.toString(strArr));

        for (i=0; i<3;i++){
                    if (strArr[3].equals("012")){
                        Log.e("03 ","got it "+i);
                        return;
                    }else{
                        Log.e("03 ","not got it "+i);
                    }
          try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }




          /*if (strArr[3].equals("00")){
              Toast.makeText(getApplicationContext(), "00", Toast.LENGTH_SHORT).show();
          }else if (strArr[3].equals("01")){
              Toast.makeText(getApplicationContext(), "01", Toast.LENGTH_SHORT).show();
          }else if (strArr[3].equals("02")){
              Toast.makeText(getApplicationContext(), "02", Toast.LENGTH_SHORT).show();
          }else if (strArr[3].equals("04")){
              Toast.makeText(getApplicationContext(), "04", Toast.LENGTH_SHORT).show();
          }


           if ((strArr[4].trim()).equals("00")){
               Toast.makeText(getApplicationContext(), "00", Toast.LENGTH_SHORT).show();
           }else if ((strArr[4].trim()).equals("01")){
               Toast.makeText(getApplicationContext(), "01", Toast.LENGTH_SHORT).show();
           }else if ((strArr[4].trim()).equals("10")){
               Toast.makeText(getApplicationContext(), "10", Toast.LENGTH_LONG).show();
           }else if ((strArr[4].trim()).equals("11")){
               Toast.makeText(getApplicationContext(), "11", Toast.LENGTH_SHORT).show();
           }

        if (strArr[5].equals("60")){
            Toast.makeText(getApplicationContext(), "60", Toast.LENGTH_SHORT).show();
        }else if (strArr[5].equals("61")){
            Toast.makeText(getApplicationContext(), "61", Toast.LENGTH_SHORT).show();
        }else if (strArr[5].equals("62")){
            Toast.makeText(getApplicationContext(), "62", Toast.LENGTH_SHORT).show();
        }else if (strArr[5].equals("63")){
            Toast.makeText(getApplicationContext(), "63", Toast.LENGTH_SHORT).show();
        }else if (strArr[5].equals("64")){
            Toast.makeText(getApplicationContext(), "64", Toast.LENGTH_SHORT).show();
        }*/


       /* for (int i=0;i<(Arrays.toString(strArr).length());i++){

        }
        for (int i=0;i<(Arrays.toString(strArr).length());i++){
            if (strArr[5].equals("60")){
                Toast.makeText(getApplicationContext(), "60", Toast.LENGTH_SHORT).show();
            }else if (strArr[5].equals("61")){
                Toast.makeText(getApplicationContext(), "61", Toast.LENGTH_SHORT).show();
            }else if (strArr[5].equals("62")){
                Toast.makeText(getApplicationContext(), "62", Toast.LENGTH_SHORT).show();
            }else if (strArr[5].equals("63")){
                Toast.makeText(getApplicationContext(), "63", Toast.LENGTH_SHORT).show();
            }else if (strArr[5].equals("64")){
                Toast.makeText(getApplicationContext(), "64", Toast.LENGTH_SHORT).show();
            }
        }*/
    }
}
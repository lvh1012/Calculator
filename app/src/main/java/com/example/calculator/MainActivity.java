package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtKQ;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnCong, btnTru, btnNhan, btnChia, btnBang;
    Button btnDoiDau, btnCham, btnXoa, btnXoaHet, btnCE;

    String soThuNhat = "", soThuHai = "", phepTinh = "", ketQua = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtKQ = findViewById(R.id.txtKQ);
        Typeface typeface = Typeface.createFromAsset(getAssets(),
                "digital-7.ttf");
        txtKQ.setTypeface(typeface);
        txtKQ.setText("0");

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnBang = findViewById(R.id.btnBang);

        btnDoiDau = findViewById(R.id.btnDoiDau);
        btnCham = findViewById(R.id.btnCham);
        btnXoa = findViewById(R.id.btnXoa);
        btnXoaHet = findViewById(R.id.btnXoaHet);
        btnCE = findViewById(R.id.btnCE);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnDoiDau.setOnClickListener(this);
        btnCham.setOnClickListener(this);
        btnXoa.setOnClickListener(this);
        btnXoaHet.setOnClickListener(this);
        btnCE.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        String strKQ = txtKQ.getText().toString();
        switch(id) {
            case R.id.btn0:
                if (strKQ != "0"){
                    txtKQ.setText(strKQ + "0");
                }
                break;
            case R.id.btn1:
                if (strKQ == "0"){
                    txtKQ.setText("1");
                }
                else{
                    txtKQ.setText(strKQ + "1");
                }
                break;
            case R.id.btn2:
                if (strKQ == "0"){
                    txtKQ.setText("2");
                }
                else{
                    txtKQ.setText(strKQ + "2");
                }
                break;
            case R.id.btn3:
                if (strKQ == "0"){
                    txtKQ.setText("3");
                }
                else{
                    txtKQ.setText(strKQ + "3");
                }
                break;
            case R.id.btn4:
                if (strKQ == "0"){
                    txtKQ.setText("4");
                }
                else{
                    txtKQ.setText(strKQ + "4");
                }
                break;
            case R.id.btn5:
                if (strKQ == "0"){
                    txtKQ.setText("5");
                }
                else{
                    txtKQ.setText(strKQ + "5");
                }
                break;
            case R.id.btn6:
                if (strKQ == "0"){
                    txtKQ.setText("6");
                }
                else{
                    txtKQ.setText(strKQ + "6");
                }
                break;
            case R.id.btn7:
                if (strKQ == "0"){
                    txtKQ.setText("7");
                }
                else{
                    txtKQ.setText(strKQ + "7");
                }
                break;
            case R.id.btn8:
                if (strKQ == "0"){
                    txtKQ.setText("8");
                }
                else{
                    txtKQ.setText(strKQ + "8");
                }
                break;
            case R.id.btn9:
                if (strKQ == "0"){
                    txtKQ.setText("9");
                }
                else{
                    txtKQ.setText(strKQ + "9");
                }
                break;
            case R.id.btnCong:
                txtKQ.setText(Integer.toString(id));
                break;
            case R.id.btnTru:
                txtKQ.setText(Integer.toString(id));
                break;
            case R.id.btnNhan:
                txtKQ.setText(Integer.toString(id));
                break;
            case R.id.btnChia:
                txtKQ.setText(Integer.toString(id));
                break;
            case R.id.btnBang:
                txtKQ.setText(Integer.toString(id));
                break;
            case R.id.btnDoiDau:
                if (strKQ != "0"){
                    txtKQ.setText(Integer.toString(Integer.parseInt(strKQ)*(-1)));
                }
                break;
            case R.id.btnCham:
                txtKQ.setText(Integer.toString(id));
                break;
            case R.id.btnXoa:
                if (strKQ.length() > 2){
                    txtKQ.setText(strKQ.substring(0, strKQ.length() - 1));
                }
                else if (strKQ.length() == 2 && strKQ.charAt(0) != '-'){
                    txtKQ.setText(strKQ.substring(0, strKQ.length() - 1));
                }
                else if (strKQ.length() == 2 && strKQ.charAt(0) == '-'){
                    txtKQ.setText("0");
                }
                else if (strKQ.length() == 1 && strKQ != "0"){
                    txtKQ.setText("0");
                }

                break;
            case R.id.btnXoaHet:
                txtKQ.setText("0");
                break;
            case R.id.btnCE:
                txtKQ.setText("0");
                break;
        }

    }
}
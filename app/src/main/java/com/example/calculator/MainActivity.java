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

    String soThuNhat, soThuHai, phepTinh;
    String soThuHaiTruoc, phepTinhTruoc;

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

        soThuNhat = "10"; // bit dau danh dau dang nhap hay khong
        soThuHai = "0";
        phepTinh = "";

        soThuHaiTruoc = phepTinhTruoc = "";
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        String strKQ = txtKQ.getText().toString();
        switch(id) {
            case R.id.btn0:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("0");
                        soThuNhat = "10";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("0");
                            soThuNhat = "10";
                        }
                        else {
                            txtKQ.setText("0");
                            soThuHai = "10";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "0");
                        soThuNhat = "1" + strKQ + "0";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("0");
                            soThuNhat = "10";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("0");
                                soThuHai = "10";
                            }
                            else {
                                txtKQ.setText(strKQ + "0");
                                soThuHai = "1" + strKQ + "0";
                            }
                        }
                    }
                }
                break;
            case R.id.btn1:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("1");
                        soThuNhat = "11";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("1");
                            soThuNhat = "11";
                        }
                        else {
                            txtKQ.setText("1");
                            soThuHai = "11";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "1");
                        soThuNhat = "1" + strKQ + "1";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("1");
                            soThuNhat = "11";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("1");
                                soThuHai = "11";
                            }
                            else {
                                txtKQ.setText(strKQ + "1");
                                soThuHai = "1" + strKQ + "1";
                            }
                        }
                    }
                }
                break;
            case R.id.btn2:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("2");
                        soThuNhat = "12";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("2");
                            soThuNhat = "12";
                        }
                        else {
                            txtKQ.setText("2");
                            soThuHai = "12";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "2");
                        soThuNhat = "1" + strKQ + "2";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("2");
                            soThuNhat = "12";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("2");
                                soThuHai = "12";
                            }
                            else {
                                txtKQ.setText(strKQ + "2");
                                soThuHai = "1" + strKQ + "2";
                            }
                        }
                    }
                }
                break;
            case R.id.btn3:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("3");
                        soThuNhat = "13";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("3");
                            soThuNhat = "13";
                        }
                        else {
                            txtKQ.setText("3");
                            soThuHai = "13";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "3");
                        soThuNhat = "1" + strKQ + "3";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("3");
                            soThuNhat = "13";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("3");
                                soThuHai = "13";
                            }
                            else {
                                txtKQ.setText(strKQ + "3");
                                soThuHai = "1" + strKQ + "3";
                            }
                        }
                    }
                }
                break;
            case R.id.btn4:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("4");
                        soThuNhat = "14";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("4");
                            soThuNhat = "14";
                        }
                        else {
                            txtKQ.setText("4");
                            soThuHai = "14";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "4");
                        soThuNhat = "1" + strKQ + "4";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("4");
                            soThuNhat = "14";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("4");
                                soThuHai = "14";
                            }
                            else {
                                txtKQ.setText(strKQ + "4");
                                soThuHai = "1" + strKQ + "4";
                            }
                        }
                    }
                }
                break;
            case R.id.btn5:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("5");
                        soThuNhat = "15";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("5");
                            soThuNhat = "15";
                        }
                        else {
                            txtKQ.setText("5");
                            soThuHai = "15";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "5");
                        soThuNhat = "1" + strKQ + "5";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("5");
                            soThuNhat = "15";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("5");
                                soThuHai = "15";
                            }
                            else {
                                txtKQ.setText(strKQ + "5");
                                soThuHai = "1" + strKQ + "5";
                            }
                        }
                    }
                }
                break;
            case R.id.btn6:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("6");
                        soThuNhat = "16";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("6");
                            soThuNhat = "16";
                        }
                        else {
                            txtKQ.setText("6");
                            soThuHai = "16";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "6");
                        soThuNhat = "1" + strKQ + "6";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("6");
                            soThuNhat = "16";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("6");
                                soThuHai = "16";
                            }
                            else {
                                txtKQ.setText(strKQ + "6");
                                soThuHai = "1" + strKQ + "6";
                            }
                        }
                    }
                }
                break;
            case R.id.btn7:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("7");
                        soThuNhat = "17";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("7");
                            soThuNhat = "17";
                        }
                        else {
                            txtKQ.setText("7");
                            soThuHai = "17";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "7");
                        soThuNhat = "1" + strKQ + "7";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("7");
                            soThuNhat = "17";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("7");
                                soThuHai = "17";
                            }
                            else {
                                txtKQ.setText(strKQ + "7");
                                soThuHai = "1" + strKQ + "7";
                            }
                        }
                    }
                }
                break;
            case R.id.btn8:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("8");
                        soThuNhat = "18";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("8");
                            soThuNhat = "18";
                        }
                        else {
                            txtKQ.setText("8");
                            soThuHai = "18";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "8");
                        soThuNhat = "1" + strKQ + "8";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("8");
                            soThuNhat = "18";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("8");
                                soThuHai = "18";
                            }
                            else {
                                txtKQ.setText(strKQ + "8");
                                soThuHai = "1" + strKQ + "8";
                            }
                        }
                    }
                }
                break;
            case R.id.btn9:
                if (strKQ == "0"){
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText("9");
                        soThuNhat = "19";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("9");
                            soThuNhat = "19";
                        }
                        else {
                            txtKQ.setText("9");
                            soThuHai = "19";
                        }
                    }
                }
                else {
                    if (soThuNhat.charAt(0) == '1'){
                        txtKQ.setText(strKQ + "9");
                        soThuNhat = "1" + strKQ + "9";
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            txtKQ.setText("9");
                            soThuNhat = "19";
                        }
                        else {
                            if (soThuHai.equals("1")){
                                txtKQ.setText("9");
                                soThuHai = "19";
                            }
                            else {
                                txtKQ.setText(strKQ + "9");
                                soThuHai = "1" + strKQ + "9";
                            }
                        }
                    }
                }
                break;
            case R.id.btnCong:
                    soThuNhat = "0" + soThuNhat.substring(1);
                    soThuHai = "1";
                    phepTinh = "+";
                break;
            case R.id.btnTru:
                    soThuNhat = "0" + soThuNhat.substring(1);
                    soThuHai = "1";
                    phepTinh = "-";
                break;
            case R.id.btnNhan:
                    soThuNhat = "0" + soThuNhat.substring(1);
                    soThuHai = "1";
                    phepTinh = "x";
                break;
            case R.id.btnChia:
                    soThuNhat = "0" + soThuNhat.substring(1);
                    soThuHai = "1";
                    phepTinh = "/";
                break;
            case R.id.btnBang:
                if (strKQ != "0"){
                    int ketqua= 0;

                    if (soThuNhat.length() > 1 && soThuHai.length() > 1 && !phepTinh.isEmpty()){
                        soThuNhat = soThuNhat.substring(1);
                        soThuHai = soThuHai.substring(1);
                        soThuHaiTruoc = soThuHai;
                        phepTinhTruoc = phepTinh;

                        if (phepTinh.equals("+")){
                            ketqua = Integer.valueOf(soThuNhat) + Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else if (phepTinh.equals("-")){
                            ketqua = Integer.valueOf(soThuNhat) - Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else if (phepTinh.equals("x")){
                            ketqua = Integer.valueOf(soThuNhat) * Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else{
                            if (soThuHai.equals("0")){
                                txtKQ.setText("Cannot divide by zero");
                            }
                            else{
                                ketqua = Integer.valueOf(soThuNhat) / Integer.valueOf(soThuHai);
                                txtKQ.setText(Integer.toString(ketqua));
                            }
                        }
                    }
                    else if (soThuNhat.length() > 1 && soThuHai.length() == 1 && phepTinh.isEmpty()){
                        if (!soThuHaiTruoc.isEmpty() && !phepTinhTruoc.isEmpty()){
                            soThuNhat = soThuNhat.substring(1);
                            soThuHai = soThuHaiTruoc;
                            phepTinh = phepTinhTruoc;

                            if (phepTinh.equals("+")){
                                ketqua = Integer.valueOf(soThuNhat) + Integer.valueOf(soThuHai);
                                txtKQ.setText(Integer.toString(ketqua));
                            }
                            else if (phepTinh.equals("-")){
                                ketqua = Integer.valueOf(soThuNhat) - Integer.valueOf(soThuHai);
                                txtKQ.setText(Integer.toString(ketqua));
                            }
                            else if (phepTinh.equals("x")){
                                ketqua = Integer.valueOf(soThuNhat) * Integer.valueOf(soThuHai);
                                txtKQ.setText(Integer.toString(ketqua));
                            }
                            else{
                                if (soThuHai.equals("0")){
                                    txtKQ.setText("Cannot divide by zero");
                                }
                                else{
                                    ketqua = Integer.valueOf(soThuNhat) / Integer.valueOf(soThuHai);
                                    txtKQ.setText(Integer.toString(ketqua));
                                }
                            }
                        }
                    }
                    else if (soThuNhat.length() > 1 && soThuHai.length() > 1 && phepTinh.isEmpty()){
                        soThuNhat = soThuHai.substring(1);
                        soThuHai = soThuHaiTruoc;

                        phepTinh = phepTinhTruoc;
                        if (phepTinh.equals("+")){
                            ketqua = Integer.valueOf(soThuNhat) + Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else if (phepTinh.equals("-")){
                            ketqua = Integer.valueOf(soThuNhat) - Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else if (phepTinh.equals("x")){
                            ketqua = Integer.valueOf(soThuNhat) * Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else{
                            if (soThuHai.equals("0")){
                                txtKQ.setText("Cannot divide by zero");
                            }
                            else{
                                ketqua = Integer.valueOf(soThuNhat) / Integer.valueOf(soThuHai);
                                txtKQ.setText(Integer.toString(ketqua));
                            }
                        }
                    }
                    else if (soThuNhat.length() > 1 && soThuHai.length() == 1 && !phepTinh.isEmpty()){
                        soThuNhat = soThuNhat.substring(1);
                        soThuHai = soThuHaiTruoc = soThuNhat;

                        phepTinhTruoc = phepTinh;
                        if (phepTinh.equals("+")){
                            ketqua = Integer.valueOf(soThuNhat) + Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else if (phepTinh.equals("-")){
                            ketqua = Integer.valueOf(soThuNhat) - Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else if (phepTinh.equals("x")){
                            ketqua = Integer.valueOf(soThuNhat) * Integer.valueOf(soThuHai);
                            txtKQ.setText(Integer.toString(ketqua));
                        }
                        else{
                            if (soThuHai.equals("0")){
                                txtKQ.setText("Cannot divide by zero");
                            }
                            else{
                                ketqua = Integer.valueOf(soThuNhat) / Integer.valueOf(soThuHai);
                                txtKQ.setText(Integer.toString(ketqua));
                            }
                        }
                    }

                    // reset
                    soThuNhat = "0" + Integer.toString(ketqua);
                    soThuHai = "1";
                    phepTinh = "";
                }
                break;
            case R.id.btnDoiDau:
                if (strKQ != "0"){
                    String doiDau = Integer.toString(Integer.parseInt(strKQ)*(-1));
                    txtKQ.setText(doiDau);
                    if (soThuNhat.charAt(0) == '1'){
                        soThuNhat = "1" + doiDau;
                    }
                    else {
                        if (phepTinh.isEmpty()){
                            soThuNhat = "1" + doiDau;
                        }
                        else {
                            soThuHai =  "1" + doiDau;
                        }
                    }
                }
                break;
            case R.id.btnCham:

                break;
            case R.id.btnXoa:
                if (soThuNhat.charAt(0) == '1'){
                    if (strKQ.length() > 2 || (strKQ.length() == 2 && strKQ.charAt(0) != '-')){
                        txtKQ.setText(strKQ.substring(0, strKQ.length() - 1));
                        soThuNhat = "1" + strKQ.substring(0, strKQ.length() - 1);
                    }
                    else if ((strKQ.length() == 2 && strKQ.charAt(0) == '-') || (strKQ.length() == 1 && strKQ != "0")){
                        txtKQ.setText("0");
                        soThuNhat = "10";
                    }
                }
                else {
                    if (!phepTinh.isEmpty()){
                        if (!soThuHai.equals("1")){
                            if (strKQ.length() > 2 || (strKQ.length() == 2 && strKQ.charAt(0) != '-')){
                                txtKQ.setText(strKQ.substring(0, strKQ.length() - 1));
                                soThuHai = "1" + strKQ.substring(0, strKQ.length() - 1);
                            }
                            else if ((strKQ.length() == 2 && strKQ.charAt(0) == '-') || (strKQ.length() == 1 && strKQ != "0")){
                                txtKQ.setText("0");
                                soThuHai = "10";
                            }
                        }
                    }
                }
                break;
            case R.id.btnXoaHet:
                txtKQ.setText("0");
                soThuNhat = "10";
                soThuHai = "0";
                phepTinh = "";
                soThuHaiTruoc = phepTinhTruoc = "";
                break;
            case R.id.btnCE:
                txtKQ.setText("0");
                soThuNhat = "10";
                soThuHai = "0";
                phepTinh = "";
                break;
        }

    }
}
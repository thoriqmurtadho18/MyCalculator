package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNilaia, etNilaib;
    private TextView tvHsl_Hitung;
    private Button btn_hitung;
    private RadioButton rbTambah, rbKurang, rbKali, rbBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNilaia = findViewById(R.id.etNilaia);
        etNilaib = findViewById(R.id.etNilaib);
        tvHsl_Hitung = findViewById(R.id.tvHsl_Hitung);
        btn_hitung = findViewById(R.id.btn_hitung);
        rbTambah = findViewById(R.id.rbTambah);
        rbKurang = findViewById(R.id.rbKurang);
        rbKali = findViewById(R.id.rbKali);
        rbBagi = findViewById(R.id.rbBagi);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                if (etNilaia.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nilai A Masih Kosong !", Toast.LENGTH_SHORT).show();
                }else if (etNilaib.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Nilai B Masih Kosong !", Toast.LENGTH_SHORT).show();
                }else {
                    double NilaiA = Double.valueOf(etNilaia.getText().toString());
                    double NilaiB = Double.valueOf(etNilaib.getText().toString());
                    double Hasil;

                    if (rbTambah.isChecked()) {
                        Hasil = NilaiA + NilaiB;
                        tvHsl_Hitung.setText(String.valueOf(Hasil));
                    }else if(rbKurang.isChecked()) {
                        Hasil = NilaiA - NilaiB;
                        tvHsl_Hitung.setText(String.valueOf(Hasil));
                    }else if(rbKali.isChecked()) {
                        Hasil = NilaiA * NilaiB;
                        tvHsl_Hitung.setText(String.valueOf(Hasil));
                    }else if(rbBagi.isChecked()) {
                        Hasil = NilaiA / NilaiB;
                        tvHsl_Hitung.setText(String.valueOf(Hasil));
                    }else {
                        Toast.makeText(MainActivity.this,"Silahkan Pilih Opsi Terlebih Dulu !!", Toast.LENGTH_SHORT).show();
                    }
                }





            }
        });


    }
}
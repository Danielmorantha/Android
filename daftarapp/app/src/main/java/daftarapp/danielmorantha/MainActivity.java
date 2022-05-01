package daftarapp.danielmorantha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDafPusBtnKlik (View view)
    {

        TextView txtNmaBlkng = findViewById(R.id.txtNmaBlkng);
        //TextView txtNmaDpn = findViewById(R.id.txtNmaDpn);
        //TextView txtThn = findViewById(R.id.txtThn);
        //TextView txtJdlBuku = findViewById(R.id.txtJdlBuku);
        //TextView txtKota = findViewById(R.id.txtKota);
        //TextView txtPenerbit = findViewById(R.id.txtPenerbit);

        EditText edtTxtNmaBlkng = findViewById(R.id.edtTxtNmaBlkng);
        EditText edtTxtNmaDpn = findViewById(R.id.edtTxtNmaDpn);
        EditText edtTxtThn = findViewById(R.id.edtTxtThn);
        EditText edtTxtJdlBuku = findViewById(R.id.edtTxtJdlBuku);
        EditText edtTxtKota = findViewById(R.id.edtTxtKota);
        EditText edtTxtPenerbit = findViewById(R.id.edtTxtPenerbit);

        txtNmaBlkng.setText(edtTxtNmaBlkng.getText().toString()+", "+edtTxtNmaDpn.getText().toString()+". "
                +"("+edtTxtThn.getText().toString()+"). "+edtTxtJdlBuku.getText().toString()+". "+
                edtTxtKota.getText().toString()+ ": "+edtTxtPenerbit.getText().toString());
        //txtNmaDpn.setText("."+edtTxtNmaDpn.getText().toString()+".");
        //txtThn.setText("("+edtTxtThn.getText().toString()+")");
        //txtJdlBuku.setText(edtTxtJdlBuku.getText().toString());
        //txtKota.setText(edtTxtKota.getText().toString());
        //txtPenerbit.setText(edtTxtPenerbit.getText().toString());
        //Nama Belakang, Nama Depan. (Tahun). Judul Buku. Kota: Penerbit Buku.


    }


}
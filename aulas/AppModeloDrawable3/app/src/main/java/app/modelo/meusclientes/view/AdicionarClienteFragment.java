package app.modelo.meusclientes.view;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import app.modelo.meusclientes.R;


public class AdicionarClienteFragment extends Fragment {

    // Fragment - Classe responsável pela camada de VISÃO (Layout)
    View view;
    TextView txtTitulo;

    public AdicionarClienteFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_azul, container, false);
        startLayoutComponents();

        return view;
    }

    private void startLayoutComponents(){
        txtTitulo = view.findViewById(R.id.txtTitulo);
        txtTitulo.setText(R.string.txtTitulo);
    }


}

package app.modelo.meusclientes.view;

import android.app.AlertDialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import app.modelo.meusclientes.R;
import app.modelo.meusclientes.api.AppUtil;
import app.modelo.meusclientes.controller.ClienteController;
import app.modelo.meusclientes.model.Cliente;


public class AdicionarClienteFragment extends Fragment {

    // Fragment - Classe responsável pela camada de VISÃO (Layout)
    //Declaração global de atributos
    View view;
    TextView txtTitulo;
    EditText editNomeCompleto;
    EditText editTelefone;
    EditText editEmail;
    EditText editCep;
    EditText editLogradouro;
    EditText editNumeroResidencia;
    EditText editBairro;
    EditText editCidade;
    EditText editEstado;
    CheckBox ck_termos_de_uso;
    Button btnSalvar;
    Button btnCancelar;
    Cliente cliente;
    ClienteController clienteController;

    public AdicionarClienteFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_adicionar_cliente, container, false);

        iniciarElementeDeLayout();
        iniciarEventosDosBotoes();
        return view;
    }

    /**
     * Iniciar as capturas dos eventos dos botões
     */

    private void iniciarEventosDosBotoes() {

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isDadosOK = true;

                if(isDadosOK){
                    if(TextUtils.isEmpty(editNomeCompleto.getText().toString())){
                        isDadosOK = false;
                        editNomeCompleto.setError("*");
                        editNomeCompleto.requestFocus();
                    } if(TextUtils.isEmpty(editTelefone.getText().toString())){
                        isDadosOK = false;
                        editTelefone.setError("*");
                        editTelefone.requestFocus();
                    } if(TextUtils.isEmpty(editEmail.getText().toString())){
                        isDadosOK = false;
                        editEmail.setError("*");
                        editEmail.requestFocus();
                    } if(TextUtils.isEmpty(editCep.getText().toString())){
                        isDadosOK = false;
                        editCep.setError("*");
                        editCep.requestFocus();
                    } if(TextUtils.isEmpty(editLogradouro.getText().toString())){
                        isDadosOK = false;
                        editLogradouro.setError("*");
                        editLogradouro.requestFocus();
                    } if(TextUtils.isEmpty(editNumeroResidencia.getText().toString())){
                        isDadosOK = false;
                        editNumeroResidencia.setError("*");
                        editNumeroResidencia.requestFocus();
                    } if(TextUtils.isEmpty(editBairro.getText().toString())){
                        isDadosOK = false;
                        editBairro.setError("*");
                        editBairro.requestFocus();
                    } if(TextUtils.isEmpty(editCidade.getText().toString())){
                        isDadosOK = false;
                        editCidade.setError("*");
                        editCidade.requestFocus();
                    } if(TextUtils.isEmpty(editEstado.getText().toString())){
                        isDadosOK = false;
                        editEstado.setError("*");
                        editEstado.requestFocus();
                    }
                }


                if(isDadosOK){

                    cliente.setNomeCompleto(editNomeCompleto.getText().toString());
                    cliente.setTelefone(editTelefone.getText().toString());
                    cliente.setEmail(editEmail.getText().toString());
                    cliente.setCep(Integer.parseInt(editCep.getText().toString()));
                    cliente.setLogradouro(editLogradouro.getText().toString());
                    cliente.setNumero(editNumeroResidencia.getText().toString());
                    cliente.setBairro(editBairro.getText().toString());
                    cliente.setCidade(editCidade.getText().toString());
                    cliente.setEstado(editEstado.getText().toString());
                    cliente.setTermosDeUso(ck_termos_de_uso.isChecked());

                    clienteController.incluir(cliente);
                    Toast.makeText(getContext(), "Dados corretos!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Log.e(AppUtil.TAG, "onClick: dados incorretos....");
                }
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    /**
     * Iniciar os componentes da tela para adicionar os clientes
     */
    protected void iniciarElementeDeLayout(){

        editNomeCompleto = view.findViewById(R.id.editNomeCompleto);
        editTelefone = view.findViewById(R.id.editTelefone);
        editEmail = view.findViewById(R.id.editEmail);
        editCep = view.findViewById(R.id.editCep);
        editLogradouro = view.findViewById(R.id.editLogradouro);
        editNumeroResidencia = view.findViewById(R.id.editNumeroResidencia);
        editBairro = view.findViewById(R.id.editBairro);
        editCidade = view.findViewById(R.id.editCidade);
        editEstado = view.findViewById(R.id.editEstado);
        ck_termos_de_uso = view.findViewById(R.id.ck_termos_de_uso);
        btnSalvar = view.findViewById(R.id.btnSalvar);
        btnCancelar = view.findViewById(R.id.btnCancelar);

        txtTitulo = view.findViewById(R.id.txtTitulo);
        txtTitulo.setText(R.string.novoCliente);

        cliente = new Cliente();
        clienteController = new ClienteController(getContext());
    }



}

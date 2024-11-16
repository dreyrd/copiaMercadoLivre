package com.example.mercadolivre.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mercadolivre.R;
import com.example.mercadolivre.adapter.ProdutosAdapter;
import com.example.mercadolivre.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Pedido> listaPedido = new ArrayList<Pedido>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.produtos);

        criarPostagens();

        ProdutosAdapter produtosAdapter = new ProdutosAdapter(listaPedido, this);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(produtosAdapter);
    }

    private void criarPostagens() {

        listaPedido.add(new Pedido("25 de Novembro", "A caminho", "Chegará em 5 de Dezembro", R.drawable.zoom, "Pedaleira zoom"));
        listaPedido.add(new Pedido("15 de Novembro", "Entregue", "Chegou em 20 de Novembro", R.drawable.imagem2, "Ibanez Iceman"));
        listaPedido.add(new Pedido("1 de Novembro", "Entregue", "Chegou em 6 de Novembro", R.drawable.imagem3, "Amplificador Marshall"));
        listaPedido.add(new Pedido("18 de Outubro", "Entregue", "Chegou em 23 de Outubro", R.drawable.imagem4, "Les Paul"));
        listaPedido.add(new Pedido("5 de Outubro", "Entregue", "Chegou em 10 de Outubro", R.drawable.imagem5, "Kit Amp Marshall"));
        listaPedido.add(new Pedido("15 de Setembro", "Entregue", "Chegou em 20 de Setembro", R.drawable.imagem6, "Baixo Fender"));
        listaPedido.add(new Pedido("30 de Agosto", "Entregue", "Chegou em 2 de Setembro", R.drawable.imagem7, "Violão 12 Cordas"));
        listaPedido.add(new Pedido("27 de Maio", "Entregue", "Chegou em 4 de Junho", R.drawable.imagem8, "Viola Caipira"));
        listaPedido.add(new Pedido("11 de Julho", "Entregue", "Chegou em 15 de Julho", R.drawable.imagem9, "Piano Digital Korg"));
        listaPedido.add(new Pedido("20 de Julho", "Entregue", "Chegou em 26 de Julho", R.drawable.imagem10, "Bateria"));
    }
}
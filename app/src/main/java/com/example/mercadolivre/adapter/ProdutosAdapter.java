package com.example.mercadolivre.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mercadolivre.R;
import com.example.mercadolivre.model.Pedido;

import java.util.List;

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.MyViewHolder> {

    private List<Pedido> listaPedido;
    private Context context;

    public ProdutosAdapter(List<Pedido> lista, Context context) {
        this.listaPedido = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.entrega_detalhe, parent, false
        );
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Pedido pedido = listaPedido.get(position);

        holder.previsao.setText(pedido.getPrevisao());
        holder.imagemProduto.setImageResource(pedido.getImagemProduto());
        holder.status.setText(pedido.getStatus());
        holder.dataPedida.setText(pedido.getData());

        // Configura o evento de clique para exibir o Toast com o nome e status do produto
        holder.itemView.setOnClickListener(v -> {
            String message = "Produto: " + pedido.getNomeProduto() + " \nStatus: " + pedido.getStatus();
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return listaPedido.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView dataPedida;
        private TextView status;
        private TextView previsao;
        private ImageView imagemProduto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.dataPedida = itemView.findViewById(R.id.dataPedida);
            this.status = itemView.findViewById(R.id.status);
            this.previsao = itemView.findViewById(R.id.previsao);
            this.imagemProduto = itemView.findViewById(R.id.imagemProduto);
        }
    }
}

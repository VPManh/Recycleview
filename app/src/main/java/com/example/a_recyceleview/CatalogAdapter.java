package com.example.a_recyceleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class CatalogAdapter  extends RecyclerView.Adapter<CatalogAdapter.CatalogViewHolde>{
    private Context context;
    private List<Catalog> catalogList;


    public CatalogAdapter(Context context, List<Catalog> catalogList) {
        this.context = context;
        this.catalogList = catalogList;
    }

    public void setDta(List<Catalog> catalogList) {
        this.catalogList = catalogList;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public CatalogViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.catalog_book2,parent,false);
        return new CatalogViewHolde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatalogViewHolde holder, int position) {
        Catalog catalog =  catalogList.get(position);
        holder.tx_namecatalog.setText(catalog.getCatalogName());

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false);
        holder.rc_boook.setLayoutManager(linearLayoutManager);

        BookAdapter bookAdapter = new BookAdapter();
        bookAdapter.setData(catalog.getBookList());
        holder.rc_boook.setAdapter(bookAdapter);

    }

    @Override
    public int getItemCount() {
        return catalogList.size();
    }

    public class CatalogViewHolde extends RecyclerView.ViewHolder{

        private TextView tx_namecatalog;
        private RecyclerView rc_boook;
        public CatalogViewHolde(@NonNull View itemView) {
            super(itemView);
             tx_namecatalog = (TextView) itemView.findViewById(R.id.tx_cata_name);
             rc_boook = (RecyclerView) itemView.findViewById(R.id.re_catalog);
        }
    }
}

package com.example.a_recyceleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private List<Book>bookList;

    public void setData(List<Book> bookList) {
        this.bookList = bookList;
        notifyDataSetChanged();

    }

    // triển khai một RecyclerView.Adapter. Hàm này được gọi khi RecyclerView cần tạo một ViewHolder mới để hiển thị một item trong danh sách.
    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book,parent,false);
        return new BookViewHolder(view);
    }

    //gán giá trị
    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = bookList.get(position);
        holder.txt_name.setText(book.getName());
        holder.txt_moTa.setText(book.getMota());
        holder.img_book.setImageResource(book.getResoureImg());


    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{

        private TextView txt_name,txt_moTa;
        private ImageView img_book;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_name = itemView.findViewById(R.id.txname);
            txt_moTa = itemView.findViewById(R.id.txmota);
            img_book = itemView.findViewById(R.id.igbook);

        }
    }
}

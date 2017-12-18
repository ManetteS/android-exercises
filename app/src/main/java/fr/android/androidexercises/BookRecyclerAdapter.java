package fr.android.androidexercises;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Manette on 18/12/2017.
 */

class BookRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private final List<Book> books;
    private final LayoutInflater inflater;

    public BookRecyclerAdapter(Context context, List<Book> books) {
        this.books = books;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(inflater.inflate(R.layout.custom_view_item_book, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BookItemView biv = (BookItemView) holder.itemView;
        biv.bindView(books.get(position));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}

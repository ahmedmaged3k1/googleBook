package com.example.google_books.Adapter;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.google_books.Books.Books;
import com.example.google_books.DetailsActivity;
import com.example.google_books.R;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class Book_Adapter extends RecyclerView.Adapter<Book_Adapter.Book_holder> {
    private ArrayList<Books> books =new ArrayList<Books>();
    private Context context ;


    public Book_Adapter(Context context) {
        this.context=context;
    }

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Book_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View book_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.books_view,parent,false);
        Book_holder book_holder= new Book_holder(book_view);
        return book_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Book_holder holder, int position) {
        final Books temp_book = books.get(position);
        holder.book_image.animate();
        Books book_sample_viewholder =books.get(position);
        holder.book_name.setText(book_sample_viewholder.getBook_name());
        holder.book_author.setText(book_sample_viewholder.getBook_author());
        holder.book_pages.setText(book_sample_viewholder.getBook_pages()+" Pages");
        holder.book_reviews.setText(book_sample_viewholder.getBook_reviews()+"Reviews");
        holder.book_image.setImageResource(book_sample_viewholder.getBook_imgurl());
        holder.bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.bookmark.setImageResource(R.drawable.bookmarkred);
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent details_activity = new Intent(context,DetailsActivity.class);
              details_activity.putExtra("book_image",temp_book.getBook_imgurl());
                details_activity.putExtra("book_name",temp_book.getBook_name());
                details_activity.putExtra("book_author",temp_book.getBook_author());
                details_activity.putExtra("book_details",temp_book.getBook_description());
            //    details_activity.putExtra("position",position);
                details_activity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(details_activity);
                Log.d(TAG, "onClick: data added to intent and started");

            }
        });



    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class Book_holder extends RecyclerView.ViewHolder {
        private ImageView book_image;
        private ImageView bookmark;
        private TextView book_name;
        private TextView book_author;
        private TextView book_pages;
        private TextView book_reviews;


        public Book_holder(@NonNull View itemView) {
            super(itemView);
            book_image=itemView.findViewById(R.id.book_image);
            book_name=itemView.findViewById(R.id.book_name);
            book_author=itemView.findViewById(R.id.book_author);
            book_pages=itemView.findViewById(R.id.book_pages);
            book_reviews=itemView.findViewById(R.id.book_review);
            bookmark=itemView.findViewById(R.id.bookmark);

        }
    }
}

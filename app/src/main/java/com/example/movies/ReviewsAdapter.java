package com.example.movies;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ReviewsViewHolder>{

    private static final String TAG = "ReviewsAdapter";
    private List<Review> reviews = new ArrayList<>();

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ReviewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_item,
                parent,
                false);
        return new ReviewsAdapter.ReviewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsViewHolder holder, int position) {
        Review review = reviews.get(position);
        holder.textViewReviewAuthor.setText(review.getAuthor());
        holder.textViewReview.setText(review.getText());
        int colorResId;
        switch (review.getType()) {
            case Review.TYPE_POS:
                colorResId = android.R.color.holo_green_light;
                break;
            case Review.TYPE_NEG:
                colorResId = android.R.color.holo_red_light;
                break;
            default:
                colorResId = android.R.color.darker_gray;
        }
        int color = ContextCompat.getColor(holder.linearLayoutReview.getContext(), colorResId);
        holder.linearLayoutReview.setBackgroundColor(color);
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    static class ReviewsViewHolder extends RecyclerView.ViewHolder {

        private final TextView textViewReviewAuthor;
        private final TextView textViewReview;
        private final LinearLayout linearLayoutReview;

        public ReviewsViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewReviewAuthor = itemView.findViewById(R.id.textViewReviewAuthor);
            textViewReview = itemView.findViewById(R.id.textViewReview);
            linearLayoutReview = itemView.findViewById(R.id.linearLayoutReview);
        }
    }

}

// Generated by view binder compiler. Do not edit!
package com.example.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shared.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemNewsBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imgPoster;

  @NonNull
  public final ImageView ivBookmark;

  @NonNull
  public final TextView tvItemTitle;

  @NonNull
  public final TextView tvSummary;

  private ItemNewsBinding(@NonNull CardView rootView, @NonNull ImageView imgPoster,
      @NonNull ImageView ivBookmark, @NonNull TextView tvItemTitle, @NonNull TextView tvSummary) {
    this.rootView = rootView;
    this.imgPoster = imgPoster;
    this.ivBookmark = ivBookmark;
    this.tvItemTitle = tvItemTitle;
    this.tvSummary = tvSummary;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_news, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNewsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_poster;
      ImageView imgPoster = ViewBindings.findChildViewById(rootView, id);
      if (imgPoster == null) {
        break missingId;
      }

      id = R.id.iv_bookmark;
      ImageView ivBookmark = ViewBindings.findChildViewById(rootView, id);
      if (ivBookmark == null) {
        break missingId;
      }

      id = R.id.tv_item_title;
      TextView tvItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvItemTitle == null) {
        break missingId;
      }

      id = R.id.tv_summary;
      TextView tvSummary = ViewBindings.findChildViewById(rootView, id);
      if (tvSummary == null) {
        break missingId;
      }

      return new ItemNewsBinding((CardView) rootView, imgPoster, ivBookmark, tvItemTitle,
          tvSummary);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

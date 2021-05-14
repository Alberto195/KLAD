// Generated by view binder compiler. Do not edit!
package com.example.finema.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.finema.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HigherLowerFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardview1;

  @NonNull
  public final CardView cardview2;

  @NonNull
  public final ImageView img1;

  @NonNull
  public final ImageView img2;

  @NonNull
  public final TextView points;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView txtFilm1;

  @NonNull
  public final TextView txtFilm2;

  private HigherLowerFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardview1, @NonNull CardView cardview2, @NonNull ImageView img1,
      @NonNull ImageView img2, @NonNull TextView points, @NonNull TextView textView,
      @NonNull TextView txtFilm1, @NonNull TextView txtFilm2) {
    this.rootView = rootView;
    this.cardview1 = cardview1;
    this.cardview2 = cardview2;
    this.img1 = img1;
    this.img2 = img2;
    this.points = points;
    this.textView = textView;
    this.txtFilm1 = txtFilm1;
    this.txtFilm2 = txtFilm2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HigherLowerFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HigherLowerFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.higher_lower_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HigherLowerFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardview1;
      CardView cardview1 = rootView.findViewById(id);
      if (cardview1 == null) {
        break missingId;
      }

      id = R.id.cardview2;
      CardView cardview2 = rootView.findViewById(id);
      if (cardview2 == null) {
        break missingId;
      }

      id = R.id.img1;
      ImageView img1 = rootView.findViewById(id);
      if (img1 == null) {
        break missingId;
      }

      id = R.id.img2;
      ImageView img2 = rootView.findViewById(id);
      if (img2 == null) {
        break missingId;
      }

      id = R.id.points;
      TextView points = rootView.findViewById(id);
      if (points == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.txt_film1;
      TextView txtFilm1 = rootView.findViewById(id);
      if (txtFilm1 == null) {
        break missingId;
      }

      id = R.id.txt_film2;
      TextView txtFilm2 = rootView.findViewById(id);
      if (txtFilm2 == null) {
        break missingId;
      }

      return new HigherLowerFragmentBinding((ConstraintLayout) rootView, cardview1, cardview2, img1,
          img2, points, textView, txtFilm1, txtFilm2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

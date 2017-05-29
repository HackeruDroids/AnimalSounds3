package hackeru.edu.animalsounds;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * View Holder: holds the views: find the views by id. save the references to the views.
 */

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    ImageView ivAnimal;
    public AnimalViewHolder(View v) {
        super(v);
        ivAnimal = (ImageView) v.findViewById(R.id.ivAnimal);
    }
}

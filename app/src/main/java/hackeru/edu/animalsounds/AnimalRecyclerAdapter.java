package hackeru.edu.animalsounds;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by hackeru on 29/05/2017.
 */

public class AnimalRecyclerAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    //Properties:
    //List<Animal>
    private LayoutInflater inflater;
    private Context context;

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

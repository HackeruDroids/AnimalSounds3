package hackeru.edu.animalsounds;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by hackeru on 29/05/2017.
 */

public class AnimalRecyclerAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    //Properties:
    private List<Animal> animals;
    private LayoutInflater inflater;
    private Context context;

    //Constructor:
    public AnimalRecyclerAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        animals = AnimalDataSource.getAnimals();
    }

    //instantiate the AnimalViewHolder and return it.
    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Create a view from XML->View (v)
        View v = inflater.inflate(R.layout.animal_item, parent, false);
        //Create a new AnimalViewHolder(v)
        AnimalViewHolder vh = new AnimalViewHolder(v);
        //return the AnimalViewHolder
        return vh;
    }

    //show the data inside the controls (Views)...setText, setImageResource
    //Data Binding
    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.ivAnimal.setImageResource(animal.getImageResID());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}

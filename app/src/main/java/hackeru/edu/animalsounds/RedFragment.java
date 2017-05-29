package hackeru.edu.animalsounds;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment {


    public RedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_red, container, false);

        RecyclerView rvAnimals = (RecyclerView) v.findViewById(R.id.rvAnimals);
        rvAnimals.setAdapter(new AnimalRecyclerAdapter(getActivity()));
        rvAnimals.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        return v;
    }

}

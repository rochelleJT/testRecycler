package google.com.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder>{

    private ArrayList<People> peoples;

    public PeopleAdapter(ArrayList<People> peoples) {
        this.peoples = peoples;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtAge;
        ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtAge = itemView.findViewById(R.id.txt_age);
        }
    }

    @NonNull
    @Override
    public PeopleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_people, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleAdapter.ViewHolder holder, int position) {
        People people = peoples.get(position);
        holder.txtName.setText(people.getName());
        holder.txtAge.setText(String.valueOf(people.getAge()));
    }

    @Override
    public int getItemCount() {
        return peoples.size();
    }
}

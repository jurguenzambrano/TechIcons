package pe.edu.upc.techicons;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jurguen Zambrano on 24/03/2017.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {
    List<Person> people;
    public void setPeople(List<Person> people) { this.people = people; }
    @Override
    public PeopleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PeopleAdapter.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView personCardView;
        ImageView pictureImageView;
        TextView nameTextView;
        TextView titleTextView;
        TextView companyTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            personCardView = (CardView) itemView.findViewById(R.id.personCardView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            titleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
            companyTextView = (TextView) itemView.findViewById(R.id.companyTextView);
        }
    }
}
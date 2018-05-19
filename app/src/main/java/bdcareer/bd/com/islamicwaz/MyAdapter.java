package bdcareer.bd.com.islamicwaz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 19/5/18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

   private List<ListItem> listItems;
   private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
       return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);
        holder.texHead.setText(listItem.getHead());
        holder.texDesc.setText(listItem.getDesc());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView texHead;
        public  TextView texDesc;
        public ViewHolder(View itemView) {
            super(itemView);

            texHead =(TextView)itemView.findViewById(R.id.heading);
            texDesc =(TextView)itemView.findViewById(R.id.desc);
        }
    }
}

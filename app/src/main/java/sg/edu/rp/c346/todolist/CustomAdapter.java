package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDo> toDoList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ToDo> objects){
        super(context, resource,objects);
        parent_context = context;
        layout_id = resource;
        toDoList = objects;

    }
    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView;
        if (convertView == null) {
            rowView = inflater.inflate(layout_id, parent, false);
            TextView tvName = rowView.findViewById(R.id.tvItem);
            TextView tvTitle = rowView.findViewById(R.id.tvDate);
            ToDo currentItem = toDoList.get(position);
            tvName.setText(currentItem.getToDoItem());
            tvTitle.setText(currentItem.getDate());
           } else {
            rowView = convertView;
        }
        return rowView;
    }
}

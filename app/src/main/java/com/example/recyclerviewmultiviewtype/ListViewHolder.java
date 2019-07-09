package com.example.recyclerviewmultiviewtype;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListViewHolder extends RecyclerView.ViewHolder {
    private TextView listTXT;
    private MyModel data;

    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        listTXT = itemView.findViewById(R.id.listeTxt);
    }

    /**
     * You can use Polymorphism right away
     */
    public void setModel(MyModel data){
        this.data = data;
    }

    /**
     * Not only you can settext but also you can set listener for that
     * view right away
     */
    public void setDatatoSpecificfield(){
        listTXT.setText(data.getData());
    }
}

package com.example.recyclerviewmultiviewtype;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdViewHolder extends RecyclerView.ViewHolder {
    private MyModel data;
    private TextView AdTXT;
    public AdViewHolder(@NonNull View itemView) {
        super(itemView);
        AdTXT = itemView.findViewById(R.id.adtxt);
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
        AdTXT.setText(data.getData());
    }
}

package com.example.recyclerviewmultiviewtype;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BannerViewHolder extends RecyclerView.ViewHolder {
    private TextView bannerTXT;
    private MyModel data;

    public BannerViewHolder(@NonNull View itemView) {
        super(itemView);
        bannerTXT = itemView.findViewById(R.id.bannerTxt);

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
        bannerTXT.setText(data.getData());
    }


}

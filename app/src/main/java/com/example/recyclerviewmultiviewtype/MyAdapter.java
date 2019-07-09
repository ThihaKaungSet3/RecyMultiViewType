package com.example.recyclerviewmultiviewtype;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final String TAG = "MyAdapter";
    private List<MyModel> myModels;
    private Context context;
    private LayoutInflater layoutInflater;
    public static final int BANNER_VIEW_TYPE  = 0;
    public static final int LIST_VIEW_TYPE = 1;
    public static final int AD_VIEW_TYPE = 2;
    public static final int MOVIE_VIEW_TYPE = 3;

    public MyAdapter(List<MyModel> myModels, Context context){
        this.context = context;
        this.myModels = myModels;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getItemViewType(int position) {
        MyModel myModel = myModels.get(position);

        /**
         * You can check with instanceof if you have many model
         * matching with String is not safe
         */
        switch (myModel.getType()){
            case "banner" :
                Log.d(TAG, "banner ");
                return 0;
            case "list" :
                Log.d(TAG, "list ");
                return 1;
            case "AD" :
                Log.d(TAG, "AD ");
                return 2;
            case "movie":
                return 3;
            default: return 1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType){
            case BANNER_VIEW_TYPE :
                Log.d(TAG, "bannerok ");
                return new BannerViewHolder(getView(R.layout.banner_item,parent));
            case LIST_VIEW_TYPE :
                Log.d(TAG, "listok ");
                return new ListViewHolder(getView(R.layout.list_item,parent));
            case AD_VIEW_TYPE :
                Log.d(TAG, "adok ");
                return new AdViewHolder(getView(R.layout.ad_item,parent));
            case MOVIE_VIEW_TYPE:
                return new ParentMovieViewHolder(getView(R.layout.horizontal_view,parent));

            default: return new BannerViewHolder(getView(R.layout.banner_item,parent));
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyModel myModel = myModels.get(position);

        switch (getItemViewType(position)){
            case BANNER_VIEW_TYPE : BannerViewHolder bannerHolder = (BannerViewHolder)holder;
                                    bannerHolder.setModel(myModel);
                                    bannerHolder.setDatatoSpecificfield();
                                    break;
            case LIST_VIEW_TYPE: ListViewHolder listViewHolder = (ListViewHolder)holder;
                                    listViewHolder.setModel(myModel);
                                    listViewHolder.setDatatoSpecificfield();
                                    break;
            case AD_VIEW_TYPE: AdViewHolder adViewHolder = (AdViewHolder) holder;
                                    adViewHolder.setModel(myModel);
                                    adViewHolder.setDatatoSpecificfield();
                                    break;
            case MOVIE_VIEW_TYPE: ParentMovieViewHolder movieViewHolder = (ParentMovieViewHolder)holder;
                                    movieViewHolder.setData(context,myModel.getMovie());
                                    break;
        }

    }

    private View getView(int layoutres,ViewGroup parent){
        return layoutInflater.inflate(layoutres,parent,false);
    }

    @Override
    public int getItemCount() {
        return myModels.size();
    }

}

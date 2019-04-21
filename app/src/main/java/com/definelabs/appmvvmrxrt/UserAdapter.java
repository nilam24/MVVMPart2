package com.definelabs.appmvvmrxrt;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class UserAdapter extends RecyclerView.Adapter<userViewHolder> {
    Context context;
    public UserAdapter(Context context){
        this.context=context;
    }
    @NonNull
    @Override
    public userViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main,viewGroup,false);

        return new userViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull userViewHolder userViewHolder, int position) {
//        userViewHolder.img.setImageResource(R.drawable.ic_launcher_background);
         userViewHolder.nam.setText("name1");
         userViewHolder.phon.setText("121212121");
         userViewHolder.email.setText("weeewe");

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

 class userViewHolder extends RecyclerView.ViewHolder{
    TextView nam,phon,email;
    ImageView img;

    public userViewHolder(View view){
        super(view);

        nam=(TextView)view.findViewById(R.id.tv_name);
        phon=(TextView)view.findViewById(R.id.tv_phone);
        email=(TextView)view.findViewById(R.id.tv_email);

    }
}

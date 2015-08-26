package com.aka.feedbackportal;

/**
 * Created by aksha on 8/26/2015.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView userName;
    public ImageView profileImage;
    public TextView callDetails;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        //implementing onClickListener
        itemView.setOnClickListener(this);
        userName = (TextView)itemView.findViewById(R.id.user_name);
        callDetails= (TextView)itemView.findViewById(R.id.call_details);
    }

    @Override
    public void onClick(View view) {
        //Every time you click on the row toast is displayed
        Toast.makeText(view.getContext(),  "You got a call from "+userName.getText()+"\n"+callDetails.getText() , Toast.LENGTH_LONG).show();
    }
}
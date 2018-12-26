package io.github.yashxd.gaitondeapp;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

public class GViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTv;
    private TextView deathTypeTv;
    private TextView deathTimeTv;
    private EditText death;
    private Button kill;
    private String name, killed, type, by;
    private int time;
    private SimpleDraweeView image;

    public GViewHolder(View itemView) {
        super(itemView);//itemView is view_g.xml
        nameTv = itemView.findViewById(R.id.tv_name);
        deathTypeTv = itemView.findViewById(R.id.tv_death_type);
        deathTimeTv = itemView.findViewById(R.id.tv_death_time);
        death = itemView.findViewById(R.id.et1);
        kill = itemView.findViewById(R.id.kill);
        image = itemView.findViewById(R.id.my_image_view);
    }

    public void populate(GModel badGuy) {
        name=badGuy.getPersonName();
        nameTv.setText(badGuy.getPersonName());

        type=badGuy.getDeathType();
        deathTypeTv.setText(badGuy.getDeathType());
        //int time=badGuy.getDeathTime();
        time=badGuy.getDeathTime();
        String text1=Integer.toString(time);
        deathTimeTv.setText(text1);

        by=badGuy.getFamilyMembers();
        death.setHint(badGuy.getFamilyMembers());

        killed=badGuy.getKill();
        kill.setText(badGuy.getKill());

        final Uri imageUri = Uri.parse(badGuy.getPhoto());
        //image.setImageURI(badGuy.getPhoto());

        kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(itemView.getContext() , name+" got "+type+" by "+by+" at "+time+"\n I dont know... ", Toast.LENGTH_SHORT ).show();
               image.setImageURI(imageUri);
            }
        });
    }

    //kill.OnClickListener()
}

package com.ali.kaskroutdelivry;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class slideadapter extends PagerAdapter {
    Context context;

    public slideadapter(Context context){
        this.context=context;
    }
    int images[]={
       R.drawable.img1 , R.drawable.img2, R.drawable.img3,
    };

    int heading []={
            R.string.trouver ,  R.string.choisir ,R.string.votreCommande,
    };
    int descreption []={
            R.string.rechercher ,  R.string.faites ,R.string.recevez,
    };

    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}

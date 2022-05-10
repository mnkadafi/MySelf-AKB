package com.mnkadafi.myself_akb.ui;

//<!--10 Mei 2022-->
//<!--10119197-->
//<!--Mochamad Nurkhayal Kadafi-->
//<!--IF-5-->

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mnkadafi.myself_akb.AboutDialog;
import com.mnkadafi.myself_akb.R;

public class ProfileFragment extends Fragment {

    ImageView ivFacebook, ivInstagram, ivGithub, ivWhatsapp, ivGmail, ivMap;
    TextView tvAbout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        ivFacebook = root.findViewById(R.id.iv_facebook);
        ivInstagram = root.findViewById(R.id.iv_instagram);
        ivGithub = root.findViewById(R.id.iv_github);
        ivWhatsapp = root.findViewById(R.id.iv_whatsapp);
        ivGmail = root.findViewById(R.id.iv_gmail);
        ivMap = root.findViewById(R.id.iv_map);
        tvAbout = root.findViewById(R.id.tv_about);

        // facebook
        ivFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent();
                fb.setAction(Intent.ACTION_VIEW);
                fb.addCategory(Intent.CATEGORY_BROWSABLE);
                fb.setData(Uri.parse("https://web.facebook.com/simple1998"));
                startActivity(fb);
            }
        });

        // instagram
        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig = new Intent();
                ig.setAction(Intent.ACTION_VIEW);
                ig.addCategory(Intent.CATEGORY_BROWSABLE);
                ig.setData(Uri.parse("https://www.instagram.com/mnkadafi"));
                startActivity(ig);
            }
        });

        // twitter
        ivGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tw = new Intent();
                tw.setAction(Intent.ACTION_VIEW);
                tw.addCategory(Intent.CATEGORY_BROWSABLE);
                tw.setData(Uri.parse("https://github.com/mnkadafi"));
                startActivity(tw);
            }
        });

        // whatsapp
        ivWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wa = new Intent();
                wa.setAction(Intent.ACTION_VIEW);
                wa.addCategory(Intent.CATEGORY_BROWSABLE);
                wa.setData(Uri.parse("https://api.whatsapp.com/send?phone=6285155018189"));
                startActivity(wa);
            }
        });

        // gmail
        ivGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gm = new Intent();
                gm.setAction(Intent.ACTION_VIEW);
                gm.addCategory(Intent.CATEGORY_BROWSABLE);
                gm.setData(Uri.parse("mailto:mnkadafi98@gmail.com"));
                startActivity(gm);
            }
        });

        // map
        ivMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent();
                map.setAction(Intent.ACTION_VIEW);
                map.addCategory(Intent.CATEGORY_BROWSABLE);
                map.setData(Uri.parse("https://goo.gl/maps/XSukPyqHxifGUYZu9"));
                startActivity(map);
            }
        });

        // about
        tvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutDialog aboutDialog = new AboutDialog();
                aboutDialog.show(getFragmentManager(),"AboutDialogFragment");
            }
        });

        return root;
    }
}
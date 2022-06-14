package com.banrossyn.IntroInstory;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.banrossyn.IntroInstory.databinding.MainActivityBinding;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MainActivity activity;
    MainActivityBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;

        binding.rvInstaPrivate.setOnClickListener(this);
        binding.insGallery.setOnClickListener(this);
        binding.rvFB.setOnClickListener(this);
        binding.rvWhatsApp.setOnClickListener(this);
        binding.rvGallery.setOnClickListener(this);
        binding.mShare.setOnClickListener(this);
        binding.mStars.setOnClickListener(this);
        binding.mFeedback.setOnClickListener(this);
        binding.mPrivacy.setOnClickListener(this);
        binding.mMore.setOnClickListener(this);
        binding.mHelp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == binding.rvInstaPrivate) {
            callInstaActivityPrivate();
        } else if (v == binding.rvFB) {

                callFacebookActivity();

        } else if (v == binding.rvWhatsApp) {

                callWhatsappActivity();

        } else if (v == binding.rvGallery) {

                callGalleryActivity();

        } else if (v == binding.mShare) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
            String shareMessage = "**InStory** \n Instagram Facebook Post and Story saver , Whatsapp & WA B Status Saver \n Download Now\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID;
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(shareIntent, "choose one"));
        } else if (v == binding.mStars) {
            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)));

        } else if (v == binding.mFeedback) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:" + MainActivity.this.getString(R.string.email_feedback)));
            intent.setPackage("com.google.android.gm");
            intent.putExtra(Intent.EXTRA_SUBJECT, MainActivity.this.getString(R.string.app_name));
            startActivity(intent);
        } else if (v == binding.mPrivacy) {
            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.policy_url))));

        } else if (v == binding.mMore) {
            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.developerlink))));

        } else if (v == binding.insGallery) {


        } else if (v == binding.mHelp) {

        }
    }




    public void callGalleryActivity() {

    }

    public void callInstaActivityPrivate() {

    }

    public void callWhatsappActivity() {

    }

    public void callFacebookActivity() {

    }







}
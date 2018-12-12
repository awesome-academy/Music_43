package com.example.uyen.music_43.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.uyen.music_43.R;

public class DownloadFragment extends Fragment {

    public static Fragment newInstance() {
        DownloadFragment downloadFragment = new DownloadFragment();
        return downloadFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_download, container, false);
        return view;
    }
}

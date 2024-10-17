package com.example.myapplicationandroid.ui.chi;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplicationandroid.R;

public class FragmentKhoanChi extends Fragment {

    private FragmentKhoanChiViewModel mViewModel;

    public static FragmentKhoanChi newInstance() {
        return new FragmentKhoanChi();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_khoan_chi, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FragmentKhoanChiViewModel.class);
        // TODO: Use the ViewModel
    }

}
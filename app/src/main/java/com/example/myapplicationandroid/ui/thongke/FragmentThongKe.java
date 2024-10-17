package com.example.myapplicationandroid.ui.thongke;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.myapplicationandroid.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentThongKe#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentThongKe extends Fragment {

    private ThongKeViewModel mThongKeViewModel;
    private EditText mEtTongThu;

    public FragmentThongKe() {
    }


    public static FragmentThongKe newInstance() {
        FragmentThongKe fragment = new FragmentThongKe();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mThongKeViewModel = new ViewModelProvider(this).get(ThongKeViewModel.class);
//        mThongKeViewModel.getTongThu().observe(getActivity(), new Observer<Float>() {
//            @Override
//            public void onChanged(Float tong) {
//                mEtTongThu.setText(""+ tong);
//            }
//        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_thong_ke, container, false);
        //mEtTongThu = view.findViewById(R.id.etTongthu);
        return view;
    }
}
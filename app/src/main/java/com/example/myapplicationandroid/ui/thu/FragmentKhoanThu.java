package com.example.myapplicationandroid.ui.thu;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplicationandroid.MainActivity;
import com.example.myapplicationandroid.R;
import com.example.myapplicationandroid.adapter.ThuRAdapter;
import com.example.myapplicationandroid.entity.Thu;

import java.util.List;

public class FragmentKhoanThu extends Fragment {

    private FragmentKhoanThuViewModel mViewModel;
    private RecyclerView mRv;
    private ThuRAdapter mAdapter;

    public static FragmentKhoanThu newInstance() {
        return new FragmentKhoanThu();
    }

    public FragmentKhoanThuViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRv = view.findViewById(R.id.recyclerView);
        mAdapter = new ThuRAdapter(getActivity());
        mRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRv.setAdapter(mAdapter);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_khoan_thu, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FragmentKhoanThuViewModel.class);
        mViewModel.getAllThu().observe(getActivity(), new Observer<List<Thu>>() {
            @Override
            public void onChanged(List<Thu> thus) {
                mAdapter.setList(thus);
            }
        });
    }

}
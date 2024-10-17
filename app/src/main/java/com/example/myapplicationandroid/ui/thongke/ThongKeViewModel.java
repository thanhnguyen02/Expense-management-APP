package com.example.myapplicationandroid.ui.thongke;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.myapplicationandroid.repository.RepositoryThu;

public class ThongKeViewModel extends AndroidViewModel {
    private RepositoryThu mRepositoryThu;
    private LiveData<Float> mTongThu;
    public ThongKeViewModel(@NonNull Application application) {
        super(application);

        mRepositoryThu = new RepositoryThu(application);
        mTongThu = mRepositoryThu.sumTongThu();
    }

    public LiveData<Float> getTongThu() {
        return mTongThu;
    }
}

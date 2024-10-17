package com.example.myapplicationandroid.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplicationandroid.entity.LoaiThu;
import com.example.myapplicationandroid.entity.Thu;

import java.util.List;

@Dao
// phương thức để thực hiện các thao tác / bảng loại thu
public interface ThuDao {
    @Query("Select * from thu")
    LiveData<List<Thu>> findAll();

    @Query("Select sum(sotien) from thu")
    LiveData<Float> sumTongThu();

    @Insert
    void insert(Thu thu);

    @Update
    void update (Thu thu);

    @Delete
    void delete(Thu thu);
}

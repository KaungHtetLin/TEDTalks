package net.kaunghtetlin.ted.data.db;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import net.kaunghtetlin.ted.data.vos.TagVO;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Kaung Htet Lin on 1/31/2018.
 */

public class GsonToListTagConvector {
    @TypeConverter
    public static List<TagVO> fromString(String value) {
        Type listType = new TypeToken<List<TagVO>>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromArrayList(List<TagVO> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }
}

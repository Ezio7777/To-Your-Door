package com.example.toyourdoor;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    final static String DBNAME = "mydatabase.db";
    final static int DBVERSION =2;


    public DBHelper(@Nullable Context context) {
        super(context, DBNAME,null, DBVERSION);
    }

    @Override
    
    //DATABASE INSERT
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table oreders" +
                        "(id integer primary key autoincrement," +
                        "name text," +
                        "phone text," +
                        "price integer," +
                        "image integer," +
                        "quantity integer," +
                        "description text," +
                        "foodname text)"
            
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP table if exists orders");
        onCreate(db);
    }
    public boolean insertOrder(String name,String phone,int price,int image,String desc,String foodName,int quantity){
         SQLiteDatabase database= getReadableDatabase();
        ContentValues  values= new ContentValues();
        values.put("name",name);
        values.put("phone",phone);
        values.put("price",price);
        values.put("image",image);
        values.put("description",desc);
        values.put("foodName",foodName);
        values.put("quantity",quantity);

        long id = database.insert("orders",null,values);
        if(id<=0){
            return false;
        }
        else{
            return true;
        }
    }
}

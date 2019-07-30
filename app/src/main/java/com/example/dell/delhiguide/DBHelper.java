package com.example.dell.delhiguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public static final String DATABASE_NAME="MyDBName.db";
    public static final String REGISTER_TABLE_NAME = "register";
    public static final String REGISTER_COLUMN_ID = "id";
    public static final String REGISTER_COLUMN_EMAIL = "email";
    public static final String REGISTER_COLUMN_PASSWORD = "pass";
    public static final String REGISTER_COLUMN_PHONE = "phone";

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table register" + "(email text primary key,pass text,phone text)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS register");
        onCreate(sqLiteDatabase);
    }
    //inserting in database
    public boolean insert(String email,String pass,String phone)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();

        contentValues.put("email",email);
        contentValues.put("pass", pass);
        contentValues.put("phone",phone);

        db.insert("register",null,contentValues);
        return true;
    }

    //checking if email exists
    public Boolean getData(String email)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("select * from register where email=?",new String[]{email});
        if(res.getCount()>0)
            return false;
        else
            return true;
    }

    //checking if email & password exists
    public Boolean empass(String email,String pass)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from register where email=? and pass=?",new String[]{email,pass});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }


}

package com.tcsrobotics.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jayhamilton on 1/28/16.
 */
public class FTCDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "ftc.db";
    public static final String TABLE_NAME = "ftc_table";
    public static final String ID="ID";
    public static final String NAME="NAME";
    public static final String RANK="RANK";
    public static final String COMMENT="COMMENT";
    public static final String SCOUTREPORT="SCOUTREPORT";
    public static final String DATE="DATE";


    public FTCDBHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("CREATE TABLE  " + TABLE_NAME + " ( TEAM_ID VARCHAR PRIMARY KEY, NAME TEXT,  RANK INTEGER, COMMENT TEXT, SCOUTREPORT BLOB, MATCHDATE DATE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}

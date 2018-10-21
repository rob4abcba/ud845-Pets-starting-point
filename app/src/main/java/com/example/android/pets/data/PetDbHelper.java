package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

public class PetDbHelper extends SQLiteOpenHelper {

//public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    private static final String DATABASE_NAME = "shelters.db"; //was petreader.db

        private static final int DATABASE_VERSION = 1; //should be second

        public PetDbHelper(Context context){
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            //what was passed in
        }

        public void onCreate(SQLiteDatabase db ) { //initialize table
            String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + PetEntry.TABLE_NAME + "("
                    + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL,"
                    + PetEntry.COLUMN_PET_BREED + " TEXT, "
                    + PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                    + PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

            db.execSQL(SQL_CREATE_PETS_TABLE);
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
//blank for now
        }
    }



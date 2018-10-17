package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {  // needs to be final & can't be extended

    private PetContract(){} //name of table is private/ outer class

        public static abstract class PetEntry implements BaseColumns{
        //name of table implements the columns inside of it.
            //string constants for table name/headings

        public final static String TABLE_NAME = "pets";

        public final static String _ID = BaseColumns._ID; //id for table
        public final static String COLUMN_PET_NAME = "name"; //set up of columns
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;


    }
}

package com.keiraindustries.mythings.Data;

import android.content.Context;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 * Created by keira on 2/4/20.
 */

public class DataManager {
    private static DataManager single_instance=null;
	
	public static final String THING_MAP_FNAME = "thing_map.ser";
	

    ThingMap thingMap;
	Category mainCat;
    Gson gson;
	SettingsLog settingsLog;
	boolean initialized;
	Context appContext;

    // static method to create instance of Singleton class
    public static DataManager instance()
    {
        // To ensure only one instance is created
        if (single_instance == null)
        {
            single_instance = new DataManager();
        }
        return single_instance;
    }

    private DataManager() {


    }

    public boolean initialize(Context context) {
        if (initialized) {return false;}
        if (context == null) {return false;}
        appContext = context;

        gson = new Gson();

        //Temp
        thingMap = new ThingMap();
        saveObj("myData/" + THING_MAP_FNAME, thingMap);
        //Temp

        //Load settingsLog

        //Load thingMap

        //Load Category chain

        //Load relevant dataUnits
        //Determine date range, and applicable dataUnit names
        //Check if available, and load


        initialized = true;
        return true;
    }

    private <T> Object loadObject(String path, Class<T> myThing) {
        Object tempThing = null;
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            tempThing = gson.fromJson((String)in.readObject(),myThing);
            in.close();
            fileIn.close();

        } catch (Exception i) {
            i.printStackTrace();
        }
        return tempThing;
    }

    public void saveObj(String path, Object thing) {
        try {
            File temp = new File(appContext.getFilesDir() + "/" + path);
            if (!temp.getParentFile().exists()) {
                temp.getParentFile().mkdirs();
            }
            FileOutputStream fileOut = new FileOutputStream(appContext.getFilesDir() + "/" + path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(gson.toJson(thing));
            out.close();
            fileOut.close();
        } catch (Exception i) {
            i.printStackTrace();
        }

    }

    public String getPath() {
        String path;
        File temp = new File(appContext.getFilesDir() + "/" + "test.ser");
        path = temp.getAbsolutePath();
        return path;
    }

}

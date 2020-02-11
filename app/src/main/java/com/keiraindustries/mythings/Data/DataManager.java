package com.keiraindustries.mythings.Data;

import com.google.gson.Gson;

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
	
	public static final String THING_MAP_FNAME;
	

    ThingMap thingMap;
	Category mainCat;
    Gson gson;
	SettingsLog settingsLog;

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
        gson = new Gson();
		
		//Load settingsLog
		
		//Load thingMap
		
		//Load Category chain
		
		//Load relevant dataUnits
			//Determine date range, and applicable dataUnit names
			//Check if available, and load

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

    public void saveObj(Gson gson, String path, Object thing) {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(gson.toJson(thing));
            out.close();
            fileOut.close();
        } catch (Exception i) {
            i.printStackTrace();
        }

    }

}

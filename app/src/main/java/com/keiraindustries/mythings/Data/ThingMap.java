package com.keiraindustries.mythings.Data;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by keira on 2/4/20.
 */

public class ThingMap implements Serializable {

    HashMap<Integer, Thing> thingMap;

    public ThingMap() {
        thingMap = new HashMap<>();
        Thing test = new Thing();
        test.setDeprecated(false);
        test.setDescription("Test");
        test.setId(1);
        test.setTitle("Test Title");
        thingMap.put(test.getId(), test);
    }
	
	

}

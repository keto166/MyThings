package com.keiraindustries.mythings.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by tom on 2/4/20.
 */

public class Category implements Serializable {

    String title;
    ArrayList<Integer> subThings;		//List of things by ID in this category
	ArrayList<Category> subThings;
    //Test

}

package com.keiraindustries.mythings.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by keira on 2/4/20.
 */

public class Category implements Serializable {

    String title;
    ArrayList<Integer> subThings;		//List of things by ID in this category
	ArrayList<Category> subCats;
    //Test

}

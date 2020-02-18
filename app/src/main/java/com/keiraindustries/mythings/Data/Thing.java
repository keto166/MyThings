package com.keiraindustries.mythings.Data;

import java.io.Serializable;

/**
 * Created by keira on 2/4/20.
 */

public class Thing implements Serializable {

    private int id;
	private String title;
    private String description;
    private int depracatedTo;
    boolean deprecated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDepracatedTo() {
        return depracatedTo;
    }

    public void setDepracatedTo(int depracatedTo) {
        this.depracatedTo = depracatedTo;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }


	
	

}

package com.keiraindustries.mythings.Data;

import java.io.Serializable;

/**
 * Created by keira on 2/4/20.
 */

public class SettingsLog implements Serializable {

    private long dataUnitInterval;	//This determines how long of a timeframe a dataunit should be.  Too long results in excessively large files, and too short results in large quantities of files.
	private long defHistoryTime;	//This determines how far back to look for data, in the usual review.
	
	
}

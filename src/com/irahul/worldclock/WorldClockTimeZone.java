/*
 * Copyright (C) 2012 iRahul.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.irahul.worldclock;

import java.util.TimeZone;
/**
 * TimeZone representation. Decorator for java.util.Timezone
 * @author rahul
 *
 */
public class WorldClockTimeZone {
	private TimeZone timeZone;
	private String displayName;
	
	public WorldClockTimeZone(TimeZone timeZone) {
		this(timeZone, timeZone.getDisplayName());
	}	
	
	public WorldClockTimeZone(TimeZone timeZone, String displayName) {		
		this.timeZone = timeZone;
		this.displayName = displayName;
	}


	@Override
	public String toString() {		
		return this.timeZone.getID()+" ("+this.getDisplayName()+")";
	}

	public String getId() {		
		return this.timeZone.getID();
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public TimeZone getTimeZone() {
		return this.timeZone;
	}
	
	@Override
	public boolean equals(Object o) {		
		if(o==null) return false;
		if(!(o instanceof WorldClockTimeZone)) return false;	
		
		WorldClockTimeZone that = (WorldClockTimeZone)o;				
		return this.getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return this.getId().hashCode();
	}
}
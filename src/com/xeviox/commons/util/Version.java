/*******************************************************************************
 * Copyright (c) 2013 Benjamin Pabst and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Benjamin Pabst - initial API and implementation
 ******************************************************************************/

package com.xeviox.commons.util;

import static com.xeviox.commons.conditions.Clauses.when;

/**
 * Represents a version in the following scheme "[Major].[Minor]-[Patch][State].
 * E. g. "1.0-0", "1.0-5b", "1.0-5alpha"
 */
public class Version implements Comparable<Version> {
	private final int major;
	private final int minor;
	private final int patch;
	private final String state;
	
	public Version(final int major, final int minor, final int patch) {
		this(major, minor, patch, "");
	}
	
	public Version(final int major, final int minor, final int patch, final String state) {
		this.major = major;
		this.minor = minor;
		this.patch = patch;
		this.state = state;
	}
	
	public static Version fromString(final String version) {
		return parseString(version);
	}
	
	public static Version parseString(final String version) {
		int dot = version.indexOf('.');
		when(dot < 1).throwIllegalArgument();
		
		int minus = version.indexOf('-');
		when(minus < dot +1).throwIllegalArgument();
		
		int major = Integer.parseInt(version.substring(0, dot));
		int minor = Integer.parseInt(version.substring(dot +1, minus));
		
		int lastNumber = -1;
		for (int i = minus+1; i < version.length(); i++) {
			if (Character.isDigit(version.charAt(i))) {
				lastNumber = i;
			}
		}
		when(lastNumber < minus).throwIllegalArgument();
		
		int patch = Integer.parseInt(version.substring(minus +1, lastNumber +1));
		String state = version.substring(lastNumber +1);
		
		return new Version(major, minor, patch, state);
	}

	@Override
	public int compareTo(Version o) {
		if (o.major > major) {
			return -1;
		}
		else if (o.major < major) {
			return 1;
		}
		
		if (o.minor > minor) {
			return -1;
		}
		else if (o.minor < minor) {
			return 1;
		}
		
		if (o.patch > patch) {
			return -1;
		}
		else if (o.patch > patch) {
			return 1;
		}
		
		return state.compareTo(o.state);
	}
	
	@Override
	public String toString() {
		return String.format("%d.%d-%d%s", major, minor, patch, state);
	}

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public int getPatch() {
		return patch;
	}

	public String getState() {
		return state;
	}
}

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

/**
 * Common helper methods for Strings.
 */
public final class Strings {
	
	/**
	 * @return true if the given string s is null or empty, otherwise false.
	 */
	public static boolean isNullOrEmpty(final String s) {
		if (s == null || s.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * @return true if the given string s is null, empty or just contains whitespace, otherwise
	 *         false.
	 */
	public static boolean isBlank(final String s) {
		if (s == null || s.length() < 1 || s.trim().isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	// prevent instantiation
	private Strings() { }
}

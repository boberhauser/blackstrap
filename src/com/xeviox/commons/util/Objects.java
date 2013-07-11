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
 * Common object helper methods.
 */
public final class Objects {

	/**
	 * @return true if the given object o is null, otherwise false.
	 */
	public static boolean isNull(final Object o) {
		return o == null ? true : false;
	}
	
	// prevent instantiation
	private Objects() { }
}

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

import static com.xeviox.commons.util.Strings.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringsTest {

	@Test
	public void testIsNullOrEmpty() {
		assertTrue(isNullOrEmpty(null));
		assertTrue(isNullOrEmpty(""));
		assertFalse(isNullOrEmpty(" "));
		assertFalse(isNullOrEmpty("a"));
	}
	
	@Test
	public void testIsBlank() {
		assertTrue(isBlank(null));
		assertTrue(isBlank(""));
		assertTrue(isBlank(" "));
		assertTrue(isBlank("\t\t\n   \t\n"));
		assertFalse(isBlank("\t\t\nHallo    "));
	}
}

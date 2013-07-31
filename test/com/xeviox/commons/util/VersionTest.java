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

import static org.junit.Assert.*;

import org.junit.Test;

public class VersionTest {

	private void compareVersion(Version v, int major, int minor, int patch, String state) {
		assertEquals(major, v.getMajor());
		assertEquals(minor, v.getMinor());
		assertEquals(patch, v.getPatch());
		assertEquals(state, v.getState());
	}
	
	@Test
	public void testParseVersion() {
		compareVersion(Version.parseString("1.0-0b"), 1, 0, 0, "b");
		compareVersion(Version.parseString("2.10-10234alpha"), 2, 10, 10234, "alpha");
		compareVersion(Version.parseString("10.4-123beta"), 10, 4, 123, "beta");
		compareVersion(Version.parseString("1.0-0"), 1, 0, 0, "");
	}
	
	@Test
	public void testFormatVersion() {
		assertEquals("1.0-0b", new Version(1, 0, 0, "b").toString());
		assertEquals("2.10-10234alpha", new Version(2, 10, 10234, "alpha").toString());
		assertEquals("10.4-123beta", new Version(10, 4, 123, "beta").toString());
		assertEquals("1.0-0", new Version(1, 0, 0).toString());
	}
	
	@Test
	public void testCompareVersion() {
		assertEquals(0, Version.parseString("1.0-0").compareTo(Version.parseString("1.0-0")));
		assertEquals(1, Version.parseString("2.0-1").compareTo(Version.parseString("1.0-0")));
		assertEquals(-1, Version.parseString("1.0-0a").compareTo(Version.parseString("1.0-5")));
		assertEquals(1, Version.parseString("1.0-0b").compareTo(Version.parseString("1.0-0a")));
		assertEquals(1, Version.parseString("1.0-0b").compareTo(Version.parseString("1.0-0")));
	}
}

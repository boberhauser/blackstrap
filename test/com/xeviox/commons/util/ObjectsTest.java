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

import static com.xeviox.commons.util.Objects.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class ObjectsTest {

	@Test
	public void testIsNull() {
		assertTrue(isNull(null));
		String s = null;
		assertTrue(isNull(s));
		assertFalse(isNull("test"));
		assertFalse(isNull(2));
	}
}

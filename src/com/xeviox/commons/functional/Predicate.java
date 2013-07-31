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

package com.xeviox.commons.functional;

public interface Predicate<T> {
    /**
     * Determines if the created predicate applies to the given object.
     * @param t Object which should get checked against the predicate.
     * @return True if the predicate applies, otherwise false.
     */
    boolean applies(T input);
}

package com.xeviox.commons.conditions;

public interface Predicate<T> {
    /**
     * Determines if the created predicate applies to the given object.
     * @param t Object which should get checked against the predicate.
     * @return True if the predicate applies, otherwise false.
     */
    boolean applies(T input);
}

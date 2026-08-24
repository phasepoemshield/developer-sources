/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

public interface Marker
extends Serializable {
    public static final String ANY_NON_NULL_MARKER = "+";
    public static final String ANY_MARKER = "*";

    public boolean contains(Marker var1);

    public boolean hasReferences();

    public int hashCode();

    public boolean remove(Marker var1);

    @Deprecated
    public boolean hasChildren();

    public String getName();

    public boolean contains(String var1);

    public boolean equals(Object var1);

    public void add(Marker var1);

    public Iterator<Marker> iterator();
}


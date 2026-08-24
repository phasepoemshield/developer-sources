/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.helpers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;

public class BasicMarker
implements Marker {
    private static final long serialVersionUID = -2849567615646933777L;
    private static final String CLOSE = " ]";
    private final String name;
    private static final String OPEN = "[ ";
    private static final String SEP = ", ";
    private final List<Marker> referenceList = new CopyOnWriteArrayList<Marker>();

    @Override
    public Iterator<Marker> iterator() {
        return this.referenceList.iterator();
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean contains(Marker other) {
        if (other == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.equals(other)) {
            return true;
        }
        if (this.hasReferences()) {
            Iterator<Marker> iterator2 = this.referenceList.iterator();
            while (iterator2.hasNext()) {
                Marker ref = iterator2.next();
                if (!ref.contains(other)) continue;
                return true;
            }
        }
        return false;
    }

    BasicMarker(String name) {
        if (name == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.name = name;
    }

    @Override
    public boolean contains(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.name.equals(name)) {
            return true;
        }
        if (this.hasReferences()) {
            Iterator<Marker> iterator2 = this.referenceList.iterator();
            while (iterator2.hasNext()) {
                Marker ref = iterator2.next();
                if (!ref.contains(name)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasReferences() {
        return this.referenceList.size() > 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Marker)) {
            return false;
        }
        Marker other = (Marker)obj;
        return this.name.equals(other.getName());
    }

    /*
     * WARNING - void declaration
     */
    public String toString() {
        void var3_2;
        if (!this.hasReferences()) {
            return this.getName();
        }
        Iterator<Marker> it = this.iterator();
        StringBuilder sb = new StringBuilder(this.getName());
        sb.append(' ').append(OPEN);
        while (it.hasNext()) {
            Marker reference = it.next();
            sb.append(reference.getName());
            if (!it.hasNext()) continue;
            sb.append(SEP);
        }
        sb.append(CLOSE);
        return var3_2.toString();
    }

    @Override
    @Deprecated
    public boolean hasChildren() {
        return this.hasReferences();
    }

    @Override
    public void add(Marker reference) {
        if (reference == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (this.contains(reference)) {
            return;
        }
        if (reference.contains(this)) {
            return;
        }
        this.referenceList.add(reference);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean remove(Marker referenceToRemove) {
        return this.referenceList.remove(referenceToRemove);
    }
}


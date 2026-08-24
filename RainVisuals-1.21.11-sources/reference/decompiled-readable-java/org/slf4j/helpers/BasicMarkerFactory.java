/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.helpers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.IMarkerFactory;
import org.slf4j.Marker;
import org.slf4j.helpers.BasicMarker;

public class BasicMarkerFactory
implements IMarkerFactory {
    private final ConcurrentMap<String, Marker> markerMap = new ConcurrentHashMap<String, Marker>();

    @Override
    public boolean exists(String name) {
        if (name == null) {
            return false;
        }
        return this.markerMap.containsKey(name);
    }

    @Override
    public Marker getDetachedMarker(String name) {
        return new BasicMarker(name);
    }

    @Override
    public boolean detachMarker(String name) {
        if (name == null) {
            return false;
        }
        return this.markerMap.remove(name) != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Marker getMarker(String name) {
        void var2_2;
        if (name == null) {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        Marker marker = (Marker)this.markerMap.get(name);
        if (marker == null) {
            marker = new BasicMarker(name);
            Marker oldMarker = this.markerMap.putIfAbsent(name, marker);
            if (oldMarker != null) {
                void var3_3;
                var2_2 = var3_3;
            }
        }
        return var2_2;
    }
}


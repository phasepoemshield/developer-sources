/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09736;
import Nursultan.class09743;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public final class class09713
extends Record {
    private final Map<class09736, class09743> specs;
    public static final class09713 N = new class09713(null);

    public class09713(Map<class09736, class09743> map) {
        EnumMap<class09736, class09743> enumMap = new EnumMap<class09736, class09743>(class09736.class);
        if (map != null) {
            for (Map.Entry<class09736, class09743> entry : map.entrySet()) {
                class09743 class097432;
                class09736 class097362 = entry.getKey();
                if (class097362 == null || !(class097432 = entry.getValue() == null ? class09743.Z() : entry.getValue()).u()) continue;
                class097362.y(class097432);
                enumMap.put(class097362, class097432);
            }
        }
        this.specs = Collections.unmodifiableMap(enumMap);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        Map<class09736, class09743> map;
        if (this == object) {
            return true;
        }
        if (!(object instanceof class09713)) return false;
        class09713 class097132 = (class09713)((Object)object);
        try {
            map = class097132.y();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        return this.specs.equals(map);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09713.class, "specs", "specs"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09713.class, "specs", "specs"}, this);
    }

    public Map<class09736, class09743> y() {
        return this.specs;
    }

    public class09743 N(class09736 class097362) {
        if (class097362 == null) {
            return class09743.Z();
        }
        return this.specs.getOrDefault((Object)class097362, class09743.Z());
    }

    public boolean N() {
        return this.specs.isEmpty();
    }
}


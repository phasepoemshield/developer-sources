/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;

public final class class09773
extends Record {
    private final String id;
    private final String label;
    private final Map<String, String> fields;
    private final List<class09773> children;

    public Map<String, String> L() {
        return this.fields;
    }

    public class09773(String string, String string2, Map<String, String> map, List<class09773> list) {
        this.id = string;
        this.label = string2;
        this.fields = map;
        this.children = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09773.class, "id;label;fields;children", "id", "label", "fields", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09773.class, "id;label;fields;children", "id", "label", "fields", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09773.class, "id;label;fields;children", "id", "label", "fields", "children"}, this);
    }

    public List<class09773> u() {
        return this.children;
    }

    public String y() {
        return this.label;
    }

    public String N() {
        return this.id;
    }
}


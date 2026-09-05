/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

final class class02991
extends Record {
    final Map<String, class02991> children;
    final Map<String, Path> files;

    public class02991() {
        this(new HashMap<String, class02991>(), new HashMap<String, Path>());
    }

    private class02991(Map<String, class02991> map, Map<String, Path> map2) {
        this.children = map;
        this.files = map2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02991.class, "children;files", "children", "files"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02991.class, "children;files", "children", "files"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02991.class, "children;files", "children", "files"}, this);
    }

    public Map<String, Path> y() {
        return this.files;
    }

    public Map<String, class02991> N() {
        return this.children;
    }
}


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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class class03814
extends Record {
    final Map<UUID, Path> downloaded;
    final Set<UUID> failed;

    public class03814() {
        this(new HashMap<UUID, Path>(), new HashSet<UUID>());
    }

    public class03814(Map<UUID, Path> map, Set<UUID> set) {
        this.downloaded = map;
        this.failed = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03814.class, "downloaded;failed", "downloaded", "failed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03814.class, "downloaded;failed", "downloaded", "failed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03814.class, "downloaded;failed", "downloaded", "failed"}, this);
    }

    public Set<UUID> y() {
        return this.failed;
    }

    public Map<UUID, Path> N() {
        return this.downloaded;
    }
}


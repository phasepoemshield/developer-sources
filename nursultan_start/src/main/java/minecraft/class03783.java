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
import minecraft.class03776;
import minecraft.class03796;

public final class class03783
extends Record {
    private final class03796 worldGenSettings;
    private final class03776 dataConfiguration;

    public class03783(class03796 class037962, class03776 class037762) {
        this.worldGenSettings = class037962;
        this.dataConfiguration = class037762;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03783.class, "worldGenSettings;dataConfiguration", "worldGenSettings", "dataConfiguration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03783.class, "worldGenSettings;dataConfiguration", "worldGenSettings", "dataConfiguration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03783.class, "worldGenSettings;dataConfiguration", "worldGenSettings", "dataConfiguration"}, this);
    }

    public class03776 y() {
        return this.dataConfiguration;
    }

    public class03796 N() {
        return this.worldGenSettings;
    }
}


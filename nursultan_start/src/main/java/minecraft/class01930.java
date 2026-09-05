/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01022
 *  minecraft.class01089
 *  minecraft.class03776
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01022;
import minecraft.class01089;
import minecraft.class01929;
import minecraft.class03776;

public final class class01930
extends Record {
    private final class01089 resources;
    private final class03776 dataConfiguration;
    private final class01929 datapackWorldgen;
    private final class01022 datapackDimensions;

    public class01929 L() {
        return this.datapackWorldgen;
    }

    public class01930(class01089 class010892, class03776 class037762, class01929 class019292, class01022 class010222) {
        this.resources = class010892;
        this.dataConfiguration = class037762;
        this.datapackWorldgen = class019292;
        this.datapackDimensions = class010222;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01930.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "resources", "dataConfiguration", "datapackWorldgen", "datapackDimensions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01930.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "resources", "dataConfiguration", "datapackWorldgen", "datapackDimensions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01930.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "resources", "dataConfiguration", "datapackWorldgen", "datapackDimensions"}, this);
    }

    public class01022 u() {
        return this.datapackDimensions;
    }

    public class03776 y() {
        return this.dataConfiguration;
    }

    public class01089 N() {
        return this.resources;
    }
}


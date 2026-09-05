/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01014
 *  minecraft.class01022
 *  minecraft.class01255
 *  minecraft.class06228
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00751;
import minecraft.class01014;
import minecraft.class01022;
import minecraft.class01255;
import minecraft.class06228;

public final class class03781
extends Record {
    private final class00751<class01255> dimensions;
    private final class06228 specialWorldProperty;

    public class00751<class01255> L() {
        return this.dimensions;
    }

    public class03781(class00751<class01255> class007512, class06228 class062282) {
        this.dimensions = class007512;
        this.specialWorldProperty = class062282;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03781.class, "dimensions;specialWorldProperty", "dimensions", "specialWorldProperty"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03781.class, "dimensions;specialWorldProperty", "dimensions", "specialWorldProperty"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03781.class, "dimensions;specialWorldProperty", "dimensions", "specialWorldProperty"}, this);
    }

    public class06228 u() {
        return this.specialWorldProperty;
    }

    public class01022 y() {
        return new class01014(List.of(this.dimensions)).method_40316();
    }

    public Lifecycle N() {
        return this.dimensions.R();
    }
}


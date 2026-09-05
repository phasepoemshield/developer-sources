/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01194
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01194;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06889;

public final class class00435
extends Record {
    private final class03556<class01194> event;
    private final class06889 pos;
    public static final class02362<class04247, class00435> N = class02362.N((class02362)class02389.y((class05946)class04227.c), class00435::N, (class02362)class06889.y, class00435::y, class00435::new);

    public class00435(class03556<class01194> class035562, class06889 class068892) {
        this.event = class035562;
        this.pos = class068892;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00435.class, "event;pos", "event", "pos"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00435.class, "event;pos", "event", "pos"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00435.class, "event;pos", "event", "pos"}, this);
    }

    public class06889 y() {
        return this.pos;
    }

    public class03556<class01194> N() {
        return this.event;
    }
}


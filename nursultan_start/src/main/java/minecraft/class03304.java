/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class07109
 *  minecraft.class07299
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class07109;
import minecraft.class07299;

final class class03304
extends Record {
    final class05946<class07299> level;
    final class06889 pos;
    final class07109 rot;

    public class07109 L() {
        return this.rot;
    }

    class03304(class05946<class07299> class059462, class06889 class068892, class07109 class071092) {
        this.level = class059462;
        this.pos = class068892;
        this.rot = class071092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03304.class, "level;pos;rot", "level", "pos", "rot"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03304.class, "level;pos;rot", "level", "pos", "rot"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03304.class, "level;pos;rot", "level", "pos", "rot"}, this);
    }

    public class06889 y() {
        return this.pos;
    }

    public class05946<class07299> N() {
        return this.level;
    }
}


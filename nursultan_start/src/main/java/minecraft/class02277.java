/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05946
 *  minecraft.class07299
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05946;
import minecraft.class07299;

public final class class02277
extends Record {
    private final String level;
    private final class05946<class07299> dimension;
    private final String type;

    public String L() {
        return this.type;
    }

    public class02277(String string, class05946<class07299> class059462, String string2) {
        this.level = string;
        this.dimension = class059462;
        this.type = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02277.class, "level;dimension;type", "level", "dimension", "type"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02277.class, "level;dimension;type", "level", "dimension", "type"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02277.class, "level;dimension;type", "level", "dimension", "type"}, this);
    }

    public class05946<class07299> y() {
        return this.dimension;
    }

    public String N() {
        return this.level;
    }

    public class02277 N(String string) {
        return new class02277(this.level, this.dimension, this.type + string);
    }
}


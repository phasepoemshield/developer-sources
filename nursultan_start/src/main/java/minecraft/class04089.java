/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07209;
import minecraft.class07211;

public final class class04089
extends Record {
    private final class07209 pos;
    private final class07211 face;

    public class04089(class07209 class072092, class07211 class072112) {
        this.pos = class072092;
        this.face = class072112;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04089.class, "pos;face", "pos", "face"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04089.class, "pos;face", "pos", "face"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04089.class, "pos;face", "pos", "face"}, this);
    }

    public class07211 y() {
        return this.face;
    }

    public class07209 N() {
        return this.pos;
    }
}


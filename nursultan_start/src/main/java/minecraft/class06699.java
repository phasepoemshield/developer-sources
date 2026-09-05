/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07321
 *  minecraft.class07357
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class07321;
import minecraft.class07357;

final class class06699
extends Record {
    final class07357 file;
    final List<class07321> chunksToUpgrade;

    class06699(class07357 class073572, List<class07321> list) {
        this.file = class073572;
        this.chunksToUpgrade = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06699.class, "file;chunksToUpgrade", "file", "chunksToUpgrade"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06699.class, "file;chunksToUpgrade", "file", "chunksToUpgrade"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06699.class, "file;chunksToUpgrade", "file", "chunksToUpgrade"}, this);
    }

    public List<class07321> y() {
        return this.chunksToUpgrade;
    }

    public class07357 N() {
        return this.file;
    }
}


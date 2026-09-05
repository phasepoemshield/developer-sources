/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07701
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05617;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07701;

public final class class05596
extends Record
implements class05617 {
    private final class06889 position;

    public class05596(class06889 class068892) {
        this.position = class068892;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05596.class, "position", "position"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05596.class, "position", "position"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05596.class, "position", "position"}, this);
    }

    @Override
    public void N(class07701 class077012, class07049 class070492) {
        class070492.method_5702(class077012.m(), this.position);
    }

    public class06889 N() {
        return this.position;
    }
}


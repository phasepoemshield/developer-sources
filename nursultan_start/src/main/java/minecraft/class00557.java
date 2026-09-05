/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08051;

public final class class00557
extends Record
implements class00381<class08051> {
    private final class06889 position;
    private final float yRot;
    private final float xRot;
    private final boolean onGround;
    public static final class02362<class00667, class00557> N = class02362.N((class02362)class06889.y, class00557::N, (class02362)class02389.E, class00557::y, (class02362)class02389.E, class00557::L, (class02362)class02389.y, class00557::u, class00557::new);

    public float L() {
        return this.xRot;
    }

    public class00557(class06889 class068892, float f, float f2, boolean bl) {
        this.position = class068892;
        this.yRot = f;
        this.xRot = f2;
        this.onGround = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00557.class, "position;yRot;xRot;onGround", "position", "yRot", "xRot", "onGround"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00557.class, "position;yRot;xRot;onGround", "position", "yRot", "xRot", "onGround"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00557.class, "position;yRot;xRot;onGround", "position", "yRot", "xRot", "onGround"}, this);
    }

    public boolean u() {
        return this.onGround;
    }

    public float y() {
        return this.yRot;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12078(this);
    }

    public static class00557 N(class07049 class070492) {
        if (class070492.method_66245()) {
            return new class00557(class070492.method_66233().method_66265(), class070492.method_66233().method_66268(), class070492.method_66233().method_66269(), class070492.method_24828());
        }
        return new class00557(class070492.method_73189(), class070492.method_36454(), class070492.method_36455(), class070492.method_24828());
    }

    public class06889 N() {
        return this.position;
    }

    public class02897<class00557> method_65080() {
        return class04248.yf;
    }
}


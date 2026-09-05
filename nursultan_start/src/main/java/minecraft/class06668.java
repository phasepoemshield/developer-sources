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
 *  minecraft.class07280
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
import minecraft.class07280;

public final class class06668
extends Record
implements class00381<class07280> {
    private final class06889 position;
    private final float yRot;
    private final float xRot;
    public static final class02362<class00667, class06668> N = class02362.N((class02362)class06889.y, class06668::N, (class02362)class02389.E, class06668::y, (class02362)class02389.E, class06668::L, class06668::new);

    public float L() {
        return this.xRot;
    }

    public class06668(class06889 class068892, float f, float f2) {
        this.position = class068892;
        this.yRot = f;
        this.xRot = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06668.class, "position;yRot;xRot", "position", "yRot", "xRot"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06668.class, "position;yRot;xRot", "position", "yRot", "xRot"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06668.class, "position;yRot;xRot", "position", "yRot", "xRot"}, this);
    }

    public float y() {
        return this.yRot;
    }

    public static class06668 N(class07049 class070492) {
        return new class06668(class070492.method_73189(), class070492.method_36454(), class070492.method_36455());
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class06889 N() {
        return this.position;
    }

    public class02897<class06668> method_65080() {
        return class04248.NN;
    }
}


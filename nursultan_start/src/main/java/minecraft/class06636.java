/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00265
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00265;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class06636
extends Record
implements class00381<class07280> {
    private final int containerId;
    private final class00265 recipeDisplay;
    public static final class02362<class04247, class06636> N = class02362.N((class02362)class02389.l, class06636::N, (class02362)class00265.i, class06636::y, class06636::new);

    public class06636(int n, class00265 class002652) {
        this.containerId = n;
        this.recipeDisplay = class002652;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06636.class, "containerId;recipeDisplay", "containerId", "recipeDisplay"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06636.class, "containerId;recipeDisplay", "containerId", "recipeDisplay"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06636.class, "containerId;recipeDisplay", "containerId", "recipeDisplay"}, this);
    }

    public class00265 y() {
        return this.recipeDisplay;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.containerId;
    }

    public class02897<class06636> method_65080() {
        return class04248.Ni;
    }
}


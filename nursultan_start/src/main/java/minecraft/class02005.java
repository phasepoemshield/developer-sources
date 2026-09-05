/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03246
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class06581
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03246;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class06581;

public final class class02005
extends Record {
    private final class06581 template;
    private final class05946<class03246> patternId;
    private final class05946<class06521<?>> recipeId;

    public class05946<class06521<?>> L() {
        return this.recipeId;
    }

    public class02005(class06581 class065812, class05946<class03246> class059462, class05946<class06521<?>> class059463) {
        this.template = class065812;
        this.patternId = class059462;
        this.recipeId = class059463;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02005.class, "template;patternId;recipeId", "template", "patternId", "recipeId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02005.class, "template;patternId;recipeId", "template", "patternId", "recipeId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02005.class, "template;patternId;recipeId", "template", "patternId", "recipeId"}, this);
    }

    public class05946<class03246> y() {
        return this.patternId;
    }

    public class06581 N() {
        return this.template;
    }
}


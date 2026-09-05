/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04770
 *  minecraft.class07049
 *  minecraft.class07664
 *  minecraft.class07701
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04770;
import minecraft.class05617;
import minecraft.class07049;
import minecraft.class07664;
import minecraft.class07701;

public final class class05601
extends Record
implements class05617 {
    private final class07049 entity;
    private final class07664 anchor;

    public class05601(class07049 class070492, class07664 class076642) {
        this.entity = class070492;
        this.anchor = class076642;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05601.class, "entity;anchor", "entity", "anchor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05601.class, "entity;anchor", "entity", "anchor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05601.class, "entity;anchor", "entity", "anchor"}, this);
    }

    public class07664 y() {
        return this.anchor;
    }

    public class07049 N() {
        return this.entity;
    }

    @Override
    public void N(class07701 class077012, class07049 class070492) {
        if (class070492 instanceof class04770) {
            ((class04770)class070492).method_14222(class077012.m(), this.entity, this.anchor);
        } else {
            class070492.method_5702(class077012.m(), this.anchor.N(this.entity));
        }
    }
}


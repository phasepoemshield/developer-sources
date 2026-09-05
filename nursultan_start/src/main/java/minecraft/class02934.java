/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02950;
import minecraft.class06584;

public final class class02934
extends Record
implements class02950 {
    private final class06584 template;
    private final class06584 base;
    private final class06584 addition;

    public class06584 L() {
        return this.template;
    }

    public class02934(class06584 class065842, class06584 class065843, class06584 class065844) {
        this.template = class065842;
        this.base = class065843;
        this.addition = class065844;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02934.class, "template;base;addition", "template", "base", "addition"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02934.class, "template;base;addition", "template", "base", "addition"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02934.class, "template;base;addition", "template", "base", "addition"}, this);
    }

    public class06584 i() {
        return this.addition;
    }

    public class06584 u() {
        return this.base;
    }

    @Override
    public boolean y() {
        return this.template.R() && this.base.R() && this.addition.R();
    }

    @Override
    public int N() {
        return 3;
    }

    @Override
    public class06584 N(int n) {
        return switch (n) {
            case 0 -> this.template;
            case 1 -> this.base;
            case 2 -> this.addition;
            default -> throw new IllegalArgumentException("Recipe does not contain slot " + n);
        };
    }
}


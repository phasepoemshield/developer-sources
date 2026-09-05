/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02566
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02566;
import minecraft.class06715;
import minecraft.class06722;
import minecraft.class06730;
import minecraft.class06889;

public final class class06719
extends Record
implements class06730 {
    private final class06889 pos;
    private final String text;
    private final class06715 style;

    public class06715 L() {
        return this.style;
    }

    public class06719(class06889 class068892, String string, class06715 class067152) {
        this.pos = class068892;
        this.text = string;
        this.style = class067152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06719.class, "pos;text;style", "pos", "text", "style"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06719.class, "pos;text;style", "pos", "text", "style"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06719.class, "pos;text;style", "pos", "text", "style"}, this);
    }

    public String y() {
        return this.text;
    }

    public class06889 N() {
        return this.pos;
    }

    @Override
    public void N(class06722 class067222, float f) {
        class06715 class067152 = f < 1.0f ? new class06715(class02566.N((int)this.style.y(), (float)f), this.style.L(), this.style.u()) : this.style;
        class067222.N(this.pos, this.text, class067152);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07211
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06722;
import minecraft.class06730;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07211;

public final class class06740
extends Record
implements class06730 {
    private final class06889 a;
    private final class06889 b;
    private final class06889 c;
    private final class06889 d;
    private final class06747 style;

    public class06889 L() {
        return this.c;
    }

    public class06740(class06889 class068892, class06889 class068893, class06889 class068894, class06889 class068895, class06747 class067472) {
        this.a = class068892;
        this.b = class068893;
        this.c = class068894;
        this.d = class068895;
        this.style = class067472;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06740.class, "a;b;c;d;style", "a", "b", "c", "d", "style"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06740.class, "a;b;c;d;style", "a", "b", "c", "d", "style"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06740.class, "a;b;c;d;style", "a", "b", "c", "d", "style"}, this);
    }

    public class06747 i() {
        return this.style;
    }

    public class06889 u() {
        return this.d;
    }

    public class06889 y() {
        return this.b;
    }

    public class06889 N() {
        return this.a;
    }

    public static class06740 N(class06889 class068892, class06889 class068893, class07211 class072112, class06747 class067472) {
        return switch (class072112) {
            default -> throw new MatchException(null, null);
            case class07211.field_11033 -> new class06740(new class06889(class068892.M, class068892.B, class068892.Z), new class06889(class068893.M, class068892.B, class068892.Z), new class06889(class068893.M, class068892.B, class068893.Z), new class06889(class068892.M, class068892.B, class068893.Z), class067472);
            case class07211.field_11036 -> new class06740(new class06889(class068892.M, class068893.B, class068892.Z), new class06889(class068892.M, class068893.B, class068893.Z), new class06889(class068893.M, class068893.B, class068893.Z), new class06889(class068893.M, class068893.B, class068892.Z), class067472);
            case class07211.field_11043 -> new class06740(new class06889(class068892.M, class068892.B, class068892.Z), new class06889(class068892.M, class068893.B, class068892.Z), new class06889(class068893.M, class068893.B, class068892.Z), new class06889(class068893.M, class068892.B, class068892.Z), class067472);
            case class07211.field_11035 -> new class06740(new class06889(class068892.M, class068892.B, class068893.Z), new class06889(class068893.M, class068892.B, class068893.Z), new class06889(class068893.M, class068893.B, class068893.Z), new class06889(class068892.M, class068893.B, class068893.Z), class067472);
            case class07211.field_11039 -> new class06740(new class06889(class068892.M, class068892.B, class068892.Z), new class06889(class068892.M, class068892.B, class068893.Z), new class06889(class068892.M, class068893.B, class068893.Z), new class06889(class068892.M, class068893.B, class068892.Z), class067472);
            case class07211.field_11034 -> new class06740(new class06889(class068893.M, class068892.B, class068892.Z), new class06889(class068893.M, class068893.B, class068892.Z), new class06889(class068893.M, class068893.B, class068893.Z), new class06889(class068893.M, class068892.B, class068893.Z), class067472);
        };
    }

    @Override
    public void N(class06722 class067222, float f) {
        int n;
        if (this.style.N()) {
            n = this.style.y(f);
            class067222.N(this.a, this.b, this.c, this.d, n);
        }
        if (this.style.y()) {
            n = this.style.N(f);
            class067222.N(this.a, this.b, n, this.style.u());
            class067222.N(this.b, this.c, n, this.style.u());
            class067222.N(this.c, this.d, n, this.style.u());
            class067222.N(this.d, this.a, n, this.style.u());
        }
    }
}


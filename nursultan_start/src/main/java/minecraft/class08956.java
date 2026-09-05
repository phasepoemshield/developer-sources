/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public final class class08956
extends Record
implements class08961 {
    private final class08961 owner;
    private final class06889 offset;

    @Override
    public float method_73188() {
        return this.owner.method_73188();
    }

    @Override
    public class07299 method_73183() {
        return this.owner.method_73183();
    }

    @Override
    public class06889 method_73189() {
        return this.owner.method_73189().i(this.offset);
    }

    public class08956(class08961 class089612, class06889 class068892) {
        this.owner = class089612;
        this.offset = class068892;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08956.class, "owner;offset", "owner", "offset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08956.class, "owner;offset", "owner", "offset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08956.class, "owner;offset", "owner", "offset"}, this);
    }

    public class06889 y() {
        return this.offset;
    }

    public class08961 N() {
        return this.owner;
    }

    @Override
    public @Nullable class07438 method_72393() {
        return this.owner.method_72393();
    }
}


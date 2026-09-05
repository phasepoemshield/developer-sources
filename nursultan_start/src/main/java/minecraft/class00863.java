/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00874
 *  minecraft.class00881
 *  minecraft.class00883
 *  minecraft.class06889
 *  minecraft.class07109
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00874;
import minecraft.class00881;
import minecraft.class00883;
import minecraft.class06889;
import minecraft.class07109;
import minecraft.class07701;

public final class class00863
extends Record
implements class00874 {
    private final class00883 x;
    private final class00883 y;
    private final class00883 z;
    public static final class00863 N = class00863.N(new class07109(0.0f, 0.0f));

    public boolean L() {
        return this.z.N();
    }

    public class00863(class00883 class008832, class00883 class008833, class00883 class008834) {
        this.x = class008832;
        this.y = class008833;
        this.z = class008834;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00863.class, "x;y;z", "x", "y", "z"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00863.class, "x;y;z", "x", "y", "z"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00863.class, "x;y;z", "x", "y", "z"}, this);
    }

    public class00883 i() {
        return this.y;
    }

    public class00883 u() {
        return this.x;
    }

    public class07109 y(class07701 class077012) {
        class07109 class071092 = class077012.E();
        return new class07109((float)this.x.N((double)class071092.z), (float)this.y.N((double)class071092.U));
    }

    public boolean y() {
        return this.y.N();
    }

    public static class00863 N(double d, double d2, double d3) {
        return new class00863(new class00883(false, d), new class00883(false, d2), new class00883(false, d3));
    }

    public static class00863 N(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        class00883 class008832 = class00883.N((StringReader)stringReader);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw class00881.N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        class00883 class008833 = class00883.N((StringReader)stringReader);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw class00881.N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        class00883 class008834 = class00883.N((StringReader)stringReader);
        return new class00863(class008832, class008833, class008834);
    }

    public static class00863 N(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        class00883 class008832 = class00883.N((StringReader)stringReader, (boolean)bl);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw class00881.N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        class00883 class008833 = class00883.N((StringReader)stringReader, (boolean)false);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw class00881.N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        class00883 class008834 = class00883.N((StringReader)stringReader, (boolean)bl);
        return new class00863(class008832, class008833, class008834);
    }

    public class06889 N(class07701 class077012) {
        class06889 class068892 = class077012.i();
        return new class06889(this.x.N(class068892.M), this.y.N(class068892.B), this.z.N(class068892.Z));
    }

    public static class00863 N(class07109 class071092) {
        return new class00863(new class00883(false, (double)class071092.z), new class00883(false, (double)class071092.U), new class00883(true, 0.0));
    }

    public boolean N() {
        return this.x.N();
    }

    public class00883 R() {
        return this.z;
    }
}


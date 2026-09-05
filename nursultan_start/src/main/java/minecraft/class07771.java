/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class06794
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00392;
import minecraft.class06794;
import minecraft.class07701;

public final class class07771
extends Record {
    private final int start;
    private final int end;
    private final class06794 selector;

    public class06794 L() {
        return this.selector;
    }

    public class07771(int n, int n2, class06794 class067942) {
        this.start = n;
        this.end = n2;
        this.selector = class067942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07771.class, "start;end;selector", "start", "end", "selector"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07771.class, "start;end;selector", "start", "end", "selector"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07771.class, "start;end;selector", "start", "end", "selector"}, this);
    }

    public int y() {
        return this.end;
    }

    public int N() {
        return this.start;
    }

    public class00392 N(class07701 class077012) throws CommandSyntaxException {
        return class06794.N((List)this.selector.y(class077012));
    }
}


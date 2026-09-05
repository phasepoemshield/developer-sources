/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00507
 *  minecraft.class00522
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class08092
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class01426;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class08092;

final class class01428
extends Record {
    private final String name;
    private final class01426 valueMatcher;
    public static final class02362<ByteBuf, class01428> N = class02362.N((class02362)class02389.s, class01428::N, class01426.u, class01428::y, class01428::new);

    class01428(String string, class01426 class014262) {
        this.name = string;
        this.valueMatcher = class014262;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01428.class, "name;valueMatcher", "name", "valueMatcher"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01428.class, "name;valueMatcher", "name", "valueMatcher"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01428.class, "name;valueMatcher", "name", "valueMatcher"}, this);
    }

    public class01426 y() {
        return this.valueMatcher;
    }

    public Optional<String> N(class00507<?, ?> class005072) {
        return class005072.N(this.name) != null ? Optional.empty() : Optional.of(this.name);
    }

    public <S extends class00522<?, S>> boolean N(class00507<?, S> class005072, S s) {
        class08092 var3 = class005072.N(this.name);
        return var3 != null && this.valueMatcher.N(s, var3);
    }

    public String N() {
        return this.name;
    }
}


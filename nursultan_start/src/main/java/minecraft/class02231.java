/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class02222;
import minecraft.class02243;
import minecraft.class02362;
import minecraft.class02389;

public final class class02231
extends Record {
    private final Either<class02222, class00392> type;
    private final String link;
    public static final class02362<ByteBuf, class02231> N = class02362.N(class02243.y, class02231::N, (class02362)class02389.s, class02231::y, class02231::new);

    public class02231(Either<class02222, class00392> either, String string) {
        this.type = either;
        this.link = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02231.class, "type;link", "type", "link"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02231.class, "type;link", "type", "link"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02231.class, "type;link", "type", "link"}, this);
    }

    public String y() {
        return this.link;
    }

    public Either<class02222, class00392> N() {
        return this.type;
    }
}


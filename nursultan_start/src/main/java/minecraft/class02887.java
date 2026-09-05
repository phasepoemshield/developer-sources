/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00423
 *  minecraft.class00638
 *  minecraft.class00648
 *  minecraft.class02362
 *  minecraft.class03276
 *  minecraft.class04275
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00423;
import minecraft.class00638;
import minecraft.class00648;
import minecraft.class02362;
import minecraft.class03276;
import minecraft.class04275;
import org.jspecify.annotations.Nullable;

final class class02887<L extends class00638>
extends Record
implements class04275<L> {
    private final class00648 id;
    private final class00423 flow;
    private final class02362<ByteBuf, class00381<? super L>> codec;
    private final @Nullable class03276 bundlerInfo;

    public class02362<ByteBuf, class00381<? super L>> L() {
        return this.codec;
    }

    class02887(class00648 class006482, class00423 class004232, class02362<ByteBuf, class00381<? super L>> class023622, @Nullable class03276 class032762) {
        this.id = class006482;
        this.flow = class004232;
        this.codec = class023622;
        this.bundlerInfo = class032762;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02887.class, "id;flow;codec;bundlerInfo", "id", "flow", "codec", "bundlerInfo"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02887.class, "id;flow;codec;bundlerInfo", "id", "flow", "codec", "bundlerInfo"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02887.class, "id;flow;codec;bundlerInfo", "id", "flow", "codec", "bundlerInfo"}, this);
    }

    public @Nullable class03276 u() {
        return this.bundlerInfo;
    }

    public class00423 y() {
        return this.flow;
    }

    public class00648 N() {
        return this.id;
    }
}


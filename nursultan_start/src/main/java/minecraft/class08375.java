/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufUtil
 *  io.netty.util.ReferenceCounted
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.util.ReferenceCounted;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class08375
extends Record
implements ReferenceCounted {
    private final ByteBuf contents;

    public class08375 touch(Object object) {
        this.contents.touch(object);
        return this;
    }

    public ByteBuf L() {
        return this.contents;
    }

    public class08375(ByteBuf byteBuf) {
        this.contents = ByteBufUtil.ensureAccessible((ByteBuf)byteBuf);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08375.class, "contents", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08375.class, "contents", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08375.class, "contents", "contents"}, this);
    }

    public boolean release() {
        return this.contents.release();
    }

    public boolean release(int n) {
        return this.contents.release(n);
    }

    public class08375 touch() {
        this.contents.touch();
        return this;
    }

    public static Object y(Object object) {
        if (object instanceof class08375) {
            return ByteBufUtil.ensureAccessible((ByteBuf)((class08375)((Object)object)).contents);
        }
        return object;
    }

    public static Object N(Object object) {
        if (object instanceof ByteBuf) {
            ByteBuf byteBuf = (ByteBuf)object;
            return new class08375(byteBuf);
        }
        return object;
    }

    public class08375 retain(int n) {
        this.contents.retain(n);
        return this;
    }

    public class08375 retain() {
        this.contents.retain();
        return this;
    }

    public int refCnt() {
        return this.contents.refCnt();
    }
}


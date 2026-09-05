/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class07529
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class07529;

public final class class02298
extends Record {
    private final String namespace;
    private final String id;
    private final String version;
    public static final class02362<ByteBuf, class02298> N = class02362.N((class02362)class02389.s, class02298::y, (class02362)class02389.s, class02298::L, (class02362)class02389.s, class02298::u, class02298::new);
    public static final String y = "minecraft";

    public String L() {
        return this.id;
    }

    public class02298(String string, String string2, String string3) {
        this.namespace = string;
        this.id = string2;
        this.version = string3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02298.class, "namespace;id;version", "namespace", "id", "version"}, this, object);
    }

    public String toString() {
        return this.namespace + ":" + this.id + ":" + this.version;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02298.class, "namespace;id;version", "namespace", "id", "version"}, this);
    }

    public String u() {
        return this.version;
    }

    public String y() {
        return this.namespace;
    }

    public boolean N() {
        return this.namespace.equals(y);
    }

    public static class02298 N(String string) {
        return new class02298(y, string, class07529.y().comp_4024());
    }
}


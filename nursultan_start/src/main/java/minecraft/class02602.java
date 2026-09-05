/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01662
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02885
 *  minecraft.class02897
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00381;
import minecraft.class01662;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02885;
import minecraft.class02897;

public final class class02602
extends Record
implements class00381<class01662> {
    private final Map<String, String> details;
    private static final int L = 128;
    private static final int u = 4096;
    private static final int i = 32;
    private static final class02362<ByteBuf, Map<String, String>> R = class02389.N(HashMap::new, (class02362)class02389.y((int)128), (class02362)class02389.y((int)4096), (int)32);
    public static final class02362<ByteBuf, class02602> N = class02362.N(R, class02602::N, class02602::new);

    public class02602(Map<String, String> map) {
        this.details = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02602.class, "details", "details"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02602.class, "details", "details"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02602.class, "details", "details"}, this);
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public Map<String, String> N() {
        return this.details;
    }

    public class02897<class02602> method_65080() {
        return class02885.L;
    }
}


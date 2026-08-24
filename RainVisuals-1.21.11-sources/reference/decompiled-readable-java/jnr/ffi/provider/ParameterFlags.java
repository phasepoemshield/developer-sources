/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import jnr.ffi.annotations.Direct;
import jnr.ffi.annotations.In;
import jnr.ffi.annotations.NulTerminate;
import jnr.ffi.annotations.Out;
import jnr.ffi.annotations.Pinned;
import jnr.ffi.annotations.Transient;

public final class ParameterFlags {
    public static final int IN = 2;
    public static final int TRANSIENT = 16;
    public static final int PINNED = 4;
    public static final int NULTERMINATE = 8;
    public static final int OUT = 1;
    public static final int DIRECT = 32;

    public static int parse(Annotation annotation) {
        int flags = 0;
        flags |= annotation instanceof Out ? 1 : 0;
        flags |= annotation instanceof In ? 2 : 0;
        flags |= annotation instanceof Transient ? 16 : 0;
        flags |= annotation instanceof Direct ? 32 : 0;
        int n = (flags |= annotation instanceof Pinned ? 4 : 0) | (annotation instanceof NulTerminate ? 8 : 0);
        return n;
    }

    public static boolean isNulTerminate(int flags) {
        return (flags & 8) != 0;
    }

    public static boolean isIn(int flags) {
        return (flags & 3) != 1;
    }

    public static boolean isFlag(Annotation annotation) {
        return ParameterFlags.parse(annotation) != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int parse(Annotation[] annotations) {
        void var1_1;
        int flags = 0;
        Annotation[] annotationArray = annotations;
        int n = annotationArray.length;
        for (int i = 0; i < n; ++i) {
            Annotation a2 = annotationArray[i];
            flags |= ParameterFlags.parse(a2);
        }
        return (int)var1_1;
    }

    public static boolean isPinned(int flags) {
        return (flags & 4) != 0;
    }

    public static boolean isDirect(int flags) {
        return (flags & 0x20) != 0;
    }

    public static boolean isOut(int flags) {
        return (flags & 3) != 2;
    }

    public static boolean isTransient(int flags) {
        return (flags & 0x10) != 0;
    }

    public static int parse(Collection<Annotation> annotations) {
        int n;
        int flags = 0;
        Iterator<Annotation> iterator2 = annotations.iterator();
        while (iterator2.hasNext()) {
            Annotation a2 = iterator2.next();
            n = flags | ParameterFlags.parse(a2);
        }
        return n;
    }

    private ParameterFlags() {
    }
}


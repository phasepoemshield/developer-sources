/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00753
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00753;
import minecraft.class07209;

public final class class08623
extends Record {
    private final class07209 localPos;
    private final class00753 size;

    public class08623(class07209 class072092, class00753 class007532) {
        this.localPos = class072092;
        this.size = class007532;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08623.class, "localPos;size", "localPos", "size"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08623.class, "localPos;size", "localPos", "size"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08623.class, "localPos;size", "localPos", "size"}, this);
    }

    public class00753 y() {
        return this.size;
    }

    public class07209 N() {
        return this.localPos;
    }

    public static class08623 N(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = Math.min(n, n4);
        int n8 = Math.min(n2, n5);
        int n9 = Math.min(n3, n6);
        return new class08623(new class07209(n7, n8, n9), new class00753(Math.max(n, n4) - n7, Math.max(n2, n5) - n8, Math.max(n3, n6) - n9));
    }
}


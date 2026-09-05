/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01208
 *  minecraft.class01214
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Collection;
import java.util.Map;
import minecraft.class01208;
import minecraft.class01214;
import minecraft.class01894;
import org.jspecify.annotations.Nullable;

public class class09448<T>
implements class01208<T> {
    final /* synthetic */ Map N;
    final /* synthetic */ class01214 y;

    public @Nullable T method_43948(class01894 class018942, boolean bl) {
        return this.y.N.get(class018942, bl).orElse(null);
    }

    public @Nullable Collection<T> method_43949(class01894 class018942) {
        return (Collection)this.N.get(class018942);
    }

    public class09448(class01214 class012142, Map map) {
        this.y = class012142;
        this.N = map;
    }
}


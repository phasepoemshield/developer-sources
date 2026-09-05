/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01603
 *  minecraft.class04548
 *  minecraft.class08735
 *  minecraft.class08780
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01603;
import minecraft.class04166;
import minecraft.class04548;
import minecraft.class08735;
import minecraft.class08780;

public final class class04152
extends Record {
    private final class04548<class08735> format;
    private final String overlay;

    public class04152(class04548<class08735> class045482, String string) {
        this.format = class045482;
        this.overlay = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04152.class, "format;overlay", "format", "overlay"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04152.class, "format;overlay", "format", "overlay"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04152.class, "format;overlay", "format", "overlay"}, this);
    }

    public String y() {
        return this.overlay;
    }

    public class04548<class08735> N() {
        return this.format;
    }

    public boolean N(class08735 class087352) {
        return this.format.N((Comparable)class087352);
    }

    static Codec<List<class04152>> N(class01603 class016032) {
        int n = class08735.N((class01603)class016032);
        return class04166.N.listOf().flatXmap(list -> class08735.N((List)list, (int)n, (class041662, class045482) -> new class04152((class04548<class08735>)class045482, class041662.y())), list -> DataResult.success((Object)list.stream().map(class041522 -> new class04166(class08780.N(class041522.N(), (int)n), class041522.y())).toList()));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01643;
import minecraft.class01650;
import minecraft.class01655;
import minecraft.class06338;

public final class class01664
extends Record
implements class01650 {
    private final int width;
    private final int height;
    private final class01643 border;
    private final boolean stretchInner;
    public static final MapCodec<class01664> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.b.fieldOf("width").forGetter(class01664::y), (App)class06338.b.fieldOf("height").forGetter(class01664::L), (App)class01643.N.fieldOf("border").forGetter(class01664::u), (App)Codec.BOOL.optionalFieldOf("stretch_inner", (Object)false).forGetter(class01664::i)).apply(instance, class01664::new)).validate(class01664::N);

    public int L() {
        return this.height;
    }

    public class01664(int n, int n2, class01643 class016432, boolean bl) {
        this.width = n;
        this.height = n2;
        this.border = class016432;
        this.stretchInner = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01664.class, "width;height;border;stretchInner", "width", "height", "border", "stretchInner"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01664.class, "width;height;border;stretchInner", "width", "height", "border", "stretchInner"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01664.class, "width;height;border;stretchInner", "width", "height", "border", "stretchInner"}, this);
    }

    public boolean i() {
        return this.stretchInner;
    }

    public class01643 u() {
        return this.border;
    }

    public int y() {
        return this.width;
    }

    @Override
    public class01655 N() {
        return class01655.field_45658;
    }

    private static DataResult<class01664> N(class01664 class016642) {
        class01643 class016432 = class016642.u();
        if (class016432.N() + class016432.L() >= class016642.y()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + class016432.N() + " + " + class016432.L() + " >= " + class016642.y());
        }
        if (class016432.y() + class016432.u() >= class016642.L()) {
            return DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + class016432.y() + " + " + class016432.u() + " >= " + class016642.L());
        }
        return DataResult.success((Object)class016642);
    }
}


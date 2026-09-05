/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00696
 *  minecraft.class03622
 *  minecraft.class03631
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00696;
import minecraft.class03622;
import minecraft.class03631;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public final class class01365
extends Record
implements class03622 {
    private final Optional<Boolean> inOpenWater;
    public static final class01365 N = new class01365(Optional.empty());
    public static final MapCodec<class01365> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("in_open_water").forGetter(class01365::y)).apply(instance, class01365::new));

    public class01365(Optional<Boolean> optional) {
        this.inOpenWater = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01365.class, "inOpenWater", "inOpenWater"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01365.class, "inOpenWater", "inOpenWater"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01365.class, "inOpenWater", "inOpenWater"}, this);
    }

    public Optional<Boolean> y() {
        return this.inOpenWater;
    }

    public MapCodec<class01365> N() {
        return class03631.y;
    }

    public static class01365 N(boolean bl) {
        return new class01365(Optional.of(bl));
    }

    public boolean N(class07049 class070492, class04782 class047822, @Nullable class06889 class068892) {
        if (this.inOpenWater.isEmpty()) {
            return true;
        }
        if (class070492 instanceof class00696) {
            class00696 class006962 = (class00696)class070492;
            return this.inOpenWater.get().booleanValue() == class006962.y();
        }
        return false;
    }
}


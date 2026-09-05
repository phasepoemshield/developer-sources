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
 *  minecraft.class03622
 *  minecraft.class03631
 *  minecraft.class04782
 *  minecraft.class04882
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
import minecraft.class03622;
import minecraft.class03631;
import minecraft.class04782;
import minecraft.class04882;
import minecraft.class06889;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public final class class02640
extends Record
implements class03622 {
    private final boolean hasRaid;
    private final boolean isCaptain;
    public static final MapCodec<class02640> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("has_raid", (Object)false).forGetter(class02640::y), (App)Codec.BOOL.optionalFieldOf("is_captain", (Object)false).forGetter(class02640::L)).apply(instance, class02640::new));
    public static final class02640 y = new class02640(false, true);

    public boolean L() {
        return this.isCaptain;
    }

    public class02640(boolean bl, boolean bl2) {
        this.hasRaid = bl;
        this.isCaptain = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02640.class, "hasRaid;isCaptain", "hasRaid", "isCaptain"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02640.class, "hasRaid;isCaptain", "hasRaid", "isCaptain"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02640.class, "hasRaid;isCaptain", "hasRaid", "isCaptain"}, this);
    }

    public boolean y() {
        return this.hasRaid;
    }

    public boolean N(class07049 class070492, class04782 class047822, @Nullable class06889 class068892) {
        if (class070492 instanceof class04882) {
            class04882 class048822 = (class04882)class070492;
            return class048822.e() == this.hasRaid && class048822.V() == this.isCaptain;
        }
        return false;
    }

    public MapCodec<class02640> N() {
        return class03631.i;
    }
}


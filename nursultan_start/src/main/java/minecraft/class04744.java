/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05042
 *  minecraft.class05946
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05042;
import minecraft.class05946;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class04744
extends Record {
    final class05042 respawnData;
    final boolean forced;
    public static final Codec<class04744> L = RecordCodecBuilder.create(instance -> instance.group((App)class05042.y.forGetter(class04744::N), (App)Codec.BOOL.optionalFieldOf("forced", (Object)false).forGetter(class04744::y)).apply(instance, class04744::new));

    public class04744(class05042 class050422, boolean bl) {
        this.respawnData = class050422;
        this.forced = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04744.class, "respawnData;forced", "respawnData", "forced"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04744.class, "respawnData;forced", "respawnData", "forced"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04744.class, "respawnData;forced", "respawnData", "forced"}, this);
    }

    public boolean y() {
        return this.forced;
    }

    public boolean y(@Nullable class04744 class047442) {
        return class047442 != null && this.respawnData.L().equals((Object)class047442.respawnData.L());
    }

    static class05946<class07299> N(@Nullable class04744 class047442) {
        return class047442 != null ? class047442.N().N() : class07299.field_25179;
    }

    public class05042 N() {
        return this.respawnData;
    }
}


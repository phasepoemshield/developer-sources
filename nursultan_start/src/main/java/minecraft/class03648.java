/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06953
 *  minecraft.class08556
 *  minecraft.class08568
 *  minecraft.class08578
 *  minecraft.class08579
 *  minecraft.class08585
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06953;
import minecraft.class08556;
import minecraft.class08568;
import minecraft.class08578;
import minecraft.class08579;
import minecraft.class08585;

public final class class03648
extends Record
implements class08578<class08579, class08568> {
    private final class06953 assetInfo;
    private final class08585 spawnConditions;
    public static final Codec<class03648> N = RecordCodecBuilder.create(instance -> instance.group((App)class06953.y.forGetter(class03648::y), (App)class08585.y.fieldOf("spawn_conditions").forGetter(class03648::L)).apply(instance, class03648::new));
    public static final Codec<class03648> y = RecordCodecBuilder.create(instance -> instance.group((App)class06953.y.forGetter(class03648::y)).apply(instance, class03648::new));
    public static final Codec<class03556<class03648>> L = class03539.N((class05946)class04227.Nf);
    public static final class02362<class04247, class03556<class03648>> u = class02389.y((class05946)class04227.Nf);

    public class08585 L() {
        return this.spawnConditions;
    }

    private class03648(class06953 class069532) {
        this(class069532, class08585.N);
    }

    public class03648(class06953 class069532, class08585 class085852) {
        this.assetInfo = class069532;
        this.spawnConditions = class085852;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03648.class, "assetInfo;spawnConditions", "assetInfo", "spawnConditions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03648.class, "assetInfo;spawnConditions", "assetInfo", "spawnConditions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03648.class, "assetInfo;spawnConditions", "assetInfo", "spawnConditions"}, this);
    }

    public class06953 y() {
        return this.assetInfo;
    }

    public List<class08556<class08579, class08568>> N() {
        return this.spawnConditions.N();
    }
}


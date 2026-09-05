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
 *  minecraft.class08438
 *  minecraft.class08545
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
import minecraft.class08438;
import minecraft.class08545;
import minecraft.class08556;
import minecraft.class08568;
import minecraft.class08578;
import minecraft.class08579;
import minecraft.class08585;

public final class class08403
extends Record
implements class08578<class08579, class08568> {
    private final class08545<class08438> modelAndTexture;
    private final class08585 spawnConditions;
    public static final Codec<class08403> N = RecordCodecBuilder.create(instance -> instance.group((App)class08545.N((Codec)class08438.field_56432, (Object)class08438.field_56429).forGetter(class08403::y), (App)class08585.y.fieldOf("spawn_conditions").forGetter(class08403::L)).apply(instance, class08403::new));
    public static final Codec<class08403> y = RecordCodecBuilder.create(instance -> instance.group((App)class08545.N((Codec)class08438.field_56432, (Object)class08438.field_56429).forGetter(class08403::y)).apply(instance, class08403::new));
    public static final Codec<class03556<class08403>> L = class03539.N((class05946)class04227.Nr);
    public static final class02362<class04247, class03556<class08403>> u = class02389.y((class05946)class04227.Nr);

    public class08585 L() {
        return this.spawnConditions;
    }

    private class08403(class08545<class08438> class085452) {
        this(class085452, class08585.N);
    }

    public class08403(class08545<class08438> class085452, class08585 class085852) {
        this.modelAndTexture = class085452;
        this.spawnConditions = class085852;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08403.class, "modelAndTexture;spawnConditions", "modelAndTexture", "spawnConditions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08403.class, "modelAndTexture;spawnConditions", "modelAndTexture", "spawnConditions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08403.class, "modelAndTexture;spawnConditions", "modelAndTexture", "spawnConditions"}, this);
    }

    public class08545<class08438> y() {
        return this.modelAndTexture;
    }

    public List<class08556<class08579, class08568>> N() {
        return this.spawnConditions.N();
    }
}


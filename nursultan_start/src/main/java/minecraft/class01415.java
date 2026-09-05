/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04651
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01400;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04651;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class07209;

public final class class01415
extends Record {
    private final Optional<class03543<class04651>> fluids;
    private final Optional<class01400> properties;
    public static final Codec<class01415> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.e).optionalFieldOf("fluids").forGetter(class01415::N), (App)class01400.N.optionalFieldOf("state").forGetter(class01415::y)).apply(instance, class01415::new));

    public class01415(Optional<class03543<class04651>> optional, Optional<class01400> optional2) {
        this.fluids = optional;
        this.properties = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01415.class, "fluids;properties", "fluids", "properties"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01415.class, "fluids;properties", "fluids", "properties"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01415.class, "fluids;properties", "fluids", "properties"}, this);
    }

    public Optional<class01400> y() {
        return this.properties;
    }

    public Optional<class03543<class04651>> N() {
        return this.fluids;
    }

    public boolean N(class04782 class047822, class07209 class072092) {
        if (!class047822.method_8477(class072092)) {
            return false;
        }
        class04688 class046882 = class047822.method_8316(class072092);
        if (this.fluids.isPresent() && !class046882.N(this.fluids.get())) {
            return false;
        }
        return !this.properties.isPresent() || this.properties.get().N(class046882);
    }
}


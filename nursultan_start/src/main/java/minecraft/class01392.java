/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00142
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00809
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06646
 *  minecraft.class07209
 *  minecraft.class07709
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00142;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00809;
import minecraft.class00891;
import minecraft.class01400;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06646;
import minecraft.class07209;
import minecraft.class07709;
import org.jspecify.annotations.Nullable;

public final class class01392
extends Record {
    private final Optional<class03543<class00891>> blocks;
    private final Optional<class01400> properties;
    private final Optional<class00809> nbt;
    private final class00142 components;
    public static final Codec<class01392> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.Z).optionalFieldOf("blocks").forGetter(class01392::y), (App)class01400.N.optionalFieldOf("state").forGetter(class01392::L), (App)class00809.N.optionalFieldOf("nbt").forGetter(class01392::u), (App)class00142.y.forGetter(class01392::i)).apply(instance, class01392::new));
    public static final class02362<class04247, class01392> y = class02362.N((class02362)class02389.N((class02362)class02389.L((class05946)class04227.Z)), class01392::y, (class02362)class02389.N(class01400.y), class01392::L, (class02362)class02389.N((class02362)class00809.y), class01392::u, (class02362)class00142.L, class01392::i, class01392::new);

    public Optional<class01400> L() {
        return this.properties;
    }

    public class01392(Optional<class03543<class00891>> optional, Optional<class01400> optional2, Optional<class00809> optional3, class00142 class001422) {
        this.blocks = optional;
        this.properties = optional2;
        this.nbt = optional3;
        this.components = class001422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01392.class, "blocks;properties;nbt;components", "blocks", "properties", "nbt", "components"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01392.class, "blocks;properties;nbt;components", "blocks", "properties", "nbt", "components"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01392.class, "blocks;properties;nbt;components", "blocks", "properties", "nbt", "components"}, this);
    }

    public class00142 i() {
        return this.components;
    }

    public Optional<class00809> u() {
        return this.nbt;
    }

    public Optional<class03543<class00891>> y() {
        return this.blocks;
    }

    public boolean N(class04782 class047822, class07209 class072092) {
        if (!class047822.method_8477(class072092)) {
            return false;
        }
        if (!this.N(class047822.method_8320(class072092))) {
            return false;
        }
        if (this.nbt.isPresent() || !this.components.N()) {
            class00394 class003942 = class047822.method_8321(class072092);
            if (this.nbt.isPresent() && !class01392.N((class05487)class047822, class003942, this.nbt.get())) {
                return false;
            }
            if (!this.components.N() && !class01392.N(class003942, this.components)) {
                return false;
            }
        }
        return true;
    }

    private boolean N(class00500 class005002) {
        if (this.blocks.isPresent() && !class005002.N(this.blocks.get())) {
            return false;
        }
        return !this.properties.isPresent() || this.properties.get().N(class005002);
    }

    public boolean N() {
        return this.nbt.isPresent();
    }

    private static boolean N(@Nullable class00394 class003942, class00142 class001422) {
        return class003942 != null && class001422.test((class02666)class003942.g());
    }

    public boolean N(class06646 class066462) {
        if (!this.N(class066462.N())) {
            return false;
        }
        return !this.nbt.isPresent() || class01392.N(class066462.L(), class066462.y(), this.nbt.get());
    }

    private static boolean N(class05487 class054872, @Nullable class00394 class003942, class00809 class008092) {
        return class003942 != null && class008092.N((class07709)class003942.y_2((class01929)class054872.method_30349()));
    }
}


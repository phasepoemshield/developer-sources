/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04439
 *  minecraft.class04441
 *  minecraft.class05935
 *  minecraft.class05977
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class04439;
import minecraft.class04441;
import minecraft.class05935;
import minecraft.class05977;
import org.jspecify.annotations.Nullable;

public class class00413
implements class04439 {
    public static final MapCodec<class00413> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("keybind").forGetter(class004132 -> class004132.y)).apply(instance, class00413::new));
    private final String y;
    private @Nullable Supplier<class00392> L;

    private class00392 L() {
        if (this.L == null) {
            this.L = (Supplier)class04441.N.apply(this.y);
        }
        return this.L.get();
    }

    public class00413(String string) {
        this.y = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class00413)) return false;
        class00413 class004132 = (class00413)object;
        if (!this.y.equals(class004132.y)) return false;
        return true;
    }

    public String toString() {
        return "keybind{" + this.y + "}";
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public String y() {
        return this.y;
    }

    public MapCodec<class00413> N() {
        return N;
    }

    public <T> Optional<T> method_27660(class05935<T> class059352, class00405 class004052) {
        return this.L().N(class059352, class004052);
    }

    public <T> Optional<T> method_27659(class05977<T> class059772) {
        return this.L().N_8(class059772);
    }
}


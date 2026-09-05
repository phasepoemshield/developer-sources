/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03448
 *  minecraft.class06069
 *  minecraft.class06572
 *  minecraft.class06584
 *  minecraft.class08961
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00342;
import minecraft.class00343;
import minecraft.class00373;
import minecraft.class03448;
import minecraft.class06069;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class08961;

public class class00347
extends class00343
implements class06572 {
    public static final MapCodec<class00347> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("wobble", (Object)true).forGetter(class00343::y), (App)class00342.field_55560.fieldOf("source").forGetter(class003472 -> class003472.y)).apply(instance, class00347::new));
    private final class00342 y;
    private final class06069 L = class06069.u();
    private final class00373 u;

    public class00347(boolean bl, class00342 class003422) {
        super(bl);
        this.y = class003422;
        this.u = this.N(0.9f);
    }

    @Override
    protected float N(class06584 class065842, class03448 class034482, int n, class08961 class089612) {
        float f = this.y.N(class034482, class065842, class089612, this.L);
        long l = class034482.N();
        if (this.u.N(l)) {
            this.u.N(l, f);
        }
        return this.u.N();
    }

    public MapCodec<class00347> N() {
        return N;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class05700
 *  minecraft.class06563
 *  minecraft.class07100
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class05700;
import minecraft.class06563;
import minecraft.class07100;
import minecraft.class08092;

public class class07750
extends class07100
implements class05700 {
    public static final MapCodec<class07750> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06563.field_41600.fieldOf("color").forGetter(class07750::y), (App)class07750.t()).apply(instance, class07750::new));
    private final class06563 Z;

    public class07750(class06563 class065632, class01362 class013622) {
        super(class013622);
        this.Z = class065632;
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)Boolean.valueOf(false)));
    }

    public class06563 y() {
        return this.Z;
    }

    public MapCodec<class07750> N() {
        return N;
    }
}


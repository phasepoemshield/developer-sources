/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class02484
 *  minecraft.class02689
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07491
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class02484;
import minecraft.class02689;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class08036;

public class class04677
extends class00453 {
    public static final MapCodec<class04677> N = RecordCodecBuilder.mapCodec(instance -> class04677.N(instance).and((App)class05919.field_45792.fieldOf("entity").forGetter(class046772 -> class046772.y)).apply(instance, class04677::new));
    private final class05919 y;

    public class04677(List<class05957> list, class05919 class059192) {
        super(list);
        this.y = class059192;
    }

    public Set<class07491<?>> y() {
        return Set.of(this.y.N());
    }

    public static class00471<?> N(class05919 class059192) {
        return class04677.N((T list) -> new class04677((List<class05957>)list, class059192));
    }

    public class05959<class04677> N() {
        return class07439.Y;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        Object object;
        if (class065842.N(class06570.Gw) && (object = class059082.L(this.y.N())) instanceof class08036) {
            class08036 class080362 = (class08036)object;
            class065842.N(class02484.Nb, (Object)class02689.N((GameProfile)class080362.method_7334()));
        }
        return class065842;
    }
}


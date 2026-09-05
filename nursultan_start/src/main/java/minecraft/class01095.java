/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class01123
 *  minecraft.class02484
 *  minecraft.class02701
 *  minecraft.class02708
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00453;
import minecraft.class01123;
import minecraft.class02484;
import minecraft.class02701;
import minecraft.class02708;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;

public class class01095
extends class00453 {
    public static final MapCodec<class01095> N = RecordCodecBuilder.mapCodec(instance -> class01095.N(instance).and(instance.group((App)class02708.u.fieldOf("patterns").forGetter(class010952 -> class010952.y), (App)Codec.BOOL.fieldOf("append").forGetter(class010952 -> class010952.L))).apply(instance, class01095::new));
    private final class02708 y;
    private final boolean L;

    class01095(List<class05957> list, class02708 class027082, boolean bl) {
        super(list);
        this.y = class027082;
        this.L = bl;
    }

    public class05959<class01095> N() {
        return class07439.g;
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        if (this.L) {
            class065842.N(class02484.Nv, (Object)class02708.L, (Object)this.y, (class027082, class027083) -> new class02701().N(class027082).N(class027083).N());
        } else {
            class065842.N(class02484.Nv, (Object)this.y);
        }
        return class065842;
    }

    public static class01123 N(boolean bl) {
        return new class01123(bl);
    }
}


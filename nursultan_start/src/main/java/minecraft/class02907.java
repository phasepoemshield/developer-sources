/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10419
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00845
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10419;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class00453;
import minecraft.class00845;
import minecraft.class02938;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class08122;

public class class02907
extends class00453 {
    public static final MapCodec<class02907> N = RecordCodecBuilder.mapCodec(instance -> class02907.N(instance).and(instance.group((App)class00845.N.fieldOf("item_filter").forGetter(class029072 -> class029072.y), (App)class07439.L.optionalFieldOf("on_pass").forGetter(class029072 -> class029072.L), (App)class07439.L.optionalFieldOf("on_fail").forGetter(class029072 -> class029072.u))).apply(instance, class02907::new));
    private final class00845 y;
    private final Optional<class08122> L;
    private final Optional<class08122> u;

    class02907(List<class05957> list, class00845 class008452, Optional<class08122> optional, Optional<class08122> optional2) {
        super(list);
        this.y = class008452;
        this.L = optional;
        this.u = optional2;
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        this.L.ifPresent(class081222 -> class081222.N(class055612.N((class04489)new class10419("on_pass"))));
        this.u.ifPresent(class081222 -> class081222.N(class055612.N((class04489)new class10419("on_fail"))));
    }

    public class05959<class02907> N() {
        return class07439.t;
    }

    public static class02938 N(class00845 class008452) {
        return new class02938(class008452);
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        Optional<class08122> optional;
        Optional<class08122> optional2 = optional = this.y.test(class065842) ? this.L : this.u;
        if (optional.isPresent()) {
            return (class06584)optional.get().apply((Object)class065842, (Object)class059082);
        }
        return class065842;
    }
}


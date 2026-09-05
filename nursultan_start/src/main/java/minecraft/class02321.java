/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00453
 *  minecraft.class02484
 *  minecraft.class02827
 *  minecraft.class02835
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
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;
import minecraft.class00453;
import minecraft.class02484;
import minecraft.class02827;
import minecraft.class02835;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;

public class class02321
extends class00453 {
    public static final MapCodec<class02321> N = RecordCodecBuilder.mapCodec(instance -> class02321.N(instance).and(instance.group((App)class02835.field_49322.optionalFieldOf("shape").forGetter(class023212 -> class023212.L), (App)class02827.y.optionalFieldOf("colors").forGetter(class023212 -> class023212.u), (App)class02827.y.optionalFieldOf("fade_colors").forGetter(class023212 -> class023212.i), (App)Codec.BOOL.optionalFieldOf("trail").forGetter(class023212 -> class023212.R), (App)Codec.BOOL.optionalFieldOf("twinkle").forGetter(class023212 -> class023212.B))).apply(instance, class02321::new));
    public static final class02827 y = new class02827(class02835.field_7976, IntList.of(), IntList.of(), false, false);
    final Optional<class02835> L;
    final Optional<IntList> u;
    final Optional<IntList> i;
    final Optional<Boolean> R;
    final Optional<Boolean> B;

    public class02321(List<class05957> list, Optional<class02835> optional, Optional<IntList> optional2, Optional<IntList> optional3, Optional<Boolean> optional4, Optional<Boolean> optional5) {
        super(list);
        this.L = optional;
        this.u = optional2;
        this.i = optional3;
        this.R = optional4;
        this.B = optional5;
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(class02484.Ns, (Object)y, this::N);
        return class065842;
    }

    private class02827 N(class02827 class028272) {
        return new class02827(this.L.orElseGet(() -> ((class02827)class028272).N()), this.u.orElseGet(() -> ((class02827)class028272).y()), this.i.orElseGet(() -> ((class02827)class028272).L()), this.R.orElseGet(() -> ((class02827)class028272).u()).booleanValue(), this.B.orElseGet(() -> ((class02827)class028272).i()).booleanValue());
    }

    public class05959<class02321> N() {
        return class07439.e;
    }
}


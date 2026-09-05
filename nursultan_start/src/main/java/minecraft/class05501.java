/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00891
 *  minecraft.class02484
 *  minecraft.class02841
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07491
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00453;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class02841;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05496;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class08092;

public class class05501
extends class00453 {
    public static final MapCodec<class05501> N = RecordCodecBuilder.mapCodec(instance -> class05501.N(instance).and(instance.group((App)class04206.i.b().fieldOf("block").forGetter(class055012 -> class055012.y), (App)Codec.STRING.listOf().fieldOf("properties").forGetter(class055012 -> class055012.L.stream().map(class08092::R).toList()))).apply(instance, class05501::new));
    private final class03556<class00891> y;
    private final Set<class08092<?>> L;

    class05501(List<class05957> list, class03556<class00891> class035562, Set<class08092<?>> set) {
        super(list);
        this.y = class035562;
        this.L = set;
    }

    private class05501(List<class05957> list, class03556<class00891> class035562, List<String> list2) {
        this(list, class035562, list2.stream().map(arg_0 -> ((class00507)((class00891)class035562.N()).E()).N(arg_0)).filter(Objects::nonNull).collect(Collectors.toSet()));
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.Z);
    }

    public static class05496 N(class00891 class008912) {
        return new class05496(class008912);
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        class00500 class005002 = (class00500)class059082.L(class06551.Z);
        if (class005002 != null) {
            class065842.N(class02484.Nl, (Object)class02841.N, class028412 -> {
                for (class08092<?> class080922 : this.L) {
                    if (!class005002.y(class080922)) continue;
                    class028412 = class028412.N(class080922, class005002);
                }
                return class028412;
            });
        }
        return class065842;
    }

    public class05959<class05501> N() {
        return class07439.O;
    }
}


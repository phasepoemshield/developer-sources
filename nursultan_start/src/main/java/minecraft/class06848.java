/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class04206
 *  minecraft.class05908
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class04206;
import minecraft.class05908;
import minecraft.class06816;
import minecraft.class06817;
import minecraft.class06829;
import minecraft.class06834;
import minecraft.class06838;
import minecraft.class06840;
import minecraft.class06847;
import minecraft.class06849;

public interface class06848 {
    public static final Codec<class06834> N = class04206.Na.T().dispatch(class06834::N, mapCodec -> mapCodec);
    public static final Codec<class06834> y = Codec.lazyInitialized(() -> Codec.withAlternative(N, class06847.L));

    public static MapCodec<? extends class06834> N(class00751<MapCodec<? extends class06834>> class007512) {
        class00751.N(class007512, (String)"group", class06847.y);
        class00751.N(class007512, (String)"filtered", class06817.N);
        class00751.N(class007512, (String)"limit_slots", class06849.N);
        class00751.N(class007512, (String)"slot_range", class06829.N);
        class00751.N(class007512, (String)"contents", class06840.N);
        return (MapCodec)class00751.N(class007512, (String)"empty", class06816.N);
    }

    public static Function<class05908, class06838> N(Collection<? extends class06834> collection) {
        List<? extends class06834> list = List.copyOf(collection);
        return switch (list.size()) {
            case 0 -> class059082 -> class06838.N;
            case 1 -> ((class06834)list.getFirst())::N;
            case 2 -> {
                class06834 var2_2 = list.get(0);
                class06834 var3_3 = list.get(1);
                yield class059082 -> class06838.N(var2_2.N((class05908)class059082), var3_3.N((class05908)class059082));
            }
            default -> class059082 -> {
                ArrayList<class06838> arrayList = new ArrayList<class06838>();
                for (class06834 class068342 : list) {
                    arrayList.add(class068342.N((class05908)class059082));
                }
                return class06838.N_64(arrayList);
            };
        };
    }
}


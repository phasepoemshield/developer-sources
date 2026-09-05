/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  minecraft.class00205
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00985
 *  minecraft.class00995
 *  minecraft.class01761
 *  minecraft.class02030
 *  minecraft.class02305
 *  minecraft.class03333
 *  minecraft.class03341
 *  minecraft.class03343
 *  minecraft.class03356
 *  minecraft.class03357
 *  minecraft.class03358
 *  minecraft.class03359
 *  minecraft.class03360
 *  minecraft.class03362
 *  minecraft.class03363
 *  minecraft.class03369
 *  minecraft.class03370
 *  minecraft.class03571
 *  minecraft.class03574
 *  minecraft.class03575
 *  minecraft.class03611
 *  minecraft.class04206
 *  minecraft.class04795
 *  minecraft.class04811
 *  minecraft.class05841
 *  minecraft.class05842
 *  minecraft.class06245
 *  minecraft.class08101
 *  minecraft.class08116
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class00205;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00985;
import minecraft.class00995;
import minecraft.class01761;
import minecraft.class02030;
import minecraft.class02305;
import minecraft.class03333;
import minecraft.class03341;
import minecraft.class03343;
import minecraft.class03356;
import minecraft.class03357;
import minecraft.class03358;
import minecraft.class03359;
import minecraft.class03360;
import minecraft.class03362;
import minecraft.class03363;
import minecraft.class03369;
import minecraft.class03370;
import minecraft.class03571;
import minecraft.class03574;
import minecraft.class03575;
import minecraft.class03611;
import minecraft.class04206;
import minecraft.class04795;
import minecraft.class04811;
import minecraft.class05841;
import minecraft.class05842;
import minecraft.class06245;
import minecraft.class08101;
import minecraft.class08116;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class04826 {
    private static final Map<class00404<?>, class04795<?, ?>> N = Maps.newHashMap();

    static {
        class04826.N(class00404.field_11911, class03341::new);
        class04826.N(class00404.field_40330, class02030::new);
        class04826.N(class00404.field_11889, class03333::new);
        class04826.N(class00404.field_11897, class048112 -> new class03370());
        class04826.N(class00404.field_11914, class03343::new);
        class04826.N(class00404.field_11901, class03343::new);
        class04826.N(class00404.field_11891, class03343::new);
        class04826.N(class00404.field_11912, class03369::new);
        class04826.N(class00404.field_16412, class05842::new);
        class04826.N(class00404.field_11898, class048112 -> new class00995());
        class04826.N(class00404.field_11906, class048112 -> new class03363());
        class04826.N(class00404.field_11890, class048112 -> new class03575());
        class04826.N(class00404.field_11913, class03359::new);
        class04826.N(class00404.field_11905, class03571::new);
        class04826.N(class00404.field_11895, class048112 -> new class03356());
        class04826.N(class00404.field_55993, class048112 -> new class00205());
        class04826.N(class00404.field_11896, class03360::new);
        class04826.N(class00404.field_11910, class03357::new);
        class04826.N(class00404.field_11902, class03362::new);
        class04826.N(class00404.field_16413, class06245::new);
        class04826.N(class00404.field_17380, class05841::new);
        class04826.N(class00404.field_42780, class03611::new);
        class04826.N(class00404.field_42781, class03574::new);
        class04826.N(class00404.field_47352, class01761::new);
        class04826.N(class00404.field_48859, class02305::new);
        class04826.N(class00404.field_61438, class08116::new);
        class04826.N(class00404.field_61437, class08101::new);
    }

    public static <T extends class00394, S extends class00985> void N(class00404<? extends T> class004042, class04795<T, S> class047952) {
        N.put(class004042, class047952);
    }

    public static Map<class00404<?>, class03358<?, ?>> N(class04811 class048112) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        N.forEach((class004042, class047952) -> {
            try {
                builder.put(class004042, (Object)class047952.create(class048112));
            }
            catch (Exception exception) {
                throw new IllegalStateException("Failed to create model for " + String.valueOf(class04206.U.y(class004042)), exception);
            }
        });
        return builder.build();
    }

    private static void N(CallbackInfo callbackInfo) {
        BlockEntityRendererRegistryImpl.setup((class004042, class047952) -> N.put((class00404<?>)class004042, (class04795<?, ?>)class047952));
    }
}


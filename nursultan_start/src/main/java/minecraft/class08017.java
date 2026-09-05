/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class01929
 *  minecraft.class02904
 *  minecraft.class02950
 *  minecraft.class03729
 *  minecraft.class05654
 *  minecraft.class05838
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07439
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class01929;
import minecraft.class02904;
import minecraft.class02950;
import minecraft.class03729;
import minecraft.class05654;
import minecraft.class05838;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07439;
import org.slf4j.Logger;

public class class08017
extends class00453 {
    private static final Logger y = LogUtils.getLogger();
    public static final MapCodec<class08017> N = RecordCodecBuilder.mapCodec(instance -> class08017.N(instance).apply(instance, class08017::new));

    public static class00471<?> L() {
        return class08017.N(class08017::new);
    }

    private class08017(List<class05957> list) {
        super(list);
    }

    public class05959<class08017> N() {
        return class07439.E;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class06584 class065843;
        if (class065842.R()) {
            return class065842;
        }
        class02904 class029042 = new class02904(class065842);
        Optional var4 = class059082.u().method_64577().N(class05838.y, (class02950)class029042, (class07299)class059082.u());
        if (var4.isPresent() && !(class065843 = ((class05654)((class03729)var4.get()).y()).method_8116(class029042, (class01929)class059082.u().method_30349())).R()) {
            return class065843.L(class065842.c());
        }
        y.warn("Couldn't smelt {} because there is no smelting recipe", (Object)class065842);
        return class065842;
    }
}


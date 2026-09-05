/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01381
 *  minecraft.class05908
 *  minecraft.class05959
 *  minecraft.class06584
 */
package minecraft;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import minecraft.class01381;
import minecraft.class05908;
import minecraft.class05959;
import minecraft.class06584;

public interface class08122
extends class01381,
BiFunction<class06584, class05908, class06584> {
    public class05959<? extends class08122> N();

    public static Consumer<class06584> N(BiFunction<class06584, class05908, class06584> biFunction, Consumer<class06584> consumer, class05908 class059082) {
        return class065842 -> consumer.accept((class06584)biFunction.apply((class06584)class065842, class059082));
    }
}


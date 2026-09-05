/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class06665
 *  minecraft.class07185
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.registry;

import minecraft.class00500;
import minecraft.class00891;
import minecraft.class06665;
import minecraft.class07185;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public interface StrippableBlockRegistry$StrippingTransformer {
    public static final StrippableBlockRegistry$StrippingTransformer DEFAULT_STATE = (class008912, class005002) -> class008912.W();
    public static final StrippableBlockRegistry$StrippingTransformer VANILLA = (class008912, class005002) -> (class00500)class008912.W().L((class08092)class06665.V, (Comparable)((class07185)class005002.N((class08092)class06665.V, (Comparable)class07185.field_11052)));
    public static final StrippableBlockRegistry$StrippingTransformer COPY = class00891::s;

    public static StrippableBlockRegistry$StrippingTransformer copyOf(class08092<?> ... class08092Array) {
        if (class08092Array.length == 0) {
            return DEFAULT_STATE;
        }
        if (class08092Array.length == 1 && class08092Array[0] == class06665.V) {
            return VANILLA;
        }
        return (class008912, class005002) -> {
            class00500 class005003 = class008912.W();
            for (class08092 class080922 : class08092Array) {
                if (!class005002.y(class080922)) continue;
                class005003 = (class00500)class005003.L(class080922, class005002.L(class080922));
            }
            return class005003;
        };
    }

    public @Nullable class00500 getStrippedBlockState(class00891 var1, class00500 var2);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00423
 *  minecraft.class00648
 *  minecraft.class02868
 *  minecraft.class02897
 *  minecraft.class04246
 *  minecraft.class04266
 *  minecraft.class04275
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.networking;

import java.util.ArrayList;
import minecraft.class00423;
import minecraft.class00648;
import minecraft.class02868;
import minecraft.class02897;
import minecraft.class04246;
import minecraft.class04266;
import minecraft.class04275;
import org.jspecify.annotations.Nullable;

public record VanillaPacketTypes(class02897<?>[] ids) {
    public static final VanillaPacketTypes PLAY_S2C = VanillaPacketTypes.of((class04246)class04266.L);
    public static final VanillaPacketTypes PLAY_C2S = VanillaPacketTypes.of((class04246)class04266.y);
    public static final VanillaPacketTypes CONFIGURATION_S2C = VanillaPacketTypes.of((class04246)class02868.L);
    public static final VanillaPacketTypes CONFIGURATION_C2S = VanillaPacketTypes.of((class04246)class02868.N);

    public @Nullable class02897<?> get(int n) {
        return n > 0 && n < this.ids.length ? this.ids[n] : null;
    }

    public static VanillaPacketTypes get(class04275<?> class042752) {
        return switch (class042752.N()) {
            case class00648.field_45671 -> {
                if (class042752.y() == class00423.field_11942) {
                    yield CONFIGURATION_S2C;
                }
                yield CONFIGURATION_C2S;
            }
            case class00648.field_20591 -> {
                if (class042752.y() == class00423.field_11942) {
                    yield PLAY_S2C;
                }
                yield PLAY_C2S;
            }
            default -> throw new IllegalArgumentException("Not implemented for " + String.valueOf(class042752.N()) + "!");
        };
    }

    private static VanillaPacketTypes of(class04246 class042462) {
        ArrayList arrayList = new ArrayList();
        class042462.N().N((class028972, n) -> arrayList.add(class028972));
        return new VanillaPacketTypes((class02897[])arrayList.toArray(class02897[]::new));
    }
}


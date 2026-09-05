/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class01255
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03764
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04382
 *  minecraft.class04865
 *  minecraft.class07833
 *  minecraft.class07850
 *  minecraft.class08088
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import java.util.Optional;
import minecraft.class01255;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03764;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04382;
import minecraft.class04865;
import minecraft.class05946;
import minecraft.class05953;
import minecraft.class07833;
import minecraft.class07850;
import minecraft.class08088;

public class class05964 {
    public static final class05946<class04382> N = class05964.N("normal");
    public static final class05946<class04382> y = class05964.N("flat");
    public static final class05946<class04382> L = class05964.N("large_biomes");
    public static final class05946<class04382> u = class05964.N("amplified");
    public static final class05946<class04382> i = class05964.N("single_biome_surface");
    public static final class05946<class04382> R = class05964.N("debug_all_block_states");

    public static class03764 L(class01929 class019292) {
        return ((class04382)class019292.y(class04227.yO).y(y).N()).N();
    }

    public static class01255 y(class01929 class019292) {
        return (class01255)((class04382)class019292.y(class04227.yO).y(N).N()).y().orElseThrow();
    }

    public static void N(class04116<class04382> class041162) {
        new class05953(class041162).N();
    }

    public static class03764 N(class01929 class019292) {
        return ((class04382)class019292.y(class04227.yO).y(N).N()).N();
    }

    private static class05946<class04382> N(String string) {
        return class05946.N(class04227.yO, class01894.y((String)string));
    }

    public static Optional<class05946<class04382>> N(class03764 class037642) {
        return class037642.N(class01255.y).flatMap(class012552 -> {
            class08088 class080882 = class012552.y();
            Objects.requireNonNull(class080882);
            class08088 class080883 = class080882;
            int n = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class07850.class, class07833.class, class04865.class}, (Object)class080883, (int)n)) {
                case 0 -> {
                    class07850 var3_3 = (class07850)class080883;
                    yield Optional.of(y);
                }
                case 1 -> {
                    class07833 var4_4 = (class07833)class080883;
                    yield Optional.of(R);
                }
                case 2 -> {
                    class04865 var5_5 = (class04865)class080883;
                    yield Optional.of(N);
                }
                default -> Optional.empty();
            };
        });
    }
}


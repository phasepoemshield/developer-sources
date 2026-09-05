/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class02024
 *  minecraft.class03246
 *  minecraft.class03247
 *  minecraft.class03266
 *  minecraft.class03362
 *  minecraft.class03369
 *  minecraft.class04216
 *  minecraft.class04221
 *  minecraft.class04223
 *  minecraft.class04233
 *  minecraft.class04476
 *  minecraft.class05414
 *  minecraft.class05422
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class05946
 *  minecraft.class06245
 *  minecraft.class07135
 *  minecraft.class08719
 *  minecraft.class08874
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class03246;
import minecraft.class03247;
import minecraft.class03266;
import minecraft.class03362;
import minecraft.class03369;
import minecraft.class04216;
import minecraft.class04221;
import minecraft.class04223;
import minecraft.class04233;
import minecraft.class04476;
import minecraft.class05414;
import minecraft.class05422;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class05946;
import minecraft.class06245;
import minecraft.class07135;
import minecraft.class08569;
import minecraft.class08571;
import minecraft.class08589;
import minecraft.class08719;
import minecraft.class08874;

public class class08581
implements class07135 {
    private static final class01894 N = class01894.y((String)"trims/color_palettes/trim_palette");
    private static final Map<String, class01894> i = class08581.y().collect(Collectors.toMap(class08569::N, class085692 -> class01894.y((String)("trims/color_palettes/" + class085692.N()))));
    private static final List<class05946<class03246>> R = List.of(class03247.N, class03247.y, class03247.L, class03247.u, class03247.i, class03247.R, class03247.M, class03247.B, class03247.Z, class03247.z, class03247.U, class03247.E, class03247.W, class03247.m, class03247.P, class03247.s, class03247.T, class03247.b);
    private static final List<class08719> M = List.of(class08719.field_54125, class08719.field_54126);
    private final class01997 B;

    private static List<class04233> L() {
        return List.of(new class03266(class08581.N(), N, i));
    }

    private static List<class04233> M() {
        return List.of(class08581.N(class08874.Z), class08581.N(class08874.z), class08581.N(class05911.T));
    }

    public class08581(class01996 class019962) {
        this.B = class019962.method_45973(class02024.field_39368, "atlases");
    }

    private static List<class04233> B() {
        return List.of(new class04221("gui/sprites", ""), new class04221("mob_effect", "mob_effect/"));
    }

    private static List<class04233> i() {
        return List.of(class08581.N(class05911.W), new class03266(List.of(class05422.N, class05422.y, class05422.L, class05422.u), N, i));
    }

    private static List<class04233> u() {
        return List.of(class08581.N(class05911.m), class08581.N(class03362.N), class08581.N(class06245.N), class08581.N(class03369.N));
    }

    private static List<class04233> y(class08571 class085712) {
        return List.of(class08581.N(class085712));
    }

    private static Stream<class08569> y() {
        return class05422.i.stream().map(class05414::N).flatMap(class085482 -> Stream.concat(Stream.of(class085482.N()), class085482.y().values().stream())).sorted(Comparator.comparing(class08569::N));
    }

    private CompletableFuture<?> N(class04476 class044762, class01894 class018942, List<class04233> list) {
        return class07135.N((class04476)class044762, (Codec)class04223.y, list, (Path)this.B.N(class018942));
    }

    private static class04233 N(class08571 class085712) {
        return new class04221(class085712.y(), class085712.y() + "/");
    }

    private static class04233 N(class05913 class059132) {
        return new class04216(class059132.y());
    }

    private static List<class04233> N(String string) {
        return List.of(new class04221(string, ""));
    }

    private static List<class01894> N() {
        ArrayList<class01894> arrayList = new ArrayList<class01894>(R.size() * M.size());
        Iterator<class05946<class03246>> var1 = R.iterator();
        while (var1.hasNext()) {
            class01894 class018942 = class03247.N(var1.next());
            for (class08719 class087192 : M) {
                arrayList.add(class018942.N(string -> class087192.N() + "/" + string));
            }
        }
        return arrayList;
    }

    public String method_10321() {
        return "Atlas Definitions";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return CompletableFuture.allOf(this.N(class044762, class08589.N, class08581.L()), this.N(class044762, class08589.y, class08581.R()), this.N(class044762, class08589.L, class08581.y(class05911.v)), this.N(class044762, class08589.u, class08581.u()), this.N(class044762, class08589.i, class08581.i()), this.N(class044762, class08589.R, class08581.y(class05911.b)), this.N(class044762, class08589.M, class08581.y(class05911.j)), this.N(class044762, class08589.B, class08581.B()), this.N(class044762, class08589.Z, class08581.N("map/decorations")), this.N(class044762, class08589.z, class08581.N("painting")), this.N(class044762, class08589.U, class08581.N("particle")), this.N(class044762, class08589.E, class08581.M()), this.N(class044762, class08589.W, class08581.y(class05911.n)), this.N(class044762, class08589.m, class08581.y(class05911.t)), this.N(class044762, class08589.P, class08581.N("environment/celestial")));
    }

    private static List<class04233> R() {
        return List.of(class08581.N(class08874.B), class08581.N(class05911.s));
    }
}


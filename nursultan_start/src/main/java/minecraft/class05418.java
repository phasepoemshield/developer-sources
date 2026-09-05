/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import org.jspecify.annotations.Nullable;

public final class class05418 {
    public static final class05418 N = class05418.N("all");
    public static final class05418 y = class05418.N("texture", N);
    public static final class05418 L = class05418.N("particle", y);
    public static final class05418 u = class05418.N("end", N);
    public static final class05418 i = class05418.N("bottom", u);
    public static final class05418 R = class05418.N("top", u);
    public static final class05418 M = class05418.N("front", N);
    public static final class05418 B = class05418.N("back", N);
    public static final class05418 Z = class05418.N("side", N);
    public static final class05418 z = class05418.N("north", Z);
    public static final class05418 U = class05418.N("south", Z);
    public static final class05418 E = class05418.N("east", Z);
    public static final class05418 W = class05418.N("west", Z);
    public static final class05418 m = class05418.N("up");
    public static final class05418 P = class05418.N("down");
    public static final class05418 s = class05418.N("cross");
    public static final class05418 T = class05418.N("cross_emissive");
    public static final class05418 b = class05418.N("plant");
    public static final class05418 j = class05418.N("wall", N);
    public static final class05418 v = class05418.N("rail");
    public static final class05418 n = class05418.N("wool");
    public static final class05418 t = class05418.N("pattern");
    public static final class05418 G = class05418.N("pane");
    public static final class05418 l = class05418.N("edge");
    public static final class05418 d = class05418.N("fan");
    public static final class05418 w = class05418.N("stem");
    public static final class05418 k = class05418.N("upperstem");
    public static final class05418 Y = class05418.N("crop");
    public static final class05418 Q = class05418.N("dirt");
    public static final class05418 O = class05418.N("fire");
    public static final class05418 g = class05418.N("lantern");
    public static final class05418 I = class05418.N("platform");
    public static final class05418 J = class05418.N("unsticky");
    public static final class05418 o = class05418.N("torch");
    public static final class05418 q = class05418.N("layer0");
    public static final class05418 K = class05418.N("layer1");
    public static final class05418 V = class05418.N("layer2");
    public static final class05418 e = class05418.N("lit_log");
    public static final class05418 H = class05418.N("candle");
    public static final class05418 c = class05418.N("inside");
    public static final class05418 X = class05418.N("content");
    public static final class05418 a = class05418.N("inner_top");
    public static final class05418 p = class05418.N("flowerbed");
    public static final class05418 F = class05418.N("tentacles");
    public static final class05418 A = class05418.N("bars");
    private final String f;
    private final @Nullable class05418 C;

    private class05418(String string, @Nullable class05418 class054182) {
        this.f = string;
        this.C = class054182;
    }

    public String toString() {
        return "#" + this.f;
    }

    public @Nullable class05418 y() {
        return this.C;
    }

    public static class05418 N(String string) {
        return new class05418(string, null);
    }

    public String N() {
        return this.f;
    }

    public static class05418 N(String string, class05418 class054182) {
        return new class05418(string, class054182);
    }
}


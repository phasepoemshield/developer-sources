/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10226
 *  Nursultan.class10227
 *  Nursultan.class10229
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  java.lang.MatchException
 *  jerozgen.languagereload.mixin.TextDisplayEntityAccessor
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03748
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class05216
 *  minecraft.class06984
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07701
 *  minecraft.class08152
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10226;
import Nursultan.class10227;
import Nursultan.class10229;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Optional;
import jerozgen.languagereload.mixin.TextDisplayEntityAccessor;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03663;
import minecraft.class03681;
import minecraft.class03684;
import minecraft.class03688;
import minecraft.class03692;
import minecraft.class03748;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class05216;
import minecraft.class06984;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07701;
import minecraft.class08152;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class03677
extends class03688
implements TextDisplayEntityAccessor {
    public static final String s = "text";
    private static final String G = "line_width";
    private static final String l = "text_opacity";
    private static final String d = "background";
    private static final String w = "shadow";
    private static final String k = "see_through";
    private static final String Y = "default_background";
    private static final String Q = "alignment";
    public static final byte T = 1;
    public static final byte b = 2;
    public static final byte j = 4;
    public static final byte v = 8;
    public static final byte n = 16;
    private static final byte O = -1;
    public static final int t = 0x40000000;
    private static final int g = 200;
    private static final class02131<class00392> I = class03289.N(class03677.class, (class04383)class02154.R);
    private static final class02131<Integer> J = class03289.N(class03677.class, (class04383)class02154.y);
    private static final class02131<Integer> o = class03289.N(class03677.class, (class04383)class02154.y);
    private static final class02131<Byte> q = class03289.N(class03677.class, (class04383)class02154.N);
    private static final class02131<Byte> K = class03289.N(class03677.class, (class04383)class02154.N);
    private static final IntSet V = IntSet.of((int[])new int[]{I.N(), J.N(), o.N(), q.N(), K.N()});
    private @Nullable class03663 e;
    private @Nullable class03681 H;

    public static class03684 L(byte by) {
        if ((by & 8) != 0) {
            return class03684.field_42451;
        }
        if ((by & 0x10) != 0) {
            return class03684.field_42452;
        }
        return class03684.field_42450;
    }

    public final int T() {
        return (Integer)this.field_6011.N(J);
    }

    @Override
    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (V.contains(class021312.N())) {
            this.P = true;
        }
    }

    @Override
    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(I, (Object)class00392.i());
        class042932.N(J, (Object)200);
        class042932.N(o, (Object)0x40000000);
        class042932.N(q, (Object)-1);
        class042932.N(K, (Object)0);
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(s, class03748.N, (Object)this.s());
        class083292.N(G, this.T());
        class083292.N(d, this.j());
        class083292.N(l, this.b());
        byte by = this.v();
        class03677.N(by, class083292, w, (byte)1);
        class03677.N(by, class083292, k, (byte)2);
        class03677.N(by, class083292, Y, (byte)4);
        class083292.N(Q, class03684.field_42453, (Object)class03677.L(by));
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.i(class082992.N(G, 200));
        this.N(class082992.N(l, (byte)-1));
        this.R(class082992.N(d, 0x40000000));
        byte by = class03677.N((byte)0, class082992, w, (byte)1);
        by = class03677.N(by, class082992, k, (byte)2);
        by = class03677.N(by, class082992, Y, (byte)4);
        Optional var3 = class082992.N(Q, class03684.field_42453);
        if (var3.isPresent()) {
            by = switch (((class03684)((Object)var3.get())).ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> by;
                case 1 -> (byte)(by | 8);
                case 2 -> (byte)(by | 0x10);
            };
        }
        this.y(by);
        Optional var4 = class082992.N(s, class03748.N);
        if (var4.isPresent()) {
            try {
                class07299 class072992 = this.method_73183();
                if (class072992 instanceof class04782) {
                    class04782 class047822 = (class04782)class072992;
                    class072992 = this.method_5671(class047822).N((class08152)class06984.L);
                    class05216 class052162 = class00390.N((class07701)class072992, (class00392)((class00392)var4.get()), (class07049)this, (int)0);
                    this.N((class00392)class052162);
                } else {
                    this.N((class00392)class00392.i());
                }
            }
            catch (Exception exception) {
                class03688.N.warn("Failed to parse display entity text {}", (Object)var4, (Object)exception);
            }
        }
    }

    public class03677(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public final void i(int n) {
        this.field_6011.N(J, (Object)n);
    }

    public final byte b() {
        return (Byte)this.field_6011.N(q);
    }

    public final class00392 s() {
        return (class00392)this.field_6011.N(I);
    }

    public @Nullable class03681 n() {
        return this.H;
    }

    private class03681 t() {
        return new class03681(this.s(), this.T(), class03692.N(this.b()), class03692.N(this.j()), this.v());
    }

    public final byte v() {
        return (Byte)this.field_6011.N(K);
    }

    public final int j() {
        return (Integer)this.field_6011.N(o);
    }

    public final void y(byte by) {
        this.field_6011.N(K, (Object)by);
    }

    private class03681 N(class03681 class036812, float f) {
        int n = class036812.u().method_48889(f);
        int n2 = class036812.L().method_48889(f);
        return new class03681(this.s(), this.T(), (class03692)new class10226(n2, (int)this.b()), (class03692)new class10229(n, this.j()), this.v());
    }

    public class03663 N(class10227 class102272) {
        if (this.e == null) {
            this.e = this.H != null ? class102272.split(this.H.N(), this.H.y()) : new class03663(List.of(), 0);
        }
        return this.e;
    }

    public final void N(byte by) {
        this.field_6011.N(q, (Object)by);
    }

    public final void N(class00392 class003922) {
        this.field_6011.N(I, (Object)class003922);
    }

    private static byte N(byte by, class08299 class082992, String string, byte by2) {
        if (class082992.N(string, false)) {
            return (byte)(by | by2);
        }
        return by;
    }

    @Override
    protected void N(boolean bl, float f) {
        this.H = bl && this.H != null ? this.N(this.H, f) : this.t();
        this.e = null;
    }

    private static void N(byte by, class08329 class083292, String string, byte by2) {
        class083292.N(string, (by & by2) != 0);
    }

    public /* synthetic */ void languagereload_setTextLines(class03663 class036632) {
        this.e = class036632;
    }

    public final void R(int n) {
        this.field_6011.N(o, (Object)n);
    }
}


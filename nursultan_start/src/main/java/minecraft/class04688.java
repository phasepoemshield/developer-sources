/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00522
 *  minecraft.class00734
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08400
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00522;
import minecraft.class00734;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04651;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08400;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class04688
extends class00522<class04651, class04688> {
    public static final Codec<class04688> N = class04688.N((Codec)class04206.L.T(), class04651::M).stable();
    public static final int M = 9;
    public static final int B = 8;
    private boolean Z;

    public class06889 L(class07290 class072902, class07209 class072092) {
        return this.N().N(class072902, class072092, this);
    }

    public boolean M() {
        return this.N().Z();
    }

    public class04688(class04651 class046512, Reference2ObjectArrayMap<class08092<?>, Comparable<?>> reference2ObjectArrayMap, MapCodec<class04688> mapCodec) {
        super((Object)class046512, reference2ObjectArrayMap, mapCodec);
        this.N(class046512, reference2ObjectArrayMap, mapCodec, null);
    }

    public class00500 B() {
        return this.N().y(this);
    }

    public @Nullable class07126 Z() {
        return this.N().B();
    }

    public float i() {
        return this.N().N(this);
    }

    public @Nullable class00734 i(class07290 class072902, class07209 class072092) {
        return this.N().L(this, class072902, class072092);
    }

    public class03556<class04651> U() {
        return ((class04651)this.u).U();
    }

    public float z() {
        return this.N().L();
    }

    public boolean u() {
        return this.N().L(this);
    }

    public class00494 u(class07290 class072902, class07209 class072092) {
        return this.N().y(this, class072902, class072092);
    }

    public boolean y(class07290 class072902, class07209 class072092) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                class07209 class072093 = class072092.method_10069(i, 0, j);
                if (class072902.method_8316(class072093).N().N(this.N()) || class072902.method_8320(class072093).t()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean y(class04651 class046512) {
        return this.N() == class046512;
    }

    public Stream<class03530<class04651>> E() {
        return ((class04651)this.u).U().L();
    }

    public void N(class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002) {
        this.N().N(class072992, class072092, class070492, class084002);
    }

    public boolean N(class07290 class072902, class07209 class072092, class04651 class046512, class07211 class072112) {
        return this.N().N(this, class072902, class072092, class046512, class072112);
    }

    public class04651 N() {
        return (class04651)this.u;
    }

    public float N(class07290 class072902, class07209 class072092) {
        return this.N().N(this, class072902, class072092);
    }

    public void N(class04782 class047822, class07209 class072092, class06069 class060692) {
        this.N().N(class047822, class072092, this, class060692);
    }

    public void N(class07299 class072992, class07209 class072092, class06069 class060692) {
        this.N().N(class072992, class072092, this, class060692);
    }

    public void N(class04782 class047822, class07209 class072092, class00500 class005002) {
        this.N().y(class047822, class072092, class005002, this);
    }

    private void N(class04651 class046512, Reference2ObjectArrayMap reference2ObjectArrayMap, MapCodec mapCodec, CallbackInfo callbackInfo) {
        this.Z = this.N().y();
    }

    public boolean N(class03543<class04651> class035432) {
        return class035432.N(this.N().U());
    }

    public boolean N(class03530<class04651> class035302) {
        return this.N().U().N(class035302);
    }

    public boolean N(class04651 class046512) {
        return this.u == class046512 && ((class04651)this.u).L(this);
    }

    public boolean W() {
        return this.Z;
    }

    public int R() {
        return this.N().u(this);
    }
}


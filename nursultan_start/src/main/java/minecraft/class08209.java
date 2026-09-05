/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04770
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05349
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class06509
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06912
 *  minecraft.class07041
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04770;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05349;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class06509;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class07041;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08200;
import minecraft.class08207;
import minecraft.class08237;
import minecraft.class08241;

public final class class08209
extends Record {
    private final float consumeSeconds;
    private final class06509 animation;
    private final class03556<class04891> sound;
    private final boolean hasConsumeParticles;
    private final List<class08200> onConsumeEffects;
    public static final float N = 1.6f;
    private static final int Z = 4;
    private static final float z = 0.21875f;
    public static final Codec<class08209> y = RecordCodecBuilder.create(instance -> instance.group((App)class06338.n.optionalFieldOf("consume_seconds", (Object)Float.valueOf(1.6f)).forGetter(class08209::L), (App)class06509.field_53764.optionalFieldOf("animation", (Object)class06509.field_8950).forGetter(class08209::u), (App)class04891.y.optionalFieldOf("sound", (Object)class04909.EF).forGetter(class08209::i), (App)Codec.BOOL.optionalFieldOf("has_consume_particles", (Object)true).forGetter(class08209::R), (App)class08200.u.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(class08209::M)).apply(instance, class08209::new));
    public static final class02362<class04247, class08209> L = class02362.N((class02362)class02389.E, class08209::L, (class02362)class06509.field_53765, class08209::u, (class02362)class04891.u, class08209::i, (class02362)class02389.y, class08209::R, (class02362)class08200.i.N_33(class02389.N()), class08209::M, class08209::new);

    public float L() {
        return this.consumeSeconds;
    }

    public List<class08200> M() {
        return this.onConsumeEffects;
    }

    public class08209(float f, class06509 class065092, class03556<class04891> class035562, boolean bl, List<class08200> list) {
        this.consumeSeconds = f;
        this.animation = class065092;
        this.sound = class035562;
        this.hasConsumeParticles = bl;
        this.onConsumeEffects = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08209.class, "consumeSeconds;animation;sound;hasConsumeParticles;onConsumeEffects", "consumeSeconds", "animation", "sound", "hasConsumeParticles", "onConsumeEffects"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08209.class, "consumeSeconds;animation;sound;hasConsumeParticles;onConsumeEffects", "consumeSeconds", "animation", "sound", "hasConsumeParticles", "onConsumeEffects"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08209.class, "consumeSeconds;animation;sound;hasConsumeParticles;onConsumeEffects", "consumeSeconds", "animation", "sound", "hasConsumeParticles", "onConsumeEffects"}, this);
    }

    public class03556<class04891> i() {
        return this.sound;
    }

    public class06509 u() {
        return this.animation;
    }

    public static class08241 y() {
        return new class08241();
    }

    private class07041 N(class07041 class070412, class06584 class065842, LocalRef localRef) {
        return this.N(class070412, class065842, (class06584)localRef.get());
    }

    public class07082 N(class07438 class074382, class06584 class065842, class07050 class070502) {
        class06584 class065843;
        if (!this.N(class074382, class065842)) {
            return class07082.u;
        }
        if (this.N() > 0) {
            class074382.method_6019(class070502);
            return class07082.L;
        }
        class06584 class065844 = class065843 = this.N(class074382.method_73183(), class074382, class065842);
        class07041 class070412 = class07082.L;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class065842);
        class065842 = (class06584)localRefImpl.dispose();
        return this.N(class070412, class065844, (LocalRef)localRefImpl);
    }

    private class07041 N(class07041 class070412, class06584 class065842, class06584 class065843) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5) && class065843.N(class06570.jT)) {
            return class070412.N(class065843.R() ? new class06584((class07310)class06570.jU) : class065843);
        }
        return class070412.N(class065842);
    }

    public void N(class06069 class060692, class07438 class074382, class06584 class065842, int n) {
        float f;
        float f2 = class060692.Z() ? 0.5f : 1.0f;
        float f3 = class060692.N(1.0f, 0.2f);
        float f4 = 0.5f;
        float f5 = class04995.y((class06069)class060692, (float)0.9f, (float)1.0f);
        float f6 = this.animation == class06509.field_8946 ? 0.5f : f2;
        float f7 = f = this.animation == class06509.field_8946 ? f5 : f3;
        if (this.hasConsumeParticles) {
            class074382.method_6037(class065842, n);
        }
        class04891 class048912 = class074382 instanceof class08207 ? ((class08207)class074382).N(class065842) : (class04891)this.sound.N();
        class074382.method_5783(class048912, f6, f);
    }

    public int N() {
        return (int)(this.consumeSeconds * 20.0f);
    }

    public class06584 N(class07299 class072992, class07438 class074382, class06584 class065842) {
        class06069 class060692 = class074382.method_59922();
        this.N(class060692, class074382, class065842, 16);
        if (class074382 instanceof class04770) {
            class04770 class047702 = (class04770)class074382;
            class047702.method_7259(class01235.L.y((Object)class065842.B()));
            class06912.k.N(class047702, class065842);
        }
        class065842.N(class08237.class).forEach(class082372 -> class082372.N(class072992, class074382, class065842, this));
        if (!class072992.method_8608()) {
            this.onConsumeEffects.forEach(class082002 -> class082002.N(class072992, class065842, class074382));
        }
        class074382.method_32876((class03556)(this.animation == class06509.field_8946 ? class01194.E : class01194.W));
        class065842.N(1, class074382);
        return class065842;
    }

    public boolean N(class07438 class074382, class06584 class065842) {
        class05349 class053492 = (class05349)class065842.method_58694(class02484.d);
        if (class053492 != null && class074382 instanceof class08036) {
            return ((class08036)class074382).method_7332(class053492.L());
        }
        return true;
    }

    public boolean N(int n) {
        int n2;
        int n3 = this.N() - n;
        return n3 > (n2 = (int)((float)this.N() * 0.21875f)) && n % 4 == 0;
    }

    public boolean R() {
        return this.hasConsumeParticles;
    }
}


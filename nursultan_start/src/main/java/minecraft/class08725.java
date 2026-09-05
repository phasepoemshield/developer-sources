/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01217
 *  minecraft.class01235
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02477
 *  minecraft.class02523
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05946
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08036
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class11647;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class01217;
import minecraft.class01235;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02477;
import minecraft.class02523;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05946;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08699;
import minecraft.class08703;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class08725
extends Record {
    private final class07085 slot;
    private final class03556<class04891> equipSound;
    private final Optional<class05946<class11647>> assetId;
    private final Optional<class01894> cameraOverlay;
    private final Optional<class03543<class07078<?>>> allowedEntities;
    private final boolean dispensable;
    private final boolean swappable;
    private final boolean damageOnHurt;
    private final boolean equipOnInteract;
    private final boolean canBeSheared;
    private final class03556<class04891> shearingSound;
    public static final Codec<class08725> N = RecordCodecBuilder.create(instance -> instance.group((App)class07085.field_45739.fieldOf("slot").forGetter(class08725::y), (App)class04891.y.optionalFieldOf("equip_sound", (Object)class04909.Nj).forGetter(class08725::L), (App)class05946.N(class08699.N).optionalFieldOf("asset_id").forGetter(class08725::u), (App)class01894.N.optionalFieldOf("camera_overlay").forGetter(class08725::i), (App)class03541.N((class05946)class04227.I).optionalFieldOf("allowed_entities").forGetter(class08725::R), (App)Codec.BOOL.optionalFieldOf("dispensable", (Object)true).forGetter(class08725::M), (App)Codec.BOOL.optionalFieldOf("swappable", (Object)true).forGetter(class08725::B), (App)Codec.BOOL.optionalFieldOf("damage_on_hurt", (Object)true).forGetter(class08725::Z), (App)Codec.BOOL.optionalFieldOf("equip_on_interact", (Object)false).forGetter(class08725::z), (App)Codec.BOOL.optionalFieldOf("can_be_sheared", (Object)false).forGetter(class08725::U), (App)class04891.y.optionalFieldOf("shearing_sound", (Object)class04206.y.i((Object)class04909.wd)).forGetter(class08725::E)).apply(instance, class08725::new));
    public static final class02362<class04247, class08725> y = class02362.N((class02362)class07085.field_54088, class08725::y, (class02362)class04891.u, class08725::L, (class02362)class05946.y(class08699.N).N_33(class02389::N), class08725::u, (class02362)class01894.y.N_33(class02389::N), class08725::i, (class02362)class02389.L((class05946)class04227.I).N_33(class02389::N), class08725::R, (class02362)class02389.y, class08725::M, (class02362)class02389.y, class08725::B, (class02362)class02389.y, class08725::Z, (class02362)class02389.y, class08725::z, (class02362)class02389.y, class08725::U, (class02362)class04891.u, class08725::E, class08725::new);

    public class03556<class04891> L() {
        return this.equipSound;
    }

    public boolean M() {
        return this.dispensable;
    }

    public class08725(class07085 class070852, class03556<class04891> class035562, Optional<class05946<class11647>> optional, Optional<class01894> optional2, Optional<class03543<class07078<?>>> optional3, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, class03556<class04891> class035563) {
        this.slot = class070852;
        this.equipSound = class035562;
        this.assetId = optional;
        this.cameraOverlay = optional2;
        this.allowedEntities = optional3;
        this.dispensable = bl;
        this.swappable = bl2;
        this.damageOnHurt = bl3;
        this.equipOnInteract = bl4;
        this.canBeSheared = bl5;
        this.shearingSound = class035563;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08725.class, "slot;equipSound;assetId;cameraOverlay;allowedEntities;dispensable;swappable;damageOnHurt;equipOnInteract;canBeSheared;shearingSound", "slot", "equipSound", "assetId", "cameraOverlay", "allowedEntities", "dispensable", "swappable", "damageOnHurt", "equipOnInteract", "canBeSheared", "shearingSound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08725.class, "slot;equipSound;assetId;cameraOverlay;allowedEntities;dispensable;swappable;damageOnHurt;equipOnInteract;canBeSheared;shearingSound", "slot", "equipSound", "assetId", "cameraOverlay", "allowedEntities", "dispensable", "swappable", "damageOnHurt", "equipOnInteract", "canBeSheared", "shearingSound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08725.class, "slot;equipSound;assetId;cameraOverlay;allowedEntities;dispensable;swappable;damageOnHurt;equipOnInteract;canBeSheared;shearingSound", "slot", "equipSound", "assetId", "cameraOverlay", "allowedEntities", "dispensable", "swappable", "damageOnHurt", "equipOnInteract", "canBeSheared", "shearingSound"}, this);
    }

    public boolean B() {
        return this.swappable;
    }

    public boolean Z() {
        return this.damageOnHurt;
    }

    public Optional<class01894> i() {
        return this.cameraOverlay;
    }

    public boolean U() {
        return this.canBeSheared;
    }

    public boolean z() {
        return this.equipOnInteract;
    }

    public Optional<class05946<class11647>> u() {
        return this.assetId;
    }

    public static class08725 y(class06563 class065632) {
        class02055 class020552 = class04206.N((class00751)class04206.M);
        return class08725.N(class07085.field_48824).N((class03556<class04891>)class04909.PB).N(class08699.P.get(class065632)).N((class03543<class07078<?>>)class020552.y(class01217.e)).u(true).i(true).y((class03556<class04891>)class04206.y.i((Object)class04909.PZ)).N();
    }

    public class07085 y() {
        return this.slot;
    }

    public class03556<class04891> E() {
        return this.shearingSound;
    }

    public static class08725 N() {
        class02055 class020552 = class04206.N((class00751)class04206.M);
        return class08725.N(class07085.field_55946).N((class03556<class04891>)class04909.Pa).N(class08699.E).N((class03543<class07078<?>>)class020552.y(class01217.V)).u(true).i(true).y((class03556<class04891>)class04909.ot).N();
    }

    public static class08725 N(class06563 class065632) {
        return class08725.N(class07085.field_48824).N((class03556<class04891>)class04909.TT).N(class08699.W.get(class065632)).N(class07078.NQ, class07078.yJ).i(true).y((class03556<class04891>)class04909.Tb).N();
    }

    private boolean N(class08036 class080362) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20) && class080362.method_68878();
    }

    private void N(class06584 class065842, class08036 class080362, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3) && !class080362.method_6118(this.slot).R()) {
            callbackInfoReturnable.setReturnValue((Object)class07082.u);
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.u);
        }
    }

    public boolean N(class07078<?> class070782) {
        return this.allowedEntities.isEmpty() || this.allowedEntities.get().N((class03556)class070782.T());
    }

    public class07082 N(class08036 class080362, class07438 class074382, class06584 class065842) {
        if (!class074382.method_63623(class065842, this.slot) || class074382.method_6084(this.slot) || !class074382.method_5805()) {
            return class07082.i;
        }
        if (!class080362.method_73183().method_8608()) {
            class074382.method_5673(this.slot, class065842.N(1));
            if (class074382 instanceof class07079) {
                ((class07079)class074382).N(this.slot);
            }
        }
        return class07082.N;
    }

    public class07082 N(class06584 class065842, class08036 class080362) {
        class08036 class080363;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065842, class080362, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        if (!class080362.method_56991(this.slot) || !this.N(class080362.method_5864())) {
            return class07082.i;
        }
        class06584 class065843 = class080362.method_6118(this.slot);
        if (class07323.N((class06584)class065843, (class02477)class02523.I) && !this.N(class080363 = class080362) || class06584.L((class06584)class065842, (class06584)class065843)) {
            return class07082.u;
        }
        if (!class080362.method_73183().method_8608()) {
            class080362.method_7259(class01235.L.y((Object)class065842.B()));
        }
        if (class065842.c() <= 1) {
            class06584 class065844 = class065843.R() ? class065842 : class065843.M();
            class080363 = class080362;
            class06584 class065845 = this.N(class080363) ? class065842.t() : class065842.M();
            class080362.method_5673(this.slot, class065845);
            return class07082.N.N(class065844);
        }
        class06584 class065846 = class065843.M();
        class06584 class065847 = class065842.y(1, (class07438)class080362);
        class080362.method_5673(this.slot, class065847);
        if (!class080362.method_31548().M(class065846)) {
            class080362.method_7328(class065846, false);
        }
        return class07082.N.N(class065842);
    }

    public static class08703 N(class07085 class070852) {
        return new class08703(class070852);
    }

    public Optional<class03543<class07078<?>>> R() {
        return this.allowedEntities;
    }
}


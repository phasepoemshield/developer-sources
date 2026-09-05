/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10864
 *  Nursultan.class10867
 *  Nursultan.class11796
 *  Nursultan.class11821
 *  Nursultan.class11822
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.math.IntMath
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalFloatRef
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.util.Either
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00402
 *  minecraft.class00500
 *  minecraft.class00502
 *  minecraft.class00586
 *  minecraft.class00608
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00681
 *  minecraft.class00695
 *  minecraft.class00696
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class01114
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01217
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class01235
 *  minecraft.class01312
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class03729
 *  minecraft.class03982
 *  minecraft.class04252
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04858
 *  minecraft.class04891
 *  minecraft.class04907
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05442
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06237
 *  minecraft.class06244
 *  minecraft.class06289
 *  minecraft.class06521
 *  minecraft.class06556
 *  minecraft.class06570
 *  minecraft.class06577
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06600
 *  minecraft.class06639
 *  minecraft.class06646
 *  minecraft.class06652
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06940
 *  minecraft.class07001
 *  minecraft.class07043
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07055
 *  minecraft.class07062
 *  minecraft.class07063
 *  minecraft.class07065
 *  minecraft.class07070
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07086
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07253
 *  minecraft.class07267
 *  minecraft.class07282
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07316
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07443
 *  minecraft.class07451
 *  minecraft.class07480
 *  minecraft.class07482
 *  minecraft.class07492
 *  minecraft.class07512
 *  minecraft.class07536
 *  minecraft.class07648
 *  minecraft.class07717
 *  minecraft.class07862
 *  minecraft.class08152
 *  minecraft.class08156
 *  minecraft.class08162
 *  minecraft.class08294
 *  minecraft.class08299
 *  minecraft.class08310
 *  minecraft.class08329
 *  minecraft.class08332
 *  minecraft.class08372
 *  minecraft.class08433
 *  minecraft.class08576
 *  minecraft.class08594
 *  minecraft.class08599
 *  minecraft.class08610
 *  minecraft.class08636
 *  minecraft.class08725
 *  minecraft.class08774
 *  minecraft.class08978
 *  minecraft.class09037
 *  net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents
 *  net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$AllowResettingTime
 *  net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$AllowSleeping
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10864;
import Nursultan.class10867;
import Nursultan.class11796;
import Nursultan.class11821;
import Nursultan.class11822;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00402;
import minecraft.class00500;
import minecraft.class00502;
import minecraft.class00586;
import minecraft.class00608;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00681;
import minecraft.class00695;
import minecraft.class00696;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class01114;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01217;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class01235;
import minecraft.class01312;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class03729;
import minecraft.class03982;
import minecraft.class04252;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04858;
import minecraft.class04891;
import minecraft.class04907;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05442;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06237;
import minecraft.class06244;
import minecraft.class06289;
import minecraft.class06521;
import minecraft.class06556;
import minecraft.class06570;
import minecraft.class06577;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06600;
import minecraft.class06639;
import minecraft.class06646;
import minecraft.class06652;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06940;
import minecraft.class07001;
import minecraft.class07043;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07055;
import minecraft.class07062;
import minecraft.class07063;
import minecraft.class07065;
import minecraft.class07070;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07253;
import minecraft.class07267;
import minecraft.class07282;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07316;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07443;
import minecraft.class07451;
import minecraft.class07480;
import minecraft.class07482;
import minecraft.class07492;
import minecraft.class07512;
import minecraft.class07536;
import minecraft.class07648;
import minecraft.class07717;
import minecraft.class07862;
import minecraft.class08005;
import minecraft.class08033;
import minecraft.class08035;
import minecraft.class08043;
import minecraft.class08044;
import minecraft.class08152;
import minecraft.class08156;
import minecraft.class08162;
import minecraft.class08294;
import minecraft.class08299;
import minecraft.class08310;
import minecraft.class08329;
import minecraft.class08332;
import minecraft.class08372;
import minecraft.class08433;
import minecraft.class08576;
import minecraft.class08594;
import minecraft.class08599;
import minecraft.class08610;
import minecraft.class08636;
import minecraft.class08725;
import minecraft.class08774;
import minecraft.class08978;
import minecraft.class09037;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class08036
extends class06600
implements class08978 {
    public static Float staticFields_27fa3311b0e9d3e9b883d09222919bf5a_0;
    public static Float staticFields_27fa3311b0e9d3e9b883d09222919bf5a_1;
    public static Integer staticFields_27fa3311b0e9d3e9b883d09222919bf5a_2;
    public static class02131 staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3;
    public static class02131 staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4;
    public static class02131 staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5;
    public static class02131 staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6;
    public Integer fields_47fa3311b0e9d3e9b883d09222919bf5a_0;
    public Float fields_47fa3311b0e9d3e9b883d09222919bf5a_1;
    public Integer fields_47fa3311b0e9d3e9b883d09222919bf5a_2;
    public GameProfile fields_47fa3311b0e9d3e9b883d09222919bf5a_3;
    public Boolean fields_47fa3311b0e9d3e9b883d09222919bf5a_4;
    public class06584 fields_47fa3311b0e9d3e9b883d09222919bf5a_5;
    public boolean fields_47fa3311b0e9d3e9b883d09222919bf5a_init;
    public static Integer staticFields_47fa3311b0e9d3e9b883d09222919bf5a_0;
    public static Integer staticFields_47fa3311b0e9d3e9b883d09222919bf5a_1;
    public static Boolean staticFields_47fa3311b0e9d3e9b883d09222919bf5a_2;
    public static Integer staticFields_47fa3311b0e9d3e9b883d09222919bf5a_3;
    public static Float staticFields_47fa3311b0e9d3e9b883d09222919bf5a_4;
    public static class04891 staticFields_47fa3311b0e9d3e9b883d09222919bf5a_5;
    public static Short staticFields_37fa3311b0e9d3e9b883d09222919bf5a_0;
    public static Float staticFields_37fa3311b0e9d3e9b883d09222919bf5a_1;
    public static Integer staticFields_37fa3311b0e9d3e9b883d09222919bf5a_2;
    public static Integer staticFields_37fa3311b0e9d3e9b883d09222919bf5a_3;
    public static Integer staticFields_37fa3311b0e9d3e9b883d09222919bf5a_4;
    public static Integer staticFields_07fa3311b0e9d3e9b883d09222919bf5a_0;
    public static Integer staticFields_07fa3311b0e9d3e9b883d09222919bf5a_1;
    public static Integer staticFields_07fa3311b0e9d3e9b883d09222919bf5a_2;
    public Integer fields_37fa3311b0e9d3e9b883d09222919bf5a_0;
    public Integer fields_37fa3311b0e9d3e9b883d09222919bf5a_1;
    public Float fields_37fa3311b0e9d3e9b883d09222919bf5a_2;
    public boolean fields_37fa3311b0e9d3e9b883d09222919bf5a_init;
    public Integer fields_67fa3311b0e9d3e9b883d09222919bf5a_0;
    public Integer fields_67fa3311b0e9d3e9b883d09222919bf5a_1;
    public Boolean fields_67fa3311b0e9d3e9b883d09222919bf5a_2;
    public boolean fields_67fa3311b0e9d3e9b883d09222919bf5a_init;
    public Boolean fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
    public class08033 fields_27fa3311b0e9d3e9b883d09222919bf5a_1;
    public boolean fields_27fa3311b0e9d3e9b883d09222919bf5a_init;
    public class06556 fields_57fa3311b0e9d3e9b883d09222919bf5a_0;
    public Optional fields_57fa3311b0e9d3e9b883d09222919bf5a_1;
    public class00696 fields_57fa3311b0e9d3e9b883d09222919bf5a_2;
    public Float fields_57fa3311b0e9d3e9b883d09222919bf5a_3;
    public class06889 fields_57fa3311b0e9d3e9b883d09222919bf5a_4;
    public class07049 fields_57fa3311b0e9d3e9b883d09222919bf5a_5;
    public Boolean fields_57fa3311b0e9d3e9b883d09222919bf5a_6;
    public boolean fields_57fa3311b0e9d3e9b883d09222919bf5a_init;
    public static Integer staticFields_17fa3311b0e9d3e9b883d09222919bf5a_0;
    public static Integer staticFields_17fa3311b0e9d3e9b883d09222919bf5a_1;
    public static Integer staticFields_17fa3311b0e9d3e9b883d09222919bf5a_2;
    public class08044 fields_07fa3311b0e9d3e9b883d09222919bf5a_0;
    public class06940 fields_07fa3311b0e9d3e9b883d09222919bf5a_1;
    public class07492 fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
    public Object fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
    public class07512 fields_17fa3311b0e9d3e9b883d09222919bf5a_0;
    public Integer fields_17fa3311b0e9d3e9b883d09222919bf5a_1;
    public Integer fields_17fa3311b0e9d3e9b883d09222919bf5a_2;
    public Integer fields_17fa3311b0e9d3e9b883d09222919bf5a_3;
    public boolean fields_17fa3311b0e9d3e9b883d09222919bf5a_init;

    public class00392 method_5476() {
        class05216 class052162 = class00502.N((class06639)this.method_5781(), (class00392)this.method_5477());
        return this.method_7299(class052162);
    }

    public boolean method_5675() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y;
    }

    public boolean method_65038() {
        return true;
    }

    public boolean method_6034() {
        return !this.method_73183().method_8608() || this.method_7340();
    }

    public boolean method_5733() {
        return true;
    }

    public @Nullable class04803 method_32318(int n) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (n == 499) {
            return new class10867(this);
        }
        int n2 = n - 500;
        if (n2 >= 0 && n2 < 4) {
            return new class10864(this, n2);
        }
        if (n >= 0 && n < this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.u().size()) {
            return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_32318(n);
        }
        int n3 = n - 200;
        if (n3 >= 0 && n3 < this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1.method_5439()) {
            return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1.method_32318(n3);
        }
        return super.method_32318(n);
    }

    public boolean method_66248() {
        return this.method_7340();
    }

    public class06584 method_59958() {
        if (this.method_6123() && ((class07438)this).fields_10212a028292fd3c078969e3ee4c71d9e8_3 != null) {
            return ((class07438)this).fields_10212a028292fd3c078969e3ee4c71d9e8_3;
        }
        return super.method_59958();
    }

    public boolean method_31746() {
        return false;
    }

    public class06889 method_30951(float f) {
        double d = 0.22 * (this.method_6068() == class07070.field_6183 ? -1.0 : 1.0);
        float f2 = class04995.B((float)(f * 0.5f), (float)this.method_36455(), (float)this.field_6004) * ((float)Math.PI / 180);
        float f3 = class04995.B((float)f, (float)((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue(), (float)((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue()) * ((float)Math.PI / 180);
        if (this.method_6128() || this.method_6123()) {
            float f4;
            class06889 class068892 = this.method_5828(f);
            class06889 class068893 = this.method_18798();
            double d2 = class068893.z();
            double d3 = class068892.z();
            if (d2 > 0.0 && d3 > 0.0) {
                double d4 = (class068893.M * class068892.M + class068893.Z * class068892.Z) / Math.sqrt(d2 * d3);
                f4 = (float)(Math.signum(class068893.M * class068892.Z - class068893.Z * class068892.M) * Math.acos(d4));
            } else {
                f4 = 0.0f;
            }
            return this.method_30950(f).i(new class06889(d, -0.11, 0.85).L(-f4).N(-f2).y(-f3));
        }
        if (this.method_20232()) {
            return this.method_30950(f).i(new class06889(d, 0.2, -0.15).N(-f2).y(-f3));
        }
        double d5 = this.method_5829().L() - 1.0;
        double d6 = this.method_18276() ? -0.2 : 0.07;
        return this.method_30950(f).i(new class06889(d, d5, d6).y(-f3));
    }

    public boolean method_48155() {
        return true;
    }

    public boolean method_31747() {
        return true;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3, (Object)Float.valueOf(0.0f));
        class042932.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4, (Object)0);
        class042932.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5, (Object)OptionalInt.empty());
        class042932.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6, (Object)OptionalInt.empty());
    }

    public boolean method_7325() {
        return this.method_68876() == class07282.field_9219;
    }

    public void method_5773() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.field_5960 = this.method_7325();
        if (this.method_7325() || this.method_5765()) {
            this.method_24830(false);
        }
        if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 > 0) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 = this.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 - 1;
        }
        if (this.method_6113()) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 + 1;
            if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 > 100) {
                this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 100;
            }
            if (!this.method_73183().method_8608() && !((class00586)this.method_73183().method_75728().N(class00608.Q, this.method_73189())).N(this.method_73183())) {
                this.method_7358(false, true);
            }
        } else if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 > 0) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 + 1;
            if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 >= 110) {
                this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
            }
        }
        this.method_7295();
        super.method_5773();
        int n = 29999999;
        double d = class04995.N((double)this.method_23317(), (double)-2.9999999E7, (double)2.9999999E7);
        double d2 = class04995.N((double)this.method_23321(), (double)-2.9999999E7, (double)2.9999999E7);
        if (d != this.method_23317() || d2 != this.method_23321()) {
            this.method_5814(d, this.method_23318(), d2);
        }
        ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_1 = ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_1 + 1;
        ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_2 = ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_2 + 1;
        class06584 class065842 = this.method_6047();
        if (!class06584.N((class06584)this.fields_47fa3311b0e9d3e9b883d09222919bf5a_5, (class06584)class065842)) {
            if (!class06584.y((class06584)this.fields_47fa3311b0e9d3e9b883d09222919bf5a_5, (class06584)class065842)) {
                this.method_7350();
            }
            this.fields_47fa3311b0e9d3e9b883d09222919bf5a_5 = class065842.t();
        }
        if (!this.method_5777(class01231.N) && this.method_64179(class06570.sa)) {
            this.method_7330();
        }
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_0.N();
        this.method_7318();
        if (this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 > 0) {
            this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 - 1;
        }
    }

    public void method_5650(class07062 class070622) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        super.method_5650(class070622);
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y(this);
        if (this.method_45015()) {
            this.method_14247();
        }
    }

    public void method_5790() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y) {
            this.method_5796(false);
        } else {
            super.method_5790();
        }
    }

    public class06889 method_18796(class06889 class068892, class07451 class074512) {
        double d;
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        class08036 class080362 = this;
        float f = this.redirect$dmo000$viafabricplus$modifyStepHeight(class080362);
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y || class068892.B > 0.0 || class074512 != class07451.field_6308 && class074512 != class07451.field_6305 || !this.method_21825() || !this.method_30263(f)) {
            return class068892;
        }
        double d2 = class068892.Z;
        double d3 = 0.05;
        double d4 = Math.signum(d) * 0.05;
        double d5 = Math.signum(d2) * 0.05;
        for (d = class068892.M; d != 0.0 && this.method_59818(d, 0.0, f); d -= d4) {
            if (!(Math.abs(d) <= 0.05)) continue;
            d = 0.0;
            break;
        }
        while (d2 != 0.0 && this.method_59818(0.0, d2, f)) {
            if (Math.abs(d2) <= 0.05) {
                d2 = 0.0;
                break;
            }
            d2 -= d5;
        }
        while (d != 0.0 && d2 != 0.0 && this.method_59818(d, d2, f)) {
            d = Math.abs(d) <= 0.05 ? 0.0 : (d -= d4);
            if (Math.abs(d2) <= 0.05) {
                d2 = 0.0;
                continue;
            }
            d2 -= d5;
        }
        return new class06889(d, class068892.B, d2);
    }

    public class04911 method_5634() {
        return class04911.field_15248;
    }

    public void method_20803(int n) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        super.method_20803(this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N ? Math.min(n, 1) : n);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.method_5679(class047822, class070722)) {
            return false;
        }
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N && !class070722.N(class03696.u)) {
            return false;
        }
        ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
        if (this.method_29504()) {
            return false;
        }
        this.method_7262();
        if (class070722.M()) {
            if (class047822.y() == class07086.field_5801) {
                f = 0.0f;
            }
            if (class047822.y() == class07086.field_5805) {
                f = Math.min(f / 2.0f + 1.0f, f);
            }
            if (class047822.y() == class07086.field_5807) {
                f = f * 3.0f / 2.0f;
            }
        }
        if (f == 0.0f) {
            return false;
        }
        return super.method_64397(class047822, class070722, f);
    }

    public int method_5806() {
        return 10;
    }

    public boolean method_5681() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && !this.method_7325() && super.method_5681();
    }

    public float method_23326() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y || this.method_6128() ? 1.0f : super.method_23326();
    }

    public int method_5676() {
        return 20;
    }

    public boolean method_66249() {
        return !this.method_73183().method_8608() || this.method_7340();
    }

    public class07065 method_33570() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && (!this.method_24828() || !this.method_21751()) ? class07065.field_28633 : class07065.field_28630;
    }

    public class04891 method_5737() {
        return class04909.lM;
    }

    public class04891 method_5625() {
        return class04909.li;
    }

    public class04891 method_5672() {
        return class04909.lR;
    }

    public boolean method_5747(double d, float f, class07072 class070722) {
        double d2;
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.L) {
            return false;
        }
        if (d >= 2.0) {
            this.method_7339(class01235.v, (int)Math.round(d * 100.0));
        }
        if (this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 != null && this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 != false) {
            d2 = Math.min(d, this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4.B - this.method_23318());
            if (d2 <= 0.0) {
                this.method_58396();
            } else {
                this.method_60983();
            }
        } else {
            d2 = d;
        }
        if (d2 > 0.0 && super.method_5747(d2, f, class070722)) {
            this.method_58396();
            return true;
        }
        this.method_67345(d, f, class070722);
        return false;
    }

    public void method_5712(class07209 class072092, class00500 class005002) {
        if (this.method_5799()) {
            this.method_51295();
            this.method_51296(class005002);
        } else {
            class07209 class072093 = this.method_49788(class072092);
            if (!class072092.equals((Object)class072093)) {
                class00500 class005003 = this.method_73183().method_8320(class072093);
                if (class005003.N(class01210.yY)) {
                    this.method_49787(class005003, class005002);
                } else {
                    super.method_5712(class072093, class005003);
                }
            } else {
                super.method_5712(class072092, class005002);
            }
        }
    }

    public void method_5783(class04891 class048912, float f, float f2) {
        this.method_73183().method_43128((class07049)this, this.method_23317(), this.method_23318(), this.method_23321(), class048912, this.method_5634(), f, f2);
    }

    public void method_5746() {
        if (!this.method_7325()) {
            super.method_5746();
        }
    }

    public void method_5652(class08329 class083292) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        super.method_5652(class083292);
        class07717.N((class08329)class083292);
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.N((class08294<class08332>)class083292.N("Inventory", class08332.N));
        class083292.N("SelectedItemSlot", this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.N());
        class083292.N("SleepTimer", (short)this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3.intValue());
        class083292.N("XpP", this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue());
        class083292.N("XpLevel", this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0.intValue());
        class083292.N("XpTotal", this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1.intValue());
        class083292.N("XpSeed", this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0.intValue());
        class083292.N("Score", this.method_7272());
        this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(class083292);
        class083292.N("abilities", class08043.B, (Object)this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.L());
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1.y(class083292.N("EnderItems", class08332.N));
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_1.ifPresent(class062892 -> class083292.N("LastDeathLocation", class06289.y, class062892));
        class083292.y("current_explosion_impact_pos", class06889.N, (Object)this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4);
        class083292.N("ignore_fall_damage_from_current_explosion", this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6.booleanValue());
        class083292.N("current_impulse_context_reset_grace_time", this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0.intValue());
    }

    public boolean method_49108() {
        return !this.method_7325() && super.method_49108();
    }

    public boolean method_21823() {
        return this.method_5715();
    }

    public boolean method_56992() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.u;
    }

    public boolean method_68878() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dij000$viafabricplus$fixCreativeCheck(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.method_68876() == class07282.field_9220;
    }

    public void method_5749(class08299 class082992) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        super.method_5749(class082992);
        this.method_5826(this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3.id());
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.N((class08310<class08332>)class082992.L("Inventory", class08332.N));
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.N(class082992.N("SelectedItemSlot", 0));
        this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = class082992.N("SleepTimer", (short)0);
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(class082992.N("XpP", 0.0f));
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = class082992.N("XpLevel", 0);
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = class082992.N("XpTotal", 0);
        this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = class082992.N("XpSeed", 0);
        if (this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 == 0) {
            this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = this.field_5974.M();
        }
        this.method_7320(class082992.N("Score", 0));
        this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(class082992);
        class082992.N("abilities", class08043.B).ifPresent(this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1::N);
        this.method_5996(class05298.l).N((double)this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y());
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1.y(class082992.L("EnderItems", class08332.N));
        this.method_43120(class082992.N("LastDeathLocation", class06289.y));
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 = class082992.N("current_explosion_impact_pos", class06889.N).orElse(null);
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = class082992.N("ignore_fall_damage_from_current_explosion", false);
        this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = class082992.N("current_impulse_context_reset_grace_time", 0);
    }

    public void method_29239() {
        super.method_29239();
        this.field_5951 = 0;
    }

    public void method_5842() {
        if (!this.method_73183().method_8608() && this.method_21824() && this.method_5765()) {
            this.method_5848();
            this.method_5660(false);
            return;
        }
        super.method_5842();
    }

    public void method_5711(byte by) {
        if (by == 9) {
            this.method_6040();
        } else if (by == 23) {
            this.method_7268(false);
        } else if (by == 22) {
            this.method_7268(true);
        } else {
            super.method_5711(by);
        }
    }

    public void method_5879(float f) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        super.method_5879(f);
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_3 = Float.valueOf(f);
    }

    public void method_5700(boolean bl, class07209 class072092) {
        if (!this.method_31549().y) {
            super.method_5700(bl, class072092);
        }
    }

    public boolean method_5874(class04782 class047822, class07438 class074382, class07072 class070722) {
        this.method_7259(class01235.M.y((Object)class074382.method_5864()));
        return true;
    }

    public String method_5820() {
        return this.method_7334().name();
    }

    public void method_5764(boolean bl) {
        if (!this.method_31549().y) {
            super.method_5764(bl);
        }
    }

    public String method_74861() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3.name();
    }

    public void method_5844(class00500 class005002, class06889 class068892) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (!this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y) {
            super.method_5844(class005002, class068892);
        }
        this.method_60983();
    }

    public class00392 method_5477() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return class00392.y((String)this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3.name());
    }

    public class08036(class07299 class072992, GameProfile gameProfile) {
        super(class07078.Ly, class072992);
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1 = new class06940();
        this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0 = new class07512();
        this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
        this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1 = new class08033();
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(0.0f);
        this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
        this.fields_47fa3311b0e9d3e9b883d09222919bf5a_1 = Float.valueOf(0.02f);
        this.fields_47fa3311b0e9d3e9b883d09222919bf5a_5 = class06584.E;
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_0 = this.method_7265();
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_1 = Optional.empty();
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = false;
        this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
        this.method_5826(gameProfile.id());
        this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3 = gameProfile;
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0 = new class08044(this, ((class07438)this).fields_13212a028292fd3c078969e3ee4c71d9e8_1);
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2 = new class07492(this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0, !class072992.method_8608(), this);
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
    }

    static {
        class08036.staticFields7fa3311b0e9d3e9b883d09222919bf5a();
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3 = class03289.N(class08036.class, (class04383)class02154.u);
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4 = class03289.N(class08036.class, (class04383)class02154.y);
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5 = class03289.N(class08036.class, (class04383)class02154.n);
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6 = class03289.N(class08036.class, (class04383)class02154.n);
        staticFields_47fa3311b0e9d3e9b883d09222919bf5a_5 = class04891.N((class01894)class01894.N((String)"viafabricplus-visuals", (String)"oof.hurt"));
    }

    private boolean wrapWithCondition$dck000$viafabricplus$preventSwimmingMotionWhenJumping(class08036 class080362, class06889 class068892) {
        return !ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) || !class080362.method_70673();
    }

    private void redirect$dck000$viafabricplus$removeFlySlipperiness$mixinextras$bridge$259(class08036 class080362, class06889 class068892, LocalRef localRef) {
        this.redirect$dck000$viafabricplus$removeFlySlipperiness(class080362, class068892, (class06889)localRef.get());
    }

    private void handler$dmo000$viafabricplus$changeOffsetsForSneakingCollisionDetection(double d, double d2, double d3, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            double d4 = ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3) ? 0.0 : (double)1.0E-5f;
            class00734 class007342 = this.method_5829();
            callbackInfoReturnable.setReturnValue((Object)this.method_73183().method_8587((class07049)this, new class00734(class007342.N + d, class007342.y - d3 - d4, class007342.L + d2, class007342.u + d, class007342.y, class007342.R + d2)));
        }
    }

    private void handler$dij000$viafabricplus$preventEatingFoodInCreative(boolean bl, CallbackInfoReturnable callbackInfoReturnable) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4) && this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private boolean redirect$ddl000$viafabricplus$changeSpeedCalculation(class08036 class080362, class03556 class035562, LocalFloatRef localFloatRef) {
        boolean bl = class080362.method_6059(class035562);
        if (bl && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            localFloatRef.set(localFloatRef.get() * (1.0f - (float)(this.method_6112(class07047.u).i() + 1) * 0.2f));
            if (localFloatRef.get() < 0.0f) {
                localFloatRef.set(0.0f);
            }
            return false;
        }
        return bl;
    }

    private class07209 redirect$dck000$viafabricplus$modifyWaterAbovePosition(double d, double d2, double d3) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return class07209.method_49637((double)d, (double)(d2 - 0.9), (double)d3);
        }
        return class07209.method_49637((double)d, (double)d2, (double)d3);
    }

    private void redirect$dck000$viafabricplus$removeFlySlipperiness(class08036 class080362, class06889 class068892, class06889 class068893) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) && class068893.z() == 0.0) {
            class080362.method_18799(new class06889(0.0, class068892.B, 0.0));
        } else {
            class080362.method_18799(class068892);
        }
    }

    private void handler$dng000$viafabricplus$allowClimbingWhileFlying(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
            callbackInfoReturnable.setReturnValue((Object)super.method_6101());
        }
    }

    private void handler$ddl000$viafabricplus$changeSpeedCalculation(class00500 class005002, CallbackInfoReturnable callbackInfoReturnable, LocalFloatRef localFloatRef) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        float f = (float)this.method_45325(class05298.t);
        if (f <= 0.0f) {
            return;
        }
        float f2 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.y().N(class005002);
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_4tor1_4_5) && this.method_7305(class005002)) {
            localFloatRef.set(f2 + f);
        } else if ((f2 > 1.0f || ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) && !this.method_6047().R() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            if ((double)f2 <= 1.0 && !this.method_7305(class005002)) {
                localFloatRef.set(f2 + f * 0.08f);
            } else {
                localFloatRef.set(f2 + f);
            }
        }
    }

    private boolean redirect$dck000$viafabricplus$preventSwimmingResurface(class08036 class080362) {
        if (!ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) || !class080362.method_5681()) {
            return class080362.method_5681();
        }
        double d = this.method_5720().B;
        if (this.method_73183().method_8316(class07209.method_49637((double)this.method_23317(), (double)(this.method_23318() + 0.4), (double)this.method_23321())).W() && d > 0.0 && d < 0.55) {
            class080362.method_18800(class080362.method_18798().N(), 0.0, class080362.method_18798().L());
            return false;
        }
        return true;
    }

    private void handler$dnc000$viafabricplus$replaceGlidingCondition(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            class06584 class065842;
            if (!this.method_24828() && this.method_18798().B < 0.0 && !this.method_6128() && (class065842 = this.method_6118(class07085.field_6174)).N(class06570.sT) && class08036.method_63624((class06584)class065842, (class07085)class07085.field_6174)) {
                callbackInfoReturnable.setReturnValue((Object)true);
                return;
            }
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private boolean redirect$doi000$viafabricplus$useLastSprintingState(class08036 class080362) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3)) {
            return this.fields_67fa3311b0e9d3e9b883d09222919bf5a_2;
        }
        return class080362.method_5624();
    }

    public void method_7353(class00392 class003922, boolean bl) {
    }

    public void method_7358(boolean bl, boolean bl2) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        super.method_18400();
        if (this.method_73183() instanceof class04782 && bl2) {
            ((class04782)this.method_73183()).method_8448();
        }
        this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = bl ? 0 : 100;
    }

    public String method_68877() {
        return MoreObjects.toStringHelper((Object)((Object)this)).add("name", (Object)this.method_74861()).add("id", this.method_5628()).add("pos", (Object)this.method_73189()).add("mode", (Object)this.method_68876()).add("permission", (Object)this.method_75004()).toString();
    }

    private void handler$dck000$viafabricplus$preventJumpingWhenStartedSwimming(class06889 class068892, CallbackInfo callbackInfo) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (!ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return;
        }
        this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 = this.method_5681() ? Integer.valueOf(this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 + 1) : Integer.valueOf(0);
        if (this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 > 0 && this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 < 10 && this.method_70673()) {
            this.method_18800(this.method_18798().N(), 0.0, this.method_18798().L());
        }
    }

    private boolean redirect$dni000$viafabricplus$dontModifyHeadRotationWhenBlocking(class08036 class080362) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_2) && class080362.method_6039();
    }

    private class00734 redirect$dng000$viafabricplus$removeContractionOfCollisionBox(class00734 class007342, double d) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            return class007342;
        }
        return class007342.B(d);
    }

    private void m_handler$zeg000$fabric_entity_events_v1$onIsSleepingLongEnough_173(CallbackInfoReturnable callbackInfoReturnable) {
        if (callbackInfoReturnable.getReturnValueZ()) {
            callbackInfoReturnable.setReturnValue((Object)((EntitySleepEvents.AllowResettingTime)EntitySleepEvents.ALLOW_RESETTING_TIME.invoker()).allowResettingTime(this));
        }
    }

    public boolean method_7326(class07209 class072092) {
        return !this.method_73183().method_8320(class072092).z((class07290)this.method_73183(), class072092);
    }

    public Either<class08035, class06244> method_7269(class07209 class072092) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.m_handler$zeg000$fabric_entity_events_v1$onTrySleep_175(class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (Either)callbackInfoReturnable.getReturnValue();
        }
        this.method_18403(class072092);
        this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
        return Either.right((Object)class06244.field_17274);
    }

    public void method_7266(class04907<?> class049072) {
    }

    public boolean method_7256(class08036 class080362) {
        class00502 class005022 = this.method_5781();
        class00502 class005023 = class080362.method_5781();
        if (class005022 == null) {
            return true;
        }
        if (!class005022.N((class06639)class005023)) {
            return true;
        }
        return class005022.Z();
    }

    public void method_43120(Optional<class06289> optional) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_1 = optional;
    }

    public void method_7259(class04907<?> class049072) {
        this.method_7342(class049072, 1);
    }

    public void method_76575(class08156 class081562, class06695 class066952) {
    }

    public void method_60984(boolean bl) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = bl;
        if (bl) {
            this.method_76731(40);
        } else {
            this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
        }
    }

    public void method_7291(class07862 class078622, class06695 class066952) {
    }

    public OptionalInt method_17355(@Nullable class06237 class062372) {
        return OptionalInt.empty();
    }

    public void method_7322(float f) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N) {
            return;
        }
        if (!this.method_73183().method_8608()) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(f);
        }
    }

    public int method_7254(Collection<class03729<?>> collection) {
        return 0;
    }

    public void method_7342(class04907<?> class049072, int n) {
    }

    public void method_7335(List<class05946<class06521<?>>> list) {
    }

    public int method_7333(Collection<class03729<?>> collection) {
        return 0;
    }

    public void method_51283(class03729<?> class037292, List<class06584> list) {
    }

    public void method_7255(int n) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.method_7285(n);
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue() + (float)n / (float)this.method_7349());
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = class04995.N((int)(this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 + n), (int)0, (int)Integer.MAX_VALUE);
        while (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue() < 0.0f) {
            float f = this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue() * (float)this.method_7349();
            if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 > 0) {
                this.method_7316(-1);
                this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(1.0f + f / (float)this.method_7349());
                continue;
            }
            this.method_7316(-1);
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(0.0f);
        }
        while (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue() >= 1.0f) {
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf((this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue() - 1.0f) * (float)this.method_7349());
            this.method_7316(1);
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue() / (float)this.method_7349());
        }
    }

    public void method_7323(class00402 class004022) {
    }

    public void method_7339(class01894 class018942, int n) {
        this.method_7342(class01235.Z.y((Object)class018942), n);
    }

    public void method_71753(class03556<class09037> class035562) {
    }

    public void method_17354(int n, class07316 class073162, int n2, int n3, boolean bl, boolean bl2) {
    }

    public void method_14247() {
    }

    public void method_7311(class07267 class072672, boolean bl) {
    }

    public void method_7355() {
    }

    public void method_7315(class06584 class065842, class07050 class070502) {
    }

    public int method_6110(class04782 class047822) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (((Boolean)class047822.method_64395().N(class07305.j)).booleanValue() || this.method_7325()) {
            return 0;
        }
        return Math.min(this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 * 7, 100);
    }

    public void method_16078(class04782 class047822) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        super.method_16078(class047822);
        if (!((Boolean)class047822.method_64395().N(class07305.j)).booleanValue()) {
            this.method_7293();
            this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.Z();
        }
    }

    public class06584 method_18808(class06584 class065842) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (!(class065842.B() instanceof class06577)) {
            return class06584.E;
        }
        Predicate var2 = ((class06577)class065842.B()).L();
        class06584 class065843 = class06577.N((class07438)this, (Predicate)var2);
        if (!class065843.R()) {
            return class065843;
        }
        var2 = ((class06577)class065842.B()).N();
        for (int i = 0; i < this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5439(); ++i) {
            class06584 class065844 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5438(i);
            if (!var2.test(class065844)) continue;
            return class065844;
        }
        return this.method_56992() ? new class06584((class07310)class06570.sD) : class06584.E;
    }

    public void method_36977(class07072 class070722, float f) {
        this.method_57292(class070722, f, new class07085[]{class07085.field_6169});
    }

    public float method_49484() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && !this.method_5765()) {
            class08036 class080362 = this;
            return this.redirect$doi000$viafabricplus$useLastSprintingState(class080362) ? this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N() * 2.0f : this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N();
        }
        class08036 class080363 = this;
        float f = this.redirect$doi000$viafabricplus$useLastSprintingState(class080363) ? 0.025999999f : 0.02f;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, f);
        this.handler$cff000$nursultan$injectGetOffGroundSpeed(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueF();
        }
        return f;
    }

    public boolean method_5679(class04782 class047822, class07072 class070722) {
        if (super.method_5679(class047822, class070722)) {
            return true;
        }
        if (class070722.N(class03696.m)) {
            return (Boolean)class047822.method_64395().N(class07305.B) == false;
        }
        if (class070722.N(class03696.W)) {
            return (Boolean)class047822.method_64395().N(class07305.E) == false;
        }
        if (class070722.N(class03696.Z)) {
            return (Boolean)class047822.method_64395().N(class07305.W) == false;
        }
        if (class070722.N(class03696.P)) {
            return (Boolean)class047822.method_64395().N(class07305.s) == false;
        }
        return false;
    }

    public class04891 method_6002() {
        return class04909.Gx;
    }

    public void method_6090(class04782 class047822, class07438 class074382) {
        super.method_6090(class047822, class074382);
        class06584 class065842 = this.method_62821();
        class08576 class085762 = class065842 != null ? (class08576)class065842.method_58694(class02484.H) : null;
        float f = class074382.method_67125();
        if (f > 0.0f && class085762 != null) {
            class085762.N(class047822, (class07438)this, f, class065842);
        }
    }

    public ImmutableList<class01312> method_24831() {
        return ImmutableList.of((Object)class01312.field_18076, (Object)class01312.field_18081, (Object)class01312.field_18079);
    }

    public float method_6067() {
        return ((Float)this.method_5841().N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3)).floatValue();
    }

    public boolean method_75123(class07085 class070852, class07049 class070492, float f, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4;
        class07438 class074382;
        if (this.method_75195(class070492)) {
            return false;
        }
        class06584 class065842 = this.method_6118(class070852);
        class07072 class070722 = this.method_75204(class065842);
        float f2 = this.method_59903(class070492, f, class070722) - f;
        if (!this.method_6115() || this.method_6058().N() != class070852) {
            f2 *= this.method_7261(0.5f);
            f *= this.method_76459();
        }
        if (bl2 && this.method_75196(class070492)) {
            return true;
        }
        float f3 = bl ? f + f2 : 0.0f;
        float f4 = 0.0f;
        if (class070492 instanceof class07438) {
            class074382 = (class07438)class070492;
            f4 = class074382.method_6032();
        }
        class074382 = class070492.method_18798();
        boolean bl5 = bl4 = bl && class070492.method_64420(class070722, f3);
        if (bl2) {
            this.method_75122(class070492, 0.4f + this.method_59924(class070492, class070722), (class06889)class074382);
        }
        boolean bl6 = false;
        if (bl3 && class070492.method_5765()) {
            bl6 = true;
            class070492.method_5848();
        }
        if (!(bl4 || bl2 || bl6)) {
            return false;
        }
        this.method_75200(class070492, false, false, bl, true, f2);
        this.method_6114(class070492);
        this.method_75199(class070492, class065842, class070722, bl4);
        this.method_75198(class070492, f4);
        this.method_7322(0.1f);
        return true;
    }

    public class08599 method_67518() {
        return new class08433(this);
    }

    public void method_6007() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 > 0) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 = this.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 - 1;
        }
        this.method_64400();
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.B();
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && !this.method_5765()) {
            this.method_38785();
        }
        super.method_6007();
        this.method_6119();
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.method_36454());
        float f = (float)this.method_45325(class05298.l);
        this.handler$doi000$viafabricplus$storeSprintingState(null);
        this.method_6125(f);
        if (this.method_6032() > 0.0f && !this.method_7325()) {
            class00734 class007342 = this.method_5765() && !this.method_5854().method_31481() ? this.method_5829().y(this.method_5854().method_5829()).L(1.0, 0.0, 1.0) : this.method_5829().L(1.0, 0.5, 1.0);
            List var2 = this.method_73183().N_70((class07049)this, class007342);
            ArrayList arrayList = Lists.newArrayList();
            for (class07049 class070492 : var2) {
                if (class070492.method_5864() == class07078.r) {
                    arrayList.add(class070492);
                    continue;
                }
                if (class070492.method_31481()) continue;
                this.method_7341(class070492);
            }
            if (!arrayList.isEmpty()) {
                this.method_7341((class07049)class07536.N_77((List)arrayList, (class06069)this.field_5974));
            }
        }
        this.method_74082();
    }

    public boolean method_44201(class07085 class070852) {
        return class070852.N() == class07043.field_6178;
    }

    public class07443 method_39760() {
        return new class07443(class04909.lu, class04909.Gf);
    }

    public void method_6074(class04782 class047822, class07072 class070722, float f) {
        if (this.method_5679(class047822, class070722)) {
            return;
        }
        f = this.method_6132(class070722, f);
        float f2 = f = this.method_6036(class070722, f);
        f = Math.max(f - this.method_6067(), 0.0f);
        this.method_6073(this.method_6067() - (f2 - f));
        float f3 = f2 - f;
        if (f3 > 0.0f && f3 < 3.4028235E37f) {
            this.method_7339(class01235.c, Math.round(f3 * 10.0f));
        }
        if (f == 0.0f) {
            return;
        }
        this.method_7322(class070722.N());
        this.method_6066().N(class070722, f);
        this.method_6033(this.method_6032() - f);
        if (f < 3.4028235E37f) {
            this.method_7339(class01235.e, Math.round(f * 10.0f));
        }
        this.method_32876((class03556)class01194.P);
    }

    public void method_6091(class06889 class068892) {
        class06889 class068893;
        double d;
        class08036 class080362;
        block7: {
            class06889 class068894;
            double d2;
            block8: {
                if (this.method_5765()) {
                    super.method_6091(class068892);
                    return;
                }
                class080362 = this;
                if (!this.redirect$dck000$viafabricplus$preventSwimmingResurface(class080362)) break block7;
                d = this.method_5720().B;
                double d3 = d2 = d < -0.2 ? 0.085 : 0.06;
                if (d <= 0.0 || ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_4.booleanValue()) break block8;
                double d4 = this.method_23321();
                double d5 = this.method_23318() + 1.0 - 0.1;
                double d6 = this.method_23317();
                if (this.method_73183().method_8316(this.redirect$dck000$viafabricplus$modifyWaterAbovePosition(d6, d5, d4)).W()) break block7;
            }
            if (this.wrapWithCondition$dck000$viafabricplus$preventSwimmingMotionWhenJumping(class080362 = this, class068893 = (class068894 = this.method_18798()).y(0.0, (d - class068894.B) * d2, 0.0))) {
                class080362.method_18799(class068893);
            }
        }
        this.handler$dck000$viafabricplus$preventJumpingWhenStartedSwimming(class068892, null);
        if (this.method_31549().y) {
            d = this.method_18798().B;
            super.method_6091(class068892);
            class068893 = this.method_18798().N(class07185.field_11052, d * 0.6);
            class080362 = this;
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init((Object)class068892);
            this.redirect$dck000$viafabricplus$removeFlySlipperiness$mixinextras$bridge$259(class080362, class068893, (LocalRef)localRefImpl);
            class068892 = (class06889)localRefImpl.dispose();
        } else {
            super.method_6091(class068892);
        }
    }

    public float method_7292() {
        return (float)this.method_45325(class05298.j);
    }

    public float method_53964() {
        class08036 class080362 = this;
        if (this.redirect$dni000$viafabricplus$dontModifyHeadRotationWhenBlocking(class080362)) {
            return 15.0f;
        }
        return super.method_53964();
    }

    public void method_75122(class07049 class070492, float f, class06889 class068892) {
        if (f > 0.0f) {
            if (class070492 instanceof class07438) {
                ((class07438)class070492).method_6005((double)f, (double)class04995.m((double)(this.method_36454() * ((float)Math.PI / 180))), (double)(-class04995.P((double)(this.method_36454() * ((float)Math.PI / 180)))));
            } else {
                class070492.method_5762((double)(-class04995.m((double)(this.method_36454() * ((float)Math.PI / 180))) * f), 0.1, (double)(class04995.P((double)(this.method_36454() * ((float)Math.PI / 180))) * f));
            }
            this.method_18799(this.method_18798().u(0.6, 1.0, 0.6));
            this.method_5728(false);
        }
        if (class070492 instanceof class04770 && class070492.field_6037) {
            ((class04770)class070492).field_13987.method_14364((class00381)new class06652(class070492));
            class070492.field_6037 = false;
            class070492.method_18799(class068892);
        }
    }

    public boolean method_6071() {
        return true;
    }

    public void method_75125() {
        if (this.method_76458()) {
            super.method_75125();
        }
    }

    public float method_6029() {
        return (float)this.method_45325(class05298.l);
    }

    public boolean method_6101() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dng000$viafabricplus$allowClimbingWhileFlying(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y) {
            return false;
        }
        return super.method_6101();
    }

    public void method_6078(class07072 class070722) {
        class07299 class072992;
        super.method_6078(class070722);
        this.method_23311();
        if (!this.method_7325() && (class072992 = this.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.method_16080(class047822, class070722);
        }
        if (class070722 != null) {
            this.method_18800(-class04995.P((double)((this.method_48157() + this.method_36454()) * ((float)Math.PI / 180))) * 0.1f, 0.1f, -class04995.m((double)((this.method_48157() + this.method_36454()) * ((float)Math.PI / 180))) * 0.1f);
        } else {
            this.method_18800(0.0, 0.1, 0.0);
        }
        this.method_7281(class01235.a);
        this.method_7266(class01235.Z.y((Object)class01235.W));
        this.method_7266(class01235.Z.y((Object)class01235.m));
        this.method_5646();
        this.method_33572(false);
        this.method_43120(Optional.of(class06289.N((class05946)this.method_73183().method_27983(), (class07209)this.method_24515())));
    }

    public class04891 method_6011(class07072 class070722) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.m_handler$ecm000$viafabricplus_visuals$replaceSound_174(class070722, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class04891)callbackInfoReturnable.getReturnValue();
        }
        return class070722.U().u().N();
    }

    public void method_18400() {
        this.method_7358(true, true);
    }

    public float method_6017() {
        return 1.0f;
    }

    public boolean method_63628() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && super.method_63628();
    }

    public boolean method_33190() {
        return !this.method_31549().N && super.method_33190();
    }

    public void method_75124() {
        this.method_75203();
        super.method_75124();
    }

    public void method_6105(class07072 class070722, float f) {
        this.method_57292(class070722, f, new class07085[]{class07085.field_6166, class07085.field_6172, class07085.field_6174, class07085.field_6169});
    }

    public boolean method_29920() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y;
    }

    public boolean method_6062() {
        return super.method_6062() || this.method_6113();
    }

    public float method_48157() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_57fa3311b0e9d3e9b883d09222919bf5a_3.floatValue();
    }

    public void method_52544(float f) {
        this.method_5841().N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3, (Object)Float.valueOf(f));
    }

    public class06556 method_7265() {
        return new class06556();
    }

    public void method_7316(int n) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = IntMath.saturatedAdd((int)this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0, (int)n);
        if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < 0) {
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(0.0f);
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
        }
        if (n > 0 && this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 % 5 == 0 && (float)this.fields_47fa3311b0e9d3e9b883d09222919bf5a_2.intValue() < (float)this.field_6012 - 100.0f) {
            float f = this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 > 30 ? 1.0f : (float)this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0.intValue() / 30.0f;
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.lL, this.method_5634(), f * 0.75f, 1.0f);
            this.fields_47fa3311b0e9d3e9b883d09222919bf5a_2 = this.field_6012;
        }
    }

    public void method_7286(class06584 class065842, int n) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 - n;
        if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < 0) {
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(0.0f);
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
        }
        this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = this.field_5974.M();
    }

    public int method_7349() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= 30) {
            return 112 + (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 - 30) * 9;
        }
        if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= 15) {
            return 37 + (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 - 15) * 5;
        }
        return 7 + this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 * 2;
    }

    public void method_7281(class01894 class018942) {
        this.method_7259(class01235.Z.y((Object)class018942));
    }

    public class08044 method_31548() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0;
    }

    public class08033 method_31549() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1;
    }

    public boolean method_21824() {
        return this.method_5715();
    }

    public void method_7262() {
    }

    public void method_74082() {
    }

    public void method_64400() {
    }

    public void method_7346() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
    }

    private static void staticFields7fa3311b0e9d3e9b883d09222919bf5a() {
        staticFields_07fa3311b0e9d3e9b883d09222919bf5a_0 = 20;
        staticFields_07fa3311b0e9d3e9b883d09222919bf5a_1 = 100;
        staticFields_07fa3311b0e9d3e9b883d09222919bf5a_2 = 10;
        staticFields_17fa3311b0e9d3e9b883d09222919bf5a_0 = 200;
        staticFields_17fa3311b0e9d3e9b883d09222919bf5a_1 = 499;
        staticFields_17fa3311b0e9d3e9b883d09222919bf5a_2 = 500;
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_0 = Float.valueOf(4.5f);
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_1 = Float.valueOf(3.0f);
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_2 = 40;
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3 = null;
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4 = null;
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5 = null;
        staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6 = null;
        staticFields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
        staticFields_37fa3311b0e9d3e9b883d09222919bf5a_1 = Float.valueOf(0.0f);
        staticFields_37fa3311b0e9d3e9b883d09222919bf5a_2 = 0;
        staticFields_37fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
        staticFields_37fa3311b0e9d3e9b883d09222919bf5a_4 = 0;
        staticFields_47fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
        staticFields_47fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
        staticFields_47fa3311b0e9d3e9b883d09222919bf5a_2 = false;
        staticFields_47fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
        staticFields_47fa3311b0e9d3e9b883d09222919bf5a_4 = Float.valueOf(2.0f);
        staticFields_47fa3311b0e9d3e9b883d09222919bf5a_5 = null;
    }

    private float redirect$djf000$viafabricplus$removeAttackCooldown(float f, float f2, float f3) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return 1.0f;
        }
        return class04995.N((float)f, (float)f2, (float)f3);
    }

    private void m_handler$ecm000$viafabricplus_visuals$replaceSound_174(class07072 class070722, CallbackInfoReturnable callbackInfoReturnable) {
        if (VisualSettings.INSTANCE.replaceHurtSoundWithOOFSound.isEnabled()) {
            callbackInfoReturnable.setReturnValue((Object)staticFields_47fa3311b0e9d3e9b883d09222919bf5a_5);
        }
    }

    private float redirect$djf000$viafabricplus$removeSwapCooldown(float f, float f2, float f3) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return 1.0f;
        }
        return class04995.N((float)f, (float)f2, (float)f3);
    }

    private float redirect$dmo000$viafabricplus$modifyStepHeight(class08036 class080362) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_10)) {
            return 1.0f;
        }
        return class080362.method_49476();
    }

    private void handler$doi000$viafabricplus$storeSprintingState(CallbackInfo callbackInfo) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_67fa3311b0e9d3e9b883d09222919bf5a_2 = this.method_5624();
    }

    private void handler$cff000$nursultan$injectGetOffGroundSpeed(CallbackInfoReturnable callbackInfoReturnable) {
        class08036 class080362 = this;
        if (class080362 instanceof class11822) {
            class11821 var3 = ((class11796)((class11822)class080362).dataManager()).L();
            float f = ((Float)var3.N()).floatValue();
            var3.N((Object)Float.valueOf(1.0f));
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(((Float)callbackInfoReturnable.getReturnValue()).floatValue() * f));
        }
    }

    private void m_handler$zeg000$fabric_entity_events_v1$onTrySleep_175(class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        class08035 class080352 = ((EntitySleepEvents.AllowSleeping)EntitySleepEvents.ALLOW_SLEEPING.invoker()).allowSleep(this, class072092);
        if (class080352 != null) {
            callbackInfoReturnable.setReturnValue((Object)Either.left((Object)((Object)class080352)));
        }
    }

    private void handler$dij000$viafabricplus$fixCreativeCheck(CallbackInfoReturnable callbackInfoReturnable) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfoReturnable.setReturnValue((Object)this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.u);
        }
    }

    public void method_7320(int n) {
        this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4, (Object)n);
    }

    public abstract @Nullable class07282 method_68876();

    public Optional<class06289> method_43122() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_57fa3311b0e9d3e9b883d09222919bf5a_1;
    }

    public int method_7272() {
        return (Integer)this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4);
    }

    public class08774 method_72498() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return new class08774(this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3);
    }

    public void method_7277(class07049 class070492) {
    }

    public class08152 method_75004() {
        return class08152.M;
    }

    public void method_5997(class07049 class070492) {
        if (this.method_75195(class070492)) {
            return;
        }
        float f = this.method_6123() ? ((class07438)this).fields_10212a028292fd3c078969e3ee4c71d9e8_2.floatValue() : (float)this.method_45325(class05298.u);
        class06584 class065842 = this.method_59958();
        class07072 class070722 = this.method_75204(class065842);
        float f2 = this.method_7261(0.5f);
        float f3 = f2 * (this.method_59903(class070492, f, class070722) - f);
        f *= this.method_76459();
        this.method_75124();
        if (this.method_75196(class070492)) {
            return;
        }
        if (f > 0.0f || f3 > 0.0f) {
            class07438 class074382;
            boolean bl;
            boolean bl2;
            boolean bl3;
            boolean bl4 = bl3 = f2 > 0.9f;
            if (this.method_5624() && bl3) {
                this.method_76457(class04909.GX);
                bl2 = true;
            } else {
                bl2 = false;
            }
            f += class065842.B().N(class070492, f, class070722);
            boolean bl5 = bl = bl3 && this.method_75197(class070492);
            if (bl) {
                f *= 1.5f;
            }
            float f4 = f + f3;
            boolean bl6 = this.method_75201(bl3, bl, bl2);
            float f5 = 0.0f;
            if (class070492 instanceof class07438) {
                class074382 = (class07438)class070492;
                f5 = class074382.method_6032();
            }
            class074382 = class070492.method_18798();
            if (class070492.method_64420(class070722, f4)) {
                this.method_75122(class070492, this.method_59924(class070492, class070722) + (bl2 ? 0.5f : 0.0f), (class06889)class074382);
                if (bl6) {
                    this.method_7263(class070492, f, class070722, f2);
                }
                this.method_75200(class070492, bl, bl6, bl3, false, f3);
                this.method_6114(class070492);
                this.method_75199(class070492, class065842, class070722, true);
                this.method_75198(class070492, f5);
                this.method_7322(0.1f);
            } else {
                this.method_76457(class04909.Ga);
            }
        }
        this.method_75125();
    }

    public void method_7304(class07049 class070492) {
    }

    public void method_7350() {
        ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_1 = 0;
        ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_2 = 0;
    }

    public static Optional<class07648> method_74135(class07001 class070012) {
        if (!class070012.z() && (class07078)class070012.N_15("id", class07078.N).orElse(null) == class07078.Nx) {
            return class070012.N_15("Variant", class07648.field_56653);
        }
        return Optional.empty();
    }

    public @Nullable class00717 method_7328(class06584 class065842, boolean bl) {
        return this.method_7329(class065842, false, bl);
    }

    public float method_59903(class07049 class070492, float f, class07072 class070722) {
        return f;
    }

    public Optional<class03982> method_42272() {
        return Optional.empty();
    }

    public void method_74133(Optional<class07648> optional) {
        this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5, (Object)class08036.method_74131(optional));
    }

    public void method_74134(Optional<class07648> optional) {
        this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6, (Object)class08036.method_74131(optional));
    }

    public boolean method_33793() {
        return false;
    }

    public int method_7278() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0;
    }

    private class01312 method_66325() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.method_6113()) {
            return class01312.field_18078;
        }
        if (this.method_5681()) {
            return class01312.field_18079;
        }
        if (this.method_6128()) {
            return class01312.field_18077;
        }
        if (this.method_6123()) {
            return class01312.field_18080;
        }
        if (this.method_5715() && !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y) {
            return class01312.field_18081;
        }
        return class01312.field_18076;
    }

    public void method_7285(int n) {
        int n2 = this.method_7272();
        this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4, (Object)(n2 + n));
    }

    public static class05300 method_26956() {
        return class07438.method_26827().N(class05298.u, 1.0).N(class05298.l, (double)0.1f).N(class05298.R).N(class05298.j).N(class05298.B, 4.5).N(class05298.E, 3.0).N(class05298.M).N(class05298.g).N(class05298.Y).N(class05298.t).N(class05298.I).N(class05298.q, 6.0E7).N(class05298.K, 6.0E7);
    }

    public double method_55754() {
        return this.method_45325(class05298.B);
    }

    public boolean method_7305(class00500 class005002) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return !class005002.J() || this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.y().y(class005002);
    }

    public Optional<class07648> method_74136() {
        return class08036.method_74132((OptionalInt)this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5));
    }

    private boolean method_75201(boolean bl, boolean bl2, boolean bl3) {
        double d;
        double d2;
        if (bl && !bl2 && !bl3 && this.method_24828() && (d2 = this.method_60478().z()) < class04995.E((double)(d = (double)this.method_6029() * 2.5))) {
            return this.method_5998(class07050.field_5808).N(class01226.LN);
        }
        return false;
    }

    public boolean method_56092(class00734 class007342, double d) {
        double d2 = this.method_55755() + d;
        return class007342.i(this.method_33571()) < d2 * d2;
    }

    public void method_40126(int n, float f, class06584 class065842) {
        ((class07438)this).fields_10212a028292fd3c078969e3ee4c71d9e8_1 = n;
        ((class07438)this).fields_10212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f);
        ((class07438)this).fields_10212a028292fd3c078969e3ee4c71d9e8_3 = class065842;
        if (!this.method_73183().method_8608()) {
            this.method_7262();
            this.method_6085(4, true);
        }
    }

    public boolean method_52558(class01312 class013122) {
        double d = 1.0E-7;
        class00734 class007342 = this.method_18377(class013122).N(this.method_73189());
        return this.method_73183().method_8587((class07049)this, this.redirect$dng000$viafabricplus$removeContractionOfCollisionBox(class007342, d));
    }

    public double method_72381() {
        return this.method_55754();
    }

    public boolean method_7332(boolean bl) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dij000$viafabricplus$preventEatingFoodInCreative(bl, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N || bl || this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.L();
    }

    public int method_7297() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3;
    }

    public GameProfile method_7334() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3;
    }

    public boolean method_7276() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        boolean bl = this.method_6113() && this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 >= 100;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl);
        this.m_handler$zeg000$fabric_entity_events_v1$onIsSleepingLongEnough_173(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl;
    }

    public void method_7293() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        for (int i = 0; i < this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5439(); ++i) {
            class06584 class065842 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5438(i);
            if (class065842.R() || !class07323.N((class06584)class065842, (class02477)class02523.g)) continue;
            this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5441(i);
        }
    }

    public boolean method_61498() {
        return false;
    }

    public boolean method_76729(class00734 class007342, double d) {
        return this.method_76693().N((class07438)this, class007342, d);
    }

    public void method_33592(class06584 class065842, class06584 class065843, class05442 class054422) {
    }

    private class07072 method_75204(class06584 class065842) {
        return class065842.N((class07438)this, () -> this.method_48923().N(this));
    }

    public void method_7268(boolean bl) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_47fa3311b0e9d3e9b883d09222919bf5a_4 = bl;
    }

    private class05216 method_7299(class05216 class052162) {
        String string = this.method_7334().name();
        return class052162.N(class004052 -> class004052.N((class00647)new class00640("/tell " + string + " ")).N(this.method_5769()).N(string));
    }

    public boolean method_21825() {
        return this.method_5715();
    }

    public void method_7318() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$dhj000$viafabricplus$onUpdatePose(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (!this.method_52558(class01312.field_18079)) {
            return;
        }
        class01312 class013122 = this.method_66325();
        class01312 class013123 = this.method_7325() || this.method_5765() || this.method_52558(class013122) ? class013122 : (this.method_52558(class01312.field_18081) ? class01312.field_18081 : class01312.field_18079);
        this.method_18380(class013123);
    }

    private boolean method_59818(double d, double d2, double d3) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dmo000$viafabricplus$changeOffsetsForSneakingCollisionDetection(d, d2, d3, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        class00734 class007342 = this.method_5829();
        return this.method_73183().method_8587((class07049)this, new class00734(class007342.N + 1.0E-7 + d, class007342.y - d3 - 1.0E-7, class007342.L + 1.0E-7 + d2, class007342.u - 1.0E-7 + d, class007342.y, class007342.R - 1.0E-7 + d2));
    }

    public boolean method_76458() {
        return this.method_7344().y() || this.method_31549().L;
    }

    public double method_55755() {
        return this.method_45325(class05298.E);
    }

    public float method_7261(float f) {
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = ((float)((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_1.intValue() + f) / this.method_7279();
        return this.redirect$djf000$viafabricplus$removeAttackCooldown(f4, f3, f2);
    }

    private void method_75198(class07049 class070492, float f) {
        if (class070492 instanceof class07438) {
            float f2 = f - ((class07438)class070492).method_6032();
            this.method_7339(class01235.q, Math.round(f2 * 10.0f));
            if (this.method_73183() instanceof class04782 && f2 > 2.0f) {
                int n = (int)((double)f2 * 0.5);
                ((class04782)this.method_73183()).method_65096((class07126)class07107.B, class070492.method_23317(), class070492.method_23323(0.5), class070492.method_23321(), n, 0.1, 0.0, 0.1, 0.2);
            }
        }
    }

    public boolean method_76730() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 > 0;
    }

    public float method_7351(class00500 class005002) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        float f = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.y().N(class005002);
        if (f > 1.0f) {
            f += (float)this.method_45325(class05298.t);
        }
        LocalFloatRefImpl localFloatRefImpl = new LocalFloatRefImpl();
        localFloatRefImpl.init(f);
        this.handler$ddl000$viafabricplus$changeSpeedCalculation(class005002, null, (LocalFloatRef)localFloatRefImpl);
        f = localFloatRefImpl.dispose();
        if (class07063.N((class07438)this)) {
            f *= 1.0f + (float)(class07063.y((class07438)this) + 1) * 0.2f;
        }
        class03556 var6 = class07047.u;
        class08036 class080362 = this;
        LocalFloatRefImpl localFloatRefImpl2 = new LocalFloatRefImpl();
        localFloatRefImpl2.init(f);
        f = localFloatRefImpl2.dispose();
        if (this.redirect$ddl000$viafabricplus$changeSpeedCalculation(class080362, var6, (LocalFloatRef)localFloatRefImpl2)) {
            float f2 = switch (this.method_6112(class07047.u).i()) {
                case 0 -> 0.3f;
                case 1 -> 0.09f;
                case 2 -> 0.0027f;
                default -> 8.1E-4f;
            };
            f *= f2;
        }
        f *= (float)this.method_45325(class05298.M);
        if (this.method_5777(class01231.N)) {
            f *= (float)this.method_5996(class05298.g).M();
        }
        if (!this.method_24828()) {
            f /= 5.0f;
        }
        return f;
    }

    public void method_7257(class07480 class074802) {
    }

    private void method_7341(class07049 class070492) {
        class070492.method_5694(this);
    }

    private void method_76457(class04891 class048912) {
        this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class048912, this.method_5634(), 1.0f, 1.0f);
    }

    public boolean method_7302() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_47fa3311b0e9d3e9b883d09222919bf5a_4;
    }

    public void method_66695(class08594 class085942) {
    }

    public boolean method_64271() {
        return true;
    }

    public class07512 method_7344() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0;
    }

    private void method_7263(class07049 class070492, float f, class07072 class070722, float f2) {
        this.method_76457(class04909.GF);
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        float f3 = 1.0f + (float)this.method_45325(class05298.I) * f;
        for (class07438 class074382 : this.method_73183().N(class07438.class, class070492.method_5829().L(1.0, 0.25, 1.0))) {
            float f4;
            class00681 class006812;
            if (class074382 == this || class074382 == class070492 || this.method_5722((class07049)class074382) || class074382 instanceof class00681 && (class006812 = (class00681)class074382).i() || !(this.method_5858((class07049)class074382) < 9.0) || !class074382.method_64397(class047822, class070722, f4 = this.method_59903((class07049)class074382, f3, class070722) * f2)) continue;
            class074382.method_6005((double)0.4f, (double)class04995.m((double)(this.method_36454() * ((float)Math.PI / 180))), (double)(-class04995.P((double)(this.method_36454() * ((float)Math.PI / 180)))));
            class07323.N((class04782)class047822, (class07049)class074382, (class07072)class070722);
        }
        double d = -class04995.m((double)(this.method_36454() * ((float)Math.PI / 180)));
        double d2 = class04995.P((double)(this.method_36454() * ((float)Math.PI / 180)));
        class047822.method_65096((class07126)class07107.Nm, this.method_23317() + d, this.method_23323(0.5), this.method_23321() + d2, 0, d, 0.0, d2, 0.0);
    }

    private boolean method_75195(class07049 class070492) {
        if (!class070492.method_5732()) {
            return true;
        }
        return class070492.method_5698((class07049)this);
    }

    private boolean method_30263(float f) {
        return this.method_24828() || this.field_6017 < (double)f && !this.method_59818(0.0, 0.0, (double)f - this.field_6017);
    }

    private void method_75200(class07049 class070492, boolean bl, boolean bl2, boolean bl3, boolean bl4, float f) {
        if (bl) {
            this.method_76457(class04909.Gc);
            this.method_7277(class070492);
        }
        if (!(bl || bl2 || bl4)) {
            this.method_76457(bl3 ? class04909.Gp : class04909.GA);
        }
        if (f > 0.0f) {
            this.method_7304(class070492);
        }
    }

    public float method_7279() {
        return (float)(1.0 / this.method_45325(class05298.R) * 20.0);
    }

    public void method_75203() {
        ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_1 = 0;
    }

    public void method_7303(class07253 class072532) {
    }

    public boolean method_23668() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dnc000$viafabricplus$replaceGlidingCondition(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (!this.method_6128() && this.method_63628() && !this.method_5799()) {
            this.method_23669();
            return true;
        }
        return false;
    }

    public boolean method_7338() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.u && this.method_75004().hasPermission(class08162.y);
    }

    private static Optional<class07648> method_74132(OptionalInt optionalInt) {
        if (optionalInt.isPresent()) {
            return Optional.of(class07648.N((int)optionalInt.getAsInt()));
        }
        return Optional.empty();
    }

    private float method_76459() {
        float f = this.method_7261(0.5f);
        return 0.2f + f * f * 0.8f;
    }

    public static OptionalInt method_74131(Optional<class07648> optional) {
        return optional.map(class076482 -> OptionalInt.of(class076482.N())).orElse(OptionalInt.empty());
    }

    public Optional<class07648> method_74137() {
        return class08036.method_74132((OptionalInt)this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6));
    }

    public class06556 method_7357() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_57fa3311b0e9d3e9b883d09222919bf5a_0;
    }

    public boolean method_7343(class07209 class072092, class07211 class072112, class06584 class065842) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.i) {
            return true;
        }
        class07209 class072093 = class072092.method_10093(class072112.b());
        class06646 class066462 = new class06646((class05487)this.method_73183(), class072093, false);
        return class065842.N(class066462);
    }

    private void method_7330() {
        this.method_6092(new class07055(class07047.W, 200, 0, false, false, true));
    }

    public void method_60983() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        if (this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 == 0) {
            this.method_58396();
        }
    }

    public boolean method_45015() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return (class07482)this.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
    }

    private void method_75199(class07049 class070492, class06584 class065842, class07072 class070722, boolean bl) {
        class07049 class070493 = class070492;
        if (class070492 instanceof class00695) {
            class070493 = ((class00695)class070492).N;
        }
        boolean bl2 = false;
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (class070493 instanceof class07438) {
                class072992 = (class07438)class070493;
                bl2 = class065842.N((class07438)class072992, (class07438)this);
            }
            if (bl) {
                class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722, (class06584)class065842);
            }
        }
        if (!this.method_73183().method_8608() && !class065842.R() && class070493 instanceof class07438) {
            if (bl2) {
                class065842.y((class07438)class070493, (class07438)this);
            }
            if (class065842.R()) {
                if (class065842 == this.method_6047()) {
                    this.method_6122(class07050.field_5808, class06584.E);
                } else {
                    this.method_6122(class07050.field_5810, class06584.E);
                }
            }
        }
    }

    public class06940 method_7274() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1;
    }

    public boolean method_56093(class07209 class072092, double d) {
        double d2 = this.method_55754() + d;
        return new class00734(class072092).i(this.method_33571()) < d2 * d2;
    }

    public void method_76731(int n) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = Math.max(this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0, n);
    }

    public boolean method_72380(class01114 class011142, class07209 class072092) {
        return class011142.N(this);
    }

    public void method_61499(class06584 class065842) {
    }

    public boolean method_7294() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.i;
    }

    public void method_23669() {
        this.method_5729(7, true);
    }

    public boolean method_61165() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6;
    }

    public boolean method_75202(class06584 class065842, int n) {
        float f = ((Float)class065842.a_(class02484.Z, (Object)Float.valueOf(0.0f))).floatValue();
        float f2 = (float)(((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_1 + n) / this.method_7279();
        return f > 0.0f && f2 < f;
    }

    public float method_75194(float f) {
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = ((float)((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_2.intValue() + f) / this.method_7279();
        return this.redirect$djf000$viafabricplus$removeSwapCooldown(f4, f3, f2);
    }

    public boolean method_7270(class06584 class065842) {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.M(class065842);
    }

    public void method_16354(class04858 class048582) {
    }

    public boolean method_7295() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_27fa3311b0e9d3e9b883d09222919bf5a_0 = this.method_5777(class01231.N);
        return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
    }

    public class07082 method_7287(class07049 class070492, class07050 class070502) {
        if (this.method_7325()) {
            if (class070492 instanceof class06237) {
                this.method_17355((class06237)class070492);
            }
            return class07082.i;
        }
        class06584 class065842 = this.method_5998(class070502);
        class06584 class065843 = class065842.t();
        class07082 class070822 = class070492.method_5688(this, class070502);
        if (class070822.N()) {
            if (this.method_56992() && class065842 == this.method_5998(class070502) && class065842.c() < class065843.c()) {
                class065842.i(class065843.c());
            }
            return class070822;
        }
        if (!class065842.R() && class070492 instanceof class07438) {
            class07082 class070823;
            if (this.method_56992()) {
                class065842 = class065843;
            }
            if ((class070823 = class065842.N(this, (class07438)class070492, class070502)).N()) {
                this.method_73183().method_32888((class03556)class01194.b, class070492.method_73189(), class01164.N((class07049)this));
                if (class065842.R() && !this.method_56992()) {
                    this.method_6122(class070502, class06584.E);
                }
                return class070823;
            }
        }
        return class07082.i;
    }

    public void method_66696(class08610 class086102) {
    }

    public void method_58396() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_5 = null;
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 = null;
        this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = false;
    }

    public boolean method_7340() {
        return false;
    }

    public boolean method_56094(class07049 class070492, double d) {
        if (class070492.method_31481()) {
            return false;
        }
        return this.method_56092(class070492.method_5829(), d);
    }

    private boolean method_64179(class06581 class065812) {
        for (class07085 class070852 : class07085.field_54086) {
            class06584 class065842 = this.method_6118(class070852);
            class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
            if (!class065842.N(class065812) || class087252 == null || class087252.y() != class070852) continue;
            return true;
        }
        return false;
    }

    private boolean method_75197(class07049 class070492) {
        return this.field_6017 > 0.0 && !this.method_24828() && !this.method_6101() && !this.method_5799() && !this.method_74025() && !this.method_5765() && class070492 instanceof class07438 && !this.method_5624();
    }

    private boolean method_75196(class07049 class070492) {
        if (class070492.method_5864().N(class01217.q) && class070492 instanceof class08005 && ((class08005)class070492).N(class04252.L, (class07049)this, (class08372<class07049>)class08372.N((class08636)this), true)) {
            this.method_73183().method_54762(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.Ga, this.method_5634());
            return true;
        }
        return false;
    }

    public boolean method_21701(class07299 class072992, class07209 class072092, class07282 class072822) {
        if (!class072822.i()) {
            return false;
        }
        if (class072822 == class07282.field_9219) {
            return true;
        }
        if (this.method_7294()) {
            return false;
        }
        class06584 class065842 = this.method_6047();
        return class065842.R() || !class065842.y(new class06646((class05487)class072992, class072092, false));
    }

    public boolean method_66324() {
        this.fields7fa3311b0e9d3e9b883d09222919bf5a();
        return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.u;
    }

    public boolean method_74025() {
        return this.method_6059(class07047.P);
    }

    public boolean method_7317() {
        return this.method_6032() > 0.0f && this.method_6032() < this.method_6063();
    }

    public boolean method_31550() {
        return this.method_6115() && this.method_6030().N(class06570.vy);
    }

    private void handler$dhj000$viafabricplus$onUpdatePose(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            class01312 class013122 = this.method_6128() ? class01312.field_18077 : (this.method_6113() ? class01312.field_18078 : (this.method_5681() ? class01312.field_18079 : (this.method_6123() ? class01312.field_18080 : (this.method_5715() ? class01312.field_18081 : class01312.field_18076))));
            this.method_18380(class013122);
            callbackInfo.cancel();
        }
    }

    private void fields7fa3311b0e9d3e9b883d09222919bf5a() {
        if (!this.fields_17fa3311b0e9d3e9b883d09222919bf5a_init) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_init = true;
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 = 0;
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
        }
        if (!this.fields_27fa3311b0e9d3e9b883d09222919bf5a_init) {
            this.fields_27fa3311b0e9d3e9b883d09222919bf5a_init = true;
            this.fields_27fa3311b0e9d3e9b883d09222919bf5a_0 = false;
        }
        if (!this.fields_37fa3311b0e9d3e9b883d09222919bf5a_init) {
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_init = true;
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(0.0f);
        }
        if (!this.fields_47fa3311b0e9d3e9b883d09222919bf5a_init) {
            this.fields_47fa3311b0e9d3e9b883d09222919bf5a_init = true;
            this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
            this.fields_47fa3311b0e9d3e9b883d09222919bf5a_1 = Float.valueOf(0.02f);
            this.fields_47fa3311b0e9d3e9b883d09222919bf5a_2 = 0;
            this.fields_47fa3311b0e9d3e9b883d09222919bf5a_4 = false;
        }
        if (!this.fields_57fa3311b0e9d3e9b883d09222919bf5a_init) {
            this.fields_57fa3311b0e9d3e9b883d09222919bf5a_init = true;
            this.fields_57fa3311b0e9d3e9b883d09222919bf5a_3 = Float.valueOf(0.0f);
            this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = false;
        }
        if (!this.fields_67fa3311b0e9d3e9b883d09222919bf5a_init) {
            this.fields_67fa3311b0e9d3e9b883d09222919bf5a_init = true;
            this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
            this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
            this.fields_67fa3311b0e9d3e9b883d09222919bf5a_2 = false;
        }
    }
}


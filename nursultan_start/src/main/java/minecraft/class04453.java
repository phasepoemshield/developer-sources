/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09052
 *  Nursultan.class09319
 *  Nursultan.class10947
 *  Nursultan.class10957
 *  Nursultan.class10971
 *  Nursultan.class10996
 *  Nursultan.class11354
 *  Nursultan.class11355
 *  Nursultan.class11357
 *  Nursultan.class11358
 *  Nursultan.class11394
 *  Nursultan.class11781
 *  Nursultan.class11796
 *  Nursultan.class11822
 *  Nursultan.class11891
 *  Nursultan.class11938
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.PlayerUpdateEvent
 *  baritone.api.event.events.SprintStateEvent
 *  baritone.api.event.events.type.EventState
 *  baritone.behavior.LookBehavior
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.injection.access.base.IConnection
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.Protocol1_21_5To1_21_6
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage
 *  java.lang.MatchException
 *  minecraft.class00020
 *  minecraft.class00032
 *  minecraft.class00040
 *  minecraft.class00043
 *  minecraft.class00044
 *  minecraft.class00141
 *  minecraft.class00169
 *  minecraft.class00197
 *  minecraft.class00231
 *  minecraft.class00250
 *  minecraft.class00329
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00402
 *  minecraft.class00494
 *  minecraft.class00525
 *  minecraft.class00530
 *  minecraft.class00535
 *  minecraft.class00543
 *  minecraft.class00550
 *  minecraft.class00557
 *  minecraft.class00564
 *  minecraft.class00569
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class01205
 *  minecraft.class01231
 *  minecraft.class01312
 *  minecraft.class01337
 *  minecraft.class01352
 *  minecraft.class01359
 *  minecraft.class01463
 *  minecraft.class01683
 *  minecraft.class01756
 *  minecraft.class02131
 *  minecraft.class02244
 *  minecraft.class02484
 *  minecraft.class02699
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class03777
 *  minecraft.class03786
 *  minecraft.class04474
 *  minecraft.class04477
 *  minecraft.class04858
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05298
 *  minecraft.class05397
 *  minecraft.class05442
 *  minecraft.class05630
 *  minecraft.class05684
 *  minecraft.class05731
 *  minecraft.class05850
 *  minecraft.class05884
 *  minecraft.class05995
 *  minecraft.class06087
 *  minecraft.class06092
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06428
 *  minecraft.class06543
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06984
 *  minecraft.class07042
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07062
 *  minecraft.class07070
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07109
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07253
 *  minecraft.class07267
 *  minecraft.class07282
 *  minecraft.class07290
 *  minecraft.class07337
 *  minecraft.class07343
 *  minecraft.class07352
 *  minecraft.class07356
 *  minecraft.class07363
 *  minecraft.class07364
 *  minecraft.class07375
 *  minecraft.class07431
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class07480
 *  minecraft.class07482
 *  minecraft.class07487
 *  minecraft.class07504
 *  minecraft.class07831
 *  minecraft.class08033
 *  minecraft.class08036
 *  minecraft.class08038
 *  minecraft.class08152
 *  minecraft.class08153
 *  minecraft.class08156
 *  minecraft.class08594
 *  minecraft.class08610
 *  minecraft.class08678
 *  minecraft.class08687
 *  minecraft.class08722
 *  minecraft.class09037
 *  net.irisshaders.iris.mixinterface.BiomeAmbienceInterface
 *  net.irisshaders.iris.mixinterface.LocalPlayerInterface
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.Protocolr1_5_2Tor1_6_1
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09052;
import Nursultan.class09319;
import Nursultan.class10947;
import Nursultan.class10957;
import Nursultan.class10971;
import Nursultan.class10996;
import Nursultan.class11354;
import Nursultan.class11355;
import Nursultan.class11357;
import Nursultan.class11358;
import Nursultan.class11394;
import Nursultan.class11781;
import Nursultan.class11796;
import Nursultan.class11822;
import Nursultan.class11891;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.SprintStateEvent;
import baritone.api.event.events.type.EventState;
import baritone.behavior.LookBehavior;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.Protocol1_21_5To1_21_6;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;
import minecraft.class00020;
import minecraft.class00032;
import minecraft.class00040;
import minecraft.class00043;
import minecraft.class00044;
import minecraft.class00141;
import minecraft.class00169;
import minecraft.class00197;
import minecraft.class00231;
import minecraft.class00250;
import minecraft.class00329;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00402;
import minecraft.class00494;
import minecraft.class00525;
import minecraft.class00530;
import minecraft.class00535;
import minecraft.class00543;
import minecraft.class00550;
import minecraft.class00557;
import minecraft.class00564;
import minecraft.class00569;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class01205;
import minecraft.class01231;
import minecraft.class01312;
import minecraft.class01337;
import minecraft.class01352;
import minecraft.class01359;
import minecraft.class01463;
import minecraft.class01683;
import minecraft.class01756;
import minecraft.class02131;
import minecraft.class02244;
import minecraft.class02484;
import minecraft.class02699;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class03777;
import minecraft.class03786;
import minecraft.class04410;
import minecraft.class04474;
import minecraft.class04477;
import minecraft.class04858;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05298;
import minecraft.class05397;
import minecraft.class05442;
import minecraft.class05630;
import minecraft.class05684;
import minecraft.class05731;
import minecraft.class05850;
import minecraft.class05884;
import minecraft.class05995;
import minecraft.class06087;
import minecraft.class06092;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06428;
import minecraft.class06543;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06984;
import minecraft.class07042;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07062;
import minecraft.class07070;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07109;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07253;
import minecraft.class07267;
import minecraft.class07282;
import minecraft.class07290;
import minecraft.class07337;
import minecraft.class07343;
import minecraft.class07352;
import minecraft.class07356;
import minecraft.class07363;
import minecraft.class07364;
import minecraft.class07375;
import minecraft.class07431;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07480;
import minecraft.class07482;
import minecraft.class07487;
import minecraft.class07504;
import minecraft.class07831;
import minecraft.class08033;
import minecraft.class08036;
import minecraft.class08038;
import minecraft.class08152;
import minecraft.class08153;
import minecraft.class08156;
import minecraft.class08594;
import minecraft.class08610;
import minecraft.class08678;
import minecraft.class08687;
import minecraft.class08722;
import minecraft.class09037;
import net.irisshaders.iris.mixinterface.BiomeAmbienceInterface;
import net.irisshaders.iris.mixinterface.LocalPlayerInterface;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.Protocolr1_5_2Tor1_6_1;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04453
extends class04477
implements class11781,
class11822,
LocalPlayerInterface {
    private static String[] s;
    private static double[] t;
    private static double[] k;
    private static String[] V;
    private static double[] H;
    private static double[] p;
    private static double[] NG;
    private static double[] ND;
    private static double[] yM;
    private static double[] yG;
    private static double[] yK;
    private static double[] yD;
    private static double[] Ly;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;
    public Object i_6;
    public boolean i_init;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public Object R_5;
    public Object R_6;
    public Object R_7;
    public boolean R_init;
    public Object M_0;
    public Object M_1;
    public Object M_2;
    public boolean M_init;
    public Object B_0;
    public Object B_1;
    public Object B_2;
    public Object B_3;
    public boolean B_init;
    public static Object Z_0;
    public static Object Z_1;
    public static Object Z_2;
    public static Object Z_3;
    public Object W_0;
    public Object W_1;
    public Object W_2;
    public Object W_3;
    public Object W_4;
    public Object W_5;
    public Object W_6;
    public boolean W_init;
    public Object m_0;
    public Object m_1;
    public boolean m_init;

    public void w() {
        this.method_18380(class01312.field_18076);
        if (this.method_73183() != null) {
            for (double d = this.method_23318(); d > (double)this.method_73183().method_31607() && d <= (double)this.method_73183().method_31600(); d += t[3]) {
                this.method_5814(this.method_23317(), d, this.method_23321());
                if (this.method_73183().N((class07049)this)) break;
            }
            this.method_18799(class06889.L);
            this.method_36457(0.0f);
        }
        this.method_6033(this.method_6063());
        ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 = 0;
    }

    private void L(CallbackInfo callbackInfo) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().equals((Object)ProtocolVersion.v1_21_4) && this.F()) {
            this.method_5728(false);
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            ((class04474)this.L_1).field_55868 = this.u(((class04474)this.L_1).field_55868);
        }
    }

    private static float L(class07109 class071092) {
        float f = Math.abs(class071092.z);
        float f2 = Math.abs(class071092.U);
        float f3 = f2 > f ? f / f2 : f2 / f;
        return class04995.N((float)(1.0f + class04995.z((float)f3)));
    }

    private void L(class08687 class086872) {
        byte by = 0;
        by = (byte)(by | (class086872.N() ? 1 : 0));
        by = (byte)(by | (class086872.y() ? 2 : 0));
        by = (byte)(by | (class086872.L() ? 4 : 0));
        by = (byte)(by | (class086872.u() ? 8 : 0));
        by = (byte)(by | (class086872.i() ? 16 : 0));
        by = (byte)(by | (class086872.R() ? 32 : 0));
        by = (byte)(by | (class086872.M() ? 64 : 0));
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_21_5.PLAYER_INPUT, (UserConnection)ProtocolTranslator.getPlayNetworkUserConnection());
        packetWrapper.write((Type)Types.BYTE, (Object)by);
        packetWrapper.scheduleSendToServer(Protocol1_21_5To1_21_6.class);
    }

    public boolean L() {
        return this.method_24828();
    }

    private boolean L(class04453 class044532) {
        this.NZ();
        return ((class11355)this.W_3).R();
    }

    private void L(CallbackInfoReturnable callbackInfoReturnable) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            boolean bl = this.method_5854() != null && this.method_5854().method_5864() == class07078.t;
            callbackInfoReturnable.setReturnValue((Object)(this.method_6128() || this.method_74025() || this.g() || this.method_5765() && !bl || this.method_6115() && !this.method_5765() && !this.method_5869() ? 1 : 0));
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_7)) {
            callbackInfoReturnable.setReturnValue((Object)(this.method_74025() || this.method_5765() && !this.y(this.method_5854()) || !((class04474)this.L_1).method_20622() || !this.p() || this.field_5976 && !this.field_34927 || this.method_5799() && !this.method_5869() ? 1 : 0));
        }
    }

    private float L(float f) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3)) {
            f = Float.intBitsToFloat(1597463007 - (Float.floatToIntBits(f) >> 1));
            return f * (1.5f - 0.5f * f * f * f);
        }
        return class04995.B((float)f);
    }

    public void L(boolean bl) {
        this.NZ();
        this.m_1 = bl;
    }

    private float M(class04453 class044532) {
        this.NZ();
        return ((class11394)this.W_4).y();
    }

    private boolean M(boolean bl) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_15_1) && bl;
    }

    public double M() {
        return this.method_23318();
    }

    private void M(CallbackInfo callbackInfo) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
        if (iBaritone != null) {
            iBaritone.getGameEventHandler().onPlayerUpdate(new PlayerUpdateEvent(EventState.PRE));
        }
    }

    public float P() {
        this.NZ();
        return ((Float)this.B_2).floatValue();
    }

    private double P(class04453 class044532) {
        this.NZ();
        return ((class11355)this.W_3).B();
    }

    public void K() {
        this.NZ();
        ((class01683)this.y_0).N((class00381)new class00535(class00569.field_12774));
        class06428.u();
    }

    public void T() {
        this.NZ();
        ((class01683)this.y_0).N((class00381)new class07375((class07049)this, class07363.field_12988));
    }

    private boolean T(class04453 class044532) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return this.Nu() || this.field_5976 && !this.field_34927 || !this.H();
        }
        return this.F();
    }

    public boolean Q() {
        this.NZ();
        return (Boolean)this.m_1;
    }

    public void method_5674(class02131<?> class021312) {
        this.NZ();
        super.method_5674(class021312);
        if (class07438.staticFields_6212a028292fd3c078969e3ee4c71d9e8_0.equals(class021312)) {
            class07050 class070502;
            boolean bl = ((Byte)this.field_6011.N(class07438.staticFields_6212a028292fd3c078969e3ee4c71d9e8_0) & 1) > 0;
            class07050 class070503 = class070502 = ((Byte)this.field_6011.N(class07438.staticFields_6212a028292fd3c078969e3ee4c71d9e8_0) & 2) > 0 ? class07050.field_5810 : class07050.field_5808;
            if (bl && !((Boolean)this.i_1).booleanValue()) {
                this.method_6019(class070502);
            } else if (!bl && ((Boolean)this.i_1).booleanValue()) {
                this.method_6021();
            }
        }
        if (field_5990.equals(class021312) && this.method_6128() && !((Boolean)this.i_6).booleanValue()) {
            ((class06202)this.L_3).Nr().N((class00044)new class00141(this));
        }
    }

    public class06889 method_30951(float f) {
        this.NZ();
        if (((class05630)((class06202)this.L_3).i_7).NS().N()) {
            float f2 = class04995.B((float)(f * 0.5f), (float)this.method_36454(), (float)this.field_5982) * ((float)Math.PI / 180);
            float f3 = class04995.B((float)(f * 0.5f), (float)this.method_36455(), (float)this.field_6004) * ((float)Math.PI / 180);
            double d = this.method_6068() == class07070.field_6183 ? ND[5] : k[0];
            return new class06889(k[1] * d, k[2], k[3]).N(-f3).y(-f2).i(this.method_5836(f));
        }
        return super.method_30951(f);
    }

    public float method_73188() {
        return this.method_36454();
    }

    public void method_5773() {
        class07049 class070492;
        Object object;
        class07352 class073522;
        this.NZ();
        if (!((class01683)this.y_0).I()) {
            return;
        }
        class08722 class087222 = (class08722)this.y_3;
        this.Z((CallbackInfo)null);
        class087222.y();
        super.method_5773();
        this.M((CallbackInfo)null);
        this.B((CallbackInfo)null);
        if (!((class08687)this.L_2).equals((Object)((class04474)this.L_1).field_54155)) {
            class073522 = new class07352(((class04474)this.L_1).field_54155);
            object = (class01683)this.y_0;
            this.y((class01683)object, (class00381)class073522);
            this.L_2 = ((class04474)this.L_1).field_54155;
        }
        if (this.method_5765()) {
            class073522 = new class00530(this.method_36454(), this.method_36455(), this.method_24828(), this.field_5976);
            object = (class01683)this.y_0;
            this.N((class01683)object, (class00381)class073522);
            class070492 = this.method_5668();
            if (class070492 != this && class070492.method_66247()) {
                ((class01683)this.y_0).N((class00381)class00557.N((class07049)class070492));
                object = this;
                if (this.z((class04453)((Object)object))) {
                    ((class04453)((Object)object)).A();
                }
            }
        } else {
            this.r();
        }
        class070492 = ((List)this.y_4).iterator();
        while (class070492.hasNext()) {
            ((class00169)class070492.next()).N();
        }
        this.N((CallbackInfo)null);
    }

    public void method_5784(class07451 class074512, class06889 class068892) {
        double d = this.method_23317();
        double d2 = this.method_23321();
        super.method_5784(class074512, class068892);
        float f = (float)(this.method_23317() - d);
        float f2 = (float)(this.method_23321() - d2);
        this.N(f, f2);
        this.N(class04995.M((float)f, (float)f2) * 0.6f);
    }

    public boolean method_39759(class06889 class068892) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(V[0], true);
        this.N(class068892, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        float f = this.method_36454() * ((float)Math.PI / 180);
        double d = class04995.m((double)f);
        double d2 = class04995.P((double)f);
        double d3 = (double)((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * d2 - (double)((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() * d;
        double d4 = (double)((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() * d2 + (double)((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * d;
        double d5 = class04995.E((double)d3) + class04995.E((double)d4);
        double d6 = class04995.E((double)class068892.M) + class04995.E((double)class068892.Z);
        if (d5 < ND[0] || d6 < ND[1]) {
            return false;
        }
        return Math.acos((d3 * class068892.M + d4 * class068892.Z) / Math.sqrt(d5 * d6)) < ND[2];
    }

    public boolean method_18276() {
        this.NZ();
        return (Boolean)this.R_5;
    }

    public boolean method_5869() {
        return ((class08036)this).fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
    }

    public void method_5783(class04891 class048912, float f, float f2) {
        this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class048912, this.method_5634(), f, f2, false);
    }

    public boolean method_27298() {
        return !this.method_31549().y && super.method_27298();
    }

    public float method_5705(float f) {
        if (this.method_5765()) {
            return super.method_5705(f);
        }
        return this.method_36454();
    }

    public float method_5695(float f) {
        return this.method_36455();
    }

    public boolean method_5715() {
        this.NZ();
        return ((class04474)this.L_1).field_54155.R();
    }

    public void method_29239() {
        this.NZ();
        super.method_29239();
        this.i_3 = false;
    }

    public boolean method_5873(class07049 class070492, boolean bl, boolean bl2) {
        this.NZ();
        if (!super.method_5873(class070492, bl, bl2)) {
            boolean bl3 = false;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(s[0], false, bl3);
            this.N(class070492, bl, bl2, callbackInfoReturnable);
            return false;
        }
        if (class070492 instanceof class07504) {
            class07504 class075042 = (class07504)class070492;
            ((class06202)this.L_3).Nr().N((class00044)new class00043((class08036)this, class075042, true, class04909.Tr, 0.0f, 0.75f, 1.0f));
            ((class06202)this.L_3).Nr().N((class00044)new class00043((class08036)this, class075042, false, class04909.bN, 0.0f, 0.75f, 1.0f));
        } else if (class070492 instanceof class00032) {
            class00032 class000322 = (class00032)class070492;
            ((class06202)this.L_3).Nr().N((class00044)new class08678((class08036)this, (class07049)class000322, false, class04909.mY, class000322.method_5634(), 0.0f, 1.0f, 5.0f));
        } else if (class070492 instanceof class08156) {
            class08156 class081562 = (class08156)class070492;
            ((class06202)this.L_3).Nr().N((class00044)new class08678((class08036)this, (class07049)class081562, true, class04909.yE, class081562.method_5634(), 0.0f, 1.0f, 5.0f));
        }
        boolean bl4 = true;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(s[1], false, bl4);
        this.N(class070492, bl, bl2, callbackInfoReturnable);
        return true;
    }

    public void method_5842() {
        this.NZ();
        this.U((CallbackInfo)null);
        super.method_5842();
        this.i_3 = false;
        class07049 class070492 = this.method_49694();
        if (class070492 instanceof class00250) {
            ((class00250)class070492).N(((class04474)this.L_1).field_54155.L(), ((class04474)this.L_1).field_54155.u(), ((class04474)this.L_1).field_54155.N(), ((class04474)this.L_1).field_54155.y());
            this.i_3 = (Boolean)this.i_3 | (((class04474)this.L_1).field_54155.L() || ((class04474)this.L_1).field_54155.u() || ((class04474)this.L_1).field_54155.N() || ((class04474)this.L_1).field_54155.y());
        }
    }

    public void method_5711(byte by) {
        switch (by) {
            case 24: {
                this.N(class08152.M);
                break;
            }
            case 25: {
                this.N((class08152)class06984.y);
                break;
            }
            case 26: {
                this.N((class08152)class06984.L);
                break;
            }
            case 27: {
                this.N((class08152)class06984.u);
                break;
            }
            case 28: {
                this.N((class08152)class06984.i);
                break;
            }
            default: {
                super.method_5711(by);
            }
        }
    }

    public class04453(class06202 class062022, class03448 class034482, class01683 class016832, class01205 class012052, class01756 class017562, class08687 class086872, boolean bl) {
        super(class034482, class016832.E());
        this.NZ();
        this.W_1 = new class06889(yM[0], yM[1], yM[2]);
        this.W_5 = new class11796();
        this.y_3 = new class08722(20, 1280);
        this.y_4 = Lists.newArrayList();
        this.M_0 = class08152.M;
        this.L_1 = new class04474();
        this.L_5 = Integer.MIN_VALUE;
        this.i_4 = true;
        this.m_1 = true;
        this.W_0 = false;
        this.L_3 = class062022;
        this.y_0 = class016832;
        this.y_1 = class012052;
        this.y_2 = class017562;
        this.L_2 = class086872;
        this.R_6 = bl;
        ((List)this.y_4).add(new class00020(this, class062022.Nr()));
        ((List)this.y_4).add(new class05684(this));
        ((List)this.y_4).add(new class05397(this, class062022.Nr()));
        this.N(class062022, class034482, class016832, class012052, class017562, class086872, bl, null);
    }

    static {
        class04453.NN();
        class04453.S();
        class04453.C();
        Z_0 = LogUtils.getLogger();
        N_5 = class04453.NR();
    }

    private void B(boolean bl) {
        this.NZ();
        this.i_0 = Float.valueOf(((Float)this.B_3).floatValue());
        float f = 0.0f;
        if (bl && this.field_51994 != null && this.field_51994.i()) {
            if ((class05096)((class06202)this.L_3).v_3 != null && !((class05096)((class06202)this.L_3).v_3).method_73217()) {
                if ((class05096)((class06202)this.L_3).v_3 instanceof class01463) {
                    this.method_7346();
                }
                ((class06202)this.L_3).N(null);
            }
            if (((Float)this.B_3).floatValue() == 0.0f) {
                ((class06202)this.L_3).Nr().N((class00044)class00040.y((class04891)class04909.lt, (float)(this.field_5974.z() * 0.4f + 0.8f), (float)0.25f));
            }
            f = 0.0125f;
            this.field_51994.N(false);
        } else if (((Float)this.B_3).floatValue() > 0.0f) {
            f = -0.05f;
        }
        this.B_3 = Float.valueOf(class04995.N((float)(((Float)this.B_3).floatValue() + f), (float)0.0f, (float)1.0f));
    }

    private boolean B(class04453 class044532) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_5);
    }

    private int B(int n) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return n - 1;
        }
        return n;
    }

    private void B(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_21_2, ProtocolVersion.v1_21_5)) {
            this.a();
        }
    }

    private static void C() {
        Z_1 = 20;
        Z_2 = 600;
        Z_3 = 100;
        N_0 = Float.valueOf(0.6f);
        N_1 = NG[2];
        N_2 = NG[3];
        N_3 = Integer.MIN_VALUE;
        N_4 = -2147483647;
    }

    private boolean F() {
        this.NZ();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(s[5], true);
        this.L(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        class04453 class044532 = this;
        boolean bl = this.method_31549().y;
        return !this.N(class044532, bl) || !((class04474)this.L_1).method_20622() || this.field_5976 && !this.field_34927;
    }

    public boolean I() {
        this.NZ();
        return (Boolean)this.W_0;
    }

    public boolean J() {
        this.NZ();
        return ((class06202)this.L_3).F() == this;
    }

    private static void S() {
        s = new String[7];
        class04453.s[0] = "";
        class04453.s[1] = "";
        class04453.s[2] = "";
        class04453.s[3] = "";
        class04453.s[4] = "";
        class04453.s[5] = "";
        class04453.s[6] = "";
        V = new String[5];
        class04453.V[0] = "";
        class04453.V[1] = "";
        class04453.V[2] = "";
        class04453.V[3] = "mayFly";
        class04453.V[4] = "[net.minecraft.class_744]";
    }

    private float Z(class04453 class044532) {
        class11354 class113542 = class11354.y((float)class044532.Y());
        class11938.L().L((Object)class113542);
        return class113542.N();
    }

    private void Z(CallbackInfo callbackInfo) {
        class11938.L().L((Object)class10996.N());
    }

    private boolean e() {
        boolean bl;
        class04453 class044532;
        this.NZ();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(V[2], true);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return !(this.method_5624() || !((class04474)this.L_1).method_20622() || !this.N(class044532 = this, bl = this.method_31549().y) || this.x() || this.method_6128() && !this.method_5869() || this.t(class044532 = this) && !this.method_5869());
    }

    private void i(CallbackInfo callbackInfo) {
        this.NZ();
        class04453 class044532 = this;
        this.W_3 = class11355.N((double)class044532.method_23317(), (double)class044532.method_23318(), (double)class044532.method_23321(), (float)class044532.method_36454(), (float)class044532.method_36455(), (boolean)class044532.method_24828(), (boolean)class044532.method_5624());
        class11938.L().L((Object)((class11355)this.W_3));
        class11891.N((class11781)class044532);
        if (((class11355)this.W_3).y()) {
            callbackInfo.cancel();
        }
    }

    public boolean i(boolean bl) {
        this.NZ();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(s[3], true);
        this.y(bl, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        class07356 class073562 = bl ? class07356.field_12970 : class07356.field_12975;
        class06584 class065842 = this.method_31548().N(bl);
        ((class01683)this.y_0).N((class00381)new class07364(class073562, class07209.field_10980, class07211.field_11033));
        return !class065842.R();
    }

    private boolean i(class04453 class044532) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_1) && class044532.method_5681();
    }

    public class07438 i() {
        return this;
    }

    private boolean b(class04453 class044532) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20) && class044532.method_5765();
    }

    public class02244 b() {
        return this.field_51994 == null ? class02244.field_52062 : this.field_51994.N();
    }

    private boolean x() {
        return this.method_6115() && !((class08153)((class07438)this).fields_9212a028292fd3c078969e3ee4c71d9e8_0.a_(class02484.M, (Object)class08153.N)).N();
    }

    public class08722 s() {
        this.NZ();
        return (class08722)this.y_3;
    }

    private boolean s(class04453 class044532) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            return ((class04474)class044532.L_1).field_54155.R();
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            return !((class04453)((Object)class06202.Nq().T_4)).method_7325() && (((class04474)class044532.L_1).field_54155.R() || class044532.g());
        }
        return class044532.g();
    }

    public boolean n() {
        this.NZ();
        return (Boolean)this.i_3;
    }

    private double n(class04453 class044532) {
        this.NZ();
        return ((class11355)this.W_3).i();
    }

    private void f() {
        this.NZ();
        this.L_5 = (Integer)this.L_5 == Integer.MIN_VALUE ? Integer.valueOf(-2147483647) : Integer.valueOf(this.field_6012);
    }

    public class08687 l() {
        this.NZ();
        return (class08687)this.L_2;
    }

    public boolean d() {
        this.NZ();
        return (Boolean)this.i_4;
    }

    private void a() {
        this.NZ();
        boolean bl = this.method_5715();
        if (bl == (Boolean)this.W_6) {
            return;
        }
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_21_5.PLAYER_COMMAND, (UserConnection)ProtocolTranslator.getPlayNetworkUserConnection());
        packetWrapper.write((Type)Types.VAR_INT, (Object)this.method_5628());
        packetWrapper.write((Type)Types.VAR_INT, (Object)(bl ? 0 : 1));
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.scheduleSendToServer(Protocol1_21_5To1_21_6.class);
        this.W_6 = bl;
    }

    public float m() {
        this.NZ();
        for (class00169 class001692 : (List)this.y_4) {
            if (!(class001692 instanceof class05397)) continue;
            return ((class05397)class001692).y();
        }
        return 0.0f;
    }

    private boolean m(class04453 class044532) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_12_2) && class044532.method_5799();
    }

    public class11796 dataManager() {
        this.NZ();
        return (class11796)this.W_5;
    }

    private boolean p() {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_19_1) && this.method_5765() || this.method_76458();
    }

    public boolean k() {
        this.NZ();
        return ((class04474)this.L_1).method_3128().L() > 0.0f;
    }

    public void t() {
        this.NZ();
        super.method_7346();
        ((class06202)this.L_3).N(null);
    }

    private boolean t(class04453 class044532) {
        class10971 class109712 = class10971.L();
        class11938.L().L((Object)class109712);
        if (class109712.y()) {
            return false;
        }
        return class044532.g();
    }

    public boolean g() {
        return this.method_18276() || this.method_20448();
    }

    private float v(class04453 class044532) {
        this.NZ();
        return ((class11355)this.W_3).Z();
    }

    public void v() {
        this.NZ();
        ((class01683)this.y_0).N((class00381)new class07375((class07049)this, class07363.field_12987, class04995.y((float)(this.P() * 100.0f))));
    }

    private float j(class04453 class044532) {
        this.NZ();
        return ((class11355)this.W_3).M();
    }

    public float j() {
        this.NZ();
        if (!this.method_5777(class01231.N)) {
            return 0.0f;
        }
        float f = 600.0f;
        float f2 = 100.0f;
        if ((float)((Integer)this.m_0).intValue() >= 600.0f) {
            return 1.0f;
        }
        float f3 = class04995.N((float)((float)((Integer)this.m_0).intValue() / 100.0f), (float)0.0f, (float)1.0f);
        float f4 = (float)((Integer)this.m_0).intValue() < 100.0f ? 0.0f : class04995.N((float)(((float)((Integer)this.m_0).intValue() - 100.0f) / 500.0f), (float)0.0f, (float)1.0f);
        return f3 * 0.6f + f4 * 0.39999998f;
    }

    public class01756 q() {
        this.NZ();
        return (class01756)this.y_2;
    }

    private boolean U(class04453 class044532) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(LegacyProtocolVersion.r1_4_2, ProtocolVersion.v1_8) || ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
            return !this.method_24828();
        }
        return (Boolean)this.R_3;
    }

    private void U(CallbackInfo callbackInfo) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
        if (iBaritone != null) {
            ((LookBehavior)iBaritone.getLookBehavior()).pig();
        }
    }

    private boolean z(class04453 class044532) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_3);
    }

    private void z(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            this.a();
        }
    }

    private class07109 u(class07109 class071092) {
        if (class071092.L() == 0.0f) {
            return class071092;
        }
        float f = 0.98f;
        Object object = class071092;
        class07109 class071093 = this.N((class07109)object, f);
        if (this.method_6115() && !this.method_5765()) {
            object = this;
            class071093 = class071093.N(this.Z((class04453)((Object)object)));
        }
        if (this.s((class04453)((Object)(object = this)))) {
            float f2 = (float)this.method_45325(class05298.Y);
            class071093 = class071093.N(f2);
        }
        object = class071093;
        return this.y((class07109)object);
    }

    public void u(boolean bl) {
        this.NZ();
        this.W_0 = bl;
    }

    public double u() {
        this.NZ();
        return (Double)this.M_2;
    }

    private boolean u(class04453 class044532) throws Throwable {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
        if (iBaritone == null) {
            return ((MethodHandle)N_5).invokeExact(class044532);
        }
        return !iBaritone.getPathingBehavior().isPathing() && ((MethodHandle)N_5).invokeExact(class044532);
    }

    private void u(CallbackInfo callbackInfo) {
        this.NZ();
        this.W_4 = class11394.N((float)((class04453)((Object)((class06202)this.L_3).T_4)).method_36454(), (float)((class04453)((Object)((class06202)this.L_3).T_4)).method_36455());
        class11938.L().L((Object)((class11394)this.W_4));
    }

    private void r() {
        this.NZ();
        CallbackInfo callbackInfo = new CallbackInfo(s[2], true);
        this.i(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.A();
        this.z((CallbackInfo)null);
        if (this.J()) {
            class04453 class044532;
            boolean bl;
            class04453 class044533 = this;
            double d = this.P(class044533) - (Double)this.M_1;
            class044533 = this;
            double d2 = this.n(class044533) - (Double)this.M_2;
            class044533 = this;
            double d3 = this.y(class044533) - (Double)this.R_0;
            class044533 = this;
            double d4 = this.j(class044533) - ((Float)this.R_1).floatValue();
            class044533 = this;
            double d5 = this.v(class044533) - ((Float)this.R_2).floatValue();
            this.R_7 = (Integer)this.R_7 + 1;
            double d6 = yM[3];
            boolean bl2 = class04995.R((double)d, (double)d2, (double)d3) > this.N(d6) || this.B((Integer)this.R_7) >= 20;
            boolean bl3 = bl = d4 != yM[4] || d5 != yM[5];
            if (bl2 && bl) {
                class044532 = this;
                float f = this.j(class044532);
                class044532 = this;
                float f2 = this.v(class044532);
                class044532 = this;
                ((class01683)this.y_0).N((class00381)new class00564(this.method_73189(), f, f2, this.L(class044532), this.field_5976));
            } else if (bl2) {
                class044532 = this;
                ((class01683)this.y_0).N((class00381)new class00550(this.method_73189(), this.L(class044532), this.field_5976));
            } else if (bl) {
                class044532 = this;
                float f = this.j(class044532);
                class044532 = this;
                float f3 = this.v(class044532);
                class044532 = this;
                ((class01683)this.y_0).N((class00381)new class00530(f, f3, this.L(class044532), this.field_5976));
            } else {
                class044532 = this;
                if (this.U(this) != this.L(class044532) || (Boolean)this.R_4 != this.field_5976) {
                    class044532 = this;
                    ((class01683)this.y_0).N((class00381)new class00525(this.L(class044532), this.field_5976));
                }
            }
            if (bl2) {
                class044532 = this;
                this.M_1 = this.P(class044532);
                class044532 = this;
                this.M_2 = this.n(class044532);
                class044532 = this;
                this.R_0 = this.y(class044532);
                this.R_7 = 0;
            }
            if (bl) {
                class044532 = this;
                this.R_1 = Float.valueOf(this.j(class044532));
                class044532 = this;
                this.R_2 = Float.valueOf(this.v(class044532));
            }
            class044532 = this;
            this.R_3 = this.L(class044532);
            this.R_4 = this.field_5976;
            this.i_4 = (boolean)((Boolean)((class05630)((class06202)this.L_3).i_7).f().method_41753());
        }
    }

    public void y(float f) {
        this.NZ();
        if (((Boolean)this.L_0).booleanValue()) {
            float f2 = this.method_6032() - f;
            if (f2 <= 0.0f) {
                this.method_6033(f);
                if (f2 < 0.0f) {
                    this.field_6008 = 10;
                }
            } else {
                ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_3 = Float.valueOf(f2);
                this.field_6008 = 20;
                this.method_6033(f);
                ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_1 = 10;
                ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_0 = (int)((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_1;
            }
        } else {
            this.method_6033(f);
            this.L_0 = true;
        }
    }

    public boolean y() {
        this.NZ();
        return (Boolean)this.R_3;
    }

    private double y(class04453 class044532) {
        this.NZ();
        return ((class11355)this.W_3).u();
    }

    private boolean y(class07049 class070492) {
        return class070492.method_48155() && class070492.method_66247();
    }

    private class07109 y(class07109 class071092) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return class071092;
        }
        return class04453.N(class071092);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void y(class01683 class016832, class00381 class003812) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && class003812 instanceof class07352) {
            class07352 class073522 = (class07352)class003812;
            try {
                class08687 class086872 = class073522.N();
                this.L(class086872);
                return;
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
        }
        class016832.N(class003812);
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        this.NZ();
        ProtocolVersion protocolVersion = ProtocolTranslator.getTargetVersion();
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_7)) {
            callbackInfoReturnable.setReturnValue((Object)(!(this.method_5624() || !(protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? this.NM() : ((class04474)this.L_1).method_20622()) || !this.p() || this.method_6115() || this.method_74025() || protocolVersion.newerThan(ProtocolVersion.v1_19_3) && this.method_5765() && !this.y(this.method_5854()) || protocolVersion.newerThan(ProtocolVersion.v1_19_3) && this.method_6128() && !this.method_5869() || this.g() && protocolVersion.equals((Object)ProtocolVersion.v1_21_4) && (!this.method_5869() || !protocolVersion.equals((Object)ProtocolVersion.v1_21_4)) || (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_4) || this.method_5799() && !this.method_5869()) && !protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_4)) ? 1 : 0));
        }
    }

    private boolean y(class08687 class086872) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_4) && class086872.y();
    }

    private void y(boolean bl, CallbackInfoReturnable callbackInfoReturnable) {
        class11358 class113582 = class11358.N((int)this.method_31548().N());
        class11938.L().L((Object)class113582);
        if (class113582.y()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void y(CallbackInfo callbackInfo) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            this.R_5 = this.method_5715() && !this.method_6113();
        }
    }

    private boolean E(class04453 class044532) {
        this.NZ();
        if ((class11355)this.W_3 == null) {
            return class044532.method_5624();
        }
        return ((class11355)this.W_3).L();
    }

    private void A() {
        this.NZ();
        class04453 class044532 = this;
        boolean bl = this.E(class044532);
        if (bl != (Boolean)this.R_6) {
            class07363 class073632 = bl ? class07363.field_12981 : class07363.field_12985;
            ((class01683)this.y_0).N((class00381)new class07375((class07049)this, class073632));
            this.R_6 = bl;
        }
    }

    private boolean N(class04474 class044742, Operation operation) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return this.Ny();
        }
        return (Boolean)operation.call(new Object[]{class044742});
    }

    public void N(class07282 class072822) {
        if (class072822 == class07282.field_9219) {
            this.method_18799(this.method_18798().N(class07185.field_11052, ND[4]));
        }
    }

    private void N_45(CallbackInfo callbackInfo, LocalBooleanRef localBooleanRef) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            localBooleanRef.set(!((class04474)this.L_1).field_54155.R() && !this.NM());
        }
    }

    private boolean N(class07209 class072092) {
        class00734 class007342 = this.method_5829();
        class00734 class007343 = new class00734((double)class072092.method_10263(), class007342.y, (double)class072092.method_10260(), (double)class072092.method_10263() + t[0], class007342.i, (double)class072092.method_10260() + t[1]).B(t[2]);
        return this.method_73183().method_39454((class07049)this, class007343);
    }

    public void N(class00329 class003292) {
        this.NZ();
        if (((class01756)this.y_2).y(class003292)) {
            ((class01756)this.y_2).L(class003292);
            ((class01683)this.y_0).N((class00381)new class07337(class003292));
        }
    }

    public void N(float f, float f2) {
        float f3;
        this.NZ();
        if (!this.NB()) {
            return;
        }
        class06889 class068892 = this.method_73189();
        class06889 class068893 = class068892.y((double)f, yK[7], (double)f2);
        class06889 class068894 = new class06889((double)f, H[0], (double)f2);
        float f4 = this.method_6029();
        float f5 = (float)class068894.B();
        if (f5 <= 0.001f) {
            class07109 class071092 = ((class04474)this.L_1).method_3128();
            float f6 = f4 * class071092.z;
            float f7 = f4 * class071092.U;
            f3 = class04995.m((double)(this.method_36454() * ((float)Math.PI / 180)));
            float f8 = class04995.P((double)(this.method_36454() * ((float)Math.PI / 180)));
            class068894 = new class06889((double)(f6 * f8 - f7 * f3), class068894.B, (double)(f7 * f8 + f6 * f3));
            f5 = (float)class068894.B();
            if (f5 <= 0.001f) {
                return;
            }
        }
        float f9 = f5;
        float f10 = this.L(f9);
        class06889 class068895 = class068894.L((double)f10);
        class06889 class068896 = this.method_5663();
        f3 = (float)(class068896.M * class068895.M + class068896.Z * class068895.Z);
        if (f3 < -0.15f) {
            return;
        }
        class06092 class060922 = class06092.N((class07049)this);
        class07209 class072092 = class07209.method_49637((double)this.method_23317(), (double)this.method_5829().i, (double)this.method_23321());
        if (!this.method_73183().method_8320(class072092).y((class07290)this.method_73183(), class072092, class060922).method_1110()) {
            return;
        }
        class072092 = class072092.method_10084();
        if (!this.method_73183().method_8320(class072092).y((class07290)this.method_73183(), class072092, class060922).method_1110()) {
            return;
        }
        float f11 = 7.0f;
        float f12 = 1.2f;
        if (this.method_6059(class07047.B)) {
            f12 += (float)(this.method_6112(class07047.B).i() + 1) * 0.75f;
        }
        float f13 = Math.max(f4 * 7.0f, 1.0f / f10);
        class06889 class068897 = class068892;
        class06889 class068898 = class068893.i(class068895.L((double)f13));
        float f14 = this.method_17681();
        float f15 = this.method_17682();
        class00734 class007342 = new class00734(class068897, class068898.y(H[1], (double)f15, yD[0])).L((double)f14, yD[1], (double)f14);
        class068897 = class068897.y(yD[2], yD[3], yD[4]);
        class068898 = class068898.y(p[0], p[1], p[2]);
        class06889 class068899 = class068895.L(new class06889(p[3], p[4], p[5])).L((double)(f14 * 0.5f));
        class06889 class0688910 = class068897.u(class068899);
        class06889 class0688911 = class068898.u(class068899);
        class06889 class0688912 = class068897.i(class068899);
        class06889 class0688913 = class068898.i(class068899);
        Iterator iterator = StreamSupport.stream(this.method_73183().method_8600((class07049)this, class007342).spliterator(), false).flatMap(class004942 -> class004942.method_1090().stream()).iterator();
        float f16 = Float.MIN_VALUE;
        while (iterator.hasNext()) {
            class00734 class007343 = (class00734)iterator.next();
            if (!class007343.N(class0688910, class0688911) && !class007343.N(class0688912, class0688913)) continue;
            f16 = (float)class007343.i;
            class07209 class072093 = class07209.method_49638((class00737)class007343.R());
            int n = 1;
            while ((float)n < f12) {
                class07209 class072094 = class072093.method_10086(n);
                class00494 class004943 = this.method_73183().method_8320(class072094).y((class07290)this.method_73183(), class072094, class060922);
                if (!class004943.method_1110() && (double)(f16 = (float)class004943.method_1105(class07185.field_11052) + (float)class072094.method_10264()) - this.method_23318() > (double)f12) {
                    return;
                }
                if (n > 1) {
                    class072092 = class072092.method_10084();
                    if (!this.method_73183().method_8320(class072092).y((class07290)this.method_73183(), class072092, class060922).method_1110()) {
                        return;
                    }
                }
                ++n;
            }
            break block0;
        }
        if (f16 == Float.MIN_VALUE) {
            return;
        }
        float f17 = (float)((double)f16 - this.method_23318());
        if (f17 <= 0.5f || f17 > f12) {
            return;
        }
        this.i_5 = 1;
    }

    private void N(CallbackInfo callbackInfo) {
        class11938.L().L((Object)class10957.N());
    }

    private void N(class06889 class068892, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17_1)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void N(double d, double d2, CallbackInfo callbackInfo) {
        class09319 class093192 = class09319.L();
        class11938.L().L((Object)class093192);
        if (class093192.y()) {
            callbackInfo.cancel();
        }
    }

    private boolean N(class04453 class044532) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(class044532);
        if (iBaritone != null && iBaritone.getPathingBehavior().isPathing()) {
            return false;
        }
        return class044532.method_23668();
    }

    private static class07089 N(class07049 class070492, double d, double d2, float f) {
        double d3 = Math.max(d, d2);
        double d4 = class04995.E((double)d3);
        class06889 class068892 = class070492.method_5836(f);
        class07089 class070892 = class070492.method_5745(d3, f, false);
        double d5 = class070892.y().M(class068892);
        if (class070892.N() != class07113.field_1333) {
            d4 = d5;
            d3 = Math.sqrt(d4);
        }
        class06889 class068893 = class070492.method_5828(f);
        class06889 class068894 = class068892.y(class068893.M * d3, class068893.B * d3, class068893.Z * d3);
        float f2 = 1.0f;
        class00734 class007342 = class070492.method_5829().y(class068893.L(d3)).L(k[4], k[5], k[6]);
        class06145 class061452 = class08038.N((class07049)class070492, (class06889)class068892, (class06889)class068894, (class00734)class007342, (Predicate)class04453.NL(), (double)d4);
        if (class061452 != null && class061452.y().M(class068892) < d5) {
            return class04453.N((class07089)class061452, class068892, d2);
        }
        return class04453.N(class070892, class068892, d);
    }

    private boolean N(class04453 class044532, LocalBooleanRef localBooleanRef) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            boolean bl = this.e();
            if (((this.method_5765() ? this.method_5854().method_24828() : this.method_24828()) || this.method_5869()) && localBooleanRef.get() && bl) {
                if ((Integer)this.L_4 <= 0 && !((class05630)((class06202)this.L_3).i_7).k.R()) {
                    this.L_4 = (int)((Integer)((class05630)((class06202)this.L_3).i_7).Nn().method_41753());
                } else {
                    this.method_5728(true);
                }
            }
            if (this.H() && bl && ((class05630)((class06202)this.L_3).i_7).k.R()) {
                this.method_5728(true);
            }
            return false;
        }
        return this.e();
    }

    private void N(class01683 class016832, class00381 class003812) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().newerThan(LegacyProtocolVersion.r1_5_2)) {
            class016832.N(class003812);
            return;
        }
        UserConnection userConnection = ((IConnection)((class01683)this.y_0).M()).viaFabricPlus$getUserConnection();
        userConnection.getChannel().eventLoop().execute(() -> {
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_5_2.MOVE_PLAYER_POS_ROT, (UserConnection)userConnection);
            packetWrapper.write((Type)Types.DOUBLE, (Object)this.method_18798().M);
            packetWrapper.write((Type)Types.DOUBLE, (Object)yG[4]);
            packetWrapper.write((Type)Types.DOUBLE, (Object)yG[5]);
            packetWrapper.write((Type)Types.DOUBLE, (Object)this.method_18798().Z);
            packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(this.method_36454()));
            packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(this.method_36455()));
            packetWrapper.write((Type)Types.BOOLEAN, (Object)this.method_24828());
            packetWrapper.sendToServer(Protocolr1_5_2Tor1_6_1.class);
            ClientVehicleStorage clientVehicleStorage = (ClientVehicleStorage)userConnection.get(ClientVehicleStorage.class);
            if (clientVehicleStorage == null) {
                return;
            }
            PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ServerboundPackets1_20_5.PLAYER_INPUT, (UserConnection)userConnection);
            packetWrapper2.write((Type)Types.FLOAT, (Object)Float.valueOf(clientVehicleStorage.sidewaysMovement()));
            packetWrapper2.write((Type)Types.FLOAT, (Object)Float.valueOf(clientVehicleStorage.forwardMovement()));
            packetWrapper2.write((Type)Types.BYTE, (Object)clientVehicleStorage.flags());
            packetWrapper2.sendToServer(Protocol1_21To1_21_2.class);
        });
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            callbackInfoReturnable.setReturnValue((Object)(!this.method_24828() && !((class04474)this.L_1).field_54155.R() && this.Nu() || !this.method_5799() ? 1 : 0));
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_7)) {
            callbackInfoReturnable.setReturnValue((Object)(this.method_74025() || this.method_5765() && !this.y(this.method_5854()) || !this.method_5799() || !((class04474)this.L_1).method_20622() && !this.method_24828() && !((class04474)this.L_1).field_54155.R() || !this.p() ? 1 : 0));
        }
    }

    public class06889 N() {
        this.NZ();
        return (class06889)this.W_1;
    }

    private boolean N(class08033 class080332) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
        if (iBaritone == null) {
            return class080332.L;
        }
        return !iBaritone.getPathingBehavior().isPathing() && class080332.L;
    }

    private void N(boolean bl, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_9)) {
            callbackInfoReturnable.setReturnValue((Object)(!(this.method_74025() || !this.p() || this.method_5765() && !this.y(this.method_5854()) || !bl && this.method_74016()) ? 1 : 0));
        }
    }

    private boolean N(class04453 class044532, boolean bl) {
        return this.R(bl || ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) && (class044532.method_5681() || class044532.method_24828()));
    }

    private class07109 N(class07109 class071092, float f) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return class071092;
        }
        return class071092.N(f);
    }

    private boolean N(class08687 class086872) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
        if (iBaritone == null) {
            return class086872.M();
        }
        SprintStateEvent sprintStateEvent = new SprintStateEvent();
        iBaritone.getGameEventHandler().onPlayerSprintState(sprintStateEvent);
        if (sprintStateEvent.getState() != null) {
            return sprintStateEvent.getState();
        }
        if (iBaritone != BaritoneAPI.getProvider().getPrimaryBaritone()) {
            return false;
        }
        return class086872.M();
    }

    private class07109 N(class04453 class044532, class07109 class071092) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return class071092;
        }
        return this.u(class071092);
    }

    private double N(double d) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18)) {
            return k[7];
        }
        return class04995.E((double)d);
    }

    private static class07089 N(class07089 class070892, class06889 class068892, double d) {
        if (!class070892.y().N((class00737)class068892, d)) {
            class06889 class068893 = class070892.y();
            class07211 class072112 = class07211.N((double)(class068893.M - class068892.M), (double)(class068893.B - class068892.B), (double)(class068893.Z - class068892.Z));
            return class06183.N((class06889)class068893, (class07211)class072112, (class07209)class07209.method_49638((class00737)class068893));
        }
        return class070892;
    }

    public class07089 N(float f, class07049 class070492) {
        class06543 class065432 = (class06543)this.method_76694().method_58694(class02484.I);
        double d = this.method_55754();
        class07089 class070892 = null;
        if (class065432 != null && (class070892 = class065432.N(class070492, f, class07042.B)) instanceof class06183) {
            class070892 = class04453.N(class070892, class070492.method_5836(f), d);
        }
        if (class070892 == null || class070892.N() == class07113.field_1333) {
            double d2 = this.method_55755();
            class070892 = class04453.N(class070492, d, d2, f);
        }
        return class070892;
    }

    public void N(boolean bl) {
        this.NZ();
        this.W_2 = bl;
    }

    private static class07109 N(class07109 class071092) {
        float f = class071092.y();
        if (f <= 0.0f) {
            return class071092;
        }
        class07109 class071093 = class071092.N(1.0f / f);
        float f2 = class04453.L(class071093);
        float f3 = Math.min(f * f2, 1.0f);
        return class071093.N(f3);
    }

    private void N(double d, double d2) {
        CallbackInfo callbackInfo = new CallbackInfo(s[4], true);
        this.N(d, d2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class07209 class072092 = class07209.method_49637((double)d, (double)this.method_23318(), (double)d2);
        if (!this.N(class072092)) {
            return;
        }
        double d3 = d - (double)class072092.method_10263();
        double d4 = d2 - (double)class072092.method_10260();
        class07211 class072112 = null;
        double d5 = yM[6];
        for (class07211 class072113 : new class06889[]{class07211.field_11039, class07211.field_11034, class07211.field_11043, class07211.field_11035}) {
            double d6;
            double d7 = class072113.z().N(d3, Ly[0], d4);
            double d8 = d6 = class072113.i() == class07212.field_11056 ? Ly[1] - d7 : d7;
            if (!(d6 < d5) || this.N(class072092.method_10093(class072113))) continue;
            d5 = d6;
            class072112 = class072113;
        }
        if (class072112 != null) {
            class06889 class068892 = this.method_18798();
            if (class072112.z() == class07185.field_11048) {
                this.method_18800(Ly[2] * (double)class072112.P(), class068892.B, class068892.Z);
            } else {
                this.method_18800(class068892.M, class068892.B, Ly[3] * (double)class072112.T());
            }
        }
    }

    private void N(class07049 class070492, boolean bl, boolean bl2, CallbackInfoReturnable callbackInfoReturnable) {
        if (callbackInfoReturnable.getReturnValueZ() && class070492 instanceof class07487 && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18)) {
            this.field_5982 = class070492.method_36454();
            this.method_36456(class070492.method_36454());
            this.method_5847(class070492.method_36454());
        }
    }

    private void N(class06202 class062022, class03448 class034482, class01683 class016832, class01205 class012052, class01756 class017562, class08687 class086872, boolean bl, CallbackInfo callbackInfo) {
        this.NZ();
        this.W_6 = class086872.R();
    }

    public void N(float f, int n, int n2) {
        if (f != ((class08036)this).fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue()) {
            this.f();
        }
        ((class08036)this).fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = Float.valueOf(f);
        ((class08036)this).fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = n;
        ((class08036)this).fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = n2;
    }

    public void N(class08152 class081522) {
        this.NZ();
        this.M_0 = class081522;
    }

    public void N(class06889 class068892) {
        this.NZ();
        this.W_1 = class068892;
    }

    private float W(class04453 class044532) {
        this.NZ();
        return ((class11394)this.W_4).N();
    }

    private boolean R(boolean bl) {
        class04453 class044532;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(V[1], true);
        this.N(bl, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return !this.method_74025() && (this.method_5765() ? this.y(this.method_5854()) : this.R(class044532 = this)) && (bl || !this.method_74016());
    }

    public boolean R() {
        this.NZ();
        return (Boolean)this.W_2;
    }

    private boolean R(class04453 class044532) {
        class10947 class109472 = class10947.N();
        class11938.L().L((Object)class109472);
        if (class109472.y()) {
            return true;
        }
        return class044532.method_76458();
    }

    private void R(CallbackInfo callbackInfo) {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_9, ProtocolVersion.v1_14_4) && ((class04474)this.L_1).field_54155.R()) {
            float f = (float)((double)((class04474)this.L_1).field_55868.z / yG[1]);
            float f2 = (float)((double)((class04474)this.L_1).field_55868.U / yG[2]);
            ((class04474)this.L_1).field_55868 = new class07109(f, f2);
        }
    }

    private boolean Ni() {
        this.NZ();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(s[6], true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return !this.R(true) || !this.method_5799() || !((class04474)this.L_1).method_20622() && !this.method_24828() && !((class04474)this.L_1).field_54155.R();
    }

    public class01205 O() {
        this.NZ();
        return (class01205)this.y_1;
    }

    private boolean Nu() {
        this.NZ();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_1)) {
            return !(((class04474)this.L_1).field_55868.U >= 0.8f) || !this.p();
        }
        return !((class04474)this.L_1).method_20622() || !this.p();
    }

    private boolean H() {
        return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) || !this.method_5799() || this.method_5869();
    }

    public @Nullable class07431 G() {
        class07431 class074312;
        class07049 class070492 = this.method_49694();
        return class070492 instanceof class07431 && (class074312 = (class07431)class070492).m() ? class074312 : null;
    }

    private void NZ() {
        if (!this.M_init) {
            this.M_init = true;
            this.M_1 = yG[6];
            this.M_2 = NG[0];
        }
        if (!this.R_init) {
            this.R_init = true;
            this.R_0 = NG[1];
            this.R_1 = Float.valueOf(0.0f);
            this.R_2 = Float.valueOf(0.0f);
            this.R_3 = false;
            this.R_4 = false;
            this.R_5 = false;
            this.R_6 = false;
            this.R_7 = 0;
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = false;
            this.L_4 = 0;
            this.L_5 = 0;
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_0 = Float.valueOf(0.0f);
            this.u_1 = Float.valueOf(0.0f);
            this.u_2 = Float.valueOf(0.0f);
        }
        if (!this.B_init) {
            this.B_init = true;
            this.B_0 = Float.valueOf(0.0f);
            this.B_1 = 0;
            this.B_2 = Float.valueOf(0.0f);
            this.B_3 = Float.valueOf(0.0f);
        }
        if (!this.i_init) {
            this.i_init = true;
            this.i_0 = Float.valueOf(0.0f);
            this.i_1 = false;
            this.i_3 = false;
            this.i_4 = false;
            this.i_5 = 0;
            this.i_6 = false;
        }
        if (!this.m_init) {
            this.m_init = true;
            this.m_0 = 0;
            this.m_1 = false;
        }
        if (!this.W_init) {
            this.W_init = true;
            this.W_0 = false;
            this.W_2 = false;
            this.W_6 = false;
        }
    }

    private static MethodHandle NR() {
        try {
            MethodHandles.Lookup lookup = MethodHandles.publicLookup();
            return lookup.findVirtual(class04453.class, V[3], MethodType.methodType(Boolean.TYPE));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    public float Y() {
        return ((class08153)((class07438)this).fields_9212a028292fd3c078969e3ee4c71d9e8_0.a_(class02484.M, (Object)class08153.N)).L();
    }

    private boolean NB() {
        this.NZ();
        return this.d() && (Integer)this.i_5 <= 0 && this.method_24828() && !this.method_21825() && !this.method_5765() && this.k() && (double)this.method_23313() >= ND[3];
    }

    public void method_7353(class00392 class003922, boolean bl) {
        this.NZ();
        ((class06202)this.L_3).N().N(class003922, bl);
    }

    private static Predicate NL() {
        return class070492 -> {
            if (class07042.B.test(class070492)) {
                class11357 class113572 = class11357.N((class07049)class070492);
                class11938.L().L((Object)class113572);
                return !class113572.y();
            }
            return false;
        };
    }

    private static void NN() {
        yM = new double[7];
        class04453.yM[0] = Double.longBitsToDouble(0L);
        class04453.yM[1] = Double.longBitsToDouble(0L);
        class04453.yM[2] = Double.longBitsToDouble(0L);
        class04453.yM[3] = Double.longBitsToDouble(4551510721646314285L);
        class04453.yM[4] = Double.longBitsToDouble(0L);
        class04453.yM[5] = Double.longBitsToDouble(0L);
        class04453.yM[6] = Double.longBitsToDouble(0x7FEFFFFFFFFFFFFFL);
        Ly = new double[4];
        class04453.Ly[0] = Double.longBitsToDouble(0L);
        class04453.Ly[1] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.Ly[2] = Double.longBitsToDouble(4591870180066957722L);
        class04453.Ly[3] = Double.longBitsToDouble(4591870180066957722L);
        t = new double[7];
        class04453.t[0] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.t[1] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.t[2] = Double.longBitsToDouble(4502148214488346440L);
        class04453.t[3] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.t[4] = Double.longBitsToDouble(4599976659396224614L);
        class04453.t[5] = Double.longBitsToDouble(4599976659396224614L);
        class04453.t[6] = Double.longBitsToDouble(4599976659396224614L);
        yK = new double[8];
        class04453.yK[0] = Double.longBitsToDouble(4599976659396224614L);
        class04453.yK[1] = Double.longBitsToDouble(4599976659396224614L);
        class04453.yK[2] = Double.longBitsToDouble(4599976659396224614L);
        class04453.yK[3] = Double.longBitsToDouble(4599976659396224614L);
        class04453.yK[4] = Double.longBitsToDouble(4599976659396224614L);
        class04453.yK[5] = Double.longBitsToDouble(0L);
        class04453.yK[6] = Double.longBitsToDouble(0L);
        class04453.yK[7] = Double.longBitsToDouble(0L);
        H = new double[2];
        class04453.H[0] = Double.longBitsToDouble(0L);
        class04453.H[1] = Double.longBitsToDouble(0L);
        yD = new double[5];
        class04453.yD[0] = Double.longBitsToDouble(0L);
        class04453.yD[1] = Double.longBitsToDouble(0L);
        class04453.yD[2] = Double.longBitsToDouble(0L);
        class04453.yD[3] = Double.longBitsToDouble(4602768891079294976L);
        class04453.yD[4] = Double.longBitsToDouble(0L);
        p = new double[6];
        class04453.p[0] = Double.longBitsToDouble(0L);
        class04453.p[1] = Double.longBitsToDouble(4602768891079294976L);
        class04453.p[2] = Double.longBitsToDouble(0L);
        class04453.p[3] = Double.longBitsToDouble(0L);
        class04453.p[4] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.p[5] = Double.longBitsToDouble(0L);
        ND = new double[6];
        class04453.ND[0] = Double.longBitsToDouble(4532020583461814272L);
        class04453.ND[1] = Double.longBitsToDouble(4532020583461814272L);
        class04453.ND[2] = Double.longBitsToDouble(4594198589319675904L);
        class04453.ND[3] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.ND[4] = Double.longBitsToDouble(0L);
        class04453.ND[5] = Double.longBitsToDouble(-4616189618054758400L);
        k = new double[8];
        class04453.k[0] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.k[1] = Double.longBitsToDouble(4600697235336603894L);
        class04453.k[2] = Double.longBitsToDouble(-4619792497756654797L);
        class04453.k[3] = Double.longBitsToDouble(0x3FD3333333333333L);
        class04453.k[4] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.k[5] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.k[6] = Double.longBitsToDouble(0x3FF0000000000000L);
        class04453.k[7] = Double.longBitsToDouble(4561440258104740754L);
        yG = new double[7];
        class04453.yG[0] = Double.longBitsToDouble(4605380978949069210L);
        class04453.yG[1] = Double.longBitsToDouble(0x3FD3333333333333L);
        class04453.yG[2] = Double.longBitsToDouble(0x3FD3333333333333L);
        class04453.yG[3] = Double.longBitsToDouble(4605380978949069210L);
        class04453.yG[4] = Double.longBitsToDouble(-4571373524106608640L);
        class04453.yG[5] = Double.longBitsToDouble(-4571373524106608640L);
        class04453.yG[6] = Double.longBitsToDouble(0L);
        NG = new double[4];
        class04453.NG[0] = Double.longBitsToDouble(0L);
        class04453.NG[1] = Double.longBitsToDouble(0L);
        class04453.NG[2] = Double.longBitsToDouble(4599976659396224614L);
        class04453.NG[3] = Double.longBitsToDouble(4594198589319675904L);
    }

    private boolean NM() {
        this.NZ();
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_1) && this.method_5869() ? ((class04474)this.L_1).method_20622() : (double)((class04474)this.L_1).field_55868.U >= yG[3];
    }

    private boolean Ny() {
        this.NZ();
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_1) && this.method_5869() ? ((class04474)this.L_1).method_20622() : (double)((class04474)this.L_1).field_55868.U >= yG[0];
    }

    public void method_7323(class00402 class004022) {
        this.NZ();
        ((class06202)this.L_3).N((class05096)new class05995(class004022));
    }

    public void method_71753(class03556<class09037> class035562) {
        this.NZ();
        ((class01683)this.y_0).N(class035562, (class05096)((class06202)this.L_3).v_3);
    }

    public void method_7311(class07267 class072672, boolean bl) {
        this.NZ();
        if (class072672 instanceof class03786) {
            class03786 class037862 = (class03786)class072672;
            ((class06202)this.L_3).N((class05096)new class03777((class07267)class037862, bl, ((class06202)this.L_3).yi()));
        } else {
            ((class06202)this.L_3).N((class05096)new class01337(class072672, bl, ((class06202)this.L_3).yi()));
        }
    }

    public void method_7355() {
        this.NZ();
        ((class01683)this.y_0).N((class00381)new class07343(this.method_31549()));
    }

    public void method_7315(class06584 class065842, class07050 class070502) {
        this.NZ();
        class02699 class026992 = (class02699)class065842.method_58694(class02484.Ny);
        if (class026992 != null) {
            ((class06202)this.L_3).N((class05096)new class05884((class08036)this, class065842, class070502, class026992));
        }
    }

    public void method_6104(class07050 class070502) {
        this.NZ();
        super.method_6104(class070502);
        ((class01683)this.y_0).N((class00381)new class07831(class070502));
    }

    public void method_66282() {
        this.NZ();
        if (this.J()) {
            class07109 class071092 = ((class04474)this.L_1).method_3128();
            class04453 class044532 = this;
            class07109 class071093 = this.N(class044532, class071092);
            float f = class071093.z;
            this.u((CallbackInfo)null);
            ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f);
            ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(class071093.U);
            ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_4 = ((class04474)this.L_1).field_54155.i();
            this.u_2 = Float.valueOf(((Float)this.u_0).floatValue());
            this.B_0 = Float.valueOf(((Float)this.u_1).floatValue());
            class044532 = this;
            this.u_1 = Float.valueOf(((Float)this.u_1).floatValue() + (this.W(class044532) - ((Float)this.u_1).floatValue()) * 0.5f);
            class044532 = this;
            this.u_0 = Float.valueOf(((Float)this.u_0).floatValue() + (this.M(class044532) - ((Float)this.u_0).floatValue()) * 0.5f);
        } else {
            super.method_66282();
        }
    }

    public boolean method_6115() {
        this.NZ();
        return (Boolean)this.i_1;
    }

    public boolean method_21754() {
        return !this.method_31549().y && super.method_21754();
    }

    public void method_6007() {
        class07431 class074312;
        int n;
        this.NZ();
        LocalBooleanRefImpl localBooleanRefImpl = new LocalBooleanRefImpl();
        localBooleanRefImpl.init(false);
        this.N_45(null, (LocalBooleanRef)localBooleanRefImpl);
        if ((Integer)this.L_4 > 0) {
            this.L_4 = (Integer)this.L_4 - 1;
        }
        if (!((class05096)((class06202)this.L_3).v_3 instanceof class05850)) {
            this.B(this.b() == class02244.field_52061);
            this.method_5760();
        }
        boolean bl = ((class04474)this.L_1).field_54155.i();
        boolean bl2 = ((class04474)this.L_1).field_54155.R();
        Object object = (class04474)this.L_1;
        boolean bl3 = this.N((class04474)object, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)V[4]);
            return ((class04474)objectArray[0]).method_20622();
        });
        class08033 class080332 = this.method_31549();
        this.R_5 = !class080332.y && !this.i((class04453)((Object)(object = this))) && !this.b((class04453)((Object)(object = this))) && this.method_52558(class01312.field_18081) && (this.method_5715() || !this.method_6113() && !this.method_52558(class01312.field_18076));
        class04474 class044742 = (class04474)this.L_1;
        this.y((CallbackInfo)null);
        class044742.method_3129();
        ((class06202)this.L_3).yT().N((class04474)this.L_1);
        this.L((CallbackInfo)null);
        boolean bl4 = false;
        if ((Integer)this.i_5 > 0) {
            this.i_5 = (Integer)this.i_5 - 1;
            bl4 = true;
            ((class04474)this.L_1).method_64054();
        }
        if (!this.field_5960) {
            this.N(this.method_23317() - (double)this.method_17681() * t[4], this.method_23321() + (double)this.method_17681() * t[5]);
            this.N(this.method_23317() - (double)this.method_17681() * t[6], this.method_23321() - (double)this.method_17681() * yK[0]);
            this.N(this.method_23317() + (double)this.method_17681() * yK[1], this.method_23321() - (double)this.method_17681() * yK[2]);
            this.N(this.method_23317() + (double)this.method_17681() * yK[3], this.method_23321() + (double)this.method_17681() * yK[4]);
        }
        if (bl2 || this.x() && !this.method_5765() || this.y((class08687)(object = ((class04474)this.L_1).field_54155))) {
            this.L_4 = 0;
        }
        if (this.N((class04453)((Object)(object = this)), (LocalBooleanRef)localBooleanRefImpl)) {
            if (!bl3) {
                if ((Integer)this.L_4 > 0) {
                    this.method_5728(true);
                } else {
                    this.L_4 = (int)((Integer)((class05630)((class06202)this.L_3).i_7).Nn().method_41753());
                }
            }
            if (this.N((class08687)(object = ((class04474)this.L_1).field_54155))) {
                this.method_5728(true);
            }
        }
        if (this.method_5624()) {
            if (this.method_5681()) {
                if (this.Ni()) {
                    this.method_5728(false);
                }
            } else {
                object = this;
                if (this.T((class04453)((Object)object))) {
                    this.method_5728(false);
                }
            }
        }
        boolean bl5 = false;
        if (this.N(class080332)) {
            if (((class03443)((class06202)this.L_3).T_2).Z()) {
                if (!class080332.y) {
                    class080332.y = true;
                    bl5 = true;
                    this.method_7355();
                }
            } else if (!bl && ((class04474)this.L_1).field_54155.i() && !bl4) {
                if (((class08036)this).fields_17fa3311b0e9d3e9b883d09222919bf5a_1 == 0) {
                    ((class08036)this).fields_17fa3311b0e9d3e9b883d09222919bf5a_1 = 7;
                } else if (!(this.method_5681() || this.method_5854() != null && this.G() == null)) {
                    boolean bl6 = class080332.y = !class080332.y;
                    if (class080332.y && this.method_24828() && this.B((class04453)((Object)(object = this)))) {
                        object.method_6043();
                    }
                    bl5 = true;
                    this.method_7355();
                    ((class08036)this).fields_17fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
                }
            }
        }
        if (((class04474)this.L_1).field_54155.i() && !bl5 && !bl && !this.M(this.method_6101()) && this.N((class04453)((Object)(object = this)))) {
            ((class01683)this.y_0).N((class00381)new class07375((class07049)this, class07363.field_12982));
        }
        this.i_6 = this.method_6128();
        object = this;
        if (this.m((class04453)((Object)object)) && ((class04474)this.L_1).field_54155.R() && this.method_29920()) {
            this.method_6093();
        }
        if (this.method_5777(class01231.N)) {
            n = this.method_7325() ? 10 : 1;
            this.m_0 = class04995.N((int)((Integer)this.m_0 + n), (int)0, (int)600);
        } else if ((Integer)this.m_0 > 0) {
            this.method_5777(class01231.N);
            this.m_0 = class04995.N((int)((Integer)this.m_0 - 10), (int)0, (int)600);
        }
        if (class080332.y && this.J()) {
            n = 0;
            class08687 class086872 = ((class04474)this.L_1).field_54155;
            this.R((CallbackInfo)null);
            if (class086872.R()) {
                --n;
            }
            if (((class04474)this.L_1).field_54155.i()) {
                ++n;
            }
            if (n != 0) {
                this.method_18799(this.method_18798().y(yK[5], (double)((float)n * class080332.N() * 3.0f), yK[6]));
            }
        }
        if ((class074312 = this.G()) != null && class074312.n() == 0) {
            if ((Integer)this.B_1 < 0) {
                this.B_1 = (Integer)this.B_1 + 1;
                if ((Integer)this.B_1 == 0) {
                    this.B_2 = Float.valueOf(0.0f);
                }
            }
            if (bl && !((class04474)this.L_1).field_54155.i()) {
                this.B_1 = -10;
                class074312.N(class04995.y((float)(this.P() * 100.0f)));
                this.v();
            } else if (!bl && ((class04474)this.L_1).field_54155.i()) {
                this.B_1 = 0;
                this.B_2 = Float.valueOf(0.0f);
            } else if (bl) {
                this.B_1 = (Integer)this.B_1 + 1;
                this.B_2 = (Integer)this.B_1 < 10 ? Float.valueOf((float)((Integer)this.B_1).intValue() * 0.1f) : Float.valueOf(0.8f + 2.0f / (float)((Integer)this.B_1 - 9) * 0.1f);
            }
        } else {
            this.B_2 = Float.valueOf(0.0f);
        }
        super.method_6007();
        if (this.method_24828() && class080332.y && !((class03443)((class06202)this.L_3).T_2).Z()) {
            class080332.y = false;
            this.method_7355();
        }
    }

    public void method_6025(float f) {
    }

    public void method_6019(class07050 class070502) {
        this.NZ();
        if (this.method_5998(class070502).R() || this.method_6115()) {
            return;
        }
        super.method_6019(class070502);
        this.i_1 = true;
        this.i_2 = class070502;
    }

    public class07050 method_6058() {
        this.NZ();
        return Objects.requireNonNullElse((class07050)this.i_2, class07050.field_5808);
    }

    public void method_6021() {
        this.NZ();
        super.method_6021();
        this.i_1 = false;
    }

    public void method_6108() {
        ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 = ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 + 1;
        if (((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 == 20) {
            this.method_5650(class07062.field_26998);
        }
    }

    public void method_7346() {
        this.NZ();
        ((class01683)this.y_0).N((class00381)new class00543(((class07482)((class08036)this).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b));
        this.t();
    }

    public void method_7277(class07049 class070492) {
        this.NZ();
        ((class04410)((class06202)this.L_3).i_0).N(class070492, (class07126)class07107.M);
    }

    public class08152 method_75004() {
        this.NZ();
        return (class08152)this.M_0;
    }

    public void method_7304(class07049 class070492) {
        this.NZ();
        ((class04410)((class06202)this.L_3).i_0).N(class070492, (class07126)class07107.j);
    }

    public boolean method_33793() {
        this.NZ();
        return ((class06202)this.L_3).yi();
    }

    public boolean method_61498() {
        this.NZ();
        return (Boolean)((class05630)((class06202)this.L_3).i_7).C().method_41753();
    }

    public void method_33592(class06584 class065842, class06584 class065843, class05442 class054422) {
        this.NZ();
        ((class06202)this.L_3).yT().N(class065842, class065843, class054422);
    }

    public void method_7268(boolean bl) {
        this.NZ();
        super.method_7268(bl);
        ((class05731)((class06202)this.L_3).L_0).i();
    }

    public void method_7257(class07480 class074802) {
        this.NZ();
        ((class06202)this.L_3).N((class05096)new class01352(class074802));
    }

    public void method_66695(class08594 class085942) {
        this.NZ();
        ((class06202)this.L_3).N((class05096)new class00197(class085942));
    }

    public boolean method_64271() {
        this.NZ();
        return ((class08722)this.y_3).L();
    }

    public void method_7303(class07253 class072532) {
        this.NZ();
        ((class06202)this.L_3).N((class05096)new class01359(class072532));
    }

    public void method_61499(class06584 class065842) {
        this.NZ();
        ((class03443)((class06202)this.L_3).T_2).N(class065842);
    }

    public void method_16354(class04858 class048582) {
        this.NZ();
        ((class06202)this.L_3).N((class05096)new class06087(class048582));
    }

    public boolean method_7295() {
        this.NZ();
        boolean bl = ((class08036)this).fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
        boolean bl2 = super.method_7295();
        if (this.method_7325()) {
            return ((class08036)this).fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
        }
        if (!bl && bl2) {
            this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.l, class04911.field_15256, 1.0f, 1.0f, false);
            ((class06202)this.L_3).Nr().N((class00044)new class09052(this));
        }
        if (bl && !bl2) {
            this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.d, class04911.field_15256, 1.0f, 1.0f, false);
        }
        return ((class08036)this).fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
    }

    public void method_66696(class08610 class086102) {
        this.NZ();
        ((class06202)this.L_3).N((class05096)new class00231(class086102));
    }

    public boolean method_7340() {
        return true;
    }

    public float getCurrentConstantMood() {
        this.NZ();
        for (class00169 class001692 : (List)this.y_4) {
            if (!(class001692 instanceof class05397)) continue;
            return ((BiomeAmbienceInterface)class001692).getConstantMood();
        }
        return 0.0f;
    }
}


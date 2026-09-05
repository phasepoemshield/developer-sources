/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09355
 *  Nursultan.class10950
 *  Nursultan.class11373
 *  Nursultan.class11375
 *  Nursultan.class11382
 *  Nursultan.class11393
 *  Nursultan.class11799
 *  Nursultan.class11938
 *  baritone.utils.accessor.IPlayerControllerMP
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Shorts
 *  com.google.common.primitives.SignedBytes
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.features.interaction.r1_18_2_block_ack_emulation.ClientPlayerInteractionManager1_18_2
 *  com.viaversion.viafabricplus.features.interaction.replace_block_placement_logic.ActionResultException1_12_2
 *  com.viaversion.viafabricplus.injection.access.interaction.container_clicking.IAbstractContainerMenu
 *  com.viaversion.viafabricplus.injection.access.interaction.r1_18_2_block_ack_emulation.IMultiPlayerGameMode
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusHandItemProvider
 *  com.viaversion.viafabricplus.protocoltranslator.translator.ItemTranslator
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00147
 *  minecraft.class00176
 *  minecraft.class00285
 *  minecraft.class00328
 *  minecraft.class00329
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class00539
 *  minecraft.class00546
 *  minecraft.class00556
 *  minecraft.class00564
 *  minecraft.class00743
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01137
 *  minecraft.class01205
 *  minecraft.class01463
 *  minecraft.class01488
 *  minecraft.class01683
 *  minecraft.class01735
 *  minecraft.class01756
 *  minecraft.class01909
 *  minecraft.class01924
 *  minecraft.class03969
 *  minecraft.class04453
 *  minecraft.class04688
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06501
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06918
 *  minecraft.class06937
 *  minecraft.class06942
 *  minecraft.class06999
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07087
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07282
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07335
 *  minecraft.class07346
 *  minecraft.class07356
 *  minecraft.class07364
 *  minecraft.class07378
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class07529
 *  minecraft.class07752
 *  minecraft.class07828
 *  minecraft.class07843
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08172
 *  minecraft.class08687
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.client.player.ClientPlayerBlockBreakEvents
 *  net.fabricmc.fabric.api.event.client.player.ClientPlayerBlockBreakEvents$After
 *  net.fabricmc.fabric.api.event.player.AttackBlockCallback
 *  net.fabricmc.fabric.api.event.player.AttackEntityCallback
 *  net.fabricmc.fabric.api.event.player.UseBlockCallback
 *  net.fabricmc.fabric.api.event.player.UseItemCallback
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.synthetic.args.ArgsN5
 */
package minecraft;

import Nursultan.class09355;
import Nursultan.class10950;
import Nursultan.class11373;
import Nursultan.class11375;
import Nursultan.class11382;
import Nursultan.class11393;
import Nursultan.class11799;
import Nursultan.class11938;
import baritone.utils.accessor.IPlayerControllerMP;
import com.google.common.collect.Lists;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.features.interaction.r1_18_2_block_ack_emulation.ClientPlayerInteractionManager1_18_2;
import com.viaversion.viafabricplus.features.interaction.replace_block_placement_logic.ActionResultException1_12_2;
import com.viaversion.viafabricplus.injection.access.interaction.container_clicking.IAbstractContainerMenu;
import com.viaversion.viafabricplus.injection.access.interaction.r1_18_2_block_ack_emulation.IMultiPlayerGameMode;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusHandItemProvider;
import com.viaversion.viafabricplus.protocoltranslator.translator.ItemTranslator;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00147;
import minecraft.class00176;
import minecraft.class00285;
import minecraft.class00328;
import minecraft.class00329;
import minecraft.class00381;
import minecraft.class00500;
import minecraft.class00539;
import minecraft.class00546;
import minecraft.class00556;
import minecraft.class00564;
import minecraft.class00743;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01137;
import minecraft.class01205;
import minecraft.class01463;
import minecraft.class01488;
import minecraft.class01683;
import minecraft.class01735;
import minecraft.class01756;
import minecraft.class01909;
import minecraft.class01924;
import minecraft.class03448;
import minecraft.class03969;
import minecraft.class04453;
import minecraft.class04688;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06501;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06937;
import minecraft.class06942;
import minecraft.class06999;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07087;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07282;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07335;
import minecraft.class07346;
import minecraft.class07356;
import minecraft.class07364;
import minecraft.class07378;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class07529;
import minecraft.class07752;
import minecraft.class07828;
import minecraft.class07843;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08172;
import minecraft.class08687;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.client.player.ClientPlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.synthetic.args.ArgsN5;

@Environment(value=EnvType.CLIENT)
public class class03443
implements class11799,
IPlayerControllerMP,
IMultiPlayerGameMode {
    private static final Logger u = LogUtils.getLogger();
    private final class06202 i;
    private final class01683 R;
    private class07209 M;
    private class06584 B;
    public float N;
    private float Z;
    public int y;
    public boolean L;
    private class07282 z;
    private @Nullable class07282 U;
    private int E;
    private int W;
    private class11375 m;
    private class06584 P;
    private List s;
    private final ClientPlayerInteractionManager1_18_2 T = new ClientPlayerInteractionManager1_18_2();

    private boolean L(class07209 class072092, class07211 class072112) {
        if (((class03448)((Object)this.i.T_3)).method_8320(class072092 = class072092.method_10093(class072112)).i() == class00869.Lc) {
            ((class03448)((Object)this.i.T_3)).method_8444((class07049)((class04453)this.i.T_4), 1009, class072092, 0);
            ((class03448)((Object)this.i.T_3)).method_8650(class072092, false);
            return true;
        }
        return false;
    }

    private void L(class04453 class044532, class07050 class070502, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            class06501 class065012;
            class00500 class005002;
            class06584 class065842 = class044532.method_5998(class070502);
            class06183 class061833 = class061832;
            if (class065842.B() instanceof class06918) {
                class06942 class069422;
                class005002 = ((class03448)((Object)this.i.T_3)).method_8320(class061832.u());
                if (class005002.i().equals(class00869.is) && (Integer)class005002.L((class08092)class06999.L) == 1) {
                    class061833 = class061832.N(class07211.field_11036);
                }
                if (!(class069422 = new class06942(class065012 = new class06501((class08036)class044532, class070502, class061833))).N() || ((class06918)class069422.method_8041().B()).u(class069422) == null) {
                    throw new ActionResultException1_12_2((class07082)class07082.i);
                }
            }
            this.R.N((class00381)new class07828(class070502, class061832, 0));
            if (class065842.R()) {
                throw new ActionResultException1_12_2((class07082)class07082.i);
            }
            class005002 = new class06501((class08036)class044532, class070502, class061833);
            if (this.z.R()) {
                int n = class065842.c();
                class065012 = class065842.N((class06501)class005002);
                class065842.i(n);
            } else {
                class065012 = class065842.N((class06501)class005002);
            }
            if (!class065012.N()) {
                class065012 = class07082.i;
            }
            throw new ActionResultException1_12_2((class07082)class065012);
        }
    }

    private void L(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_17, ProtocolVersion.v1_20_5)) {
            this.R.N((class00381)new class00564(class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class080362.method_36454(), class080362.method_36455(), class080362.method_24828(), class080362.field_5976));
        }
    }

    public void L() {
        block4: {
            if (!this.N(this)) break block4;
            class00500 class005002 = ((class03448)((Object)this.i.T_3)).method_8320(this.M);
            this.i.yT().N((class03448)((Object)this.i.T_3), this.M, class005002, -1.0f);
            if (class07529.C) {
                u.info("Stop dest {} {}", (Object)this.M, (Object)class005002);
            }
            class07364 class073642 = this.N(class07356.field_12971, this.M, class07211.field_11033);
            if (class073642 == null) {
                throw new NullPointerException("@Redirect constructor handler net/minecraft/class_636::trackPlayerAction returned null for net.minecraft.class_2846");
            }
            class01683 class016832 = this.R;
            class07364 class073643 = class073642;
            if (this.y(class016832, (class00381)class073643)) {
                class016832.N((class00381)class073643);
            }
            this.L = false;
            this.N = 0.0f;
            ((class03448)((Object)this.i.T_3)).method_8517(((class04453)this.i.T_4).method_5628(), this.M, -1);
            class016832 = (class04453)this.i.T_4;
            if (this.N((class04453)class016832)) {
                class016832.method_7350();
            }
        }
    }

    private void L(class07209 class072092, class07211 class072112, CallbackInfoReturnable callbackInfoReturnable) {
        class07082 class070822 = ((AttackBlockCallback)AttackBlockCallback.EVENT.invoker()).interact((class08036)((class04453)this.i.T_4), (class07299)((class03448)((Object)this.i.T_3)), class07050.field_5808, class072092, class072112);
        if (class070822 != class07082.i) {
            callbackInfoReturnable.setReturnValue((Object)(class070822 == class07082.N ? 1 : 0));
            if (class070822.N()) {
                this.N((class03448)((Object)this.i.T_3), n -> new class07364(class07356.field_12968, class072092, class072112, n));
            }
        }
    }

    private void L(class08036 class080362, class07049 class070492, CallbackInfo callbackInfo) {
        class11373 class113732 = class11373.N((class07049)class070492);
        class11938.L().L((Object)class113732);
    }

    public boolean M() {
        return !this.z.R();
    }

    public class11375 P() {
        return this.m;
    }

    public class03443(class06202 class062022, class01683 class016832) {
        this.M = new class07209(-1, -1, -1);
        this.B = class06584.E;
        this.z = class07282.field_28045;
        this.i = class062022;
        this.R = class016832;
    }

    public boolean B() {
        return ((class04453)this.i.T_4).method_5765() && ((class04453)this.i.T_4).method_5854() instanceof class03969;
    }

    public boolean Z() {
        return this.z == class07282.field_9219;
    }

    private void i(class07209 class072092, class07211 class072112, CallbackInfoReturnable callbackInfoReturnable) {
        class09355 class093552 = class09355.N((class07209)class072092, (class07211)class072112);
        class11938.L().L((Object)class093552);
        if (class093552.y()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    public final void i() {
        int n = ((class04453)this.i.T_4).method_31548().N();
        if (n != this.E) {
            this.E = n;
            this.R.N((class00381)new class07335(this.E));
        }
    }

    private class07041 s() {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            return class07082.N;
        }
        return class07082.L;
    }

    public class06202 m() {
        return this.i;
    }

    public class07282 U() {
        return this.z;
    }

    public @Nullable class07282 z() {
        return this.U;
    }

    public void u() {
        this.N((CallbackInfo)null);
        this.i();
        if (this.R.M().method_10758()) {
            this.R.M().method_10754();
        } else {
            this.R.M().method_10768();
        }
    }

    private void u(class04453 class044532, class07050 class070502, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && !class07050.field_5808.equals((Object)class070502)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }

    private void u(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && !class07050.field_5808.equals((Object)class070502)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }

    private void u(class07209 class072092, class07211 class072112, CallbackInfoReturnable callbackInfoReturnable) {
        class09355 class093552 = class09355.N((class07209)class072092, (class07211)class072112);
        class11938.L().L((Object)class093552);
        if (class093552.y()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    public boolean y(class07209 class072092, class07211 class072112) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.i(class072092, class072112, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        this.i();
        if (this.y > 0) {
            --this.y;
            return true;
        }
        class04453 class044532 = (class04453)this.i.T_4;
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        this.y(class072092, class072112, callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return callbackInfoReturnable2.getReturnValueZ();
        }
        if (class044532.method_31549().u && ((class03448)((Object)this.i.T_3)).method_8621().N(class072092)) {
            this.y = 5;
            class00500 class005002 = ((class03448)((Object)this.i.T_3)).method_8320(class072092);
            this.i.yT().N((class03448)((Object)this.i.T_3), class072092, class005002, 1.0f);
            if (class07529.C) {
                u.info("Creative cont {} {}", (Object)class072092, (Object)class005002);
            }
            this.N((class03448)((Object)this.i.T_3), n -> {
                class07209 class072093 = class072092;
                class03443 class034432 = this;
                LocalRefImpl localRefImpl = new LocalRefImpl();
                localRefImpl.init((Object)class072112);
                this.N(class034432, class072093, (LocalRef)localRefImpl);
                class072112 = (class07211)localRefImpl.dispose();
                return new class07364(class07356.field_12968, class072092, class072112, n);
            });
            return true;
        }
        if (this.y(class072092)) {
            class00500 class005003 = ((class03448)((Object)this.i.T_3)).method_8320(class072092);
            if (class005003.P()) {
                this.L = false;
                return false;
            }
            this.N += class005003.N((class08036)((class04453)this.i.T_4), (class07290)((class04453)this.i.T_4).method_73183(), class072092);
            if (this.Z % 4.0f == 0.0f) {
                class07752 class077522 = class005003.O();
                this.i.Nr().N((class00044)new class00040(class077522.R(), class04911.field_15245, (class077522.N() + 1.0f) / 8.0f, class077522.y() * 0.5f, class00044.v(), class072092));
            }
            this.Z += 1.0f;
            this.i.yT().N((class03448)((Object)this.i.T_3), class072092, class005003, class04995.N((float)this.N, (float)0.0f, (float)1.0f));
            if (this.N >= 1.0f) {
                this.L = false;
                if (class07529.C) {
                    u.info("Finished breaking {} {}", (Object)class072092, (Object)class005003);
                }
                this.N((class03448)((Object)this.i.T_3), n -> {
                    this.N(class072092);
                    return new class07364(class07356.field_12973, class072092, class072112, n);
                });
                this.N = 0.0f;
                this.Z = 0.0f;
                this.y = 5;
            }
        } else {
            return this.N(class072092, class072112);
        }
        ((class03448)((Object)this.i.T_3)).method_8517(((class04453)this.i.T_4).method_5628(), this.M, this.W());
        return true;
    }

    public boolean y() {
        return this.z.M();
    }

    private void y(class00539 class005392) {
        class06584 class065842 = this.N(class005392.M(), (int)class005392.L()) ? class06584.E : (class005392.L() < 0 || class005392.L() >= this.s.size() ? this.P : (class06584)this.s.get(class005392.L()));
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_16_2.CONTAINER_CLICK, (UserConnection)ProtocolTranslator.getPlayNetworkUserConnection());
        packetWrapper.write((Type)Types.BYTE, (Object)((byte)class005392.N()));
        packetWrapper.write((Type)Types.SHORT, (Object)class005392.L());
        packetWrapper.write((Type)Types.BYTE, (Object)class005392.u());
        packetWrapper.write((Type)Types.SHORT, (Object)((IAbstractContainerMenu)((class07482)((class04453)this.i.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3)).viaFabricPlus$incrementAndGetActionId());
        packetWrapper.write((Type)Types.VAR_INT, (Object)class005392.M().ordinal());
        packetWrapper.write(Types.ITEM1_13_2, (Object)ItemTranslator.mcToVia((class06584)class065842, (ProtocolVersion)ProtocolVersion.v1_16_4));
        packetWrapper.scheduleSendToServer(Protocol1_16_4To1_17.class);
        this.P = null;
        this.s = null;
    }

    public void y(class07209 class072092, class07211 class072112, CallbackInfoReturnable callbackInfoReturnable) {
        if (((class04453)this.i.T_4).method_31549().u) {
            this.L(class072092, class072112, callbackInfoReturnable);
        }
    }

    public void y(class08036 class080362) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class080362, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.i();
        this.R.N((class00381)new class07364(class07356.field_12974, class07209.field_10980, class07211.field_11033));
        class080362.method_6075();
    }

    private void y(class04453 class044532, class07050 class070502, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        class11393 class113932 = class11393.N((class07050)class070502, (class06183)class061832);
        class11938.L().L((Object)class113932);
        if (class113932.y()) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }

    private boolean y(class01683 class016832, class00381 class003812) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) || this.L;
    }

    private void y(class08036 class080362, class07049 class070492, CallbackInfo callbackInfo) {
        class11382 class113822 = class11382.y((class07049)class070492);
        class11938.L().L((Object)class113822);
        if (class113822.y()) {
            callbackInfo.cancel();
            return;
        }
        this.W = 0;
    }

    private void y(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        this.m = class11375.N((class07050)class070502, (float)class080362.method_36454(), (float)class080362.method_36455());
        class11938.L().L((Object)this.m);
        if (this.m.y()) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }

    private class07082 y(class04453 class044532, class07050 class070502, class06183 class061832) {
        class06501 class065012;
        class00500 class005002;
        class07209 class072092 = class061832.u();
        class06584 class065842 = class044532.method_5998(class070502);
        if (this.z == class07282.field_9219) {
            return this.s();
        }
        boolean bl = !class044532.method_6047().R() || !class044532.method_6079().R();
        if (!(class044532.method_21823() && bl)) {
            class07082 class070822;
            class005002 = ((class03448)((Object)this.i.T_3)).method_8320(class072092);
            if (!this.R.N(class005002.i().method_45322())) {
                return class07082.u;
            }
            class065012 = class005002.N(class044532.method_5998(class070502), (class07299)((class03448)((Object)this.i.T_3)), (class08036)class044532, class070502, class061832);
            if (class065012.N()) {
                return class065012;
            }
            if (class065012 instanceof class07087 && class070502 == class07050.field_5808 && (class070822 = class005002.N((class07299)((class03448)((Object)this.i.T_3)), (class08036)class044532, class061832)).N()) {
                return class070822;
            }
        }
        this.L(class044532, class070502, class061832, null);
        if (class065842.R() || class044532.method_7357().N(class065842)) {
            return class07082.i;
        }
        class065012 = new class06501((class08036)class044532, class070502, class061832);
        if (class044532.method_56992()) {
            int n = class065842.c();
            class005002 = class065842.N(class065012);
            class065842.i(n);
        } else {
            class005002 = class065842.N(class065012);
        }
        return class005002;
    }

    private boolean y(class07209 class072092) {
        class06584 class065842;
        class06584 class065843;
        class06584 class065844 = ((class04453)this.i.T_4).method_6047();
        return class072092.equals((Object)this.M) && this.N(class065843 = class065844, class065842 = this.B);
    }

    public boolean E() {
        return this.L;
    }

    private void N(Args args) {
        args.set(2, (Object)Float.valueOf(this.m.L()));
        args.set(3, (Object)Float.valueOf(this.m.u()));
    }

    private boolean N(class01683 class016832, class00381 class003812) {
        class00539 class005392 = (class00539)class003812;
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
            this.y(class005392);
            return false;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            this.N(class005392);
            return false;
        }
        return true;
    }

    private boolean N(class03443 class034432, class07209 class072092, LocalRef localRef) {
        return this.N(class034432, class072092, (class07211)localRef.get());
    }

    private List N(List list) {
        this.P = ((class07482)((class04453)this.i.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().t();
        this.s = list;
        return this.s;
    }

    public int N() {
        return this.W;
    }

    private void N(class08036 class080362, CallbackInfo callbackInfo) {
        class10950 class109502 = class10950.L();
        class11938.L().L((Object)class109502);
        if (class109502.y()) {
            callbackInfo.cancel();
        }
    }

    private class07082 N(class06584 class065842, class07299 class072992, class08036 class080362, class07050 class070502, LocalRef localRef) {
        return this.N(class065842, class072992, class080362, class070502, (class06584)localRef.get());
    }

    private class07082 N(class06584 class065842, class07299 class072992, class08036 class080362, class07050 class070502, class06584 class065843) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            boolean bl;
            class06584 class065844;
            int n = class065842.c();
            class07082 class070822 = class065842.N(class072992, class080362, class070502);
            if (class070822 instanceof class07041) {
                class07041 class070412 = (class07041)class070822;
                class065844 = Objects.requireNonNullElseGet(class070412.u(), () -> class080362.method_5998(class070502));
            } else {
                class065844 = class080362.method_5998(class070502);
            }
            boolean bl2 = bl = !class065844.R() && (class065844 != class065843 || class065844.c() != n);
            if (class070822.N() == bl) {
                return class070822;
            }
            return bl ? class07082.N.N(class065844) : class07082.i;
        }
        return class065842.N(class072992, class080362, class070502);
    }

    private void N(class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_3)) {
            this.M = new class07209(this.M.method_10263(), -1, this.M.method_10260());
        }
    }

    private boolean N(class03443 class034432, class07209 class072092, class07211 class072112) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            return !this.L(class072092, class072112) && class034432.N(class072092);
        }
        return class034432.N(class072092);
    }

    private boolean N(class03443 class034432, class03448 class034482, class01924 class019242, class08036 class080362, class07050 class070502) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18_2)) {
            this.R.N((class00381)new class07843(class070502, 0, class080362.method_36454(), class080362.method_36455()));
            class019242.predict(0);
            return false;
        }
        return true;
    }

    private boolean N(class03443 class034432) {
        return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6) || class034432.E();
    }

    private void N(class03443 class034432, class03448 class034482, class01924 class019242) {
        try {
            this.N(class034482, class019242);
        }
        catch (ActionResultException1_12_2 actionResultException1_12_2) {
            // empty catch block
        }
    }

    private class00381 N(MutableObject mutableObject, class04453 class044532, class07050 class070502, class06183 class061832, int n) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            ViaFabricPlusHandItemProvider.lastUsedItem = class044532.method_5998(class070502).t();
        }
        try {
            mutableObject.setValue((Object)this.y(class044532, class070502, class061832));
            return new class07828(class070502, class061832, n);
        }
        catch (ActionResultException1_12_2 actionResultException1_12_2) {
            mutableObject.setValue((Object)actionResultException1_12_2.getActionResult());
            throw actionResultException1_12_2;
        }
    }

    private void N(class07050 class070502, class08036 class080362, MutableObject mutableObject, int n, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            ViaFabricPlusHandItemProvider.lastUsedItem = class080362.method_5998(class070502).t();
        }
    }

    private void N(class03448 class034482, class01924 class019242, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_14_4, ProtocolVersion.v1_18_2) && class019242 instanceof class07364) {
            class07364 class073642 = (class07364)class019242;
            this.T.trackPlayerAction(class073642.L(), class073642.N());
        }
    }

    private boolean N(class07510 class075102, int n) {
        if (class075102 == class07510.field_7789) {
            return true;
        }
        if (class075102 == class07510.field_7795) {
            return true;
        }
        if (class075102 == class07510.field_7794 && ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_11_1)) {
            return true;
        }
        return class075102 == class07510.field_7790 && n == -999;
    }

    private void N(class00539 class005392) {
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_21_4.CONTAINER_CLICK, (UserConnection)ProtocolTranslator.getPlayNetworkUserConnection());
        packetWrapper.write((Type)Types.VAR_INT, (Object)class005392.N());
        packetWrapper.write((Type)Types.VAR_INT, (Object)class005392.y());
        packetWrapper.write((Type)Types.SHORT, (Object)class005392.L());
        packetWrapper.write((Type)Types.BYTE, (Object)class005392.u());
        packetWrapper.write((Type)Types.VAR_INT, (Object)class005392.M().N());
        Int2ObjectMap var3 = class005392.B();
        packetWrapper.write((Type)Types.VAR_INT, (Object)var3.size());
        for (Int2ObjectMap.Entry entry : var3.int2ObjectEntrySet()) {
            class06584 class065842 = ((class06937)((class07482)((class04453)this.i.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).T.get(entry.getIntKey())).i();
            packetWrapper.write((Type)Types.SHORT, (Object)((short)entry.getIntKey()));
            packetWrapper.write(VersionedTypes.V1_21_4.item, (Object)ItemTranslator.mcToVia((class06584)class065842, (ProtocolVersion)ProtocolVersion.v1_21_4));
        }
        class06584 class065843 = ((class07482)((class04453)this.i.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
        packetWrapper.write(VersionedTypes.V1_21_4.item, (Object)ItemTranslator.mcToVia((class06584)class065843, (ProtocolVersion)ProtocolVersion.v1_21_4));
        packetWrapper.scheduleSendToServer(Protocol1_21_4To1_21_5.class);
    }

    private void N(int n, int n2, int n3, class07510 class075102, class08036 class080362, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_5tob1_5_2) && !class075102.equals((Object)class07510.field_7790)) {
            callbackInfo.cancel();
        } else if (!(!ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7) || class075102.equals((Object)class07510.field_7790) || class075102.equals((Object)class07510.field_7794) || class075102.equals((Object)class07510.field_7791) || class075102.equals((Object)class07510.field_7796))) {
            callbackInfo.cancel();
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) && class075102 == class07510.field_7791 && n3 == 40) {
            callbackInfo.cancel();
        }
    }

    private class07364 N(class07356 class073562, class07209 class072092, class07211 class072112) {
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_14_4, ProtocolVersion.v1_18_2)) {
            this.T.trackPlayerAction(class073562, class072092);
        }
        return new class07364(class073562, class072092, class072112);
    }

    private boolean N(class04453 class044532) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) || this.L;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
            callbackInfoReturnable.setReturnValue((Object)((int)(this.N * 10.0f) - 1));
        }
    }

    public void N(int n, int n2, int n3, class07510 class075102, class08036 class080362) {
        block4: {
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(n, n2, n3, class075102, class080362, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            class07482 class074822 = (class07482)class080362.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
            if (n != class074822.b) {
                u.warn("Ignoring click in mismatching container. Click in {}, player has {}.", (Object)n, (Object)class074822.b);
                return;
            }
            class00743 var7 = class074822.T;
            int n4 = var7.size();
            List<class06584> list = Lists.newArrayListWithCapacity((int)n4);
            list = this.N(list);
            for (class06937 class069372 : var7) {
                list.add(class069372.i().t());
            }
            class074822.N(n2, n3, class075102, class080362);
            Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
            for (int i = 0; i < n4; ++i) {
                class06584 class065842;
                class06584 class065843 = (class06584)list.get(i);
                if (class06584.N((class06584)class065843, (class06584)(class065842 = ((class06937)var7.get(i)).i()))) continue;
                int2ObjectOpenHashMap.put(i, (Object)class00176.y((class06584)class065842, (class00147)this.R.Q()));
            }
            class00176 class001762 = class00176.y((class06584)class074822.M(), (class00147)this.R.Q());
            class01683 class016832 = this.R;
            class00539 class005392 = new class00539(n, class074822.z(), Shorts.checkedCast((long)n2), SignedBytes.checkedCast((long)n3), class075102, (Int2ObjectMap)int2ObjectOpenHashMap, class001762);
            if (!this.N(class016832, (class00381)class005392)) break block4;
            class016832.N((class00381)class005392);
        }
    }

    public class07082 N(class08036 class080362, class07049 class070492, class06145 class061452, class07050 class070502) {
        this.i();
        class06889 class068892 = class061452.y().N(class070492.method_23317(), class070492.method_23318(), class070492.method_23321());
        this.R.N((class00381)class00556.N((class07049)class070492, (boolean)class080362.method_5715(), (class07050)class070502, (class06889)class068892));
        if (this.z == class07282.field_9219) {
            return class07082.i;
        }
        return class070492.method_5664(class080362, class068892, class070502);
    }

    public class07082 N(class08036 class080362, class07049 class070492, class07050 class070502) {
        this.i();
        this.R.N((class00381)class00556.N((class07049)class070492, (boolean)class080362.method_5715(), (class07050)class070502));
        if (this.z == class07282.field_9219) {
            return class07082.i;
        }
        return class080362.method_7287(class070492, class070502);
    }

    public void N(class08036 class080362, class07049 class070492) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(class080362, class070492, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.i();
        class00556 class005562 = class00556.N((class07049)class070492, (boolean)class080362.method_5715());
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.N(class080362, class070492, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        this.R.N((class00381)class005562);
        if (this.z != class07282.field_9219) {
            class080362.method_5997(class070492);
            class080362.method_7350();
        }
        this.L(class080362, class070492, null);
    }

    public class04453 N(class03448 class034482, class01205 class012052, class01756 class017562, class08687 class086872, boolean bl) {
        return new class04453(this.i, class034482, this.R, class012052, class017562, class086872, bl);
    }

    public void N(class08172 class081722) {
        this.i();
        this.R.N((class00381)new class07364(class07356.field_63165, class07209.field_10980, class07211.field_11033));
        ((class04453)this.i.T_4).method_75124();
        ((class04453)this.i.T_4).method_75125();
        class081722.N((class07049)((class04453)this.i.T_4));
    }

    public void N(class06584 class065842) {
        boolean bl;
        boolean bl2 = bl = (class05096)this.i.v_3 instanceof class01463 && !((class05096)this.i.v_3 instanceof class01488);
        if (((class04453)this.i.T_4).method_56992() && !bl && !class065842.R() && this.R.N(class065842.B().method_45322())) {
            this.R.N((class00381)new class07346(-1, class065842));
            ((class04453)this.i.T_4).s().N();
        }
    }

    public void N(class06584 class065842, int n) {
        if (((class04453)this.i.T_4).method_56992() && this.R.N(class065842.B().method_45322())) {
            this.R.N((class00381)new class07346(n, class065842));
        }
    }

    public void N(int n, int n2) {
        this.R.N((class00381)new class00546(n, n2));
    }

    public void N(int n, class00329 class003292, boolean bl) {
        this.R.N((class00381)new class07378(n, class003292, bl));
    }

    public boolean N(class07209 class072092, class07211 class072112) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.u(class072092, class072112, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (((class04453)this.i.T_4).method_21701((class07299)((class03448)((Object)this.i.T_3)), class072092, this.z)) {
            return false;
        }
        if (!((class03448)((Object)this.i.T_3)).method_8621().N(class072092)) {
            return false;
        }
        class04453 class044532 = (class04453)this.i.T_4;
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        this.N(class072092, class072112, callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return callbackInfoReturnable2.getReturnValueZ();
        }
        if (class044532.method_31549().u) {
            class00500 class005002 = ((class03448)((Object)this.i.T_3)).method_8320(class072092);
            this.i.yT().N((class03448)((Object)this.i.T_3), class072092, class005002, 1.0f);
            if (class07529.C) {
                u.info("Creative start {} {}", (Object)class072092, (Object)class005002);
            }
            this.N((class03448)((Object)this.i.T_3), n -> {
                class07209 class072093 = class072092;
                class03443 class034432 = this;
                LocalRefImpl localRefImpl = new LocalRefImpl();
                localRefImpl.init((Object)class072112);
                this.N(class034432, class072093, (LocalRef)localRefImpl);
                class072112 = (class07211)localRefImpl.dispose();
                return new class07364(class07356.field_12968, class072092, class072112, n);
            });
            this.y = 5;
        } else if (!this.L || !this.y(class072092)) {
            if (this.L) {
                if (class07529.C) {
                    u.info("Abort old break {} {}", (Object)class072092, (Object)((class03448)((Object)this.i.T_3)).method_8320(class072092));
                }
                class07364 class073642 = this.N(class07356.field_12971, this.M, class072112);
                if (class073642 == null) {
                    throw new NullPointerException("@Redirect constructor handler net/minecraft/class_636::trackPlayerAction returned null for net.minecraft.class_2846");
                }
                this.R.N((class00381)class073642);
            }
            class00500 class005003 = ((class03448)((Object)this.i.T_3)).method_8320(class072092);
            this.i.yT().N((class03448)((Object)this.i.T_3), class072092, class005003, 0.0f);
            if (class07529.C) {
                u.info("Start break {} {}", (Object)class072092, (Object)class005003);
            }
            this.N((class03448)((Object)this.i.T_3), n -> {
                boolean bl;
                boolean bl2 = bl = !class005003.P();
                if (bl && this.N == 0.0f) {
                    class005003.N((class07299)((class03448)((Object)((Object)this.i.T_3))), class072092, (class08036)((class04453)this.i.T_4));
                }
                if (bl && class005003.N((class08036)((class04453)this.i.T_4), (class07290)((class04453)this.i.T_4).method_73183(), class072092) >= 1.0f) {
                    this.N(class072092);
                } else {
                    this.L = true;
                    this.M = class072092;
                    this.B = ((class04453)this.i.T_4).method_6047();
                    this.N = 0.0f;
                    this.Z = 0.0f;
                    ((class03448)((Object)((Object)this.i.T_3))).method_8517(((class04453)this.i.T_4).method_5628(), this.M, this.W());
                }
                return new class07364(class07356.field_12968, class072092, class072112, n);
            });
        }
        return true;
    }

    public boolean N(class07209 class072092) {
        if (((class04453)this.i.T_4).method_21701((class07299)((class03448)((Object)this.i.T_3)), class072092, this.z)) {
            return false;
        }
        class03448 class034482 = (class03448)((Object)this.i.T_3);
        class00500 class005002 = class034482.method_8320(class072092);
        if (!((class04453)this.i.T_4).method_6047().N(class005002, (class07299)class034482, class072092, (class08036)((class04453)this.i.T_4))) {
            return false;
        }
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class01137 && !((class04453)this.i.T_4).method_7338()) {
            return false;
        }
        if (class005002.P()) {
            return false;
        }
        class008912.N((class07299)class034482, class072092, class005002, (class08036)((class04453)this.i.T_4));
        class04688 class046882 = class034482.method_8316(class072092);
        boolean bl = class034482.method_8652(class072092, class046882.B(), 11);
        if (bl) {
            this.N(class072092, null, class005002);
            class008912.N_7((class07284)class034482, class072092, class005002);
        }
        if (class07529.C) {
            u.error("client broke {} {} -> {}", new Object[]{class072092, class005002, class034482.method_8320(class072092)});
        }
        this.N(class072092, (CallbackInfoReturnable)null);
        return bl;
    }

    public void N(class07282 class072822) {
        if (class072822 != this.z) {
            this.U = this.z;
        }
        this.z = class072822;
        this.z.N(((class04453)this.i.T_4).method_31549());
    }

    public void N(class07282 class072822, @Nullable class07282 class072823) {
        this.z = class072822;
        this.U = class072823;
        this.z.N(((class04453)this.i.T_4).method_31549());
    }

    public void N(class08036 class080362) {
        this.z.N(class080362.method_31549());
    }

    public class04453 N(class03448 class034482, class01205 class012052, class01756 class017562) {
        return this.N(class034482, class012052, class017562, class08687.y, false);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        MutableObject mutableObject;
        block4: {
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            this.y(class080362, class070502, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return (class07082)callbackInfoReturnable.getReturnValue();
            }
            CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
            this.u(class080362, class070502, callbackInfoReturnable2);
            if (callbackInfoReturnable2.isCancelled()) {
                return (class07082)callbackInfoReturnable2.getReturnValue();
            }
            if (this.z == class07282.field_9219) {
                return class07082.i;
            }
            CallbackInfoReturnable callbackInfoReturnable3 = new CallbackInfoReturnable("", true);
            this.N(class080362, class070502, callbackInfoReturnable3);
            if (callbackInfoReturnable3.isCancelled()) {
                return (class07082)callbackInfoReturnable3.getReturnValue();
            }
            this.i();
            this.L(class080362, class070502, null);
            mutableObject = new MutableObject();
            class01924 class019242 = n -> {
                this.N(class070502, class080362, mutableObject, n, null);
                ArgsN5 argsN5 = ArgsN5.of((class07050)class070502, (int)n, (float)class080362.method_36454(), (float)class080362.method_36455());
                this.N((Args)argsN5);
                class07843 class078432 = new class07843(argsN5.$0(), argsN5.$1(), argsN5.$2(), argsN5.$3());
                class06584 class065842 = class080362.method_5998(class070502);
                if (class080362.method_7357().N(class065842)) {
                    mutableObject.setValue((Object)class07082.i);
                    return class078432;
                }
                class07050 class070503 = class070502;
                class08036 class080363 = class080362;
                class03448 class034482 = (class03448)((Object)((Object)this.i.T_3));
                class06584 class065843 = class065842;
                LocalRefImpl localRefImpl = new LocalRefImpl();
                localRefImpl.init((Object)class065842);
                class065842 = (class06584)localRefImpl.dispose();
                class07082 class070822 = this.N(class065843, (class07299)class034482, class080363, class070503, (LocalRef)localRefImpl);
                class06584 class065844 = class070822 instanceof class07041 ? Objects.requireNonNullElseGet(((class07041)class070822).u(), () -> class080362.method_5998(class070502)) : class080362.method_5998(class070502);
                if (class065844 != class065842) {
                    class080362.method_6122(class070502, class065844);
                }
                mutableObject.setValue((Object)class070822);
                return class078432;
            };
            class03448 class034482 = (class03448)((Object)this.i.T_3);
            class03443 class034432 = this;
            if (!this.N(class034432, class034482, class019242, class080362, class070502)) break block4;
            class034432.N(class034482, class019242);
        }
        return (class07082)mutableObject.get();
    }

    public class07082 N(class04453 class044532, class07050 class070502, class06183 class061832) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(class044532, class070502, class061832, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        this.u(class044532, class070502, class061832, callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return (class07082)callbackInfoReturnable2.getReturnValue();
        }
        this.i();
        if (!((class03448)((Object)this.i.T_3)).method_8621().N(class061832.u())) {
            return class07082.u;
        }
        MutableObject mutableObject = new MutableObject();
        class03448 class034482 = (class03448)((Object)this.i.T_3);
        class01924 class019242 = arg_0 -> this.N(mutableObject, class044532, class070502, class061832, arg_0);
        CallbackInfoReturnable callbackInfoReturnable3 = new CallbackInfoReturnable("", true);
        this.N(class044532, class070502, class061832, callbackInfoReturnable3);
        if (callbackInfoReturnable3.isCancelled()) {
            return (class07082)callbackInfoReturnable3.getReturnValue();
        }
        class01924 class019243 = class019242;
        class03448 class034483 = class034482;
        class03443 class034432 = this;
        this.N(class034432, class034483, class019243);
        return (class07082)mutableObject.get();
    }

    public final void N(class03448 class034482, class01924 class019242) {
        this.N(class034482, class019242, null);
        try (class01909 class019092 = class034482.u().method_41937();){
            int n = class019092.method_41942();
            class00381 var5 = class019242.predict(n);
            this.R.N(var5);
        }
    }

    private boolean N(class06584 class065842, class06584 class065843) {
        class06584 class065844;
        class06584 class065845;
        boolean bl = class06584.L((class06584)class065842, (class06584)this.B);
        if (!bl && (class065845 = this.B).N((class065844 = ((class04453)this.i.T_4).method_6047()).B()) && class065845.B().allowContinuingBlockBreaking((class08036)((class04453)this.i.T_4), class065845, class065844)) {
            bl = true;
        }
        return bl;
    }

    private void N(class07209 class072092, CallbackInfoReturnable callbackInfoReturnable, class00500 class005002) {
        ((ClientPlayerBlockBreakEvents.After)ClientPlayerBlockBreakEvents.AFTER.invoker()).afterBlockBreak((class03448)((Object)this.i.T_3), (class04453)this.i.T_4, class072092, class005002);
    }

    public void N(class07209 class072092, class07211 class072112, CallbackInfoReturnable callbackInfoReturnable) {
        this.L(class072092, class072112, callbackInfoReturnable);
    }

    public void N(class08036 class080362, class07049 class070492, CallbackInfo callbackInfo) {
        class07082 class070822 = ((AttackEntityCallback)AttackEntityCallback.EVENT.invoker()).interact(class080362, class080362.method_73183(), class07050.field_5808, class070492, null);
        if (class070822 != class07082.i) {
            if (class070822 == class07082.N) {
                this.R.N((class00381)class00556.N((class07049)class070492, (boolean)class080362.method_5715()));
            }
            callbackInfo.cancel();
        }
    }

    public void N(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        class07082 class070822 = ((UseItemCallback)UseItemCallback.EVENT.invoker()).interact(class080362, class080362.method_73183(), class070502);
        if (class070822 != class07082.i) {
            if (class070822 == class07082.N) {
                this.N((class03448)class080362.method_73183(), n -> new class07843(class070502, n, class080362.method_36454(), class080362.method_36455()));
            }
            callbackInfoReturnable.setReturnValue((Object)class070822);
        }
    }

    public void N(class07049 class070492, boolean bl) {
        this.R.N((class00381)new class00285(class070492.method_5628(), bl));
    }

    public void N(class07209 class072092, boolean bl) {
        this.R.N((class00381)new class00328(class072092, bl));
    }

    private void N(CallbackInfo callbackInfo) {
        ++this.W;
    }

    public void N(class04453 class044532, class07050 class070502, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        if (class044532.method_7325()) {
            return;
        }
        class07082 class070822 = ((UseBlockCallback)UseBlockCallback.EVENT.invoker()).interact((class08036)class044532, class044532.method_73183(), class070502, class061832);
        if (class070822 != class07082.i) {
            if (class070822.N()) {
                this.N((class03448)class044532.method_73183(), n -> new class07828(class070502, class061832, n));
            }
            callbackInfoReturnable.setReturnValue((Object)class070822);
        }
    }

    public void N(int n, int n2, boolean bl) {
        this.R.N((class00381)new class01735(n, n2, bl));
    }

    public int W() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.N > 0.0f ? (int)(this.N * 10.0f) : -1;
    }

    public boolean R() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.z.M();
    }

    public /* synthetic */ class07209 getCurrentBlock() {
        return this.M;
    }

    public /* synthetic */ void setDestroyDelay(int n) {
        this.y = n;
    }

    public /* synthetic */ boolean isHittingBlock() {
        return this.L;
    }

    public /* synthetic */ void setIsHittingBlock(boolean bl) {
        this.L = bl;
    }

    public /* synthetic */ void callSyncCurrentPlayItem() {
        this.i();
    }

    public ClientPlayerInteractionManager1_18_2 viaFabricPlus$get1_18_2InteractionManager() {
        return this.T;
    }
}


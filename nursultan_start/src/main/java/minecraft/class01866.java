/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.base.sync_tasks.DataCustomPayload
 *  com.viaversion.viafabricplus.base.sync_tasks.SyncTasks
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  minecraft.class00097
 *  minecraft.class00132
 *  minecraft.class00134
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00417
 *  minecraft.class00458
 *  minecraft.class00489
 *  minecraft.class00501
 *  minecraft.class00506
 *  minecraft.class00552
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class00667
 *  minecraft.class01636
 *  minecraft.class01638
 *  minecraft.class01644
 *  minecraft.class01659
 *  minecraft.class01662
 *  minecraft.class02090
 *  minecraft.class02213
 *  minecraft.class02222
 *  minecraft.class02231
 *  minecraft.class02243
 *  minecraft.class02570
 *  minecraft.class02581
 *  minecraft.class02587
 *  minecraft.class02602
 *  minecraft.class02870
 *  minecraft.class02872
 *  minecraft.class03096
 *  minecraft.class03420
 *  minecraft.class03451
 *  minecraft.class03458
 *  minecraft.class03462
 *  minecraft.class03556
 *  minecraft.class03807
 *  minecraft.class04254
 *  minecraft.class04269
 *  minecraft.class04278
 *  minecraft.class04453
 *  minecraft.class04568
 *  minecraft.class04575
 *  minecraft.class04705
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05304
 *  minecraft.class05364
 *  minecraft.class05763
 *  minecraft.class06202
 *  minecraft.class06666
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07367
 *  minecraft.class07369
 *  minecraft.class07482
 *  minecraft.class07536
 *  minecraft.class08739
 *  minecraft.class08781
 *  minecraft.class09014
 *  minecraft.class09030
 *  minecraft.class09037
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.networking.AbstractNetworkAddon
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon
 *  net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon
 *  net.fabricmc.fabric.mixin.networking.client.accessor.ClientCommonPacketListenerImplAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.base.sync_tasks.DataCustomPayload;
import com.viaversion.viafabricplus.base.sync_tasks.SyncTasks;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import minecraft.class00097;
import minecraft.class00132;
import minecraft.class00134;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00417;
import minecraft.class00458;
import minecraft.class00489;
import minecraft.class00501;
import minecraft.class00506;
import minecraft.class00552;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class00667;
import minecraft.class01636;
import minecraft.class01638;
import minecraft.class01644;
import minecraft.class01659;
import minecraft.class01662;
import minecraft.class01847;
import minecraft.class01851;
import minecraft.class01884;
import minecraft.class01892;
import minecraft.class01894;
import minecraft.class02090;
import minecraft.class02213;
import minecraft.class02222;
import minecraft.class02231;
import minecraft.class02243;
import minecraft.class02570;
import minecraft.class02581;
import minecraft.class02587;
import minecraft.class02602;
import minecraft.class02870;
import minecraft.class02872;
import minecraft.class03096;
import minecraft.class03420;
import minecraft.class03451;
import minecraft.class03458;
import minecraft.class03462;
import minecraft.class03556;
import minecraft.class03807;
import minecraft.class04254;
import minecraft.class04269;
import minecraft.class04278;
import minecraft.class04453;
import minecraft.class04568;
import minecraft.class04575;
import minecraft.class04705;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05304;
import minecraft.class05364;
import minecraft.class05763;
import minecraft.class06202;
import minecraft.class06666;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07367;
import minecraft.class07369;
import minecraft.class07482;
import minecraft.class07536;
import minecraft.class08739;
import minecraft.class08781;
import minecraft.class09014;
import minecraft.class09030;
import minecraft.class09037;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.networking.AbstractNetworkAddon;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientCommonPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public abstract class class01866
implements class01662,
NetworkHandlerExtensions,
ClientCommonPacketListenerImplAccessor {
    private static final class00392 N = class00392.L((String)"disconnect.lost");
    private static final Logger y = LogUtils.getLogger();
    protected final class06202 L;
    protected final class00642 u;
    protected final @Nullable class04568 i;
    protected @Nullable String R;
    protected final class02090 M;
    protected final @Nullable class05096 B;
    protected boolean Z;
    private final List<class01884> m = new ArrayList<class01884>();
    protected final Map<class01894, byte[]> z;
    protected Map<String, String> U;
    private class02243 P;
    protected final Map<UUID, class03458> E;
    protected boolean W;

    public /* synthetic */ class00642 getConnection() {
        return this.u;
    }

    protected void K() {
        Iterator<class01884> var1 = this.m.iterator();
        while (var1.hasNext()) {
            class01884 class018842 = var1.next();
            if (class018842.y().getAsBoolean()) {
                this.N(class018842.N());
                var1.remove();
                continue;
            }
            if (class018842.L() > class07536.L()) continue;
            var1.remove();
        }
    }

    protected class01866(class06202 class062022, class00642 class006422, class01892 class018922) {
        this.L = class062022;
        this.u = class006422;
        this.i = class018922.M();
        this.R = class018922.R();
        this.M = class018922.L();
        this.B = class018922.B();
        this.z = class018922.Z();
        this.U = class018922.U();
        this.P = class018922.E();
        this.E = new HashMap<UUID, class03458>(class018922.W());
        this.W = class018922.m();
    }

    public @Nullable String V() {
        return this.R;
    }

    protected abstract class08781 n();

    public class02243 o() {
        return this.P;
    }

    public void q() {
        class05096 class050962 = (class05096)this.L.v_3;
        if (class050962 instanceof class00132) {
            class00132 class001322 = (class00132)class050962;
            if ((class050962 = class001322.N()) instanceof class00134) {
                class00134 class001342 = (class00134)class050962;
                class001322.N(class001342.L());
            }
        } else {
            class050962 = (class05096)this.L.v_3;
            if (class050962 instanceof class00134) {
                class00134 class001343 = (class00134)class050962;
                this.L.N(class001343.L());
            }
        }
    }

    private void y(class00489 class004892, CallbackInfo callbackInfo) {
        class01659 class016592 = class004892.N();
        if (class016592 instanceof DataCustomPayload) {
            DataCustomPayload dataCustomPayload = (DataCustomPayload)class016592;
            try {
                SyncTasks.handleSyncTask((class00667)dataCustomPayload.buf());
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            callbackInfo.cancel();
        }
    }

    private void N(class00381<? extends class01636> class003812, BooleanSupplier booleanSupplier, Duration duration) {
        if (booleanSupplier.getAsBoolean()) {
            this.N(class003812);
        } else {
            this.m.add(new class01884(class003812, booleanSupplier, class07536.L() + duration.toMillis()));
        }
    }

    public void N(class00381<?> class003812) {
        this.u.method_10743(class003812);
    }

    public void N(class07080 class070802, class07074 class070742) {
        class070742.N("Is Local", () -> String.valueOf(this.u.method_10756()));
        class070742.N("Server type", () -> this.i != null ? this.i.R().toString() : "<none>");
        class070742.N("Server brand", () -> this.R);
        if (!this.U.isEmpty()) {
            class07074 class070743 = class070802.N("Custom Server Details");
            this.U.forEach((arg_0, arg_1) -> ((class07074)class070743).N(arg_0, arg_1));
        }
    }

    protected class05096 N(class02570 class025702) {
        class05096 class050962 = Objects.requireNonNullElseGet(this.B, () -> this.i != null ? new class05304((class05096)new class04705()) : new class04705());
        if (this.i != null && this.i.i()) {
            return new class05364(class050962, N, class025702, class05220.U);
        }
        return new class05364(class050962, N, class025702);
    }

    private class05096 N(UUID uUID, URL uRL, String string, boolean bl, @Nullable class00392 class003922) {
        class05096 class050962 = (class05096)this.L.v_3;
        if (class050962 instanceof class01851) {
            return ((class01851)class050962).N(this.L, uUID, uRL, string, bl, class003922);
        }
        return new class01851(this, this.L, class050962, List.of(new class01847(uUID, uRL, string)), bl, class003922);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (DebugSettings.INSTANCE.dontCreatePacketErrorCrashReports.isEnabled()) {
            callbackInfoReturnable.setReturnValue(Optional.empty());
        }
    }

    private boolean N(class00642 class006422, class02570 class025702) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_3);
    }

    private void N(class06666 class066662, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2) && class01866.N(class066662.y()) == null) {
            this.u.method_10743((class00381)new class07367(class066662.N(), class07369.field_47667));
            callbackInfo.cancel();
        }
    }

    private void N(class01866 class018662, class00381 class003812, BooleanSupplier booleanSupplier, Duration duration) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3)) {
            this.N(class003812);
        } else {
            this.N((class00381<? extends class01636>)class003812, booleanSupplier, duration);
        }
    }

    private void N(class03462 class034622, CallbackInfo callbackInfo) {
        short s;
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4) && (s = (short)(class034622.N() >> 16 & 0xFF)) != 0 && s != ((class07482)((class04453)this.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b) {
            callbackInfo.cancel();
        }
    }

    public void N(class00501 class005012) {
        this.u.method_10747(class005012.N());
    }

    public void N(class00489 class004892, CallbackInfo callbackInfo) {
        class01659 class016592 = class004892.N();
        try {
            boolean bl;
            AbstractNetworkAddon var7 = this.getAddon();
            if (var7 instanceof ClientPlayNetworkAddon) {
                bl = ((ClientPlayNetworkAddon)var7).handle(class016592);
            } else {
                AbstractNetworkAddon abstractNetworkAddon = this.getAddon();
                if (abstractNetworkAddon instanceof ClientConfigurationNetworkAddon) {
                    bl = ((ClientConfigurationNetworkAddon)abstractNetworkAddon).handle(class016592);
                } else {
                    throw new IllegalStateException("Unknown network addon");
                }
            }
            if (bl) {
                callbackInfo.cancel();
            }
        }
        catch (class03096 class030962) {
            this.L.B().N((class00638)this, (class00381)class004892);
            callbackInfo.cancel();
        }
    }

    public void N(class03807 class038072) {
        class00417.N((class00381)class038072, (class00638)this, (class00458)this.L.B());
        class038072.N().ifPresentOrElse(uUID -> this.L.yL().N(uUID), () -> this.L.yL().i());
    }

    static class00392 N(class00392 class003922, @Nullable class00392 class003923) {
        if (class003923 == null) {
            return class003922;
        }
        return class00392.N((String)"multiplayer.texturePrompt.serverPrompt", (Object[])new Object[]{class003922, class003923});
    }

    private static @Nullable URL N(String string) {
        try {
            URL uRL = new URL(string);
            String string2 = uRL.getProtocol();
            if ("http".equals(string2) || "https".equals(string2)) {
                return uRL;
            }
        }
        catch (MalformedURLException malformedURLException) {
            return null;
        }
        return null;
    }

    public void N(class04278 class042782) {
        class00417.N((class00381)class042782, (class00638)this, (class00458)this.L.B());
        this.u.method_10743((class00381)new class04269(class042782.N(), this.z.get(class042782.N())));
    }

    private Optional<Path> N(@Nullable class00381 class003812, Throwable throwable) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (Optional)callbackInfoReturnable.getReturnValue();
        }
        class07080 class070802 = class07080.N((Throwable)throwable, (String)"Packet handling error");
        class00417.N((class07080)class070802, (class00638)this, (class00381)class003812);
        Path path = ((File)this.L.l_1).toPath().resolve("debug").resolve("disconnect-" + class07536.R() + "-client.txt");
        List list = this.P.N(class02222.field_51981).map(class022132 -> List.of("Server bug reporting link: " + String.valueOf(class022132.L()))).orElse(List.of());
        if (class070802.N(path, class02587.u, list)) {
            return Optional.of(path);
        }
        return Optional.empty();
    }

    public void N(class02602 class026022) {
        class00417.N((class00381)class026022, (class00638)this, (class00458)this.L.B());
        this.U = class026022.N();
    }

    public void N(class00506 class005062) {
        Duration duration = Duration.ofMinutes(1L);
        BooleanSupplier booleanSupplier = () -> !RenderSystem.isFrozenAtPollEvents();
        class00552 class005522 = new class00552(class005062.N());
        class01866 class018662 = this;
        this.N(class018662, (class00381)class005522, booleanSupplier, duration);
    }

    public void N(class03462 class034622) {
        class00417.N((class00381)class034622, (class00638)this, (class00458)this.L.B());
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class034622, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N((class00381<?>)new class03451(class034622.N()));
    }

    public void N(class00489 class004892) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(class004892, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.N(class004892, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        class01659 class016592 = class004892.N();
        if (class016592 instanceof class01638) {
            return;
        }
        class00417.N((class00381)class004892, (class00638)this, (class00458)this.L.B());
        if (class016592 instanceof class01644) {
            class01644 class016442 = (class01644)class016592;
            this.R = class016442.N();
            this.M.N(class016442.N());
        } else {
            this.N(class016592);
        }
    }

    protected abstract void N(class01659 var1);

    public void N(class06666 class066662) {
        class04575 class045752;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class066662, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class00417.N((class00381)class066662, (class00638)this, (class00458)this.L.B());
        UUID uUID = class066662.N();
        URL uRL = class01866.N(class066662.y());
        if (uRL == null) {
            this.u.method_10743((class00381)new class07367(uUID, class07369.field_47667));
            return;
        }
        String string = class066662.L();
        boolean bl = class066662.u();
        class04575 class045753 = class045752 = this.i != null ? this.i.y() : class04575.field_3767;
        if (class045752 == class04575.field_3767 || bl && class045752 == class04575.field_3764) {
            this.L.N(this.N(uUID, uRL, string, bl, class066662.M().orElse(null)));
        } else {
            this.L.yL().N(uUID, uRL, string);
        }
    }

    protected void N(class03556<class09037> class035562, class08781 class087812, @Nullable class05096 class050962) {
        class05096 class050963;
        class00134 class001342;
        if (class050962 instanceof class00132) {
            class05096 class050964;
            class00134 class001343;
            class00132 class001322 = (class00132)class050962;
            class05096 class050965 = class001322.N();
            if (class050965 instanceof class00134) {
                class001343 = (class00134)class050965;
                class050964 = class001343.L();
            } else {
                class050964 = class050965;
            }
            class05096 class050966 = class050964;
            class001343 = class00097.N((class09037)((class09037)class035562.N()), (class05096)class050966, (class08781)class087812);
            if (class001343 != null) {
                class001322.N((class05096)class001343);
            } else {
                y.warn("Failed to show dialog for data {}", class035562);
            }
            return;
        }
        if (class050962 instanceof class00134) {
            class001342 = (class00134)class050962;
            class050963 = class001342.L();
        } else if (class050962 instanceof class08739) {
            class08739 class087392 = (class08739)class050962;
            class050963 = class087392.N();
        } else {
            class050963 = class050962;
        }
        class001342 = class00097.N((class09037)((class09037)class035562.N()), (class05096)class050963, (class08781)class087812);
        if (class001342 != null) {
            this.L.N((class05096)class001342);
        } else {
            y.warn("Failed to show dialog for data {}", class035562);
        }
    }

    public void N(class09014 class090142) {
        class00417.N((class00381)class090142, (class00638)this, (class00458)this.L.B());
        this.q();
    }

    public void N(class02870 class028702) {
        this.Z = true;
        class00417.N((class00381)class028702, (class00638)this, (class00458)this.L.B());
        if (this.i == null) {
            throw new IllegalStateException("Cannot transfer to server from singleplayer");
        }
        this.u.method_10747((class00392)class00392.L((String)"disconnect.transfer"));
        this.u.method_10757();
        this.u.method_10768();
        class03420 class034202 = new class03420(class028702.N(), class028702.y());
        class05763.N((class05096)Objects.requireNonNullElseGet(this.B, class04705::new), (class06202)this.L, (class03420)class034202, (class04568)this.i, (boolean)false, (class04254)new class04254(this.z, this.E, this.W));
    }

    public class02570 N(class00392 class003922, Throwable throwable) {
        Optional<Path> var3 = this.N((class00381)null, throwable);
        Optional<URI> optional = this.P.N(class02222.field_51981).map(class02213::L);
        return new class02570(class003922, var3, optional);
    }

    public void N(class02872 class028722) {
        class00417.N((class00381)class028722, (class00638)this, (class00458)this.L.B());
        this.z.put(class028722.N(), class028722.y());
    }

    public void N(class02581 class025812) {
        class00417.N((class00381)class025812, (class00638)this, (class00458)this.L.B());
        List var2 = class025812.N();
        ImmutableList.Builder builder = ImmutableList.builderWithExpectedSize((int)var2.size());
        for (class02231 class022312 : var2) {
            try {
                URI uRI = class07536.N((String)class022312.y());
                builder.add((Object)new class02213(class022312.N(), uRI));
            }
            catch (Exception exception) {
                y.warn("Received invalid link for type {}:{}", new Object[]{class022312.N(), class022312.y(), exception});
            }
        }
        this.P = new class02243((List)builder.build());
    }

    public void N(class09030 class090302) {
        class00417.N((class00381)class090302, (class00638)this, (class00458)this.L.B());
        this.N((class03556<class09037>)class090302.N(), (class05096)this.L.v_3);
    }

    public void N(class03556<class09037> class035562, @Nullable class05096 class050962) {
        this.N(class035562, this.n(), class050962);
    }

    public void method_10839(class02570 class025702) {
        this.M.L();
        this.L.N(this.N(class025702), this.Z);
        y.warn("Client disconnected with reason: {}", (Object)class025702.N().getString());
    }

    public void method_59807(class00381 class003812, Exception exception) {
        block0: {
            y.error("Failed to handle packet {}, disconnecting", (Object)class003812, (Object)exception);
            Optional<Path> var3 = this.N(class003812, (Throwable)exception);
            Optional<URI> optional = this.P.N(class02222.field_51981).map(class02213::L);
            class02570 class025702 = new class02570((class00392)class00392.L((String)"disconnect.packetError"), var3, optional);
            class00642 class006422 = this.u;
            if (!this.N(class006422, class025702)) break block0;
            class006422.method_60924(class025702);
        }
    }

    public boolean method_52413(class00381<?> class003812) {
        if (super.method_52413(class003812)) {
            return true;
        }
        return this.Z && (class003812 instanceof class02872 || class003812 instanceof class02870);
    }
}


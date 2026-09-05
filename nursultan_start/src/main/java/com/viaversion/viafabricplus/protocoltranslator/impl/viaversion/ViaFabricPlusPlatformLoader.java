/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.events.LoadingCycleCallback
 *  com.viaversion.viafabricplus.api.events.LoadingCycleCallback$LoadingCycle
 *  com.viaversion.viafabricplus.base.Events
 *  com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.version.VersionProvider
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.PlayerLookTargetProvider
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.provider.PlayerAbilitiesProvider
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.provider.AckSequenceProvider
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.provider.PickItemProvider
 *  com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider
 *  com.viaversion.viaversion.protocols.v1_8to1_9.provider.HandItemProvider
 *  net.raphimc.viabedrock.protocol.provider.NettyPipelineProvider
 *  net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.AlphaInventoryProvider
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicMPPassProvider
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.provider.OldAuthProvider
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.provider.EncryptionProvider
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.viaversion;

import com.viaversion.viafabricplus.api.events.LoadingCycleCallback;
import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viabedrock.ViaFabricPlusNettyPipelineProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusAlphaInventoryProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusClassicMPPassProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusClassicWorldHeightProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusEncryptionProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusGameProfileFetcher;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusOldAuthProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusAckSequenceProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusBaseVersionProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusCommandArgumentsProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusCompressionProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusHandItemProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusPickItemProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusPlayerAbilitiesProvider;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusPlayerLookTargetProvider;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.PlayerLookTargetProvider;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.provider.PlayerAbilitiesProvider;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.provider.AckSequenceProvider;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.provider.PickItemProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.HandItemProvider;
import net.raphimc.viabedrock.protocol.provider.NettyPipelineProvider;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.AlphaInventoryProvider;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicMPPassProvider;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.provider.OldAuthProvider;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.provider.EncryptionProvider;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher;

public final class ViaFabricPlusPlatformLoader
implements ViaPlatformLoader {
    public void load() {
        ViaProviders viaProviders = Via.getManager().getProviders();
        viaProviders.use(VersionProvider.class, (Provider)new ViaFabricPlusBaseVersionProvider());
        viaProviders.use(HandItemProvider.class, (Provider)new ViaFabricPlusHandItemProvider());
        viaProviders.use(PlayerLookTargetProvider.class, (Provider)new ViaFabricPlusPlayerLookTargetProvider());
        viaProviders.use(PlayerAbilitiesProvider.class, (Provider)new ViaFabricPlusPlayerAbilitiesProvider());
        viaProviders.use(SignableCommandArgumentsProvider.class, (Provider)new ViaFabricPlusCommandArgumentsProvider());
        viaProviders.use(AckSequenceProvider.class, (Provider)new ViaFabricPlusAckSequenceProvider());
        viaProviders.use(PickItemProvider.class, (Provider)new ViaFabricPlusPickItemProvider());
        viaProviders.use(CompressionProvider.class, (Provider)new ViaFabricPlusCompressionProvider());
        viaProviders.use(OldAuthProvider.class, (Provider)new ViaFabricPlusOldAuthProvider());
        viaProviders.use(ClassicWorldHeightProvider.class, (Provider)new ViaFabricPlusClassicWorldHeightProvider());
        viaProviders.use(EncryptionProvider.class, (Provider)new ViaFabricPlusEncryptionProvider());
        viaProviders.use(GameProfileFetcher.class, (Provider)new ViaFabricPlusGameProfileFetcher());
        viaProviders.use(ClassicMPPassProvider.class, (Provider)new ViaFabricPlusClassicMPPassProvider());
        if (((Boolean)GeneralSettings.INSTANCE.emulateInventoryActionsInAlphaVersions.getValue()).booleanValue()) {
            viaProviders.use(AlphaInventoryProvider.class, (Provider)new ViaFabricPlusAlphaInventoryProvider());
        }
        viaProviders.use(NettyPipelineProvider.class, (Provider)new ViaFabricPlusNettyPipelineProvider());
        ((LoadingCycleCallback)Events.LOADING_CYCLE.invoker()).onLoadCycle(LoadingCycleCallback.LoadingCycle.POST_VIAVERSION_LOAD);
    }

    public void unload() {
    }
}


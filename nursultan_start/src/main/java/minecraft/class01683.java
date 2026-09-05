/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09350
 *  Nursultan.class09503
 *  Nursultan.class10401
 *  Nursultan.class10406
 *  Nursultan.class10511
 *  Nursultan.class10626
 *  Nursultan.class10958
 *  Nursultan.class10963
 *  Nursultan.class11387
 *  Nursultan.class11938
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.BlockChangeEvent
 *  baritone.api.event.events.ChatEvent
 *  baritone.api.event.events.ChunkEvent
 *  baritone.api.event.events.ChunkEvent$Type
 *  baritone.api.event.events.type.EventState
 *  baritone.api.utils.Pair
 *  baritone.cache.CachedChunk
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.hash.HashCode
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalIntRef
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.viaversion.viafabricplus.features.block.connections.BlockConnectionsEmulation1_12_2
 *  com.viaversion.viafabricplus.injection.access.base.IConnection
 *  com.viaversion.viafabricplus.injection.access.networking.downloading_terrain.ILevelLoadingScreen
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.visuals.features.r1_7_tab_list_style.LegacyTabList
 *  com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerTabOverlay
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.connection.ConnectionDetails
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class00005
 *  minecraft.class00011
 *  minecraft.class00014
 *  minecraft.class00034
 *  minecraft.class00044
 *  minecraft.class00057
 *  minecraft.class00147
 *  minecraft.class00166
 *  minecraft.class00179
 *  minecraft.class00231
 *  minecraft.class00250
 *  minecraft.class00251
 *  minecraft.class00257
 *  minecraft.class00261
 *  minecraft.class00265
 *  minecraft.class00268
 *  minecraft.class00269
 *  minecraft.class00272
 *  minecraft.class00278
 *  minecraft.class00279
 *  minecraft.class00290
 *  minecraft.class00329
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00402
 *  minecraft.class00417
 *  minecraft.class00427
 *  minecraft.class00437
 *  minecraft.class00444
 *  minecraft.class00449
 *  minecraft.class00457
 *  minecraft.class00458
 *  minecraft.class00474
 *  minecraft.class00475
 *  minecraft.class00479
 *  minecraft.class00480
 *  minecraft.class00481
 *  minecraft.class00482
 *  minecraft.class00486
 *  minecraft.class00495
 *  minecraft.class00496
 *  minecraft.class00499
 *  minecraft.class00502
 *  minecraft.class00503
 *  minecraft.class00504
 *  minecraft.class00509
 *  minecraft.class00512
 *  minecraft.class00514
 *  minecraft.class00516
 *  minecraft.class00518
 *  minecraft.class00520
 *  minecraft.class00521
 *  minecraft.class00524
 *  minecraft.class00530
 *  minecraft.class00535
 *  minecraft.class00536
 *  minecraft.class00541
 *  minecraft.class00554
 *  minecraft.class00557
 *  minecraft.class00564
 *  minecraft.class00569
 *  minecraft.class00570
 *  minecraft.class00573
 *  minecraft.class00627
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class00647
 *  minecraft.class00717
 *  minecraft.class00720
 *  minecraft.class00751
 *  minecraft.class00772
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01056
 *  minecraft.class01205
 *  minecraft.class01296
 *  minecraft.class01311
 *  minecraft.class01488
 *  minecraft.class01707
 *  minecraft.class01756
 *  minecraft.class01762
 *  minecraft.class01765
 *  minecraft.class01766
 *  minecraft.class01785
 *  minecraft.class01832
 *  minecraft.class01839
 *  minecraft.class01866
 *  minecraft.class01871
 *  minecraft.class01874
 *  minecraft.class01892
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01938
 *  minecraft.class01964
 *  minecraft.class02001
 *  minecraft.class02018
 *  minecraft.class02027
 *  minecraft.class02046
 *  minecraft.class02048
 *  minecraft.class02075
 *  minecraft.class02079
 *  minecraft.class02083
 *  minecraft.class02160
 *  minecraft.class02177
 *  minecraft.class02259
 *  minecraft.class02265
 *  minecraft.class02309
 *  minecraft.class02361
 *  minecraft.class02459
 *  minecraft.class02484
 *  minecraft.class02511
 *  minecraft.class02512
 *  minecraft.class02565
 *  minecraft.class02580
 *  minecraft.class02582
 *  minecraft.class02596
 *  minecraft.class02607
 *  minecraft.class02617
 *  minecraft.class02655
 *  minecraft.class02668
 *  minecraft.class02675
 *  minecraft.class02724
 *  minecraft.class02726
 *  minecraft.class02736
 *  minecraft.class02755
 *  minecraft.class02775
 *  minecraft.class02807
 *  minecraft.class02860
 *  minecraft.class02861
 *  minecraft.class02868
 *  minecraft.class02900
 *  minecraft.class03039
 *  minecraft.class03046
 *  minecraft.class03053
 *  minecraft.class03057
 *  minecraft.class03063
 *  minecraft.class03064
 *  minecraft.class03065
 *  minecraft.class03076
 *  minecraft.class03077
 *  minecraft.class03079
 *  minecraft.class03106
 *  minecraft.class03124
 *  minecraft.class03132
 *  minecraft.class03277
 *  minecraft.class03284
 *  minecraft.class03386
 *  minecraft.class03397
 *  minecraft.class03427
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class03458
 *  minecraft.class03461
 *  minecraft.class03516
 *  minecraft.class03519
 *  minecraft.class03556
 *  minecraft.class03578
 *  minecraft.class03590
 *  minecraft.class03598
 *  minecraft.class03711
 *  minecraft.class03717
 *  minecraft.class03722
 *  minecraft.class03737
 *  minecraft.class03767
 *  minecraft.class03771
 *  minecraft.class03869
 *  minecraft.class03926
 *  minecraft.class03953
 *  minecraft.class03961
 *  minecraft.class03962
 *  minecraft.class04022
 *  minecraft.class04167
 *  minecraft.class04175
 *  minecraft.class04183
 *  minecraft.class04190
 *  minecraft.class04348
 *  minecraft.class04406
 *  minecraft.class04410
 *  minecraft.class04450
 *  minecraft.class04453
 *  minecraft.class04455
 *  minecraft.class04459
 *  minecraft.class04462
 *  minecraft.class04464
 *  minecraft.class04465
 *  minecraft.class04469
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04563
 *  minecraft.class04568
 *  minecraft.class04606
 *  minecraft.class04610
 *  minecraft.class04622
 *  minecraft.class04626
 *  minecraft.class04658
 *  minecraft.class04680
 *  minecraft.class04891
 *  minecraft.class04907
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05036
 *  minecraft.class05043
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05320
 *  minecraft.class05345
 *  minecraft.class05351
 *  minecraft.class05384
 *  minecraft.class05429
 *  minecraft.class05487
 *  minecraft.class05499
 *  minecraft.class05528
 *  minecraft.class05630
 *  minecraft.class05671
 *  minecraft.class05705
 *  minecraft.class05707
 *  minecraft.class05733
 *  minecraft.class05795
 *  minecraft.class05850
 *  minecraft.class05851
 *  minecraft.class05858
 *  minecraft.class05866
 *  minecraft.class05871
 *  minecraft.class05873
 *  minecraft.class05946
 *  minecraft.class05995
 *  minecraft.class06069
 *  minecraft.class06086
 *  minecraft.class06095
 *  minecraft.class06113
 *  minecraft.class06132
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class06241
 *  minecraft.class06272
 *  minecraft.class06429
 *  minecraft.class06467
 *  minecraft.class06468
 *  minecraft.class06511
 *  minecraft.class06533
 *  minecraft.class06541
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06635
 *  minecraft.class06636
 *  minecraft.class06642
 *  minecraft.class06643
 *  minecraft.class06644
 *  minecraft.class06648
 *  minecraft.class06651
 *  minecraft.class06652
 *  minecraft.class06655
 *  minecraft.class06658
 *  minecraft.class06659
 *  minecraft.class06660
 *  minecraft.class06661
 *  minecraft.class06663
 *  minecraft.class06664
 *  minecraft.class06668
 *  minecraft.class06669
 *  minecraft.class06671
 *  minecraft.class06674
 *  minecraft.class06675
 *  minecraft.class06680
 *  minecraft.class06681
 *  minecraft.class06682
 *  minecraft.class06683
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06952
 *  minecraft.class06963
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07055
 *  minecraft.class07057
 *  minecraft.class07062
 *  minecraft.class07075
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07086
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07232
 *  minecraft.class07233
 *  minecraft.class07245
 *  minecraft.class07254
 *  minecraft.class07258
 *  minecraft.class07259
 *  minecraft.class07261
 *  minecraft.class07263
 *  minecraft.class07265
 *  minecraft.class07267
 *  minecraft.class07268
 *  minecraft.class07269
 *  minecraft.class07275
 *  minecraft.class07276
 *  minecraft.class07280
 *  minecraft.class07282
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07321
 *  minecraft.class07438
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07479
 *  minecraft.class07482
 *  minecraft.class07492
 *  minecraft.class07504
 *  minecraft.class07549
 *  minecraft.class07570
 *  minecraft.class07610
 *  minecraft.class07769
 *  minecraft.class07832
 *  minecraft.class07862
 *  minecraft.class08036
 *  minecraft.class08039
 *  minecraft.class08044
 *  minecraft.class08049
 *  minecraft.class08056
 *  minecraft.class08057
 *  minecraft.class08060
 *  minecraft.class08062
 *  minecraft.class08063
 *  minecraft.class08068
 *  minecraft.class08069
 *  minecraft.class08073
 *  minecraft.class08076
 *  minecraft.class08077
 *  minecraft.class08078
 *  minecraft.class08079
 *  minecraft.class08081
 *  minecraft.class08082
 *  minecraft.class08085
 *  minecraft.class08087
 *  minecraft.class08090
 *  minecraft.class08091
 *  minecraft.class08093
 *  minecraft.class08095
 *  minecraft.class08096
 *  minecraft.class08149
 *  minecraft.class08152
 *  minecraft.class08156
 *  minecraft.class08159
 *  minecraft.class08164
 *  minecraft.class08190
 *  minecraft.class08308
 *  minecraft.class08546
 *  minecraft.class08621
 *  minecraft.class08666
 *  minecraft.class08716
 *  minecraft.class08781
 *  minecraft.class08800
 *  minecraft.class08816
 *  net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 *  net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
 *  net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents$Unload
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents$Unload
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$AllowChat
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$AllowCommand
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$Chat
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ChatCanceled
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$Command
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$CommandCanceled
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ModifyChat
 *  net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ModifyCommand
 *  net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents$TagsLoaded
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  net.fabricmc.fabric.impl.command.client.ClientCommandInternals
 *  net.fabricmc.fabric.impl.command.client.ClientCommandInternals$LastReceivedCommandsPacketAccessor
 *  net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl
 *  net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon
 *  net.fabricmc.fabric.impl.recipe.sync.client.SynchronizedClientRecipesSetter
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.shader.ShaderCompileException
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09350;
import Nursultan.class09503;
import Nursultan.class10401;
import Nursultan.class10406;
import Nursultan.class10511;
import Nursultan.class10626;
import Nursultan.class10958;
import Nursultan.class10963;
import Nursultan.class11387;
import Nursultan.class11938;
import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.BlockChangeEvent;
import baritone.api.event.events.ChatEvent;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.type.EventState;
import baritone.api.utils.Pair;
import baritone.cache.CachedChunk;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.hash.HashCode;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.viaversion.viafabricplus.features.block.connections.BlockConnectionsEmulation1_12_2;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.injection.access.networking.downloading_terrain.ILevelLoadingScreen;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.visuals.features.r1_7_tab_list_style.LegacyTabList;
import com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerTabOverlay;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.connection.ConnectionDetails;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import minecraft.class00005;
import minecraft.class00011;
import minecraft.class00014;
import minecraft.class00034;
import minecraft.class00044;
import minecraft.class00057;
import minecraft.class00147;
import minecraft.class00166;
import minecraft.class00179;
import minecraft.class00231;
import minecraft.class00250;
import minecraft.class00251;
import minecraft.class00257;
import minecraft.class00261;
import minecraft.class00265;
import minecraft.class00268;
import minecraft.class00269;
import minecraft.class00272;
import minecraft.class00278;
import minecraft.class00279;
import minecraft.class00290;
import minecraft.class00329;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00402;
import minecraft.class00417;
import minecraft.class00427;
import minecraft.class00437;
import minecraft.class00444;
import minecraft.class00449;
import minecraft.class00457;
import minecraft.class00458;
import minecraft.class00474;
import minecraft.class00475;
import minecraft.class00479;
import minecraft.class00480;
import minecraft.class00481;
import minecraft.class00482;
import minecraft.class00486;
import minecraft.class00495;
import minecraft.class00496;
import minecraft.class00499;
import minecraft.class00502;
import minecraft.class00503;
import minecraft.class00504;
import minecraft.class00509;
import minecraft.class00512;
import minecraft.class00514;
import minecraft.class00516;
import minecraft.class00518;
import minecraft.class00520;
import minecraft.class00521;
import minecraft.class00524;
import minecraft.class00530;
import minecraft.class00535;
import minecraft.class00536;
import minecraft.class00541;
import minecraft.class00554;
import minecraft.class00557;
import minecraft.class00564;
import minecraft.class00569;
import minecraft.class00570;
import minecraft.class00573;
import minecraft.class00627;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class00647;
import minecraft.class00717;
import minecraft.class00720;
import minecraft.class00751;
import minecraft.class00772;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01056;
import minecraft.class01205;
import minecraft.class01296;
import minecraft.class01311;
import minecraft.class01488;
import minecraft.class01632;
import minecraft.class01658;
import minecraft.class01659;
import minecraft.class01679;
import minecraft.class01690;
import minecraft.class01707;
import minecraft.class01756;
import minecraft.class01762;
import minecraft.class01765;
import minecraft.class01766;
import minecraft.class01785;
import minecraft.class01832;
import minecraft.class01839;
import minecraft.class01866;
import minecraft.class01871;
import minecraft.class01874;
import minecraft.class01892;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01938;
import minecraft.class01964;
import minecraft.class02001;
import minecraft.class02018;
import minecraft.class02027;
import minecraft.class02046;
import minecraft.class02048;
import minecraft.class02075;
import minecraft.class02079;
import minecraft.class02083;
import minecraft.class02160;
import minecraft.class02177;
import minecraft.class02259;
import minecraft.class02265;
import minecraft.class02309;
import minecraft.class02361;
import minecraft.class02459;
import minecraft.class02484;
import minecraft.class02511;
import minecraft.class02512;
import minecraft.class02565;
import minecraft.class02580;
import minecraft.class02582;
import minecraft.class02596;
import minecraft.class02607;
import minecraft.class02617;
import minecraft.class02655;
import minecraft.class02668;
import minecraft.class02675;
import minecraft.class02724;
import minecraft.class02726;
import minecraft.class02736;
import minecraft.class02755;
import minecraft.class02775;
import minecraft.class02807;
import minecraft.class02860;
import minecraft.class02861;
import minecraft.class02868;
import minecraft.class02900;
import minecraft.class03039;
import minecraft.class03046;
import minecraft.class03053;
import minecraft.class03057;
import minecraft.class03063;
import minecraft.class03064;
import minecraft.class03065;
import minecraft.class03076;
import minecraft.class03077;
import minecraft.class03079;
import minecraft.class03106;
import minecraft.class03124;
import minecraft.class03132;
import minecraft.class03277;
import minecraft.class03284;
import minecraft.class03386;
import minecraft.class03397;
import minecraft.class03427;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class03458;
import minecraft.class03461;
import minecraft.class03516;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class03578;
import minecraft.class03590;
import minecraft.class03598;
import minecraft.class03711;
import minecraft.class03717;
import minecraft.class03722;
import minecraft.class03737;
import minecraft.class03767;
import minecraft.class03771;
import minecraft.class03869;
import minecraft.class03926;
import minecraft.class03953;
import minecraft.class03961;
import minecraft.class03962;
import minecraft.class04022;
import minecraft.class04167;
import minecraft.class04175;
import minecraft.class04183;
import minecraft.class04190;
import minecraft.class04348;
import minecraft.class04406;
import minecraft.class04410;
import minecraft.class04450;
import minecraft.class04453;
import minecraft.class04455;
import minecraft.class04459;
import minecraft.class04462;
import minecraft.class04464;
import minecraft.class04465;
import minecraft.class04469;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04563;
import minecraft.class04568;
import minecraft.class04606;
import minecraft.class04610;
import minecraft.class04622;
import minecraft.class04626;
import minecraft.class04658;
import minecraft.class04680;
import minecraft.class04891;
import minecraft.class04907;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05036;
import minecraft.class05043;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05320;
import minecraft.class05345;
import minecraft.class05351;
import minecraft.class05384;
import minecraft.class05429;
import minecraft.class05487;
import minecraft.class05499;
import minecraft.class05528;
import minecraft.class05630;
import minecraft.class05671;
import minecraft.class05705;
import minecraft.class05707;
import minecraft.class05733;
import minecraft.class05795;
import minecraft.class05850;
import minecraft.class05851;
import minecraft.class05858;
import minecraft.class05866;
import minecraft.class05871;
import minecraft.class05873;
import minecraft.class05946;
import minecraft.class05995;
import minecraft.class06069;
import minecraft.class06086;
import minecraft.class06095;
import minecraft.class06113;
import minecraft.class06132;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class06241;
import minecraft.class06272;
import minecraft.class06429;
import minecraft.class06467;
import minecraft.class06468;
import minecraft.class06511;
import minecraft.class06533;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06635;
import minecraft.class06636;
import minecraft.class06642;
import minecraft.class06643;
import minecraft.class06644;
import minecraft.class06648;
import minecraft.class06651;
import minecraft.class06652;
import minecraft.class06655;
import minecraft.class06658;
import minecraft.class06659;
import minecraft.class06660;
import minecraft.class06661;
import minecraft.class06663;
import minecraft.class06664;
import minecraft.class06668;
import minecraft.class06669;
import minecraft.class06671;
import minecraft.class06674;
import minecraft.class06675;
import minecraft.class06680;
import minecraft.class06681;
import minecraft.class06682;
import minecraft.class06683;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06952;
import minecraft.class06963;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07055;
import minecraft.class07057;
import minecraft.class07062;
import minecraft.class07075;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07232;
import minecraft.class07233;
import minecraft.class07245;
import minecraft.class07254;
import minecraft.class07258;
import minecraft.class07259;
import minecraft.class07261;
import minecraft.class07263;
import minecraft.class07265;
import minecraft.class07267;
import minecraft.class07268;
import minecraft.class07269;
import minecraft.class07275;
import minecraft.class07276;
import minecraft.class07280;
import minecraft.class07282;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07321;
import minecraft.class07438;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07479;
import minecraft.class07482;
import minecraft.class07492;
import minecraft.class07504;
import minecraft.class07549;
import minecraft.class07570;
import minecraft.class07610;
import minecraft.class07769;
import minecraft.class07832;
import minecraft.class07862;
import minecraft.class08036;
import minecraft.class08039;
import minecraft.class08044;
import minecraft.class08049;
import minecraft.class08056;
import minecraft.class08057;
import minecraft.class08060;
import minecraft.class08062;
import minecraft.class08063;
import minecraft.class08068;
import minecraft.class08069;
import minecraft.class08073;
import minecraft.class08076;
import minecraft.class08077;
import minecraft.class08078;
import minecraft.class08079;
import minecraft.class08081;
import minecraft.class08082;
import minecraft.class08085;
import minecraft.class08087;
import minecraft.class08090;
import minecraft.class08091;
import minecraft.class08093;
import minecraft.class08095;
import minecraft.class08096;
import minecraft.class08149;
import minecraft.class08152;
import minecraft.class08156;
import minecraft.class08159;
import minecraft.class08164;
import minecraft.class08190;
import minecraft.class08308;
import minecraft.class08546;
import minecraft.class08621;
import minecraft.class08666;
import minecraft.class08716;
import minecraft.class08781;
import minecraft.class08800;
import minecraft.class08816;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.command.client.ClientCommandInternals;
import net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon;
import net.fabricmc.fabric.impl.recipe.sync.client.SynchronizedClientRecipesSetter;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class01683
extends class01866
implements class03077,
class07280,
ClientCommandInternals.LastReceivedCommandsPacketAccessor,
NetworkHandlerExtensions {
    private static final Logger m = LogUtils.getLogger();
    private static final class00392 P = class00392.L((String)"multiplayer.unsecureserver.toast.title");
    private static final class00392 s = class00392.L((String)"multiplayer.unsecureserver.toast");
    private static final class00392 T = class00392.L((String)"multiplayer.disconnect.invalid_packet");
    private static final class00392 b = class00392.L((String)"connect.reconfiguring");
    private static final class00392 j = class00392.L((String)"multiplayer.disconnect.bad_chat_index");
    private static final class00392 v = class00392.L((String)"multiplayer.confirm_command.title");
    private static final class00392 n = class00392.L((String)"multiplayer.confirm_command.run_command");
    private static final class00392 t = class00392.L((String)"multiplayer.confirm_command.suggest_command");
    private static final int G = 64;
    public static final int N = 64;
    private static final class08159 l = class08190.N((String)"client/commands/restricted");
    static final class08164 y = new class08149(l);
    private static final class08152 d = class081592 -> class081592.equals((Object)l);
    private static final class07263<class03461> w = new class01679();
    private final GameProfile k;
    private class03448 Y;
    private class03427 Q;
    private final Map<UUID, class03458> O = Maps.newHashMap();
    private Set<class03458> g = new ReferenceOpenHashSet();
    private final class01707 I;
    private final class03461 J;
    private final class03461 o;
    private final class06429 q = new class06429(this);
    private int K = 3;
    private int V = 3;
    private final class06069 e = class06069.i();
    private CommandDispatcher<class03461> H = new CommandDispatcher();
    private class00290 c = new class00290(Map.of(), class00279.N());
    private final UUID X = UUID.randomUUID();
    private Set<class05946<class07299>> a;
    private final class01022 p;
    private final class03767 F;
    private final class06511 A;
    private class02755 f;
    private final class00147 C;
    private OptionalInt S = OptionalInt.empty();
    private @Nullable class02018 x;
    private class03065 D = class03065.N;
    private int h;
    private class03046 r = new class03046(20);
    private class03397 NN = class03397.N();
    private @Nullable CompletableFuture<Optional<class04450>> Ny;
    private @Nullable class03737 NL;
    private final class03722 Nu = new class03722();
    private final class03717 Ni;
    private final class06963 NR;
    private @Nullable class05384 NM;
    private boolean NB;
    private volatile boolean NZ;
    private final class06683 Nz = new class06683();
    private final class00057 NU = new class00057();
    private final class08666 NE = new class08666();
    private final List<WeakReference<class08546<?, ?>>> NW = new ArrayList();
    private boolean Nm;
    private ClientPlayNetworkAddon NP;
    private @Nullable class07233 Ns = null;
    private class00381 NT;

    public class02755 w() {
        return this.f;
    }

    private void L(String string, CallbackInfo callbackInfo) {
        StringReader stringReader = new StringReader(string);
        if (stringReader.canRead() && stringReader.peek() == ((Character)class10626.N_1).charValue()) {
            stringReader.skip();
            class11938.Y().N(stringReader);
            callbackInfo.cancel();
        }
    }

    public void L(String string) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)string);
        this.N(string, callbackInfo, (LocalRef)localRefImpl);
        string = (String)localRefImpl.dispose();
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.N(string, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        string = this.i(string);
        CallbackInfo callbackInfo3 = new CallbackInfo("", true);
        this.L(string, callbackInfo3);
        if (callbackInfo3.isCancelled()) {
            return;
        }
        Instant instant = Instant.now();
        long l = class05036.N();
        class03064 class030642 = this.r.y();
        class04469 class044692 = this.D.pack(new class03079(string, instant, l, class030642.N()));
        this.N((class00381)new class00573(string, instant, l, class044692, class030642.y()));
    }

    private void L(class00481 class004812, CallbackInfo callbackInfo) {
        ChunkTrackerHolder.get((class03448)this.Y).onChunkStatusRemoved(class004812.N().B, class004812.N().Z, 3);
    }

    private void L(CallbackInfo callbackInfo) {
        if (this.Y != null) {
            for (class07049 class070492 : this.Y.M()) {
                ((ClientEntityEvents.Unload)ClientEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(class070492, this.Y);
            }
            for (class07049 class070492 : ((LoadedChunksCache)this.Y).fabric_getLoadedChunks()) {
                for (class00394 class003942 : class070492.o().values()) {
                    ((ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003942, this.Y);
                }
            }
        }
    }

    public class03461 L() {
        return this.J;
    }

    private void L(class00482 class004822, CallbackInfo callbackInfo) {
        CommandDispatcher commandDispatcher = new CommandDispatcher();
        ClientCommandInternals.setActiveDispatcher((CommandDispatcher)commandDispatcher);
        ((ClientCommandRegistrationCallback)ClientCommandRegistrationCallback.EVENT.invoker()).register(commandDispatcher, class04348.N((class01929)this.p, (class03767)this.F));
        ClientCommandInternals.finalizeInit();
    }

    public class00642 M() {
        return this.u;
    }

    private class01690 M(String string) {
        ParseResults var2 = this.H.parse(string, (Object)this.J);
        if (!class01683.N(var2)) {
            return class01690.field_60787;
        }
        if (class03039.N((ParseResults)var2)) {
            return class01690.field_60788;
        }
        if (!class01683.N(this.H.parse(string, (Object)this.o))) {
            return class01690.field_60789;
        }
        return class01690.field_60786;
    }

    public class03448 P() {
        return this.Y;
    }

    private void X() {
        if (!this.I()) {
            this.u.method_10743((class00381)new class08816());
            this.N(true);
        }
    }

    public UUID T() {
        return this.X;
    }

    public class00147 Q() {
        return this.C;
    }

    public class01683(class06202 class062022, class00642 class006422, class01892 class018922) {
        super(class062022, class006422, class018922);
        this.k = class018922.y();
        this.p = class018922.u();
        class03519 class035192 = this.p.N((DynamicOps)class00166.L);
        this.C = class024802 -> ((HashCode)class024802.N((DynamicOps)class035192).getOrThrow(string -> new IllegalArgumentException("Failed to hash " + String.valueOf(class024802) + ": " + string))).asInt();
        this.F = class018922.i();
        this.I = new class01707(class062022, this.M);
        class08152 class081522 = class081592 -> {
            class04453 class044532 = (class04453)class062022.T_4;
            return class044532 != null && class044532.method_75004().hasPermission(class081592);
        };
        this.J = new class03461(this, class062022, class081522.N(d));
        this.o = new class03461(this, class062022, class08152.M);
        this.Ni = new class03717(this, class062022.ND().z());
        this.NR = new class06963(this, class062022.ND());
        if (class018922.z() != null) {
            ((class01056)class062022.i_6).i().N(class018922.z());
        }
        this.A = class06511.N((class03767)this.F);
        this.f = class02755.N((class01929)class018922.u(), (class03767)this.F);
        this.NM = class018922.N();
        this.y((CallbackInfo)null);
        this.N(class062022, class006422, class018922, null);
    }

    public Collection<class03458> B() {
        return this.g;
    }

    public boolean I() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.Nm;
    }

    public ClientPlayNetworkAddon getAddon() {
        return this.NP;
    }

    public Collection<class03458> Z() {
        return this.O.values();
    }

    private void e() {
        Iterator<WeakReference<class08546<?, ?>>> var1 = this.NW.iterator();
        while (var1.hasNext()) {
            class08546 var3 = (class08546)var1.next().get();
            if (var3 == null) continue;
            var3.N();
        }
        this.NW.clear();
    }

    private void i(class00482 class004822, CallbackInfo callbackInfo) {
        if ((class04453)class06202.Nq().T_4 == null) {
            return;
        }
        Iris.getUpdateChecker().getUpdateMessage().ifPresent(class003922 -> ((class04453)class06202.Nq().T_4).method_7353(class003922, false));
        Iris.getStoredError().ifPresent(exception -> ((class04453)class06202.Nq().T_4).method_7353((class00392)class00392.L((String)(exception instanceof ShaderCompileException ? "iris.load.failure.shader" : "iris.load.failure.generic")).y((class00392)class00392.y((String)"Copy Info").N(class004052 -> class004052.L(Boolean.valueOf(true)).N(class06541.field_1078).N((class00647)new class00627(exception.getMessage())).N((class00395)new class00401((class00392)class00392.L((String)"chat.copy.click"))))), false));
        if (Iris.loadedIncompatiblePack()) {
            ((class01056)class06202.Nq().i_6).N(10, 70, 140);
            Iris.logger.warn("Incompatible pack for DH!");
            ((class04453)class06202.Nq().T_4).method_7353((class00392)class00392.y((String)"This pack doesn't have DH support.").N(new class06541[]{class06541.field_1067, class06541.field_1061}), false);
            ((class04453)class06202.Nq().T_4).method_7353((class00392)class00392.y((String)"Distant Horizons (DH) chunks won't show up. This isn't a bug, get another shader.").N(class06541.field_1061), false);
        }
    }

    public String i(String string) {
        class10958 class109582 = class10958.N((String)string);
        class11938.L().L((Object)class109582);
        return class109582.N();
    }

    public void i() {
        this.L((CallbackInfo)null);
        this.e();
        this.Y = null;
        this.NM = null;
    }

    public Set<class05946<class07299>> b() {
        return this.a;
    }

    public class06429 s() {
        return this.q;
    }

    private void c() {
        int n = this.r.N();
        if (n > 0) {
            this.N((class00381)new class03076(n));
        }
    }

    protected class08781 n() {
        return new class09503(this);
    }

    public class06683 l() {
        return this.Nz;
    }

    public class06511 d() {
        return this.A;
    }

    public CommandDispatcher<class03461> m() {
        return this.H;
    }

    public void k() {
        this.NE.N();
    }

    public @Nullable class04568 t() {
        return this.i;
    }

    public class00457 g() {
        return this.NR.N((class07299)this.Y);
    }

    public void v() {
        this.Ny = this.L.c().N();
    }

    public class01022 j() {
        return this.p;
    }

    public Map<UUID, class03458> U() {
        return this.E;
    }

    public Collection<UUID> z() {
        return this.O.keySet();
    }

    public void u(String string2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)string2);
        this.y(string2, callbackInfo, (LocalRef)localRefImpl);
        string2 = (String)localRefImpl.dispose();
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.y(string2, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        class03039 var2 = class03039.y((ParseResults)this.H.parse(string2 = this.R(string2), (Object)this.J));
        List var11 = var2.N();
        if (this.N(var11)) {
            this.N((class00381)new class03961(string2));
            return;
        }
        Instant instant = Instant.now();
        long l = class05036.N();
        class03064 class030642 = this.r.y();
        class04455 class044552 = class04455.N((class03039)var2, string -> {
            class03079 class030792 = new class03079(string, instant, l, class030642.N());
            return this.D.pack(class030792);
        });
        this.N((class00381)new class02177(string2, instant, l, class044552, class030642.y()));
    }

    public void u() {
        this.NZ = true;
        this.i();
        this.M.L();
    }

    private void u(class00482 class004822, CallbackInfo callbackInfo) {
        if (this.Y != null) {
            for (class07049 class070492 : this.Y.M()) {
                ((ClientEntityEvents.Unload)ClientEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(class070492, this.Y);
            }
            for (class07049 class070492 : ((LoadedChunksCache)this.Y).fabric_getLoadedChunks()) {
                for (class00394 class003942 : class070492.o().values()) {
                    ((ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003942, this.Y);
                }
            }
        }
    }

    private void y(CallbackInfo callbackInfo) {
        this.NP = new ClientPlayNetworkAddon(this, this.L);
        ClientNetworkingImpl.setClientPlayAddon((ClientPlayNetworkAddon)this.NP);
        this.NP.lateInit();
    }

    private void y(class00482 class004822, CallbackInfo callbackInfo) {
        this.NP.onServerReady();
    }

    public @Nullable class03458 y(String string) {
        for (class03458 class034582 : this.O.values()) {
            if (!class034582.N().name().equalsIgnoreCase(string)) continue;
            return class034582;
        }
        return null;
    }

    private void y(String string, CallbackInfo callbackInfo, LocalRef localRef) {
        if (((ClientSendMessageEvents.AllowCommand)ClientSendMessageEvents.ALLOW_COMMAND.invoker()).allowSendCommandMessage((String)localRef.get())) {
            localRef.set((Object)((ClientSendMessageEvents.ModifyCommand)ClientSendMessageEvents.MODIFY_COMMAND.invoker()).modifySendCommandMessage((String)localRef.get()));
            ((ClientSendMessageEvents.Command)ClientSendMessageEvents.COMMAND.invoker()).onSendCommandMessage((String)localRef.get());
        } else {
            ((ClientSendMessageEvents.CommandCanceled)ClientSendMessageEvents.COMMAND_CANCELED.invoker()).onSendCommandMessageCanceled((String)localRef.get());
            callbackInfo.cancel();
        }
    }

    private void y(class01659 class016592) {
        m.warn("Unknown custom packet payload: {}", (Object)class016592.method_56479().N());
    }

    private void y(String string, CallbackInfo callbackInfo) {
        if (ClientCommandInternals.executeCommand((String)string)) {
            callbackInfo.cancel();
        }
    }

    private void y(class07233 class072332, CallbackInfo callbackInfo) {
        this.Ns = class072332;
    }

    private void y(class00481 class004812, CallbackInfo callbackInfo) {
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            class04453 class044532 = iBaritone.getPlayerContext().player();
            if (class044532 == null || (class01683)((Object)class044532.y_0) != this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, ChunkEvent.Type.UNLOAD, class004812.N().B, class004812.N().Z));
        }
    }

    private void y(class04190 class041902, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            this.u.field_11651.config().setAutoRead(true);
        }
    }

    private boolean y(class07049 class070492) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3) || ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            class07438 class074382 = class070492.method_5642();
            return class074382 instanceof class08036 ? ((class08036)class074382).method_7340() : !class070492.method_73183().method_8608();
        }
        return class070492.method_66247();
    }

    private boolean y(Logger logger, String string, Object object) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_4);
    }

    private void y(String string, String string2, @Nullable class05096 class050962) {
        boolean bl = class050962 == null && this.L.b().N(this.L.q());
        this.N(string, string2, bl ? t : class05220.P, () -> {
            if (bl) {
                this.L.N(class06468.field_62005);
                class05096 class050963 = (class05096)this.L.v_3;
                if (class050963 instanceof class01311) {
                    ((class01311)class050963).method_25415(string, false);
                }
            } else {
                ((class06197)this.L.L_3).N("/" + string);
                this.L.N(class050962);
            }
        });
    }

    private void y(class06663 class066632, CallbackInfo callbackInfo) {
        if (this.NT != null) {
            this.u.method_10743(this.NT);
            this.NT = null;
        }
    }

    private boolean y(class01683 class016832) {
        return this.H() || VisualSettings.INSTANCE.disableSecureChatWarning.isEnabled();
    }

    private void y(String string, class05096 class050962, CallbackInfo callbackInfo) {
        StringReader stringReader = new StringReader(string);
        if (stringReader.canRead() && stringReader.peek() == ((Character)class10626.N_1).charValue()) {
            stringReader.skip();
            class11938.Y().N(stringReader);
            callbackInfo.cancel();
            class06202.Nq().N(class050962);
        }
    }

    private void y(class07259 class072592, CallbackInfo callbackInfo) {
        BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections((class05487)this.Y, (class07209)class072592.y());
    }

    private @Nullable class07049 y(class07276 class072762) {
        class07078 var2 = class072762.L();
        if (var2 == class07078.Ly) {
            class03458 class034582 = this.N(class072762.y());
            if (class034582 == null) {
                m.warn("Server attempted to add player prior to sending player info (Player id {})", (Object)class072762.y());
                return null;
            }
            return new class10401(this.Y, class034582.N());
        }
        return var2.N((class07299)this.Y, class06113.field_52444);
    }

    private void y(class00481 class004812) {
        class07321 class073212 = class004812.N();
        this.Y.N(() -> {
            int n;
            class05795 class057952 = this.Y.method_22336();
            class057952.N(class073212, false);
            for (n = class057952.u(); n < class057952.i(); ++n) {
                class01296 class012962 = class01296.N((class07321)class073212, (int)n);
                class057952.N(class00772.field_9282, class012962, null);
                class057952.N(class00772.field_9284, class012962, null);
            }
            for (n = this.Y.method_32891(); n <= this.Y.method_31597(); ++n) {
                class057952.N(class01296.N((class07321)class073212, (int)n), true);
            }
        });
    }

    public GameProfile E() {
        return this.k;
    }

    public void N(class03598 class035982) {
        class00417.N((class00381)class035982, (class00638)this, (class00458)this.L.B());
        for (class03590 class035902 : class035982.N()) {
            this.Y.method_8398().N(class035902.y().B, class035902.y().Z, class035902.N());
        }
        for (class03590 class035902 : class035982.N()) {
            this.Y.N(new class07321(class035902.y().B, class035902.y().Z));
        }
        for (class03590 class035902 : class035982.N()) {
            for (int i = -1; i <= 1; ++i) {
                for (int j = -1; j <= 1; ++j) {
                    for (int k = this.Y.method_32891(); k <= this.Y.method_31597(); ++k) {
                        ((class03063)this.L.B_2).N(class035902.y().B + i, k, class035902.y().Z + j);
                    }
                }
            }
        }
    }

    private void N(String string, CallbackInfo callbackInfo, LocalRef localRef) {
        if (((ClientSendMessageEvents.AllowChat)ClientSendMessageEvents.ALLOW_CHAT.invoker()).allowSendChatMessage((String)localRef.get())) {
            localRef.set((Object)((ClientSendMessageEvents.ModifyChat)ClientSendMessageEvents.MODIFY_CHAT.invoker()).modifySendChatMessage((String)localRef.get()));
            ((ClientSendMessageEvents.Chat)ClientSendMessageEvents.CHAT.invoker()).onSendChatMessage((String)localRef.get());
        } else {
            ((ClientSendMessageEvents.ChatCanceled)ClientSendMessageEvents.CHAT_CANCELED.invoker()).onSendChatMessageCanceled((String)localRef.get());
            callbackInfo.cancel();
        }
    }

    public void N(class00514 class005142) {
        class00417.N((class00381)class005142, (class00638)this, (class00458)this.L.B());
        int n = class005142.N();
        int n2 = class005142.y();
        this.N(n, n2, class005142.L());
        class01832 class018322 = class005142.u();
        this.Y.N(() -> {
            this.N(n, n2, class018322, false);
            class00570 class005702 = this.Y.method_8398().N(n, n2, false);
            if (class005702 != null) {
                this.N(class005702, n, n2);
                ((class03063)this.L.B_2).N(class005702.R());
            }
        });
        this.N_30(class005142, null);
    }

    public void N(class02582 class025822) {
        class00417.N((class00381)class025822, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = class025822.N((class07299)this.Y);
        if (!(class070492 instanceof class07504)) {
            return;
        }
        class07504 class075042 = (class07504)class070492;
        class02736 class027362 = class075042.N();
        if (class027362 instanceof class02726) {
            ((class02726)class027362).i.addAll(class025822.y());
        }
    }

    public void N(class07261 class072612) {
        class00417.N((class00381)class072612, (class00638)this, (class00458)this.L.B());
        class072612.N((T class072092, U class005002) -> this.Y.N(class072092, class005002, 19));
        this.N_31(class072612, null);
    }

    private void N(int n, int n2, class01839 class018392) {
        this.Y.method_8398().N(n, n2, class018392.N(), class018392.y(), class018392.N(n, n2));
        this.N(n, n2, class018392, null);
    }

    public void N(class06658 class066582) {
        class00417.N((class00381)class066582, (class00638)this, (class00458)this.L.B());
        class066582.N().forEach(n -> {
            class07049 class070492 = this.Y.method_8469(n);
            if (class070492 == null) {
                return;
            }
            if (class070492.method_5821((class07049)((class04453)this.L.T_4))) {
                m.debug("Remove entity {}:{} that has player as passenger", (Object)class070492.method_5864(), (Object)n);
                this.S = OptionalInt.of(n);
            }
            this.Y.N(n, class07062.field_26999);
            this.NR.N(class070492);
        });
    }

    private void N(class02675 class026752, CallbackInfo callbackInfo) {
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            class04453 class044532 = iBaritone.getPlayerContext().player();
            if (class044532 == null || (class01683)((Object)class044532.y_0) != this) continue;
            iBaritone.getGameEventHandler().onPlayerDeath();
        }
    }

    private void N_31(class07261 class072612, CallbackInfo callbackInfo) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForConnection(this);
        if (iBaritone == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        class072612.N((T class072092, U class005002) -> arrayList.add(new Pair((Object)class072092.method_10062(), class005002)));
        if (arrayList.isEmpty()) {
            return;
        }
        iBaritone.getGameEventHandler().onBlockChange(new BlockChangeEvent(new class07321((class07209)((Pair)arrayList.get(0)).first()), arrayList));
    }

    private void N(class07233 class072332, CallbackInfo callbackInfo) {
        ClientCommandInternals.addCommands(this.H, (FabricClientCommandSource)((FabricClientCommandSource)this.J));
    }

    public void N(class06644 class066442) {
        class00417.N((class00381)class066442, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = class066442.N((class07299)this.Y);
        if (class070492 == null) {
            return;
        }
        class070492.method_5683(class066442.N(), 3);
    }

    private void N(String string, class05096 class050962, CallbackInfo callbackInfo) {
        if (ClientCommandInternals.executeCommand((String)string)) {
            callbackInfo.cancel();
        }
    }

    private void N_30(class00514 class005142, CallbackInfo callbackInfo) {
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            class04453 class044532 = iBaritone.getPlayerContext().player();
            if (class044532 == null || (class01683)((Object)class044532.y_0) != this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, !class005142.i() ? ChunkEvent.Type.POPULATE_FULL : ChunkEvent.Type.POPULATE_PARTIAL, class005142.N(), class005142.y()));
        }
    }

    private void N(String string, CallbackInfo callbackInfo) {
        ChatEvent chatEvent = new ChatEvent(string);
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)this.L.T_4);
        if (iBaritone == null) {
            return;
        }
        iBaritone.getGameEventHandler().onSendChatMessage(chatEvent);
        if (chatEvent.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    public static boolean N(class08716 class087162, Set<class06681> set, class07049 class070492, boolean bl) {
        boolean bl2;
        class08716 class087163 = class08716.N((class07049)class070492);
        class08716 class087164 = class08716.N((class08716)class087163, (class08716)class087162, set);
        boolean bl3 = bl2 = class087163.N().M(class087164.N()) > 4096.0;
        if (bl && !bl2) {
            class01683.N(class070492, class087164.N(), class087164.L(), class087164.u());
            class070492.method_18799(class087164.y());
            return true;
        }
        class070492.method_33574(class087164.N());
        class070492.method_18799(class087164.y());
        class070492.method_36456(class087164.L());
        class070492.method_36457(class087164.u());
        class08716 class087165 = class08716.N((class08716)new class08716(class070492.method_61411(), class06889.L, class070492.field_5982, class070492.field_6004), (class08716)class087162, set);
        class070492.method_63615(class087165.N(), class087165.L(), class087165.u());
        return false;
    }

    public void N(class00261 class002612) {
        class00417.N((class00381)class002612, (class00638)this, (class00458)this.L.B());
        class04453 class044532 = (class04453)this.L.T_4;
        Set var3 = class06681.N((boolean)class002612.y(), (boolean)class002612.u());
        class08716 class087162 = class08716.N((class07049)class044532);
        class08716 class087163 = class08716.N((class08716)class087162, (class08716)class087162.N(class002612.N(), class002612.L()), (Set)var3);
        class044532.method_36456(class087163.L());
        class044532.method_36457(class087163.u());
        class044532.method_63614();
        this.u.method_10743((class00381)new class00530(class044532.method_36454(), class044532.method_36455(), false, false));
    }

    private void N(class00481 class004812, CallbackInfo callbackInfo) {
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            class04453 class044532 = iBaritone.getPlayerContext().player();
            if (class044532 == null || (class01683)((Object)class044532.y_0) != this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.PRE, ChunkEvent.Type.UNLOAD, class004812.N().B, class004812.N().Z));
        }
    }

    public void N(class06663 class066632) {
        class08078 class080782;
        class00642 class006422;
        class00417.N((class00381)class066632, (class00638)this, (class00458)this.L.B());
        class04453 class044532 = (class04453)this.L.T_4;
        if (!class044532.method_5765()) {
            class01683.N(class066632.y(), class066632.L(), (class07049)class044532, false);
        }
        if (this.N(class006422 = this.u, (class00381)(class080782 = new class08078(class066632.N())))) {
            class006422.method_10743((class00381)class080782);
        }
        this.u.method_10743((class00381)new class00564(class044532.method_23317(), class044532.method_23318(), class044532.method_23321(), class044532.method_36454(), class044532.method_36455(), false, false));
        this.N(class066632, null);
        this.y(class066632, null);
    }

    private void N(class07259 class072592, CallbackInfo callbackInfo) {
        if (!((Boolean)Baritone.settings().repackOnAnyBlockChange.value).booleanValue()) {
            return;
        }
        if (!CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.contains((Object)class072592.N().i())) {
            return;
        }
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            class04453 class044532 = iBaritone.getPlayerContext().player();
            if (class044532 == null || (class01683)((Object)class044532.y_0) != this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, ChunkEvent.Type.POPULATE_FULL, class072592.y().method_10263() >> 4, class072592.y().method_10260() >> 4));
        }
    }

    public void N(class04464 class044642) {
        class00417.N((class00381)class044642, (class00638)this, (class00458)this.L.B());
        int n = this.h++;
        if (class044642.N() != n) {
            m.error("Missing or out-of-order chat message from server, expected index {} but got {}", (Object)n, (Object)class044642.N());
            this.u.method_10747(j);
            return;
        }
        Optional var3 = class044642.M().N(this.NN);
        if (var3.isEmpty()) {
            Logger logger = m;
            String string = "Message from player with ID {} referenced unrecognized signature id";
            UUID uUID = class044642.y();
            if (this.N(logger, string, uUID)) {
                logger.error(string, (Object)uUID);
            }
            this.u.method_10747(T);
            return;
        }
        this.NN.N((class03079)var3.get(), class044642.u());
        UUID uUID = class044642.y();
        class03458 class034582 = this.N(uUID);
        if (class034582 == null) {
            Logger logger = m;
            String string = "Received player chat packet for unknown player with ID: {}";
            UUID uUID2 = uUID;
            if (this.N(logger, string, uUID2)) {
                logger.error(string, (Object)uUID2);
            }
            this.L.N().N(uUID, class044642.u(), class044642.z());
            return;
        }
        class02027 class020272 = class034582.y();
        class02083 class020832 = class020272 != null ? new class02083(class044642.L(), uUID, class020272.L()) : class02083.N((UUID)uUID);
        class03926 class039262 = new class03926(class020832, class044642.u(), (class03079)var3.get(), class044642.B(), class044642.Z());
        class039262 = class034582.L().method_45048(class039262);
        if (class039262 != null) {
            this.L.N().N(class039262, class034582.N(), class044642.z());
        } else {
            this.L.N().N(uUID, class044642.u(), class044642.z());
        }
    }

    public void N(class02046 class020462) {
        class00417.N((class00381)class020462, (class00638)this, (class00458)this.L.B());
        this.L.N().N(class020462.N(), class020462.y());
    }

    public boolean N(class03767 class037672) {
        return class037672.N(this.G());
    }

    public void N(class03053 class030532) {
        class00417.N((class00381)class030532, (class00638)this, (class00458)this.L.B());
        Optional var2 = class030532.N().N(this.NN);
        if (var2.isEmpty()) {
            this.u.method_10747(T);
            return;
        }
        this.r.N((class04469)var2.get());
        if (!this.L.N().N((class04469)var2.get())) {
            ((class01056)this.L.i_6).i().N((class04469)var2.get());
        }
    }

    public void N(class04459 class044592) {
        class00417.N((class00381)class044592, (class00638)this, (class00458)this.L.B());
        this.L.N().N(class044592.N(), class044592.y());
    }

    public void N(class08081 class080812) {
        class00417.N((class00381)class080812, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class080812.N());
        class07438 class074382 = (class07438)this.Y.method_8469(class080812.y());
        if (class074382 == null) {
            class074382 = (class04453)this.L.T_4;
        }
        if (class070492 != null) {
            if (class070492 instanceof class07057) {
                this.Y.method_8486(class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class04909.Us, class04911.field_15248, 0.1f, (this.e.z() - this.e.z()) * 0.35f + 0.9f, false);
            } else {
                this.Y.method_8486(class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class04909.sJ, class04911.field_15248, 0.2f, (this.e.z() - this.e.z()) * 1.4f + 2.0f, false);
            }
            class08800 class088002 = this.L.Ng().y(class070492, 1.0f);
            ((class04410)this.L.i_0).N((class04406)new class03869(this.Y, class088002, (class07049)class074382, class070492.method_18798()));
            if (class070492 instanceof class00717) {
                class06584 class065842 = ((class00717)class070492).N();
                if (!class065842.R()) {
                    class065842.B(class080812.L());
                }
                if (class065842.R()) {
                    this.Y.N(class080812.N(), class07062.field_26999);
                }
            } else if (!(class070492 instanceof class07057)) {
                this.Y.N(class080812.N(), class07062.field_26999);
            }
        }
    }

    public void N(class08546<?, ?> class085462) {
        this.NW.add(new WeakReference(class085462));
    }

    public void N(class08068 class080682) {
        class00417.N((class00381)class080682, (class00638)this, (class00458)this.L.B());
        this.Y.N(class080682.N(), class080682.y(), class080682.L());
        this.M.N(class080682.N());
    }

    public void N(class03737 class037372) {
        if (!class037372.equals((Object)this.NL)) {
            this.N((class00381)new class00541(class037372));
            this.NL = class037372;
        }
    }

    public void N(class08096 class080962) {
        class00417.N((class00381)class080962, (class00638)this, (class00458)this.L.B());
        ((class03448)this.L.T_3).method_27873(class080962.N());
        this.N(class080962, null);
    }

    private void N(String string, String string2, @Nullable class05096 class050962) {
        this.N(string, string2, n, () -> {
            class03961 class039612 = new class03961(string);
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.y(string, class050962, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            this.N((class00381)class039612);
            this.L.N(class050962);
        });
    }

    public void N(class03277 class032772) {
        class00417.N((class00381)class032772, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class032772.N());
        if (class070492 == null) {
            return;
        }
        class070492.method_5879(class032772.y());
    }

    private void N(class04450 class044502) {
        if (!this.L.y(this.k.id())) {
            return;
        }
        if (this.x != null && this.x.L().equals((Object)class044502)) {
            return;
        }
        this.x = class02018.N((class04450)class044502);
        this.D = this.x.N(this.k.id());
        this.N((class00381)new class02075(this.x.N().N()));
    }

    public void N(class07268 class072682) {
        class00417.N((class00381)class072682, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class072682.N());
        if (class070492 == null) {
            return;
        }
        if (class072682.y() == 0) {
            class07438 class074382 = (class07438)class070492;
            class074382.method_6104(class07050.field_5808);
        } else if (class072682.y() == 3) {
            class07438 class074383 = (class07438)class070492;
            class074383.method_6104(class07050.field_5810);
        } else if (class072682.y() == 2) {
            class08036 class080362 = (class08036)class070492;
            class080362.method_7358(false, false);
        } else if (class072682.y() == 4) {
            ((class04410)this.L.i_0).N(class070492, (class07126)class07107.M);
        } else if (class072682.y() == 5) {
            ((class04410)this.L.i_0).N(class070492, (class07126)class07107.j);
        }
    }

    private void N(class00570 class005702, int n, int n2) {
        class05795 class057952 = this.Y.method_8398().L();
        class00554[] class00554Array = class005702.u();
        class07321 class073212 = class005702.R();
        for (int i = 0; i < class00554Array.length; ++i) {
            class00554 class005542 = class00554Array[i];
            int n3 = this.Y.method_31604(i);
            class057952.N(class01296.N((class07321)class073212, (int)n3), class005542.L());
        }
        this.Y.y(n - 1, this.Y.method_32891(), n2 - 1, n + 1, this.Y.method_31597(), n2 + 1);
    }

    public void N(class04190 class041902) {
        this.N(class041902, null);
        class00417.N((class00381)class041902, (class00638)this, (class00458)this.L.B());
        this.L.N().u();
        class01683 class016832 = this;
        if (this.N(class016832)) {
            class016832.c();
        }
        class06467 class064672 = ((class01056)this.L.i_6).i().U();
        this.L.L((class05096)new class01871(b, this.u));
        this.u.method_56330(class02868.u, (class00638)new class01874(this.L, this.u, new class01892(new class05384(), this.k, this.M, this.p, this.F, this.R, this.i, this.B, this.z, class064672, this.U, this.o(), this.E, this.W)));
        this.N((class00381)class04183.N);
        this.u.method_56329(class02868.y);
        this.y(class041902, null);
    }

    public void N(class07259 class072592) {
        class00417.N((class00381)class072592, (class00638)this, (class00458)this.L.B());
        this.Y.N(class072592.y(), class072592.N(), 19);
        this.N(class072592, null);
        this.y(class072592, null);
    }

    private void N(boolean bl) {
        this.Nm = bl;
    }

    public void N(class00481 class004812) {
        this.N(class004812, null);
        class00417.N((class00381)class004812, (class00638)this, (class00458)this.L.B());
        this.Y.method_8398().N(class004812.N());
        this.NR.N(class004812.N());
        this.y(class004812);
        this.y(class004812, null);
        this.L(class004812, null);
    }

    private boolean N(Logger logger, String string, Object object) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_2);
    }

    private boolean N(class01683 class016832, class04453 class044532, class03448 class034482, class05858 class058582, class05946 class059462) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_3) || class059462 != ((class04453)this.L.T_4).method_73183().method_27983();
    }

    private class06241 N(class06584 class065842) {
        if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_5) || class065842.N(class06570.GE)) {
            return class06241.N((class06584)class065842);
        }
        return null;
    }

    private boolean N(class01683 class016832) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_5);
    }

    private void N(class04453 class044532, class07282 class072822) {
        if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20)) {
            class044532.N(class072822);
        }
    }

    public void N(class07276 class072762) {
        UUID uUID;
        class03458 class034582;
        class07049 class070492;
        class00417.N((class00381)class072762, (class00638)this, (class00458)this.L.B());
        if (this.S.isPresent() && this.S.getAsInt() == class072762.N()) {
            this.S = OptionalInt.empty();
        }
        if ((class070492 = this.y(class072762)) != null) {
            class070492.method_31471(class072762);
            this.Y.u(class070492);
            this.N(class070492);
        } else {
            m.warn("Skipping Entity with id {}", (Object)class072762.L());
        }
        if (class070492 instanceof class08036 && (class034582 = this.O.get(uUID = ((class08036)class070492).method_5667())) != null) {
            this.E.put(uUID, class034582);
        }
    }

    private boolean N(Logger logger, String string, Object object, Object object2) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_3);
    }

    private boolean N(OptionalInt optionalInt) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21) && optionalInt.isPresent();
    }

    private boolean N(class04465 class044652, class06889 class068892) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2);
    }

    private boolean N(class00642 class006422, class00381 class003812) {
        boolean bl = ProtocolTranslator.getTargetVersion().equalTo(ProtocolVersion.v1_21_2);
        if (bl) {
            this.NT = class003812;
        }
        return !bl;
    }

    private double N(class06889 class068892, class06889 class068893) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
            return 2.147483647E9;
        }
        return class068892.R(class068893);
    }

    private void N(Logger logger, String string, Object object, Object object2, class06651 class066512) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            class07209 class072092 = class066512.N();
            class07267 class072672 = new class07267(class072092, this.Y.method_8320(class072092));
            class072672.N((class07299)this.Y);
            ((class04453)this.L.T_4).method_7311(class072672, class066512.y());
        } else {
            logger.warn(string, object, object2);
        }
    }

    private boolean N(class05320 class053202, class05320 class053203) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21);
    }

    private void N(class06202 class062022, class05096 class050962, int n) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            if (n == 0) {
                ((class01683)((Object)((class04453)this.L.T_4).y_0)).N((class00381)new class00535(class00569.field_12774));
                this.L.N((class05096)new class05850(this.NM, class05858.field_51488));
            } else if (n == 1) {
                class062022.N(class050962);
            }
        } else {
            class062022.N(class050962);
        }
    }

    private void N(class06202 class062022, class05096 class050962, LocalIntRef localIntRef) {
        this.N(class062022, class050962, localIntRef.get());
    }

    private void N(Logger logger, String string, Object object, Object object2, LocalRef localRef) {
        this.N(logger, string, object, object2, (class06651)localRef.get());
    }

    private void N(class06202 class062022, class04453 class044532, Operation operation, class06643 class066432, LocalRef localRef) {
        this.N(class062022, class044532, operation, class066432, (class04453)localRef.get());
    }

    private class01690 N(class01683 class016832, String string) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5)) {
            class01690 class016902 = this.M(string);
            return class016902 == class01690.field_60787 || class016902 == class01690.field_60789 ? class01690.field_60786 : class016902;
        }
        return this.M(string);
    }

    private void N(class01683 class016832, class00381 class003812, LocalRef localRef) {
        this.N(class016832, class003812, (String)localRef.get());
    }

    private void N(int n, int n2, class05795 class057952, class00772 class007722, BitSet bitSet, BitSet bitSet2, Iterator<byte[]> iterator, boolean bl) {
        for (int i = 0; i < class057952.L(); ++i) {
            int n3 = class057952.u() + i;
            boolean bl2 = bitSet.get(i);
            boolean bl3 = bitSet2.get(i);
            if (!bl2 && !bl3) continue;
            class057952.N(class007722, class01296.N((int)n, (int)n3, (int)n2), bl2 ? new class00536((byte[])iterator.next().clone()) : new class00536());
            if (!bl) continue;
            this.Y.y(n, n3, n2);
        }
    }

    private void N(class05705 class057052, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17_1)) {
            this.N(new class04022(class057052.N()));
        }
    }

    private boolean N_29(Object object, Class clazz) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18)) {
            return false;
        }
        return clazz.isInstance(object);
    }

    private void N(class06202 class062022, class00642 class006422, class01892 class018922, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_1)) {
            this.g = new LinkedHashSet<class03458>();
        }
    }

    public void N(class00482 class004822) {
        class01683 class016832;
        class03427 class034272;
        class00417.N((class00381)class004822, (class00638)this, (class00458)this.L.B());
        this.L.T_2 = new class03443(this.L, this);
        class04167 class041672 = class004822.E();
        ArrayList arrayList = Lists.newArrayList((Iterable)class004822.L());
        Collections.shuffle(arrayList);
        this.a = Sets.newLinkedHashSet((Iterable)arrayList);
        class05946 var4 = class041672.y();
        class03556 var5 = class041672.N();
        this.K = class004822.M();
        this.V = class004822.B();
        boolean bl = class041672.R();
        boolean bl2 = class041672.M();
        int n = class041672.z();
        this.Q = class034272 = new class03427(class07086.field_5802, class004822.y(), bl2);
        this.u(class004822, null);
        this.Y = new class03448(this, class034272, var4, var5, this.K, this.V, (class03063)this.L.B_2, bl, class041672.L(), n);
        this.L.N(this.Y);
        if ((class04453)this.L.T_4 == null) {
            this.L.T_4 = ((class03443)this.L.T_2).N(this.Y, new class01205(), new class01756());
            ((class04453)this.L.T_4).method_36456(-180.0f);
            if (this.L.Na() != null) {
                this.L.Na().N(((class04453)this.L.T_4).method_5667());
            }
        }
        this.N(false);
        this.NR.N();
        ((class03063)this.L.B_2).i.N();
        ((class04453)this.L.T_4).w();
        ((class04453)this.L.T_4).method_5838(class004822.N());
        this.Y.u((class07049)((class04453)this.L.T_4));
        ((class04453)this.L.T_4).L_1 = new class04462((class05630)this.L.i_7);
        ((class03443)this.L.T_2).N((class08036)((class04453)this.L.T_4));
        this.L.N((class07049)((class04453)this.L.T_4));
        this.N((class04453)this.L.T_4, this.Y, class05858.field_51489);
        ((class04453)this.L.T_4).method_7268(class004822.Z());
        ((class04453)this.L.T_4).L(class004822.z());
        ((class04453)this.L.T_4).u(class004822.U());
        ((class04453)this.L.T_4).method_43120(class041672.B());
        ((class04453)this.L.T_4).method_51850(class041672.Z());
        ((class03443)this.L.T_2).N(class041672.u(), class041672.i());
        ((class05630)this.L.i_7).y(class004822.M());
        this.x = null;
        this.D = class03065.N;
        this.h = 0;
        this.r = new class03046(20);
        this.NN = class03397.N();
        if (this.u.method_10771()) {
            this.v();
        }
        this.M.N(class041672.u(), class004822.y());
        this.L.Nl().N(this.L);
        this.NB = class004822.W();
        if (this.i != null && !this.W && !this.y(class016832 = this)) {
            class06132 class061322 = class06132.N((class06202)this.L, (class06095)class06095.U, (class00392)P, (class00392)s);
            this.L.m().N((class04680)class061322);
            this.W = true;
        }
        this.y(class004822, null);
        this.L(class004822, null);
        this.i(class004822, null);
        this.N(class004822, null);
        this.R(class004822, null);
    }

    private static void N(class07049 class070492, class06889 class068892, float f, float f2) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_1) && Math.abs(class070492.method_23317() - class068892.M) < 0.03125 && Math.abs(class070492.method_23318() - class068892.B) < 0.015625 && Math.abs(class070492.method_23321() - class068892.Z) < 0.03125) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) && class070492.method_66233() != null) {
                class070492.method_66233().method_66266(0);
            }
            class070492.method_66246(class070492.method_73189(), f, f2);
        } else {
            class070492.method_66246(class068892, f, f2);
        }
    }

    private boolean N(List list) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_3) && list.isEmpty();
    }

    private void N(class01683 class016832, class00381 class003812, String string) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            this.N((class00381)new class02177(string, Instant.now(), 0L, (class04455)class04455.y_0, this.r.y().y()));
        } else {
            class016832.N(class003812);
        }
    }

    public void N(class03132 class031322) {
        class00417.N((class00381)class031322, (class00638)this, (class00458)this.L.B());
        if ((class03448)this.L.T_3 == null) {
            return;
        }
        class03106 class031062 = ((class03448)this.L.T_3).method_54719();
        class031062.N(class031322.N());
        class031062.N(class031322.y());
    }

    public void N(CallbackInfo callbackInfo) {
        class09350 class093502 = (class09350)class09350.y_0;
        class11938.L().L((Object)class093502);
        if (class093502.y()) {
            callbackInfo.cancel();
        }
    }

    public void N(class08063 class080632) {
        class00417.N((class00381)class080632, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class080632.N());
        if (class070492 == null) {
            OptionalInt optionalInt = this.S;
            if (this.N(optionalInt) && this.S.getAsInt() == class080632.N()) {
                m.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", (Object)class080632.N());
                class01683.N(class080632.y(), class080632.L(), (class07049)((class04453)this.L.T_4), false);
                this.u.method_10743((class00381)new class00564(((class04453)this.L.T_4).method_23317(), ((class04453)this.L.T_4).method_23318(), ((class04453)this.L.T_4).method_23321(), ((class04453)this.L.T_4).method_36454(), ((class04453)this.L.T_4).method_36455(), false, false));
            }
            return;
        }
        boolean bl = class080632.L().contains(class06681.field_12400) || class080632.L().contains(class06681.field_12398) || class080632.L().contains(class06681.field_12403);
        boolean bl2 = this.Y.y(class070492) || !class070492.method_66247() || bl;
        boolean bl3 = class01683.N(class080632.y(), class080632.L(), class070492, bl2);
        class070492.method_24830(class080632.u());
        if (!bl3 && class070492.method_5821((class07049)((class04453)this.L.T_4))) {
            class070492.method_24201((class07049)((class04453)this.L.T_4));
            ((class04453)this.L.T_4).method_22862();
            if (class070492.method_66247()) {
                this.u.method_10743((class00381)class00557.N((class07049)class070492));
            }
        }
    }

    private void N(class06652 class066522, CallbackInfo callbackInfo) {
        class11938.L().L((Object)class11387.N((class06652)class066522));
    }

    public void N(class06664 class066642) {
        class00417.N((class00381)class066642, (class00638)this, (class00458)this.L.B());
        if (class08044.L((int)class066642.N())) {
            ((class04453)this.L.T_4).method_31548().N(class066642.N());
        }
    }

    public void N(class00475 class004752) {
        class00417.N((class00381)class004752, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = class004752.N((class07299)this.Y);
        if (class070492 == null) {
            return;
        }
        class07049 class070493 = class070492;
        if (this.y(class070493)) {
            class06889 class068892;
            class06889 class068893;
            class04465 class044652 = class070492.method_43389();
            class070493 = class044652;
            if (this.N((class04465)class070493, class068893 = (class068892 = class044652.N((long)class004752.N(), (long)class004752.y(), (long)class004752.L())))) {
                class070493.i(class068893);
            }
            return;
        }
        if (class004752.Z()) {
            class04465 class044653 = class070492.method_43389();
            class06889 class068894 = class044653.N((long)class004752.N(), (long)class004752.y(), (long)class004752.L());
            class044653.i(class068894);
            if (class004752.B()) {
                class070492.method_66246(class068894, class004752.u(), class004752.M());
            } else {
                class070492.method_73095(class068894);
            }
        } else if (class004752.B()) {
            class070492.method_73094(class004752.u(), class004752.M());
        }
        class070492.method_24830(class004752.z());
    }

    private void N(class06643 class066432, CallbackInfo callbackInfo) {
        if (this.Y != null) {
            for (class07049 class070492 : this.Y.M()) {
                ((ClientEntityEvents.Unload)ClientEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(class070492, this.Y);
            }
            for (class07049 class070492 : ((LoadedChunksCache)this.Y).fabric_getLoadedChunks()) {
                for (class00394 class003942 : class070492.o().values()) {
                    ((ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003942, this.Y);
                }
            }
        }
    }

    private void N(class06202 class062022, class04453 class044532, Operation operation, class06643 class066432, class04453 class044533) {
        AttachmentTargetImpl.transfer((AttachmentTarget)class044533, (AttachmentTarget)class044532, (!class066432.N((byte)1) ? 1 : 0) != 0);
        operation.call(new Object[]{class062022, class044532});
    }

    private void N(class08076 class080762, CallbackInfo callbackInfo) {
        ((CommonLifecycleEvents.TagsLoaded)CommonLifecycleEvents.TAGS_LOADED.invoker()).onTagsLoaded((class01042)this.p, true);
    }

    private void N(class01683 class016832, class00290 class002902, Operation operation) {
        ((SynchronizedClientRecipesSetter)class002902).fabric_setSynchronizedClientRecipes(this.c.getSynchronizedRecipes());
        operation.call(new Object[]{class016832, class002902});
    }

    public void N(class03124 class031242) {
        class00417.N((class00381)class031242, (class00638)this, (class00458)this.L.B());
        if ((class03448)this.L.T_3 == null) {
            return;
        }
        ((class03448)this.L.T_3).method_54719().L(class031242.N());
    }

    private void N(class07049 class070492) {
        if (class070492 instanceof class07504) {
            class07504 class075042 = (class07504)class070492;
            this.L.Nr().N((class00044)new class00011(class075042));
        } else if (class070492 instanceof class04626) {
            class04626 class046262 = (class04626)class070492;
            Object object = class046262.P_() ? new class05499(class046262) : new class05528(class046262);
            this.L.Nr().N((class00034)object);
        }
    }

    private void N(class04190 class041902, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            this.u.field_11651.config().setAutoRead(false);
        }
    }

    private void N(class07265 class072652, CallbackInfo callbackInfo) {
        BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections((class05487)this.Y, (class07209)class072652.y());
    }

    private void N(class07275 class072752, CallbackInfo callbackInfo) {
        BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections((class05487)this.Y, (class07209)class072752.N());
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    private void N(class08096 class080962, CallbackInfo callbackInfo) {
        class05096 class050962;
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_18_2, ProtocolVersion.v1_20_2) && (class050962 = (class05096)this.L.v_3) instanceof ILevelLoadingScreen) {
            ((ILevelLoadingScreen)class050962).viaFabricPlus$setReady();
        }
    }

    private void N(class06663 class066632, CallbackInfo callbackInfo) {
        class05096 class050962;
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18) && (class050962 = (class05096)this.L.v_3) instanceof ILevelLoadingScreen) {
            ((ILevelLoadingScreen)class050962).viaFabricPlus$setReady();
        }
    }

    public void N(class06660 class066602) {
        class00417.N((class00381)class066602, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class066602.N());
        if (class070492 != null) {
            class070492.method_5841().N(class066602.y());
        }
    }

    private void N(int n, int n2, class01832 class018322, boolean bl, CallbackInfo callbackInfo) {
        ChunkTrackerHolder.get((class03448)this.Y).onChunkStatusAdded(n, n2, 2);
    }

    public void N(class00269 class002692) {
        boolean bl;
        class00417.N((class00381)class002692, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class002692.N());
        if (class070492 == null) {
            return;
        }
        class06889 class068892 = class002692.y().N();
        class070492.method_43389().i(class068892);
        class07049 class070493 = class070492;
        if (this.y(class070493)) {
            return;
        }
        float f = class002692.y().L();
        float f2 = class002692.y().u();
        boolean bl2 = bl = class070492.method_73189().M(class068892) > 4096.0;
        if (this.Y.y(class070492) && !bl) {
            class070492.method_66246(class068892, f, f2);
        } else {
            class070492.method_60949(class068892, f, f2);
        }
        if (!class070492.method_66245() && class070492.method_5821((class07049)((class04453)this.L.T_4))) {
            class070492.method_24201((class07049)((class04453)this.L.T_4));
            ((class04453)this.L.T_4).method_22862();
        }
        class070492.method_24830(class002692.L());
    }

    public void N(class06661 class066612, CallbackInfo callbackInfo) {
        callbackInfo.cancel();
    }

    public void N(class00482 class004822, CallbackInfo callbackInfo) {
        UserConnection userConnection = ((IConnection)this.M()).viaFabricPlus$getUserConnection();
        if (userConnection != null) {
            ConnectionDetails.sendConnectionDetails((UserConnection)userConnection, (String)"vv:mod_details");
        }
    }

    private void N(int n, int n2, class01839 class018392, CallbackInfo callbackInfo) {
        BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections((class05487)this.Y, (int)n, (int)n2);
    }

    public void N(class06652 class066522) {
        class00417.N((class00381)class066522, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class066522.N());
        if (class070492 == null) {
            return;
        }
        class070492.method_5750(class066522.y());
        this.N(class066522, null);
    }

    public void N(class02511 class025112) {
        class00417.N((class00381)class025112, (class00638)this, (class00458)this.L.B());
        ((class01056)this.L.i_6).L(class025112.N());
    }

    public void N(class02459 class024592) {
        class00417.N((class00381)class024592, (class00638)this, (class00458)this.L.B());
        ((class01056)this.L.i_6).N(class024592.N(), false);
    }

    public void N(class03057 class030572) {
        class00417.N((class00381)class030572, (class00638)this, (class00458)this.L.B());
        this.J.N(class030572.N(), class030572.y());
    }

    public void N(class03953 class039532) {
        class00417.N((class00381)class039532, (class00638)this, (class00458)this.L.B());
        if (this.i == null) {
            return;
        }
        this.i.u = class039532.N();
        class039532.y().map(class04568::y).ifPresent(arg_0 -> ((class04568)this.i).N(arg_0));
        class04563.y((class04568)this.i);
    }

    public void N(class06648 class066482) {
        class00417.N((class00381)class066482, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = class066482.N((class07299)this.Y);
        if (class070492 instanceof class07438) {
            ((class07438)class070492).method_6111(class066482.y());
        }
    }

    public void N(class08082 class080822) {
        class00417.N((class00381)class080822, (class00638)this, (class00458)this.L.B());
        ((class01056)this.L.i_6).Z().y(class080822.N().getString().isEmpty() ? null : class080822.N());
        ((class01056)this.L.i_6).Z().N(class080822.y().getString().isEmpty() ? null : class080822.y());
    }

    public void N(class02668 class026682) {
        class00417.N((class00381)class026682, (class00638)this, (class00458)this.L.B());
        ((class01056)this.L.i_6).N(class026682.N(), class026682.y(), class026682.L());
    }

    public void N(class02775 class027752) {
        class00417.N((class00381)class027752, (class00638)this, (class00458)this.L.B());
        ((class01056)this.L.i_6).y(class027752.N());
    }

    public void N(class02617 class026172) {
        class00417.N((class00381)class026172, (class00638)this, (class00458)this.L.B());
        this.Y.method_8621().N(class026172.N());
    }

    public void N(class02160 class021602) {
        class00417.N((class00381)class021602, (class00638)this, (class00458)this.L.B());
        this.Y.method_8621().N(class021602.N(), class021602.y(), class021602.L(), this.Y.N());
    }

    public void N(class02309 class023092) {
        class00417.N((class00381)class023092, (class00638)this, (class00458)this.L.B());
        this.Y.method_8621().L(class023092.y(), class023092.N());
    }

    public void N(class02860 class028602) {
        class00417.N((class00381)class028602, (class00638)this, (class00458)this.L.B());
        class08057 class080572 = this.Y.method_8621();
        class080572.L(class028602.N(), class028602.y());
        long l = class028602.M();
        if (l > 0L) {
            class080572.N(class028602.u(), class028602.L(), l, this.Y.N());
        } else {
            class080572.N(class028602.L());
        }
        class080572.N(class028602.B());
        class080572.L(class028602.z());
        class080572.y(class028602.Z());
    }

    public void N(class02512 class025122) {
        class00417.N((class00381)class025122, (class00638)this, (class00458)this.L.B());
        this.Y.method_8621().L(class025122.N());
    }

    public void N(class02900 class029002) {
        class00417.N((class00381)class029002, (class00638)this, (class00458)this.L.B());
        this.Y.method_8621().y(class029002.N());
    }

    public void N(class02361 class023612) {
        class00417.N((class00381)class023612, (class00638)this, (class00458)this.L.B());
        ((class01056)this.L.i_6).u();
        if (class023612.N()) {
            ((class01056)this.L.i_6).N();
        }
    }

    public void N(class06272 class062722) {
        class00417.N((class00381)class062722, (class00638)this, (class00458)this.L.B());
        class06584 class065842 = ((class04453)this.L.T_4).method_5998(class062722.N());
        class06241 class062412 = this.N(class065842);
        if (class062412 != null) {
            this.L.N((class05096)new class05671(class062412));
        }
    }

    public void N(class06668 class066682) {
        class00417.N((class00381)class066682, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = ((class04453)this.L.T_4).method_5668();
        if (class070492 != (class04453)this.L.T_4 && class070492.method_66247()) {
            class06889 class068892;
            class06889 class068893;
            class06889 class068894 = class066682.N();
            class06889 class068895 = class068894;
            if (this.N(class068895, class068893 = (class068892 = class070492.method_66245() ? class070492.method_66233().method_66265() : class070492.method_73189())) > (double)1.0E-5f) {
                if (class070492.method_66245()) {
                    class070492.method_66233().method_66272();
                }
                class070492.method_5641(class068894.N(), class068894.y(), class068894.L(), class066682.y(), class066682.L());
            }
            this.u.method_10743((class00381)class00557.N((class07049)class070492));
        }
    }

    public void N(class00512 class005122) {
        class00417.N((class00381)class005122, (class00638)this, (class00458)this.L.B());
        if (class005122.y() == 0) {
            ((class04453)this.L.T_4).method_7357().N(class005122.N());
        } else {
            ((class04453)this.L.T_4).method_7357().N(class005122.N(), class005122.y());
        }
    }

    public void N(class07254 class072542) {
        class00417.N((class00381)class072542, (class00638)this, (class00458)this.L.B());
        ((class01056)this.L.i_6).U().N(class072542);
    }

    public void N(class00479 class004792) {
        class00417.N((class00381)class004792, (class00638)this, (class00458)this.L.B());
        class04453 class044532 = (class04453)this.L.T_4;
        if (((class07482)class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b == class004792.N()) {
            ((class07482)class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).y(class004792.y(), class004792.L());
        }
    }

    public void N(class01659 class016592) {
        this.y(class016592);
    }

    public void N(class07269 class072692) {
        class00417.N((class00381)class072692, (class00638)this, (class00458)this.L.B());
        class07209 class072092 = class072692.N();
        ((class03448)this.L.T_3).N(class072092, class072692.y()).ifPresent(class003942 -> {
            try (class04495 class044952 = new class04495(class003942.J(), m);){
                class003942.y_1(class08308.N((class04490)class044952, (class01929)this.p, (class07001)class072692.L()));
            }
            if (class003942 instanceof class00402 && (class05096)this.L.v_3 instanceof class05995) {
                ((class05995)((class05096)this.L.v_3)).R();
            }
        });
    }

    private void N(class06669 class066692, class03458 class034582) {
        GameProfile gameProfile = class034582.N();
        class03962 class039622 = this.L.n().N();
        if (class039622 == null) {
            Logger logger = m;
            String string = "Ignoring chat session from {} due to missing Services public key";
            String string2 = gameProfile.name();
            if (this.y(logger, string, string2)) {
                logger.warn(string, (Object)string2);
            }
            class034582.N(this.H());
            return;
        }
        class02048 class020482 = class066692.Z();
        if (class020482 != null) {
            try {
                class02027 class020272 = class020482.N(gameProfile, class039622);
                class034582.N(class020272);
            }
            catch (class10406 class104062) {
                m.error("Failed to validate profile key for player: '{}'", (Object)gameProfile.name(), (Object)class104062);
                class034582.N(this.H());
            }
        } else {
            class034582.N(this.H());
        }
    }

    private void N(class06680 class066802, class06669 class066692, class03458 class034582) {
        switch (class066802) {
            case field_40699: {
                this.N(class066692, class034582);
                break;
            }
            case field_29137: {
                if (class034582.i() != class066692.i() && (class04453)this.L.T_4 != null && ((class04453)this.L.T_4).method_5667().equals(class066692.N())) {
                    class07282 class072822 = class066692.i();
                    class04453 class044532 = (class04453)this.L.T_4;
                    this.N(class044532, class072822);
                }
                class034582.N(class066692.i());
                break;
            }
            case field_40700: {
                if (class066692.L()) {
                    this.g.add(class034582);
                    break;
                }
                this.g.remove(class034582);
                break;
            }
            case field_29138: {
                class034582.N(class066692.u());
                break;
            }
            case field_29139: {
                class034582.N(class066692.R());
                break;
            }
            case field_54981: {
                class034582.y(class066692.M());
                break;
            }
            case field_52324: {
                class034582.y(class066692.B());
            }
        }
    }

    public void N(class06661 class066612) {
        class03458 class034582;
        class00417.N((class00381)class066612, (class00638)this, (class00458)this.L.B());
        for (class06669 class066692 : class066612.L()) {
            class034582 = new class03458(Objects.requireNonNull(class066692.y()), this.H());
            if (this.O.putIfAbsent(class066692.N(), class034582) != null) continue;
            this.L.yv().N(class034582);
        }
        for (class06669 class066692 : class066612.y()) {
            class034582 = this.O.get(class066692.N());
            if (class034582 == null) {
                UUID uUID = class066692.N();
                EnumSet enumSet = class066612.N();
                CallbackInfo callbackInfo = new CallbackInfo("", true);
                this.N(class066612, callbackInfo);
                if (callbackInfo.isCancelled()) {
                    return;
                }
                Logger logger = m;
                String string = "Ignoring player info update for unknown player {} ({})";
                UUID uUID2 = uUID;
                EnumSet var11 = enumSet;
                if (!this.N(logger, string, uUID2, var11)) continue;
                logger.warn(string, (Object)uUID2, (Object)var11);
                continue;
            }
            for (class06680 class066802 : class066612.N()) {
                this.N(class066802, class066692, class034582);
            }
        }
    }

    public void N(class02079 class020792) {
        class00417.N((class00381)class020792, (class00638)this, (class00458)this.L.B());
        for (UUID uUID : class020792.N()) {
            this.L.yv().R(uUID);
            class03458 class034582 = this.O.remove(uUID);
            if (class034582 == null) continue;
            this.g.remove(class034582);
        }
    }

    public void N(class06659 class066592) {
        class00417.N((class00381)class066592, (class00638)this, (class00458)this.L.B());
        class04453 class044532 = (class04453)this.L.T_4;
        class044532.method_31549().y = class066592.y();
        class044532.method_31549().u = class066592.u();
        class044532.method_31549().N = class066592.N();
        class044532.method_31549().L = class066592.L();
        class044532.method_31549().N(class066592.M());
        class044532.method_31549().y(class066592.B());
    }

    public void N(class08073 class080732) {
        class00417.N((class00381)class080732, (class00638)this, (class00458)this.L.B());
        ((class03448)this.L.T_3).method_8465((class07049)((class04453)this.L.T_4), class080732.L(), class080732.u(), class080732.M(), class080732.N(), class080732.y(), class080732.B(), class080732.Z(), class080732.z());
    }

    public void N(class08062 class080622) {
        class00417.N((class00381)class080622, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class080622.L());
        if (class070492 == null) {
            return;
        }
        ((class03448)this.L.T_3).method_8449((class07049)((class04453)this.L.T_4), class070492, class080622.N(), class080622.y(), class080622.u(), class080622.M(), class080622.B());
    }

    public void N(class07233 class072332) {
        class00417.N((class00381)class072332, (class00638)this, (class00458)this.L.B());
        this.y(class072332, null);
        this.H = new CommandDispatcher(class072332.N(class04348.N((class01929)this.p, (class03767)this.F), w));
        this.N(class072332, null);
    }

    public void N(class06674 class066742) {
        class00417.N((class00381)class066742, (class00638)this, (class00458)this.L.B());
        class01894 class018942 = class066742.N();
        if (class018942 == null) {
            this.I.N(null, false);
        } else {
            class03711 class037112 = this.I.N(class018942);
            this.I.N(class037112, false);
        }
    }

    public void N(class08077 class080772) {
        class00417.N((class00381)class080772, (class00638)this, (class00458)this.L.B());
        this.I.N(class080772);
    }

    public void N(class00516 class005162) {
        class00417.N((class00381)class005162, (class00638)this, (class00458)this.L.B());
        if (class005162.N()) {
            ((class03448)this.L.T_3).method_8474(class005162.y(), class005162.u(), class005162.L());
        } else {
            ((class03448)this.L.T_3).N(class005162.y(), class005162.u(), class005162.L());
        }
    }

    public void N(class06671 class066712) {
        class00417.N((class00381)class066712, (class00638)this, (class00458)this.L.B());
        class06889 class068892 = class066712.N((class07299)this.Y);
        if (class068892 != null) {
            ((class04453)this.L.T_4).method_5702(class066712.N(), class068892);
        }
    }

    public void N(class08069 class080692) {
        class00417.N((class00381)class080692, (class00638)this, (class00458)this.L.B());
        class00290 class002902 = new class00290(class080692.N(), class080692.y());
        class01683 class016832 = this;
        this.N(class016832, class002902, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_634, net.minecraft.class_10333]");
            ((class01683)((Object)((Object)objectArray[0]))).c = (class00290)objectArray[1];
            return null;
        });
    }

    public void N(class07232 class072322) {
        class00417.N((class00381)class072322, (class00638)this, (class00458)this.L.B());
        this.J.N(class072322.y(), class072322.N());
    }

    public void N(class08090 class080902) {
        class00417.N((class00381)class080902, (class00638)this, (class00458)this.L.B());
        this.L.Nr().N(class080902.N(), class080902.y());
    }

    public void N(class07265 class072652) {
        class00417.N((class00381)class072652, (class00638)this, (class00458)this.L.B());
        ((class03448)this.L.T_3).method_8517(class072652.N(), class072652.y(), class072652.L());
        this.N(class072652, null);
    }

    public void N(class07275 class072752) {
        class00417.N((class00381)class072752, (class00638)this, (class00458)this.L.B());
        ((class03448)this.L.T_3).method_8427(class072752.N(), class072752.u(), class072752.y(), class072752.L());
        this.N(class072752, null);
    }

    public void N(class00486 class004862) {
        class00417.N((class00381)class004862, (class00638)this, (class00458)this.L.B());
        ((class04453)this.L.T_4).t();
    }

    public void N(class06682 class066822) {
        class00417.N((class00381)class066822, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class066822.N());
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            class066822.y().forEach(pair -> class074382.method_5673((class07085)pair.getFirst(), (class06584)pair.getSecond()));
        }
    }

    public void N(class00503 class005032) {
        class00417.N((class00381)class005032, (class00638)this, (class00458)this.L.B());
        class04453 class044532 = (class04453)this.L.T_4;
        class00521 class005212 = class005032.N();
        float f = class005032.y();
        int n = class04995.y((float)(f + 0.5f));
        if (class005212 == class00503.y) {
            class044532.method_7353((class00392)class00392.L((String)"block.minecraft.spawn.not_valid"), false);
        } else if (class005212 == class00503.L) {
            this.Y.method_8401().y(true);
            this.Y.method_8519(0.0f);
        } else if (class005212 == class00503.u) {
            this.Y.method_8401().y(false);
            this.Y.method_8519(1.0f);
        } else if (class005212 == class00503.i) {
            ((class03443)this.L.T_2).N(class07282.N((int)n));
        } else if (class005212 == class00503.R) {
            class04606 class046062 = new class04606(true, () -> {
                ((class01683)((Object)((Object)((class04453)this.L.T_4).y_0))).N((class00381)new class00535(class00569.field_12774));
                this.L.N(null);
            });
            class06202 class062022 = this.L;
            LocalIntRefImpl localIntRefImpl = new LocalIntRefImpl();
            localIntRefImpl.init(n);
            this.N(class062022, (class05096)class046062, (LocalIntRef)localIntRefImpl);
            n = localIntRefImpl.dispose();
        } else if (class005212 == class00503.M) {
            class05630 class056302 = (class05630)this.L.i_7;
            class05216 class052162 = null;
            if (f == 0.0f) {
                this.L.N((class05096)new class05351());
            } else if (f == 101.0f) {
                class052162 = class00392.N((String)"demo.help.movement", (Object[])new Object[]{class056302.n.m(), class056302.t.m(), class056302.G.m(), class056302.l.m()});
            } else if (f == 102.0f) {
                class052162 = class00392.N((String)"demo.help.jump", (Object[])new Object[]{class056302.d.m()});
            } else if (f == 103.0f) {
                class052162 = class00392.N((String)"demo.help.inventory", (Object[])new Object[]{class056302.Y.m()});
            } else if (f == 104.0f) {
                class052162 = class00392.N((String)"demo.day.6", (Object[])new Object[]{class056302.e.m()});
            }
            if (class052162 != null) {
                ((class01056)this.L.i_6).i().N(class052162);
                this.L.NT().L((class00392)class052162);
            }
        } else if (class005212 == class00503.B) {
            this.Y.method_43128((class07049)class044532, class044532.method_23317(), class044532.method_23320(), class044532.method_23321(), class04909.Nq, class04911.field_15248, 0.18f, 0.45f);
        } else if (class005212 == class00503.Z) {
            this.Y.method_8519(f);
        } else if (class005212 == class00503.z) {
            this.Y.method_8496(f);
        } else if (class005212 == class00503.U) {
            this.Y.method_43128((class07049)class044532, class044532.method_23317(), class044532.method_23318(), class044532.method_23321(), class04909.lJ, class04911.field_15254, 1.0f, 1.0f);
        } else if (class005212 == class00503.E) {
            this.Y.method_8406((class07126)class07107.b, class044532.method_23317(), class044532.method_23318(), class044532.method_23321(), 0.0, 0.0, 0.0);
            if (n == 1) {
                this.Y.method_43128((class07049)class044532, class044532.method_23317(), class044532.method_23318(), class044532.method_23321(), class04909.zd, class04911.field_15251, 1.0f, 1.0f);
            }
        } else if (class005212 == class00503.W) {
            ((class04453)this.L.T_4).L(f == 0.0f);
        } else if (class005212 == class00503.m) {
            ((class04453)this.L.T_4).u(f == 1.0f);
        } else if (class005212 == class00503.P && this.NM != null) {
            this.NM.L();
        }
    }

    private void N(class04453 class044532, class03448 class034482, class05858 class058582) {
        if (this.NM == null) {
            this.NM = new class05384();
        }
        this.NM.N(class044532, class034482, (class03063)this.L.B_2);
        class05096 class050962 = (class05096)this.L.v_3;
        if (class050962 instanceof class05850) {
            ((class05850)class050962).N(this.NM, class058582);
        } else {
            ((class01056)this.L.i_6).i().Z();
            this.L.y((class05096)new class05850(this.NM, class058582));
        }
    }

    public void N(class00480 class004802) {
        class00417.N((class00381)class004802, (class00638)this, (class00458)this.L.B());
        class02265 class022652 = class004802.N();
        class07769 class077692 = ((class03448)this.L.T_3).method_17891(class022652);
        if (class077692 == null) {
            class077692 = class07769.N((byte)class004802.y(), (boolean)class004802.L(), (class05946)((class03448)this.L.T_3).method_27983());
            ((class03448)this.L.T_3).N(class022652, class077692);
        }
        class004802.N(class077692);
        this.L.NV().N(class022652, class077692);
    }

    public void N(class02807 class028072) {
    }

    public void N(class02259 class022592) {
    }

    public void N(class08076 class080762) {
        class00417.N((class00381)class080762, (class00638)this, (class00458)this.L.B());
        ArrayList arrayList = new ArrayList(class080762.N().size());
        boolean bl = this.u.method_10756();
        class080762.N().forEach((class059462, class035162) -> {
            if (!bl || class02001.N((class05946)class059462)) {
                arrayList.add(this.N((class05946)class059462, (class03516)class035162));
            }
        });
        arrayList.forEach(class00720::u);
        this.N(class080762, null);
        this.f = class02755.N((class01929)this.p, (class03767)this.F);
        List list = List.copyOf(class03771.i().E());
        this.NE.N(list);
    }

    private <T> class00720<T> N(class05946<? extends class00751<? extends T>> class059462, class03516 class035162) {
        class00751 class007512 = this.p.L(class059462);
        return class007512.N(class035162.N(class007512));
    }

    public void N(class02675 class026752) {
        class00417.N((class00381)class026752, (class00638)this, (class00458)this.L.B());
        if (this.Y.method_8469(class026752.N()) == (class04453)this.L.T_4) {
            class04453 class044532 = (class04453)this.L.T_4;
            this.N(class026752, null);
            if (class044532.Q()) {
                this.L.N((class05096)new class05345(class026752.y(), this.Y.method_8401().U(), (class04453)this.L.T_4));
            } else {
                ((class04453)this.L.T_4).K();
            }
        }
    }

    public void N(class07258 class072582) {
        class00417.N((class00381)class072582, (class00638)this, (class00458)this.L.B());
        this.Q.N(class072582.N());
        this.Q.N(class072582.y());
    }

    public void N(class06655 class066552) {
        class00417.N((class00381)class066552, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = class066552.N((class07299)this.Y);
        if (class070492 != null) {
            this.L.N(class070492);
        }
    }

    public void N(class00257 class002572) {
        class00417.N((class00381)class002572, (class00638)this, (class00458)this.L.B());
        class01756 class017562 = ((class04453)this.L.T_4).q();
        for (class00329 class003292 : class002572.N()) {
            class017562.N(class003292);
        }
        this.N(class017562);
    }

    public void N(class00278 class002782) {
        class00417.N((class00381)class002782, (class00638)this, (class00458)this.L.B());
        class01756 class017562 = ((class04453)this.L.T_4).q();
        if (class002782.y()) {
            class017562.N();
        }
        for (class00268 class002682 : class002782.N()) {
            class017562.N(class002682.L());
            if (class002682.y()) {
                class017562.u(class002682.L().N());
            }
            if (!class002682.N()) continue;
            class04658.N((class06086)this.L.m(), (class00265)class002682.L().y());
        }
        this.N(class017562);
    }

    public void N(class07245 class072452) {
        Object2IntMap.Entry entry2;
        class00417.N((class00381)class072452, (class00638)this, (class00458)this.L.B());
        for (Object2IntMap.Entry entry2 : class072452.N().object2IntEntrySet()) {
            class04907 var4 = (class04907)entry2.getKey();
            int n = entry2.getIntValue();
            ((class04453)this.L.T_4).O().N((class08036)((class04453)this.L.T_4), var4, n);
        }
        entry2 = (class05096)this.L.v_3;
        if (entry2 instanceof class04610) {
            class04610 class046102 = (class04610)entry2;
            class046102.N();
        }
    }

    public void N(class08093 class080932) {
        class00417.N((class00381)class080932, (class00638)this, (class00458)this.L.B());
        if (!this.q.N(class080932.N(), class080932.y())) {
            m.debug("Got unhandled response to tag query {}", (Object)class080932.N());
        }
    }

    public void N(class00251 class002512) {
        class00417.N((class00381)class002512, (class00638)this, (class00458)this.L.B());
        class01756 class017562 = ((class04453)this.L.T_4).q();
        class017562.N(class002512.N());
        this.N(class017562);
    }

    private void N(class01756 class017562) {
        class017562.y();
        this.NE.N(class017562, (class07299)this.Y);
        class05096 class050962 = (class05096)this.L.v_3;
        if (class050962 instanceof class05043) {
            ((class05043)class050962).i();
        }
    }

    public void N(class08087 class080872) {
        class00417.N((class00381)class080872, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class080872.N());
        if (!(class070492 instanceof class07438)) {
            return;
        }
        class03556 var3 = class080872.y();
        class07055 class070552 = new class07055(var3, class080872.u(), class080872.L(), class080872.B(), class080872.M(), class080872.Z(), null);
        if (!class080872.z()) {
            class070552.U();
        }
        ((class07438)class070492).method_26082(class070552, null);
    }

    public @Nullable class03458 N(String string) {
        for (class03458 class034582 : this.O.values()) {
            if (!class034582.N().name().equals(string)) continue;
            return class034582;
        }
        return null;
    }

    public @Nullable class03458 N(UUID uUID) {
        return this.O.get(uUID);
    }

    public void N(class00496 class004962) {
        class01488 class014882;
        class00417.N((class00381)class004962, (class00638)this, (class00458)this.L.B());
        class04453 class044532 = (class04453)this.L.T_4;
        class06584 class065842 = class004962.L();
        int n = class004962.y();
        this.L.yT().N(class065842);
        class05096 class050962 = (class05096)this.L.v_3;
        boolean bl = class050962 instanceof class01488 ? !(class014882 = (class01488)class050962).N() : false;
        if (class004962.N() == 0) {
            if (class07492.N((int)n) && !class065842.R() && ((class014882 = class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L(n).i()).R() || class014882.c() < class065842.c())) {
                class065842.u(5);
            }
            class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(n, class004962.u(), class065842);
        } else if (!(class004962.N() != ((class07482)class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b || class004962.N() == 0 && bl)) {
            ((class07482)class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(n, class004962.u(), class065842);
        }
        if ((class05096)this.L.v_3 instanceof class01488) {
            class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(n, class065842);
            class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
        }
    }

    public void N(class02580 class025802) {
        class00417.N((class00381)class025802, (class00638)this, (class00458)this.L.B());
        this.L.yT().N(class025802.N());
        if (!((class05096)this.L.v_3 instanceof class01488)) {
            ((class07482)((class04453)this.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(class025802.N());
        }
    }

    public void N(class05873 class058732) {
        class00417.N((class00381)class058732, (class00638)this, (class00458)this.L.B());
        class05866.N((class05851)class058732.y(), (class06202)this.L, (int)class058732.N(), (class00392)class058732.L());
    }

    public void N(class00499 class004992) {
        class00417.N((class00381)class004992, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class004992.L());
        class04453 class044532 = (class04453)this.L.T_4;
        int n = class004992.y();
        class07075 class070752 = new class07075(class07610.N((int)n));
        if (class070492 instanceof class07862) {
            class07862 class078622 = (class07862)class070492;
            class07479 class074792 = new class07479(class004992.N(), class044532.method_31548(), (class06695)class070752, class078622, n);
            class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = class074792;
            this.L.N((class05096)new class05429(class074792, class044532.method_31548(), class078622, n));
        } else if (class070492 instanceof class08156) {
            class08156 class081562 = (class08156)class070492;
            class07570 class075702 = new class07570(class004992.N(), class044532.method_31548(), (class06695)class070752, class081562, n);
            class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = class075702;
            this.L.N((class05096)new class06533(class075702, class044532.method_31548(), class081562, n));
        }
    }

    public void N(class00520 class005202) {
        class00417.N((class00381)class005202, (class00638)this, (class00458)this.L.B());
        class06889 class068892 = class005202.N();
        ((class03448)this.L.T_3).method_8486(class068892.N(), class068892.y(), class068892.L(), (class04891)class005202.B().N(), class04911.field_15245, 4.0f, (1.0f + (((class03448)this.L.T_3).field_9229.z() - ((class03448)this.L.T_3).field_9229.z()) * 0.2f) * 0.7f, false);
        ((class03448)this.L.T_3).method_8406(class005202.M(), class068892.N(), class068892.y(), class068892.L(), 1.0, 0.0, 0.0);
        ((class03448)this.L.T_3).N(class068892, class005202.y(), class005202.L(), class005202.Z());
        class005202.u().ifPresent(arg_0 -> ((class04453)((class04453)this.L.T_4)).method_45319(arg_0));
    }

    public void N(class00444 class004442) {
        class00417.N((class00381)class004442, (class00638)this, (class00458)this.L.B());
        ((class03063)this.L.B_2).R.N(class004442.N(), class004442.y());
    }

    public void N(class00474 class004742) {
        class00417.N((class00381)class004742, (class00638)this, (class00458)this.L.B());
        this.NR.N(this.Y.N(), class004742.N());
    }

    public void N(class00449 class004492) {
        class00417.N((class00381)class004492, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class004492.N());
        if (class070492 != null) {
            this.NR.N(this.Y.N(), class070492, class004492.y());
        }
    }

    public void N(class00437 class004372) {
        class00417.N((class00381)class004372, (class00638)this, (class00458)this.L.B());
        this.NR.N(this.Y.N(), class004372.N(), class004372.y());
    }

    public void N(class06651 class066512) {
        class00417.N((class00381)class066512, (class00638)this, (class00458)this.L.B());
        class07209 class072092 = class066512.N();
        class00394 class003942 = this.Y.method_8321(class072092);
        if (class003942 instanceof class07267) {
            class07267 class072672 = (class07267)class003942;
            ((class04453)this.L.T_4).method_7311(class072672, class066512.y());
        } else {
            class07209 class072093 = class072092;
            class00394 class003943 = this.Y.method_8321(class072092);
            String string = "Ignoring openTextEdit on an invalid entity: {} at pos {}";
            Logger logger = m;
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init((Object)class066512);
            this.N(logger, string, (Object)class003943, (Object)class072093, (LocalRef)localRefImpl);
            class066512 = (class06651)localRefImpl.dispose();
        }
    }

    public void N(class00524 class005242) {
        class00417.N((class00381)class005242, (class00638)this, (class00458)this.L.B());
        class04453 class044532 = (class04453)this.L.T_4;
        if (class005242.N() == 0) {
            class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(class005242.y(), class005242.L(), class005242.u());
        } else if (class005242.N() == ((class07482)class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b) {
            ((class07482)class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(class005242.y(), class005242.L(), class005242.u());
        }
    }

    public void N(class02596 class025962) {
        class00417.N((class00381)class025962, (class00638)this, (class00458)this.L.B());
        this.L.yT().N(class025962.y());
        ((class04453)this.L.T_4).method_31548().method_5447(class025962.N(), class025962.y());
    }

    public void N(String string, @Nullable class05096 class050962) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(string, class050962, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        String string2 = string;
        class01683 class016832 = this;
        switch (this.N(class016832, string2).ordinal()) {
            case 0: {
                string2 = new class03961(string);
                class016832 = this;
                LocalRefImpl localRefImpl = new LocalRefImpl();
                localRefImpl.init((Object)string);
                this.N(class016832, (class00381)string2, (LocalRef)localRefImpl);
                string = (String)localRefImpl.dispose();
                this.L.N(class050962);
                break;
            }
            case 1: {
                this.N(string, "multiplayer.confirm_command.parse_errors", class050962);
                break;
            }
            case 3: {
                this.N(string, "multiplayer.confirm_command.permissions_required", class050962);
                break;
            }
            case 2: {
                this.y(string, "multiplayer.confirm_command.signature_required", class050962);
            }
        }
    }

    public void N(class06635 class066352) {
        class00417.N((class00381)class066352, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class066352.N());
        if (class070492 instanceof class02607) {
            ((class02607)class070492).W(class066352.y());
        }
    }

    private static class06584 N(class08036 class080362) {
        for (class07050 class070502 : class07050.values()) {
            class06584 class065842 = class080362.method_5998(class070502);
            if (!class065842.L(class02484.e)) continue;
            return class065842;
        }
        return new class06584((class07310)class06570.la);
    }

    public void N(class00509 class005092) {
        class00417.N((class00381)class005092, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = class005092.N((class07299)this.Y);
        if (class070492 != null) {
            switch (class005092.N()) {
                case 63: {
                    this.L.Nr().N((class00044)new class03578((class01964)class070492));
                    break;
                }
                case 21: {
                    this.L.Nr().N((class00044)new class00179((class07549)class070492));
                    break;
                }
                case 35: {
                    int n = 40;
                    ((class04410)this.L.i_0).N(class070492, (class07126)class07107.NP, 30);
                    this.Y.method_8486(class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class04909.QF, class070492.method_5634(), 1.0f, 1.0f, false);
                    if (class070492 != (class04453)this.L.T_4) break;
                    class03386 class033862 = (class03386)this.L.i_5;
                    class06584 class065842 = class01683.N((class08036)((class04453)this.L.T_4));
                    CallbackInfo callbackInfo = new CallbackInfo("", true);
                    this.N(callbackInfo);
                    if (callbackInfo.isCancelled()) {
                        return;
                    }
                    class033862.N(class065842);
                    break;
                }
                default: {
                    class070492.method_5711(class005092.N());
                }
            }
        }
    }

    public void N(class08079 class080792) {
        class00417.N((class00381)class080792, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class080792.y());
        if (class070492 == null) {
            m.warn("Received passengers for unknown entity");
            return;
        }
        boolean bl = class070492.method_5821((class07049)((class04453)this.L.T_4));
        class070492.method_5772();
        for (int n : class080792.N()) {
            class07049 class070493 = this.Y.method_8469(n);
            if (class070493 == null) continue;
            class070493.method_5873(class070492, true, false);
            if (class070493 != (class04453)this.L.T_4) continue;
            this.S = OptionalInt.empty();
            if (bl) continue;
            if (this.N_29(class070492, class00250.class)) {
                ((class04453)this.L.T_4).field_5982 = class070492.method_36454();
                ((class04453)this.L.T_4).method_36456(class070492.method_36454());
                ((class04453)this.L.T_4).method_5847(class070492.method_36454());
            }
            class05216 class052162 = class00392.N((String)"mount.onboard", (Object[])new Object[]{((class05630)this.L.i_7).w.m()});
            ((class01056)this.L.i_6).N((class00392)class052162, false);
            this.L.NT().u((class00392)class052162);
        }
    }

    private static boolean N(ParseResults<?> parseResults) {
        return !parseResults.getReader().canRead() && parseResults.getExceptions().isEmpty() && parseResults.getContext().getLastChild().getCommand() != null;
    }

    private void N(String string, String string2, class00392 class003922, Runnable runnable) {
        class05096 class050962 = (class05096)this.L.v_3;
        this.L.N((class05096)new class05733(bl -> {
            if (bl) {
                runnable.run();
            } else {
                this.L.N(class050962);
            }
        }, v, (class00392)class00392.N((String)string2, (Object[])new Object[]{class00392.y((String)string).N(class06541.field_1054)}), class003922, class050962 != null ? class05220.U : class05220.i));
    }

    private class05858 N(boolean bl, class05946<class07299> class059462, class05946<class07299> class059463) {
        class05858 class058582 = class05858.field_51489;
        if (!bl) {
            if (class059462 == class07299.field_25180 || class059463 == class07299.field_25180) {
                class058582 = class05858.field_51487;
            } else if (class059462 == class07299.field_25181 || class059463 == class07299.field_25181) {
                class058582 = class05858.field_51488;
            }
        }
        return class058582;
    }

    public void N(class06643 class066432) {
        class00417.N((class00381)class066432, (class00638)this, (class00458)this.L.B());
        class04167 class041672 = class066432.N();
        class05946 var3 = class041672.y();
        class03556 var4 = class041672.N();
        class04453 class044532 = (class04453)this.L.T_4;
        class05946 var6 = class044532.method_73183().method_27983();
        boolean bl = var3 != var6;
        class05858 class058582 = this.N(class044532.method_29504(), (class05946<class07299>)var3, (class05946<class07299>)var6);
        if (bl) {
            class03427 class034272;
            Map var9 = this.Y.m();
            boolean bl2 = class041672.R();
            boolean bl3 = class041672.M();
            int n = class041672.z();
            this.Q = class034272 = new class03427(this.Q.s(), this.Q.U(), bl3);
            this.N(class066432, null);
            this.Y = new class03448(this, class034272, var3, var4, this.K, this.V, (class03063)this.L.B_2, bl2, class041672.L(), n);
            this.Y.N(var9);
            this.L.N(this.Y);
            this.NR.y();
        }
        this.L.N(null);
        if (class044532.method_45015()) {
            class044532.method_7346();
        }
        class04453 class044533 = class066432.N((byte)2) ? ((class03443)this.L.T_2).N(this.Y, class044532.O(), class044532.q(), class044532.l(), class044532.method_5624()) : ((class03443)this.L.T_2).N(this.Y, class044532.O(), class044532.q());
        this.N(false);
        class05858 class058583 = class058582;
        class03448 class034482 = this.Y;
        class04453 class044534 = class044533;
        class01683 class016832 = this;
        if (this.N(class016832, class044534, class034482, class058583, var3)) {
            class016832.N(class044534, class034482, class058583);
        }
        class044533.method_5838(class044532.method_5628());
        class044534 = class044533;
        class016832 = this.L;
        Operation operation = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_310, net.minecraft.class_746]");
            ((class06202)objectArray[0]).T_4 = (class04453)objectArray[1];
            return null;
        };
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class044532);
        this.N((class06202)class016832, class044534, operation, class066432, (LocalRef)localRefImpl);
        class044532 = (class04453)localRefImpl.dispose();
        if (bl) {
            this.L.A().L();
        }
        this.L.N((class07049)class044533);
        if (class066432.N((byte)2)) {
            List var10 = class044532.method_5841().L();
            if (var10 != null) {
                class044533.method_5841().N(var10);
            }
            class044533.method_18799(class044532.method_18798());
            class044533.method_36456(class044532.method_36454());
            class044533.method_36457(class044532.method_36455());
        } else {
            class044533.w();
            class044533.method_36456(-180.0f);
        }
        if (class066432.N((byte)1)) {
            class044533.method_6127().N(class044532.method_6127());
        } else {
            class044534 = class044532.method_6127();
            class016832 = class044533.method_6127();
            if (this.N((class05320)class016832, (class05320)class044534)) {
                class016832.y((class05320)class044534);
            }
        }
        this.Y.u((class07049)class044533);
        class044533.L_1 = new class04462((class05630)this.L.i_7);
        ((class03443)this.L.T_2).N((class08036)class044533);
        class044533.method_7268(class044532.method_7302());
        class044533.L(class044532.Q());
        class044533.method_43120(class041672.B());
        class044533.method_51850(class041672.Z());
        class044533.B_3 = Float.valueOf(((Float)class044532.B_3).floatValue());
        class044533.i_0 = Float.valueOf(((Float)class044532.i_0).floatValue());
        if ((class05096)this.L.v_3 instanceof class05345 || (class05096)this.L.v_3 instanceof class10511) {
            this.L.N(null);
        }
        ((class03443)this.L.T_2).N(class041672.u(), class041672.i());
    }

    public void N(class08060 class080602) {
        class00417.N((class00381)class080602, (class00638)this, (class00458)this.L.B());
        ((class04453)this.L.T_4).N(class080602.N(), class080602.y(), class080602.L());
    }

    public void N(class08095 class080952) {
        class00417.N((class00381)class080952, (class00638)this, (class00458)this.L.B());
        ((class04453)this.L.T_4).y(class080952.N());
        ((class04453)this.L.T_4).method_7344().N(class080952.y());
        ((class04453)this.L.T_4).method_7344().y(class080952.L());
    }

    public void N(class01938 class019382) {
        class00417.N((class00381)class019382, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class019382.N());
        if (class070492 == null) {
            return;
        }
        class070492.method_48922(class019382.N((class07299)this.Y));
    }

    public void N(class04469 class044692, boolean bl) {
        if (this.r.N(class044692, bl) && this.r.L() > 64) {
            this.c();
        }
    }

    public void N(class05871 class058712) {
        class00417.N((class00381)class058712, (class00638)this, (class00458)this.L.B());
        class07482 class074822 = (class07482)((class04453)this.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
        if (class058712.N() == class074822.b && class074822 instanceof class06952) {
            class06952 class069522 = (class06952)class074822;
            class069522.N(class058712.y());
            class069522.R(class058712.u());
            class069522.M(class058712.L());
            class069522.N(class058712.M());
            class069522.y(class058712.B());
        }
    }

    private void N(int n, int n2, class01832 class018322, boolean bl) {
        class05795 class057952 = this.Y.method_8398().L();
        BitSet bitSet = class018322.N();
        BitSet bitSet2 = class018322.y();
        Iterator<byte[]> var8 = class018322.L().iterator();
        this.N(n, n2, class057952, class00772.field_9284, bitSet, bitSet2, var8, bl);
        BitSet bitSet3 = class018322.u();
        BitSet bitSet4 = class018322.i();
        Iterator<byte[]> var11 = class018322.R().iterator();
        this.N(n, n2, class057952, class00772.field_9282, bitSet3, bitSet4, var11, bl);
        class057952.N(new class07321(n, n2), true);
        this.N(n, n2, class018322, bl, null);
    }

    public void N(class00504 class005042) {
        class00417.N((class00381)class005042, (class00638)this, (class00458)this.L.B());
        int n = class005042.N();
        int n2 = class005042.y();
        class01832 class018322 = class005042.L();
        this.Y.N(() -> this.N(n, n2, class018322, true));
    }

    public void N(class06636 class066362) {
        class00417.N((class00381)class066362, (class00638)this, (class00458)this.L.B());
        if (((class07482)((class04453)this.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b != class066362.N()) {
            return;
        }
        class05096 class050962 = (class05096)this.L.v_3;
        if (class050962 instanceof class05043) {
            ((class05043)class050962).N(class066362.y());
        }
    }

    public void N(class08091 class080912) {
        class00417.N((class00381)class080912, (class00638)this, (class00458)this.L.B());
        String string = class080912.N();
        if (class080912.L() == 0) {
            this.Nz.N(string, class06675.y, class080912.y(), class080912.u(), false, (class01762)class080912.M().orElse(null));
        } else {
            class00518 class005182 = this.Nz.N(string);
            if (class005182 != null) {
                if (class080912.L() == 1) {
                    this.Nz.y(class005182);
                } else if (class080912.L() == 2) {
                    class005182.N(class080912.u());
                    class005182.N(class080912.y());
                    class005182.y((class01762)class080912.M().orElse(null));
                }
            }
        }
    }

    public void N(class05705 class057052) {
        class00417.N((class00381)class057052, (class00638)this, (class00458)this.L.B());
        this.K = class057052.N();
        ((class05630)this.L.i_7).y(this.K);
        this.Y.method_8398().N(class057052.N());
        this.N(class057052, null);
    }

    public void N(class04022 class040222) {
        class00417.N((class00381)class040222, (class00638)this, (class00458)this.L.B());
        this.V = class040222.N();
        this.Y.y(this.V);
    }

    public void N(class01785 class017852) {
        class00417.N((class00381)class017852, (class00638)this, (class00458)this.L.B());
        String string = class017852.y();
        class01766 class017662 = class01766.N((String)class017852.N());
        if (string == null) {
            this.Nz.N(class017662);
        } else {
            class00518 class005182 = this.Nz.N(string);
            if (class005182 != null) {
                this.Nz.L(class017662, class005182);
            } else {
                m.warn("Received packet for unknown scoreboard objective: {}", (Object)string);
            }
        }
    }

    public void N(class08049 class080492) {
        class00417.N((class00381)class080492, (class00638)this, (class00458)this.L.B());
        String string = class080492.y();
        class01766 class017662 = class01766.N((String)class080492.N());
        class00518 class005182 = this.Nz.N(string);
        if (class005182 != null) {
            class01765 class017652 = this.Nz.N(class017662, class005182, true);
            class017652.N(class080492.L());
            class017652.N((class00392)class080492.u().orElse(null));
            class017652.N((class01762)class080492.M().orElse(null));
        } else {
            m.warn("Received packet for unknown scoreboard objective: {}", (Object)string);
        }
    }

    public void N(class06642 class066422) {
        class00417.N((class00381)class066422, (class00638)this, (class00458)this.L.B());
        String string = class066422.y();
        class00518 class005182 = string == null ? null : this.Nz.N(string);
        this.Nz.N(class066422.N(), class005182);
    }

    public void N(class02565 class025652) {
        class00502 class005022;
        class00417.N((class00381)class025652, (class00638)this, (class00458)this.L.B());
        class02724 class027242 = class025652.y();
        if (class027242 == class02724.field_29155) {
            class005022 = this.Nz.L(class025652.L());
        } else {
            class005022 = this.Nz.y(class025652.L());
            if (class005022 == null) {
                m.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{class025652.L(), class025652.y(), class025652.N()});
                return;
            }
        }
        class025652.M().ifPresent(class024062 -> {
            class005022.N(class024062.N());
            class005022.N(class024062.L());
            class005022.N(class024062.y());
            class005022.N(class024062.u());
            class005022.N(class024062.i());
            class005022.y(class024062.R());
            class005022.L(class024062.M());
        });
        class02724 class027243 = class025652.N();
        if (class027243 == class02724.field_29155) {
            for (String string : class025652.u()) {
                this.Nz.N(string, class005022);
            }
        } else if (class027243 == class02724.field_29156) {
            for (String string : class025652.u()) {
                this.Nz.y(string, class005022);
            }
        }
        if (class027242 == class02724.field_29156) {
            this.Nz.N(class005022);
        }
    }

    public void N(class00495 class004952) {
        class00417.N((class00381)class004952, (class00638)this, (class00458)this.L.B());
        if (class004952.E() == 0) {
            double d = class004952.U() * class004952.B();
            double d2 = class004952.U() * class004952.Z();
            double d3 = class004952.U() * class004952.z();
            try {
                this.Y.method_8466(class004952.W(), class004952.N(), class004952.y(), class004952.L(), class004952.u(), class004952.M(), d, d2, d3);
            }
            catch (Throwable throwable) {
                m.warn("Could not spawn particle effect {}", (Object)class004952.W());
            }
        } else {
            for (int i = 0; i < class004952.E(); ++i) {
                double d = this.e.E() * (double)class004952.B();
                double d4 = this.e.E() * (double)class004952.Z();
                double d5 = this.e.E() * (double)class004952.z();
                double d6 = this.e.E() * (double)class004952.U();
                double d7 = this.e.E() * (double)class004952.U();
                double d8 = this.e.E() * (double)class004952.U();
                try {
                    this.Y.method_8466(class004952.W(), class004952.N(), class004952.y(), class004952.L() + d, class004952.u() + d4, class004952.M() + d5, d6, d7, d8);
                    continue;
                }
                catch (Throwable throwable) {
                    m.warn("Could not spawn particle effect {}", (Object)class004952.W());
                    return;
                }
            }
        }
    }

    public void N(class08056 class080562) {
        class00417.N((class00381)class080562, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class080562.N());
        if (class070492 == null) {
            return;
        }
        if (!(class070492 instanceof class07438)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + String.valueOf(class070492) + ")");
        }
        class05320 class053202 = ((class07438)class070492).method_6127();
        for (class08085 class080852 : class080562.y()) {
            class07469 class074692 = class053202.N(class080852.N());
            if (class074692 == null) {
                m.warn("Entity {} does not have attribute {}", (Object)class070492, (Object)class080852.N().M());
                continue;
            }
            class074692.N(class080852.y());
            class074692.R();
            for (class07471 class074712 : class080852.L()) {
                class074692.y(class074712);
            }
        }
    }

    public void N(class01658 class016582) {
        this.Nu.N(class016582.N());
        this.N((class00381)new class04175(this.Nu.y()));
    }

    public void N(class00427 class004272) {
        class00417.N((class00381)class004272, (class00638)this, (class00458)this.L.B());
        this.NR.N(this.Y.N(), class004272.N(), class004272.y());
    }

    public void N(class01632 class016322) {
        this.Nu.N();
    }

    public void N(class02655 class026552) {
        class00417.N((class00381)class026552, (class00638)this, (class00458)this.L.B());
        class07049 class070492 = this.Y.method_8469(class026552.N());
        if (class070492 instanceof class08039) {
            ((class08039)class070492).L = class026552.y();
        }
    }

    public void N(class00014 class000142) {
        class00417.N((class00381)class000142, (class00638)this, (class00458)this.L.B());
        class000142.N((class00005)this.NU);
    }

    public void N(class08621 class086212) {
        class00417.N((class00381)class086212, (class00638)this, (class00458)this.L.B());
        class05096 class050962 = (class05096)this.L.v_3;
        if (class050962 instanceof class00231) {
            ((class00231)class050962).N(class086212.N(), class086212.y());
        }
    }

    public void N(class07832 class078322) {
        this.Ni.N(class078322);
    }

    public void N(class02861 class028612) {
        this.L.ND().N(class028612.N(), class028612.y());
    }

    public void N(class03284 class032842) {
        class00417.N((class00381)class032842, (class00638)this, (class00458)this.L.B());
        Iterator var2 = class032842.N().iterator();
        while (var2.hasNext()) {
            ((class00381)var2.next()).method_65081((class00638)this);
        }
    }

    public void N(class04622 class046222) {
        class00417.N((class00381)class046222, (class00638)this, (class00458)this.L.B());
        this.Y.N(class046222.N());
    }

    public void N(class05707 class057072) {
        class00417.N((class00381)class057072, (class00638)this, (class00458)this.L.B());
        this.Y.method_8398().u(class057072.N(), class057072.y());
    }

    public boolean method_48106() {
        return this.u.method_10758() && !this.NZ;
    }

    public class01707 W() {
        return this.I;
    }

    public class00272 R() {
        return this.c;
    }

    private void R(class00482 class004822, CallbackInfo callbackInfo) {
        LegacyTabList.globalTablistIndex = 0;
        ((IPlayerTabOverlay)((class01056)class06202.Nq().i_6).Z()).viaFabricPlusVisuals$setMaxPlayers(class004822.u());
    }

    public String R(String string) {
        class10963 class109632 = class10963.y((String)string);
        class11938.L().L((Object)class109632);
        return class109632.N();
    }

    public class00057 O() {
        return this.NU;
    }

    private boolean H() {
        return this.L.n().y() && this.NB;
    }

    public class03767 G() {
        return this.F;
    }

    public class08666 Y() {
        return this.NE;
    }

    public void method_18784() {
        if (this.x != null && this.L.c().y()) {
            this.v();
        }
        if (this.Ny != null && this.Ny.isDone()) {
            this.Ny.join().ifPresent(this::N);
            this.Ny = null;
        }
        this.K();
        if (this.L.ND().u()) {
            this.Ni.N();
        }
        if (this.Y != null) {
            this.NR.N(this.Y.N());
        }
        this.M.N();
        if (this.NM != null) {
            this.NM.N();
            if (this.NM.y()) {
                this.X();
                this.NM = null;
            }
        }
    }

    public @Nullable class07233 fabric_api$getLastReceivedCommandsPacket() {
        return this.Ns;
    }
}


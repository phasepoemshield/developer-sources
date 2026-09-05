/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09343
 *  Nursultan.class09454
 *  Nursultan.class10559
 *  Nursultan.class10952
 *  Nursultan.class10974
 *  Nursultan.class10980
 *  Nursultan.class10983
 *  Nursultan.class10989
 *  Nursultan.class11345
 *  Nursultan.class11380
 *  Nursultan.class11397
 *  Nursultan.class11399
 *  Nursultan.class11923
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class11995
 *  Nursultan.class12027
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.PlayerUpdateEvent
 *  baritone.api.event.events.TickEvent
 *  baritone.api.event.events.TickEvent$Type
 *  baritone.api.event.events.WorldEvent
 *  baritone.api.event.events.type.EventState
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.UnmodifiableIterator
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.BanDetails
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.minecraft.UserApiService$UserFlag
 *  com.mojang.authlib.minecraft.UserApiService$UserProperties
 *  com.mojang.authlib.yggdrasil.ProfileActionType
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.platform.GLX
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.jtracy.DiscontinuousFrame
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.api.events.LoadingCycleCallback
 *  com.viaversion.viafabricplus.api.events.LoadingCycleCallback$LoadingCycle
 *  com.viaversion.viafabricplus.base.Events
 *  com.viaversion.viafabricplus.features.world.item_picking.ItemPick1_21_3
 *  com.viaversion.viafabricplus.injection.access.execute_inputs_sync.IMouseKeyboardHandlers
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.Protocol1_11_1To1_12
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  de.maxhenkel.voicechat.events.ClientWorldEvents
 *  de.maxhenkel.voicechat.events.InputEvents
 *  dev.isxander.yacl3.gui.image.ImageRendererManager
 *  io.netty.channel.Channel
 *  it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue
 *  java.lang.runtime.SwitchBootstraps
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  me.flashyreese.mods.sodiumextra.mixin.gui.MinecraftClientAccessor
 *  minecraft.class00101
 *  minecraft.class00183
 *  minecraft.class00190
 *  minecraft.class00232
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00458
 *  minecraft.class00500
 *  minecraft.class00556
 *  minecraft.class00608
 *  minecraft.class00621
 *  minecraft.class00623
 *  minecraft.class00642
 *  minecraft.class00647
 *  minecraft.class00751
 *  minecraft.class00909
 *  minecraft.class00951
 *  minecraft.class01018
 *  minecraft.class01042
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01057
 *  minecraft.class01068
 *  minecraft.class01081
 *  minecraft.class01083
 *  minecraft.class01089
 *  minecraft.class01140
 *  minecraft.class01241
 *  minecraft.class01246
 *  minecraft.class01276
 *  minecraft.class01283
 *  minecraft.class01299
 *  minecraft.class01303
 *  minecraft.class01311
 *  minecraft.class01321
 *  minecraft.class01323
 *  minecraft.class01386
 *  minecraft.class01417
 *  minecraft.class01488
 *  minecraft.class01517
 *  minecraft.class01587
 *  minecraft.class01590
 *  minecraft.class01603
 *  minecraft.class01611
 *  minecraft.class01622
 *  minecraft.class01623
 *  minecraft.class01626
 *  minecraft.class01683
 *  minecraft.class01781
 *  minecraft.class01879
 *  minecraft.class01894
 *  minecraft.class01910
 *  minecraft.class01962
 *  minecraft.class01999
 *  minecraft.class02051
 *  minecraft.class02088
 *  minecraft.class02111
 *  minecraft.class02117
 *  minecraft.class02212
 *  minecraft.class02233
 *  minecraft.class02427
 *  minecraft.class02484
 *  minecraft.class02574
 *  minecraft.class02587
 *  minecraft.class02742
 *  minecraft.class02796
 *  minecraft.class02798
 *  minecraft.class02862
 *  minecraft.class03040
 *  minecraft.class03051
 *  minecraft.class03063
 *  minecraft.class03106
 *  minecraft.class03263
 *  minecraft.class03323
 *  minecraft.class03325
 *  minecraft.class03330
 *  minecraft.class03371
 *  minecraft.class03386
 *  minecraft.class03400
 *  minecraft.class03409
 *  minecraft.class03415
 *  minecraft.class03423
 *  minecraft.class03424
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class03453
 *  minecraft.class03463
 *  minecraft.class03464
 *  minecraft.class03465
 *  minecraft.class03467
 *  minecraft.class03469
 *  minecraft.class03499
 *  minecraft.class03520
 *  minecraft.class03531
 *  minecraft.class03556
 *  minecraft.class03579
 *  minecraft.class03597
 *  minecraft.class03770
 *  minecraft.class03771
 *  minecraft.class03914
 *  minecraft.class03930
 *  minecraft.class04032
 *  minecraft.class04173
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04284
 *  minecraft.class04368
 *  minecraft.class04379
 *  minecraft.class04410
 *  minecraft.class04441
 *  minecraft.class04453
 *  minecraft.class04524
 *  minecraft.class04526
 *  minecraft.class04538
 *  minecraft.class04541
 *  minecraft.class04555
 *  minecraft.class04568
 *  minecraft.class04578
 *  minecraft.class04583
 *  minecraft.class04643
 *  minecraft.class04645
 *  minecraft.class04655
 *  minecraft.class04669
 *  minecraft.class04678
 *  minecraft.class04680
 *  minecraft.class04681
 *  minecraft.class04687
 *  minecraft.class04705
 *  minecraft.class04771
 *  minecraft.class04777
 *  minecraft.class04785
 *  minecraft.class04808
 *  minecraft.class04866
 *  minecraft.class04911
 *  minecraft.class04999
 *  minecraft.class05075
 *  minecraft.class05096
 *  minecraft.class05111
 *  minecraft.class05123
 *  minecraft.class05125
 *  minecraft.class05153
 *  minecraft.class05216
 *  minecraft.class05304
 *  minecraft.class05345
 *  minecraft.class05363
 *  minecraft.class05384
 *  minecraft.class05410
 *  minecraft.class05455
 *  minecraft.class05463
 *  minecraft.class05470
 *  minecraft.class05628
 *  minecraft.class05630
 *  minecraft.class05685
 *  minecraft.class05695
 *  minecraft.class05731
 *  minecraft.class05850
 *  minecraft.class05858
 *  minecraft.class05866
 *  minecraft.class05909
 *  minecraft.class06007
 *  minecraft.class06014
 *  minecraft.class06086
 *  minecraft.class06090
 *  minecraft.class06095
 *  minecraft.class06128
 *  minecraft.class06132
 *  minecraft.class06134
 *  minecraft.class06290
 *  minecraft.class06305
 *  minecraft.class06307
 *  minecraft.class06320
 *  minecraft.class06418
 *  minecraft.class06428
 *  minecraft.class06463
 *  minecraft.class06468
 *  minecraft.class06541
 *  minecraft.class06543
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06603
 *  minecraft.class06724
 *  minecraft.class06728
 *  minecraft.class06734
 *  minecraft.class06739
 *  minecraft.class06748
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07064
 *  minecraft.class07071
 *  minecraft.class07074
 *  minecraft.class07078
 *  minecraft.class07080
 *  minecraft.class07082
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07356
 *  minecraft.class07364
 *  minecraft.class07438
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07604
 *  minecraft.class07816
 *  minecraft.class07844
 *  minecraft.class07849
 *  minecraft.class07878
 *  minecraft.class07904
 *  minecraft.class07949
 *  minecraft.class08027
 *  minecraft.class08036
 *  minecraft.class08066
 *  minecraft.class08097
 *  minecraft.class08117
 *  minecraft.class08172
 *  minecraft.class08212
 *  minecraft.class08265
 *  minecraft.class08290
 *  minecraft.class08337
 *  minecraft.class08377
 *  minecraft.class08388
 *  minecraft.class08392
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08555
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08694
 *  minecraft.class08700
 *  minecraft.class08712
 *  minecraft.class08718
 *  minecraft.class08759
 *  minecraft.class08764
 *  minecraft.class08773
 *  minecraft.class08844
 *  minecraft.class08887
 *  minecraft.class08918
 *  minecraft.class08943
 *  minecraft.class09000
 *  minecraft.class09002
 *  minecraft.class09016
 *  minecraft.class09033
 *  minecraft.class09037
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.checks.ResourcePackScanner
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds$Reference
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager
 *  net.caffeinemc.mods.sodium.client.gui.SodiumConfigBuilder
 *  net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents$ClientStarted
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents$ClientStopping
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$EndTick
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$StartTick
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents$AfterClientWorldChange
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterTick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeTick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$Remove
 *  net.fabricmc.fabric.api.event.client.player.ClientPreAttackCallback
 *  net.fabricmc.fabric.api.event.player.UseEntityCallback
 *  net.fabricmc.fabric.impl.datagen.FabricDataGenHelper
 *  net.fabricmc.fabric.impl.registry.sync.RemapException
 *  net.fabricmc.fabric.impl.registry.sync.RemappableRegistry
 *  net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockInitTracker
 *  net.fabricmc.fabric.mixin.event.interaction.client.KeyMappingAccessor
 *  net.fabricmc.fabric.mixin.networking.client.accessor.MinecraftAccessor
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.impl.game.minecraft.Hooks
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$PngData
 *  net.irisshaders.iris.shaderpack.texture.TextureFilteringData
 *  net.irisshaders.iris.targets.backed.NativeImageBackedCustomTexture
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.IOUtils
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  squeek.appleskin.client.HUDOverlayHandler
 */
package minecraft;

import Nursultan.class09343;
import Nursultan.class09454;
import Nursultan.class10559;
import Nursultan.class10952;
import Nursultan.class10974;
import Nursultan.class10980;
import Nursultan.class10983;
import Nursultan.class10989;
import Nursultan.class11345;
import Nursultan.class11380;
import Nursultan.class11397;
import Nursultan.class11399;
import Nursultan.class11923;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class11995;
import Nursultan.class12027;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.WorldEvent;
import baritone.api.event.events.type.EventState;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.ProfileActionType;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.api.events.LoadingCycleCallback;
import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.features.world.item_picking.ItemPick1_21_3;
import com.viaversion.viafabricplus.injection.access.execute_inputs_sync.IMouseKeyboardHandlers;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.Protocol1_11_1To1_12;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import de.maxhenkel.voicechat.events.InputEvents;
import dev.isxander.yacl3.gui.image.ImageRendererManager;
import io.netty.channel.Channel;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.lang.management.ManagementFactory;
import java.lang.runtime.SwitchBootstraps;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.IntBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.mixin.gui.MinecraftClientAccessor;
import minecraft.class00101;
import minecraft.class00183;
import minecraft.class00190;
import minecraft.class00232;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00458;
import minecraft.class00500;
import minecraft.class00556;
import minecraft.class00608;
import minecraft.class00621;
import minecraft.class00623;
import minecraft.class00642;
import minecraft.class00647;
import minecraft.class00751;
import minecraft.class00909;
import minecraft.class00951;
import minecraft.class01018;
import minecraft.class01042;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01057;
import minecraft.class01068;
import minecraft.class01081;
import minecraft.class01083;
import minecraft.class01089;
import minecraft.class01140;
import minecraft.class01241;
import minecraft.class01246;
import minecraft.class01276;
import minecraft.class01283;
import minecraft.class01299;
import minecraft.class01303;
import minecraft.class01311;
import minecraft.class01321;
import minecraft.class01323;
import minecraft.class01386;
import minecraft.class01417;
import minecraft.class01488;
import minecraft.class01517;
import minecraft.class01587;
import minecraft.class01590;
import minecraft.class01603;
import minecraft.class01611;
import minecraft.class01622;
import minecraft.class01623;
import minecraft.class01626;
import minecraft.class01683;
import minecraft.class01781;
import minecraft.class01879;
import minecraft.class01894;
import minecraft.class01910;
import minecraft.class01962;
import minecraft.class01999;
import minecraft.class02051;
import minecraft.class02088;
import minecraft.class02111;
import minecraft.class02117;
import minecraft.class02212;
import minecraft.class02233;
import minecraft.class02427;
import minecraft.class02484;
import minecraft.class02574;
import minecraft.class02587;
import minecraft.class02742;
import minecraft.class02796;
import minecraft.class02798;
import minecraft.class02862;
import minecraft.class03040;
import minecraft.class03051;
import minecraft.class03063;
import minecraft.class03106;
import minecraft.class03263;
import minecraft.class03323;
import minecraft.class03325;
import minecraft.class03330;
import minecraft.class03371;
import minecraft.class03386;
import minecraft.class03400;
import minecraft.class03409;
import minecraft.class03415;
import minecraft.class03423;
import minecraft.class03424;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class03453;
import minecraft.class03463;
import minecraft.class03464;
import minecraft.class03465;
import minecraft.class03467;
import minecraft.class03469;
import minecraft.class03499;
import minecraft.class03520;
import minecraft.class03531;
import minecraft.class03556;
import minecraft.class03579;
import minecraft.class03597;
import minecraft.class03770;
import minecraft.class03771;
import minecraft.class03914;
import minecraft.class03930;
import minecraft.class04032;
import minecraft.class04173;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04284;
import minecraft.class04368;
import minecraft.class04379;
import minecraft.class04410;
import minecraft.class04441;
import minecraft.class04453;
import minecraft.class04524;
import minecraft.class04526;
import minecraft.class04538;
import minecraft.class04541;
import minecraft.class04555;
import minecraft.class04568;
import minecraft.class04578;
import minecraft.class04583;
import minecraft.class04643;
import minecraft.class04645;
import minecraft.class04655;
import minecraft.class04669;
import minecraft.class04678;
import minecraft.class04680;
import minecraft.class04681;
import minecraft.class04687;
import minecraft.class04705;
import minecraft.class04771;
import minecraft.class04777;
import minecraft.class04785;
import minecraft.class04808;
import minecraft.class04866;
import minecraft.class04911;
import minecraft.class04999;
import minecraft.class05075;
import minecraft.class05096;
import minecraft.class05111;
import minecraft.class05123;
import minecraft.class05125;
import minecraft.class05153;
import minecraft.class05216;
import minecraft.class05304;
import minecraft.class05345;
import minecraft.class05363;
import minecraft.class05384;
import minecraft.class05410;
import minecraft.class05455;
import minecraft.class05463;
import minecraft.class05470;
import minecraft.class05628;
import minecraft.class05630;
import minecraft.class05685;
import minecraft.class05695;
import minecraft.class05731;
import minecraft.class05850;
import minecraft.class05858;
import minecraft.class05866;
import minecraft.class05909;
import minecraft.class06007;
import minecraft.class06014;
import minecraft.class06086;
import minecraft.class06090;
import minecraft.class06095;
import minecraft.class06128;
import minecraft.class06132;
import minecraft.class06134;
import minecraft.class06145;
import minecraft.class06164;
import minecraft.class06176;
import minecraft.class06183;
import minecraft.class06197;
import minecraft.class06204;
import minecraft.class06216;
import minecraft.class06219;
import minecraft.class06220;
import minecraft.class06244;
import minecraft.class06290;
import minecraft.class06305;
import minecraft.class06307;
import minecraft.class06320;
import minecraft.class06418;
import minecraft.class06428;
import minecraft.class06463;
import minecraft.class06468;
import minecraft.class06541;
import minecraft.class06543;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06603;
import minecraft.class06724;
import minecraft.class06728;
import minecraft.class06734;
import minecraft.class06739;
import minecraft.class06748;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07064;
import minecraft.class07071;
import minecraft.class07074;
import minecraft.class07078;
import minecraft.class07080;
import minecraft.class07082;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07356;
import minecraft.class07364;
import minecraft.class07438;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07604;
import minecraft.class07816;
import minecraft.class07844;
import minecraft.class07849;
import minecraft.class07878;
import minecraft.class07904;
import minecraft.class07949;
import minecraft.class08027;
import minecraft.class08036;
import minecraft.class08066;
import minecraft.class08097;
import minecraft.class08117;
import minecraft.class08172;
import minecraft.class08212;
import minecraft.class08265;
import minecraft.class08290;
import minecraft.class08337;
import minecraft.class08377;
import minecraft.class08388;
import minecraft.class08392;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08555;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08694;
import minecraft.class08700;
import minecraft.class08712;
import minecraft.class08718;
import minecraft.class08759;
import minecraft.class08764;
import minecraft.class08773;
import minecraft.class08844;
import minecraft.class08887;
import minecraft.class08918;
import minecraft.class08943;
import minecraft.class09000;
import minecraft.class09002;
import minecraft.class09016;
import minecraft.class09033;
import minecraft.class09037;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.checks.ResourcePackScanner;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.gui.SodiumConfigBuilder;
import net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.event.client.player.ClientPreAttackCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.fabricmc.fabric.impl.registry.sync.RemapException;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry;
import net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockInitTracker;
import net.fabricmc.fabric.mixin.event.interaction.client.KeyMappingAccessor;
import net.fabricmc.fabric.mixin.networking.client.accessor.MinecraftAccessor;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.impl.game.minecraft.Hooks;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.shaderpack.texture.CustomTextureData;
import net.irisshaders.iris.shaderpack.texture.TextureFilteringData;
import net.irisshaders.iris.targets.backed.NativeImageBackedCustomTexture;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.client.HUDOverlayHandler;

@Environment(value=EnvType.CLIENT)
public class class06202
extends class01303<Runnable>
implements class04678,
class11995,
MinecraftClientAccessor,
MinecraftAccessor {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;
    public Object i_6;
    public Object i_7;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object M_0;
    public Object M_1;
    public Object M_2;
    public Object M_3;
    public Object M_4;
    public Object M_5;
    public Object M_6;
    public Object M_7;
    public Object B_0;
    public Object B_1;
    public Object B_2;
    public Object B_3;
    public Object B_4;
    public Object B_5;
    public Object B_6;
    public Object Z_0;
    public Object Z_1;
    public Object Z_2;
    public Object Z_3;
    public Object Z_4;
    public Object Z_5;
    public Object Z_6;
    public Object Z_7;
    public Object z_0;
    public Object z_1;
    public Object z_2;
    public Object z_3;
    public Object z_4;
    public Object z_5;
    public Object z_6;
    public Object z_7;
    public Object U_0;
    public Object U_1;
    public Object U_2;
    public Object U_3;
    public Object U_4;
    public Object U_5;
    public Object E_0;
    public Object E_1;
    public Object E_2;
    public Object E_3;
    public Object E_4;
    public Object E_5;
    public Object E_6;
    public Object E_7;
    public Object W_0;
    public Object W_1;
    public Object W_2;
    public Object W_3;
    public Object W_4;
    public Object W_5;
    public Object m_0;
    public Object m_1;
    public Object m_2;
    public Object m_3;
    public Object P_0;
    public Object P_1;
    public Object s_0;
    public Object s_1;
    public Object T_0;
    public Object T_1;
    public Object T_2;
    public Object T_3;
    public Object T_4;
    public Object T_5;
    public Object T_6;
    public Object b_0;
    public Object b_1;
    public Object b_2;
    public static Object j_0;
    public static Object j_1;
    public static Object j_2;
    public static Object j_3;
    public static Object j_4;
    public Object v_0;
    public Object v_1;
    public Object v_2;
    public Object v_3;
    public Object n_0;
    public Object n_1;
    public Object n_2;
    public Object n_3;
    public static Object t_0;
    public static Object t_1;
    public Object G_0;
    public Object G_1;
    public Object G_2;
    public Object G_3;
    public Object G_4;
    public Object G_5;
    public Object l_0;
    public Object l_1;
    public Object l_2;
    public Object l_3;
    public Object l_4;
    public Object l_5;
    public Object l_6;
    public static Object d_0;
    public static Object d_1;
    public static Object d_2;
    public static Object d_3;
    public static Object d_4;
    public static Object d_5;
    public static Object d_6;
    public static Object d_7;
    public boolean z_init;

    private void w(CallbackInfo callbackInfo) {
        ((ClientTickEvents.EndTick)ClientTickEvents.END_CLIENT_TICK.invoker()).onEndTick(this);
    }

    public class02862 NY() {
        this.yF();
        return (class02862)this.B_5;
    }

    private void L(@Nullable class00392 class003922) {
        class06132.y((class06086)this.m(), (class06095)class06095.L, (class00392)class00392.L((String)"resourcePack.load_fail"), (class00392)class003922);
    }

    public void L(class05096 class050962) {
        this.yF();
        this.N(class050962, null);
        class01683 class016832 = this.NE();
        if (class016832 != null) {
            class016832.i();
        }
        if (((class04526)this.R_2).i()) {
            this.yx();
        }
        ((class03386)this.i_5).W();
        this.T_2 = null;
        ((class05153)this.N_3).y();
        this.G_1 = true;
        try {
            this.y(class050962);
            ((class01056)this.i_6).z();
            this.T_3 = null;
            this.y((class03448)null);
            this.T_4 = null;
        }
        finally {
            this.G_1 = false;
        }
    }

    public void L(class07080 class070802) {
        this.yF();
        this.G_4 = () -> class070802;
    }

    private void L(@Nullable class05096 class050962, CallbackInfo callbackInfo) {
        this.yF();
        Thread thread = Thread.currentThread();
        if (((Boolean)d_7).booleanValue() && thread != (Thread)this.G_2) {
            ((Logger)d_6).error("Attempted to set screen to \"{}\" outside the render thread (\"{}\"). This will likely follow a crash! Make sure to call setScreen on the render thread.", (Object)class050962, (Object)thread.getName());
        }
    }

    public void L(boolean bl) {
        this.yF();
        this.U_3 = bl;
    }

    private void L(CallbackInfoReturnable callbackInfoReturnable) {
        this.yF();
        if (((Boolean)this.n_0).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void L(boolean bl, CallbackInfo callbackInfo) {
        this.yF();
        long l = GL32C.glFenceSync((int)37143, (int)0);
        if (l == 0L) {
            throw new RuntimeException("Failed to create fence object");
        }
        ((LongArrayFIFOQueue)this.n_2).enqueue(l);
    }

    public boolean L(Runnable runnable) {
        return true;
    }

    public boolean L() {
        class08844 class088442 = this.Nt();
        return class04655.N((class08844)class088442, (int)340) || class04655.N((class08844)class088442, (int)344);
    }

    private void L(class03448 class034482, CallbackInfo callbackInfo) {
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onWorldEvent(new WorldEvent(class034482, EventState.POST));
    }

    private void L(@Nullable class06216 class062162) {
        this.yF();
        Runnable runnable = this.u(class062162);
        class03467.N.y(class02117.Q);
        class03467.N.y(class02117.w);
        class03467.N.N(((class03323)this.m_0).N());
        runnable.run();
        ((class05630)this.i_7).NO = true;
        ((class05630)this.i_7).Np();
    }

    private void L(CallbackInfo callbackInfo) {
        class08700.N().N("iris_keybinds");
        Iris.handleKeybinds((class06202)this);
        class08700.N().L();
    }

    public /* synthetic */ class00642 getConnection() {
        this.yF();
        return (class00642)this.T_6;
    }

    public class03400 Nd() {
        this.yF();
        return (class03400)this.m_2;
    }

    public class03325 Nl() {
        this.yF();
        return (class03325)this.m_3;
    }

    public void No() {
        this.yF();
        ((class05463)this.b_1).N();
        this.c().N();
    }

    private void M(boolean bl) {
        long l;
        class06734 class067342;
        int n;
        this.yF();
        this.N(bl, (CallbackInfo)null);
        this.y((CallbackInfo)null);
        ((class08844)this.z_7).N("Pre render");
        if (((class08844)this.z_7).L()) {
            this.NP();
        }
        if ((CompletableFuture)this.U_4 != null && !((class01323)this.G_0 instanceof class06305)) {
            CompletableFuture completableFuture = (CompletableFuture)this.U_4;
            this.U_4 = null;
            this.yy().thenRun(() -> completableFuture.complete(null));
        }
        class02212 class022122 = (class02212)this.B_0;
        long l2 = class07536.L();
        this.u(bl, null);
        int n2 = class022122.N(l2, bl);
        class04643 class046432 = class08700.N();
        if (bl) {
            try (class06734 class067343 = this.yj();){
                class046432.N("scheduledPacketProcessing");
                ((class00458)this.Z_4).y();
                class046432.y("scheduledExecutables");
                this.g();
                class046432.L();
            }
            class046432.N("tick");
            if (n2 > 0 && this.yQ()) {
                class046432.N("textures");
                ((class08627)this.z_3).N();
                class046432.L();
            }
            for (n = 0; n < Math.min(10, n2); ++n) {
                class046432.R("clientTick");
                class067342 = this.yj();
                try {
                    this.NQ();
                    continue;
                }
                finally {
                    if (class067342 != null) {
                        class067342.close();
                    }
                }
            }
            if (n2 > 0 && ((class03448)this.T_3 == null || ((class03448)this.T_3).method_54719().Z())) {
                this.Z_6 = ((class06739)this.Z_5).N();
            }
            class046432.L();
        }
        ((class08844)this.z_7).N("Render");
        class067342 = ((class03063)this.B_2).l();
        try {
            class046432.N("gpuAsync");
            RenderSystem.executePendingTasks();
            class046432.y("sound");
            ((class09033)this.E_1).N(((class03386)this.i_5).s());
            class046432.y("toasts");
            ((class06086)this.u_7).N();
            class046432.y("mouse");
            ((class06220)this.L_2).N();
            class046432.y("render");
            l = class07536.u();
            if (((class05731)this.L_0).y(class06134.k) || ((class04526)this.R_2).i()) {
                int n3 = n = ((class04379)this.N_2 == null || ((class04379)this.N_2).y()) && !class04368.N().y() ? 1 : 0;
                if (n != 0) {
                    class04368.N().L();
                }
            } else {
                n = 0;
                this.N_1 = 0.0;
            }
            class08066 class080662 = this.e();
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(class080662.L(), 0, class080662.i(), 1.0);
            class046432.N("gameRenderer");
            if (!((Boolean)this.v_2).booleanValue()) {
                ((class03386)this.i_5).N((class02233)((class02212)this.B_0), bl);
            }
            class046432.y("blit");
            class08844 class088442 = (class08844)this.z_7;
            this.y(bl, (CallbackInfo)null);
            class08844 class088443 = class088442;
            if (!this.N(class088443)) {
                class080662.y();
            }
            this.G_5 = class07536.u() - l;
            if (n != 0) {
                this.N_2 = class04368.N().u();
            }
            class046432.y("updateDisplay");
            if ((class08712)this.E_0 != null) {
                ((class08712)this.E_0).N();
                ((class08712)this.E_0).N(class080662);
            }
            class08844 class088444 = (class08844)this.z_7;
            class08712 class087122 = (class08712)this.E_0;
            this.i(bl, null);
            class088444.N(class087122);
            int n4 = ((class02742)this.U_0).N();
            if (n4 < 260) {
                RenderSystem.limitDisplayFPS((int)n4);
            }
            class046432.L();
            class046432.y("yield");
            Thread.yield();
            class046432.L();
        }
        finally {
            if (class067342 != null) {
                class067342.close();
            }
        }
        ((class08844)this.z_7).N("Post render");
        this.v_1 = (Integer)this.v_1 + 1;
        boolean bl2 = (Boolean)this.M_6;
        this.M_6 = this.v() && ((class05096)this.v_3 != null && ((class05096)this.v_3).method_25421() || (class01323)this.G_0 != null && ((class01323)this.G_0).N()) && !((class08337)this.T_5).P();
        if (!bl2 && ((Boolean)this.M_6).booleanValue()) {
            ((class09033)this.E_1).N(new class04911[]{class04911.field_15253, class04911.field_61058});
        }
        ((class02212)this.B_0).y(((Boolean)this.M_6).booleanValue());
        ((class02212)this.B_0).L(!this.yQ());
        l = class07536.u();
        long l3 = l - (Long)this.M_7;
        if (n != 0) {
            this.N_0 = l3;
        }
        this.ND().N(l3);
        this.M_7 = l;
        class046432.N("fpsUpdate");
        if ((class04379)this.N_2 != null && ((class04379)this.N_2).y()) {
            this.N_1 = (double)((class04379)this.N_2).L() * 100.0 / (double)((Long)this.N_0).longValue();
        }
        while (class07536.L() >= (Long)this.v_0 + 1000L) {
            d_4 = (int)((Integer)this.v_1);
            this.R(bl, null);
            this.v_0 = (Long)this.v_0 + 1000L;
            this.v_1 = 0;
        }
        class046432.L();
        this.L(bl, null);
    }

    public Path M() {
        this.yF();
        return (Path)this.z_1;
    }

    private void M(CallbackInfo callbackInfo) {
        this.yF();
        if ((BiFunction)this.Z_7 == null) {
            return;
        }
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            TickEvent.Type type = iBaritone.getPlayerContext().player() != null && iBaritone.getPlayerContext().world() != null ? TickEvent.Type.IN : TickEvent.Type.OUT;
            iBaritone.getGameEventHandler().onPostTick((TickEvent)((BiFunction)this.Z_7).apply(EventState.POST, type));
        }
        this.Z_7 = null;
    }

    private void M(boolean bl, CallbackInfo callbackInfo) {
        this.yF();
        if (((Boolean)this.n_0).booleanValue()) {
            if ((class03443)this.T_2 != null) {
                ((class03443)this.T_2).L();
            }
            callbackInfo.cancel();
        }
    }

    private void P(CallbackInfo callbackInfo) {
        this.yF();
        if (DebugSettings.INSTANCE.executeInputsSynchronously.isEnabled()) {
            Queue queue = ((IMouseKeyboardHandlers)((class06220)this.L_2)).viaFabricPlus$getPendingScreenEvents();
            while (!queue.isEmpty()) {
                ((Runnable)queue.poll()).run();
            }
            queue = ((IMouseKeyboardHandlers)((class06197)this.L_3)).viaFabricPlus$getPendingScreenEvents();
            while (!queue.isEmpty()) {
                ((Runnable)queue.poll()).run();
            }
        }
    }

    public boolean P() {
        this.yF();
        return (Boolean)this.M_6;
    }

    public void NP() {
        this.yF();
        this.G_3 = false;
    }

    public class08396 X() {
        this.yF();
        return (class08396)this.s_1;
    }

    public class03579 K() {
        this.yF();
        return (class03579)this.b_2;
    }

    private void T(CallbackInfo callbackInfo) {
        ((Logger)j_1).debug("Freezing registries");
        class04206.N();
        BlockInitTracker.postFreeze();
        class03771.N();
    }

    public boolean T() {
        this.yF();
        return (class04453)this.T_4 != null && (class03443)this.T_2 != null;
    }

    private void Q(CallbackInfo callbackInfo) {
        class11397 class113972 = class11397.L();
        class11938.L().L((Object)class113972);
        if (class113972.y()) {
            callbackInfo.cancel();
        }
    }

    public class06202(class09454 class094542) {
        super("Client");
        Object object;
        Object object2;
        Object object3;
        this.yF();
        this.n_2 = new LongArrayFIFOQueue();
        this.n_3 = Workarounds.isWorkaroundEnabled((Workarounds.Reference)Workarounds.Reference.INTEL_FRAMEBUFFER_BLIT_CRASH_WHEN_UNFOCUSED);
        this.z_0 = Double.doubleToLongBits(Math.PI);
        this.B_0 = new class02212(20.0f, 0L, this::N);
        this.l_0 = class02111.field_41777;
        this.E_6 = new class03520((class01894)t_1, class06202::N);
        this.M_7 = class07536.u();
        this.U_2 = true;
        this.R_2 = class04538.N;
        this.R_3 = new class03465();
        this.Z_5 = new class06739();
        this.Z_6 = new ArrayList();
        j_0 = this;
        this.Z_2 = System.currentTimeMillis();
        this.l_1 = class094542.L.N;
        File file = class094542.L.L;
        this.z_1 = class094542.L.y.toPath();
        this.l_2 = class094542.u.y;
        this.l_3 = class094542.u.L;
        Path path = ((File)this.l_1).toPath();
        this.Z_0 = class04777.N((Path)path.resolve("allowed_symlinks.txt"));
        class00190 class001902 = new class00190(class094542.L.N(), (class04173)this.Z_0);
        this.W_5 = new class00232(this, path.resolve("downloads"), class094542.N);
        class01626 class016262 = new class01626((Path)this.z_1, class01603.field_14188, class01283.y, (class04173)this.Z_0);
        this.s_0 = new class01623(new class01057[]{class001902, ((class00232)this.W_5).N(), class016262});
        this.W_4 = class001902.L();
        this.l_4 = class094542.N.y;
        this.l_5 = class094542.u.B;
        YggdrasilAuthenticationService yggdrasilAuthenticationService = (Boolean)this.l_5 != false ? YggdrasilAuthenticationService.createOffline((Proxy)((Proxy)this.l_4)) : new YggdrasilAuthenticationService((Proxy)this.l_4);
        this.T_0 = class03930.N((YggdrasilAuthenticationService)yggdrasilAuthenticationService, (File)((File)this.l_1));
        this.i_2 = class094542.N.N;
        this.z_2 = (Boolean)this.l_5 != false ? CompletableFuture.completedFuture(null) : CompletableFuture.supplyAsync(() -> {
            this.yF();
            return ((class03930)this.T_0).L().fetchProfile(((class04771)this.i_2).y(), true);
        }, (Executor)class07536.z());
        this.E_7 = this.N(yggdrasilAuthenticationService, class094542);
        this.u_0 = CompletableFuture.supplyAsync(() -> UserApiService.OFFLINE_PROPERTIES, (Executor)class07536.z());
        ((Logger)j_1).info("Setting user: {}", (Object)((class04771)this.i_2).L());
        ((Logger)j_1).debug("(Session ID is {})", (Object)((class04771)this.i_2).N());
        this.W_0 = class094542.u.N;
        this.W_1 = !class094542.u.u;
        this.W_2 = !class094542.u.i;
        this.T_5 = null;
        class04441.N(class06428::N);
        this.z_5 = class04999.N();
        Hooks.startClient((File)((File)this.l_1), (Object)((Object)this));
        this.T(null);
        this.G_2 = Thread.currentThread();
        File file2 = (File)this.l_1;
        this.R(null);
        this.i_7 = new class05630(this, file2);
        this.L_0 = new class05731((File)this.l_1);
        this.u_7 = new class06086(this, (class05630)this.i_7);
        boolean bl = ((class05630)this.i_7).NO;
        ((class05630)this.i_7).NO = false;
        ((class05630)this.i_7).Np();
        this.G_3 = true;
        this.b_0 = new class08764(this, (class05630)this.i_7);
        this.L_1 = new class06418(path, (DataFixer)this.z_5);
        Logger logger = (Logger)j_1;
        this.W(null);
        logger.info("Backend library: {}", (Object)RenderSystem.getBackendDescription());
        class01018 class010182 = class094542.y;
        if (((class05630)this.i_7).s > 0 && ((class05630)this.i_7).P > 0) {
            class010182 = class094542.y.N(((class05630)this.i_7).P, ((class05630)this.i_7).s);
        }
        if (!bl) {
            class010182 = class010182.N(false);
            ((class05630)this.i_7).U = null;
            ((Logger)j_1).warn("Detected unexpected shutdown during last game startup: resetting fullscreen mode");
        }
        class07536.u = RenderSystem.initBackendSystem();
        this.z_6 = new class04669(this);
        this.z_7 = ((class04669)this.z_6).N(class010182, ((class05630)this.i_7).U, this.LN());
        this.L(true);
        ((class08844)this.z_7).N((Runnable)new class10559(this, class094542));
        class03467.N.y(class02117.k);
        try {
            ((class08844)this.z_7).N((class01622)((class01611)this.W_4), class07529.y().comp_4031() ? class03499.field_44650 : class03499.field_44651);
        }
        catch (IOException iOException) {
            ((Logger)j_1).error("Couldn't set icon", (Throwable)iOException);
        }
        this.L_2 = new class06220(this);
        ((class06220)this.L_2).N((class08844)this.z_7);
        this.L_3 = new class06197(this);
        ((class06197)this.L_3).N((class08844)this.z_7);
        RenderSystem.initRenderer((long)((class08844)this.z_7).B(), (int)((class05630)this.i_7).j, (boolean)class07529.e, (class018942, shaderType) -> this.ym().N(class018942, shaderType), (boolean)class094542.u.M);
        ((class05630)this.i_7).N((class01241)((class05630)this.i_7).Z().method_41753());
        ((Logger)j_1).info("Using optional rendering extensions: {}", (Object)String.join((CharSequence)", ", RenderSystem.getDevice().getEnabledExtensions()));
        this.P_1 = new class03453(((class08844)this.z_7).U(), ((class08844)this.z_7).E());
        this.W_3 = new class01068(class01603.field_14188);
        ((class01623)this.s_0).N();
        ((class05630)this.i_7).y((class01623)this.s_0);
        this.s_1 = new class08396(((class05630)this.i_7).Nk, class084292 -> {
            this.yF();
            if ((class04453)this.T_4 != null) {
                ((class01683)((class04453)this.T_4).y_0).k();
            }
        });
        ((class01068)this.W_3).N((class01081)((class08396)this.s_1));
        this.z_3 = new class08627((class01089)((class01068)this.W_3));
        ((class01068)this.W_3).N((class01081)((class08627)this.z_3));
        this.z_4 = new class08212((class08627)this.z_3, this::N);
        ((class01068)this.W_3).N((class01081)((class08212)this.z_4));
        class08377 class083772 = new class08377((Proxy)this.l_4, (class08627)this.z_3, (Executor)((Object)this));
        this.u_1 = new class08555(file.toPath().resolve("skins"), (class03930)this.T_0, class083772, (Executor)((Object)this));
        this.l_6 = new class04777(path.resolve("saves"), path.resolve("backups"), (class04173)this.Z_0, (DataFixer)this.z_5);
        this.N_6 = new class01879(path);
        this.E_2 = new class09000(this);
        this.E_1 = new class09033((class05630)this.i_7);
        ((class01068)this.W_3).N((class01081)((class09033)this.E_1));
        this.E_4 = new class06176((class04771)this.i_2);
        ((class01068)this.W_3).N((class01081)((class06176)((Object)this.E_4)));
        this.u_2 = new class08117((class08627)this.z_3, ((Integer)((class05630)this.i_7).V().method_41753()).intValue());
        ((class01068)this.W_3).N((class01081)((class08117)this.u_2));
        class07904 class079042 = new class07904(this, ((class03930)this.T_0).M());
        this.T_1 = new class07949((class08627)this.z_3, (class08555)this.u_1, (class00909)class079042);
        class06603.N((class07949)((class07949)this.T_1));
        this.E_3 = new class04866((class08627)this.z_3, (class08117)this.u_2, (class07949)this.T_1);
        this.i_3 = ((class04866)this.E_3).N();
        this.i_4 = ((class04866)this.E_3).y();
        ((class01068)this.W_3).N((class01081)((class04866)this.E_3));
        this.NU();
        ((class01068)this.W_3).N((class01081)new class08543());
        ((class01068)this.W_3).N((class01081)new class08575());
        ((class01068)this.W_3).N((class01081)new class08521());
        ((class08844)this.z_7).N("Startup");
        RenderSystem.setupDefaultState();
        ((class08844)this.z_7).N("Post startup");
        this.P_0 = class01587.N();
        this.u_3 = new class00183((class01587)this.P_0, (class08117)this.u_2, (class07949)this.T_1);
        ((class01068)this.W_3).N((class01081)((class00183)this.u_3));
        class08718 class087182 = new class08718();
        ((class01068)this.W_3).N((class01081)class087182);
        this.B_4 = new class08943((class00183)this.u_3);
        this.B_5 = new class02862();
        this.u_5 = new class08265((class08627)this.z_3);
        this.B_6 = new class01083((class08117)this.u_2, (class08265)this.u_5);
        try {
            int n = Runtime.getRuntime().availableProcessors();
            class07849.N();
            this.B_1 = new class01386(n);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)("Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: " + String.valueOf(class03597.U)), (CharSequence)"ok", (CharSequence)"error", (boolean)true);
            throw new class05909("Unable to allocate render buffers", (Throwable)outOfMemoryError);
        }
        this.b_1 = new class05463(this, (UserApiService)this.E_7);
        this.u_4 = new class01999(((class00183)this.u_3).y(), (class08097)((class08117)this.u_2), (class01587)this.P_0);
        ((class01068)this.W_3).N((class01081)((class01999)this.u_4));
        this.B_3 = new class01781(this, (class08627)this.z_3, (class08943)this.B_4, (class01083)this.B_6, (class01999)this.u_4, (class08117)this.u_2, (class01590)this.i_3, (class05630)this.i_7, ((class00183)this.u_3).u(), class087182, (class07949)this.T_1);
        ((class01068)this.W_3).N((class01081)((class01781)this.B_3));
        this.b_2 = new class03579((class01590)this.i_3, ((class00183)this.u_3).u(), (class01999)this.u_4, (class08943)this.B_4, (class02862)this.B_5, (class01781)this.B_3, (class08097)((class08117)this.u_2), (class07949)this.T_1);
        ((class01068)this.W_3).N((class01081)((class03579)this.b_2));
        this.i_1 = new class00951();
        ((class01068)this.W_3).N((class01081)((class00951)this.i_1));
        this.i_0 = new class04410((class03448)this.T_3, (class00951)this.i_1);
        ((class00951)this.i_1).N(() -> ((class04410)((class04410)this.i_0)).L());
        this.u_6 = new class08290();
        ((class01068)this.W_3).N((class01081)((class08290)this.u_6));
        this.i_5 = new class03386(this, ((class01781)this.B_3).y(), (class01386)this.B_1, (class01999)this.u_4);
        this.B_2 = new class03063(this, (class01781)this.B_3, (class03579)this.b_2, (class01386)this.B_1, ((class03386)this.i_5).u(), ((class03386)this.i_5).L());
        ((class01068)this.W_3).N((class01081)((class03063)this.B_2));
        ((class01068)this.W_3).N((class01081)((class03063)this.B_2).G());
        this.E_5 = new class01246();
        ((class01068)this.W_3).N((class01081)((class01246)this.E_5));
        ((class01068)this.W_3).N((class01081)((class03520)this.E_6));
        this.i_6 = new class01056(this);
        class05111 class051112 = class05111.N((class06202)this);
        this.m_2 = new class03400(class051112);
        RenderSystem.setErrorCallback(this::N);
        if (((class08066)this.P_1).N != ((class08844)this.z_7).U() || ((class08066)this.P_1).y != ((class08844)this.z_7).E()) {
            object3 = new StringBuilder("Recovering from unsupported resolution (" + ((class08844)this.z_7).U() + "x" + ((class08844)this.z_7).E() + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).");
            try {
                object2 = RenderSystem.getDevice();
                object = object2.getLastDebugMessages();
                if (!object.isEmpty()) {
                    ((StringBuilder)object3).append("\n\nReported GL debug messages:\n").append(String.join((CharSequence)"\n", object));
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            ((class08844)this.z_7).N(((class08066)this.P_1).N, ((class08066)this.P_1).y);
            TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)((StringBuilder)object3).toString(), (CharSequence)"ok", (CharSequence)"error", (boolean)false);
        } else if (((Boolean)((class05630)this.i_7).NP().method_41753()).booleanValue() && !((class08844)this.z_7).Z()) {
            if (bl) {
                ((class08844)this.z_7).M();
                ((class05630)this.i_7).NP().method_41748((Object)((class08844)this.z_7).Z());
            } else {
                ((class05630)this.i_7).NP().method_41748((Object)false);
            }
        }
        ((class08844)this.z_7).N(((Boolean)((class05630)this.i_7).NN().method_41753()).booleanValue());
        ((class08844)this.z_7).y(((Boolean)((class05630)this.i_7).F().method_41753()).booleanValue());
        ((class08844)this.z_7).L(((Boolean)((class05630)this.i_7).A().method_41753()).booleanValue());
        ((class08844)this.z_7).u();
        this.V();
        ((class03386)this.i_5).N(((class01611)this.W_4).y());
        this.m_0 = new class03323(this, (UserApiService)this.E_7, (class04771)this.i_2);
        this.m_1 = (Boolean)this.l_5 != false ? class02051.N : class02051.N((UserApiService)((UserApiService)this.E_7), (class04771)((class04771)this.i_2), (Path)path);
        this.N_3 = new class05153(this);
        ((class05153)this.N_3).N(((class05630)this.i_7).NV().method_41753() != class01299.field_18176);
        this.N_4 = new class03040(this);
        ((class03040)this.N_4).N(((Double)((class05630)this.i_7).q().method_41753()).doubleValue());
        this.N_5 = class03409.N((class03415)class03415.N(), (UserApiService)((UserApiService)this.E_7));
        class04705.N((class08627)((class08627)this.z_3));
        class08627 class086272 = (class08627)this.z_3;
        this.N(class086272, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_1060]");
            class06305.N((class08627)((class08627)objectArray[0]));
            return null;
        });
        ((class03386)this.i_5).n().N((class08627)this.z_3);
        this.N((class05096)new class06307((class00392)class00392.L((String)"gui.loadingMinecraft")));
        object3 = ((class01623)this.s_0).B();
        ((class03465)this.R_3).N(class03424.field_33702, (List)object3);
        object2 = ((class01068)this.W_3).N(class07536.B().N("resourceLoad"), (Executor)((Object)this), (CompletableFuture)d_0, (List)object3);
        class03467.N.N(class02117.Q);
        object = new class06216(class051112, class094542.i);
        this.N((class01323)new class06305(this, (class06164)object2, arg_0 -> this.N((class06216)((Object)object), arg_0), false));
        this.m_3 = class03325.N((String)class094542.i.y());
        this.U_0 = new class02742((class05630)this.i_7, this);
        this.R_1 = new class06007((LongSupplier)class07536.u, () -> {
            this.yF();
            return (Integer)this.R_0;
        }, () -> ((class02742)((class02742)this.U_0)).L());
        this.E_0 = TracyClient.isAvailable() && class094542.u.R ? new class08712() : null;
        this.Z_4 = new class00458((Thread)this.G_2);
        this.i((CallbackInfo)null);
        this.y(class094542, null);
        this.l(null);
        this.N(class094542, null);
    }

    static {
        class06202.LM();
        j_1 = LogUtils.getLogger();
        j_3 = class01894.y((String)"default");
        j_4 = class01894.y((String)"uniform");
        t_0 = class01894.y((String)"alt");
        t_1 = class01894.y((String)"regional_compliancies.json");
        d_0 = CompletableFuture.completedFuture(class06244.field_17274);
        d_1 = class00392.L((String)"multiplayer.socialInteractions.not_available");
        d_2 = class00392.L((String)"menu.savingLevel");
        d_6 = LoggerFactory.getLogger((String)"fabric-screen-api-v1");
        FabricLoader.getInstance();
        d_7 = true;
    }

    private boolean B(boolean bl) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) && bl;
    }

    private void B(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9_3.CLIENT_COMMAND, (UserConnection)ProtocolTranslator.getPlayNetworkUserConnection());
            packetWrapper.write((Type)Types.VAR_INT, (Object)2);
            packetWrapper.scheduleSendToServer(Protocol1_11_1To1_12.class);
        }
    }

    public class00458 B() {
        this.yF();
        return (class00458)this.Z_4;
    }

    public static boolean C() {
        return !((class03386)((class06202)((Object)class06202.j_0)).i_5).R() && (Boolean)((class05630)((class06202)((Object)class06202.j_0)).i_7).s().method_41753() != false;
    }

    public class00183 D() {
        this.yF();
        return (class00183)this.u_3;
    }

    public @Nullable class07049 F() {
        this.yF();
        return (class07049)this.M_1;
    }

    public class01910 S() {
        this.yF();
        return new class01910(this, (class04777)this.l_6);
    }

    public static class04032 Z() {
        return class04032.N((String)"vanilla", class02798::N, (String)"Client", class06202.class);
    }

    private void Z(CallbackInfo callbackInfo) {
        ((ClientTickEvents.StartTick)ClientTickEvents.START_CLIENT_TICK.invoker()).onStartTick(this);
    }

    public void V() {
        this.yF();
        int n = ((class08844)this.z_7).N(((Integer)((class05630)this.i_7).Nq().method_41753()).intValue(), this.NR());
        ((class08844)this.z_7).N(n);
        if ((class05096)this.v_3 != null) {
            ((class05096)this.v_3).method_25410(((class08844)this.z_7).P(), ((class08844)this.z_7).s());
        }
        this.e().N(((class08844)this.z_7).U(), ((class08844)this.z_7).E());
        ((class03386)this.i_5).N(((class08844)this.z_7).U(), ((class08844)this.z_7).E());
        ((class06220)this.L_2).M();
        this.d(null);
    }

    public class08066 e() {
        this.yF();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.u(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class08066)callbackInfoReturnable.getReturnValue();
        }
        return (class08066)this.P_1;
    }

    private void i(CallbackInfo callbackInfo) {
        BaritoneAPI.getProvider().getPrimaryBaritone();
    }

    private int i(int n) {
        this.yF();
        class11399 class113992 = class11399.N((int)n);
        class11938.L().L((Object)class113992);
        if (!class113992.y()) {
            return class113992.L();
        }
        return ((class04453)this.T_4).method_31548().N();
    }

    private void i(boolean bl) {
        this.yF();
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.M(bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.Q(callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        if (!bl) {
            this.M_5 = 0;
        }
        if ((Integer)this.M_5 > 0 || this.u(((class04453)this.T_4).method_6115())) {
            return;
        }
        if (((class04453)this.T_4).method_5998(class07050.field_5808).L(class02484.c)) {
            return;
        }
        if (bl && (class07089)this.M_3 != null && ((class07089)this.M_3).N() == class07113.field_1332) {
            class07211 class072112;
            class06183 class061832 = (class06183)((class07089)this.M_3);
            class07209 class072092 = class061832.u();
            if (!((class03448)this.T_3).method_8320(class072092).P() && ((class03443)this.T_2).y(class072092, class072112 = class061832.i())) {
                ((class03448)this.T_3).N(class072092, class072112);
                ((class04453)this.T_4).method_6104(class07050.field_5808);
            }
            return;
        }
        ((class03443)this.T_2).L();
    }

    private void i(CallbackInfoReturnable callbackInfoReturnable) {
        this.yF();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            ((class04453)this.T_4).method_6104(class07050.field_5808);
        }
    }

    private class05096 i(class06202 class062022) {
        this.yF();
        if (BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing() && (class04453)this.T_4 != null) {
            return null;
        }
        return (class05096)class062022.v_3;
    }

    private void i(boolean bl, CallbackInfo callbackInfo) {
        class11925.N();
        class11938.L().L((Object)class10974.N());
        class11925.i();
    }

    private void i(class03448 class034482, CallbackInfo callbackInfo) {
        if (class034482 != null) {
            class06202 class062022 = this;
            ((ClientWorldEvents.AfterClientWorldChange)ClientWorldEvents.AFTER_CLIENT_WORLD_CHANGE.invoker()).afterWorldChange(class062022, class034482);
        }
    }

    public class06219 b() {
        this.yF();
        if (((class05630)this.i_7).v().method_41753() == class08027.field_7536) {
            return class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_1;
        }
        if (!((Boolean)this.W_2).booleanValue()) {
            return class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_2;
        }
        if (!this.Ly().flag(UserApiService.UserFlag.CHAT_ALLOWED)) {
            return class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_3;
        }
        return class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_0;
    }

    private void b(CallbackInfo callbackInfo) {
        this.yF();
        IBaritone iBaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)this.T_4);
        if (iBaritone != null) {
            iBaritone.getGameEventHandler().onPlayerUpdate(new PlayerUpdateEvent(EventState.POST));
        }
    }

    public class01611 x() {
        this.yF();
        return (class01611)this.W_4;
    }

    public boolean s() {
        class08844 class088442 = this.Nt();
        return class04655.N((class08844)class088442, (int)341) || class04655.N((class08844)class088442, (int)345);
    }

    private void s(CallbackInfo callbackInfo) {
        this.yF();
        int n = ((KeyMappingAccessor)((class05630)this.i_7).I).fabric_getTimesPressed();
        this.n_0 = ((class05630)this.i_7).I.R() || n != 0 ? Boolean.valueOf(((ClientPreAttackCallback)ClientPreAttackCallback.EVENT.invoker()).onClientPlayerPreAttack(this, (class04453)this.T_4, n)) : Boolean.valueOf(false);
    }

    public class02051 c() {
        this.yF();
        return (class02051)this.m_1;
    }

    private void n(CallbackInfo callbackInfo) {
        ((ClientLifecycleEvents.ClientStarted)ClientLifecycleEvents.CLIENT_STARTED.invoker()).onClientStarted(this);
    }

    public class03930 n() {
        this.yF();
        return (class03930)this.T_0;
    }

    public boolean h() {
        this.yF();
        return (class04453)this.T_4 != null && ((class04453)this.T_4).method_7302() || (Boolean)((class05630)this.i_7).Nz().method_41753() != false;
    }

    public String f() {
        this.yF();
        return (String)this.l_2;
    }

    public void l() {
        this.yF();
        ((class00232)this.W_5).Z();
        this.g();
    }

    private void l(CallbackInfo callbackInfo) {
        class11938.l();
    }

    public class01587 d() {
        this.yF();
        return (class01587)this.P_0;
    }

    private void d(CallbackInfo callbackInfo) {
        class06202 class062022 = class06202.Nq();
        class11938.L().L((Object)class10983.N((int)class062022.Nt().U(), (int)class062022.Nt().E()));
    }

    public class08290 a() {
        this.yF();
        return (class08290)this.u_6;
    }

    private void m(CallbackInfo callbackInfo) {
        this.yF();
        this.Z_7 = TickEvent.createNextProvider();
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            TickEvent.Type type = iBaritone.getPlayerContext().player() != null && iBaritone.getPlayerContext().world() != null ? TickEvent.Type.IN : TickEvent.Type.OUT;
            iBaritone.getGameEventHandler().onTick((TickEvent)((BiFunction)this.Z_7).apply(EventState.PRE, type));
        }
    }

    public class06086 m() {
        this.yF();
        return (class06086)this.u_7;
    }

    public static @Nullable String p() {
        return System.getProperty("minecraft.launcher.brand");
    }

    public Thread k() {
        this.yF();
        return (Thread)this.G_2;
    }

    private void k(CallbackInfo callbackInfo) {
        this.yF();
        ((ScreenEvents.Remove)ScreenEvents.remove((class05096)((class05096)this.v_3)).invoker()).onRemove((class05096)this.v_3);
    }

    private void t(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
            ItemPick1_21_3.doItemPick((class06202)this);
            callbackInfo.cancel();
        }
    }

    public class01623 t() {
        this.yF();
        return (class01623)this.s_0;
    }

    private void v(CallbackInfo callbackInfo) {
        this.yF();
        ((ScreenEvents.AfterTick)ScreenEvents.afterTick((class05096)((class05096)this.n_1)).invoker()).afterTick((class05096)this.n_1);
        this.n_1 = null;
    }

    public boolean v() {
        this.yF();
        return (Boolean)this.M_0 != false && (class08337)this.T_5 != null;
    }

    private void j(CallbackInfo callbackInfo) {
        this.yF();
        this.n_1 = (class05096)this.v_3;
        ((ScreenEvents.BeforeTick)ScreenEvents.beforeTick((class05096)((class05096)this.n_1)).invoker()).beforeTick((class05096)this.n_1);
    }

    public boolean j() {
        this.yF();
        ProfileResult profileResult = ((CompletableFuture)this.z_2).getNow(null);
        return profileResult != null && profileResult.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
    }

    public boolean q() {
        this.yF();
        return (Boolean)this.M_0;
    }

    public boolean U() {
        class08844 class088442 = this.Nt();
        return class04655.N((class08844)class088442, (int)342) || class04655.N((class08844)class088442, (int)346);
    }

    private void U(CallbackInfo callbackInfo) {
        ((ClientLifecycleEvents.ClientStopping)ClientLifecycleEvents.CLIENT_STOPPING.invoker()).onClientStopping(this);
    }

    public void close() {
        this.yF();
        if ((class04379)this.N_2 != null) {
            ((class04379)this.N_2).N();
        }
        try {
            ((class03323)this.m_0).close();
            ((class03520)this.E_6).close();
            ((class08117)this.u_2).close();
            ((class04866)this.E_3).close();
            ((class03386)this.i_5).close();
            ((class08212)this.z_4).close();
            ((class03063)this.B_2).close();
            ((class09033)this.E_1).i();
            ((class08265)this.u_5).close();
            ((class08627)this.z_3).close();
            ((class01068)this.W_3).close();
            if ((class08712)this.E_0 != null) {
                ((class08712)this.E_0).close();
            }
            class04284.y();
            class07536.U();
            RenderSystem.getSamplerCache().y();
            RenderSystem.getDevice().close();
        }
        catch (Throwable throwable) {
            ((Logger)j_1).error("Shutdown failure!", throwable);
            throw throwable;
        }
        finally {
            ((class04669)this.z_6).close();
            ((class08844)this.z_7).close();
        }
    }

    private void z(CallbackInfo callbackInfo) {
        this.yF();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && (Integer)this.M_5 > 0) {
            this.M_5 = (Integer)this.M_5 - 1;
        }
    }

    public Collection<class06748> z() {
        this.yF();
        return (List)this.Z_6;
    }

    private Runnable u(@Nullable class06216 class062162) {
        ArrayList<Function<Runnable, class05096>> arrayList = new ArrayList<Function<Runnable, class05096>>();
        boolean bl = this.N(arrayList);
        Runnable runnable = () -> {
            if (class062162 != null && class062162.y().N()) {
                class03330.N((class06202)this, (class01276)class062162.y().L(), (class05111)class062162.N());
            } else {
                this.N((class05096)new class04705(true, new class02088(bl)));
            }
        };
        Iterator iterator = Lists.reverse(arrayList).iterator();
        while (iterator.hasNext()) {
            class05096 class050962 = (class05096)((Function)iterator.next()).apply(runnable);
            runnable = () -> this.N(class050962);
        }
        this.N((CallbackInfoReturnable)null);
        return runnable;
    }

    private void u(boolean bl, CallbackInfo callbackInfo) {
        class11923.N();
    }

    private void u(class03448 class034482, CallbackInfo callbackInfo) {
        this.yF();
        if ((class03448)this.T_3 == null && class034482 == null) {
            return;
        }
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onWorldEvent(new WorldEvent(class034482, EventState.PRE));
    }

    private boolean u(boolean bl) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) && bl;
    }

    private void u(CallbackInfoReturnable callbackInfoReturnable) {
        this.yF();
        class10952 class109522 = class10952.N((class08066)((class08066)this.P_1));
        class11938.L().L((Object)class109522);
        callbackInfoReturnable.setReturnValue((Object)class109522.N());
    }

    public void u(class07080 class070802) {
        this.yF();
        this.G_4 = () -> this.N(class070802);
    }

    private void u(CallbackInfo callbackInfo) {
        this.yF();
        this.n_1 = (class05096)this.v_3;
        ((ScreenEvents.BeforeTick)ScreenEvents.beforeTick((class05096)((class05096)this.n_1)).invoker()).beforeTick((class05096)this.n_1);
    }

    public boolean r() {
        this.yF();
        return (Boolean)this.G_3;
    }

    public boolean y(class07049 class070492) {
        this.yF();
        return class070492.method_5851() || (class04453)this.T_4 != null && ((class04453)this.T_4).method_7325() && ((class05630)this.i_7).x.R() && class070492.method_5864() == class07078.Ly;
    }

    public boolean y() {
        this.yF();
        return (Boolean)this.U_3;
    }

    public boolean y(Consumer<class00392> consumer) {
        Consumer<Path> consumer2;
        this.yF();
        if (((class04526)this.R_2).i()) {
            this.yA();
            return false;
        }
        Consumer<class04681> consumer3 = class046812 -> {
            if (class046812 == class04645.N) {
                return;
            }
            int n = class046812.R();
            double d = (double)class046812.M() / (double)class01517.N;
            this.execute(() -> consumer.accept((class00392)class00392.N((String)"commands.debug.stopped", (Object[])new Object[]{String.format(Locale.ROOT, "%.2f", d), n, String.format(Locale.ROOT, "%.2f", (double)n / d)})));
        };
        Consumer<Path> consumer4 = path -> {
            class05216 class052162 = class00392.y((String)path.toString()).N(class06541.field_1073).N(class004052 -> class004052.N((class00647)new class00623(path.getParent())));
            this.execute(() -> class06202.N(consumer, (class00392)class052162));
        };
        class03463 class034632 = class06202.N(new class03463(), this, (class08396)this.s_1, (String)this.l_2, (class05630)this.i_7);
        Consumer<List> consumer5 = list -> {
            Path path = this.N(class034632, (List<Path>)list);
            consumer4.accept(path);
        };
        if ((class08337)this.T_5 == null) {
            consumer2 = path -> consumer5.accept((List)ImmutableList.of((Object)path));
        } else {
            ((class08337)this.T_5).y(class034632);
            CompletableFuture completableFuture = new CompletableFuture();
            CompletableFuture completableFuture2 = new CompletableFuture();
            CompletableFuture.allOf(completableFuture, completableFuture2).thenRunAsync(() -> consumer5.accept((List)ImmutableList.of((Object)((Path)completableFuture.join()), (Object)((Path)completableFuture2.join()))), (Executor)class07536.Z());
            ((class08337)this.T_5).N((T class046812) -> {}, completableFuture2::complete);
            consumer2 = completableFuture::complete;
        }
        this.R_2 = class04541.N((class04555)new class04578((LongSupplier)class07536.u, (class03063)this.B_2), (LongSupplier)class07536.u, (Executor)class07536.Z(), (class04524)new class04524("client"), class046812 -> {
            this.yF();
            this.R_2 = class04538.N;
            consumer3.accept((class04681)class046812);
        }, consumer2);
        return true;
    }

    private void y(boolean bl, @Nullable class06014 class060142) {
        this.yF();
        if (class060142 != null) {
            class060142.y();
        }
        class02427 class024272 = this.ND().E();
        if (bl) {
            class024272.N(((class06007)this.R_1).i());
        } else {
            class024272.N(null);
        }
    }

    private void y(CallbackInfo callbackInfo) {
        SodiumExtraClientMod.onTick((class06202)this);
    }

    public void y(class05096 class050962) {
        try (class08694 class086942 = class08700.N().i("forcedTick");){
            this.N(class050962);
            this.M(false);
        }
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        this.yF();
        ResourcePackScanner.checkIfCoreShaderLoaded((class01089)((class01068)this.W_3));
    }

    private boolean y(class04453 class044532, class07050 class070502) {
        return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_15);
    }

    private void y(class05096 class050962, boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        this.yF();
        if ((class03448)this.T_3 != null) {
            ((Runnable)de.maxhenkel.voicechat.events.ClientWorldEvents.DISCONNECT.invoker()).run();
        }
    }

    public boolean y(UUID uUID) {
        return uUID.equals(this.Ny().y());
    }

    public Runnable y(Runnable runnable) {
        return runnable;
    }

    private class07064 y(class07041 class070412) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            return class07064.field_52426;
        }
        return class070412.i();
    }

    private void y(boolean bl, CallbackInfo callbackInfo) {
        this.yF();
        RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.e().i(), 1.0);
        class11925.N();
        try (class12027 class120272 = class12027.y();){
            class11938.L().L((Object)class10989.N((class01054)new class01054(class06202.Nq(), ((class03386)this.i_5).B, 0, 0), (class02233)this.NK()));
        }
        GlStateManager._glBindFramebuffer((int)36160, (int)0);
        class11925.i();
    }

    private void y(@Nullable class05096 class050962, CallbackInfo callbackInfo) {
        this.yF();
        ((ScreenEvents.Remove)ScreenEvents.remove((class05096)((class05096)this.v_3)).invoker()).onRemove((class05096)this.v_3);
    }

    public void y(class07080 class070802) {
        this.yF();
        class04583.y();
        class07080 class070803 = this.N(class070802);
        this.yp();
        class06202.N(this, (File)this.l_1, class070803);
    }

    private void y(@Nullable class06216 class062162) {
        this.yF();
        if (!((Boolean)this.Z_1).booleanValue()) {
            this.Z_1 = true;
            this.L(class062162);
        }
    }

    private void y(class03448 class034482, CallbackInfo callbackInfo) {
        if (Iris.getCurrentDimension() != Iris.lastDimension) {
            Iris.logger.info("Reloading pipeline on dimension change: " + String.valueOf(Iris.lastDimension) + " => " + String.valueOf(Iris.getCurrentDimension()));
            Iris.getPipelineManager().destroyPipeline();
            if (class034482 != null) {
                Iris.getPipelineManager().preparePipeline(Iris.getCurrentDimension());
            }
        }
    }

    private void y(@Nullable class03448 class034482) {
        this.y(class034482, null);
        this.N(class034482, true);
        this.i(class034482, null);
    }

    private void y(class09454 class094542, CallbackInfo callbackInfo) {
        if (!IrisPlatformHelpers.getInstance().isModLoaded("fabric-resource-loader-v0")) {
            try {
                class06202.Nq().NO().N(class01894.N((String)"iris", (String)"textures/gui/widgets.png"), (class08918)new NativeImageBackedCustomTexture(new CustomTextureData.PngData(new TextureFilteringData(false, false), IOUtils.toByteArray((InputStream)Iris.class.getResourceAsStream("/assets/iris/textures/gui/widgets.png")))));
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
    }

    public void y(boolean bl) {
        this.N((class05096)new class05125(true), false, bl);
    }

    public /* synthetic */ void y(CompletableFuture completableFuture) {
        this.yF();
        this.u_0 = completableFuture;
    }

    public boolean E() {
        this.yF();
        return (Boolean)this.W_0;
    }

    private void E(CallbackInfo callbackInfo) {
        this.yF();
        ((ScreenEvents.AfterTick)ScreenEvents.afterTick((class05096)((class05096)this.n_1)).invoker()).afterTick((class05096)this.n_1);
        this.n_1 = null;
    }

    public class09000 A() {
        this.yF();
        return (class09000)this.E_2;
    }

    public /* synthetic */ void N(UserApiService userApiService) {
        this.yF();
        this.E_7 = userApiService;
    }

    public void N(Throwable throwable, @Nullable class00392 class003922, @Nullable class06216 class062162) {
        this.yF();
        ((Logger)j_1).info("Caught error loading resourcepacks, removing all selected resourcepacks", throwable);
        ((class03465)this.R_3).N(throwable);
        ((class00232)this.W_5).y();
        ((class01623)this.s_0).y(Collections.emptyList());
        ((class05630)this.i_7).Z.clear();
        ((class05630)this.i_7).z.clear();
        ((class05630)this.i_7).Np();
        this.N(true, class062162).thenRunAsync(() -> this.L(class003922), (Executor)((Object)this));
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        this.yF();
        ResourcePackScanner.checkIfCoreShaderLoaded((class01089)((class01068)this.W_3));
        ConfigManager.registerConfigsLate();
    }

    public void N(class05096 class050962, boolean bl) {
        this.N(class050962, bl, true);
    }

    private static /* synthetic */ void N(Consumer consumer, class00392 class003922) {
        consumer.accept(class00392.N((String)"debug.profiling.stop", (Object[])new Object[]{class003922}));
    }

    public /* synthetic */ void N(class03409 class034092) {
        this.yF();
        this.N_5 = class034092;
    }

    private void N(@Nullable class03448 class034482, boolean bl) {
        this.yF();
        if (bl) {
            ((class09033)this.E_1).u();
        }
        this.N((class07049)null);
        this.T_6 = null;
        ((class03063)this.B_2).N(class034482);
        ((class04410)this.i_0).N(class034482);
        ((class03386)this.i_5).N(class034482);
        this.yZ();
    }

    public /* synthetic */ void N(CompletableFuture completableFuture) {
        this.yF();
        this.z_2 = completableFuture;
    }

    private CompletableFuture<Void> N(boolean bl, @Nullable class06216 class062162) {
        this.yF();
        if ((CompletableFuture)this.U_4 != null) {
            return (CompletableFuture)this.U_4;
        }
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if (!bl && (class01323)this.G_0 instanceof class06305) {
            this.U_4 = completableFuture;
            return completableFuture;
        }
        ((class01623)this.s_0).N();
        List list = ((class01623)this.s_0).B();
        if (!bl) {
            ((class03465)this.R_3).N(class03424.field_33703, list);
        }
        this.N((class01323)new class06305(this, ((class01068)this.W_3).N(class07536.B().N("resourceLoad"), (Executor)((Object)this), (CompletableFuture)d_0, list), optional -> class07536.N((Optional)optional, (T throwable) -> {
            this.yF();
            if (bl) {
                ((class00232)this.W_5).L();
                this.yY();
            } else {
                this.N((Throwable)throwable, class062162);
            }
        }, () -> {
            this.yF();
            ((class03063)this.B_2).u();
            ((class03465)this.R_3).N();
            ((class00232)this.W_5).u();
            completableFuture.complete(null);
            this.y(class062162);
        }), !bl));
        return completableFuture;
    }

    private UserApiService N(YggdrasilAuthenticationService yggdrasilAuthenticationService, class09454 class094542) {
        if (class094542.u.B) {
            return UserApiService.OFFLINE;
        }
        return yggdrasilAuthenticationService.createUserApiService(class094542.N.N.u());
    }

    private void N(CallbackInfo callbackInfo, class07050 class070502, class06145 class061452, class07049 class070492) {
        this.yF();
        class07082 class070822 = ((UseEntityCallback)UseEntityCallback.EVENT.invoker()).interact((class08036)((class04453)this.T_4), ((class04453)this.T_4).method_73183(), class070502, class070492, class061452);
        if (class070822 != class07082.i) {
            class07041 class070412;
            if (class070822.N()) {
                class070412 = class061452.y().N(class070492.method_23317(), class070492.method_23318(), class070492.method_23321());
                this.NE().N((class00381)class00556.N((class07049)class070492, (boolean)((class04453)this.T_4).method_5715(), (class07050)class070502, (class06889)class070412));
            }
            if (class070822 instanceof class07041 && (class070412 = (class07041)class070822).i() == class07064.field_52427) {
                ((class04453)this.T_4).method_6104(class070502);
            }
            callbackInfo.cancel();
        }
    }

    public void N(@Nullable class05096 class050962) {
        this.yF();
        this.L(class050962, null);
        if (class07529.ND && Thread.currentThread() != (Thread)this.G_2) {
            ((Logger)j_1).error("setScreen called from non-game thread");
        }
        if ((class05096)this.v_3 != null) {
            ((class05096)this.v_3).method_25432();
            this.y(class050962, null);
        } else {
            this.N(class02111.field_41777);
        }
        if (class050962 == null) {
            if (((Boolean)this.G_1).booleanValue()) {
                throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
            }
            if ((class03448)this.T_3 == null) {
                class050962 = new class04705();
            } else if (((class04453)this.T_4).method_29504()) {
                if (((class04453)this.T_4).Q()) {
                    class050962 = new class05345(null, ((class03448)this.T_3).method_8401().U(), (class04453)this.T_4);
                } else {
                    ((class04453)this.T_4).K();
                }
            } else {
                class050962 = ((class01056)this.i_6).i().z();
            }
        }
        this.v_3 = class050962;
        if ((class05096)this.v_3 != null) {
            ((class05096)this.v_3).method_49589();
        }
        if (class050962 != null) {
            ((class06220)this.L_2).z();
            class06428.y();
            class050962.method_25423(((class08844)this.z_7).P(), ((class08844)this.z_7).s());
            this.v_2 = false;
        } else {
            if ((class03448)this.T_3 != null) {
                class06428.L();
            }
            ((class09033)this.E_1).M();
            ((class06220)this.L_2).Z();
        }
        this.yZ();
    }

    public static void N(@Nullable class06202 class062022, File file, class07080 class070802) {
        int n = class06202.N(file, class070802);
        if (class062022 != null) {
            ((class09033)class062022.E_1).R();
        }
        System.exit(n);
    }

    public void N(class03448 class034482) {
        this.yF();
        this.u(class034482, null);
        this.R(class034482, null);
        this.N(class034482, null);
        this.T_3 = class034482;
        this.y(class034482);
        this.L(class034482, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class00392 N(File file) {
        this.yF();
        int n = 4;
        int n2 = 4096;
        int n3 = 4096;
        int n4 = ((class08844)this.z_7).U();
        int n5 = ((class08844)this.z_7).E();
        class08066 class080662 = this.e();
        float f = ((class04453)this.T_4).method_36455();
        float f2 = ((class04453)this.T_4).method_36454();
        float f3 = ((class04453)this.T_4).field_6004;
        float f4 = ((class04453)this.T_4).field_5982;
        ((class03386)this.i_5).N(false);
        try {
            ((class03386)this.i_5).N(new class07604((Vector3fc)new Vector3f(((class03386)this.i_5).s().m())));
            ((class08844)this.z_7).y(4096);
            ((class08844)this.z_7).L(4096);
            class080662.N(4096, 4096);
            for (int i = 0; i < 6; ++i) {
                switch (i) {
                    case 0: {
                        ((class04453)this.T_4).method_36456(f2);
                        ((class04453)this.T_4).method_36457(0.0f);
                        break;
                    }
                    case 1: {
                        ((class04453)this.T_4).method_36456((f2 + 90.0f) % 360.0f);
                        ((class04453)this.T_4).method_36457(0.0f);
                        break;
                    }
                    case 2: {
                        ((class04453)this.T_4).method_36456((f2 + 180.0f) % 360.0f);
                        ((class04453)this.T_4).method_36457(0.0f);
                        break;
                    }
                    case 3: {
                        ((class04453)this.T_4).method_36456((f2 - 90.0f) % 360.0f);
                        ((class04453)this.T_4).method_36457(0.0f);
                        break;
                    }
                    case 4: {
                        ((class04453)this.T_4).method_36456(f2);
                        ((class04453)this.T_4).method_36457(-90.0f);
                        break;
                    }
                    default: {
                        ((class04453)this.T_4).method_36456(f2);
                        ((class04453)this.T_4).method_36457(90.0f);
                    }
                }
                ((class04453)this.T_4).field_5982 = ((class04453)this.T_4).method_36454();
                ((class04453)this.T_4).field_6004 = ((class04453)this.T_4).method_36455();
                ((class03386)this.i_5).N(class02233.y);
                ((class03386)this.i_5).y(class02233.y);
                try {
                    Thread.sleep(10L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                class05628.N((File)file, (String)("panorama_" + i + ".png"), (class08066)class080662, (int)4, (T class003922) -> {});
            }
            class05216 class052162 = class00392.y((String)file.getName()).N(class06541.field_1073).N(class004052 -> class004052.N((class00647)new class00623(file.getAbsoluteFile())));
            class05216 class052163 = class00392.N((String)"screenshot.success", (Object[])new Object[]{class052162});
            return class052163;
        }
        catch (Exception exception) {
            ((Logger)j_1).error("Couldn't save image", (Throwable)exception);
            class05216 class052164 = class00392.N((String)"screenshot.failure", (Object[])new Object[]{exception.getMessage()});
            return class052164;
        }
        finally {
            ((class04453)this.T_4).method_36457(f);
            ((class04453)this.T_4).method_36456(f2);
            ((class04453)this.T_4).field_6004 = f3;
            ((class04453)this.T_4).field_5982 = f4;
            ((class03386)this.i_5).N(true);
            ((class08844)this.z_7).y(n4);
            ((class08844)this.z_7).L(n5);
            class080662.N(n4, n5);
            ((class03386)this.i_5).N(null);
        }
    }

    private void N(class08627 class086272, Operation operation) {
        SodiumConfigBuilder.registerIcon((class08627)class086272);
        operation.call(new Object[]{class086272});
    }

    public void N(class00392 class003922) {
        this.yF();
        boolean bl = this.q();
        class04568 class045682 = this.yN();
        if ((class03448)this.T_3 != null) {
            ((class03448)this.T_3).N(class003922);
        }
        if (bl) {
            this.Nj();
        } else {
            this.Nf();
        }
        class04705 class047052 = new class04705();
        if (bl) {
            this.N((class05096)class047052);
        } else if (class045682 != null && class045682.i()) {
            this.N((class05096)new class05685((class05096)class047052));
        } else {
            this.N((class05096)new class05304((class05096)class047052));
        }
    }

    public /* synthetic */ void N(class02051 class020512) {
        this.yF();
        this.m_1 = class020512;
    }

    public void N(class03415 class034152) {
        this.yF();
        if (!((class03409)this.N_5).N(class034152)) {
            this.N_5 = class03409.N((class03415)class034152, (UserApiService)((UserApiService)this.E_7));
        }
    }

    public void N(@Nullable class07049 class070492) {
        this.yF();
        this.M_1 = class070492;
        ((class03386)this.i_5).N(class070492);
    }

    public class03040 N() {
        this.yF();
        return (class03040)this.N_4;
    }

    private void N(CallbackInfo callbackInfo, class07050 class070502) {
        class10980 class109802 = class10980.N((class07050)class070502);
        class11938.L().L((Object)class109802);
        if (class109802.y()) {
            callbackInfo.cancel();
        }
    }

    public void N(boolean bl) {
        this.yF();
        if ((class05096)this.v_3 != null) {
            return;
        }
        if (this.v() && !((class08337)this.T_5).P()) {
            this.N((class05096)new class05123(!bl));
        } else {
            this.N((class05096)new class05123(true));
        }
    }

    public /* synthetic */ void N(class05463 class054632) {
        this.yF();
        this.b_1 = class054632;
    }

    private boolean N(class04453 class044532, class07050 class070502) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_8);
    }

    public /* synthetic */ void N(class03323 class033232) {
        this.yF();
        this.m_0 = class033232;
    }

    private int N(class06202 class062022) {
        this.yF();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return 0;
        }
        return (Integer)this.M_5;
    }

    private boolean N(List<Function<Runnable, class05096>> list) {
        ProfileResult profileResult;
        BanDetails banDetails;
        this.yF();
        boolean bl = false;
        if (((class05630)this.i_7).NY || class07529.Nz) {
            list.add(runnable -> {
                this.yF();
                return new class03263((class05630)this.i_7, runnable);
            });
            bl = true;
        }
        if ((banDetails = this.Nv()) != null) {
            list.add(runnable -> class03051.N(bl -> {
                if (bl) {
                    class07536.m().N(class03597.m);
                }
                runnable.run();
            }, (BanDetails)banDetails));
        }
        if ((profileResult = (ProfileResult)((CompletableFuture)this.z_2).join()) != null) {
            GameProfile gameProfile = profileResult.profile();
            Set set = profileResult.actions();
            if (set.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
                list.add(runnable -> class03051.N((String)gameProfile.name(), (Runnable)runnable));
            }
            if (set.contains(ProfileActionType.USING_BANNED_SKIN)) {
                list.add(class03051::N);
            }
        }
        return bl;
    }

    private boolean N(class03443 class034432, Operation operation) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) && (Boolean)operation.call(new Object[]{class034432}) != false;
    }

    public void N(class05096 class050962, CallbackInfo callbackInfo) {
        Iris.lastDimension = Iris.getCurrentDimension();
    }

    private void N(class04785 class047852, class01623 class016232, class03531 class035312, boolean bl, CallbackInfo callbackInfo, class00642 class006423) {
        ProtocolTranslator.setTargetVersion((ProtocolVersion)ProtocolTranslator.NATIVE_VERSION, (boolean)true);
        if (class006423.method_10758()) {
            ProtocolTranslator.injectPreviousVersionReset((Channel)class006423.field_11651);
        } else {
            class006423.field_45668.add(class006422 -> ProtocolTranslator.injectPreviousVersionReset((Channel)class006422.field_11651));
        }
    }

    private static boolean N(Object object) {
        try {
            return Locale.getDefault().getISO3Country().equals(object);
        }
        catch (MissingResourceException missingResourceException) {
            return false;
        }
    }

    private void N(boolean bl, CallbackInfo callbackInfo) {
        this.yF();
        class04643 class046432 = class08700.N();
        class046432.N("wait_for_gpu");
        while (((LongArrayFIFOQueue)this.n_2).size() > SodiumClientMod.options().advanced.cpuRenderAheadLimit) {
            long l = ((LongArrayFIFOQueue)this.n_2).dequeueLong();
            GL32C.glClientWaitSync((long)l, (int)1, (long)Long.MAX_VALUE);
            GL32C.glDeleteSync((long)l);
        }
        class046432.L();
    }

    private void N(Throwable throwable, @Nullable class06216 class062162) {
        this.yF();
        if (((class01623)this.s_0).i().size() > 1) {
            this.N(throwable, null, class062162);
        } else {
            class07536.N((Throwable)throwable);
        }
    }

    public class07080 N(class07080 class070802) {
        this.yF();
        class03463 class034632 = class070802.R();
        try {
            class06202.N(class034632, this, (class08396)this.s_1, (String)this.l_2, (class05630)this.i_7);
            this.N(class070802.N("Uptime"));
            if ((class03448)this.T_3 != null) {
                ((class03448)this.T_3).method_8538(class070802);
            }
            if ((class08337)this.T_5 != null) {
                ((class08337)this.T_5).y(class034632);
            }
            ((class03465)this.R_3).N(class070802);
        }
        catch (Throwable throwable) {
            ((Logger)j_1).error("Failed to collect details", throwable);
        }
        return class070802;
    }

    private /* synthetic */ void N(class06216 class062162, Optional optional) {
        class07536.N((Optional)optional, (T throwable) -> this.N((Throwable)throwable, class062162), () -> {
            this.yF();
            if (class07529.ND) {
                this.yh();
            }
            ((class03465)this.R_3).N();
            this.y(class062162);
        });
    }

    public void N(int n) {
        this.yF();
        ((class08117)this.u_2).N(n);
    }

    private void N(int n, long l) {
        this.yF();
        ((class05630)this.i_7).NN().method_41748((Object)false);
        ((class05630)this.i_7).Np();
    }

    private class07064 N(class07041 class070412) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            return class07064.field_52426;
        }
        return class070412.i();
    }

    public void N(@Nullable class01323 class013232) {
        this.yF();
        this.G_0 = class013232;
    }

    private boolean N(class08844 class088442) {
        this.yF();
        if (!((Boolean)this.n_3).booleanValue()) {
            return class088442.n();
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.callocInt(1);
            IntBuffer intBuffer2 = memoryStack.callocInt(1);
            GLFW.glfwGetFramebufferSize((long)class088442.B(), (IntBuffer)intBuffer, (IntBuffer)intBuffer2);
            boolean bl = intBuffer.get(0) == 0 || intBuffer2.get(0) == 0;
            return bl;
        }
    }

    private static String N(double d) {
        return String.format(Locale.ROOT, "%.3fs", d);
    }

    public static int N(File file, class07080 class070802) {
        Path path = file.toPath().resolve("crash-reports").resolve("crash-" + class07536.R() + "-client.txt");
        class03914.N((String)class070802.N(class02587.N));
        if (class070802.i() != null) {
            class03914.N((String)("#@!@# Game crashed! Crash report saved to: #@!@# " + String.valueOf(class070802.i().toAbsolutePath())));
            return -1;
        }
        if (class070802.N(path, class02587.N)) {
            class03914.N((String)("#@!@# Game crashed! Crash report saved to: #@!@# " + String.valueOf(path.toAbsolutePath())));
            return -1;
        }
        class03914.N((String)"#@?@# Game crashed! Crash report could not be saved. #@?@#");
        return -2;
    }

    public static void N(@Nullable class06202 class062022, @Nullable class08396 class083962, String string, @Nullable class05630 class056302, class07080 class070802) {
        class06202.N(class070802.R(), class062022, class083962, string, class056302);
    }

    public void N(class06468 class064682) {
        this.yF();
        class06219 class062192 = this.b();
        if (!class062192.N(this.q())) {
            if (((class01056)this.i_6).L()) {
                ((class01056)this.i_6).y(false);
                this.N((class05096)new class01321(bl -> {
                    if (bl) {
                        class07536.m().N(class03597.M);
                    }
                    this.N((class05096)null);
                }, (class00392)class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_4, class03597.M, true));
            } else {
                class00392 class003922 = class062192.N();
                ((class01056)this.i_6).N(class003922, false);
                ((class05153)this.N_3).u(class003922);
                ((class01056)this.i_6).y(class062192 == class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_3);
            }
        } else {
            ((class01056)this.i_6).i().y(class064682, class01311::new);
        }
    }

    public void N(class04785 class047852, class01623 class016232, class03531 class035312, boolean bl) {
        class08773 class087732;
        this.yF();
        this.Nf();
        Instant instant = Instant.now();
        class05384 class053842 = new class05384(bl ? 500L : 0L);
        class05850 class058502 = new class05850(class053842, class05858.field_51489);
        this.N((class05096)class058502);
        int n = Math.max(5, 3) + class03469.N + 1;
        try {
            class047852.N((class01042)class035312.L().N(), class035312.u());
            class087732 = class08773.N((class08773)class053842, (class08773)class08759.y());
            this.T_5 = (class08337)class02796.N((T thread) -> {
                this.yF();
                return new class08337(thread, this, class047852, class016232, class035312, (class03930)this.T_0, class087732);
            });
            class053842.N(((class08337)this.T_5).z(n));
            this.M_0 = true;
            this.N(class03415.N());
            ((class03325)this.m_3).N(class03371.field_44568, class047852.R(), class035312.u().u());
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Starting integrated server");
            class07074 class070742 = class070802.N("Starting integrated server");
            class070742.N("Level ID", (Object)class047852.R());
            class070742.N("Level Name", () -> class035312.u().u());
            throw new class07878(class070802);
        }
        class087732 = class08700.N();
        class087732.N("waitForServer");
        long l = TimeUnit.SECONDS.toNanos(1L) / 60L;
        while (!((class08337)this.T_5).Np() || (class01323)this.G_0 != null) {
            long l2 = class07536.u() + l;
            this.j(null);
            class058502.method_25393();
            if ((class01323)this.G_0 != null) {
                ((class01323)this.G_0).y();
            }
            this.E(null);
            this.M(false);
            this.g();
            this.y(() -> class07536.u() > l2);
            this.yH();
        }
        class087732.L();
        Duration duration = Duration.between(instant, Instant.now());
        SocketAddress socketAddress = ((class08337)this.T_5).Na().N();
        class00642 class006422 = class00642.method_10769((SocketAddress)socketAddress);
        String string = socketAddress.toString();
        class03464 class034642 = new class03464(class006422, this, null, null, bl, duration, class003922 -> {}, class053842, null);
        this.N(class047852, class016232, class035312, bl, null, class006422);
        class006422.method_52902(string, 0, (class07844)class034642);
        class006422.method_10743((class00381)new class07816(this.Ny().L(), this.Ny().y()));
        this.T_6 = class006422;
    }

    private void N(class07074 class070742) {
        class070742.N("JVM uptime", () -> class06202.N((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
        class070742.N("Wall uptime", () -> {
            this.yF();
            return class06202.N((double)(System.currentTimeMillis() - (Long)this.Z_2) / 1000.0);
        });
        class070742.N("High-res time", () -> class06202.N((double)class07536.L() / 1000.0));
        class070742.N("Client ticks", () -> {
            this.yF();
            return String.format(Locale.ROOT, "%d ticks / %.3fs", (long)((Long)this.Z_3), (double)((Long)this.Z_3).longValue() / 20.0);
        });
    }

    public void N(Exception exception) {
        this.yF();
        if (!((class01623)this.s_0).y()) {
            if (((class01623)this.s_0).i().size() <= 1) {
                ((Logger)j_1).error(LogUtils.FATAL_MARKER, exception.getMessage(), (Throwable)exception);
                this.y(new class07080(exception.getMessage(), (Throwable)exception));
            } else {
                this.N(this::yY);
            }
            return;
        }
        this.N(exception, (class00392)class00392.L((String)"resourcePack.runtime_failure"), null);
    }

    private float N(float f) {
        class03106 class031062;
        this.yF();
        if ((class03448)this.T_3 != null && (class031062 = ((class03448)this.T_3).method_54719()).Z()) {
            return Math.max(f, class031062.M());
        }
        return f;
    }

    private void N(class03448 class034482, CallbackInfo callbackInfo) {
        class09343 class093432 = class09343.N();
        class11938.L().L((Object)class093432);
    }

    public void N(class05096 class050962, boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        try {
            class06202.yq();
        }
        catch (RemapException remapException) {
            ((Logger)j_1).warn("Failed to unmap Fabric registries!", (Throwable)remapException);
        }
    }

    public void N(class02111 class021112) {
        this.yF();
        this.l_0 = class021112;
    }

    private void N(class09454 class094542, CallbackInfo callbackInfo) {
        ((LoadingCycleCallback)Events.LOADING_CYCLE.invoker()).onLoadCycle(LoadingCycleCallback.LoadingCycle.POST_GAME_LOAD);
    }

    private class04643 N(boolean bl, @Nullable class06014 class060142) {
        class04687 class046872;
        this.yF();
        if (!bl) {
            ((class06007)this.R_1).y();
            if (!((class04526)this.R_2).i() && class060142 == null) {
                return class04687.N;
            }
        }
        if (bl) {
            if (!((class06007)this.R_1).N()) {
                this.R_0 = 0;
                ((class06007)this.R_1).L();
            }
            this.R_0 = (Integer)this.R_0 + 1;
            class046872 = ((class06007)this.R_1).u();
        } else {
            class046872 = class04687.N;
        }
        if (((class04526)this.R_2).i()) {
            class046872 = class04643.N((class04643)class046872, (class04643)((class04526)this.R_2).R());
        }
        return class06014.N((class04643)class046872, (class06014)class060142);
    }

    public /* synthetic */ void N(class03930 class039302) {
        this.yF();
        this.T_0 = class039302;
    }

    private static class03463 N(class03463 class034632, @Nullable class06202 class062022, @Nullable class08396 class083962, String string, @Nullable class05630 class056302) {
        class034632.N("Launched Version", () -> string);
        String string2 = class06202.p();
        if (string2 != null) {
            class034632.N("Launcher name", string2);
        }
        class034632.N("Backend library", RenderSystem::getBackendDescription);
        class034632.N("Backend API", RenderSystem::getApiDescription);
        class034632.N("Window size", () -> class062022 != null ? ((class08844)class062022.z_7).U() + "x" + ((class08844)class062022.z_7).E() : "<not initialized>");
        class034632.N("GFLW Platform", class08844::N);
        class034632.N("Render Extensions", () -> String.join((CharSequence)", ", RenderSystem.getDevice().getEnabledExtensions()));
        class034632.N("GL debug messages", () -> {
            GpuDevice gpuDevice = RenderSystem.tryGetDevice();
            if (gpuDevice == null) {
                return "<no renderer available>";
            }
            if (gpuDevice.isDebuggingEnabled()) {
                return String.join((CharSequence)"\n", gpuDevice.getLastDebugMessages());
            }
            return "<debugging unavailable>";
        });
        class034632.N("Is Modded", () -> class06202.Z().y());
        class034632.N("Universe", () -> class062022 != null ? Long.toHexString((Long)class062022.z_0) : "404");
        class034632.N("Type", "Client (map_client.txt)");
        if (class056302 != null) {
            String string3;
            if (class062022 != null && (string3 = class062022.Ns().z()) != null) {
                class034632.N("GPU Warnings", string3);
            }
            class034632.N("Transparency", (Boolean)class056302.s().method_41753() != false ? "shader" : "regular");
            class034632.N("Render Distance", class056302.Nh() + "/" + String.valueOf(class056302.i().method_41753()) + " chunks");
        }
        if (class062022 != null) {
            class034632.N("Resource Packs", () -> class01623.N((Collection)class062022.t().M()));
        }
        if (class083962 != null) {
            class034632.N("Current Language", () -> class083962.N());
        }
        class034632.N("Locale", String.valueOf(Locale.getDefault()));
        class034632.N("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
        class034632.N("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
        class034632.N("CPU", GLX::_getCpuInfo);
        return class034632;
    }

    public void N(CallbackInfo callbackInfo) {
        if (HUDOverlayHandler.INSTANCE != null) {
            HUDOverlayHandler.INSTANCE.onClientTick();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class05096 class050962, boolean bl, boolean bl2) {
        this.yF();
        this.y(class050962, bl, bl2, null);
        class01683 class016832 = this.NE();
        if (class016832 != null) {
            this.O();
            class016832.u();
            if (!bl) {
                this.l();
            }
        }
        ((class05463)this.b_1).y();
        if (((class04526)this.R_2).i()) {
            this.yx();
        }
        class08337 class083372 = (class08337)this.T_5;
        this.T_5 = null;
        ((class03386)this.i_5).W();
        this.T_2 = null;
        ((class05153)this.N_3).y();
        this.G_1 = true;
        try {
            if ((class03448)this.T_3 != null) {
                ((class01056)this.i_6).z();
            }
            if (class083372 != null) {
                this.N((class05096)new class06307((class00392)d_2));
                class04643 class046432 = class08700.N();
                class046432.N("waitForServer");
                while (!class083372.Nk()) {
                    this.M(false);
                }
                class046432.L();
            }
            this.y(class050962);
            this.M_0 = false;
            this.T_3 = null;
            this.N((class03448)null, bl2);
            this.T_4 = null;
        }
        finally {
            this.G_1 = false;
        }
        this.N(class050962, bl, bl2, null);
    }

    public boolean N(UUID uUID) {
        this.yF();
        if (!this.b().N(false)) {
            return ((class04453)this.T_4 == null || !uUID.equals(((class04453)this.T_4).method_5667())) && !uUID.equals(class07536.R);
        }
        return ((class05463)this.b_1).L(uUID);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Path N(class03463 class034632, List<Path> list) {
        Path path;
        Object object;
        this.yF();
        String string = this.q() ? this.Na().yn().u() : ((object = this.yN()) != null ? ((class04568)object).N : "unknown");
        try {
            object = String.format(Locale.ROOT, "%s-%s-%s", class07536.R(), string, class07529.y().comp_4024());
            String object2 = class06290.N((Path)class04524.N, (String)object, (String)".zip");
            path = class04524.N.resolve(object2);
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
        try {
            object = new class03423(path);
            try {
                object.N(Paths.get("system.txt", new String[0]), class034632.N());
                object.N(Paths.get("client", new String[0]).resolve(((class05630)this.i_7).Nx().getName()), ((class05630)this.i_7).ND());
                list.forEach(arg_0 -> ((class03423)object).N(arg_0));
            }
            finally {
                object.close();
            }
        }
        catch (Throwable throwable) {
            for (Path path2 : list) {
                try {
                    FileUtils.forceDelete((File)path2.toFile());
                }
                catch (IOException iOException) {
                    ((Logger)j_1).warn("Failed to delete temporary profiling result {}", (Object)path2, (Object)iOException);
                }
            }
            throw throwable;
        }
        for (Path path3 : list) {
            try {
                FileUtils.forceDelete((File)path3.toFile());
            }
            catch (IOException iOException) {
                ((Logger)j_1).warn("Failed to delete temporary profiling result {}", (Object)path3, (Object)iOException);
            }
        }
        return path;
    }

    private void LL() {
        this.yF();
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.t(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if ((class07089)this.M_3 == null || ((class07089)this.M_3).N() == class07113.field_1333) {
            return;
        }
        boolean bl = this.s();
        class07089 class070892 = (class07089)this.M_3;
        Objects.requireNonNull(class070892);
        class07089 class070893 = class070892;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class06183.class, class06145.class}, (Object)class070893, (int)n)) {
            case 0: {
                class06183 class061832 = (class06183)class070893;
                ((class03443)this.T_2).N(class061832.u(), bl);
                break;
            }
            case 1: {
                class06145 class061452 = (class06145)class070893;
                ((class03443)this.T_2).N(class061452.L(), bl);
                break;
            }
        }
    }

    public boolean yi() {
        return this.Ly().flag(UserApiService.UserFlag.PROFANITY_FILTER_ENABLED);
    }

    private void yh() {
        boolean bl = false;
        class03770 class037702 = this.yU().N();
        class08887 class088872 = class037702.N().N();
        for (Object object : class04206.i) {
            for (class00500 class005002 : object.E().N()) {
                class08887 class088873;
                if (class005002.b() != class06898.field_11458 || (class088873 = class037702.y(class005002)) != class088872) continue;
                ((Logger)j_1).debug("Missing model for: {}", (Object)class005002);
                bl = true;
            }
        }
        Iterator iterator = class088872.method_68511();
        for (UnmodifiableIterator unmodifiableIterator : class04206.i) {
            for (class08887 class088873 : unmodifiableIterator.E().N()) {
                class08388 class083882 = class037702.N((class00500)class088873);
                if (class088873.P() || class083882 != iterator) continue;
                ((Logger)j_1).debug("Missing particle icon for: {}", (Object)class088873);
            }
        }
        class04206.B.z().forEach(class035292 -> {
            class06581 class065812 = (class06581)class035292.N();
            String string = class065812.z();
            if (class00392.L((String)string).getString().toLowerCase(Locale.ROOT).equals(class065812.z())) {
                ((Logger)j_1).debug("Missing translation for: {} {} {}", new Object[]{class035292.B().N(), string, class065812});
            }
        });
        bl |= class05866.N();
        if (bl |= class04808.N()) {
            throw new IllegalStateException("Your game data is foobar, fix the errors above!");
        }
    }

    public class01879 NA() {
        this.yF();
        return (class01879)this.N_6;
    }

    public long W() {
        this.yF();
        return (Long)this.G_5;
    }

    private void W(CallbackInfo callbackInfo) {
        if (FabricDataGenHelper.ENABLED) {
            FabricDataGenHelper.run();
            System.exit(0);
        }
    }

    public void yG() {
        this.yF();
        this.G_2 = Thread.currentThread();
        this.n(null);
        if (Runtime.getRuntime().availableProcessors() > 4) {
            ((Thread)this.G_2).setPriority(10);
        }
        DiscontinuousFrame discontinuousFrame = TracyClient.createDiscontinuousFrame((String)"Client Tick");
        try {
            boolean bl = false;
            while (((Boolean)this.G_3).booleanValue()) {
                this.yH();
                try {
                    class06014 class060142 = class06014.N((String)"Renderer");
                    boolean bl2 = this.ND().L();
                    try (class11345 class113452 = class08700.N((class04643)this.N(bl2, class060142));){
                        ((class04526)this.R_2).L();
                        discontinuousFrame.start();
                        this.M(!bl);
                        discontinuousFrame.end();
                        ((class04526)this.R_2).u();
                    }
                    this.y(bl2, class060142);
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    if (bl) {
                        throw outOfMemoryError;
                    }
                    this.yp();
                    this.N((class05096)new class05695());
                    System.gc();
                    ((Logger)j_1).error(LogUtils.FATAL_MARKER, "Out of memory", (Throwable)outOfMemoryError);
                    bl = true;
                }
            }
        }
        catch (class07878 class078782) {
            ((Logger)j_1).error(LogUtils.FATAL_MARKER, "Reported exception thrown!", (Throwable)class078782);
            this.y(class078782.N());
        }
        catch (Throwable throwable) {
            ((Logger)j_1).error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", throwable);
            this.y(new class07080("Unexpected error", throwable));
        }
    }

    private void R(boolean bl, CallbackInfo callbackInfo) {
        FrameTimeStatistics.INSTANCE.invalidate();
    }

    private void R(class03448 class034482, CallbackInfo callbackInfo) {
        Iris.lastDimension = Iris.getCurrentDimension();
    }

    private void R(CallbackInfo callbackInfo) {
        if (((Boolean)d_5).booleanValue()) {
            return;
        }
        d_5 = true;
        new Iris().onEarlyInitialize();
    }

    public class03409 R() {
        this.yF();
        return (class03409)this.N_5;
    }

    public boolean yu() {
        this.yF();
        return (Boolean)this.Z_1;
    }

    private void yY() {
        this.yF();
        this.N((class01323)null);
        if ((class03448)this.T_3 != null) {
            ((class03448)this.T_3).N(class03448.N);
            this.Nf();
        }
        this.N((class05096)new class04705());
        this.L((class00392)null);
    }

    public class05153 NT() {
        this.yF();
        return (class05153)this.N_3;
    }

    public class04173 Ni() {
        this.yF();
        return (class04173)this.Z_0;
    }

    private void O(CallbackInfo callbackInfo) {
        ImageRendererManager.closeAll();
    }

    public String Nu() {
        this.yF();
        return (String)this.l_3;
    }

    public void yZ() {
        this.yF();
        ((class08844)this.z_7).y(this.LN());
    }

    public double yE() {
        this.yF();
        return (Double)this.N_1;
    }

    public class08117 yW() {
        this.yF();
        return (class08117)this.u_2;
    }

    private boolean yw() {
        this.yF();
        return (Boolean)this.M_0 == false || (class08337)this.T_5 != null && ((class08337)this.T_5).P();
    }

    public class01999 yU() {
        this.yF();
        return (class01999)this.u_4;
    }

    public void H() {
        this.yF();
        ((class06220)this.L_2).U();
    }

    public class01140 yt() {
        this.yF();
        return (class01140)((class00183)this.u_3).u().get();
    }

    public class06463 ND() {
        this.yF();
        return ((class01056)this.i_6).E();
    }

    public class08555 yP() {
        this.yF();
        return (class08555)this.u_1;
    }

    public boolean yM() {
        this.yF();
        return (Boolean)this.W_1 != false && this.Ly().flag(UserApiService.UserFlag.SERVERS_ALLOWED) && this.Nv() == null && !this.j();
    }

    public class06418 yB() {
        this.yF();
        return (class06418)this.L_1;
    }

    public class06734 yj() {
        this.yF();
        return class06724.N((class06728)((class06739)this.Z_5));
    }

    private static void yq() throws RemapException {
        for (class01894 class018942 : class04206.NF.M()) {
            class00751 class007512 = (class00751)class04206.NF.N(class018942);
            if (!(class007512 instanceof RemappableRegistry)) continue;
            ((RemappableRegistry)class007512).unmap();
        }
    }

    public boolean Nz() {
        this.yF();
        return (Boolean)this.l_5;
    }

    public boolean G() {
        this.yF();
        return ((class05096)this.v_3 == null || ((class05096)this.v_3).method_73339()) && (Boolean)this.G_1 == false;
    }

    private void G(CallbackInfo callbackInfo) {
        class11938.L().L((Object)class11380.N());
    }

    public class05463 yv() {
        this.yF();
        return (class05463)this.b_1;
    }

    public class01089 Nm() {
        this.yF();
        return (class01068)this.W_3;
    }

    public @Nullable class01323 NZ() {
        this.yF();
        return (class01323)this.G_0;
    }

    public void yn() {
        this.yF();
        if (this.B(((class03443)this.T_2).E())) {
            return;
        }
        this.M_4 = 4;
        if (((class04453)this.T_4).n()) {
            return;
        }
        if ((class07089)this.M_3 == null) {
            ((Logger)j_1).warn("Null returned as 'hitResult', this shouldn't happen!");
        }
        for (class07050 class070502 : class07050.values()) {
            class07049 class070492;
            Object object;
            class06584 class065842 = ((class04453)this.T_4).method_5998(class070502);
            if (!class065842.N(((class03448)this.T_3).method_45162())) {
                return;
            }
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(callbackInfo, class070502);
            if (callbackInfo.isCancelled()) {
                return;
            }
            if ((class07089)this.M_3 != null) {
                switch (((int[])class06204.N_0)[((class07089)this.M_3).N().ordinal()]) {
                    case 1: {
                        object = (class06145)((class07089)this.M_3);
                        class070492 = ((class06145)((Object)object)).L();
                        if (!((class03448)this.T_3).method_8621().N(class070492.method_24515())) {
                            return;
                        }
                        if (!((class04453)this.T_4).method_56094(class070492, 0.0)) break;
                        class03443 class034432 = (class03443)this.T_2;
                        class04453 class044532 = (class04453)this.T_4;
                        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
                        this.N(callbackInfo2, class070502, (class06145)((Object)object), class070492);
                        if (callbackInfo2.isCancelled()) {
                            return;
                        }
                        class07082 class070822 = class034432.N((class08036)class044532, class070492, (class06145)((Object)object), class070502);
                        if (!class070822.N()) {
                            class070822 = ((class03443)this.T_2).N((class08036)((class04453)this.T_4), class070492, class070502);
                        }
                        if (!(class070822 instanceof class07041)) break;
                        class06183 class061832 = (class07041)class070822;
                        class06183 class061833 = class061832;
                        if (this.N((class07041)class061833) == class07064.field_52427) {
                            ((class04453)this.T_4).method_6104(class070502);
                        }
                        return;
                    }
                    case 2: {
                        class06183 class061832 = (class06183)((class07089)this.M_3);
                        int n = class065842.c();
                        class07082 class070823 = ((class03443)this.T_2).N((class04453)this.T_4, class070502, class061832);
                        if (class070823 instanceof class07041) {
                            if (((class07041)class070823).i() == class07064.field_52427) {
                                ((class04453)this.T_4).method_6104(class070502);
                                if (!class065842.R() && (class065842.c() != n || ((class04453)this.T_4).method_56992())) {
                                    ((class03386)this.i_5).u.N(class070502);
                                }
                            }
                            return;
                        }
                        if (!(class070823 instanceof class07071)) break;
                        return;
                    }
                }
            }
            if (class065842.R() || !((object = ((class03443)this.T_2).N((class08036)((class04453)this.T_4), class070502)) instanceof class07041)) continue;
            class070492 = (class07041)object;
            class07049 class070493 = class070492;
            if (this.y((class07041)class070493) == class07064.field_52427) {
                ((class04453)this.T_4).method_6104(class070502);
            }
            ((class03386)this.i_5).u.N(class070502);
            return;
        }
    }

    public boolean NR() {
        this.yF();
        return (Boolean)((class05630)this.i_7).NL().method_41753();
    }

    public class01083 yR() {
        this.yF();
        return (class01083)this.B_6;
    }

    public void ys() {
        this.yF();
        try {
            ((Logger)j_1).info("Stopping!");
            this.U(null);
            try {
                ((class05153)this.N_3).L();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                if ((class03448)this.T_3 != null) {
                    ((class03448)this.T_3).N(class03448.N);
                }
                this.Nf();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            if ((class05096)this.v_3 != null) {
                ((class05096)this.v_3).method_25432();
                this.k(null);
            }
            this.O(null);
            this.close();
        }
        finally {
            class07536.u = System::nanoTime;
            if ((Supplier)this.G_4 == null) {
                System.exit(0);
            }
        }
    }

    private void Y(CallbackInfo callbackInfo) {
        ((Runnable)InputEvents.HANDLE_KEYBINDS.invoker()).run();
    }

    public static boolean NB() {
        return !((class05630)((class06202)((Object)class06202.j_0)).i_7).NG;
    }

    public class08627 NO() {
        this.yF();
        return (class08627)this.z_3;
    }

    public class04777 NL() {
        this.yF();
        return (class04777)this.l_6;
    }

    private UserApiService.UserProperties Ly() {
        this.yF();
        return (UserApiService.UserProperties)((CompletableFuture)this.u_0).join();
    }

    public class06176 NN() {
        this.yF();
        return (class06176)((Object)this.E_4);
    }

    public class08943 NM() {
        this.yF();
        return (class08943)this.B_4;
    }

    public int Nx() {
        return (Integer)d_4;
    }

    public static /* synthetic */ int Nb() {
        return (Integer)d_4;
    }

    public void NQ() {
        class06320 class063202;
        class05096 class050962;
        this.yF();
        this.N((CallbackInfo)null);
        this.Z(null);
        this.G(null);
        this.Z_3 = (Long)this.Z_3 + 1L;
        if ((class03448)this.T_3 != null && !((Boolean)this.M_6).booleanValue()) {
            ((class03448)this.T_3).method_54719().W();
        }
        if ((Integer)this.M_4 > 0) {
            this.M_4 = (Integer)this.M_4 - 1;
        }
        class04643 class046432 = class08700.N();
        class046432.N("gui");
        ((class03040)this.N_4).N();
        ((class01056)this.i_6).N(((Boolean)this.M_6).booleanValue());
        class046432.L();
        ((class03386)this.i_5).N(1.0f);
        ((class08764)this.b_0).N((class03448)this.T_3, (class07089)this.M_3);
        class046432.N("gameMode");
        if (!((Boolean)this.M_6).booleanValue() && (class03448)this.T_3 != null) {
            ((class03443)this.T_2).u();
        }
        class046432.y("screen");
        if ((class05096)this.v_3 == null && (class04453)this.T_4 != null) {
            if (((class04453)this.T_4).method_29504() && !((class05096)this.v_3 instanceof class05345)) {
                this.N((class05096)null);
            } else if (((class04453)this.T_4).method_6113() && (class03448)this.T_3 != null) {
                ((class01056)this.i_6).i().y(class06468.field_62004, class06320::new);
            }
        } else {
            class050962 = (class05096)this.v_3;
            if (class050962 instanceof class06320) {
                class063202 = (class06320)class050962;
                if (!((class04453)this.T_4).method_6113()) {
                    class063202.y();
                }
            }
        }
        if ((class05096)this.v_3 != null) {
            this.M_5 = 10000;
        }
        this.m(null);
        this.P(null);
        if ((class05096)this.v_3 != null) {
            try {
                class05096 class050963 = (class05096)this.v_3;
                this.u((CallbackInfo)null);
                class050963.method_25393();
                this.v(null);
            }
            catch (Throwable throwable) {
                class050962 = class07080.N((Throwable)throwable, (String)"Ticking screen");
                ((class05096)this.v_3).method_65027((class07080)class050962);
                throw new class07878((class07080)class050962);
            }
        }
        if ((class01323)this.G_0 != null) {
            ((class01323)this.G_0).y();
        }
        if (!this.ND().y()) {
            ((class01056)this.i_6).W();
        }
        if ((class01323)this.G_0 == null && this.i(this) == null) {
            class046432.y("Keybindings");
            this.z(null);
            this.yS();
            if (this.N(this) > 0) {
                this.M_5 = (Integer)this.M_5 - 1;
            }
        }
        if ((class03448)this.T_3 != null) {
            if (!((Boolean)this.M_6).booleanValue()) {
                class046432.y("gameRenderer");
                ((class03386)this.i_5).z();
                class046432.y("entities");
                ((class03448)this.T_3).B();
                this.b(null);
                class046432.y("blockEntities");
                ((class03448)this.T_3).method_18471();
            }
        } else if (((class03386)this.i_5).U() != null) {
            ((class03386)this.i_5).M();
        }
        ((class09000)this.E_2).N();
        ((class09033)this.E_1).N(((Boolean)this.M_6).booleanValue());
        if ((class03448)this.T_3 != null) {
            if (!((Boolean)this.M_6).booleanValue()) {
                class046432.y("level");
                if (!((class05630)this.i_7).b && this.yw()) {
                    class063202 = class00392.L((String)"tutorial.socialInteractions.title");
                    class050962 = class00392.N((String)"tutorial.socialInteractions.description", (Object[])new Object[]{class08764.N((String)"socialInteractions")});
                    this.U_5 = new class06128((class01590)this.i_3, class06090.field_26848, (class00392)class063202, (class00392)class050962, true, 8000);
                    ((class06086)this.u_7).N((class04680)((class06128)this.U_5));
                    ((class05630)this.i_7).b = true;
                    ((class05630)this.i_7).Np();
                }
                ((class08764)this.b_0).u();
                try {
                    ((class03448)this.T_3).N(() -> true);
                }
                catch (Throwable throwable) {
                    class050962 = class07080.N((Throwable)throwable, (String)"Exception in world tick");
                    if ((class03448)this.T_3 == null) {
                        class050962.N("Affected level").N("Problem", (Object)"Level is null!");
                    } else {
                        ((class03448)this.T_3).method_8538((class07080)class050962);
                    }
                    throw new class07878((class07080)class050962);
                }
            }
            class046432.y("animateTick");
            if (!((Boolean)this.M_6).booleanValue() && this.yQ()) {
                ((class03448)this.T_3).N(((class04453)this.T_4).method_31477(), ((class04453)this.T_4).method_31478(), ((class04453)this.T_4).method_31479());
            }
            class046432.y("particles");
            if (!((Boolean)this.M_6).booleanValue() && this.yQ()) {
                ((class04410)this.i_0).N();
            }
            if ((class063202 = this.NE()) != null && !((Boolean)this.M_6).booleanValue()) {
                class063202.N((class00381)class02574.N);
            }
        } else if ((class00642)this.T_6 != null) {
            class046432.y("pendingConnection");
            ((class00642)this.T_6).method_10754();
        }
        class046432.y("keyboard");
        ((class06197)this.L_3).y();
        class046432.L();
        this.M(null);
        this.w(null);
        this.L((CallbackInfo)null);
    }

    public class09033 Nr() {
        this.yF();
        return (class09033)this.E_1;
    }

    public DataFixer Nh() {
        this.yF();
        return (DataFixer)this.z_5;
    }

    public class02233 NK() {
        this.yF();
        return (class02212)this.B_0;
    }

    public class02742 NG() {
        this.yF();
        return (class02742)this.U_0;
    }

    public class08844 Nt() {
        this.yF();
        return (class08844)this.z_7;
    }

    public @Nullable class01683 NE() {
        this.yF();
        return (class04453)this.T_4 == null ? null : (class01683)((class04453)this.T_4).y_0;
    }

    public @Nullable BanDetails Nv() {
        return (BanDetails)this.Ly().bannedScopes().get("MULTIPLAYER");
    }

    public boolean Nk() {
        return this.NC() && this.Ly().flag(UserApiService.UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
    }

    public class01246 Ns() {
        this.yF();
        return (class01246)this.E_5;
    }

    public void NU() {
        this.yF();
        ((class04866)this.E_3).N((class05630)this.i_7);
    }

    public boolean yz() {
        this.yF();
        return this.Nk() && (Boolean)((class05630)this.i_7).Nk().method_41753() != false;
    }

    public boolean NW() {
        class08337 class083372 = this.Na();
        return class083372 != null && !class083372.P();
    }

    public class07949 Nn() {
        this.yF();
        return (class07949)this.T_1;
    }

    public void Nf() {
        this.y(true);
    }

    public CompletableFuture<Void> Nw() {
        return this.N(this::yy).thenCompose(completableFuture -> completableFuture);
    }

    public boolean NS() {
        return this.Ly().flag(UserApiService.UserFlag.REALMS_ALLOWED) && this.Nv() == null;
    }

    public GameProfile NH() {
        this.yF();
        ProfileResult profileResult = (ProfileResult)((CompletableFuture)this.z_2).join();
        if (profileResult != null) {
            return profileResult.profile();
        }
        return new GameProfile(((class04771)this.i_2).y(), ((class04771)this.i_2).L());
    }

    private boolean yQ() {
        this.yF();
        return (class03448)this.T_3 == null || ((class03448)this.T_3).method_54719().Z();
    }

    public class00232 yL() {
        this.yF();
        return (class00232)this.W_5;
    }

    public CompletableFuture<Void> yy() {
        CompletableFuture<Void> completableFuture = this.N(false, (class06216)null);
        this.y((CallbackInfoReturnable)null);
        return completableFuture;
    }

    public class02111 Nc() {
        this.yF();
        return (class02111)this.l_0;
    }

    public class08212 ym() {
        this.yF();
        return (class08212)this.z_4;
    }

    public class04771 Ny() {
        this.yF();
        return (class04771)this.i_2;
    }

    public float Np() {
        this.yF();
        if ((class05096)this.v_3 != null && ((class05096)this.v_3).method_50024() != null) {
            return 1.0f;
        }
        class05363 class053632 = ((class03386)this.i_5).s();
        if (class053632 != null) {
            return ((Float)class053632.U().N(class00608.G, 1.0f)).floatValue();
        }
        return 1.0f;
    }

    private String LN() {
        this.yF();
        StringBuilder stringBuilder = new StringBuilder("Minecraft");
        if (class06202.Z().N()) {
            stringBuilder.append("*");
        }
        stringBuilder.append(" ");
        stringBuilder.append(class07529.y().comp_4025());
        class01683 class016832 = this.NE();
        if (class016832 != null && class016832.M().method_10758()) {
            stringBuilder.append(" - ");
            class04568 class045682 = this.yN();
            if ((class08337)this.T_5 != null && !((class08337)this.T_5).P()) {
                stringBuilder.append(class08392.N((String)"title.singleplayer", (Object[])new Object[0]));
            } else if (class045682 != null && class045682.i()) {
                stringBuilder.append(class08392.N((String)"title.multiplayer.realms", (Object[])new Object[0]));
            } else if ((class08337)this.T_5 != null || class045682 != null && class045682.u()) {
                stringBuilder.append(class08392.N((String)"title.multiplayer.lan", (Object[])new Object[0]));
            } else {
                stringBuilder.append(class08392.N((String)"title.multiplayer.other", (Object[])new Object[0]));
            }
        }
        return stringBuilder.toString();
    }

    private void yp() {
        this.yF();
        class04583.y();
        try {
            if (((Boolean)this.M_0).booleanValue() && (class08337)this.T_5 != null) {
                ((class08337)this.T_5).y(true);
            }
            this.Nj();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    public @Nullable class04568 yN() {
        return (class04568)class01962.N((Object)this.NE(), class01683::t);
    }

    public static boolean yb() {
        return (Boolean)((class05630)((class06202)((Object)class06202.j_0)).i_7).T().method_41753();
    }

    public class01386 Ne() {
        this.yF();
        return (class01386)this.B_1;
    }

    public void Nj() {
        this.N((class05096)new class06307((class00392)d_2), false);
    }

    private static void LM() {
        j_0 = null;
        j_1 = null;
        j_2 = 10;
        j_3 = null;
        j_4 = null;
        t_0 = null;
        t_1 = null;
        d_0 = null;
        d_1 = null;
        d_2 = null;
        d_3 = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
        d_4 = 29;
        d_5 = false;
        d_6 = null;
        d_7 = false;
    }

    private void yF() {
        if (!this.z_init) {
            this.z_init = true;
            this.z_0 = 0L;
            this.l_5 = false;
            this.W_0 = false;
            this.W_1 = false;
            this.M_0 = false;
            this.v_0 = 0L;
            this.W_2 = false;
            this.G_1 = false;
            this.U_1 = false;
            this.R_0 = 0;
            this.M_4 = 0;
            this.N_0 = 0L;
            this.v_1 = 0;
            this.Z_1 = false;
            this.G_3 = false;
            this.n_0 = false;
            this.U_2 = false;
            this.N_1 = 0.0;
            this.v_2 = false;
            this.Z_2 = 0L;
            this.G_5 = 0L;
            this.U_3 = false;
            this.M_5 = 0;
            this.Z_3 = 0L;
            this.n_3 = false;
            this.M_6 = false;
            this.M_7 = 0L;
        }
    }

    public @Nullable class05075 NX() {
        this.yF();
        class05075 class050752 = (class05075)class01962.N((Object)((class05096)this.v_3), class05096::method_50024);
        if (class050752 != null) {
            return class050752;
        }
        class05363 class053632 = ((class03386)this.i_5).s();
        if ((class04453)this.T_4 != null && class053632 != null) {
            if (((class04453)this.T_4).method_73183().method_27983() == class07299.field_25181 && ((class01056)this.i_6).U().y()) {
                return class09002.u;
            }
            class00621 class006212 = (class00621)class053632.U().N(class00608.t, 1.0f);
            boolean bl = ((class04453)this.T_4).method_31549().u && ((class04453)this.T_4).method_31549().L;
            boolean bl2 = ((class04453)this.T_4).method_5869();
            return class006212.N(bl, bl2).orElse(null);
        }
        return class09002.N;
    }

    private void yx() {
        this.yF();
        ((class04526)this.R_2).y();
        if ((class08337)this.T_5 != null) {
            ((class08337)this.T_5).yj();
        }
    }

    public boolean NF() {
        boolean bl;
        block16: {
            class07050 class070502;
            class03443 class034432;
            this.yF();
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            this.L(callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return callbackInfoReturnable.getReturnValueZ();
            }
            if ((Integer)this.M_5 > 0) {
                return false;
            }
            this.i((CallbackInfoReturnable)null);
            if ((class07089)this.M_3 == null) {
                ((Logger)j_1).error("Null returned as 'hitResult', this shouldn't happen!");
                if (((class03443)this.T_2).M()) {
                    this.M_5 = 10;
                }
                return false;
            }
            if (((class04453)this.T_4).n()) {
                return false;
            }
            class06584 class065842 = ((class04453)this.T_4).method_5998(class07050.field_5808);
            if (!class065842.N(((class03448)this.T_3).method_45162())) {
                return false;
            }
            if (((class04453)this.T_4).method_75202(class065842, 0)) {
                return false;
            }
            bl = false;
            class08172 class081722 = (class08172)class065842.method_58694(class02484.c);
            if (class081722 != null && !((class03443)this.T_2).Z()) {
                ((class03443)this.T_2).N(class081722);
                class07050 class070503 = class07050.field_5808;
                class04453 class044532 = (class04453)this.T_4;
                if (this.N(class044532, class070503)) {
                    class044532.method_6104(class070503);
                }
                return true;
            }
            switch (((int[])class06204.N_0)[((class07089)this.M_3).N().ordinal()]) {
                case 1: {
                    class06543 class065432 = (class06543)class065842.method_58694(class02484.I);
                    if (class065432 != null && !class065432.N((class07438)((class04453)this.T_4), ((class07089)this.M_3).y())) break;
                    ((class03443)this.T_2).N((class08036)((class04453)this.T_4), ((class06145)((class07089)this.M_3)).L());
                    break;
                }
                case 2: {
                    class06183 class061832 = (class06183)((class07089)this.M_3);
                    class07209 class072092 = class061832.u();
                    if (!((class03448)this.T_3).method_8320(class072092).P()) {
                        ((class03443)this.T_2).N(class072092, class061832.i());
                        if (!((class03448)this.T_3).method_8320(class072092).P()) break;
                        bl = true;
                        break;
                    }
                }
                case 3: {
                    class034432 = (class03443)this.T_2;
                    if (this.N(class034432, objectArray -> {
                        WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_636]");
                        return ((class03443)objectArray[0]).M();
                    })) {
                        this.M_5 = 10;
                    }
                    ((class04453)this.T_4).method_7350();
                }
            }
            if (((class04453)this.T_4).method_7325() || !this.N((class04453)(class034432 = (class04453)this.T_4), class070502 = class07050.field_5808)) break block16;
            class034432.method_6104(class070502);
        }
        return bl;
    }

    private void yA() {
        this.yF();
        ((class04526)this.R_2).N();
        if ((class08337)this.T_5 != null) {
            ((class08337)this.T_5).yb();
        }
    }

    private void yH() {
        this.yF();
        if ((Supplier)this.G_4 != null) {
            class06202.N(this, (File)this.l_1, (class07080)((Supplier)this.G_4).get());
        }
    }

    public class01781 Ng() {
        this.yF();
        return (class01781)this.B_3;
    }

    public Proxy NJ() {
        this.yF();
        return (Proxy)this.l_4;
    }

    private Optional<class03556<class09037>> ye() {
        this.yF();
        class00751 class007512 = ((class01683)((class04453)this.T_4).y_0).j().L(class04227.yL);
        return class007512.N(class00101.y).flatMap(class035522 -> {
            if (class035522.y() == 0) {
                return Optional.empty();
            }
            if (class035522.y() == 1) {
                return Optional.of(class035522.N(0));
            }
            return class007512.N(class09016.L);
        });
    }

    public class03323 NI() {
        this.yF();
        return (class03323)this.m_0;
    }

    public class08265 NV() {
        this.yF();
        return (class08265)this.u_5;
    }

    public static class06202 Nq() {
        return (class06202)((Object)j_0);
    }

    public class08764 yT() {
        this.yF();
        return (class08764)this.b_0;
    }

    public boolean NC() {
        if (class07529.ND && !class07529.Np) {
            return false;
        }
        return this.Ly().flag(UserApiService.UserFlag.TELEMETRY_ENABLED);
    }

    private void yS() {
        int n;
        this.yF();
        this.Y(null);
        while (((class05630)this.i_7).H.B()) {
            class05455 class054552 = ((class05630)this.i_7).NS();
            ((class05630)this.i_7).N(((class05630)this.i_7).NS().L());
            if (class054552.N() != ((class05630)this.i_7).NS().N()) {
                ((class03386)this.i_5).N(((class05630)this.i_7).NS().N() ? this.F() : null);
            }
            ((class03063)this.B_2).W();
        }
        while (((class05630)this.i_7).c.B()) {
            ((class05630)this.i_7).Nd = !((class05630)this.i_7).Nd;
        }
        for (n = 0; n < 9; ++n) {
            boolean bl = ((class05630)this.i_7).C.R();
            boolean bl2 = ((class05630)this.i_7).S.R();
            if (!((class05630)this.i_7).f[n].B()) continue;
            if (((class04453)this.T_4).method_7325()) {
                ((class01056)this.i_6).B().N(n);
                continue;
            }
            if (((class04453)this.T_4).method_56992() && (class05096)this.v_3 == null && (bl2 || bl)) {
                class01488.N((class06202)this, (int)n, (boolean)bl2, (boolean)bl);
                continue;
            }
            int n2 = n;
            ((class04453)this.T_4).method_31548().N(this.i(n2));
        }
        while (((class05630)this.i_7).V.B()) {
            if (!this.yw() && !class07529.Nu) {
                ((class04453)this.T_4).method_7353((class00392)d_1, true);
                ((class05153)this.N_3).u((class00392)d_1);
                continue;
            }
            if ((class06128)this.U_5 != null) {
                ((class06128)this.U_5).B();
                this.U_5 = null;
            }
            this.N((class05096)new class05470());
        }
        while (((class05630)this.i_7).Y.B()) {
            if (((class03443)this.T_2).B()) {
                ((class04453)this.T_4).T();
                continue;
            }
            ((class08764)this.b_0).N();
            this.B((CallbackInfo)null);
            this.N((class05096)new class05410((class08036)((class04453)this.T_4)));
        }
        while (((class05630)this.i_7).a.B()) {
            this.N((class05096)new class01417(((class01683)((class04453)this.T_4).y_0).W()));
        }
        while (((class05630)this.i_7).p.B()) {
            this.ye().ifPresent(class035562 -> {
                this.yF();
                ((class01683)((class04453)this.T_4).y_0).N(class035562, (class05096)this.v_3);
            });
        }
        while (((class05630)this.i_7).Q.B()) {
            if (((class04453)this.T_4).method_7325()) continue;
            this.NE().N((class00381)new class07364(class07356.field_12969, class07209.field_10980, class07211.field_11033));
        }
        while (((class05630)this.i_7).O.B()) {
            class07050 class070502;
            class04453 class044532;
            if (((class04453)this.T_4).method_7325() || !((class04453)this.T_4).i(this.s()) || !this.y(class044532 = (class04453)this.T_4, class070502 = class07050.field_5808)) continue;
            class044532.method_6104(class070502);
        }
        while (((class05630)this.i_7).o.B()) {
            this.N(class06468.field_62004);
        }
        if ((class05096)this.v_3 == null && (class01323)this.G_0 == null && ((class05630)this.i_7).K.B()) {
            this.N(class06468.field_62005);
        }
        n = 0;
        class04453 class044533 = (class04453)this.T_4;
        this.s(null);
        if (class044533.method_6115()) {
            if (!((class05630)this.i_7).g.R()) {
                ((class03443)this.T_2).y((class08036)((class04453)this.T_4));
            }
            while (((class05630)this.i_7).I.B()) {
            }
            while (((class05630)this.i_7).g.B()) {
            }
            while (((class05630)this.i_7).J.B()) {
            }
        } else {
            while (((class05630)this.i_7).I.B()) {
                n |= this.NF();
            }
            while (((class05630)this.i_7).g.B()) {
                this.yn();
            }
            while (((class05630)this.i_7).J.B()) {
                this.LL();
            }
            if (((class04453)this.T_4).method_7325()) {
                while (((class05630)this.i_7).D.B()) {
                    ((class01056)this.i_6).B().y();
                }
            }
        }
        if (((class05630)this.i_7).g.R() && (Integer)this.M_4 == 0 && !((class04453)this.T_4).method_6115()) {
            this.yn();
        }
        this.i((class05096)this.v_3 == null && n == 0 && ((class05630)this.i_7).I.R() && ((class06220)this.L_2).B());
    }

    public @Nullable class08337 Na() {
        this.yF();
        return (class08337)this.T_5;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.GeneralSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00650
 *  minecraft.class00730
 *  minecraft.class00756
 *  minecraft.class00860
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01296
 *  minecraft.class05487
 *  minecraft.class06859
 *  minecraft.class06884
 *  minecraft.class06901
 *  minecraft.class06994
 *  minecraft.class07031
 *  minecraft.class07100
 *  minecraft.class07188
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07746
 *  minecraft.class08050
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.CrossCollisionStateHandler;
import com.viaversion.viafabricplus.features.block.connections.DoorStateHandler;
import com.viaversion.viafabricplus.features.block.connections.DoubleChestStateHandler;
import com.viaversion.viafabricplus.features.block.connections.FenceGateStateHandler;
import com.viaversion.viafabricplus.features.block.connections.FireStateHandler;
import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import com.viaversion.viafabricplus.features.block.connections.PipeStateHandler;
import com.viaversion.viafabricplus.features.block.connections.RedStoneRepeaterStateHandler;
import com.viaversion.viafabricplus.features.block.connections.RedStoneStateHandler;
import com.viaversion.viafabricplus.features.block.connections.SnowyGrassStateHandler;
import com.viaversion.viafabricplus.features.block.connections.StairsStateHandler;
import com.viaversion.viafabricplus.features.block.connections.WallStateHandler;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00650;
import minecraft.class00730;
import minecraft.class00756;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01296;
import minecraft.class05487;
import minecraft.class06859;
import minecraft.class06884;
import minecraft.class06901;
import minecraft.class06994;
import minecraft.class07031;
import minecraft.class07100;
import minecraft.class07188;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07746;
import minecraft.class08050;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;

public final class BlockConnectionsEmulation1_12_2 {
    private static final int UPDATE_FLAGS = 18;
    private static final Object2ObjectOpenHashMap<Class<? extends class00891>, IBlockStateHandler> connectionHandlers = new Object2ObjectOpenHashMap();
    private static final Object2ObjectOpenHashMap<Class<? extends class00891>, IBlockStateHandler> lookupCache = new Object2ObjectOpenHashMap();

    private static boolean isApplicable() {
        if (((Boolean)GeneralSettings.INSTANCE.experimentalBlockConnections.getValue()).booleanValue()) {
            return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) || ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest);
        }
        return false;
    }

    public static void init() {
        connectionHandlers.put(class07196.class, (Object)new DoorStateHandler());
        connectionHandlers.put(class00860.class, (Object)new DoubleChestStateHandler());
        connectionHandlers.put(class07188.class, (Object)new FenceGateStateHandler());
        connectionHandlers.put(class00730.class, (Object)new CrossCollisionStateHandler(class005002 -> class005002.N(class01210.A) || class005002.N(class01210.E) || class005002.i() instanceof class07031));
        connectionHandlers.put(class00756.class, (Object)new FireStateHandler());
        connectionHandlers.put(class07100.class, (Object)new CrossCollisionStateHandler(class005002 -> class005002.i() instanceof class07100));
        connectionHandlers.put(class06901.class, (Object)new PipeStateHandler());
        connectionHandlers.put(class06859.class, (Object)new RedStoneRepeaterStateHandler());
        connectionHandlers.put(class06884.class, (Object)new RedStoneStateHandler());
        connectionHandlers.put(class06994.class, (Object)new SnowyGrassStateHandler());
        connectionHandlers.put(class07746.class, (Object)new StairsStateHandler());
        connectionHandlers.put(class00650.class, (Object)new WallStateHandler());
    }

    private static @Nullable IBlockStateHandler getConnectionHandler(Class<? extends class00891> clazz) {
        return (IBlockStateHandler)lookupCache.computeIfAbsent(clazz, object -> {
            for (Class clazz = (Class)object; clazz != class00891.class && clazz != null; clazz = clazz.getSuperclass()) {
                IBlockStateHandler iBlockStateHandler = (IBlockStateHandler)connectionHandlers.get((Object)clazz);
                if (iBlockStateHandler == null) continue;
                return iBlockStateHandler;
            }
            return null;
        });
    }

    public static void updateChunkNeighborConnections(class05487 class054872, int n, int n2) {
        BlockConnectionsEmulation1_12_2.updateChunkConnections(class054872, n, n2);
        BlockConnectionsEmulation1_12_2.updateChunkConnections(class054872, n + 1, n2);
        BlockConnectionsEmulation1_12_2.updateChunkConnections(class054872, n - 1, n2);
        BlockConnectionsEmulation1_12_2.updateChunkConnections(class054872, n, n2 + 1);
        BlockConnectionsEmulation1_12_2.updateChunkConnections(class054872, n, n2 - 1);
    }

    public static void updateChunkNeighborConnections(class05487 class054872, class07209 class072092) {
        BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections(class054872, class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()));
    }

    public static void updateChunkConnections(class05487 class054872, int n, int n2) {
        if (!BlockConnectionsEmulation1_12_2.isApplicable() || !class054872.N(n, n2)) {
            return;
        }
        class08050 class080502 = class054872.method_8392(n, n2);
        class07218 class072182 = new class07218();
        for (int i = class080502.method_32891(); i < class080502.method_31597(); ++i) {
            class00554 class005542 = class080502.y(class080502.method_31603(i));
            if (class005542.L()) continue;
            int n3 = class01296.L((int)i);
            for (int j = -1; j <= 16; ++j) {
                boolean bl = j >= 0 && j < 16;
                for (int k = n3; k < n3 + 16; ++k) {
                    for (int i2 = -1; i2 <= 16; ++i2) {
                        class00500 class005002;
                        IBlockStateHandler iBlockStateHandler;
                        class00500 class005003;
                        class072182.N(class01296.L((int)n) + j, k, class01296.L((int)n2) + i2);
                        if (!class054872.N(class01296.N((int)class072182.method_10263()), class01296.N((int)class072182.method_10260())) || (class005003 = class054872.method_8320((class07209)class072182)).P() || (iBlockStateHandler = BlockConnectionsEmulation1_12_2.getConnectionHandler(class005003.i().getClass())) == null || (class005002 = iBlockStateHandler.connect(class005003, class054872, (class07209)class072182)) == class005003 || !bl || i2 < 0 || i2 >= 16) continue;
                        class080502.N((class07209)class072182, class005002, 18);
                    }
                }
            }
        }
    }
}


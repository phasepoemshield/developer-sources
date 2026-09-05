/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.api.AprilFoolsProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00608
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.features;

import com.viaversion.viaaprilfools.api.AprilFoolsProtocolVersion;
import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.features.block.connections.BlockConnectionsEmulation1_12_2;
import com.viaversion.viafabricplus.features.block.shape.CollisionShapes;
import com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions;
import com.viaversion.viafabricplus.features.entity.EntityDimensionDiff;
import com.viaversion.viafabricplus.features.entity.attribute.EnchantmentAttributesEmulation1_20_6;
import com.viaversion.viafabricplus.features.font.FontCacheReload;
import com.viaversion.viafabricplus.features.font.RenderableGlyphDiff;
import com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2;
import com.viaversion.viafabricplus.features.item.filter_creative_tabs.VersionedRegistries;
import com.viaversion.viafabricplus.features.networking.armor_hud.ArmorHudEmulation1_8;
import com.viaversion.viafabricplus.features.networking.resource_pack_header.ResourcePackHeaderDiff;
import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00608;
import minecraft.class06202;

public final class FeaturesLoading {
    public static void init() {
        ResourcePackHeaderDiff.init();
        RenderableGlyphDiff.init();
        FootStepParticle1_12_2.init();
        CPEAdditions.init();
        Events.CHANGE_PROTOCOL_VERSION.register((protocolVersion, protocolVersion2) -> class06202.Nq().execute(() -> {
            CollisionShapes.reloadBlockShapes();
            if (protocolVersion.equals((Object)AprilFoolsProtocolVersion.s3d_shareware) || protocolVersion2.equals((Object)AprilFoolsProtocolVersion.s3d_shareware)) {
                class06202.Nq().Nr().Z();
            }
            FontCacheReload.reload();
            if (protocolVersion2.olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
                Recipes1_11_2.reset();
            }
            class00608.O.N = protocolVersion2.olderThanOrEqualTo(ProtocolVersion.v1_21_9);
        }));
    }

    public static void postInit() {
        VersionedRegistries.init();
        EntityDimensionDiff.init();
        EnchantmentAttributesEmulation1_20_6.init();
        BlockConnectionsEmulation1_12_2.init();
        Recipes1_11_2.init();
        ArmorHudEmulation1_8.init();
    }
}


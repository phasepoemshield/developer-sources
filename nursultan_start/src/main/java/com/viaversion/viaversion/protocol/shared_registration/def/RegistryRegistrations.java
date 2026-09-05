/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.api.rewriter.TagRewriter
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.AttributeRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.SoundRewriter
 *  com.viaversion.viaversion.rewriter.StatisticsRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 */
package com.viaversion.viaversion.protocol.shared_registration.def;

import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.api.rewriter.TagRewriter;
import com.viaversion.viaversion.protocol.shared_registration.PacketBound;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.AttributeRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.SoundRewriter;
import com.viaversion.viaversion.rewriter.StatisticsRewriter;

final class RegistryRegistrations {
    RegistryRegistrations() {
    }

    static <CU extends ClientboundPacketType> void registerSounds1_19_3(RegistrationContext<CU, ?> ctx) {
        SoundRewriter sr = new SoundRewriter(ctx.protocol());
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_3.SOUND, arg_0 -> ((SoundRewriter)sr).registerSound1_19_3(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_3.SOUND_ENTITY, arg_0 -> ((SoundRewriter)sr).registerSound1_19_3(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerAttributes1_21(RegistrationContext<CU, ?> ctx) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.UPDATE_ATTRIBUTES, arg_0 -> ((AttributeRewriter)new AttributeRewriter(ctx.protocol())).register1_21(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerCommands1_19(RegistrationContext<CU, ?> ctx) {
        if (ctx.protocol().getMappingData() != null && !Mappings.isIntIdIdentity((Mappings)ctx.protocol().getMappingData().getArgumentTypeMappings()) || ctx.protocol().getRegistryDataRewriter() != null) {
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_3.COMMANDS, arg_0 -> ((CommandRewriter1_19_4)new CommandRewriter1_19_4(ctx.protocol())).registerDeclareCommands1_19(arg_0));
        }
    }

    static <CU extends ClientboundPacketType> void registerRegistryData1_21(RegistrationContext<CU, ?> ctx) {
        if (ctx.protocol().getRegistryDataRewriter() == null) {
            return;
        }
        ctx.clientboundHandler((ClientboundPacketType)ClientboundConfigurationPackets1_21.REGISTRY_DATA, arg_0 -> ((RegistryDataRewriter)ctx.protocol().getRegistryDataRewriter()).handle(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerTags1_17_1(RegistrationContext<CU, ?> ctx) {
        TagRewriter tagRewriter = ctx.protocol().getTagRewriter();
        if (tagRewriter instanceof com.viaversion.viaversion.rewriter.TagRewriter) {
            com.viaversion.viaversion.rewriter.TagRewriter tagRewriter2 = (com.viaversion.viaversion.rewriter.TagRewriter)tagRewriter;
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.UPDATE_TAGS, arg_0 -> ((com.viaversion.viaversion.rewriter.TagRewriter)tagRewriter2).registerGeneric(arg_0));
        }
    }

    static <CU extends ClientboundPacketType> void registerTags1_20_2(RegistrationContext<CU, ?> ctx) {
        TagRewriter tagRewriter = ctx.protocol().getTagRewriter();
        if (tagRewriter instanceof com.viaversion.viaversion.rewriter.TagRewriter) {
            com.viaversion.viaversion.rewriter.TagRewriter tagRewriter2 = (com.viaversion.viaversion.rewriter.TagRewriter)tagRewriter;
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_2.UPDATE_TAGS, arg_0 -> ((com.viaversion.viaversion.rewriter.TagRewriter)tagRewriter2).registerGeneric(arg_0));
            ctx.clientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_2.UPDATE_TAGS, arg_0 -> ((com.viaversion.viaversion.rewriter.TagRewriter)tagRewriter2).registerGeneric(arg_0), PacketBound.ADDED_AT_MIN);
        }
    }

    static <CU extends ClientboundPacketType> void registerSounds1_10(RegistrationContext<CU, ?> ctx) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_9_3.SOUND, arg_0 -> ((SoundRewriter)new SoundRewriter(ctx.protocol())).registerSound(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerSounds1_14(RegistrationContext<CU, ?> ctx) {
        SoundRewriter sr = new SoundRewriter(ctx.protocol());
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14.SOUND, arg_0 -> ((SoundRewriter)sr).registerSound(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14.SOUND_ENTITY, arg_0 -> ((SoundRewriter)sr).registerSound(arg_0), PacketBound.ADDED_AT_MIN);
    }

    static <CU extends ClientboundPacketType> void registerStatistics1_13(RegistrationContext<CU, ?> ctx) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.AWARD_STATS, arg_0 -> ((StatisticsRewriter)new StatisticsRewriter(ctx.protocol())).register(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerRecipePackets1_21_2(RegistrationContext<CU, ?> ctx) {
        RecipeDisplayRewriter rr = ctx.protocol().getRecipeRewriter();
        if (rr == null) {
            return;
        }
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.UPDATE_RECIPES, arg_0 -> ((RecipeDisplayRewriter)rr).registerUpdateRecipes(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.RECIPE_BOOK_ADD, arg_0 -> ((RecipeDisplayRewriter)rr).registerRecipeBookAdd(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLACE_GHOST_RECIPE, arg_0 -> ((RecipeDisplayRewriter)rr).registerPlaceGhostRecipe(arg_0));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocol.shared_registration.def;

import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.protocol.shared_registration.PacketBound;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

final class EntityRegistrations {
    EntityRegistrations() {
    }

    static <CU extends ClientboundPacketType> void registerEntityPackets1_13(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.REMOVE_ENTITIES, arg_0 -> er.registerRemoveEntities(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerEntityPackets1_19(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_9.REMOVE_ENTITIES, arg_0 -> er.registerRemoveEntities(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.ADD_ENTITY, arg_0 -> er.registerTrackerWithData1_19(arg_0));
    }

    private static <CU extends ClientboundPacketType> void common1_20_5(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_ENTITY_DATA, arg_0 -> er.registerSetEntityData(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.REMOVE_ENTITIES, arg_0 -> er.registerRemoveEntities(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.LOGIN, arg_0 -> er.registerLogin1_20_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.RESPAWN, arg_0 -> er.registerRespawn1_20_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.GAME_EVENT, arg_0 -> er.registerGameEvent(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.PLAYER_ABILITIES, arg_0 -> er.registerPlayerAbilities(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> @Nullable EntityRewriter<CU, ?> entity(RegistrationContext<CU, SU> ctx) {
        return (EntityRewriter)ctx.protocol().getEntityRewriter();
    }

    static <CU extends ClientboundPacketType> void registerEntityPackets1_14_4(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.REMOVE_ENTITIES, arg_0 -> er.registerRemoveEntities(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.ADD_ENTITY, arg_0 -> er.registerTrackerWithData(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.ADD_MOB, arg_0 -> er.registerTracker(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerEntityPackets1_21_4(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        EntityRegistrations.common1_20_5(ctx, er);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.ADD_ENTITY, arg_0 -> er.registerTrackerWithData1_19(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerEntityPackets1_16_2(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.ADD_ENTITY, arg_0 -> er.registerTrackerWithData(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.ADD_MOB, arg_0 -> er.registerTracker(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerEntityPackets1_17_1(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.REMOVE_ENTITIES, arg_0 -> er.registerRemoveEntities(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.ADD_ENTITY, arg_0 -> er.registerTrackerWithData(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.ADD_MOB, arg_0 -> er.registerTracker(arg_0), PacketBound.REMOVED_AT_MAX);
    }

    static <CU extends ClientboundPacketType> void registerEntityPackets1_20_5(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        EntityRegistrations.common1_20_5(ctx, er);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.ADD_ENTITY, arg_0 -> er.registerTrackerWithData1_19(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerEntityPackets1_21_9(RegistrationContext<CU, ?> ctx, EntityRewriter<CU, ?> er) {
        EntityRegistrations.common1_20_5(ctx, er);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_9.ADD_ENTITY, arg_0 -> er.registerTrackerWithData1_21_9(arg_0));
    }
}


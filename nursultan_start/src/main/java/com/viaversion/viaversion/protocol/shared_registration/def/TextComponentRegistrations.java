/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.data.ChatType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocol.shared_registration.def;

import com.viaversion.viaversion.api.minecraft.item.data.ChatType;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocol.shared_registration.PacketBound;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

final class TextComponentRegistrations {
    TextComponentRegistrations() {
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> @Nullable ComponentRewriterBase<CU> text(RegistrationContext<CU, SU> ctx) {
        return (ComponentRewriterBase)ctx.protocol().getComponentRewriter();
    }

    static <CU extends ClientboundPacketType> void registerComponents1_21_4(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        TextComponentRegistrations.common1_20_5(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_13(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.DISGUISED_CHAT, arg_0 -> cr.registerDisguisedChat(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLAYER_INFO_UPDATE, arg_0 -> cr.registerPlayerInfoUpdate1_21_4(arg_0));
        if (cr instanceof JsonNBTComponentRewriter) {
            JsonNBTComponentRewriter jcr = (JsonNBTComponentRewriter)cr;
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.PLAYER_CHAT, cu -> jcr.registerPlayerChat(cu, (Type)ChatType.TYPE));
        }
    }

    static <CU extends ClientboundPacketType> void registerComponents1_14(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.CHAT, arg_0 -> cr.registerComponentPacket(arg_0));
        TextComponentRegistrations.registerCombatAndTitle1_12_2(ctx, cr);
        TextComponentRegistrations.registerComponentsFrom1_12_2(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_OBJECTIVE, arg_0 -> cr.registerSetObjective(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_13(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerComponents1_21(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        TextComponentRegistrations.common1_20_5(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_13(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.DISGUISED_CHAT, arg_0 -> cr.registerDisguisedChat(arg_0));
        if (cr instanceof JsonNBTComponentRewriter) {
            JsonNBTComponentRewriter jcr = (JsonNBTComponentRewriter)cr;
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.PLAYER_CHAT, cu -> jcr.registerPlayerChat(cu, (Type)ChatType.TYPE));
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.PLAYER_INFO_UPDATE, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerPlayerInfoUpdate1_20_3(arg_0));
        }
    }

    static <CU extends ClientboundPacketType> void registerComponents1_20_3(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        TextComponentRegistrations.registerComponentsFrom1_12_2(ctx, cr);
        TextComponentRegistrations.registerActionBarTitleSubtitle1_17_1(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_OBJECTIVE, arg_0 -> cr.registerSetObjective(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.SYSTEM_CHAT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_3.DISCONNECT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.DISGUISED_CHAT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_SCORE, arg_0 -> cr.registerSetScore1_20_3(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.PLAYER_COMBAT_KILL, arg_0 -> cr.registerPlayerCombatKill1_20(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_13(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.SERVER_DATA, arg_0 -> cr.registerComponentPacket(arg_0));
        if (cr instanceof JsonNBTComponentRewriter) {
            JsonNBTComponentRewriter jcr = (JsonNBTComponentRewriter)cr;
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.PLAYER_CHAT, cu -> jcr.registerPlayerChat(cu, (Type)Types.VAR_INT));
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.PLAYER_INFO_UPDATE, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerPlayerInfoUpdate1_20_3(arg_0));
        }
    }

    static <CU extends ClientboundPacketType> void registerComponents1_20_5(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        TextComponentRegistrations.common1_20_5(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_13(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.DISGUISED_CHAT, arg_0 -> cr.registerComponentPacket(arg_0));
        if (cr instanceof JsonNBTComponentRewriter) {
            JsonNBTComponentRewriter jcr = (JsonNBTComponentRewriter)cr;
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.PLAYER_CHAT, cu -> jcr.registerPlayerChat(cu, (Type)Types.VAR_INT));
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.PLAYER_INFO_UPDATE, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerPlayerInfoUpdate1_20_3(arg_0));
        }
    }

    static <CU extends ClientboundPacketType> void registerComponents1_21_5(RegistrationContext<CU, ?> ctx, NBTComponentRewriter<CU> cr) {
        TextComponentRegistrations.common1_20_5(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_21_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.DISGUISED_CHAT, arg_0 -> cr.registerDisguisedChat(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.PLAYER_INFO_UPDATE, arg_0 -> cr.registerPlayerInfoUpdate1_21_4(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.PLAYER_CHAT, arg_0 -> cr.registerPlayerChat1_21_5(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerComponents1_12_2(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.CHAT, arg_0 -> cr.registerComponentPacket(arg_0));
        TextComponentRegistrations.registerCombatAndTitle1_12_2(ctx, cr);
        TextComponentRegistrations.registerComponentsFrom1_12_2(ctx, cr);
    }

    static <CU extends ClientboundPacketType> void registerComponents1_16_2(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16.CHAT, arg_0 -> cr.registerComponentPacket(arg_0));
        TextComponentRegistrations.registerComponentsFrom1_12_2(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_OBJECTIVE, arg_0 -> cr.registerSetObjective(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_13(arg_0));
        if (!(cr instanceof JsonNBTComponentRewriter)) {
            return;
        }
        JsonNBTComponentRewriter jcr = (JsonNBTComponentRewriter)cr;
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.PLAYER_COMBAT, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerPlayerCombat(arg_0), PacketBound.REMOVED_AT_MAX);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.SET_TITLES, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerTitle(arg_0), PacketBound.REMOVED_AT_MAX);
    }

    static <CU extends ClientboundPacketType> void registerComponents1_19(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        TextComponentRegistrations.registerComponentsFrom1_12_2(ctx, cr);
        TextComponentRegistrations.registerActionBarTitleSubtitle1_17_1(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_OBJECTIVE, arg_0 -> cr.registerSetObjective(arg_0));
        if (cr instanceof JsonNBTComponentRewriter) {
            JsonNBTComponentRewriter jcr = (JsonNBTComponentRewriter)cr;
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.PLAYER_COMBAT_KILL, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerPlayerCombatKill(arg_0));
        }
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_13(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.SYSTEM_CHAT, arg_0 -> cr.registerComponentPacket(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.SERVER_DATA, arg_0 -> cr.registerComponentPacket(arg_0), PacketBound.ADDED_AT_MIN);
    }

    static <CU extends ClientboundPacketType> void registerComponents1_17(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16.CHAT, arg_0 -> cr.registerComponentPacket(arg_0), PacketBound.REMOVED_AT_MAX);
        TextComponentRegistrations.registerComponentsFrom1_12_2(ctx, cr);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.SET_ACTION_BAR_TEXT, arg_0 -> cr.registerComponentPacket(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.SET_TITLE_TEXT, arg_0 -> cr.registerComponentPacket(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.SET_SUBTITLE_TEXT, arg_0 -> cr.registerComponentPacket(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_OBJECTIVE, arg_0 -> cr.registerSetObjective(arg_0));
        if (cr instanceof JsonNBTComponentRewriter) {
            JsonNBTComponentRewriter jcr = (JsonNBTComponentRewriter)cr;
            ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.PLAYER_COMBAT_KILL, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerPlayerCombatKill(arg_0), PacketBound.ADDED_AT_MIN);
        }
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_PLAYER_TEAM, arg_0 -> cr.registerSetPlayerTeam1_13(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerCombatAndTitle1_12_2(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        if (!(cr instanceof JsonNBTComponentRewriter)) {
            return;
        }
        JsonNBTComponentRewriter jcr = (JsonNBTComponentRewriter)cr;
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.PLAYER_COMBAT, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerPlayerCombat(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.SET_TITLES, arg_0 -> ((JsonNBTComponentRewriter)jcr).registerTitle(arg_0));
    }

    private static <CU extends ClientboundPacketType> void registerComponentsFrom1_12_2(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.BOSS_EVENT, arg_0 -> cr.registerBossEvent(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.DISCONNECT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_12_1.TAB_LIST, arg_0 -> cr.registerTabList(arg_0));
        cr.registerLoginDisconnect();
    }

    private static <CU extends ClientboundPacketType> void common1_20_5(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        ctx.clientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_5.DISCONNECT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.DISCONNECT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_ACTION_BAR_TEXT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_TITLE_TEXT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_SUBTITLE_TEXT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.BOSS_EVENT, arg_0 -> cr.registerBossEvent(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.TAB_LIST, arg_0 -> cr.registerTabList(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_OBJECTIVE, arg_0 -> cr.registerSetObjective(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_SCORE, arg_0 -> cr.registerSetScore1_20_3(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SYSTEM_CHAT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.PLAYER_COMBAT_KILL, arg_0 -> cr.registerPlayerCombatKill1_20(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SERVER_DATA, arg_0 -> cr.registerComponentPacket(arg_0));
        cr.registerLoginDisconnect();
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> @Nullable NBTComponentRewriter<CU> nbtText(RegistrationContext<CU, SU> ctx) {
        return (NBTComponentRewriter)ctx.protocol().getComponentRewriter();
    }

    static <CU extends ClientboundPacketType> void registerActionBarTitleSubtitle1_17_1(RegistrationContext<CU, ?> ctx, ComponentRewriterBase<CU> cr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.SET_ACTION_BAR_TEXT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.SET_TITLE_TEXT, arg_0 -> cr.registerComponentPacket(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.SET_SUBTITLE_TEXT, arg_0 -> cr.registerComponentPacket(arg_0));
    }
}


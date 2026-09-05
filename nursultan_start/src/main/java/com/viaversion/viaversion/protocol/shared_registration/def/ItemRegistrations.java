/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocol.shared_registration.def;

import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.protocol.shared_registration.PacketBound;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundConfigurationPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

final class ItemRegistrations {
    ItemRegistrations() {
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> @Nullable ItemRewriter<CU, SU, ?> item(RegistrationContext<CU, SU> ctx) {
        return (ItemRewriter)ctx.protocol().getItemRewriter();
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_19_1(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.CONTAINER_SET_DATA, arg_0 -> ir.registerContainerSetData(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.CONTAINER_SET_SLOT, arg_0 -> ir.registerSetSlot1_17_1(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.CONTAINER_SET_CONTENT, arg_0 -> ir.registerSetContent1_17_1(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.UPDATE_ADVANCEMENTS, arg_0 -> ir.registerAdvancements(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.COOLDOWN, arg_0 -> ir.registerCooldown(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_19_3.CONTAINER_CLICK, arg_0 -> ir.registerContainerClick1_17_1(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_19_3.SET_CREATIVE_MODE_SLOT, arg_0 -> ir.registerSetCreativeModeSlot(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.SET_EQUIPMENT, arg_0 -> ir.registerSetEquipment(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_1.MERCHANT_OFFERS, arg_0 -> ir.registerMerchantOffers1_19(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_13(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ItemRegistrations.common1_13(ctx, ir);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.SET_EQUIPPED_ITEM, arg_0 -> ir.registerSetEquippedItem(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_21(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.CONTAINER_SET_SLOT, arg_0 -> ir.registerSetSlot1_17_1(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.CONTAINER_SET_CONTENT, arg_0 -> ir.registerSetContent1_17_1(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.UPDATE_ADVANCEMENTS, arg_0 -> ir.registerAdvancements1_20_3(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.COOLDOWN, arg_0 -> ir.registerCooldown(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_20_5.CONTAINER_CLICK, arg_0 -> ir.registerContainerClick1_17_1(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_20_5.SET_CREATIVE_MODE_SLOT, arg_0 -> ir.registerSetCreativeModeSlot1_20_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.SET_EQUIPMENT, arg_0 -> ir.registerSetEquipment(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.MERCHANT_OFFERS, arg_0 -> ir.registerMerchantOffers1_20_5(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_21_6(RegistrationContext<CU, SU> ctx, StructuredItemRewriter<CU, SU, ?> ir) {
        ItemRegistrations.registerItemPackets1_21_5(ctx, ir);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_6.SHOW_DIALOG, arg_0 -> ir.registerShowDialog(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundConfigurationPackets1_21_6.SHOW_DIALOG, arg_0 -> ir.registerShowDialogDirect(arg_0), PacketBound.ADDED_AT_MIN);
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_21_2(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.CONTAINER_SET_SLOT, arg_0 -> ir.registerSetSlot1_21_2(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.CONTAINER_SET_CONTENT, arg_0 -> ir.registerSetContent1_21_2(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.UPDATE_ADVANCEMENTS, arg_0 -> ir.registerAdvancements1_20_3(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.COOLDOWN, arg_0 -> ir.registerCooldown1_21_2(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_21_2.CONTAINER_CLICK, arg_0 -> ir.registerContainerClick1_21_2(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_21_2.SET_CREATIVE_MODE_SLOT, arg_0 -> ir.registerSetCreativeModeSlot1_20_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_EQUIPMENT, arg_0 -> ir.registerSetEquipment(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.MERCHANT_OFFERS, arg_0 -> ir.registerMerchantOffers1_20_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_PLAYER_INVENTORY, arg_0 -> ir.registerSetPlayerInventory(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_CURSOR_ITEM, arg_0 -> ir.registerSetCursorItem(arg_0), PacketBound.ADDED_AT_MIN);
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_14(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ItemRegistrations.common1_13(ctx, ir);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14.SET_EQUIPPED_ITEM, arg_0 -> ir.registerSetEquippedItem(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_20_5(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.CONTAINER_SET_DATA, arg_0 -> ir.registerContainerSetData(arg_0));
        ItemRegistrations.registerItemPackets1_21(ctx, ir);
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_16(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ItemRegistrations.common1_13(ctx, ir);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16.SET_EQUIPMENT, arg_0 -> ir.registerSetEquipment(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16.MERCHANT_OFFERS, arg_0 -> ir.registerMerchantOffers1_14_4(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_20_3(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.CONTAINER_SET_DATA, arg_0 -> ir.registerContainerSetData(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.CONTAINER_SET_SLOT, arg_0 -> ir.registerSetSlot1_17_1(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.CONTAINER_SET_CONTENT, arg_0 -> ir.registerSetContent1_17_1(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.UPDATE_ADVANCEMENTS, arg_0 -> ir.registerAdvancements1_20_3(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_3.COOLDOWN, arg_0 -> ir.registerCooldown(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_20_3.CONTAINER_CLICK, arg_0 -> ir.registerContainerClick1_17_1(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_20_2.SET_CREATIVE_MODE_SLOT, arg_0 -> ir.registerSetCreativeModeSlot(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.SET_EQUIPMENT, arg_0 -> ir.registerSetEquipment(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_4.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_2.MERCHANT_OFFERS, arg_0 -> ir.registerMerchantOffers1_19(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_17_1(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.CONTAINER_SET_DATA, arg_0 -> ir.registerContainerSetData(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.CONTAINER_SET_SLOT, arg_0 -> ir.registerSetSlot1_17_1(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.CONTAINER_SET_CONTENT, arg_0 -> ir.registerSetContent1_17_1(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.UPDATE_ADVANCEMENTS, arg_0 -> ir.registerAdvancements(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.COOLDOWN, arg_0 -> ir.registerCooldown(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_17.CONTAINER_CLICK, arg_0 -> ir.registerContainerClick1_17_1(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_17.SET_CREATIVE_MODE_SLOT, arg_0 -> ir.registerSetCreativeModeSlot(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.SET_EQUIPMENT, arg_0 -> ir.registerSetEquipment(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_17_1.MERCHANT_OFFERS, arg_0 -> ir.registerMerchantOffers1_14_4(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_14_4(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ItemRegistrations.common1_13(ctx, ir);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.SET_EQUIPPED_ITEM, arg_0 -> ir.registerSetEquippedItem(arg_0), PacketBound.REMOVED_AT_MAX);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.MERCHANT_OFFERS, arg_0 -> ir.registerMerchantOffers1_14_4(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void registerItemPackets1_21_5(RegistrationContext<CU, SU> ctx, StructuredItemRewriter<CU, SU, ?> ir) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.CONTAINER_SET_SLOT, arg_0 -> ir.registerSetSlot1_21_2(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.CONTAINER_SET_CONTENT, arg_0 -> ir.registerSetContent1_21_2(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.UPDATE_ADVANCEMENTS, arg_0 -> ir.registerAdvancements1_20_3(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.COOLDOWN, arg_0 -> ir.registerCooldown1_21_2(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_21_5.CONTAINER_CLICK, arg_0 -> ir.registerContainerClick1_21_5(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_21_5.SET_CREATIVE_MODE_SLOT, arg_0 -> ir.registerSetCreativeModeSlot1_21_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.SET_EQUIPMENT, arg_0 -> ir.registerSetEquipment(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.OPEN_SCREEN, arg_0 -> ir.registerOpenScreen(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.MERCHANT_OFFERS, arg_0 -> ir.registerMerchantOffers1_20_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.SET_PLAYER_INVENTORY, arg_0 -> ir.registerSetPlayerInventory(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_5.SET_CURSOR_ITEM, arg_0 -> ir.registerSetCursorItem(arg_0));
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> @Nullable StructuredItemRewriter<CU, SU, ?> structuredItem(RegistrationContext<CU, SU> ctx) {
        return (StructuredItemRewriter)ctx.protocol().getItemRewriter();
    }

    private static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> void common1_13(RegistrationContext<CU, SU> ctx, ItemRewriter<CU, SU, ?> ir) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.CONTAINER_SET_DATA, arg_0 -> ir.registerContainerSetData(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.CONTAINER_SET_SLOT, arg_0 -> ir.registerSetSlot(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.CONTAINER_SET_CONTENT, arg_0 -> ir.registerSetContent(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.UPDATE_ADVANCEMENTS, arg_0 -> ir.registerAdvancements(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.COOLDOWN, arg_0 -> ir.registerCooldown(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_13.CONTAINER_CLICK, arg_0 -> ir.registerContainerClick(arg_0));
        ctx.serverbound((ServerboundPacketType)ServerboundPackets1_13.SET_CREATIVE_MODE_SLOT, arg_0 -> ir.registerSetCreativeModeSlot(arg_0));
    }
}


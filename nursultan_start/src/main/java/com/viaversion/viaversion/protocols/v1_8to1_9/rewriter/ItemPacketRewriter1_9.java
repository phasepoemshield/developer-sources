/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5$ModifierData
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.v1_8to1_9.data.EntityIds1_8
 *  com.viaversion.viaversion.protocols.v1_8to1_9.data.PotionIdMappings1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.InventoryTracker
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Pair
 *  com.viaversion.viaversion.util.SerializerVersion
 *  org.checkerframework.checker.nullness.qual.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.viaversion.viaversion.protocols.v1_8to1_9.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.data.EntityIds1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.data.PotionIdMappings1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.EntityTracker1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.InventoryTracker;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Pair;
import com.viaversion.viaversion.util.SerializerVersion;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class ItemPacketRewriter1_9
extends ItemRewriter<ClientboundPackets1_8, ServerboundPackets1_9, Protocol1_8To1_9> {
    private final Int2ObjectMap viaFabricPlus$itemIdentifiers = new Int2ObjectOpenHashMap();
    private final Map viaFabricPlus$itemAttributes = new HashMap();

    public ItemPacketRewriter1_9(Protocol1_8To1_9 protocol1_8To1_9) {
        super(protocol1_8To1_9, (Type<Item>)Types.ITEM1_8, (Type<Item[]>)Types.ITEM1_8_SHORT_ARRAY);
        this.handler$djo000$viafabricplus$loadAdditionalData(null);
    }

    private void handler$djo000$viafabricplus$removeAttributeFixData(CallbackInfoReturnable callbackInfoReturnable) {
        Item item = (Item)callbackInfoReturnable.getReturnValue();
        if (item == null) {
            return;
        }
        CompoundTag compoundTag = item.tag();
        if (compoundTag == null) {
            return;
        }
        CompoundTag compoundTag2 = (CompoundTag)compoundTag.removeUnchecked(this.nbtTagName("attributeFix"));
        if (compoundTag2 == null) {
            return;
        }
        if (compoundTag2.contains("RemoveAttributeModifiers")) {
            compoundTag.remove("AttributeModifiers");
        }
        if (compoundTag2.contains("RemoveTag")) {
            item.setTag(null);
        }
    }

    @Override
    public @Nullable Item handleItemToClient(UserConnection userConnection, @Nullable Item item) {
        StringTag stringTag;
        Object object;
        Object object2;
        CompoundTag compoundTag;
        if (item == null) {
            CallbackInfoReturnable callbackInfoReturnable = null;
            callbackInfoReturnable = new CallbackInfoReturnable("", false, callbackInfoReturnable);
            this.handler$djo000$viafabricplus$addAttributeFixData(callbackInfoReturnable);
            return null;
        }
        if (item.identifier() == 62) {
            item.setIdentifier(61);
            compoundTag = item.tag();
            if (compoundTag == null) {
                compoundTag = new CompoundTag();
            }
            compoundTag.putBoolean(this.nbtTagName("lit_furnace"), true);
            object2 = compoundTag.getCompoundTag("display");
            if (object2 == null) {
                object2 = new CompoundTag();
                compoundTag.put("display", (Tag)object2);
                object2.putBoolean(this.nbtTagName(), true);
            }
            if ((object = object2.getStringTag("Name")) == null) {
                object = new StringTag("1.8 Lit Furnace");
                object2.put("Name", (Tag)object);
                object2.putBoolean(this.nbtTagName("custom_name"), true);
            }
            item.setTag(compoundTag);
        }
        if (item.identifier() == 383 && item.data() != 0) {
            compoundTag = item.tag();
            if (compoundTag == null) {
                compoundTag = new CompoundTag();
            }
            object2 = new CompoundTag();
            object = (String)EntityIds1_8.ENTITY_ID_TO_NAME.get(item.data());
            if (object != null) {
                stringTag = new StringTag((String)object);
                object2.put("id", (Tag)stringTag);
                compoundTag.put("EntityTag", (Tag)object2);
            }
            item.setTag(compoundTag);
            item.setData((short)0);
        }
        if (item.identifier() == 373) {
            compoundTag = item.tag();
            if (compoundTag == null) {
                compoundTag = new CompoundTag();
            }
            if (item.data() >= 16384) {
                item.setIdentifier(438);
                item.setData((short)(item.data() - 8192));
            }
            object2 = PotionIdMappings1_9.potionNameFromDamage((short)item.data());
            object = new StringTag(Key.namespaced((String)object2));
            compoundTag.put("Potion", (Tag)object);
            item.setTag(compoundTag);
            item.setData((short)0);
        }
        if (item.identifier() == 387) {
            compoundTag = item.tag();
            if (compoundTag == null) {
                compoundTag = new CompoundTag();
            }
            object2 = compoundTag.getListTag("pages", StringTag.class);
            compoundTag.put(this.nbtTagName("pages"), (Tag)(object2 == null ? new ListTag(StringTag.class) : object2.copy()));
            if (object2 == null) {
                object2 = new ListTag(Collections.singletonList(new StringTag(ComponentUtil.emptyJsonComponent().toString())));
                compoundTag.put("pages", (Tag)object2);
            } else {
                for (int i = 0; i < object2.size(); ++i) {
                    stringTag = (StringTag)object2.get(i);
                    try {
                        stringTag.setValue(ComponentUtil.convertJsonOrEmpty((String)stringTag.getValue(), (SerializerVersion)SerializerVersion.V1_8, (SerializerVersion)SerializerVersion.V1_9).toString());
                        continue;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
            }
            item.setTag(compoundTag);
        }
        Item item2 = item;
        Item item3 = item2;
        item3 = new CallbackInfoReturnable("", false, (Object)item3);
        this.handler$djo000$viafabricplus$addAttributeFixData((CallbackInfoReturnable)item3);
        return item2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public @Nullable Item handleItemToServer(UserConnection var1_1, @Nullable Item var2_2) {
        block22: {
            block23: {
                block24: {
                    if (var2_2 == null) {
                        var8_3 = null;
                        var8_3 = new CallbackInfoReturnable("", false, var8_3);
                        this.handler$djo000$viafabricplus$removeAttributeFixData(var8_3);
                        return null;
                    }
                    if (var2_2.identifier() == 61 && (var3_4 = var2_2.tag()) != null && var3_4.remove(this.nbtTagName("lit_furnace")) != null) {
                        var2_2.setIdentifier(62);
                        var4_6 = var3_4.getCompoundTag("display");
                        if (var4_6 != null) {
                            if (var4_6.remove(this.nbtTagName("custom_name")) != null) {
                                var4_6.remove("Name");
                            }
                            if (var4_6.remove(this.nbtTagName()) != null) {
                                var3_4.remove("display");
                                if (var3_4.isEmpty()) {
                                    var2_2.setTag(null);
                                }
                            }
                        }
                    }
                    if (var2_2.identifier() == 383 && var2_2.data() == 0) {
                        var3_4 = var2_2.tag();
                        var4_7 = 0;
                        if (var3_4 != null && var3_4.getCompoundTag("EntityTag") != null) {
                            var5_10 = var3_4.getCompoundTag("EntityTag");
                            var6_11 /* !! */  = var5_10.getStringTag("id");
                            if (var6_11 /* !! */  != null && EntityIds1_8.ENTITY_NAME_TO_ID.containsKey(var6_11 /* !! */ .getValue())) {
                                var4_7 = (Integer)EntityIds1_8.ENTITY_NAME_TO_ID.get(var6_11 /* !! */ .getValue());
                            }
                            var3_4.remove("EntityTag");
                        }
                        var2_2.setTag(var3_4);
                        var2_2.setData((short)var4_7);
                    }
                    if (var2_2.identifier() == 373) {
                        var3_4 = var2_2.tag();
                        var4_8 = 0;
                        if (var3_4 != null && var3_4.getStringTag("Potion") != null) {
                            var5_10 = var3_4.getStringTag("Potion");
                            var6_11 /* !! */  = Key.stripMinecraftNamespace((String)var5_10.getValue());
                            if (PotionIdMappings1_9.POTION_NAME_TO_ID.containsKey(var6_11 /* !! */ )) {
                                var4_8 = (Integer)PotionIdMappings1_9.POTION_NAME_TO_ID.get(var6_11 /* !! */ );
                            }
                            var3_4.remove("Potion");
                        }
                        var2_2.setTag(var3_4);
                        var2_2.setData((short)var4_8);
                    }
                    if (var2_2.identifier() == 438) {
                        var3_4 = var2_2.tag();
                        var4_9 = 0;
                        var2_2.setIdentifier(373);
                        if (var3_4 != null && var3_4.getStringTag("Potion") != null) {
                            var5_10 = var3_4.getStringTag("Potion");
                            var6_11 /* !! */  = Key.stripMinecraftNamespace((String)var5_10.getValue());
                            if (PotionIdMappings1_9.POTION_NAME_TO_ID.containsKey(var6_11 /* !! */ )) {
                                var4_9 = (Integer)PotionIdMappings1_9.POTION_NAME_TO_ID.get(var6_11 /* !! */ ) + 8192;
                            }
                            var3_4.remove("Potion");
                        }
                        var2_2.setTag(var3_4);
                        var2_2.setData((short)var4_9);
                    }
                    if (var2_2.identifier() != 387 || (var3_4 = var2_2.tag()) == null) break block22;
                    var4_6 = (ListTag)var3_4.removeUnchecked(this.nbtTagName("pages"));
                    if (var4_6 == null) break block23;
                    if (var4_6.isEmpty()) break block24;
                    var3_4.put("pages", (Tag)var4_6);
                    break block22;
                }
                var3_4.remove("pages");
                if (!var3_4.isEmpty()) break block22;
                var2_2.setTag(null);
                break block22;
            }
            var5_10 = var3_4.getListTag("pages", StringTag.class);
            if (var5_10 != null) {
                for (var6_12 = 0; var6_12 < var5_10.size(); ++var6_12) {
                    var7_13 = (StringTag)var5_10.get(var6_12);
                    var7_13.setValue(ComponentUtil.convertJsonOrEmpty((String)var7_13.getValue(), (SerializerVersion)SerializerVersion.V1_9, (SerializerVersion)SerializerVersion.V1_8).toString());
                }
            }
        }
        if (var2_2.identifier() < 198) ** GOTO lbl-1000
        if (var2_2.identifier() <= 212) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        var3_5 = v0;
        var3_5 |= var2_2.identifier() == 397 && var2_2.data() == 5;
        if (var2_2.identifier() < 432) ** GOTO lbl-1000
        if (var2_2.identifier() <= 448) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        if (var3_5 |= v1) {
            var2_2.setIdentifier(1);
            var2_2.setData((short)0);
        }
        v2 = var2_2;
        var9_14 = v2;
        var9_14 = new CallbackInfoReturnable("", false, (Object)var9_14);
        this.handler$djo000$viafabricplus$removeAttributeFixData((CallbackInfoReturnable)var9_14);
        return v2;
    }

    protected void registerPackets() {
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.CONTAINER_SET_DATA, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    short windowId = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    short property = (Short)wrapper.get((Type)Types.SHORT, 0);
                    short value = (Short)wrapper.get((Type)Types.SHORT, 1);
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    if (inventoryTracker.getInventory() != null && inventoryTracker.getInventory().equalsIgnoreCase("minecraft:enchanting_table") && property > 3 && property < 7) {
                        short level = (short)(value >> 8);
                        short enchantID = (short)(value & 0xFF);
                        wrapper.create(wrapper.getId(), propertyPacket -> {
                            propertyPacket.write((Type)Types.UNSIGNED_BYTE, (Object)windowId);
                            propertyPacket.write((Type)Types.SHORT, (Object)property);
                            propertyPacket.write((Type)Types.SHORT, (Object)enchantID);
                        }).scheduleSend(Protocol1_8To1_9.class);
                        wrapper.set((Type)Types.SHORT, 0, (Object)((short)(property + 3)));
                        wrapper.set((Type)Types.SHORT, 1, (Object)level);
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.OPEN_SCREEN, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.map(Types.STRING, Protocol1_8To1_9.STRING_TO_JSON);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    String inventory = (String)wrapper.get(Types.STRING, 0);
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    inventoryTracker.setInventory(inventory);
                });
                this.handler(wrapper -> {
                    String inventory = (String)wrapper.get(Types.STRING, 0);
                    if (inventory.equals("minecraft:brewing_stand")) {
                        wrapper.set((Type)Types.UNSIGNED_BYTE, 1, (Object)((short)((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 1) + 1)));
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.CONTAINER_SET_SLOT, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types.ITEM1_8);
                this.handler(wrapper -> {
                    boolean showShieldWhenSwordInHand;
                    Item stack = (Item)wrapper.get(Types.ITEM1_8, 0);
                    boolean bl = showShieldWhenSwordInHand = Via.getConfig().isShowShieldWhenSwordInHand() && Via.getConfig().isShieldBlocking();
                    if (showShieldWhenSwordInHand) {
                        InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                        EntityTracker1_9 entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                        short slotID = (Short)wrapper.get((Type)Types.SHORT, 0);
                        byte windowId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                        inventoryTracker.setItemId((int)windowId, slotID, stack == null ? 0 : stack.identifier());
                        entityTracker.syncShieldWithSword();
                    }
                    this.this$0.handleItemToClient(wrapper.user(), stack);
                });
                this.handler(wrapper -> {
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    short slotID = (Short)wrapper.get((Type)Types.SHORT, 0);
                    if (inventoryTracker.getInventory() != null && inventoryTracker.getInventory().equals("minecraft:brewing_stand") && slotID >= 4) {
                        wrapper.set((Type)Types.SHORT, 0, (Object)((short)(slotID + 1)));
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.CONTAINER_SET_CONTENT, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.ITEM1_8_SHORT_ARRAY);
                this.handler(wrapper -> {
                    Item[] stacks = (Item[])wrapper.get(Types.ITEM1_8_SHORT_ARRAY, 0);
                    short windowId = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    EntityTracker1_9 entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    boolean showShieldWhenSwordInHand = Via.getConfig().isShowShieldWhenSwordInHand() && Via.getConfig().isShieldBlocking();
                    for (short i = 0; i < stacks.length; i = (short)(i + 1)) {
                        Item stack = stacks[i];
                        if (showShieldWhenSwordInHand) {
                            inventoryTracker.setItemId((int)windowId, i, stack == null ? 0 : stack.identifier());
                        }
                        this.this$0.handleItemToClient(wrapper.user(), stack);
                    }
                    if (showShieldWhenSwordInHand) {
                        entityTracker.syncShieldWithSword();
                    }
                });
                this.handler(wrapper -> {
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    if (inventoryTracker.getInventory() != null && inventoryTracker.getInventory().equals("minecraft:brewing_stand")) {
                        Item[] oldStack = (Item[])wrapper.get(Types.ITEM1_8_SHORT_ARRAY, 0);
                        Item[] newStack = new Item[oldStack.length + 1];
                        for (int i = 0; i < newStack.length; ++i) {
                            if (i > 4) {
                                newStack[i] = oldStack[i - 1];
                                continue;
                            }
                            if (i == 4) continue;
                            newStack[i] = oldStack[i];
                        }
                        wrapper.set(Types.ITEM1_8_SHORT_ARRAY, 0, (Object)newStack);
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.CONTAINER_CLOSE, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    inventoryTracker.setInventory(null);
                    short windowId = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    inventoryTracker.resetInventory((int)windowId);
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> wrapper.write((Type)Types.BOOLEAN, (Object)true));
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerServerbound(ServerboundPackets1_9.SET_CREATIVE_MODE_SLOT, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.SHORT);
                this.map(Types.ITEM1_8);
                this.handler(wrapper -> {
                    boolean showShieldWhenSwordInHand;
                    Item stack = (Item)wrapper.get(Types.ITEM1_8, 0);
                    boolean bl = showShieldWhenSwordInHand = Via.getConfig().isShowShieldWhenSwordInHand() && Via.getConfig().isShieldBlocking();
                    if (showShieldWhenSwordInHand) {
                        InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                        EntityTracker1_9 entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                        short slotID = (Short)wrapper.get((Type)Types.SHORT, 0);
                        inventoryTracker.setItemId(0, slotID, stack == null ? 0 : stack.identifier());
                        entityTracker.syncShieldWithSword();
                    }
                    this.this$0.handleItemToServer(wrapper.user(), stack);
                });
                this.handler(wrapper -> {
                    boolean throwItem;
                    short slot = (Short)wrapper.get((Type)Types.SHORT, 0);
                    boolean bl = throwItem = slot == 45;
                    if (throwItem) {
                        wrapper.create((PacketType)ClientboundPackets1_9.CONTAINER_SET_SLOT, w -> {
                            w.write((Type)Types.BYTE, (Object)0);
                            w.write((Type)Types.SHORT, (Object)slot);
                            w.write(Types.ITEM1_8, null);
                        }).send(Protocol1_8To1_9.class);
                        wrapper.set((Type)Types.SHORT, 0, (Object)-999);
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerServerbound(ServerboundPackets1_9.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.VAR_INT, (Type)Types.BYTE);
                this.map(Types.ITEM1_8);
                this.handler(wrapper -> {
                    Item stack = (Item)wrapper.get(Types.ITEM1_8, 0);
                    if (Via.getConfig().isShowShieldWhenSwordInHand()) {
                        byte windowId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                        byte mode = (Byte)wrapper.get((Type)Types.BYTE, 2);
                        short hoverSlot = (Short)wrapper.get((Type)Types.SHORT, 0);
                        byte button = (Byte)wrapper.get((Type)Types.BYTE, 1);
                        InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                        inventoryTracker.handleWindowClick(wrapper.user(), (int)windowId, mode, hoverSlot, button);
                    }
                    this.this$0.handleItemToServer(wrapper.user(), stack);
                });
                this.handler(wrapper -> {
                    byte windowID = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    short slot = (Short)wrapper.get((Type)Types.SHORT, 0);
                    boolean throwItem = slot == 45 && windowID == 0;
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    if (inventoryTracker.getInventory() != null && inventoryTracker.getInventory().equals("minecraft:brewing_stand")) {
                        if (slot == 4) {
                            throwItem = true;
                        }
                        if (slot > 4) {
                            wrapper.set((Type)Types.SHORT, 0, (Object)((short)(slot - 1)));
                        }
                    }
                    if (throwItem) {
                        wrapper.create((PacketType)ClientboundPackets1_9.CONTAINER_SET_SLOT, w -> {
                            w.write((Type)Types.BYTE, (Object)windowID);
                            w.write((Type)Types.SHORT, (Object)slot);
                            w.write(Types.ITEM1_8, null);
                        }).scheduleSend(Protocol1_8To1_9.class);
                        wrapper.set((Type)Types.BYTE, 1, (Object)0);
                        wrapper.set((Type)Types.BYTE, 2, (Object)0);
                        wrapper.set((Type)Types.SHORT, 0, (Object)-999);
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerServerbound(ServerboundPackets1_9.CONTAINER_CLOSE, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    inventoryTracker.setInventory(null);
                    inventoryTracker.resetInventory((int)((Byte)wrapper.get((Type)Types.BYTE, 0)).byteValue());
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerServerbound(ServerboundPackets1_9.SET_CARRIED_ITEM, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ ItemPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    boolean showShieldWhenSwordInHand = Via.getConfig().isShowShieldWhenSwordInHand() && Via.getConfig().isShieldBlocking();
                    EntityTracker1_9 entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    if (entityTracker.isBlocking()) {
                        entityTracker.setBlocking(false);
                        if (!showShieldWhenSwordInHand) {
                            entityTracker.setSecondHand(null);
                        }
                    }
                    if (showShieldWhenSwordInHand) {
                        entityTracker.setHeldItemSlot(((Short)wrapper.get((Type)Types.SHORT, 0)).shortValue());
                        entityTracker.syncShieldWithSword();
                    }
                });
            }
        });
    }

    private void handler$djo000$viafabricplus$addAttributeFixData(CallbackInfoReturnable callbackInfoReturnable) {
        Item item = (Item)callbackInfoReturnable.getReturnValue();
        if (item == null) {
            return;
        }
        String string = (String)this.viaFabricPlus$itemIdentifiers.get(item.identifier());
        if (string != null && this.viaFabricPlus$itemAttributes.containsKey(string)) {
            Map map = (Map)this.viaFabricPlus$itemAttributes.get(string);
            CompoundTag compoundTag = new CompoundTag();
            CompoundTag compoundTag2 = item.tag();
            if (compoundTag2 == null) {
                compoundTag2 = new CompoundTag();
                item.setTag(compoundTag2);
                compoundTag.putBoolean("RemoveTag", true);
            }
            compoundTag2.put(this.nbtTagName("attributeFix"), (Tag)compoundTag);
            ListTag listTag = compoundTag2.getListTag("AttributeModifiers", CompoundTag.class);
            if (listTag == null) {
                listTag = new ListTag(CompoundTag.class);
                for (Map.Entry entry : map.entrySet()) {
                    CompoundTag compoundTag3 = new CompoundTag();
                    compoundTag3.putString("AttributeName", (String)entry.getKey());
                    compoundTag3.putString("Name", ((AttributeModifiers1_20_5.ModifierData)((Pair)entry.getValue()).value()).name());
                    compoundTag3.putDouble("Amount", ((AttributeModifiers1_20_5.ModifierData)((Pair)entry.getValue()).value()).amount());
                    compoundTag3.putInt("Operation", ((AttributeModifiers1_20_5.ModifierData)((Pair)entry.getValue()).value()).operation());
                    compoundTag3.putLong("UUIDMost", ((AttributeModifiers1_20_5.ModifierData)((Pair)entry.getValue()).value()).uuid().getMostSignificantBits());
                    compoundTag3.putLong("UUIDLeast", ((AttributeModifiers1_20_5.ModifierData)((Pair)entry.getValue()).value()).uuid().getLeastSignificantBits());
                    compoundTag3.putString("Slot", (String)((Pair)entry.getValue()).key());
                    listTag.add((Tag)compoundTag3);
                }
                compoundTag2.put("AttributeModifiers", (Tag)listTag);
                compoundTag.putBoolean("RemoveAttributeModifiers", true);
            }
        }
    }

    private void handler$djo000$viafabricplus$loadAdditionalData(CallbackInfo callbackInfo) {
        JsonObject jsonObject = ViaFabricPlusMappingDataLoader.INSTANCE.loadData("item-identifiers-1.8.json");
        for (Object object : jsonObject.entrySet()) {
            this.viaFabricPlus$itemIdentifiers.put(((JsonElement)object.getValue()).getAsInt(), (Object)((String)object.getKey()));
        }
        JsonObject jsonObject2 = ViaFabricPlusMappingDataLoader.INSTANCE.loadData("item-attributes-1.8.json");
        for (Map.Entry entry : jsonObject2.entrySet()) {
            String string = (String)entry.getKey();
            HashMap<String, Pair> hashMap = new HashMap<String, Pair>();
            for (Map.Entry entry2 : ((JsonElement)entry.getValue()).getAsJsonObject().entrySet()) {
                String string2 = (String)entry2.getKey();
                JsonObject jsonObject3 = ((JsonElement)entry2.getValue()).getAsJsonObject();
                AttributeModifiers1_20_5.ModifierData modifierData = new AttributeModifiers1_20_5.ModifierData(UUID.fromString(jsonObject3.get("id").getAsString()), jsonObject3.get("name").getAsString(), jsonObject3.get("amount").getAsDouble(), jsonObject3.get("operation").getAsInt());
                String string3 = jsonObject3.get("slot").getAsString();
                hashMap.put(string2, new Pair((Object)string3, (Object)modifierData));
            }
            this.viaFabricPlus$itemAttributes.put(string, hashMap);
        }
    }
}


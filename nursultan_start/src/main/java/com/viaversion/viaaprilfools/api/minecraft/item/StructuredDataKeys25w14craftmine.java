/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.util.Unit
 */
package com.viaversion.viaaprilfools.api.minecraft.item;

import com.viaversion.viaaprilfools.api.minecraft.item.ItemExchangeValue;
import com.viaversion.viaaprilfools.api.minecraft.item.LodestoneTracker25w14craftmine;
import com.viaversion.viaaprilfools.api.minecraft.item.MobTrophyInfo;
import com.viaversion.viaaprilfools.api.minecraft.item.RoomerinoComponentino;
import com.viaversion.viaaprilfools.api.minecraft.item.WorldModifiers;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.util.Unit;

public class StructuredDataKeys25w14craftmine
extends StructuredDataKeys1_21_5 {
    public static final StructuredDataKey<ItemExchangeValue> ITEM_EXCHANGE_VALUE = new StructuredDataKey("exchange_value", ItemExchangeValue.TYPE);
    public static final StructuredDataKey<Unit> WORLD_EFFECT_UNLOCK = new StructuredDataKey("world_effect_unlock", Types.EMPTY);
    public static final StructuredDataKey<Unit> WORLD_EFFECT_HINT = new StructuredDataKey("world_effect_uhint", Types.EMPTY);
    public static final StructuredDataKey<Unit> MINE_ACTIVE = new StructuredDataKey("mine_active", Types.EMPTY);
    public static final StructuredDataKey<Integer> SPECIAL_MINE = new StructuredDataKey("special_mine", (Type)Types.VAR_INT);
    public static final StructuredDataKey<Boolean> MINE_COMPLETED = new StructuredDataKey("mine_completed", (Type)Types.BOOLEAN);
    public static final StructuredDataKey<WorldModifiers> WORLD_MODIFIERS = new StructuredDataKey("world_modifiers", WorldModifiers.TYPE);
    public static final StructuredDataKey<String> DIMENSION_ID = new StructuredDataKey("dimension_id", Types.STRING);
    public static final StructuredDataKey<LodestoneTracker25w14craftmine> LODESTONE_TRACKER = new StructuredDataKey("lodestone_tracker", LodestoneTracker25w14craftmine.TYPE);
    public static final StructuredDataKey<RoomerinoComponentino> ROOM = new StructuredDataKey("instant_room", RoomerinoComponentino.TYPE);
    public static final StructuredDataKey<Integer> SKY = new StructuredDataKey("sky", (Type)Types.INT);
    public static final StructuredDataKey<String> TROPHY_TYPE = new StructuredDataKey("trophy/type", Types.STRING);
    public static final StructuredDataKey<MobTrophyInfo> MOB_TROPHY_TYPE = new StructuredDataKey("mob_trophy/type", MobTrophyInfo.TYPE);

    public StructuredDataKeys25w14craftmine(VersionedTypesHolder types) {
        super(types);
    }
}


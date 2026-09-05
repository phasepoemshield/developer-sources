/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.storage.GameTimeStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.AttackRange
 *  com.viaversion.viaversion.api.minecraft.item.data.DamageType
 *  com.viaversion.viaversion.api.minecraft.item.data.KineticWeapon
 *  com.viaversion.viaversion.api.minecraft.item.data.KineticWeapon$Condition
 *  com.viaversion.viaversion.api.minecraft.item.data.PiercingWeapon
 *  com.viaversion.viaversion.api.minecraft.item.data.SwingAnimation
 *  com.viaversion.viaversion.api.minecraft.item.data.UseEffects
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.rewriter.BlockItemPacketRewriter1_21_11
 *  com.viaversion.viaversion.util.Either
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.Protocol1_21_11To1_21_9;
import com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.storage.GameTimeStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.AttackRange;
import com.viaversion.viaversion.api.minecraft.item.data.DamageType;
import com.viaversion.viaversion.api.minecraft.item.data.KineticWeapon;
import com.viaversion.viaversion.api.minecraft.item.data.PiercingWeapon;
import com.viaversion.viaversion.api.minecraft.item.data.SwingAnimation;
import com.viaversion.viaversion.api.minecraft.item.data.UseEffects;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.util.Either;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockItemPacketRewriter1_21_11
extends BackwardsStructuredItemRewriter<ClientboundPacket1_21_11, ServerboundPacket1_21_9, Protocol1_21_11To1_21_9> {
    public BlockItemPacketRewriter1_21_11(Protocol1_21_11To1_21_9 protocol) {
        super((BackwardsProtocol)protocol);
    }

    protected void backupInconvertibleData(UserConnection connection, Item item, StructuredDataContainer dataContainer, CompoundTag backupTag) {
        Either zombieNautilusVariant;
        AttackRange attackRange;
        UseEffects useEffects;
        DamageType damageType;
        PiercingWeapon piercingWeapon;
        KineticWeapon kineticWeapon;
        super.backupInconvertibleData(connection, item, dataContainer, backupTag);
        SwingAnimation swingAnimation = (SwingAnimation)dataContainer.get(StructuredDataKey.SWING_ANIMATION);
        if (swingAnimation != null) {
            CompoundTag swingTag = new CompoundTag();
            swingTag.putInt("type", swingAnimation.type());
            swingTag.putInt("duration", swingAnimation.duration());
            backupTag.put("swing_animation", (Tag)swingTag);
        }
        if ((kineticWeapon = (KineticWeapon)dataContainer.get(StructuredDataKey.KINETIC_WEAPON)) != null) {
            CompoundTag kineticTag = new CompoundTag();
            kineticTag.putInt("contact_cooldown_ticks", kineticWeapon.contactCooldownTicks());
            kineticTag.putInt("delay_ticks", kineticWeapon.delayTicks());
            this.saveDamageCondition(kineticTag, "damage_conditions", kineticWeapon.damageConditions());
            this.saveDamageCondition(kineticTag, "dismount_conditions", kineticWeapon.dismountConditions());
            this.saveDamageCondition(kineticTag, "knockback_conditions", kineticWeapon.knockbackConditions());
            kineticTag.putFloat("forward_movement", kineticWeapon.forwardMovement());
            kineticTag.putFloat("damage_multiplier", kineticWeapon.damageMultiplier());
            if (kineticWeapon.sound() != null) {
                kineticTag.put("sound", this.holderToTag(kineticWeapon.sound(), (x$0, x$1) -> this.saveSoundEvent((SoundEvent)x$0, (CompoundTag)x$1)));
            }
            if (kineticWeapon.hitSound() != null) {
                kineticTag.put("hit_sound", this.holderToTag(kineticWeapon.hitSound(), (x$0, x$1) -> this.saveSoundEvent((SoundEvent)x$0, (CompoundTag)x$1)));
            }
            backupTag.put("kinetic_weapon", (Tag)kineticTag);
        }
        if ((piercingWeapon = (PiercingWeapon)dataContainer.get(StructuredDataKey.PIERCING_WEAPON)) != null) {
            CompoundTag piercingTag = new CompoundTag();
            piercingTag.putBoolean("deals_knockback", piercingWeapon.dealsKnockback());
            piercingTag.putBoolean("dismounts", piercingWeapon.dismounts());
            if (piercingWeapon.sound() != null) {
                piercingTag.put("sound", this.holderToTag(piercingWeapon.sound(), (x$0, x$1) -> this.saveSoundEvent((SoundEvent)x$0, (CompoundTag)x$1)));
            }
            if (piercingWeapon.hitSound() != null) {
                piercingTag.put("hit_sound", this.holderToTag(piercingWeapon.hitSound(), (x$0, x$1) -> this.saveSoundEvent((SoundEvent)x$0, (CompoundTag)x$1)));
            }
            backupTag.put("piercing_weapon", (Tag)piercingTag);
        }
        if ((damageType = (DamageType)dataContainer.get(StructuredDataKey.DAMAGE_TYPE1_21_11)) != null) {
            if (damageType.id().isLeft()) {
                backupTag.putInt("damage_type_id", ((Integer)damageType.id().left()).intValue());
            } else {
                backupTag.putString("damage_type_id", (String)damageType.id().right());
            }
        }
        if ((useEffects = (UseEffects)dataContainer.get(StructuredDataKey.USE_EFFECTS)) != null) {
            CompoundTag useEffectsTag = new CompoundTag();
            useEffectsTag.putBoolean("can_sprint", useEffects.canSprint());
            useEffectsTag.putBoolean("interact_vibrations", useEffects.interactVibrations());
            useEffectsTag.putFloat("speed_multiplier", useEffects.speedMultiplier());
            backupTag.put("use_effects", (Tag)useEffectsTag);
        }
        if ((attackRange = (AttackRange)dataContainer.get(StructuredDataKey.ATTACK_RANGE)) != null) {
            CompoundTag attackRangeTag = new CompoundTag();
            attackRangeTag.putFloat("min_range", attackRange.minRange());
            attackRangeTag.putFloat("max_range", attackRange.maxRange());
            attackRangeTag.putFloat("min_creative_reach", attackRange.minCreativeRange());
            attackRangeTag.putFloat("max_creative_reach", attackRange.maxCreativeRange());
            attackRangeTag.putFloat("hitbox_margin", attackRange.hitboxMargin());
            attackRangeTag.putFloat("mob_factor", attackRange.mobFactor());
            backupTag.put("attack_range", (Tag)attackRangeTag);
        }
        if ((zombieNautilusVariant = (Either)dataContainer.get(StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT1_21_11)) != null) {
            if (zombieNautilusVariant.isLeft()) {
                backupTag.putInt("zombie_nautilus_variant", ((Integer)zombieNautilusVariant.left()).intValue());
            } else {
                backupTag.putString("zombie_nautilus_variant", (String)zombieNautilusVariant.right());
            }
        }
        this.saveFloatData(StructuredDataKey.MINIMUM_ATTACK_CHARGE, dataContainer, backupTag);
    }

    private void saveDamageCondition(CompoundTag tag, String key, // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable KineticWeapon.Condition condition) {
        if (condition == null) {
            return;
        }
        CompoundTag conditionTag = new CompoundTag();
        conditionTag.putInt("max_duration_ticks", condition.maxDurationTicks());
        conditionTag.putFloat("min_speed", condition.minSpeed());
        conditionTag.putFloat("min_relative_speed", condition.minRelativeSpeed());
        tag.put(key, (Tag)conditionTag);
    }

    private KineticWeapon.Condition loadDamageCondition(CompoundTag tag, String key) {
        CompoundTag conditionTag = tag.getCompoundTag(key);
        if (conditionTag == null) {
            return null;
        }
        int maxDurationTicks = conditionTag.getInt("max_duration_ticks");
        float minSpeed = conditionTag.getFloat("min_speed");
        float minRelativeSpeed = conditionTag.getFloat("min_relative_speed");
        return new KineticWeapon.Condition(maxDurationTicks, minSpeed, minRelativeSpeed);
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToServer(connection, item, container);
        com.viaversion.viaversion.protocols.v1_21_9to1_21_11.rewriter.BlockItemPacketRewriter1_21_11.upgradeData((Item)item, (StructuredDataContainer)container);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToClient(connection, item, container);
        com.viaversion.viaversion.protocols.v1_21_9to1_21_11.rewriter.BlockItemPacketRewriter1_21_11.downgradeData((Item)item, (StructuredDataContainer)container);
    }

    protected void restoreBackupData(Item item, StructuredDataContainer container, CompoundTag customData) {
        Tag zombieNautilusVariantTag;
        CompoundTag attackRangeTag;
        CompoundTag useEffectsTag;
        Tag damageTypeId;
        CompoundTag piercingTag;
        CompoundTag kineticTag;
        super.restoreBackupData(item, container, customData);
        Tag tag = customData.remove(this.nbtTagName("backup"));
        if (!(tag instanceof CompoundTag)) {
            return;
        }
        CompoundTag backupTag = (CompoundTag)tag;
        CompoundTag swingTag = backupTag.getCompoundTag("swing_animation");
        if (swingTag != null) {
            int type = swingTag.getInt("type");
            int duration = swingTag.getInt("duration");
            container.set(StructuredDataKey.SWING_ANIMATION, (Object)new SwingAnimation(type, duration));
        }
        if ((kineticTag = backupTag.getCompoundTag("kinetic_weapon")) != null) {
            int contactCooldownTicks = kineticTag.getInt("contact_cooldown_ticks");
            int delayTicks = kineticTag.getInt("delay_ticks");
            KineticWeapon.Condition damageConditions = this.loadDamageCondition(kineticTag, "damage_conditions");
            KineticWeapon.Condition dismountConditions = this.loadDamageCondition(kineticTag, "dismount_conditions");
            KineticWeapon.Condition knockbackConditions = this.loadDamageCondition(kineticTag, "knockback_conditions");
            float forwardMovement = kineticTag.getFloat("forward_movement");
            float damageMultiplier = kineticTag.getFloat("damage_multiplier");
            Holder sound = kineticTag.contains("sound") ? this.restoreSoundEventHolder(kineticTag, "sound") : null;
            Holder hitSound = kineticTag.contains("hit_sound") ? this.restoreSoundEventHolder(kineticTag, "hit_sound") : null;
            container.set(StructuredDataKey.KINETIC_WEAPON, (Object)new KineticWeapon(contactCooldownTicks, delayTicks, damageConditions, dismountConditions, knockbackConditions, forwardMovement, damageMultiplier, sound, hitSound));
        }
        if ((piercingTag = backupTag.getCompoundTag("piercing_weapon")) != null) {
            boolean dealsKnockback = piercingTag.getBoolean("deals_knockback");
            boolean dismounts = piercingTag.getBoolean("dismounts");
            Holder sound = piercingTag.contains("sound") ? this.restoreSoundEventHolder(piercingTag, "sound") : null;
            Holder hitSound = piercingTag.contains("hit_sound") ? this.restoreSoundEventHolder(piercingTag, "hit_sound") : null;
            container.set(StructuredDataKey.PIERCING_WEAPON, (Object)new PiercingWeapon(dealsKnockback, dismounts, sound, hitSound));
        }
        if ((damageTypeId = backupTag.get("damage_type_id")) != null) {
            if (damageTypeId instanceof StringTag) {
                StringTag stringTag = (StringTag)damageTypeId;
                container.set(StructuredDataKey.DAMAGE_TYPE1_21_11, (Object)new DamageType(Either.right((Object)stringTag.getValue())));
            } else if (damageTypeId instanceof IntTag) {
                IntTag intTag = (IntTag)damageTypeId;
                container.set(StructuredDataKey.DAMAGE_TYPE1_21_11, (Object)new DamageType(Either.left((Object)intTag.asInt())));
            }
        }
        if ((useEffectsTag = backupTag.getCompoundTag("use_effects")) != null) {
            boolean canSprint = useEffectsTag.getBoolean("can_sprint");
            boolean interactVibrations = useEffectsTag.getBoolean("interact_vibrations");
            float speedMultiplier = useEffectsTag.getFloat("speed_multiplier");
            container.set(StructuredDataKey.USE_EFFECTS, (Object)new UseEffects(canSprint, interactVibrations, speedMultiplier));
        }
        if ((attackRangeTag = backupTag.getCompoundTag("attack_range")) != null) {
            float minRange = attackRangeTag.getFloat("min_range");
            float maxRange = attackRangeTag.getFloat("max_range");
            float minCreativeRange = attackRangeTag.getFloat("min_creative_reach");
            float maxCreativeRange = attackRangeTag.getFloat("max_creative_reach");
            float hitboxMargin = attackRangeTag.getFloat("hitbox_margin");
            float mobFactor = attackRangeTag.getFloat("mob_factor");
            container.set(StructuredDataKey.ATTACK_RANGE, (Object)new AttackRange(minRange, maxRange, minCreativeRange, maxCreativeRange, hitboxMargin, mobFactor));
        }
        if ((zombieNautilusVariantTag = backupTag.get("zombie_nautilus_variant")) != null) {
            if (zombieNautilusVariantTag instanceof StringTag) {
                StringTag stringTag = (StringTag)zombieNautilusVariantTag;
                container.set(StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT1_21_11, (Object)Either.right((Object)stringTag.getValue()));
            } else if (zombieNautilusVariantTag instanceof IntTag) {
                IntTag intTag = (IntTag)zombieNautilusVariantTag;
                container.set(StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT1_21_11, (Object)Either.left((Object)intTag.asInt()));
            }
        }
        this.restoreFloatData(StructuredDataKey.MINIMUM_ATTACK_CHARGE, container, backupTag);
    }

    public void registerPackets() {
        ((Protocol1_21_11To1_21_9)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_11.SET_BORDER_LERP_SIZE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write((Type)Types.VAR_LONG, (Object)((Long)wrapper.read((Type)Types.VAR_LONG) * 50L));
        });
        ((Protocol1_21_11To1_21_9)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_11.INITIALIZE_BORDER, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write((Type)Types.VAR_LONG, (Object)((Long)wrapper.read((Type)Types.VAR_LONG) * 50L));
        });
        ((Protocol1_21_11To1_21_9)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_11.SET_TIME, wrapper -> {
            long gameTime = (Long)wrapper.passthrough((Type)Types.LONG);
            ((GameTimeStorage)wrapper.user().get(GameTimeStorage.class)).setGameTime(gameTime);
        });
        ((Protocol1_21_11To1_21_9)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_6.CLIENT_TICK_END, wrapper -> ((GameTimeStorage)wrapper.user().get(GameTimeStorage.class)).incrementGameTime());
    }
}


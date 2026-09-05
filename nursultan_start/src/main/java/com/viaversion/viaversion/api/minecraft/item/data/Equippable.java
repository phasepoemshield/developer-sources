/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData$MappingType
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.RegistryKey
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.HolderSetType
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.EnumTypes;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderSetType;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public record Equippable(int equipmentSlot, Holder<SoundEvent> soundEvent, @Nullable String model, @Nullable String cameraOverlay, @Nullable HolderSet allowedEntities, boolean dispensable, boolean swappable, boolean damageOnHurt, boolean equipOnInteract, boolean canBeSheared, Holder<SoundEvent> shearingSound) implements Rewritable
{
    public static final Type<Equippable> TYPE1_21_2 = new Type<Equippable>(Equippable.class){

        public void write(ByteBuf buffer, Equippable value) {
            Types.VAR_INT.writePrimitive(buffer, value.equipmentSlot());
            Types.SOUND_EVENT.write(buffer, value.soundEvent());
            Types.OPTIONAL_STRING.write(buffer, (Object)value.model());
            Types.OPTIONAL_STRING.write(buffer, (Object)value.cameraOverlay());
            Types.OPTIONAL_HOLDER_SET.write(buffer, (Object)value.allowedEntities());
            buffer.writeBoolean(value.dispensable());
            buffer.writeBoolean(value.swappable());
            buffer.writeBoolean(value.damageOnHurt());
        }

        public Equippable read(ByteBuf buffer) {
            int equipmentSlot = Types.VAR_INT.readPrimitive(buffer);
            Holder soundEvent = Types.SOUND_EVENT.read(buffer);
            String model = (String)Types.OPTIONAL_STRING.read(buffer);
            String cameraOverlay = (String)Types.OPTIONAL_STRING.read(buffer);
            HolderSet allowedEntities = (HolderSet)Types.OPTIONAL_HOLDER_SET.read(buffer);
            boolean dispensable = buffer.readBoolean();
            boolean swappable = buffer.readBoolean();
            boolean damageOnHurt = buffer.readBoolean();
            return new Equippable(equipmentSlot, (Holder<SoundEvent>)soundEvent, model, cameraOverlay, allowedEntities, dispensable, swappable, damageOnHurt);
        }
    };
    public static final Type<Equippable> TYPE1_21_5 = new Type<Equippable>(Equippable.class){

        public void write(Ops ops, Equippable value) {
            Holder defaultEquipSound = Holder.of((int)ops.context().registryAccess().id(MappingData.MappingType.SOUND, "item.armor.equip_generic"));
            ops.writeMap(map -> map.write("slot", (Type)EnumTypes.EQUIPMENT_SLOT, (Object)value.equipmentSlot).writeOptional("equip_sound", (Type)Types.SOUND_EVENT, value.soundEvent, (Object)defaultEquipSound).writeOptional("asset_id", Types.IDENTIFIER, value.model != null ? Key.of((String)value.model) : null).writeOptional("camera_overlay", Types.IDENTIFIER, value.cameraOverlay != null ? Key.of((String)value.cameraOverlay) : null).writeOptional("allowed_entities", (Type)new HolderSetType((RegistryKey)MappingData.MappingType.ENTITY_TYPE), (Object)value.allowedEntities).writeOptional("dispensable", (Type)Types.BOOLEAN, (Object)value.dispensable, (Object)true).writeOptional("swappable", (Type)Types.BOOLEAN, (Object)value.swappable, (Object)true).writeOptional("damage_on_hurt", (Type)Types.BOOLEAN, (Object)value.damageOnHurt, (Object)true).writeOptional("equip_on_interact", (Type)Types.BOOLEAN, (Object)value.equipOnInteract, (Object)false));
        }

        public void write(ByteBuf buffer, Equippable value) {
            Types.VAR_INT.writePrimitive(buffer, value.equipmentSlot());
            Types.SOUND_EVENT.write(buffer, value.soundEvent());
            Types.OPTIONAL_STRING.write(buffer, (Object)value.model());
            Types.OPTIONAL_STRING.write(buffer, (Object)value.cameraOverlay());
            Types.OPTIONAL_HOLDER_SET.write(buffer, (Object)value.allowedEntities());
            buffer.writeBoolean(value.dispensable());
            buffer.writeBoolean(value.swappable());
            buffer.writeBoolean(value.damageOnHurt());
            buffer.writeBoolean(value.equipOnInteract());
        }

        public Equippable read(ByteBuf buffer) {
            int equipmentSlot = Types.VAR_INT.readPrimitive(buffer);
            Holder soundEvent = Types.SOUND_EVENT.read(buffer);
            String model = (String)Types.OPTIONAL_STRING.read(buffer);
            String cameraOverlay = (String)Types.OPTIONAL_STRING.read(buffer);
            HolderSet allowedEntities = (HolderSet)Types.OPTIONAL_HOLDER_SET.read(buffer);
            boolean dispensable = buffer.readBoolean();
            boolean swappable = buffer.readBoolean();
            boolean damageOnHurt = buffer.readBoolean();
            boolean equipOnInteract = buffer.readBoolean();
            return new Equippable(equipmentSlot, (Holder<SoundEvent>)soundEvent, model, cameraOverlay, allowedEntities, dispensable, swappable, damageOnHurt, equipOnInteract);
        }
    };
    public static final Type<Equippable> TYPE1_21_6 = new Type<Equippable>(Equippable.class){

        public void write(Ops ops, Equippable value) {
            Holder defaultSound = Holder.of((int)ops.context().registryAccess().id(MappingData.MappingType.SOUND, "item.armor.equip_generic"));
            Holder defaultShearingSound = Holder.of((int)ops.context().registryAccess().id(MappingData.MappingType.SOUND, "item.shears.snip"));
            ops.writeMap(map -> map.write("slot", (Type)EnumTypes.EQUIPMENT_SLOT, (Object)value.equipmentSlot).writeOptional("equip_sound", (Type)Types.SOUND_EVENT, value.soundEvent, (Object)defaultSound).writeOptional("asset_id", Types.IDENTIFIER, value.model != null ? Key.of((String)value.model) : null).writeOptional("camera_overlay", Types.IDENTIFIER, value.cameraOverlay != null ? Key.of((String)value.cameraOverlay) : null).writeOptional("allowed_entities", (Type)new HolderSetType((RegistryKey)MappingData.MappingType.ENTITY_TYPE), (Object)value.allowedEntities).writeOptional("dispensable", (Type)Types.BOOLEAN, (Object)value.dispensable, (Object)true).writeOptional("swappable", (Type)Types.BOOLEAN, (Object)value.swappable, (Object)true).writeOptional("damage_on_hurt", (Type)Types.BOOLEAN, (Object)value.damageOnHurt, (Object)true).writeOptional("equip_on_interact", (Type)Types.BOOLEAN, (Object)value.equipOnInteract, (Object)false).writeOptional("can_be_sheared", (Type)Types.BOOLEAN, (Object)value.canBeSheared, (Object)false).writeOptional("shearing_sound", (Type)Types.SOUND_EVENT, value.shearingSound, (Object)defaultShearingSound));
        }

        public void write(ByteBuf buffer, Equippable value) {
            Types.VAR_INT.writePrimitive(buffer, value.equipmentSlot());
            Types.SOUND_EVENT.write(buffer, value.soundEvent());
            Types.OPTIONAL_STRING.write(buffer, (Object)value.model());
            Types.OPTIONAL_STRING.write(buffer, (Object)value.cameraOverlay());
            Types.OPTIONAL_HOLDER_SET.write(buffer, (Object)value.allowedEntities());
            buffer.writeBoolean(value.dispensable());
            buffer.writeBoolean(value.swappable());
            buffer.writeBoolean(value.damageOnHurt());
            buffer.writeBoolean(value.equipOnInteract());
            buffer.writeBoolean(value.canBeSheared());
            Types.SOUND_EVENT.write(buffer, value.shearingSound());
        }

        public Equippable read(ByteBuf buffer) {
            int equipmentSlot = Types.VAR_INT.readPrimitive(buffer);
            Holder soundEvent = Types.SOUND_EVENT.read(buffer);
            String model = (String)Types.OPTIONAL_STRING.read(buffer);
            String cameraOverlay = (String)Types.OPTIONAL_STRING.read(buffer);
            HolderSet allowedEntities = (HolderSet)Types.OPTIONAL_HOLDER_SET.read(buffer);
            boolean dispensable = buffer.readBoolean();
            boolean swappable = buffer.readBoolean();
            boolean damageOnHurt = buffer.readBoolean();
            boolean equipOnInteract = buffer.readBoolean();
            boolean canBeSheared = buffer.readBoolean();
            Holder shearingSound = Types.SOUND_EVENT.read(buffer);
            return new Equippable(equipmentSlot, (Holder<SoundEvent>)soundEvent, model, cameraOverlay, allowedEntities, dispensable, swappable, damageOnHurt, equipOnInteract, canBeSheared, (Holder<SoundEvent>)shearingSound);
        }
    };

    public Equippable(int equipmentSlot, Holder<SoundEvent> soundEvent, @Nullable String model, @Nullable String cameraOverlay, @Nullable HolderSet allowedEntities, boolean dispensable, boolean swappable, boolean damageOnHurt) {
        this(equipmentSlot, soundEvent, model, cameraOverlay, allowedEntities, dispensable, swappable, damageOnHurt, true);
    }

    public Equippable(int equipmentSlot, Holder<SoundEvent> soundEvent, @Nullable String model, @Nullable String cameraOverlay, @Nullable HolderSet allowedEntities, boolean dispensable, boolean swappable, boolean damageOnHurt, boolean equipOnInteract) {
        this(equipmentSlot, soundEvent, model, cameraOverlay, allowedEntities, dispensable, swappable, damageOnHurt, equipOnInteract, false, (Holder<SoundEvent>)Holder.of((int)0));
    }

    public Equippable rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        Holder soundEvent = SoundEvent.rewriteHolder(this.soundEvent, (Int2IntFunction)Rewritable.soundRewriteFunction(protocol, (boolean)clientbound));
        Holder shearingSound = SoundEvent.rewriteHolder(this.shearingSound, (Int2IntFunction)Rewritable.soundRewriteFunction(protocol, (boolean)clientbound));
        HolderSet allowedEntities = this.allowedEntities != null ? this.allowedEntities.rewrite(Rewritable.entityRewriteFunction(protocol, (boolean)clientbound)) : null;
        return soundEvent == this.soundEvent && shearingSound == this.shearingSound && allowedEntities == this.allowedEntities ? this : new Equippable(this.equipmentSlot, (Holder<SoundEvent>)soundEvent, this.model, this.cameraOverlay, allowedEntities, this.dispensable, this.swappable, this.damageOnHurt, this.equipOnInteract, this.canBeSheared, (Holder<SoundEvent>)shearingSound);
    }
}


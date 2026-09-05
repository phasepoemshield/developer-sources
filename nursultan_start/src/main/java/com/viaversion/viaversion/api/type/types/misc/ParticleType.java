/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.Particle$ParticleData
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.DynamicType;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;

public class ParticleType
extends DynamicType<Particle> {
    public ParticleType() {
        super(Particle.class);
    }

    public void write(ByteBuf buffer, Particle object) {
        Types.VAR_INT.writePrimitive(buffer, object.id());
        for (Particle.ParticleData data : object.getArguments()) {
            data.write(buffer);
        }
    }

    public Particle read(ByteBuf buffer) {
        int type = Types.VAR_INT.readPrimitive(buffer);
        Particle particle = new Particle(type);
        this.readData(buffer, particle);
        return particle;
    }

    @Override
    protected FullMappings mappings(Protocol<?, ?, ?, ?> protocol) {
        return protocol.getMappingData().getParticleMappings();
    }

    public static final class Fillers {
        public static void fill1_21_9(Protocol<?, ?, ?, ?> protocol) {
            Fillers.fill1_21_5(protocol).reader("dragon_breath", Readers.POWER).reader("effect", Readers.SPELL).reader("instant_effect", Readers.SPELL).reader("flash", Readers.COLOR);
        }

        public static DynamicType.DataFiller fill1_17(Protocol<?, ?, ?, ?> protocol, ParticleType type) {
            return Fillers.fill1_13_2(protocol, type, true).reader("dust_color_transition", Readers.DUST_TRANSITION).reader("vibration", Readers.VIBRATION);
        }

        public static DynamicType.DataFiller fill1_13_2(Protocol<?, ?, ?, ?> protocol, ParticleType type, boolean useMappedNames) {
            return type.filler(protocol, useMappedNames).reader("item", Readers.item((Type<Item>)protocol.getItemRewriter().mappedItemType())).reader("block", Readers.BLOCK).reader("dust", Readers.DUST).reader("falling_dust", Readers.BLOCK);
        }

        public static DynamicType.DataFiller fill1_20_3(Protocol<?, ?, ?, ?> protocol, ParticleType type) {
            return type.filler(protocol).reader("item", Readers.item((Type<Item>)protocol.getItemRewriter().mappedItemType())).reader("block", Readers.BLOCK).reader("block_marker", Readers.BLOCK).reader("dust", Readers.DUST).reader("falling_dust", Readers.BLOCK).reader("dust_color_transition", Readers.DUST_TRANSITION).reader("vibration", Readers.VIBRATION1_20_3).reader("sculk_charge", Readers.SCULK_CHARGE).reader("shriek", Readers.SHRIEK);
        }

        public static DynamicType.DataFiller fill1_21_4(Protocol<?, ?, ?, ?> protocol) {
            return protocol.mappedTypes().particle().filler(protocol).reader("item", Readers.item((Type<Item>)protocol.getItemRewriter().mappedItemTemplateType())).reader("block", Readers.BLOCK).reader("block_marker", Readers.BLOCK).reader("dust_pillar", Readers.BLOCK).reader("falling_dust", Readers.BLOCK).reader("block_crumble", Readers.BLOCK).reader("dust", Readers.DUST1_21_2).reader("dust_color_transition", Readers.DUST_TRANSITION1_21_2).reader("vibration", Readers.VIBRATION1_20_3).reader("sculk_charge", Readers.SCULK_CHARGE).reader("shriek", Readers.SHRIEK).reader("entity_effect", Readers.COLOR).reader("trail", Readers.TRAIL1_21_4);
        }

        public static DynamicType.DataFiller fill1_21_5(Protocol<?, ?, ?, ?> protocol) {
            return Fillers.fill1_21_4(protocol).reader("tinted_leaves", Readers.COLOR);
        }

        public static void fill1_20_5(Protocol<?, ?, ?, ?> protocol, ParticleType type) {
            Fillers.fill1_20_3(protocol, type).reader("dust_pillar", Readers.BLOCK).reader("entity_effect", Readers.COLOR);
        }

        public static void fill1_18(Protocol<?, ?, ?, ?> protocol, ParticleType type) {
            Fillers.fill1_17(protocol, type).reader("block_marker", Readers.BLOCK);
        }

        public static void fill1_21_2(Protocol<?, ?, ?, ?> protocol) {
            protocol.mappedTypes().particle().filler(protocol).reader("item", Readers.item((Type<Item>)protocol.getItemRewriter().mappedItemType())).reader("block", Readers.BLOCK).reader("block_marker", Readers.BLOCK).reader("dust_pillar", Readers.BLOCK).reader("falling_dust", Readers.BLOCK).reader("block_crumble", Readers.BLOCK).reader("dust", Readers.DUST1_21_2).reader("dust_color_transition", Readers.DUST_TRANSITION1_21_2).reader("vibration", Readers.VIBRATION1_20_3).reader("sculk_charge", Readers.SCULK_CHARGE).reader("shriek", Readers.SHRIEK).reader("entity_effect", Readers.COLOR).reader("trail", Readers.TRAIL1_21_2);
        }

        public static void fill1_19(Protocol<?, ?, ?, ?> protocol, ParticleType type) {
            type.filler(protocol).reader("item", Readers.item((Type<Item>)protocol.getItemRewriter().mappedItemType())).reader("block", Readers.BLOCK).reader("block_marker", Readers.BLOCK).reader("dust", Readers.DUST).reader("falling_dust", Readers.BLOCK).reader("dust_color_transition", Readers.DUST_TRANSITION).reader("vibration", Readers.VIBRATION1_19).reader("sculk_charge", Readers.SCULK_CHARGE).reader("shriek", Readers.SHRIEK);
        }
    }

    public static final class Readers {
        public static final DynamicType.DataReader<Particle> BLOCK = (buf, particle) -> particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
        public static final DynamicType.DataReader<Particle> ITEM1_13 = Readers.item((Type<Item>)Types.ITEM1_13);
        public static final DynamicType.DataReader<Particle> ITEM1_13_2 = Readers.item((Type<Item>)Types.ITEM1_13_2);
        public static final DynamicType.DataReader<Particle> DUST = (buf, particle) -> {
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
        };
        public static final DynamicType.DataReader<Particle> DUST1_21_2 = (buf, particle) -> {
            particle.add((Type)Types.INT, (Object)Types.INT.readPrimitive(buf));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
        };
        public static final DynamicType.DataReader<Particle> DUST_TRANSITION = (buf, particle) -> {
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
        };
        public static final DynamicType.DataReader<Particle> DUST_TRANSITION1_21_2 = (buf, particle) -> {
            particle.add((Type)Types.INT, (Object)Types.INT.readPrimitive(buf));
            particle.add((Type)Types.INT, (Object)Types.INT.readPrimitive(buf));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
        };
        public static final DynamicType.DataReader<Particle> VIBRATION = (buf, particle) -> {
            particle.add(Types.BLOCK_POSITION1_14, (Object)((BlockPosition)Types.BLOCK_POSITION1_14.read(buf)));
            String identifier = (String)Types.STRING.read(buf);
            particle.add(Types.STRING, (Object)identifier);
            identifier = Key.stripMinecraftNamespace((String)identifier);
            if (identifier.equals("block")) {
                particle.add(Types.BLOCK_POSITION1_14, (Object)((BlockPosition)Types.BLOCK_POSITION1_14.read(buf)));
            } else if (identifier.equals("entity")) {
                particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
            } else {
                Via.getPlatform().getLogger().warning("Unknown vibration path position source type: " + identifier);
            }
            particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
        };
        public static final DynamicType.DataReader<Particle> VIBRATION1_19 = (buf, particle) -> {
            String identifier = (String)Types.STRING.read(buf);
            particle.add(Types.STRING, (Object)identifier);
            identifier = Key.stripMinecraftNamespace((String)identifier);
            if (identifier.equals("block")) {
                particle.add(Types.BLOCK_POSITION1_14, (Object)((BlockPosition)Types.BLOCK_POSITION1_14.read(buf)));
            } else if (identifier.equals("entity")) {
                particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
                particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            } else {
                Via.getPlatform().getLogger().warning("Unknown vibration path position source type: " + identifier);
            }
            particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
        };
        public static final DynamicType.DataReader<Particle> VIBRATION1_20_3 = (buf, particle) -> {
            int sourceTypeId = Types.VAR_INT.readPrimitive(buf);
            particle.add((Type)Types.VAR_INT, (Object)sourceTypeId);
            if (sourceTypeId == 0) {
                particle.add(Types.BLOCK_POSITION1_14, (Object)((BlockPosition)Types.BLOCK_POSITION1_14.read(buf)));
            } else if (sourceTypeId == 1) {
                particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
                particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
            } else {
                Via.getPlatform().getLogger().warning("Unknown vibration path position source type: " + sourceTypeId);
            }
            particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
        };
        public static final DynamicType.DataReader<Particle> SCULK_CHARGE = (buf, particle) -> particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
        public static final DynamicType.DataReader<Particle> SHRIEK = (buf, particle) -> particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
        public static final DynamicType.DataReader<Particle> COLOR = (buf, particle) -> particle.add((Type)Types.INT, (Object)Types.INT.readPrimitive(buf));
        public static final DynamicType.DataReader<Particle> TRAIL1_21_2 = (buf, particle) -> {
            particle.add((Type)Types.DOUBLE, (Object)Types.DOUBLE.readPrimitive(buf));
            particle.add((Type)Types.DOUBLE, (Object)Types.DOUBLE.readPrimitive(buf));
            particle.add((Type)Types.DOUBLE, (Object)Types.DOUBLE.readPrimitive(buf));
            particle.add((Type)Types.INT, (Object)Types.INT.readPrimitive(buf));
        };
        public static final DynamicType.DataReader<Particle> TRAIL1_21_4 = (buf, particle) -> {
            particle.add((Type)Types.DOUBLE, (Object)Types.DOUBLE.readPrimitive(buf));
            particle.add((Type)Types.DOUBLE, (Object)Types.DOUBLE.readPrimitive(buf));
            particle.add((Type)Types.DOUBLE, (Object)Types.DOUBLE.readPrimitive(buf));
            particle.add((Type)Types.INT, (Object)Types.INT.readPrimitive(buf));
            particle.add((Type)Types.VAR_INT, (Object)Types.VAR_INT.readPrimitive(buf));
        };
        public static final DynamicType.DataReader<Particle> POWER = (buf, particle) -> particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
        public static final DynamicType.DataReader<Particle> SPELL = (buf, particle) -> {
            particle.add((Type)Types.INT, (Object)Types.INT.readPrimitive(buf));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(Types.FLOAT.readPrimitive(buf)));
        };

        public static DynamicType.DataReader<Particle> item(Type<Item> item) {
            return (buf, particle) -> particle.add(item, (Object)((Item)item.read(buf)));
        }
    }
}


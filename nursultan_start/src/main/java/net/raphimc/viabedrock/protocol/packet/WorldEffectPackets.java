/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.util.Key
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.model.entity.Entity
 *  net.raphimc.viabedrock.api.resourcepack.definition.TextDefinitions
 *  net.raphimc.viabedrock.api.util.MathUtil
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.api.util.TextUtil
 *  net.raphimc.viabedrock.protocol.data.BedrockMappingData$JavaSoundLevelEvent
 *  net.raphimc.viabedrock.protocol.data.enums.Dimension
 *  net.raphimc.viabedrock.protocol.data.enums.Direction
 *  net.raphimc.viabedrock.protocol.data.enums.java.GameEventType
 *  net.raphimc.viabedrock.protocol.data.enums.java.PositionSourceType
 *  net.raphimc.viabedrock.protocol.model.BedrockItem
 *  net.raphimc.viabedrock.protocol.packet.WorldEffectPackets$1
 *  net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter
 *  net.raphimc.viabedrock.protocol.rewriter.ItemRewriter
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.util.Key;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.model.BlockState;
import net.raphimc.viabedrock.api.model.entity.Entity;
import net.raphimc.viabedrock.api.resourcepack.definition.SoundDefinitions;
import net.raphimc.viabedrock.api.resourcepack.definition.TextDefinitions;
import net.raphimc.viabedrock.api.util.EnumUtil;
import net.raphimc.viabedrock.api.util.MathUtil;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.api.util.TextUtil;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.BedrockMappingData;
import net.raphimc.viabedrock.protocol.data.enums.Dimension;
import net.raphimc.viabedrock.protocol.data.enums.Direction;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.NoteBlockInstrument;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ParticleType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SharedTypes_Legacy_LevelSoundEvent;
import net.raphimc.viabedrock.protocol.data.enums.java.GameEventType;
import net.raphimc.viabedrock.protocol.data.enums.java.LevelEvent;
import net.raphimc.viabedrock.protocol.data.enums.java.PositionSourceType;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.SoundSource;
import net.raphimc.viabedrock.protocol.model.BedrockItem;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.packet.WorldEffectPackets;
import net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter;
import net.raphimc.viabedrock.protocol.rewriter.ItemRewriter;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.ResourcePackStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class WorldEffectPackets {
    private static final boolean LEVEL_SOUND_DEBUG_LOG = false;

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.PLAY_SOUND, (ClientboundPacketType)ClientboundPackets26_1.SOUND, wrapper -> {
            String name = (String)wrapper.read(BedrockTypes.STRING);
            BlockPosition position = (BlockPosition)wrapper.read(BedrockTypes.BLOCK_POSITION);
            float volume = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
            float pitch = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
            BedrockMappingData.JavaSound javaSound = BedrockProtocol.MAPPINGS.getBedrockToJavaSounds().get(name);
            if (javaSound == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown bedrock sound: " + name);
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.SOUND_EVENT, (Object)Holder.of((int)javaSound.id()));
            wrapper.write((Type)Types.VAR_INT, (Object)javaSound.category().ordinal());
            wrapper.write((Type)Types.INT, (Object)position.x());
            wrapper.write((Type)Types.INT, (Object)position.y());
            wrapper.write((Type)Types.INT, (Object)position.z());
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(volume));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(pitch));
            wrapper.write((Type)Types.LONG, (Object)ThreadLocalRandom.current().nextLong());
        });
        protocol.registerClientbound(ClientboundBedrockPackets.STOP_SOUND, (ClientboundPacketType)ClientboundPackets26_1.STOP_SOUND, wrapper -> {
            String name = (String)wrapper.read(BedrockTypes.STRING);
            boolean stopAll = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            if (stopAll) {
                wrapper.write((Type)Types.BYTE, (Object)0);
            } else {
                BedrockMappingData.JavaSound javaSound = BedrockProtocol.MAPPINGS.getBedrockToJavaSounds().get(name);
                if (javaSound == null) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown bedrock sound: " + name);
                    wrapper.cancel();
                    return;
                }
                wrapper.write((Type)Types.BYTE, (Object)2);
                wrapper.write(Types.STRING, (Object)javaSound.identifier());
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SPAWN_PARTICLE_EFFECT, (ClientboundPacketType)ClientboundPackets26_1.LEVEL_PARTICLES, wrapper -> {
            BedrockMappingData.JavaParticle javaParticle;
            Dimension dimension = Dimension.getByValue((int)((Byte)wrapper.read((Type)Types.BYTE)).byteValue());
            if (dimension != ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).getDimension()) {
                wrapper.cancel();
                return;
            }
            wrapper.read((Type)BedrockTypes.VAR_LONG);
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            String effectIdentifier = (String)wrapper.read(BedrockTypes.STRING);
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.read(BedrockTypes.STRING);
            }
            if ((javaParticle = BedrockProtocol.MAPPINGS.getBedrockToJavaParticles().get(effectIdentifier)) == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown bedrock particle: " + effectIdentifier);
                wrapper.cancel();
                return;
            }
            PacketFactory.writeJavaLevelParticles((PacketWrapper)wrapper, (Position3f)position, (BedrockMappingData.JavaParticle)(switch (effectIdentifier) {
                case "minecraft:eyeblossom_close", "minecraft:eyeblossom_open" -> {
                    Particle particle = javaParticle.particle().copy();
                    particle.set(0, (Type)Types.DOUBLE, (Object)((double)position.x() + (double)ThreadLocalRandom.current().nextFloat() - 0.5));
                    particle.set(1, (Type)Types.DOUBLE, (Object)((double)position.y() + (double)ThreadLocalRandom.current().nextFloat() + 1.5));
                    particle.set(2, (Type)Types.DOUBLE, (Object)((double)position.z() + (double)ThreadLocalRandom.current().nextFloat() - 0.5));
                    yield javaParticle.withParticle(particle);
                }
                default -> javaParticle;
            }));
        });
        protocol.registerClientbound(ClientboundBedrockPackets.LEVEL_SOUND_EVENT, (ClientboundPacketType)ClientboundPackets26_1.SOUND, wrapper -> {
            SoundDefinitions.ConfiguredSound configuredSound;
            int rawSoundEvent = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            SharedTypes_Legacy_LevelSoundEvent soundEvent = SharedTypes_Legacy_LevelSoundEvent.getByValue(rawSoundEvent);
            if (soundEvent == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown SharedTypes_Legacy_LevelSoundEvent: " + rawSoundEvent);
                wrapper.cancel();
                return;
            }
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            int data = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            String entityIdentifier = (String)wrapper.read(BedrockTypes.STRING);
            boolean isBabyMob = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            boolean isGlobal = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)BedrockTypes.LONG_LE);
            boolean globalSound = isGlobal || Float.isNaN(position.x()) || Float.isNaN(position.y()) || Float.isNaN(position.z());
            switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$SharedTypes_Legacy_LevelSoundEvent[soundEvent.ordinal()]) {
                case 9: {
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.STOP_SOUND);
                    wrapper.write((Type)Types.BYTE, (Object)1);
                    wrapper.write((Type)Types.VAR_INT, (Object)SoundSource.RECORDS.ordinal());
                    return;
                }
                case 10: {
                    NoteBlockInstrument noteBlockInstrument = NoteBlockInstrument.getByValue(data >> 8, NoteBlockInstrument.Harp);
                    String noteBlockSound = BedrockProtocol.MAPPINGS.getBedrockNoteBlockInstrumentSounds().get((Object)noteBlockInstrument);
                    int key = data & 0xFF;
                    float pitch = (float)Math.pow(2.0, (double)(key - 12) / 12.0);
                    configuredSound = new SoundDefinitions.ConfiguredSound(noteBlockSound, 1.0f, 1.0f, pitch, pitch);
                    break;
                }
                default: {
                    configuredSound = WorldEffectPackets.tryFindSound(wrapper.user(), soundEvent, data, entityIdentifier, isBabyMob);
                    if (configuredSound == null) {
                        switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$SharedTypes_Legacy_LevelSoundEvent[soundEvent.ordinal()]) {
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: {
                                SharedTypes_Legacy_LevelSoundEvent soundEventAdult = EnumUtil.getEnumConstantOrNull(SharedTypes_Legacy_LevelSoundEvent.class, soundEvent.name().replace("Baby", ""));
                                configuredSound = WorldEffectPackets.tryFindSound(wrapper.user(), soundEventAdult, data, entityIdentifier, true);
                                break;
                            }
                            case 7: 
                            case 8: {
                                configuredSound = WorldEffectPackets.tryFindSound(wrapper.user(), SharedTypes_Legacy_LevelSoundEvent.Ambient, data, entityIdentifier, isBabyMob);
                            }
                        }
                    }
                    if (configuredSound != null) break;
                    wrapper.cancel();
                    return;
                }
            }
            BedrockMappingData.JavaSound javaSound = BedrockProtocol.MAPPINGS.getBedrockToJavaSounds().get(configuredSound.sound());
            if (javaSound == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown bedrock sound: " + configuredSound.sound());
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.SOUND_EVENT, (Object)Holder.of((int)javaSound.id()));
            wrapper.write((Type)Types.VAR_INT, (Object)javaSound.category().ordinal());
            wrapper.write((Type)Types.INT, (Object)((int)(position.x() * 8.0f)));
            wrapper.write((Type)Types.INT, (Object)((int)(position.y() * 8.0f)));
            wrapper.write((Type)Types.INT, (Object)((int)(position.z() * 8.0f)));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(globalSound ? 2.14748365E9f : MathUtil.randomFloatInclusive((float)configuredSound.minVolume(), (float)configuredSound.maxVolume())));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(MathUtil.randomFloatInclusive((float)configuredSound.minPitch(), (float)configuredSound.maxPitch())));
            wrapper.write((Type)Types.LONG, (Object)ThreadLocalRandom.current().nextLong());
        });
        protocol.registerClientbound(ClientboundBedrockPackets.LEVEL_EVENT, (ClientboundPacketType)ClientboundPackets26_1.LEVEL_EVENT, wrapper -> {
            int rawLevelEvent = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            int data = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            if ((rawLevelEvent & net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.ParticleLegacyEvent.getValue()) != 0 || rawLevelEvent == net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.ParticleGenericSpawn.getValue()) {
                BedrockMappingData.JavaParticle javaParticle;
                wrapper.setPacketType((PacketType)ClientboundPackets26_1.LEVEL_PARTICLES);
                int rawParticleType = rawLevelEvent == net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.ParticleGenericSpawn.getValue() ? data : rawLevelEvent & ~net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.ParticleLegacyEvent.getValue();
                ParticleType particleType = ParticleType.getByValue(rawParticleType);
                if (particleType == null) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown particle type: " + rawParticleType);
                    wrapper.cancel();
                    return;
                }
                if (rawLevelEvent == net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.ParticleGenericSpawn.getValue()) {
                    data = 0;
                }
                if ((javaParticle = BedrockProtocol.MAPPINGS.getBedrockToJavaLevelEventParticles().get((Object)particleType)) != null) {
                    PacketFactory.writeJavaLevelParticles((PacketWrapper)wrapper, (Position3f)position, (BedrockMappingData.JavaParticle)(switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$ParticleType[particleType.ordinal()]) {
                        case 1, 2 -> {
                            BedrockItem bedrockItem = new BedrockItem(data >> 16, (short)(data & 0xFFFF), 1);
                            Particle particle = new Particle(javaParticle.particle().id());
                            particle.add(VersionedTypes.V26_1.item, (Object)((ItemRewriter)wrapper.user().get(ItemRewriter.class)).javaItem(bedrockItem));
                            yield javaParticle.withParticle(particle);
                        }
                        case 3, 4 -> {
                            int javaBlockState = ((BlockStateRewriter)wrapper.user().get(BlockStateRewriter.class)).javaId(data);
                            if (javaBlockState != -1) {
                                Particle particle = new Particle(javaParticle.particle().id());
                                particle.add((Type)Types.VAR_INT, (Object)javaBlockState);
                                yield javaParticle.withParticle(particle);
                            }
                            ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing block state: " + data);
                            wrapper.cancel();
                            yield javaParticle;
                        }
                        case 5 -> {
                            Particle particle = new Particle(javaParticle.particle().id());
                            particle.add((Type)Types.INT, (Object)(0xFF000000 | data));
                            particle.add((Type)Types.INT, (Object)(0xFF000000 | data));
                            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(1.0f));
                            yield javaParticle.withParticle(particle);
                        }
                        case 6, 7, 8 -> {
                            Particle particle = new Particle(javaParticle.particle().id());
                            particle.add((Type)Types.INT, (Object)(0xFF000000 | data));
                            yield javaParticle.withParticle(particle);
                        }
                        case 9, 10 -> {
                            Particle particle = javaParticle.particle().copy();
                            particle.set(0, (Type)Types.DOUBLE, (Object)((double)position.x() + (double)ThreadLocalRandom.current().nextFloat() - 0.5));
                            particle.set(1, (Type)Types.DOUBLE, (Object)((double)position.y() + (double)ThreadLocalRandom.current().nextFloat() + 1.5));
                            particle.set(2, (Type)Types.DOUBLE, (Object)((double)position.z() + (double)ThreadLocalRandom.current().nextFloat() - 0.5));
                            yield javaParticle.withParticle(particle);
                        }
                        default -> javaParticle;
                    }));
                } else {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing level event particle mapping for " + String.valueOf((Object)particleType));
                    wrapper.cancel();
                }
                return;
            }
            net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent levelEvent = net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.getByValue(rawLevelEvent);
            if (levelEvent == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown LevelEvent: " + rawLevelEvent);
                wrapper.cancel();
                return;
            }
            switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$LevelEvent[levelEvent.ordinal()]) {
                case 30: {
                    PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.GUARDIAN_ELDER_EFFECT, (float)1.0f);
                    wrapper.cancel();
                    break;
                }
                case 31: {
                    PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.START_RAINING, (float)0.0f);
                    PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.RAIN_LEVEL_CHANGE, (float)((float)data / 65535.0f));
                    wrapper.cancel();
                    break;
                }
                case 32: {
                    PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.STOP_RAINING, (float)0.0f);
                    PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.RAIN_LEVEL_CHANGE, (float)0.0f);
                    wrapper.cancel();
                    break;
                }
                case 33: {
                    PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.START_RAINING, (float)0.0f);
                    PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.THUNDER_LEVEL_CHANGE, (float)((float)data / 65535.0f));
                    wrapper.cancel();
                    break;
                }
                case 34: {
                    PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.THUNDER_LEVEL_CHANGE, (float)0.0f);
                    wrapper.cancel();
                    break;
                }
                case 35: {
                    if (data != 0) {
                        ViaBedrock.getPlatform().getLogger().log(Level.SEVERE, "Server paused the game. This is not supported by ViaBedrock.");
                    }
                    wrapper.cancel();
                    break;
                }
                case 36: {
                    ViaBedrock.getPlatform().getLogger().log(Level.SEVERE, "Server tick stepped the game. This is not supported by ViaBedrock.");
                    wrapper.cancel();
                    break;
                }
                case 37: {
                    ViaBedrock.getPlatform().getLogger().log(Level.SEVERE, "Server sped up the game. This is not supported by ViaBedrock.");
                    wrapper.cancel();
                    break;
                }
                case 38: 
                case 39: 
                case 40: {
                    wrapper.cancel();
                    break;
                }
                default: {
                    BedrockMappingData.LevelEventMapping levelEventMapping = BedrockProtocol.MAPPINGS.getBedrockToJavaLevelEvents().get((Object)levelEvent);
                    if (levelEventMapping instanceof BedrockMappingData.JavaSoundLevelEvent) {
                        BedrockMappingData.JavaSoundLevelEvent javaSoundLevelEvent = (BedrockMappingData.JavaSoundLevelEvent)levelEventMapping;
                        levelEventMapping = data == 0 ? javaSoundLevelEvent.levelEvent() : javaSoundLevelEvent.sound();
                    }
                    if (levelEventMapping instanceof BedrockMappingData.JavaLevelEvent) {
                        BedrockMappingData.JavaLevelEvent javaLevelEvent = (BedrockMappingData.JavaLevelEvent)levelEventMapping;
                        wrapper.write((Type)Types.INT, (Object)javaLevelEvent.levelEvent().getValue());
                        wrapper.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition((int)position.x(), (int)position.y(), (int)position.z()));
                        wrapper.write((Type)Types.INT, (Object)(switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$LevelEvent[levelEvent.ordinal()]) {
                            case 12, 13 -> {
                                switch (data % 9) {
                                    case 0: 
                                    case 3: {
                                        yield Direction.WEST.ordinal();
                                    }
                                    case 4: {
                                        yield Direction.UP.ordinal();
                                    }
                                    case 5: 
                                    case 8: {
                                        yield Direction.EAST.ordinal();
                                    }
                                    case 6: 
                                    case 7: {
                                        yield Direction.SOUTH.ordinal();
                                    }
                                }
                                yield Direction.NORTH.ordinal();
                            }
                            case 14, 15 -> {
                                int javaBlockState = ((BlockStateRewriter)wrapper.user().get(BlockStateRewriter.class)).javaId(data);
                                if (javaBlockState != -1) {
                                    yield javaBlockState;
                                }
                                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing block state: " + data);
                                wrapper.cancel();
                                yield 0;
                            }
                            default -> javaLevelEvent.data() != null ? javaLevelEvent.data() : data;
                        }));
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                        break;
                    }
                    if (levelEventMapping instanceof BedrockMappingData.JavaSound) {
                        BedrockMappingData.JavaSound javaSound = (BedrockMappingData.JavaSound)levelEventMapping;
                        wrapper.setPacketType((PacketType)ClientboundPackets26_1.SOUND);
                        wrapper.write((Type)Types.SOUND_EVENT, (Object)Holder.of((int)javaSound.id()));
                        wrapper.write((Type)Types.VAR_INT, (Object)javaSound.category().ordinal());
                        wrapper.write((Type)Types.INT, (Object)((int)(position.x() * 8.0f)));
                        wrapper.write((Type)Types.INT, (Object)((int)(position.y() * 8.0f)));
                        wrapper.write((Type)Types.INT, (Object)((int)(position.z() * 8.0f)));
                        wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(1.0f));
                        wrapper.write((Type)Types.FLOAT, (Object)(switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$LevelEvent[levelEvent.ordinal()]) {
                            case 16, 17, 18, 19, 20, 21 -> Float.valueOf(data > 0 && data <= 256000 ? (float)data / 1000.0f : 1.0f);
                            default -> Float.valueOf(1.0f);
                        }));
                        wrapper.write((Type)Types.LONG, (Object)ThreadLocalRandom.current().nextLong());
                        break;
                    }
                    if (levelEventMapping instanceof BedrockMappingData.JavaParticle) {
                        BedrockMappingData.JavaParticle javaParticle = (BedrockMappingData.JavaParticle)levelEventMapping;
                        wrapper.setPacketType((PacketType)ClientboundPackets26_1.LEVEL_PARTICLES);
                        PacketFactory.writeJavaLevelParticles((PacketWrapper)wrapper, (Position3f)(switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$LevelEvent[levelEvent.ordinal()]) {
                            case 22 -> new Position3f((float)MathUtil.floor((float)position.x()) + 0.5f, MathUtil.floor((float)position.y()), (float)MathUtil.floor((float)position.z()) + 0.5f);
                            case 23 -> new Position3f((float)MathUtil.floor((float)position.x()) + 0.5f, (float)MathUtil.floor((float)position.y()) + 1.0f, (float)MathUtil.floor((float)position.z()) + 0.5f);
                            case 24 -> new Position3f((float)MathUtil.floor((float)position.x()) + 0.5f, (float)MathUtil.floor((float)position.y()) + 0.5f, MathUtil.floor((float)position.z()));
                            case 25 -> new Position3f((float)MathUtil.floor((float)position.x()) + 0.5f, (float)MathUtil.floor((float)position.y()) + 0.5f, (float)MathUtil.floor((float)position.z()) + 1.0f);
                            case 26 -> new Position3f(MathUtil.floor((float)position.x()), (float)MathUtil.floor((float)position.y()) + 0.5f, (float)MathUtil.floor((float)position.z()) + 0.5f);
                            case 27 -> new Position3f((float)MathUtil.floor((float)position.x()) + 1.0f, (float)MathUtil.floor((float)position.y()) + 0.5f, (float)MathUtil.floor((float)position.z()) + 0.5f);
                            default -> position;
                        }), (BedrockMappingData.JavaParticle)(switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$LevelEvent[levelEvent.ordinal()]) {
                            case 28 -> javaParticle.withCount(data);
                            case 22, 23, 24, 25, 26, 27, 29 -> {
                                int javaBlockState = ((BlockStateRewriter)wrapper.user().get(BlockStateRewriter.class)).javaId(data);
                                if (javaBlockState != -1) {
                                    Particle particle = new Particle(javaParticle.particle().id());
                                    particle.add((Type)Types.VAR_INT, (Object)javaBlockState);
                                    yield javaParticle.withParticle(particle);
                                }
                                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing block state: " + data);
                                wrapper.cancel();
                                yield javaParticle;
                            }
                            default -> javaParticle;
                        }));
                        break;
                    }
                    if (levelEventMapping == null) {
                        ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing level event mapping for " + String.valueOf((Object)levelEvent));
                        wrapper.cancel();
                        break;
                    }
                    throw new IllegalStateException("Unknown level event mapping type: " + levelEventMapping.getClass().getName());
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.LEVEL_EVENT_GENERIC, (ClientboundPacketType)ClientboundPackets26_1.LEVEL_PARTICLES, wrapper -> {
            int rawLevelEvent = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            CompoundTag data = (CompoundTag)wrapper.read(BedrockTypes.COMPOUND_TAG_VALUE);
            net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent levelEvent = net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.getByValue(rawLevelEvent);
            if (levelEvent == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown LevelEvent: " + rawLevelEvent);
                wrapper.cancel();
                return;
            }
            switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$LevelEvent[levelEvent.ordinal()]) {
                case 1: {
                    wrapper.cancel();
                    Position3f startPosition = new Position3f(data.getFloat("Startx"), data.getFloat("Starty"), data.getFloat("Startz"));
                    Position3f endPosition = new Position3f(data.getFloat("Endx"), data.getFloat("Endy"), data.getFloat("Endz"));
                    float dirScale = data.getFloat("DirScale");
                    float variationX = data.getFloat("Variationx");
                    float variationY = data.getFloat("Variationy");
                    int count = data.getInt("Count");
                    for (int i = 0; i < count; ++i) {
                        float progress = (float)i / ((float)count - 1.0f);
                        Position3f position = new Position3f(MathUtil.lerp((float)progress, (float)startPosition.x(), (float)endPosition.x()) + (ThreadLocalRandom.current().nextFloat() - 0.5f) * variationX * 2.0f, MathUtil.lerp((float)progress, (float)startPosition.y(), (float)endPosition.y()) + (ThreadLocalRandom.current().nextFloat() - 0.5f) * variationY * 2.0f - 1.0f, MathUtil.lerp((float)progress, (float)startPosition.z(), (float)endPosition.z()) + (ThreadLocalRandom.current().nextFloat() - 0.5f) * variationX * 2.0f);
                        BedrockMappingData.JavaParticle javaParticle = new BedrockMappingData.JavaParticle(new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:portal")).intValue()), (ThreadLocalRandom.current().nextFloat() - 0.5f) * dirScale, (ThreadLocalRandom.current().nextFloat() - 0.5f) * dirScale, (ThreadLocalRandom.current().nextFloat() - 0.5f) * dirScale, 1.0f, 0);
                        PacketFactory.sendJavaLevelParticles((UserConnection)wrapper.user(), (Position3f)position, (BedrockMappingData.JavaParticle)javaParticle);
                    }
                    break;
                }
                case 2: {
                    wrapper.cancel();
                    Position3f originPosition = new Position3f(data.getFloat("originX"), data.getFloat("originY"), data.getFloat("originZ"));
                    float radius = data.getFloat("radius");
                    int blockCount = data.getInt("size");
                    for (int i = 0; i < blockCount; ++i) {
                        Position3f position = new Position3f(data.getFloat("pos" + i + "x"), data.getFloat("pos" + i + "y"), data.getFloat("pos" + i + "z"));
                        Particle particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:smoke")).intValue());
                        PacketFactory.sendJavaLevelParticles((UserConnection)wrapper.user(), (Position3f)position, (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.0f, 0.0f, 0.0f, 0.0f, 0));
                    }
                    break;
                }
                case 3: {
                    Tag patt31511$temp = data.get("origin");
                    if (patt31511$temp instanceof CompoundTag) {
                        CompoundTag origin = (CompoundTag)patt31511$temp;
                        Tag patt31563$temp = data.get("target");
                        if (patt31563$temp instanceof CompoundTag) {
                            CompoundTag target = (CompoundTag)patt31563$temp;
                            Tag patt31619$temp = data.get("timeToLive");
                            if (patt31619$temp instanceof FloatTag) {
                                FloatTag timeToLive = (FloatTag)patt31619$temp;
                                Position3f originPosition = new Position3f(origin.getFloat("x"), origin.getFloat("y"), origin.getFloat("z"));
                                Particle particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:vibration")).intValue());
                                switch (target.getString("type", "")) {
                                    case "vec3": {
                                        Position3f targetPosition = new Position3f(target.getFloat("x"), target.getFloat("y"), target.getFloat("z"));
                                        particle.add((Type)Types.VAR_INT, (Object)PositionSourceType.BLOCK.ordinal());
                                        particle.add(Types.BLOCK_POSITION1_14, (Object)new BlockPosition((int)targetPosition.x(), (int)targetPosition.y(), (int)targetPosition.z()));
                                        break;
                                    }
                                    case "actor": {
                                        Entity entity = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getEntityByUid(target.getLong("uniqueID"));
                                        if (entity == null) {
                                            wrapper.cancel();
                                            return;
                                        }
                                        particle.add((Type)Types.VAR_INT, (Object)PositionSourceType.ENTITY.ordinal());
                                        particle.add((Type)Types.VAR_INT, (Object)entity.javaId());
                                        particle.add((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                                        break;
                                    }
                                    default: {
                                        wrapper.cancel();
                                        return;
                                    }
                                }
                                particle.add((Type)Types.VAR_INT, (Object)((int)(timeToLive.asFloat() * 20.0f)));
                                PacketFactory.writeJavaLevelParticles((PacketWrapper)wrapper, (Position3f)originPosition, (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.0f, 0.0f, 0.0f, 0.0f, 0));
                                break;
                            }
                        }
                    }
                    wrapper.cancel();
                    break;
                }
                case 4: {
                    wrapper.cancel();
                    Position3f position = new Position3f((float)data.getInt("originX") + 0.5f, (float)data.getInt("originY") + 0.5f, (float)data.getInt("originZ") + 0.5f);
                    for (int i = 0; i < 15; ++i) {
                        Particle particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:shriek")).intValue());
                        particle.add((Type)Types.VAR_INT, (Object)(i * 5));
                        PacketFactory.sendJavaLevelParticles((UserConnection)wrapper.user(), (Position3f)position, (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.0f, 0.0f, 0.0f, 0.0f, 0));
                    }
                    break;
                }
                case 5: {
                    Position3f position = new Position3f(data.getFloat("originX"), data.getFloat("originY"), data.getFloat("originZ"));
                    Particle particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:sculk_soul")).intValue());
                    PacketFactory.writeJavaLevelParticles((PacketWrapper)wrapper, (Position3f)new Position3f(position.x() + 0.5f, position.y() + 1.15f, position.z() + 0.5f), (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.0f, 0.0f, 0.0f, 0.0f, 0));
                    PacketWrapper sound = PacketWrapper.create((PacketType)ClientboundPackets26_1.SOUND, (UserConnection)wrapper.user());
                    sound.write((Type)Types.SOUND_EVENT, (Object)Holder.of((int)((Integer)BedrockProtocol.MAPPINGS.getJavaSounds().get((Object)"minecraft:block.sculk_catalyst.bloom"))));
                    sound.write((Type)Types.VAR_INT, (Object)SoundSource.BLOCKS.ordinal());
                    sound.write((Type)Types.INT, (Object)((int)(position.x() * 8.0f)));
                    sound.write((Type)Types.INT, (Object)((int)(position.y() * 8.0f)));
                    sound.write((Type)Types.INT, (Object)((int)(position.z() * 8.0f)));
                    sound.write((Type)Types.FLOAT, (Object)Float.valueOf(2.0f));
                    sound.write((Type)Types.FLOAT, (Object)Float.valueOf(0.6f + ThreadLocalRandom.current().nextFloat() * 0.4f));
                    sound.write((Type)Types.LONG, (Object)ThreadLocalRandom.current().nextLong());
                    sound.send(BedrockProtocol.class);
                    break;
                }
                case 6: {
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.LEVEL_EVENT);
                    wrapper.write((Type)Types.INT, (Object)LevelEvent.PARTICLES_SCULK_CHARGE.getValue());
                    wrapper.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition(data.getInt("x"), data.getInt("y"), data.getInt("z")));
                    wrapper.write((Type)Types.INT, (Object)(data.getShort("charge") << 6 | data.getShort("facing") & 0x3F));
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    break;
                }
                case 7: {
                    Position3f position = new Position3f((float)data.getInt("x") + 0.5f, (float)data.getInt("y") + 0.5f, (float)data.getInt("z") + 0.5f);
                    Particle particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:sculk_charge_pop")).intValue());
                    PacketFactory.writeJavaLevelParticles((PacketWrapper)wrapper, (Position3f)position, (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.0f, 0.0f, 0.0f, 0.04f, 20));
                    break;
                }
                case 8: {
                    Position3f position = new Position3f(data.getFloat("x"), data.getFloat("y"), data.getFloat("z"));
                    Particle particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:sonic_boom")).intValue());
                    PacketFactory.writeJavaLevelParticles((PacketWrapper)wrapper, (Position3f)position, (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.0f, 0.0f, 0.0f, 0.0f, 0));
                    break;
                }
                case 9: {
                    Position3f position = new Position3f(data.getFloat("x"), data.getFloat("y"), data.getFloat("z"));
                    Particle particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:dust_plume")).intValue());
                    PacketFactory.writeJavaLevelParticles((PacketWrapper)wrapper, (Position3f)position, (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.0f, 0.0f, 0.0f, 0.0f, 7));
                    break;
                }
                case 10: {
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.SYSTEM_CHAT);
                    TextDefinitions textDefinitions = ((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts();
                    if (data.getInt("ableToSleep") != 0) {
                        int playerCount = data.getInt("overworldPlayerCount");
                        int sleepingPlayerCount = data.getInt("sleepingPlayerCount");
                        if (sleepingPlayerCount < playerCount) {
                            wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)textDefinitions.translate("multiplayer.playersSleeping", new Object[]{sleepingPlayerCount, playerCount})));
                        } else {
                            wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)textDefinitions.get("multiplayer.playersSkippingNight")));
                        }
                    } else {
                        wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)textDefinitions.get("multiplayer.playersSleepingNotPossible")));
                    }
                    wrapper.write((Type)Types.BOOLEAN, (Object)true);
                    break;
                }
                case 11: {
                    Particle particle;
                    int i;
                    wrapper.cancel();
                    Position3f creakingPosition = new Position3f(data.getFloat("CreakingX"), data.getFloat("CreakingY"), data.getFloat("CreakingZ"));
                    Position3f heartPosition = new Position3f(data.getFloat("HeartX"), data.getFloat("HeartY"), data.getFloat("HeartZ"));
                    int heartAmount = data.getInt("HeartAmount");
                    int creakingAmount = data.getInt("CreakingAmount");
                    for (i = 0; i < heartAmount; ++i) {
                        particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:trail")).intValue());
                        particle.add((Type)Types.DOUBLE, (Object)((double)heartPosition.x() + (double)ThreadLocalRandom.current().nextFloat()));
                        particle.add((Type)Types.DOUBLE, (Object)((double)heartPosition.y() + (double)ThreadLocalRandom.current().nextFloat()));
                        particle.add((Type)Types.DOUBLE, (Object)((double)heartPosition.z() + (double)ThreadLocalRandom.current().nextFloat()));
                        particle.add((Type)Types.INT, (Object)0x5F5F5F);
                        particle.add((Type)Types.VAR_INT, (Object)(ThreadLocalRandom.current().nextInt(40) + 10));
                        PacketFactory.sendJavaLevelParticles((UserConnection)wrapper.user(), (Position3f)creakingPosition, (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.5f, 1.0f, 0.5f, 0.0f, 1));
                    }
                    for (i = 0; i < creakingAmount; ++i) {
                        particle = new Particle(((Integer)BedrockProtocol.MAPPINGS.getJavaParticles().get((Object)"minecraft:trail")).intValue());
                        particle.add((Type)Types.DOUBLE, (Object)((double)creakingPosition.x() + (double)(ThreadLocalRandom.current().nextFloat() * 2.0f)));
                        particle.add((Type)Types.DOUBLE, (Object)((double)creakingPosition.y() + (double)(ThreadLocalRandom.current().nextFloat() * 2.0f)));
                        particle.add((Type)Types.DOUBLE, (Object)((double)creakingPosition.z() + (double)(ThreadLocalRandom.current().nextFloat() * 2.0f)));
                        particle.add((Type)Types.INT, (Object)16545810);
                        particle.add((Type)Types.VAR_INT, (Object)(ThreadLocalRandom.current().nextInt(40) + 10));
                        PacketFactory.sendJavaLevelParticles((UserConnection)wrapper.user(), (Position3f)heartPosition, (BedrockMappingData.JavaParticle)new BedrockMappingData.JavaParticle(particle, 0.5f, 0.5f, 0.5f, 0.0f, 1));
                    }
                    break;
                }
                default: {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unhandled generic level event: " + String.valueOf((Object)levelEvent) + " (" + String.valueOf(data) + ")");
                    wrapper.cancel();
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.BLOCK_EVENT, (ClientboundPacketType)ClientboundPackets26_1.BLOCK_EVENT, wrapper -> {
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            BlockStateRewriter blockStateRewriter = (BlockStateRewriter)wrapper.user().get(BlockStateRewriter.class);
            BlockPosition position = (BlockPosition)wrapper.passthroughAndMap(BedrockTypes.BLOCK_POSITION, Types.BLOCK_POSITION1_14);
            int type = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            int data = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            int blockState = chunkTracker.getBlockState(position);
            String tag = blockStateRewriter.tag(blockState);
            if (tag == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unhandled block event for " + blockState + ": " + type + " " + data);
                wrapper.cancel();
                return;
            }
            switch (tag) {
                case "chest": 
                case "trapped_chest": 
                case "ender_chest": 
                case "shulker_box": {
                    if (type == 1) {
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)type));
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)MathUtil.clamp((int)data, (int)0, (int)255)));
                        break;
                    }
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unhandled chest block event: " + type + " " + data);
                    wrapper.cancel();
                    return;
                }
                case "note_block": {
                    NoteBlockInstrument noteBlockInstrument = NoteBlockInstrument.getByValue(type);
                    if (noteBlockInstrument != null) {
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)type));
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)MathUtil.clamp((int)data, (int)0, (int)255)));
                        break;
                    }
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unhandled note block block event: " + type + " " + data);
                    wrapper.cancel();
                    return;
                }
                case "mob_spawner": {
                    if (type == 1) {
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)type));
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)MathUtil.clamp((int)data, (int)0, (int)255)));
                        break;
                    }
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unhandled mob spawner block event: " + type + " " + data);
                    wrapper.cancel();
                    return;
                }
                case "end_gateway": {
                    if (type == 1) {
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)type));
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)MathUtil.clamp((int)data, (int)0, (int)255)));
                        break;
                    }
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unhandled end gateway block event: " + type + " " + data);
                    wrapper.cancel();
                    return;
                }
                default: {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unhandled block event for " + blockState + ": " + type + " " + data);
                    wrapper.cancel();
                    return;
                }
            }
            wrapper.write((Type)Types.VAR_INT, (Object)((Integer)BedrockProtocol.MAPPINGS.getJavaBlocks().get((Object)((BlockState)BedrockProtocol.MAPPINGS.getJavaBlockStates().inverse().get((Object)blockStateRewriter.javaId(blockState))).namespacedIdentifier())));
        });
    }

    private static SoundDefinitions.ConfiguredSound tryFindSound(UserConnection user, SharedTypes_Legacy_LevelSoundEvent soundEvent, int data, String entityIdentifier, boolean isBabyMob) {
        if (soundEvent == null) {
            return null;
        }
        Map<String, SoundDefinitions.ConfiguredSound> soundEvents = BedrockProtocol.MAPPINGS.getBedrockLevelSoundEvents().get((Object)soundEvent);
        if (soundEvents == null) {
            return null;
        }
        SoundDefinitions.ConfiguredSound configuredSound = null;
        if (!entityIdentifier.isEmpty()) {
            configuredSound = soundEvents.get(Key.namespaced((String)entityIdentifier));
            if (isBabyMob && configuredSound != null) {
                configuredSound = new SoundDefinitions.ConfiguredSound(configuredSound.sound(), configuredSound.minVolume(), configuredSound.maxVolume(), configuredSound.minPitch() + 0.5f, configuredSound.maxPitch() + 0.5f);
            }
        }
        if (configuredSound == null && data != -1) {
            String blockSound;
            BlockState blockState = ((BlockStateRewriter)user.get(BlockStateRewriter.class)).blockState(data);
            configuredSound = blockState != null ? ((blockSound = BedrockProtocol.MAPPINGS.getBedrockBlockSounds().get(blockState.namespacedIdentifier())) != null ? soundEvents.get(blockSound) : soundEvents.get("stone")) : soundEvents.get("stone");
        }
        if (configuredSound == null) {
            configuredSound = soundEvents.get(null);
        }
        return configuredSound;
    }
}


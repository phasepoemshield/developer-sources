/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.type.Type
 *  net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Tag_Type
 *  net.raphimc.viabedrock.protocol.model.BlockChangeEntry
 *  net.raphimc.viabedrock.protocol.model.BlockProperties
 *  net.raphimc.viabedrock.protocol.model.CommandData
 *  net.raphimc.viabedrock.protocol.model.CommandOriginData
 *  net.raphimc.viabedrock.protocol.model.EducationUriResource
 *  net.raphimc.viabedrock.protocol.model.EntityLink
 *  net.raphimc.viabedrock.protocol.model.EntityProperties
 *  net.raphimc.viabedrock.protocol.model.Experiment
 *  net.raphimc.viabedrock.protocol.model.FullContainerName
 *  net.raphimc.viabedrock.protocol.model.GameRule
 *  net.raphimc.viabedrock.protocol.model.ItemEntry
 *  net.raphimc.viabedrock.protocol.model.PlayerAbilities
 *  net.raphimc.viabedrock.protocol.model.Position2f
 *  net.raphimc.viabedrock.protocol.model.Position3f
 *  net.raphimc.viabedrock.protocol.model.SkinData
 */
package net.raphimc.viabedrock.protocol.types;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.type.Type;
import java.awt.image.BufferedImage;
import java.math.BigInteger;
import java.util.UUID;
import net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Tag_Type;
import net.raphimc.viabedrock.protocol.model.BlockChangeEntry;
import net.raphimc.viabedrock.protocol.model.BlockProperties;
import net.raphimc.viabedrock.protocol.model.CommandData;
import net.raphimc.viabedrock.protocol.model.CommandOriginData;
import net.raphimc.viabedrock.protocol.model.EducationUriResource;
import net.raphimc.viabedrock.protocol.model.EntityLink;
import net.raphimc.viabedrock.protocol.model.EntityProperties;
import net.raphimc.viabedrock.protocol.model.Experiment;
import net.raphimc.viabedrock.protocol.model.FullContainerName;
import net.raphimc.viabedrock.protocol.model.GameRule;
import net.raphimc.viabedrock.protocol.model.ItemEntry;
import net.raphimc.viabedrock.protocol.model.PlayerAbilities;
import net.raphimc.viabedrock.protocol.model.Position2f;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.model.SkinData;
import net.raphimc.viabedrock.protocol.types.array.ArrayType;
import net.raphimc.viabedrock.protocol.types.array.ByteArrayType;
import net.raphimc.viabedrock.protocol.types.chunk.ChunkSectionType;
import net.raphimc.viabedrock.protocol.types.chunk.DataPaletteType;
import net.raphimc.viabedrock.protocol.types.entitydata.EntityDataType;
import net.raphimc.viabedrock.protocol.types.entitydata.EntityPropertiesType;
import net.raphimc.viabedrock.protocol.types.model.BlockChangeEntryType;
import net.raphimc.viabedrock.protocol.types.model.BlockPropertiesType;
import net.raphimc.viabedrock.protocol.types.model.CommandDataArrayType;
import net.raphimc.viabedrock.protocol.types.model.CommandOriginDataType;
import net.raphimc.viabedrock.protocol.types.model.EducationUriResourceType;
import net.raphimc.viabedrock.protocol.types.model.EntityLinkType;
import net.raphimc.viabedrock.protocol.types.model.ExperimentType;
import net.raphimc.viabedrock.protocol.types.model.FullContainerNameType;
import net.raphimc.viabedrock.protocol.types.model.GameRuleType;
import net.raphimc.viabedrock.protocol.types.model.ItemEntryType;
import net.raphimc.viabedrock.protocol.types.model.PlayerAbilitiesType;
import net.raphimc.viabedrock.protocol.types.model.SkinType;
import net.raphimc.viabedrock.protocol.types.position.BlockPositionType;
import net.raphimc.viabedrock.protocol.types.position.Position2fType;
import net.raphimc.viabedrock.protocol.types.position.Position3fType;
import net.raphimc.viabedrock.protocol.types.position.SubChunkOffsetType;
import net.raphimc.viabedrock.protocol.types.primitive.AsciiStringType;
import net.raphimc.viabedrock.protocol.types.primitive.FloatLEType;
import net.raphimc.viabedrock.protocol.types.primitive.ImageType;
import net.raphimc.viabedrock.protocol.types.primitive.IntLEType;
import net.raphimc.viabedrock.protocol.types.primitive.LongLEType;
import net.raphimc.viabedrock.protocol.types.primitive.ShortLEType;
import net.raphimc.viabedrock.protocol.types.primitive.StringType;
import net.raphimc.viabedrock.protocol.types.primitive.TagLEType;
import net.raphimc.viabedrock.protocol.types.primitive.TagType;
import net.raphimc.viabedrock.protocol.types.primitive.TagValueType;
import net.raphimc.viabedrock.protocol.types.primitive.UUIDType;
import net.raphimc.viabedrock.protocol.types.primitive.UnsignedIntLEType;
import net.raphimc.viabedrock.protocol.types.primitive.UnsignedShortLEType;
import net.raphimc.viabedrock.protocol.types.primitive.UnsignedVarBigIntegerType;
import net.raphimc.viabedrock.protocol.types.primitive.UnsignedVarIntType;
import net.raphimc.viabedrock.protocol.types.primitive.UnsignedVarLongType;
import net.raphimc.viabedrock.protocol.types.primitive.Utf8StringType;
import net.raphimc.viabedrock.protocol.types.primitive.VarIntType;
import net.raphimc.viabedrock.protocol.types.primitive.VarLongType;

public class BedrockTypes {
    public static final ShortLEType SHORT_LE = new ShortLEType();
    public static final UnsignedShortLEType UNSIGNED_SHORT_LE = new UnsignedShortLEType();
    public static final IntLEType INT_LE = new IntLEType();
    public static final UnsignedIntLEType UNSIGNED_INT_LE = new UnsignedIntLEType();
    public static final FloatLEType FLOAT_LE = new FloatLEType();
    public static final LongLEType LONG_LE;
    public static final LongLEType UNSIGNED_LONG_LE;
    public static final VarIntType VAR_INT;
    public static final UnsignedVarIntType UNSIGNED_VAR_INT;
    public static final VarLongType VAR_LONG;
    public static final UnsignedVarLongType UNSIGNED_VAR_LONG;
    public static final Type<BigInteger> UNSIGNED_VAR_BIG_INTEGER;
    public static final Type<Long[]> LONG_ARRAY;
    public static final Type<byte[]> BYTE_ARRAY;
    public static final Type<String> ASCII_STRING;
    public static final Type<String> STRING;
    public static final Type<String> OPTIONAL_STRING;
    public static final Type<String[]> SHORT_LE_STRING_ARRAY;
    public static final Type<String[]> STRING_ARRAY;
    public static final Type<String> UTF8_STRING;
    public static final Type<String[]> UTF8_STRING_ARRAY;
    public static final Type<UUID> UUID;
    public static final Type<UUID[]> UUID_ARRAY;
    public static final Type<BufferedImage> IMAGE;
    public static final Type<Tag> NETWORK_TAG;
    public static final Type<Tag> TAG_LE;
    public static final Type<Tag> COMPOUND_TAG_VALUE;
    public static final Type<BlockPosition> BLOCK_POSITION;
    public static final Type<Position3f> POSITION_3F;
    public static final Type<Position3f> OPTIONAL_POSITION_3F;
    public static final Type<Position2f> POSITION_2F;
    public static final Type<GameRule> GAME_RULE;
    public static final Type<GameRule[]> GAME_RULE_ARRAY;
    public static final Type<GameRule> VAR_INT_GAME_RULE;
    public static final Type<GameRule[]> VAR_INT_GAME_RULE_ARRAY;
    public static final Type<Experiment> EXPERIMENT;
    public static final Type<Experiment[]> EXPERIMENT_ARRAY;
    public static final Type<EducationUriResource> EDUCATION_URI_RESOURCE;
    public static final Type<BlockProperties> BLOCK_PROPERTIES;
    public static final Type<BlockProperties[]> BLOCK_PROPERTIES_ARRAY;
    public static final Type<ItemEntry> ITEM_ENTRY;
    public static final Type<ItemEntry[]> ITEM_ENTRY_ARRAY;
    public static final Type<CommandOriginData> COMMAND_ORIGIN_DATA;
    public static final Type<BedrockChunkSection> CHUNK_SECTION;
    public static final Type<BlockPosition> SUB_CHUNK_OFFSET;
    public static final Type<BlockChangeEntry> BLOCK_CHANGE_ENTRY;
    public static final Type<BlockChangeEntry[]> BLOCK_CHANGE_ENTRY_ARRAY;
    public static final Type<BedrockDataPalette> DATA_PALETTE;
    public static final Type<BedrockDataPalette> RUNTIME_DATA_PALETTE;
    public static final Type<EntityData> ENTITY_DATA;
    public static final Type<EntityData[]> ENTITY_DATA_ARRAY;
    public static final Type<EntityProperties> ENTITY_PROPERTIES;
    public static final Type<EntityLink> ENTITY_LINK;
    public static final Type<EntityLink[]> ENTITY_LINK_ARRAY;
    public static final Type<SkinData> SKIN;
    public static final Type<PlayerAbilities> PLAYER_ABILITIES;
    public static final Type<CommandData[]> COMMAND_DATA_ARRAY;
    public static final Type<FullContainerName> FULL_CONTAINER_NAME;
    public static final Type<FullContainerName[]> FULL_CONTAINER_NAME_ARRAY;

    static {
        UNSIGNED_LONG_LE = LONG_LE = new LongLEType();
        VAR_INT = new VarIntType();
        UNSIGNED_VAR_INT = new UnsignedVarIntType();
        VAR_LONG = new VarLongType();
        UNSIGNED_VAR_LONG = new UnsignedVarLongType();
        UNSIGNED_VAR_BIG_INTEGER = new UnsignedVarBigIntegerType();
        LONG_ARRAY = new ArrayType<Long>(LONG_LE, UNSIGNED_VAR_INT);
        BYTE_ARRAY = new ByteArrayType();
        ASCII_STRING = new AsciiStringType();
        STRING = new StringType();
        OPTIONAL_STRING = new StringType.OptionalStringType();
        SHORT_LE_STRING_ARRAY = new ArrayType<String>(STRING, SHORT_LE);
        STRING_ARRAY = new ArrayType<String>(STRING, UNSIGNED_VAR_INT);
        UTF8_STRING = new Utf8StringType();
        UTF8_STRING_ARRAY = new ArrayType<String>(UTF8_STRING, UNSIGNED_INT_LE);
        UUID = new UUIDType();
        UUID_ARRAY = new ArrayType<UUID>(UUID, UNSIGNED_VAR_INT);
        IMAGE = new ImageType();
        NETWORK_TAG = new TagType();
        TAG_LE = new TagLEType();
        COMPOUND_TAG_VALUE = new TagValueType(Tag_Type.Compound);
        BLOCK_POSITION = new BlockPositionType();
        POSITION_3F = new Position3fType();
        OPTIONAL_POSITION_3F = new Position3fType.OptionalPosition3fType();
        POSITION_2F = new Position2fType();
        GAME_RULE = new GameRuleType(false);
        GAME_RULE_ARRAY = new ArrayType<GameRule>(GAME_RULE, UNSIGNED_VAR_INT);
        VAR_INT_GAME_RULE = new GameRuleType(true);
        VAR_INT_GAME_RULE_ARRAY = new ArrayType<GameRule>(VAR_INT_GAME_RULE, UNSIGNED_VAR_INT);
        EXPERIMENT = new ExperimentType();
        EXPERIMENT_ARRAY = new ArrayType<Experiment>(EXPERIMENT, UNSIGNED_INT_LE);
        EDUCATION_URI_RESOURCE = new EducationUriResourceType();
        BLOCK_PROPERTIES = new BlockPropertiesType();
        BLOCK_PROPERTIES_ARRAY = new ArrayType<BlockProperties>(BLOCK_PROPERTIES, UNSIGNED_VAR_INT);
        ITEM_ENTRY = new ItemEntryType();
        ITEM_ENTRY_ARRAY = new ArrayType<ItemEntry>(ITEM_ENTRY, UNSIGNED_VAR_INT);
        COMMAND_ORIGIN_DATA = new CommandOriginDataType();
        CHUNK_SECTION = new ChunkSectionType();
        SUB_CHUNK_OFFSET = new SubChunkOffsetType();
        BLOCK_CHANGE_ENTRY = new BlockChangeEntryType();
        BLOCK_CHANGE_ENTRY_ARRAY = new ArrayType<BlockChangeEntry>(BLOCK_CHANGE_ENTRY, UNSIGNED_VAR_INT);
        DATA_PALETTE = new DataPaletteType(true);
        RUNTIME_DATA_PALETTE = new DataPaletteType(false);
        ENTITY_DATA = new EntityDataType();
        ENTITY_DATA_ARRAY = new ArrayType<EntityData>(ENTITY_DATA, UNSIGNED_VAR_INT);
        ENTITY_PROPERTIES = new EntityPropertiesType();
        ENTITY_LINK = new EntityLinkType();
        ENTITY_LINK_ARRAY = new ArrayType<EntityLink>(ENTITY_LINK, UNSIGNED_VAR_INT);
        SKIN = new SkinType();
        PLAYER_ABILITIES = new PlayerAbilitiesType();
        COMMAND_DATA_ARRAY = new CommandDataArrayType();
        FULL_CONTAINER_NAME = new FullContainerNameType();
        FULL_CONTAINER_NAME_ARRAY = new ArrayType<FullContainerName>(FULL_CONTAINER_NAME, UNSIGNED_VAR_INT);
    }
}


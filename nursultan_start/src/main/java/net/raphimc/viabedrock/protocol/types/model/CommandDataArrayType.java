/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandPermissionLevel
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandRegistry_HardNonTerminal
 *  net.raphimc.viabedrock.protocol.model.CommandData
 *  net.raphimc.viabedrock.protocol.model.CommandData$EnumData
 *  net.raphimc.viabedrock.protocol.model.CommandData$OverloadData
 *  net.raphimc.viabedrock.protocol.model.CommandData$OverloadData$ParamData
 *  net.raphimc.viabedrock.protocol.model.CommandData$SubCommandData
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.google.common.collect.Sets;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandPermissionLevel;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandRegistry_HardNonTerminal;
import net.raphimc.viabedrock.protocol.model.CommandData;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class CommandDataArrayType
extends Type<CommandData[]> {
    private static final int FLAG_VALID = 0x100000;
    private static final int FLAG_ENUM = 0x200000;
    private static final int FLAG_POSTFIX = 0x1000000;
    private static final int FLAG_SOFT_ENUM = 0x4000000;
    private static final int FLAG_SUB_COMMAND = 0x8000000;

    public CommandDataArrayType() {
        super(CommandData[].class);
    }

    public void write(ByteBuf buffer, CommandData[] value) {
        throw new UnsupportedOperationException("Cannot serialize CommandDataArrayType");
    }

    public CommandData[] read(ByteBuf buffer) {
        String[] enumLiterals = (String[])BedrockTypes.STRING_ARRAY.read(buffer);
        String[] subCommandLiterals = (String[])BedrockTypes.STRING_ARRAY.read(buffer);
        String[] postFixLiterals = (String[])BedrockTypes.STRING_ARRAY.read(buffer);
        CommandData.EnumData[] enumPalette = new CommandData.EnumData[BedrockTypes.UNSIGNED_VAR_INT.read(buffer).intValue()];
        HashMap<String, CommandData.EnumData> enumPaletteMap = new HashMap<String, CommandData.EnumData>(enumPalette.length);
        for (int i = 0; i < enumPalette.length; ++i) {
            CommandData.EnumData enumData;
            String name = (String)BedrockTypes.STRING.read(buffer);
            int count = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
            HashSet<String> values = new HashSet<String>(count);
            for (int j = 0; j < count; ++j) {
                long index = buffer.readUnsignedIntLE();
                if (index >= 0L && index < (long)enumLiterals.length) {
                    values.add(enumLiterals[Math.toIntExact(index)]);
                    continue;
                }
                values.add("default");
            }
            if (enumPaletteMap.containsKey(name)) {
                enumData = (CommandData.EnumData)enumPaletteMap.get(name);
                enumData.addValues(values);
            } else {
                enumData = new CommandData.EnumData(name, values, false);
                enumPaletteMap.put(name, enumData);
            }
            enumPalette[i] = enumData;
        }
        CommandData.SubCommandData[] subCommands = new CommandData.SubCommandData[BedrockTypes.UNSIGNED_VAR_INT.read(buffer).intValue()];
        HashMap<String, CommandData.SubCommandData> subCommandMap = new HashMap<String, CommandData.SubCommandData>(subCommands.length);
        for (int i = 0; i < subCommands.length; ++i) {
            CommandData.SubCommandData subCommandData;
            String name = (String)BedrockTypes.STRING.read(buffer);
            int count = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
            HashMap<String, Integer> values = new HashMap<String, Integer>(count);
            for (int j = 0; j < count; ++j) {
                int index = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
                int type = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
                if (index < 0 || index >= subCommandLiterals.length) continue;
                values.put(subCommandLiterals[index], type);
            }
            if (subCommandMap.containsKey(name)) {
                subCommandData = (CommandData.SubCommandData)subCommandMap.get(name);
                subCommandData.addValues(values);
            } else {
                subCommandData = new CommandData.SubCommandData(name, values);
                subCommandMap.put(name, subCommandData);
            }
            subCommands[i] = subCommandData;
        }
        ArrayList<Consumer<CommandData.EnumData[]>> softEnumResolvers = new ArrayList<Consumer<CommandData.EnumData[]>>();
        CommandData[] commands = new CommandData[BedrockTypes.UNSIGNED_VAR_INT.read(buffer).intValue()];
        HashMap<String, CommandData> commandMap = new HashMap<String, CommandData>(commands.length);
        for (int i = 0; i < commands.length; ++i) {
            CommandData commandData;
            String name = (String)BedrockTypes.STRING.read(buffer);
            String description = (String)BedrockTypes.STRING.read(buffer);
            int flags = buffer.readUnsignedShortLE();
            byte permission = (byte)CommandPermissionLevel.getByName((String)((String)BedrockTypes.STRING.read(buffer))).getValue();
            int aliasIndex = buffer.readIntLE();
            boolean validAliasPointer = aliasIndex >= 0 && aliasIndex < enumPalette.length;
            CommandData.EnumData alias = validAliasPointer ? enumPalette[aliasIndex] : null;
            int subCommandCount = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
            for (int j = 0; j < subCommandCount; ++j) {
                buffer.readUnsignedIntLE();
            }
            CommandData.OverloadData[] overloads = new CommandData.OverloadData[BedrockTypes.UNSIGNED_VAR_INT.read(buffer).intValue()];
            for (int j = 0; j < overloads.length; ++j) {
                boolean chaining = buffer.readBoolean();
                CommandData.OverloadData.ParamData[] params = new CommandData.OverloadData.ParamData[BedrockTypes.UNSIGNED_VAR_INT.read(buffer).intValue()];
                for (int k = 0; k < params.length; ++k) {
                    int index;
                    String paramName = (String)BedrockTypes.STRING.read(buffer);
                    int param = buffer.readIntLE();
                    boolean optional = buffer.readBoolean();
                    short paramFlags = buffer.readUnsignedByte();
                    CommandRegistry_HardNonTerminal type = null;
                    CommandData.EnumData enumData = null;
                    CommandData.SubCommandData subCommandData = null;
                    String postfix = null;
                    if ((param & 0x4000000) != 0) {
                        index = param & 0xFBFFFFFF & 0xFFEFFFFF;
                        int finalK = k;
                        softEnumResolvers.add(softEnumPalette -> {
                            params[finalK] = index >= 0 && index < ((CommandData.EnumData[])softEnumPalette).length ? new CommandData.OverloadData.ParamData(paramName, optional, paramFlags, null, softEnumPalette[index], null, null) : new CommandData.OverloadData.ParamData(paramName, optional, paramFlags, CommandRegistry_HardNonTerminal.Id, null, null, null);
                        });
                        continue;
                    }
                    if ((param & 0x1000000) != 0) {
                        index = param & 0xFEFFFFFF;
                        postfix = postFixLiterals[index];
                    } else if ((param & 0x200000) != 0) {
                        index = param & 0xFFDFFFFF & 0xFFEFFFFF;
                        enumData = enumPalette[index];
                    } else if ((param & 0x8000000) != 0) {
                        index = param & 0xF7FFFFFF & 0xFFEFFFFF;
                        subCommandData = subCommands[index];
                    } else if ((param & 0x100000) != 0) {
                        type = CommandRegistry_HardNonTerminal.getByValue((int)param);
                    }
                    params[k] = new CommandData.OverloadData.ParamData(paramName, optional, paramFlags, type, enumData, subCommandData, postfix);
                }
                overloads[j] = new CommandData.OverloadData(chaining, params);
            }
            if (commandMap.containsKey(name)) {
                CommandData oldCommandData = (CommandData)commandMap.get(name);
                CommandData.EnumData newAlias = validAliasPointer ? alias : oldCommandData.alias();
                CommandData.OverloadData[] newOverloads = new CommandData.OverloadData[oldCommandData.overloads().length + overloads.length];
                System.arraycopy(oldCommandData.overloads(), 0, newOverloads, 0, oldCommandData.overloads().length);
                System.arraycopy(overloads, 0, newOverloads, oldCommandData.overloads().length, overloads.length);
                commandData = new CommandData(name, oldCommandData.description(), oldCommandData.flags(), oldCommandData.permission(), newAlias, newOverloads);
                commandMap.put(name, commandData);
            } else {
                commandData = new CommandData(name, description, flags, permission, alias, overloads);
                commandMap.put(name, commandData);
            }
            commands[i] = commandData;
        }
        CommandData.EnumData[] softEnumPalette2 = new CommandData.EnumData[BedrockTypes.UNSIGNED_VAR_INT.read(buffer).intValue()];
        HashMap<String, CommandData.EnumData> softEnumPaletteMap = new HashMap<String, CommandData.EnumData>(softEnumPalette2.length);
        for (int i = 0; i < softEnumPalette2.length; ++i) {
            CommandData.EnumData enumData;
            String name = (String)BedrockTypes.STRING.read(buffer);
            HashSet values = Sets.newHashSet((Object[])((String[])BedrockTypes.STRING_ARRAY.read(buffer)));
            if (softEnumPaletteMap.containsKey(name)) {
                enumData = (CommandData.EnumData)softEnumPaletteMap.get(name);
                enumData.addValues((Set)values);
            } else {
                enumData = new CommandData.EnumData(name, (Set)values, true);
                softEnumPaletteMap.put(name, enumData);
            }
            softEnumPalette2[i] = enumData;
        }
        softEnumResolvers.forEach(c -> c.accept(softEnumPalette2));
        int enumFlagsCount = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
        for (int i = 0; i < enumFlagsCount; ++i) {
            int valueIndex = buffer.readIntLE();
            int enumIndex = buffer.readIntLE();
            byte[] constraints = (byte[])BedrockTypes.BYTE_ARRAY.read(buffer);
            String valueKey = enumLiterals[valueIndex];
            CommandData.EnumData enumData = enumPalette[enumIndex];
            Set constraintsSet = (Set)enumData.values().get(valueKey);
            if (constraintsSet == null) continue;
            for (byte constraint : constraints) {
                constraintsSet.add(constraint);
            }
        }
        return commands;
    }
}


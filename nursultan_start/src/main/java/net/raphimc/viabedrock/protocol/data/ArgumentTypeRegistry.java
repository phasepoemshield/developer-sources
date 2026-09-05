/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.LongArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType$StringType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  net.raphimc.viabedrock.api.brigadier.BlockPositionArgumentType
 *  net.raphimc.viabedrock.api.brigadier.BlockStatesArgumentType
 *  net.raphimc.viabedrock.api.brigadier.CompareOperatorArgumentType
 *  net.raphimc.viabedrock.api.brigadier.EnumArgumentType
 *  net.raphimc.viabedrock.api.brigadier.EquipmentSlotArgumentType
 *  net.raphimc.viabedrock.api.brigadier.IntegerRangeArgumentType
 *  net.raphimc.viabedrock.api.brigadier.JsonArgumentType
 *  net.raphimc.viabedrock.api.brigadier.OperatorArgumentType
 *  net.raphimc.viabedrock.api.brigadier.PositionArgumentType
 *  net.raphimc.viabedrock.api.brigadier.TargetArgumentType
 *  net.raphimc.viabedrock.api.brigadier.ValueArgumentType
 *  net.raphimc.viabedrock.api.brigadier.WildcardIntegerArgumentType
 */
package net.raphimc.viabedrock.protocol.data;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import net.raphimc.viabedrock.api.brigadier.BlockPositionArgumentType;
import net.raphimc.viabedrock.api.brigadier.BlockStatesArgumentType;
import net.raphimc.viabedrock.api.brigadier.CompareOperatorArgumentType;
import net.raphimc.viabedrock.api.brigadier.EnumArgumentType;
import net.raphimc.viabedrock.api.brigadier.EquipmentSlotArgumentType;
import net.raphimc.viabedrock.api.brigadier.IntegerRangeArgumentType;
import net.raphimc.viabedrock.api.brigadier.JsonArgumentType;
import net.raphimc.viabedrock.api.brigadier.OperatorArgumentType;
import net.raphimc.viabedrock.api.brigadier.PositionArgumentType;
import net.raphimc.viabedrock.api.brigadier.TargetArgumentType;
import net.raphimc.viabedrock.api.brigadier.ValueArgumentType;
import net.raphimc.viabedrock.api.brigadier.WildcardIntegerArgumentType;
import net.raphimc.viabedrock.protocol.BedrockProtocol;

public class ArgumentTypeRegistry {
    private static final Map<Class<? extends ArgumentType<?>>, ArgumentTypeMapping> ARGUMENT_TYPES = new HashMap();

    public static void init() {
        if (!ARGUMENT_TYPES.isEmpty()) {
            throw new IllegalStateException("Argument types already initialized");
        }
        ArgumentTypeRegistry.register(BoolArgumentType.class, "brigadier:bool", null);
        ArgumentTypeRegistry.register(FloatArgumentType.class, "brigadier:float", (wrapper, argumentType) -> {
            boolean hasMin = argumentType.getMinimum() != -3.4028235E38f;
            boolean hasMax = argumentType.getMaximum() != Float.MAX_VALUE;
            byte flags = (byte)((hasMin ? 1 : 0) | (hasMax ? 2 : 0));
            wrapper.write((Type)Types.BYTE, (Object)flags);
            if (hasMin) {
                wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(argumentType.getMinimum()));
            }
            if (hasMax) {
                wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(argumentType.getMaximum()));
            }
        });
        ArgumentTypeRegistry.register(DoubleArgumentType.class, "brigadier:double", (wrapper, argumentType) -> {
            boolean hasMin = argumentType.getMinimum() != -1.7976931348623157E308;
            boolean hasMax = argumentType.getMaximum() != Double.MAX_VALUE;
            byte flags = (byte)((hasMin ? 1 : 0) | (hasMax ? 2 : 0));
            wrapper.write((Type)Types.BYTE, (Object)flags);
            if (hasMin) {
                wrapper.write((Type)Types.DOUBLE, (Object)argumentType.getMinimum());
            }
            if (hasMax) {
                wrapper.write((Type)Types.DOUBLE, (Object)argumentType.getMaximum());
            }
        });
        ArgumentTypeRegistry.register(IntegerArgumentType.class, "brigadier:integer", (wrapper, argumentType) -> {
            boolean hasMin = argumentType.getMinimum() != Integer.MIN_VALUE;
            boolean hasMax = argumentType.getMaximum() != Integer.MAX_VALUE;
            byte flags = (byte)((hasMin ? 1 : 0) | (hasMax ? 2 : 0));
            wrapper.write((Type)Types.BYTE, (Object)flags);
            if (hasMin) {
                wrapper.write((Type)Types.INT, (Object)argumentType.getMinimum());
            }
            if (hasMax) {
                wrapper.write((Type)Types.INT, (Object)argumentType.getMaximum());
            }
        });
        ArgumentTypeRegistry.register(LongArgumentType.class, "brigadier:long", (wrapper, argumentType) -> {
            boolean hasMin = argumentType.getMinimum() != Long.MIN_VALUE;
            boolean hasMax = argumentType.getMaximum() != Long.MAX_VALUE;
            byte flags = (byte)((hasMin ? 1 : 0) | (hasMax ? 2 : 0));
            wrapper.write((Type)Types.BYTE, (Object)flags);
            if (hasMin) {
                wrapper.write((Type)Types.LONG, (Object)argumentType.getMinimum());
            }
            if (hasMax) {
                wrapper.write((Type)Types.LONG, (Object)argumentType.getMaximum());
            }
        });
        ArgumentTypeRegistry.register(StringArgumentType.class, "brigadier:string", (wrapper, argumentType) -> wrapper.write((Type)Types.VAR_INT, (Object)argumentType.getType().ordinal()));
        ArgumentTypeRegistry.register(EnumArgumentType.class, "brigadier:string", (wrapper, argumentType) -> wrapper.write((Type)Types.VAR_INT, (Object)StringArgumentType.StringType.SINGLE_WORD.ordinal()));
        ArgumentTypeRegistry.register(ValueArgumentType.class, "minecraft:angle", null);
        ArgumentTypeRegistry.register(WildcardIntegerArgumentType.class, "brigadier:integer", (wrapper, argumentType) -> wrapper.write((Type)Types.BYTE, (Object)0));
        ArgumentTypeRegistry.register(OperatorArgumentType.class, "minecraft:operation", null);
        ArgumentTypeRegistry.register(CompareOperatorArgumentType.class, "brigadier:string", (wrapper, argumentType) -> wrapper.write((Type)Types.VAR_INT, (Object)StringArgumentType.StringType.SINGLE_WORD.ordinal()));
        ArgumentTypeRegistry.register(TargetArgumentType.class, "minecraft:entity", (wrapper, argumentType) -> wrapper.write((Type)Types.BYTE, (Object)0));
        ArgumentTypeRegistry.register(IntegerRangeArgumentType.class, "minecraft:int_range", null);
        ArgumentTypeRegistry.register(EquipmentSlotArgumentType.class, "brigadier:string", (wrapper, argumentType) -> wrapper.write((Type)Types.VAR_INT, (Object)StringArgumentType.StringType.SINGLE_WORD.ordinal()));
        ArgumentTypeRegistry.register(BlockPositionArgumentType.class, "minecraft:block_pos", null);
        ArgumentTypeRegistry.register(PositionArgumentType.class, "minecraft:vec3", null);
        ArgumentTypeRegistry.register(JsonArgumentType.class, "brigadier:string", (wrapper, argumentType) -> wrapper.write((Type)Types.VAR_INT, (Object)StringArgumentType.StringType.GREEDY_PHRASE.ordinal()));
        ArgumentTypeRegistry.register(BlockStatesArgumentType.class, "brigadier:string", (wrapper, argumentType) -> wrapper.write((Type)Types.VAR_INT, (Object)StringArgumentType.StringType.GREEDY_PHRASE.ordinal()));
    }

    public static ArgumentTypeMapping getArgumentTypeMapping(ArgumentType<?> type) {
        ArgumentTypeMapping value = ARGUMENT_TYPES.get(type.getClass());
        if (value == null) {
            throw new IllegalArgumentException("Unknown argument type: " + type.getClass().getName());
        }
        return value;
    }

    private static <T extends ArgumentType<?>> void register(Class<T> clazz, String name, BiConsumer<PacketWrapper, T> writer) {
        if (!BedrockProtocol.MAPPINGS.getJavaCommandArgumentTypes().containsKey((Object)name)) {
            throw new IllegalArgumentException("Unknown java argument type: " + name);
        }
        ARGUMENT_TYPES.put(clazz, new ArgumentTypeMapping((Integer)BedrockProtocol.MAPPINGS.getJavaCommandArgumentTypes().get((Object)name), writer));
    }

    public record ArgumentTypeMapping(int id, BiConsumer<PacketWrapper, ArgumentType<?>> writer) {
    }
}


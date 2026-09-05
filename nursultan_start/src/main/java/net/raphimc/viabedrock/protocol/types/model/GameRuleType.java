/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GameRule_Type
 *  net.raphimc.viabedrock.protocol.model.GameRule
 *  net.raphimc.viabedrock.protocol.types.model.GameRuleType$1
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GameRule_Type;
import net.raphimc.viabedrock.protocol.model.GameRule;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;
import net.raphimc.viabedrock.protocol.types.model.GameRuleType;

public class GameRuleType
extends Type<GameRule> {
    private final boolean varInt;

    public GameRuleType(boolean varInt) {
        super(GameRule.class);
        this.varInt = varInt;
    }

    public void write(ByteBuf buffer, GameRule value) {
        Class<?> valueClass;
        BedrockTypes.STRING.write(buffer, (Object)value.name());
        buffer.writeBoolean(value.editable());
        Class<?> clazz = valueClass = value.value() == null ? null : value.value().getClass();
        GameRule_Type type = valueClass == Boolean.class ? GameRule_Type.Bool : (valueClass == Integer.class ? GameRule_Type.Int : (valueClass == Float.class ? GameRule_Type.Float : GameRule_Type.Invalid));
        BedrockTypes.UNSIGNED_VAR_INT.write(buffer, type.getValue());
        switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$GameRule_Type[type.ordinal()]) {
            case 1: {
                buffer.writeBoolean(((Boolean)value.value()).booleanValue());
                break;
            }
            case 2: {
                if (this.varInt) {
                    BedrockTypes.VAR_INT.writePrimitive(buffer, (Integer)value.value());
                    break;
                }
                BedrockTypes.INT_LE.writePrimitive(buffer, (Integer)value.value());
                break;
            }
            case 3: {
                BedrockTypes.FLOAT_LE.writePrimitive(buffer, ((Float)value.value()).floatValue());
                break;
            }
            default: {
                throw new IllegalStateException("Unhandled GameRule_Type: " + String.valueOf(type));
            }
        }
    }

    public GameRule read(ByteBuf buffer) {
        String name = (String)BedrockTypes.STRING.read(buffer);
        boolean editable = buffer.readBoolean();
        GameRule_Type type = GameRule_Type.getByValue((int)BedrockTypes.UNSIGNED_VAR_INT.read(buffer), (GameRule_Type)GameRule_Type.Invalid);
        return switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$GameRule_Type[type.ordinal()]) {
            case 1 -> new GameRule(name, editable, (Object)buffer.readBoolean());
            case 2 -> new GameRule(name, editable, (Object)(this.varInt ? BedrockTypes.VAR_INT.readPrimitive(buffer) : BedrockTypes.INT_LE.readPrimitive(buffer)));
            case 3 -> new GameRule(name, editable, (Object)Float.valueOf(BedrockTypes.FLOAT_LE.readPrimitive(buffer)));
            case 4 -> new GameRule(name, editable, null);
            default -> throw new IllegalStateException("Unhandled GameRule_Type: " + String.valueOf(type));
        };
    }
}


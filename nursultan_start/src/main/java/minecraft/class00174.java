/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class02350
 *  minecraft.class08524
 */
package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map;
import minecraft.class00152;
import minecraft.class00156;
import minecraft.class00164;
import minecraft.class00171;
import minecraft.class00180;
import minecraft.class00392;
import minecraft.class02350;
import minecraft.class08524;

public class class00174 {
    static final class08524<CommandSyntaxException> N = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_string_uuid")));
    static final class08524<CommandSyntaxException> y = class08524.N((SimpleCommandExceptionType)new SimpleCommandExceptionType((Message)class00392.L((String)"snbt.parser.expected_number_or_boolean")));
    public static final String L = "true";
    public static final String u = "false";
    public static final Map<class00164, class00171> i = Map.of(new class00164("bool", 1), new class00152(), new class00164("uuid", 1), new class00180());
    public static final class02350<StringReader> R = new class00156();
}


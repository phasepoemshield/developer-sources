/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00622
 *  minecraft.class04995
 *  minecraft.class06962
 *  minecraft.class07755
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import minecraft.class00622;
import minecraft.class04995;
import minecraft.class06962;
import minecraft.class07755;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class02951
extends DataFix {
    private static final Logger N = LogUtils.getLogger();

    private static <T> Map<Dynamic<T>, Dynamic<T>> L(Dynamic<T> dynamic, String string) {
        try {
            HashMap<Dynamic<T>, Dynamic<T>> hashMap = new HashMap<Dynamic<T>, Dynamic<T>>();
            StringReader stringReader = new StringReader(string);
            stringReader.expect('[');
            stringReader.skipWhitespace();
            while (stringReader.canRead() && stringReader.peek() != ']') {
                stringReader.skipWhitespace();
                String string2 = stringReader.readString();
                stringReader.skipWhitespace();
                stringReader.expect('=');
                stringReader.skipWhitespace();
                String string3 = stringReader.readString();
                stringReader.skipWhitespace();
                hashMap.put(dynamic.createString(string2), dynamic.createString(string3));
                if (!stringReader.canRead()) continue;
                if (stringReader.peek() != ',') break;
                stringReader.skip();
            }
            stringReader.expect(']');
            return hashMap;
        }
        catch (Exception exception) {
            N.warn("Failed to parse block properties: {}", (Object)string, (Object)exception);
            return Map.of();
        }
    }

    private <T> Dynamic<T> M(Dynamic<T> dynamic, String string) {
        try {
            StringReader stringReader = new StringReader(string);
            float f = (float)stringReader.readDouble();
            stringReader.expect(' ');
            float f2 = (float)stringReader.readDouble();
            stringReader.expect(' ');
            float f3 = (float)stringReader.readDouble();
            stringReader.expect(' ');
            int n = stringReader.readInt();
            Dynamic var8 = dynamic.createIntList(IntStream.of(class04995.y((float)f), class04995.y((float)f2), class04995.y((float)f3)));
            Dynamic dynamic2 = dynamic.createMap(Map.of(dynamic.createString("type"), dynamic.createString("minecraft:block"), dynamic.createString("pos"), var8));
            return dynamic.set("destination", dynamic2).set("arrival_in_ticks", dynamic.createInt(n));
        }
        catch (Exception exception) {
            N.warn("Failed to parse particle options: {}", (Object)string, (Object)exception);
            return dynamic;
        }
    }

    public class02951(Schema schema) {
        super(schema, true);
    }

    private <T> Dynamic<T> B(Dynamic<T> dynamic, String string) {
        try {
            StringReader stringReader = new StringReader(string);
            int n = stringReader.readInt();
            return dynamic.set("delay", dynamic.createInt(n));
        }
        catch (Exception exception) {
            N.warn("Failed to parse particle options: {}", (Object)string, (Object)exception);
            return dynamic;
        }
    }

    private <T> Dynamic<T> i(Dynamic<T> dynamic, String string) {
        try {
            StringReader stringReader = new StringReader(string);
            Dynamic<T> dynamic2 = class02951.N(dynamic, stringReader);
            stringReader.expect(' ');
            float f = stringReader.readFloat();
            stringReader.expect(' ');
            Dynamic<T> dynamic3 = class02951.N(dynamic, stringReader);
            return dynamic.set("from_color", dynamic2).set("to_color", dynamic3).set("scale", dynamic.createFloat(f));
        }
        catch (Exception exception) {
            N.warn("Failed to parse particle options: {}", (Object)string, (Object)exception);
            return dynamic;
        }
    }

    private <T> Dynamic<T> u(Dynamic<T> dynamic, String string) {
        try {
            StringReader stringReader = new StringReader(string);
            Dynamic<T> dynamic2 = class02951.N(dynamic, stringReader);
            stringReader.expect(' ');
            float f = stringReader.readFloat();
            return dynamic.set("color", dynamic2).set("scale", dynamic.createFloat(f));
        }
        catch (Exception exception) {
            N.warn("Failed to parse particle options: {}", (Object)string, (Object)exception);
            return dynamic;
        }
    }

    private <T> Dynamic<T> y(Dynamic<T> dynamic, String string) {
        int n = string.indexOf("[");
        Dynamic dynamic2 = dynamic.emptyMap();
        if (n == -1) {
            dynamic2 = dynamic2.set("Name", dynamic.createString(class00622.N((String)string)));
        } else {
            dynamic2 = dynamic2.set("Name", dynamic.createString(class00622.N((String)string.substring(0, n))));
            Map<Dynamic<T>, Dynamic<T>> map = class02951.L(dynamic, string.substring(n));
            if (!map.isEmpty()) {
                dynamic2 = dynamic2.set("Properties", dynamic.createMap(map));
            }
        }
        return dynamic.set("block_state", dynamic2);
    }

    private static <T> @Nullable Dynamic<T> N(DynamicOps<T> dynamicOps, String string) {
        try {
            return new Dynamic(dynamicOps, class07755.N(dynamicOps).y(string));
        }
        catch (Exception exception) {
            N.warn("Failed to parse tag: {}", (Object)string, (Object)exception);
            return null;
        }
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic, StringReader stringReader) throws CommandSyntaxException {
        float f = stringReader.readFloat();
        stringReader.expect(' ');
        float f2 = stringReader.readFloat();
        stringReader.expect(' ');
        float f3 = stringReader.readFloat();
        return dynamic.createList(Stream.of(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)).map(arg_0 -> dynamic.createFloat(arg_0)));
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic, String string) {
        int n = string.indexOf("{");
        Dynamic dynamic2 = dynamic.createMap(Map.of(dynamic.createString("Count"), dynamic.createInt(1)));
        if (n == -1) {
            dynamic2 = dynamic2.set("id", dynamic.createString(string));
        } else {
            dynamic2 = dynamic2.set("id", dynamic.createString(string.substring(0, n)));
            Dynamic<T> dynamic3 = class02951.N(dynamic.getOps(), string.substring(n));
            if (dynamic3 != null) {
                dynamic2 = dynamic2.set("tag", dynamic3);
            }
        }
        return dynamic.set("item", dynamic2);
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        Optional var2 = dynamic.asString().result();
        if (var2.isEmpty()) {
            return dynamic;
        }
        String[] stringArray = ((String)var2.get()).split(" ", 2);
        String string = class00622.N((String)stringArray[0]);
        Dynamic<T> dynamic2 = dynamic.createMap(Map.of(dynamic.createString("type"), dynamic.createString(string)));
        return switch (string) {
            case "minecraft:item" -> {
                if (stringArray.length > 1) {
                    yield this.N(dynamic2, stringArray[1]);
                }
                yield dynamic2;
            }
            case "minecraft:block", "minecraft:block_marker", "minecraft:falling_dust", "minecraft:dust_pillar" -> {
                if (stringArray.length > 1) {
                    yield this.y(dynamic2, stringArray[1]);
                }
                yield dynamic2;
            }
            case "minecraft:dust" -> {
                if (stringArray.length > 1) {
                    yield this.u(dynamic2, stringArray[1]);
                }
                yield dynamic2;
            }
            case "minecraft:dust_color_transition" -> {
                if (stringArray.length > 1) {
                    yield this.i(dynamic2, stringArray[1]);
                }
                yield dynamic2;
            }
            case "minecraft:sculk_charge" -> {
                if (stringArray.length > 1) {
                    yield this.R(dynamic2, stringArray[1]);
                }
                yield dynamic2;
            }
            case "minecraft:vibration" -> {
                if (stringArray.length > 1) {
                    yield this.M(dynamic2, stringArray[1]);
                }
                yield dynamic2;
            }
            case "minecraft:shriek" -> {
                if (stringArray.length > 1) {
                    yield this.B(dynamic2, stringArray[1]);
                }
                yield dynamic2;
            }
            default -> dynamic2;
        };
    }

    private <T> Dynamic<T> R(Dynamic<T> dynamic, String string) {
        try {
            StringReader stringReader = new StringReader(string);
            float f = stringReader.readFloat();
            return dynamic.set("roll", dynamic.createFloat(f));
        }
        catch (Exception exception) {
            N.warn("Failed to parse particle options: {}", (Object)string, (Object)exception);
            return dynamic;
        }
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.Q);
        Type var2 = this.getOutputSchema().getType(class06962.Q);
        return this.writeFixAndRead("ParticleUnflatteningFix", var1, var2, this::N);
    }
}


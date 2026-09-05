/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class02269
 *  minecraft.class06962
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Optional;
import minecraft.class02269;
import minecraft.class06962;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class08367
extends DataFix {
    private static <T> @Nullable Dynamic<T> L(Dynamic<T> dynamic) {
        String string = dynamic.get("action").asString("");
        String string2 = dynamic.get("value").asString("");
        return switch (string) {
            case "open_url" -> {
                if (!class08367.N(string2)) {
                    yield null;
                }
                yield dynamic.renameField("value", "url");
            }
            case "open_file" -> dynamic.renameField("value", "path");
            case "run_command", "suggest_command" -> {
                if (!class08367.y(string2)) {
                    yield null;
                }
                yield dynamic.renameField("value", "command");
            }
            case "change_page" -> {
                Integer var5_5 = dynamic.get("value").result().map(class08367::u).orElse(null);
                if (var5_5 == null) {
                    yield null;
                }
                int var6_6 = Math.max(var5_5, 1);
                yield dynamic.remove("value").set("page", dynamic.createInt(var6_6));
            }
            default -> dynamic;
        };
    }

    public class08367(Schema schema) {
        super(schema, true);
    }

    private static @Nullable Integer u(Dynamic<?> dynamic) {
        Optional var1 = dynamic.asNumber().result();
        if (var1.isPresent()) {
            return ((Number)var1.get()).intValue();
        }
        try {
            return Integer.parseInt(dynamic.asString(""));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Dynamic<?> y(Dynamic<?> dynamic) {
        return switch (dynamic.get("action").asString("")) {
            case "show_text" -> dynamic.renameField("contents", "value");
            case "show_item" -> {
                Dynamic var4_3 = dynamic.get("contents").orElseEmptyMap();
                if (var4_3.asString().result().isPresent()) {
                    yield dynamic.renameField("contents", "id");
                }
                yield class08367.N(dynamic.remove("contents"), var4_3, "id", "count", "components");
            }
            case "show_entity" -> {
                Dynamic var4_4 = dynamic.get("contents").orElseEmptyMap();
                yield class08367.N(dynamic.remove("contents"), var4_4, "id", "type", "name").renameField("id", "uuid").renameField("type", "id");
            }
            default -> dynamic;
        };
    }

    private static boolean y(String string) {
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c != '\u00a7' && c >= ' ' && c != '\u007f') continue;
            return false;
        }
        return true;
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.renameAndFixField("hoverEvent", "hover_event", class08367::y).renameAndFixField("clickEvent", "click_event", class08367::L);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, Dynamic<?> dynamic2, String ... stringArray) {
        Dynamic var0;
        for (String string : stringArray) {
            var0 = Dynamic.copyField(dynamic2, (String)string, dynamic, (String)string);
        }
        return var0;
    }

    private <C1, C2, H extends Pair<String, ?>> TypeRewriteRule N(Type<C1> type, Type<C2> type2, Type<H> type3) {
        Type type4 = DSL.named((String)class06962.O.typeName(), (Type)DSL.or((Type)DSL.or((Type)DSL.string(), (Type)DSL.list(type)), (Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"extra", (Type)DSL.list(type))), (Type)DSL.optional((Type)DSL.field((String)"separator", type)), (Type)DSL.optional((Type)DSL.field((String)"hoverEvent", type3)), (Type)DSL.remainderType())));
        if (!type4.equals((Object)this.getInputSchema().getType(class06962.O))) {
            throw new IllegalStateException("Text component type did not match, expected " + String.valueOf(type4) + " but got " + String.valueOf(this.getInputSchema().getType(class06962.O)));
        }
        Type var5 = class02269.N((Type)type4, (Type)type4, type2);
        return this.fixTypeEverywhere("TextComponentHoverAndClickEventFix", type4, type2, dynamicOps -> pair2 -> {
            if (!((Boolean)((Either)pair2.getSecond()).map(either -> false, pair -> {
                Pair pair2 = (Pair)((Pair)pair.getSecond()).getSecond();
                boolean bl = ((Either)pair2.getFirst()).left().isPresent();
                boolean bl2 = ((Dynamic)pair2.getSecond()).get("clickEvent").result().isPresent();
                return bl || bl2;
            })).booleanValue()) {
                return pair2;
            }
            return class07536.N((Typed)class02269.N((Type)var5, (Object)pair2, (DynamicOps)dynamicOps), (Type)type2, class08367::N).getValue();
        });
    }

    private static boolean N(String string) {
        try {
            String string2 = new URI(string).getScheme();
            if (string2 == null) {
                return false;
            }
            String string3 = string2.toLowerCase(Locale.ROOT);
            return "http".equals(string3) || "https".equals(string3);
        }
        catch (URISyntaxException uRISyntaxException) {
            return false;
        }
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.O).findFieldType("hoverEvent");
        return this.N(this.getInputSchema().getTypeRaw(class06962.O), this.getOutputSchema().getType(class06962.O), var1);
    }
}


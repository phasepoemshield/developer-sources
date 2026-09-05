/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class02269
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class02269;
import minecraft.class06962;
import minecraft.class07536;

public class class08600
extends DataFix {
    private static String L(int n) {
        return switch (n & 0xFFFF) {
            default -> "kob";
            case 256 -> "sunstreak";
            case 512 -> "snooper";
            case 768 -> "dasher";
            case 1024 -> "brinely";
            case 1280 -> "spotty";
            case 1 -> "flopper";
            case 257 -> "stripey";
            case 513 -> "glitter";
            case 769 -> "blockfish";
            case 1025 -> "betty";
            case 1281 -> "clayfish";
        };
    }

    private static <T> Dynamic<T> L(Dynamic<T> dynamic2, Dynamic<T> dynamic3) {
        Optional optional = dynamic3.get("type").result();
        if (optional.isEmpty()) {
            return dynamic2;
        }
        return dynamic2.update("minecraft:bucket_entity_data", dynamic -> dynamic.remove("type")).set("minecraft:salmon/size", (Dynamic)optional.get());
    }

    public class08600(Schema schema) {
        super(schema, false);
    }

    private static <T> Dynamic<T> y(Dynamic<T> dynamic2, Dynamic<T> dynamic3) {
        Optional var2 = dynamic3.get("Variant").asNumber().result();
        if (var2.isEmpty()) {
            return dynamic2;
        }
        String string = switch (((Number)var2.get()).intValue()) {
            default -> "lucy";
            case 1 -> "wild";
            case 2 -> "gold";
            case 3 -> "cyan";
            case 4 -> "blue";
        };
        return dynamic2.update("minecraft:bucket_entity_data", dynamic -> dynamic.remove("Variant")).set("minecraft:axolotl/variant", dynamic2.createString(string));
    }

    private static String y(int n) {
        return class02269.N((int)(n >> 24 & 0xFF));
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic2, Dynamic<T> dynamic3) {
        Optional var2 = dynamic3.get("BucketVariantTag").asNumber().result();
        if (var2.isEmpty()) {
            return dynamic2;
        }
        int n = ((Number)var2.get()).intValue();
        String string = class08600.L(n);
        String string2 = class08600.N(n);
        String string3 = class08600.y(n);
        return dynamic2.update("minecraft:bucket_entity_data", dynamic -> dynamic.remove("BucketVariantTag")).set("minecraft:tropical_fish/pattern", dynamic2.createString(string)).set("minecraft:tropical_fish/base_color", dynamic2.createString(string2)).set("minecraft:tropical_fish/pattern_color", dynamic2.createString(string3));
    }

    private static String N(int n) {
        return class02269.N((int)(n >> 16 & 0xFF));
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic) {
        Optional optional = dynamic.get("minecraft:entity_data").result();
        if (optional.isEmpty()) {
            return dynamic;
        }
        if (((Dynamic)optional.get()).get("id").asString().result().filter(string -> string.equals("minecraft:painting")).isEmpty()) {
            return dynamic;
        }
        Optional optional2 = ((Dynamic)optional.get()).get("variant").result();
        Dynamic dynamic2 = ((Dynamic)optional.get()).remove("variant");
        dynamic = dynamic2.remove("id").equals((Object)dynamic2.emptyMap()) ? dynamic.remove("minecraft:entity_data") : dynamic.set("minecraft:entity_data", dynamic2);
        if (optional2.isPresent()) {
            dynamic = dynamic.set("minecraft:painting/variant", (Dynamic)optional2.get());
        }
        return dynamic;
    }

    public final TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.l);
        OpticFinder var2 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        OpticFinder var3 = var1.findField("components");
        return this.fixTypeEverywhereTyped("ItemStack bucket_entity_data variants to separate components", var1, typed2 -> switch ((String)typed2.getOptional(var2).map(Pair::getSecond).orElse("")) {
            case "minecraft:salmon_bucket" -> typed2.updateTyped(var3, class08600::L);
            case "minecraft:axolotl_bucket" -> typed2.updateTyped(var3, class08600::y);
            case "minecraft:tropical_fish_bucket" -> typed2.updateTyped(var3, class08600::N);
            case "minecraft:painting" -> typed2.updateTyped(var3, typed -> class07536.N((Typed)typed, (Type)typed.getType(), class08600::N));
            default -> typed2;
        });
    }
}


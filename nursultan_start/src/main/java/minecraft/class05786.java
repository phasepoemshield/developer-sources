/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class05786
extends DataFix {
    private static final int[][] N = new int[][]{{0, 0, 1}, {-1, 0, 0}, {0, 0, -1}, {1, 0, 0}};

    public class05786(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private Dynamic<?> N(Dynamic<?> dynamic, boolean bl, boolean bl2) {
        if ((bl || bl2) && dynamic.get("Facing").asNumber().result().isEmpty()) {
            int n;
            if (dynamic.get("Direction").asNumber().result().isPresent()) {
                n = dynamic.get("Direction").asByte((byte)0) % N.length;
                int[] nArray = N[n];
                dynamic = dynamic.set("TileX", dynamic.createInt(dynamic.get("TileX").asInt(0) + nArray[0]));
                dynamic = dynamic.set("TileY", dynamic.createInt(dynamic.get("TileY").asInt(0) + nArray[1]));
                dynamic = dynamic.set("TileZ", dynamic.createInt(dynamic.get("TileZ").asInt(0) + nArray[2]));
                dynamic = dynamic.remove("Direction");
                if (bl2 && dynamic.get("ItemRotation").asNumber().result().isPresent()) {
                    dynamic = dynamic.set("ItemRotation", dynamic.createByte((byte)(dynamic.get("ItemRotation").asByte((byte)0) * 2)));
                }
            } else {
                n = dynamic.get("Dir").asByte((byte)0) % N.length;
                dynamic = dynamic.remove("Dir");
            }
            dynamic = dynamic.set("Facing", dynamic.createByte((byte)n));
        }
        return dynamic;
    }

    public TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getChoiceType(class06962.o, "Painting");
        OpticFinder opticFinder = DSL.namedChoice((String)"Painting", (Type)var1);
        Type var3 = this.getInputSchema().getChoiceType(class06962.o, "ItemFrame");
        OpticFinder opticFinder2 = DSL.namedChoice((String)"ItemFrame", (Type)var3);
        Type var5 = this.getInputSchema().getType(class06962.o);
        TypeRewriteRule typeRewriteRule = this.fixTypeEverywhereTyped("EntityPaintingFix", var5, typed2 -> typed2.updateTyped(opticFinder, var1, typed -> typed.update(DSL.remainderFinder(), dynamic -> this.N((Dynamic<?>)dynamic, true, false))));
        TypeRewriteRule typeRewriteRule2 = this.fixTypeEverywhereTyped("EntityItemFrameFix", var5, typed2 -> typed2.updateTyped(opticFinder2, var3, typed -> typed.update(DSL.remainderFinder(), dynamic -> this.N((Dynamic<?>)dynamic, false, true))));
        return TypeRewriteRule.seq((TypeRewriteRule)typeRewriteRule, (TypeRewriteRule)typeRewriteRule2);
    }
}


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
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class05000
 *  minecraft.class06616
 *  minecraft.class06962
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class05000;
import minecraft.class06616;
import minecraft.class06716;
import minecraft.class06962;
import org.slf4j.Logger;

public class class06726
extends DataFix {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 4096;
    private static final short L = 12;

    public class06726(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static /* synthetic */ Typed N(TaggedChoice.TaggedChoiceType taggedChoiceType, int n, int n2, IntSet intSet, Typed typed2) {
        return typed2.updateTyped(taggedChoiceType.finder(), typed -> {
            int n3;
            int n4;
            Dynamic dynamic = (Dynamic)typed.getOrCreate(DSL.remainderFinder());
            int n5 = dynamic.get("x").asInt(0) - (n << 4);
            if (intSet.contains(class06616.N((int)n5, (int)(n4 = dynamic.get("y").asInt(0)), (int)(n3 = dynamic.get("z").asInt(0) - (n2 << 4))))) {
                return typed.update(taggedChoiceType.finder(), pair -> pair.mapFirst(string -> {
                    if (!Objects.equals(string, "minecraft:chest")) {
                        N.warn("Block Entity was expected to be a chest");
                    }
                    return "minecraft:trapped_chest";
                }));
            }
            return typed;
        });
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getOutputSchema().getType(class06962.u).findFieldType("Level").findFieldType("TileEntities");
        if (!(type instanceof List.ListType)) {
            throw new IllegalStateException("Tile entity type is not a list type.");
        }
        List.ListType listType = (List.ListType)type;
        OpticFinder opticFinder = DSL.fieldFinder((String)"TileEntities", (Type)listType);
        Type type2 = this.getInputSchema().getType(class06962.u);
        OpticFinder opticFinder2 = type2.findField("Level");
        OpticFinder opticFinder3 = opticFinder2.type().findField("Sections");
        Type type3 = opticFinder3.type();
        if (!(type3 instanceof List.ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
        }
        OpticFinder opticFinder4 = DSL.typeFinder((Type)((List.ListType)type3).getElement());
        return TypeRewriteRule.seq((TypeRewriteRule)new class05000(this.getOutputSchema(), "AddTrappedChestFix", class06962.G).makeRule(), (TypeRewriteRule)this.fixTypeEverywhereTyped("Trapped Chest fix", type2, typed2 -> typed2.updateTyped(opticFinder2, typed -> {
            Optional optional = typed.getOptionalTyped(opticFinder3);
            if (optional.isEmpty()) {
                return typed;
            }
            List list = ((Typed)optional.get()).getAllTyped(opticFinder4);
            IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
            for (Typed typed2 : list) {
                class06716 class067162 = new class06716(typed2, this.getInputSchema());
                if (class067162.y()) continue;
                for (int i = 0; i < 4096; ++i) {
                    int n = class067162.u(i);
                    if (!class067162.N(n)) continue;
                    intOpenHashSet.add(class067162.L() << 12 | i);
                }
            }
            Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
            int n = dynamic.get("xPos").asInt(0);
            int n2 = dynamic.get("zPos").asInt(0);
            TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(class06962.G);
            return typed.updateTyped(opticFinder, arg_0 -> class06726.N(taggedChoiceType, n, n2, (IntSet)intOpenHashSet, arg_0));
        })));
    }
}


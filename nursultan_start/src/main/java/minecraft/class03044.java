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
 *  minecraft.class00622
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
import com.mojang.datafixers.types.templates.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00622;
import minecraft.class06962;
import minecraft.class07536;

public class class03044
extends DataFix {
    private final Set<String> N;

    public class03044(Schema schema, Set<String> set) {
        super(schema, true);
        this.N = set;
    }

    private Typed<?> N(Typed<?> typed, OpticFinder<?> opticFinder, OpticFinder<String> opticFinder2, String string) {
        Optional optional = typed.getOptionalTyped(opticFinder);
        if (optional.isEmpty()) {
            return typed;
        }
        String string2 = ((Typed)optional.get()).getOptional(opticFinder2).orElse("");
        if (!this.N.contains(string2)) {
            return typed;
        }
        return class07536.N(typed, (Type)typed.getType(), dynamic -> dynamic.remove(string));
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.l);
        OpticFinder opticFinder = type.findField("tag");
        OpticFinder opticFinder2 = opticFinder.type().findField("BlockEntityTag");
        Type type2 = this.getInputSchema().getType(class06962.o);
        OpticFinder opticFinder3 = DSL.namedChoice((String)"minecraft:falling_block", (Type)this.getInputSchema().getChoiceType(class06962.o, "minecraft:falling_block"));
        OpticFinder opticFinder4 = opticFinder3.type().findField("TileEntityData");
        Type type3 = this.getInputSchema().getType(class06962.M);
        OpticFinder opticFinder5 = type3.findField("blocks");
        OpticFinder opticFinder6 = DSL.typeFinder((Type)((List.ListType)opticFinder5.type()).getElement());
        OpticFinder opticFinder7 = opticFinder6.type().findField("nbt");
        OpticFinder opticFinder8 = DSL.fieldFinder((String)"id", (Type)class00622.N());
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("ItemRemoveBlockEntityTagFix", type, typed2 -> typed2.updateTyped(opticFinder, typed -> this.N((Typed<?>)typed, (OpticFinder<?>)opticFinder2, (OpticFinder<String>)opticFinder8, "BlockEntityTag"))), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped("FallingBlockEntityRemoveBlockEntityTagFix", type2, typed2 -> typed2.updateTyped(opticFinder3, typed -> this.N((Typed<?>)typed, (OpticFinder<?>)opticFinder4, (OpticFinder<String>)opticFinder8, "TileEntityData"))), this.fixTypeEverywhereTyped("StructureRemoveBlockEntityTagFix", type3, typed -> typed.updateTyped(opticFinder5, typed2 -> typed2.updateTyped(opticFinder6, typed -> this.N((Typed<?>)typed, (OpticFinder<?>)opticFinder7, (OpticFinder<String>)opticFinder8, "nbt")))), this.convertUnchecked("ItemRemoveBlockEntityTagFix - update block entity type", this.getInputSchema().getType(class06962.G), this.getOutputSchema().getType(class06962.G))});
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01733
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class01733;
import minecraft.class06962;

public class class02832
extends class01733 {
    public class02832(Schema schema) {
        super(schema, false, "TippedArrowPotionToItemFix", class06962.o, "minecraft:arrow");
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic2) {
        Optional optional = dynamic2.get("Potion").result();
        Optional optional2 = dynamic2.get("custom_potion_effects").result();
        Optional optional3 = dynamic2.get("Color").result();
        if (optional.isEmpty() && optional2.isEmpty() && optional3.isEmpty()) {
            return dynamic2;
        }
        return dynamic2.remove("Potion").remove("custom_potion_effects").remove("Color").update("item", dynamic -> {
            Dynamic dynamic2 = dynamic.get("tag").orElseEmptyMap();
            if (optional.isPresent()) {
                dynamic2 = dynamic2.set("Potion", (Dynamic)optional.get());
            }
            if (optional2.isPresent()) {
                dynamic2 = dynamic2.set("custom_potion_effects", (Dynamic)optional2.get());
            }
            if (optional3.isPresent()) {
                dynamic2 = dynamic2.set("CustomPotionColor", (Dynamic)optional3.get());
            }
            return dynamic.set("tag", dynamic2);
        });
    }
}


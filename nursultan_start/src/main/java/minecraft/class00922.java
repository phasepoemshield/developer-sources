/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06069
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class00955;
import minecraft.class06069;
import minecraft.class06962;

public class class00922
extends class00955 {
    private static final int L = 6;

    public class00922(Schema schema, boolean bl) {
        super(schema, bl, "EntityZombieVillagerTypeFix", class06962.o, "Zombie");
    }

    @Override
    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }

    private int N(int n) {
        if (n < 0 || n >= 6) {
            return -1;
        }
        return n;
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        if (dynamic.get("IsVillager").asBoolean(false)) {
            if (dynamic.get("ZombieType").result().isEmpty()) {
                int n = this.N(dynamic.get("VillagerProfession").asInt(-1));
                if (n == -1) {
                    n = this.N(class06069.u().y(6));
                }
                dynamic = dynamic.set("ZombieType", dynamic.createInt(n));
            }
            dynamic = dynamic.remove("IsVillager");
        }
        return dynamic;
    }
}


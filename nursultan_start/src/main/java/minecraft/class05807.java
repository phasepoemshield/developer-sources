/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;
import minecraft.class06962;

public class class05807
extends DataFix {
    private static final Set<String> N = Sets.newHashSet((Object[])new String[]{"ArmorStand", "Bat", "Blaze", "CaveSpider", "Chicken", "Cow", "Creeper", "EnderDragon", "Enderman", "Endermite", "EntityHorse", "Ghast", "Giant", "Guardian", "LavaSlime", "MushroomCow", "Ozelot", "Pig", "PigZombie", "Rabbit", "Sheep", "Shulker", "Silverfish", "Skeleton", "Slime", "SnowMan", "Spider", "Squid", "Villager", "VillagerGolem", "Witch", "WitherBoss", "Wolf", "Zombie"});

    public class05807(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        float f;
        Optional var3 = dynamic.get("HealF").asNumber().result();
        Optional var4 = dynamic.get("Health").asNumber().result();
        if (var3.isPresent()) {
            f = ((Number)var3.get()).floatValue();
            dynamic = dynamic.remove("HealF");
        } else if (var4.isPresent()) {
            f = ((Number)var4.get()).floatValue();
        } else {
            return dynamic;
        }
        return dynamic.set("Health", dynamic.createFloat(f));
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityHealthFix", this.getInputSchema().getType(class06962.o), typed -> typed.update(DSL.remainderFinder(), this::N));
    }
}


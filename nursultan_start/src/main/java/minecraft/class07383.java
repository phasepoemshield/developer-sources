/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
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
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class02269;
import minecraft.class06962;
import org.jspecify.annotations.Nullable;

public class class07383
extends DataFix {
    private static final @Nullable String[] N = (String[])DataFixUtils.make((Object)new String[256], stringArray -> {
        stringArray[1] = "Item";
        stringArray[2] = "XPOrb";
        stringArray[7] = "ThrownEgg";
        stringArray[8] = "LeashKnot";
        stringArray[9] = "Painting";
        stringArray[10] = "Arrow";
        stringArray[11] = "Snowball";
        stringArray[12] = "Fireball";
        stringArray[13] = "SmallFireball";
        stringArray[14] = "ThrownEnderpearl";
        stringArray[15] = "EyeOfEnderSignal";
        stringArray[16] = "ThrownPotion";
        stringArray[17] = "ThrownExpBottle";
        stringArray[18] = "ItemFrame";
        stringArray[19] = "WitherSkull";
        stringArray[20] = "PrimedTnt";
        stringArray[21] = "FallingSand";
        stringArray[22] = "FireworksRocketEntity";
        stringArray[23] = "TippedArrow";
        stringArray[24] = "SpectralArrow";
        stringArray[25] = "ShulkerBullet";
        stringArray[26] = "DragonFireball";
        stringArray[30] = "ArmorStand";
        stringArray[41] = "Boat";
        stringArray[42] = "MinecartRideable";
        stringArray[43] = "MinecartChest";
        stringArray[44] = "MinecartFurnace";
        stringArray[45] = "MinecartTNT";
        stringArray[46] = "MinecartHopper";
        stringArray[47] = "MinecartSpawner";
        stringArray[40] = "MinecartCommandBlock";
        stringArray[50] = "Creeper";
        stringArray[51] = "Skeleton";
        stringArray[52] = "Spider";
        stringArray[53] = "Giant";
        stringArray[54] = "Zombie";
        stringArray[55] = "Slime";
        stringArray[56] = "Ghast";
        stringArray[57] = "PigZombie";
        stringArray[58] = "Enderman";
        stringArray[59] = "CaveSpider";
        stringArray[60] = "Silverfish";
        stringArray[61] = "Blaze";
        stringArray[62] = "LavaSlime";
        stringArray[63] = "EnderDragon";
        stringArray[64] = "WitherBoss";
        stringArray[65] = "Bat";
        stringArray[66] = "Witch";
        stringArray[67] = "Endermite";
        stringArray[68] = "Guardian";
        stringArray[69] = "Shulker";
        stringArray[90] = "Pig";
        stringArray[91] = "Sheep";
        stringArray[92] = "Cow";
        stringArray[93] = "Chicken";
        stringArray[94] = "Squid";
        stringArray[95] = "Wolf";
        stringArray[96] = "MushroomCow";
        stringArray[97] = "SnowMan";
        stringArray[98] = "Ozelot";
        stringArray[99] = "VillagerGolem";
        stringArray[100] = "EntityHorse";
        stringArray[101] = "Rabbit";
        stringArray[120] = "Villager";
        stringArray[200] = "EnderCrystal";
    });

    public class07383(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        Type var2 = schema.getType(class06962.l);
        OpticFinder var3 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        OpticFinder var4 = DSL.fieldFinder((String)"id", (Type)DSL.string());
        OpticFinder var5 = var2.findField("tag");
        OpticFinder var6 = var5.type().findField("EntityTag");
        OpticFinder opticFinder = DSL.typeFinder((Type)schema.getTypeRaw(class06962.o));
        return this.fixTypeEverywhereTyped("ItemSpawnEggFix", var2, typed2 -> {
            Optional optional = typed2.getOptional(var3);
            if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:spawn_egg")) {
                Typed var13;
                Dynamic var7 = (Dynamic)typed2.get(DSL.remainderFinder());
                short s = var7.get("Damage").asShort((short)0);
                Optional optional2 = typed2.getOptionalTyped(var5).flatMap(typed -> typed.getOptionalTyped(var6)).flatMap(typed -> typed.getOptionalTyped(opticFinder)).flatMap(typed -> typed.getOptional(var4));
                Typed typed3 = typed2;
                String string = N[s & 0xFF];
                if (string != null && (optional2.isEmpty() || !Objects.equals(optional2.get(), string))) {
                    Typed typed4 = typed2.getOrCreateTyped(var5);
                    Dynamic var16 = (Dynamic)DataFixUtils.orElse(typed4.getOptionalTyped(var6).map(typed -> (Dynamic)typed.write().getOrThrow()), (Object)var7.emptyMap());
                    Dynamic dynamic = var16.set("id", var16.createString(string));
                    var13 = typed3.set(var5, class02269.N((Typed)typed4, (OpticFinder)var6, (Dynamic)dynamic));
                }
                if (s != 0) {
                    Dynamic dynamic = var7.set("Damage", var7.createShort((short)0));
                    typed3 = var13.set(DSL.remainderFinder(), (Object)dynamic);
                }
                return typed3;
            }
            return typed2;
        });
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00496
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02903
 *  minecraft.class02950
 *  minecraft.class03448
 *  minecraft.class03507
 *  minecraft.class03729
 *  minecraft.class03762
 *  minecraft.class03774
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04493
 *  minecraft.class05034
 *  minecraft.class05654
 *  minecraft.class05721
 *  minecraft.class05838
 *  minecraft.class05857
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class06487
 *  minecraft.class06489
 *  minecraft.class06490
 *  minecraft.class06491
 *  minecraft.class06496
 *  minecraft.class06498
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06523
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07283
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07325
 *  minecraft.class07329
 *  minecraft.class07482
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 */
package com.viaversion.viafabricplus.features.recipe;

import com.viaversion.viafabricplus.features.recipe.AddBannerPatternRecipe;
import com.viaversion.viafabricplus.features.recipe.RecipeManager1_11_2;
import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2$LegacyRecipe;
import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2$LegacyShapedRecipe;
import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2$LegacyShapelessRecipe;
import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2$LegacySmeltingRecipe;
import com.viaversion.viafabricplus.features.recipe.ShulkerBoxColoringRecipe;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import minecraft.class00496;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02903;
import minecraft.class02950;
import minecraft.class03448;
import minecraft.class03507;
import minecraft.class03729;
import minecraft.class03762;
import minecraft.class03774;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04493;
import minecraft.class05034;
import minecraft.class05654;
import minecraft.class05721;
import minecraft.class05838;
import minecraft.class05857;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06487;
import minecraft.class06489;
import minecraft.class06490;
import minecraft.class06491;
import minecraft.class06496;
import minecraft.class06498;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06523;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07283;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07325;
import minecraft.class07329;
import minecraft.class07482;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public final class Recipes1_11_2 {
    private static final List<class05034<Recipes1_11_2$LegacyRecipe, ProtocolVersionRange>> LEGACY_RECIPES = new ArrayList<class05034<Recipes1_11_2$LegacyRecipe, ProtocolVersionRange>>();
    private static RecipeManager1_11_2 RECIPE_MANAGER;

    public static void reset() {
        RECIPE_MANAGER = null;
    }

    public static void init() {
        if (!LEGACY_RECIPES.isEmpty()) {
            throw new IllegalStateException("Recipes1_11_2 is already initialized");
        }
        JsonArray jsonArray = ViaFabricPlusMappingDataLoader.INSTANCE.loadData("recipes-1.11.2.json").getAsJsonArray("");
        block10: for (JsonElement jsonElement : jsonArray) {
            String string = jsonElement.getAsJsonObject().get("type").getAsString();
            ProtocolVersionRange protocolVersionRange = ProtocolVersionRange.fromString((String)jsonElement.getAsJsonObject().get("version").getAsString());
            switch (string) {
                case "shaped": {
                    LEGACY_RECIPES.add((class05034<Recipes1_11_2$LegacyRecipe, ProtocolVersionRange>)new class05034((Object)Recipes1_11_2$LegacyShapedRecipe.fromJson(jsonElement.getAsJsonObject()), (Object)protocolVersionRange));
                    continue block10;
                }
                case "shapeless": {
                    LEGACY_RECIPES.add((class05034<Recipes1_11_2$LegacyRecipe, ProtocolVersionRange>)new class05034((Object)Recipes1_11_2$LegacyShapelessRecipe.fromJson(jsonElement.getAsJsonObject()), (Object)protocolVersionRange));
                    continue block10;
                }
                case "smelting": {
                    LEGACY_RECIPES.add((class05034<Recipes1_11_2$LegacyRecipe, ProtocolVersionRange>)new class05034((Object)Recipes1_11_2$LegacySmeltingRecipe.fromJson(jsonElement.getAsJsonObject()), (Object)protocolVersionRange));
                    continue block10;
                }
            }
            throw new IllegalArgumentException("Unknown recipe type: " + string);
        }
    }

    public static void setCraftingResultSlot(int n, class07482 class074822, class03507 class035072) {
        class01683 class016832 = class06202.Nq().NE();
        class03448 class034482 = (class03448)class06202.Nq().T_3;
        class02903 class029032 = class035072.u();
        class06584 class065842 = Recipes1_11_2.getRecipeManager().getFirstMatch(class05838.N, class029032, (class07299)class034482).map(class037292 -> ((class05857)class037292.y()).method_8116((class02950)class029032, (class01929)class016832.j())).orElse(class06584.E);
        class016832.N(new class00496(n, class074822.z(), 0, class065842));
    }

    static class06581 getItemById(class01894 class018942) {
        class06581 class065812 = class04206.B.y(class018942).orElse(null);
        if (class065812 == null) {
            throw new IllegalStateException("Unknown item: " + class018942.toString());
        }
        return class065812;
    }

    /*
     * Could not resolve type clashes
     */
    public static RecipeManager1_11_2 getRecipeManager() {
        if (RECIPE_MANAGER == null) {
            Recipes1_11_2$LegacyRecipe recipes1_11_2$LegacyRecipe;
            ArrayList arrayList = new ArrayList();
            block5: for (int i = 0; i < LEGACY_RECIPES.size(); ++i) {
                class05034<Recipes1_11_2$LegacyRecipe, ProtocolVersionRange> class050342 = LEGACY_RECIPES.get(i);
                if (!((ProtocolVersionRange)class050342.y()).contains(ProtocolTranslator.getTargetVersion())) continue;
                class05946 class059462 = class05946.N((class05946)class04227.yV, (class01894)class01894.N((String)"viafabricplus", (String)("recipe/" + i)));
                Objects.requireNonNull((Recipes1_11_2$LegacyRecipe)class050342.N());
                int n = 0;
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{Recipes1_11_2$LegacyShapedRecipe.class, Recipes1_11_2$LegacyShapelessRecipe.class, Recipes1_11_2$LegacySmeltingRecipe.class}, (Object)recipes1_11_2$LegacyRecipe, (int)n)) {
                    case 0: {
                        Object object;
                        Object object22;
                        Recipes1_11_2$LegacyShapedRecipe recipes1_11_2$LegacyShapedRecipe = (Recipes1_11_2$LegacyShapedRecipe)recipes1_11_2$LegacyRecipe;
                        Object object3 = new HashMap();
                        for (Object object22 : recipes1_11_2$LegacyShapedRecipe.legend.entrySet()) {
                            object = new class07310[((List)object22.getValue()).size()];
                            for (int j = 0; j < ((List)object22.getValue()).size(); ++j) {
                                object[j] = (class07310)((List)object22.getValue()).get(j);
                            }
                            object3.put((Character)object22.getKey(), class06510.method_8091((class07310[])object));
                        }
                        Object object4 = recipes1_11_2$LegacyShapedRecipe.result.toItemStack();
                        object22 = new class07329(recipes1_11_2$LegacyShapedRecipe.group, class03762.field_40251, class04493.N((Map)object3, recipes1_11_2$LegacyShapedRecipe.pattern), (class06584)object4, false);
                        arrayList.add(new class03729(class059462, (class06521)object22));
                        continue block5;
                    }
                    case 1: {
                        class05654 class056542;
                        Object object3 = (Recipes1_11_2$LegacyShapelessRecipe)recipes1_11_2$LegacyRecipe;
                        Object object4 = ((Recipes1_11_2$LegacyShapelessRecipe)object3).result.toItemStack();
                        Object object22 = new ArrayList();
                        for (List list : ((Recipes1_11_2$LegacyShapelessRecipe)object3).ingredients) {
                            class056542 = new class07310[list.size()];
                            for (int j = 0; j < list.size(); ++j) {
                                class056542[j] = (class07310)list.get(j);
                            }
                            object22.add(class06510.method_8091((class07310[])class056542));
                        }
                        Object object = new class06523(((Recipes1_11_2$LegacyShapelessRecipe)object3).group, class03762.field_40251, (class06584)object4, (List)object22);
                        arrayList.add(new class03729(class059462, (class06521)object));
                        continue block5;
                    }
                    case 2: {
                        Object object4 = (Recipes1_11_2$LegacySmeltingRecipe)recipes1_11_2$LegacyRecipe;
                        Object object22 = ((Recipes1_11_2$LegacySmeltingRecipe)object4).result.toItemStack();
                        Object object = new class07310[((Recipes1_11_2$LegacySmeltingRecipe)object4).input.size()];
                        for (int j = 0; j < ((Recipes1_11_2$LegacySmeltingRecipe)object4).input.size(); ++j) {
                            object[j] = (class07310)((Recipes1_11_2$LegacySmeltingRecipe)object4).input.get(j);
                        }
                        class06510 class065102 = class06510.method_8091((class07310[])object);
                        class05654 class056542 = new class05654("", class03774.field_40244, class065102, (class06584)object22, ((Recipes1_11_2$LegacySmeltingRecipe)object4).experience, 200);
                        arrayList.add(new class03729(class059462, (class06521)class056542));
                        continue block5;
                    }
                    default: {
                        throw new IllegalStateException("Unknown legacy recipe type: " + String.valueOf(((Recipes1_11_2$LegacyRecipe)class050342.N()).getClass()));
                    }
                }
            }
            ArrayList<Object> arrayList2 = new ArrayList<Object>();
            if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_4_2)) {
                arrayList2.add(new class06496(class03762.field_40251));
                arrayList2.add(new class06489(class03762.field_40251));
                arrayList2.add(new class06487(class03762.field_40251));
            }
            if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) {
                arrayList2.add(new class06491(class03762.field_40251));
            }
            if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_11)) {
                arrayList2.add((Object)new ShulkerBoxColoringRecipe(class03762.field_40251));
            }
            if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
                arrayList2.add(new class07283(class03762.field_40251));
                arrayList2.add(new class07325(class03762.field_40251));
            }
            if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_8)) {
                arrayList2.add(new class05721(class03762.field_40251));
                arrayList2.add(new class06498(class03762.field_40251));
                arrayList2.add((Object)new AddBannerPatternRecipe(class03762.field_40251));
            }
            if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_7_2)) {
                arrayList2.add(new class06490(class03762.field_40251));
            }
            for (class05946 class059462 : arrayList2) {
                recipes1_11_2$LegacyRecipe = class05946.N((class05946)class04227.yV, (class01894)class01894.N((String)"viafabricplus", (String)("recipe/special_" + class059462.getClass().getSimpleName().replace("Recipe", "").toLowerCase(Locale.ROOT))));
                arrayList.add(new class03729((class05946)recipes1_11_2$LegacyRecipe, (class06521)class059462));
            }
            RECIPE_MANAGER = new RecipeManager1_11_2(arrayList);
        }
        return RECIPE_MANAGER;
    }
}


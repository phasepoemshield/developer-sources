/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class05649
 *  minecraft.class05663
 *  minecraft.class05672
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper$VillagerOffersAdder
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.fabricmc.fabric.impl.object.builder;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class05649;
import minecraft.class05663;
import minecraft.class05672;
import minecraft.class05946;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import org.apache.commons.lang3.ArrayUtils;

public final class TradeOfferInternals {
    private TradeOfferInternals() {
    }

    public static synchronized void registerVillagerOffers(class05946<class05672> class059463, int n, TradeOfferHelper.VillagerOffersAdder villagerOffersAdder) {
        Objects.requireNonNull(class059463, "VillagerProfession may not be null.");
        TradeOfferInternals.initVillagerTrades();
        TradeOfferInternals.registerOffers((Int2ObjectMap<class05663[]>)class05649.N.computeIfAbsent(class059463, class059462 -> new Int2ObjectOpenHashMap()), n, list -> villagerOffersAdder.onRegister(list, false));
        TradeOfferInternals.registerOffers((Int2ObjectMap<class05663[]>)class05649.L.computeIfAbsent(class059463, class059462 -> new Int2ObjectOpenHashMap()), n, list -> villagerOffersAdder.onRegister(list, true));
    }

    private static void initVillagerTrades() {
        if (!(class05649.L instanceof HashMap)) {
            HashMap<class05946, Int2ObjectMap> hashMap = new HashMap<class05946, Int2ObjectMap>(class05649.L);
            for (Map.Entry entry : class05649.N.entrySet()) {
                if (hashMap.containsKey(entry.getKey())) continue;
                hashMap.put((class05946)entry.getKey(), (Int2ObjectMap)entry.getValue());
            }
            class05649.L = hashMap;
        }
    }

    private static void registerOffers(Int2ObjectMap<class05663[]> int2ObjectMap, int n2, Consumer<List<class05663>> consumer) {
        ArrayList arrayList = new ArrayList();
        consumer.accept(arrayList);
        Object[] objectArray = (class05663[])int2ObjectMap.computeIfAbsent(n2, n -> new class05663[0]);
        Object[] objectArray2 = arrayList.toArray(new class05663[0]);
        class05663[] class05663Array = (class05663[])ArrayUtils.addAll((Object[])objectArray, (Object[])objectArray2);
        int2ObjectMap.put(n2, (Object)class05663Array);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class01894
 *  minecraft.class05649
 *  minecraft.class05663
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper$WanderingTraderOffersBuilder
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.tuple.Pair
 */
package net.fabricmc.fabric.impl.object.builder;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class01894;
import minecraft.class05649;
import minecraft.class05663;
import minecraft.class07536;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;

public class TradeOfferInternals$WanderingTraderOffersBuilderImpl
implements TradeOfferHelper.WanderingTraderOffersBuilder {
    private static final Object2IntMap<class01894> ID_TO_INDEX = (Object2IntMap)class07536.N((Object)new Object2IntOpenHashMap(), object2IntOpenHashMap -> {
        object2IntOpenHashMap.put((Object)BUY_ITEMS_POOL, 0);
        object2IntOpenHashMap.put((Object)SELL_SPECIAL_ITEMS_POOL, 1);
        object2IntOpenHashMap.put((Object)SELL_COMMON_ITEMS_POOL, 2);
    });
    private static final Map<class01894, class05663[]> DELAYED_MODIFICATIONS = new HashMap<class01894, class05663[]>();

    public TradeOfferHelper.WanderingTraderOffersBuilder pool(class01894 class018942, int n, class05663 ... class05663Array) {
        if (class05663Array.length == 0) {
            throw new IllegalArgumentException("cannot add empty pool");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("count must be positive");
        }
        Objects.requireNonNull(class018942, "id cannot be null");
        if (ID_TO_INDEX.containsKey((Object)class018942)) {
            throw new IllegalArgumentException("pool id %s is already registered".formatted(new Object[]{class018942}));
        }
        Pair pair = Pair.of((Object)class05663Array, (Object)n);
        TradeOfferInternals$WanderingTraderOffersBuilderImpl.initWanderingTraderTrades();
        ID_TO_INDEX.put((Object)class018942, class05649.y.size());
        class05649.y.add(pair);
        class05663[] class05663Array2 = DELAYED_MODIFICATIONS.remove(class018942);
        if (class05663Array2 != null) {
            this.addOffersToPool(class018942, class05663Array2);
        }
        return this;
    }

    static void initWanderingTraderTrades() {
        if (!(class05649.y instanceof ArrayList)) {
            class05649.y = new ArrayList(class05649.y);
        }
    }

    public TradeOfferHelper.WanderingTraderOffersBuilder addOffersToPool(class01894 class018943, class05663 ... class05663Array) {
        if (!ID_TO_INDEX.containsKey((Object)class018943)) {
            DELAYED_MODIFICATIONS.compute(class018943, (class018942, class05663Array2) -> {
                if (class05663Array2 == null) {
                    return class05663Array;
                }
                return (class05663[])ArrayUtils.addAll((Object[])class05663Array2, (Object[])class05663Array);
            });
            return this;
        }
        int n = ID_TO_INDEX.getInt((Object)class018943);
        TradeOfferInternals$WanderingTraderOffersBuilderImpl.initWanderingTraderTrades();
        Pair pair = (Pair)class05649.y.get(n);
        class05663[] class05663Array3 = (class05663[])ArrayUtils.addAll((Object[])((class05663[])pair.getLeft()), (Object[])class05663Array);
        class05649.y.set(n, Pair.of((Object)class05663Array3, (Object)((Integer)pair.getRight())));
        return this;
    }
}


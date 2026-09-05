/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class05663
 */
package net.fabricmc.fabric.api.object.builder.v1.trade;

import java.util.Collection;
import minecraft.class01894;
import minecraft.class05663;

public interface TradeOfferHelper$WanderingTraderOffersBuilder {
    public static final class01894 BUY_ITEMS_POOL = class01894.y((String)"buy_items");
    public static final class01894 SELL_SPECIAL_ITEMS_POOL = class01894.y((String)"sell_special_items");
    public static final class01894 SELL_COMMON_ITEMS_POOL = class01894.y((String)"sell_common_items");

    default public TradeOfferHelper$WanderingTraderOffersBuilder addAll(class01894 class018942, class05663 ... class05663Array) {
        return this.pool(class018942, class05663Array.length, class05663Array);
    }

    default public TradeOfferHelper$WanderingTraderOffersBuilder addAll(class01894 class018942, Collection<? extends class05663> collection) {
        return this.pool(class018942, collection.size(), collection);
    }

    public TradeOfferHelper$WanderingTraderOffersBuilder pool(class01894 var1, int var2, class05663 ... var3);

    default public TradeOfferHelper$WanderingTraderOffersBuilder pool(class01894 class018942, int n, Collection<? extends class05663> collection) {
        return this.pool(class018942, n, (class05663[])collection.toArray(class05663[]::new));
    }

    default public TradeOfferHelper$WanderingTraderOffersBuilder addOffersToPool(class01894 class018942, Collection<class05663> collection) {
        return this.addOffersToPool(class018942, (class05663[])collection.toArray(class05663[]::new));
    }

    public TradeOfferHelper$WanderingTraderOffersBuilder addOffersToPool(class01894 var1, class05663 ... var2);
}


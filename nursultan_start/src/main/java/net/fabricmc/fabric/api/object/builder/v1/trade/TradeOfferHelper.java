/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05663
 *  minecraft.class05672
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.object.builder.TradeOfferInternals
 *  net.fabricmc.fabric.impl.object.builder.TradeOfferInternals$WanderingTraderOffersBuilderImpl
 */
package net.fabricmc.fabric.api.object.builder.v1.trade;

import java.util.List;
import java.util.function.Consumer;
import minecraft.class05663;
import minecraft.class05672;
import minecraft.class05946;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper$VillagerOffersAdder;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper$WanderingTraderOffersBuilder;
import net.fabricmc.fabric.impl.object.builder.TradeOfferInternals;

public final class TradeOfferHelper {
    private TradeOfferHelper() {
    }

    public static void registerVillagerOffers(class05946<class05672> class059462, int n, TradeOfferHelper$VillagerOffersAdder tradeOfferHelper$VillagerOffersAdder) {
        TradeOfferInternals.registerVillagerOffers(class059462, (int)n, (TradeOfferHelper$VillagerOffersAdder)tradeOfferHelper$VillagerOffersAdder);
    }

    public static void registerVillagerOffers(class05946<class05672> class059462, int n, Consumer<List<class05663>> consumer) {
        TradeOfferInternals.registerVillagerOffers(class059462, (int)n, (list, bl) -> consumer.accept(list));
    }

    public static synchronized void registerWanderingTraderOffers(Consumer<TradeOfferHelper$WanderingTraderOffersBuilder> consumer) {
        consumer.accept((TradeOfferHelper$WanderingTraderOffersBuilder)new TradeOfferInternals.WanderingTraderOffersBuilderImpl());
    }
}


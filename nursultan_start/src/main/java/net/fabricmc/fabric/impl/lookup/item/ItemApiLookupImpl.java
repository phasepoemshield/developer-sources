/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap
 *  net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup
 *  net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup$ItemApiProvider
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.lookup.item;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItemApiLookupImpl<A, C>
implements ItemApiLookup<A, C> {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-api-lookup-api-v1/item");
    private static final ApiLookupMap<ItemApiLookup<?, ?>> LOOKUPS = ApiLookupMap.create(ItemApiLookupImpl::new);
    private final class01894 identifier;
    private final Class<A> apiClass;
    private final Class<C> contextClass;
    private final ApiProviderMap<class06581, ItemApiLookup.ItemApiProvider<A, C>> providerMap = ApiProviderMap.create();
    private final List<ItemApiLookup.ItemApiProvider<A, C>> fallbackProviders = new CopyOnWriteArrayList<ItemApiLookup.ItemApiProvider<A, C>>();

    public // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable ItemApiLookup.ItemApiProvider<A, C> getProvider(class06581 class065812) {
        return (ItemApiLookup.ItemApiProvider)this.providerMap.get((Object)class065812);
    }

    private ItemApiLookupImpl(class01894 class018942, Class<?> clazz, Class<?> clazz2) {
        this.identifier = class018942;
        this.apiClass = clazz;
        this.contextClass = clazz2;
    }

    public static <A, C> ItemApiLookup<A, C> get(class01894 class018942, Class<A> clazz, Class<C> clazz2) {
        return (ItemApiLookup)LOOKUPS.getLookup(class018942, clazz, clazz2);
    }

    public @Nullable A find(class06584 class065842, C c) {
        Object object;
        Objects.requireNonNull(class065842, "ItemStack may not be null.");
        ItemApiLookup.ItemApiProvider itemApiProvider = (ItemApiLookup.ItemApiProvider)this.providerMap.get((Object)class065842.B());
        if (itemApiProvider != null && (object = itemApiProvider.find(class065842, c)) != null) {
            return (A)object;
        }
        for (ItemApiLookup.ItemApiProvider itemApiProvider2 : this.fallbackProviders) {
            Object object2 = itemApiProvider2.find(class065842, c);
            if (object2 == null) continue;
            return (A)object2;
        }
        return null;
    }

    public class01894 getId() {
        return this.identifier;
    }

    public Class<A> apiClass() {
        return this.apiClass;
    }

    public void registerSelf(class07310 ... class07310Array) {
        for (class07310 class073102 : class07310Array) {
            class06581 class065812 = class073102.B();
            if (this.apiClass.isAssignableFrom(class065812.getClass())) continue;
            String string = String.format("Failed to register self-implementing items. API class %s is not assignable from item class %s.", this.apiClass.getCanonicalName(), class065812.getClass().getCanonicalName());
            throw new IllegalArgumentException(string);
        }
        this.registerForItems((class065842, object) -> class065842.B(), class07310Array);
    }

    public void registerFallback(ItemApiLookup.ItemApiProvider<A, C> itemApiProvider) {
        Objects.requireNonNull(itemApiProvider, "ItemApiProvider may not be null.");
        this.fallbackProviders.add(itemApiProvider);
    }

    public Class<C> contextClass() {
        return this.contextClass;
    }

    public void registerForItems(ItemApiLookup.ItemApiProvider<A, C> itemApiProvider, class07310 ... class07310Array) {
        Objects.requireNonNull(itemApiProvider, "ItemApiProvider may not be null.");
        if (class07310Array.length == 0) {
            throw new IllegalArgumentException("Must register at least one ItemConvertible instance with an ItemApiProvider.");
        }
        for (class07310 class073102 : class07310Array) {
            class06581 class065812 = class073102.B();
            Objects.requireNonNull(class065812, "Item convertible in item form may not be null.");
            if (this.providerMap.putIfAbsent((Object)class065812, itemApiProvider) == null) continue;
            LOGGER.warn("Encountered duplicate API provider registration for item: " + String.valueOf(class04206.B.y((Object)class065812)));
        }
    }
}


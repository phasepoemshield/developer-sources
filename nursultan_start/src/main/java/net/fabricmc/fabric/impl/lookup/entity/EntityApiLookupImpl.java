/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class04206
 *  minecraft.class06113
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap
 *  net.fabricmc.fabric.api.lookup.v1.entity.EntityApiLookup
 *  net.fabricmc.fabric.api.lookup.v1.entity.EntityApiLookup$EntityApiProvider
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.lookup.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class04206;
import minecraft.class06113;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07299;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap;
import net.fabricmc.fabric.api.lookup.v1.entity.EntityApiLookup;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntityApiLookupImpl<A, C>
implements EntityApiLookup<A, C> {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-api-lookup-api-v1/entity");
    private static final ApiLookupMap<EntityApiLookup<?, ?>> LOOKUPS = ApiLookupMap.create(EntityApiLookupImpl::new);
    private static final Map<Class<?>, Set<class07078<?>>> REGISTERED_SELVES = new HashMap();
    private static boolean checkEntityLookup = true;
    private final class01894 identifier;
    private final Class<A> apiClass;
    private final Class<C> contextClass;
    private final ApiProviderMap<class07078<?>, EntityApiLookup.EntityApiProvider<A, C>> providerMap = ApiProviderMap.create();
    private final List<EntityApiLookup.EntityApiProvider<A, C>> fallbackProviders = new CopyOnWriteArrayList<EntityApiLookup.EntityApiProvider<A, C>>();

    public // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable EntityApiLookup.EntityApiProvider<A, C> getProvider(class07078<?> class070782) {
        return (EntityApiLookup.EntityApiProvider)this.providerMap.get(class070782);
    }

    private EntityApiLookupImpl(class01894 class018942, Class<A> clazz, Class<C> clazz2) {
        this.identifier = class018942;
        this.apiClass = clazz;
        this.contextClass = clazz2;
    }

    public static <A, C> EntityApiLookup<A, C> get(class01894 class018942, Class<A> clazz, Class<C> clazz2) {
        return (EntityApiLookup)LOOKUPS.getLookup(class018942, clazz, clazz2);
    }

    public @Nullable A find(class07049 class070492, C c) {
        Objects.requireNonNull(class070492, "Entity may not be null.");
        if (class07042.N.test(class070492)) {
            Object object;
            EntityApiLookup.EntityApiProvider entityApiProvider = (EntityApiLookup.EntityApiProvider)this.providerMap.get((Object)class070492.method_5864());
            if (entityApiProvider != null && (object = entityApiProvider.find(class070492, c)) != null) {
                return (A)object;
            }
            for (EntityApiLookup.EntityApiProvider entityApiProvider2 : this.fallbackProviders) {
                Object object2 = entityApiProvider2.find(class070492, c);
                if (object2 == null) continue;
                return (A)object2;
            }
        }
        return null;
    }

    public class01894 getId() {
        return this.identifier;
    }

    public Class<A> apiClass() {
        return this.apiClass;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void checkSelfImplementingTypes(class02796 class027962) {
        if (checkEntityLookup) {
            checkEntityLookup = false;
            Map<Class<?>, Set<class07078<?>>> map = REGISTERED_SELVES;
            synchronized (map) {
                REGISTERED_SELVES.forEach((clazz, set) -> {
                    for (class07078 class070782 : set) {
                        class07049 class070492 = class070782.N((class07299)class027962.NY(), class06113.field_52444);
                        if (class070492 == null) {
                            String string = String.format("Failed to register self-implementing entities for API class %s. Can not create entity of type %s.", clazz.getCanonicalName(), class04206.M.y((Object)class070782));
                            throw new NullPointerException(string);
                        }
                        if (clazz.isInstance(class070492)) continue;
                        String string = String.format("Failed to register self-implementing entities. API class %s is not assignable from entity class %s.", clazz.getCanonicalName(), class070492.getClass().getCanonicalName());
                        throw new IllegalArgumentException(string);
                    }
                });
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void registerSelf(class07078<?> ... class07078Array) {
        Map<Class<?>, Set<class07078<?>>> map = REGISTERED_SELVES;
        synchronized (map) {
            REGISTERED_SELVES.computeIfAbsent(this.apiClass, clazz -> new LinkedHashSet()).addAll(Arrays.asList(class07078Array));
        }
        this.registerForTypes((class070492, object) -> class070492, class07078Array);
    }

    public void registerFallback(EntityApiLookup.EntityApiProvider<A, C> entityApiProvider) {
        Objects.requireNonNull(entityApiProvider, "EntityApiProvider may not be null.");
        this.fallbackProviders.add(entityApiProvider);
    }

    public void registerForTypes(EntityApiLookup.EntityApiProvider<A, C> entityApiProvider, class07078<?> ... class07078Array) {
        Objects.requireNonNull(entityApiProvider, "EntityApiProvider may not be null.");
        if (class07078Array.length == 0) {
            throw new IllegalArgumentException("Must register at least one EntityType instance with an EntityApiProvider.");
        }
        for (class07078<?> class070782 : class07078Array) {
            if (this.providerMap.putIfAbsent(class070782, entityApiProvider) == null) continue;
            LOGGER.warn("Encountered duplicate API provider registration for entity type: " + String.valueOf(class04206.M.y(class070782)));
        }
    }

    public Class<C> contextClass() {
        return this.contextClass;
    }
}


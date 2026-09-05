/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01129
 *  minecraft.class01234
 *  minecraft.class04218
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07309
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.client.ClientWorldAccessor
 *  net.caffeinemc.mods.lithium.common.entity.EntityClassGroup
 *  net.caffeinemc.mods.lithium.common.entity.EntityClassGroup$NoDragonClassGroup
 *  net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate
 *  net.caffeinemc.mods.lithium.common.services.PlatformEntityAccess
 */
package net.caffeinemc.mods.lithium.common.world;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00734;
import minecraft.class01129;
import minecraft.class01234;
import minecraft.class04218;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07309;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.client.ClientWorldAccessor;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.services.PlatformEntityAccess;
import net.caffeinemc.mods.lithium.common.world.ClimbingMobCachingSection;
import net.caffeinemc.mods.lithium.common.world.chunk.ClassGroupFilterableList;
import net.caffeinemc.mods.lithium.mixin.util.accessors.EntitySectionAccessor;
import net.caffeinemc.mods.lithium.mixin.util.accessors.PersistentEntitySectionManagerAccessor;
import net.caffeinemc.mods.lithium.mixin.util.accessors.ServerLevelAccessor;
import net.caffeinemc.mods.lithium.mixin.util.accessors.TransientEntitySectionManagerAccessor;

public class WorldHelper {
    public static final boolean CUSTOM_TYPE_FILTERABLE_LIST_DISABLED = !ClassGroupFilterableList.class.isAssignableFrom(class01234.class);

    public static List<class07049> getEntitiesOfEntityGroupPlusDragonPieces(class07299 class072992, class01129<class07049> class011292, class07049 class070492, EntityClassGroup entityClassGroup, class00734 class007342, Predicate<? super class07049> predicate) {
        ArrayList<class07049> arrayList = WorldHelper.getEntitiesOfEntityGroupWithoutDragonPieces(class011292, class070492, entityClassGroup, class007342, predicate);
        if (!class072992.method_65097().isEmpty()) {
            PlatformEntityAccess.INSTANCE.addEnderDragonParts(class072992, class070492, class007342, predicate, arrayList);
        }
        return arrayList;
    }

    public static List<class07049> getPushableEntities(class07299 class072992, class01129<class07049> class011292, class07049 class070492, class00734 class007342, EntityPushablePredicate<? super class07049> entityPushablePredicate) {
        ArrayList<class07049> arrayList = new ArrayList<class07049>();
        class011292.N(class007342, class011012 -> ((ClimbingMobCachingSection)class011012).lithium$collectPushableEntities(class072992, class070492, class007342, entityPushablePredicate, arrayList));
        return arrayList;
    }

    public static class01129<class07049> getEntityCacheOrNull(class07299 class072992) {
        PersistentEntitySectionManagerAccessor persistentEntitySectionManagerAccessor;
        if (class072992 instanceof ClientWorldAccessor) {
            TransientEntitySectionManagerAccessor transientEntitySectionManagerAccessor = (TransientEntitySectionManagerAccessor)((ClientWorldAccessor)class072992).lithium$getEntityManager();
            if (transientEntitySectionManagerAccessor != null) {
                return transientEntitySectionManagerAccessor.getCache();
            }
        } else if (class072992 instanceof ServerLevelAccessor && (persistentEntitySectionManagerAccessor = (PersistentEntitySectionManagerAccessor)((ServerLevelAccessor)class072992).getEntityManager()) != null) {
            return persistentEntitySectionManagerAccessor.getCache();
        }
        return null;
    }

    public static List<class07049> getOtherEntitiesForCollision(class07309 class073092, class00734 class007342, class07049 class070492, Predicate<? super class07049> predicate) {
        if (!CUSTOM_TYPE_FILTERABLE_LIST_DISABLED && class073092 instanceof class07299) {
            class01129<class07049> class011292;
            class07299 class072992 = (class07299)class073092;
            if (!(class070492 != null && EntityClassGroup.CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE.contains(class070492) || (class011292 = WorldHelper.getEntityCacheOrNull(class072992)) == null)) {
                class08700.N().R("getEntities");
                return WorldHelper.getEntitiesOfEntityGroupWithoutDragonPieces(class011292, class070492, (EntityClassGroup)EntityClassGroup.NoDragonClassGroup.BOAT_SHULKER_LIKE_COLLISION, class007342, predicate);
            }
        }
        return class073092.method_8333(class070492, class007342, predicate);
    }

    public static boolean areNeighborsWithinSameChunkSection(int n, int n2, int n3) {
        int n4 = n & 0xF;
        int n5 = n2 & 0xF;
        int n6 = n3 & 0xF;
        return n4 > 0 && n5 > 0 && n6 > 0 && n4 < 15 && n5 < 15 && n6 < 15;
    }

    public static boolean areNeighborsWithinSameChunk(class07209 class072092) {
        int n = class072092.method_10263() & 0xF;
        int n2 = class072092.method_10260() & 0xF;
        return n > 0 && n2 > 0 && n < 15 && n2 < 15;
    }

    public static List<class07049> getEntitiesForCollision(class07309 class073092, class00734 class007342, class07049 class070492) {
        if (!CUSTOM_TYPE_FILTERABLE_LIST_DISABLED && class073092 instanceof class07299) {
            class01129<class07049> class011292;
            class07299 class072992 = (class07299)class073092;
            if (!(class070492 != null && EntityClassGroup.CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE.contains(class070492) || (class011292 = WorldHelper.getEntityCacheOrNull(class072992)) == null)) {
                class08700.N().R("getEntities");
                return WorldHelper.getEntitiesOfEntityGroupWithoutDragonPieces(class011292, class070492, (EntityClassGroup)EntityClassGroup.NoDragonClassGroup.BOAT_SHULKER_LIKE_COLLISION, class007342, null);
            }
        }
        return class073092.N_70(class070492, class007342);
    }

    public static boolean arePosWithinSameChunk(class07209 class072092, class07209 class072093) {
        return class072092.method_10263() >> 4 == class072093.method_10263() >> 4 && class072092.method_10260() >> 4 == class072093.method_10260() >> 4;
    }

    public static ArrayList<class07049> getEntitiesOfEntityGroupWithoutDragonPieces(class01129<class07049> class011292, class07049 class070492, EntityClassGroup entityClassGroup, class00734 class007342, Predicate<? super class07049> predicate) {
        ArrayList<class07049> arrayList = new ArrayList<class07049>();
        class011292.N(class007342, class011012 -> {
            class01234 class012342 = ((EntitySectionAccessor)class011012).getCollection();
            Collection collection = ((ClassGroupFilterableList)class012342).lithium$getAllOfGroupType(entityClassGroup);
            if (!collection.isEmpty()) {
                for (class07049 class070493 : collection) {
                    if (!class070493.method_5829().L(class007342) || class070493.method_7325() || class070493 == class070492 || predicate != null && !predicate.test(class070493)) continue;
                    arrayList.add(class070493);
                }
            }
            return class04218.field_41283;
        });
        return arrayList;
    }
}


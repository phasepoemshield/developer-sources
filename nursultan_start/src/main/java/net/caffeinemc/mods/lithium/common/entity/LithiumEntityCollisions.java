/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00734
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class06092
 *  minecraft.class06889
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07309
 *  minecraft.class07322
 *  minecraft.class08050
 *  minecraft.class08057
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 */
package net.caffeinemc.mods.lithium.common.entity;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00734;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class06092;
import minecraft.class06889;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07309;
import minecraft.class07322;
import minecraft.class08050;
import minecraft.class08057;
import net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions$1;
import net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions$SupportingBlockCollisionShapeProvider;
import net.caffeinemc.mods.lithium.common.entity.movement.ChunkAwareBlockCollisionSweeperVoxelShape;
import net.caffeinemc.mods.lithium.common.util.Pos$ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;

public class LithiumEntityCollisions {
    public static final double EPSILON = 1.0E-7;

    public static void appendEntityCollisions(List<class00494> list, class07299 class072992, class07049 class070492, class00734 class007342) {
        if (LithiumEntityCollisions.isBoxEmpty(class007342)) {
            return;
        }
        class00734 class007343 = class007342.M(1.0E-7);
        for (class07049 class070493 : WorldHelper.getEntitiesForCollision((class07309)class072992, (class00734)class007343, (class07049)class070492)) {
            if (class070492 == null ? !class070493.method_30948(null) : !class070492.method_30949(class070493)) continue;
            list.add(class00389.N((class00734)class070493.method_5829()));
        }
    }

    public static boolean doesBoxCollideWithBlocks(class07299 class072992, class07049 class070492, class00734 class007342) {
        ChunkAwareBlockCollisionSweeperVoxelShape chunkAwareBlockCollisionSweeperVoxelShape = new ChunkAwareBlockCollisionSweeperVoxelShape(class072992, class070492, class007342);
        class00494 class004942 = chunkAwareBlockCollisionSweeperVoxelShape.computeNext();
        return class004942 != null && !class004942.method_1110();
    }

    public static List<class00494> getBlockCollisions(class07299 class072992, class07049 class070492, class00734 class007342) {
        return new ChunkAwareBlockCollisionSweeperVoxelShape(class072992, class070492, class007342).collectAll();
    }

    public static class00494 getSupportingCollisionForEntity(class07299 class072992, class07049 class070492, class00734 class007342) {
        LithiumEntityCollisions$SupportingBlockCollisionShapeProvider lithiumEntityCollisions$SupportingBlockCollisionShapeProvider;
        class00494 class004942;
        if (class070492 instanceof LithiumEntityCollisions$SupportingBlockCollisionShapeProvider && (class004942 = (lithiumEntityCollisions$SupportingBlockCollisionShapeProvider = (LithiumEntityCollisions$SupportingBlockCollisionShapeProvider)class070492).lithium$getCollisionShapeBelow()) != null) {
            return class004942;
        }
        return LithiumEntityCollisions.getCollisionShapeBelowEntityFallback(class072992, class070492, class007342);
    }

    public static class00734 getSmallerBoxForSingleAxisMovement(class06889 class068892, class00734 class007342, double d, double d2, double d3) {
        double d4 = class007342.N;
        double d5 = class007342.y;
        double d6 = class007342.L;
        double d7 = class007342.u;
        double d8 = class007342.i;
        double d9 = class007342.R;
        if (d > 0.0) {
            d5 = d8;
            d8 += d;
        } else if (d < 0.0) {
            d8 = d5;
            d5 += d;
        } else if (d2 > 0.0) {
            d4 = d7;
            d7 += d2;
        } else if (d2 < 0.0) {
            d7 = d4;
            d4 += d2;
        } else if (d3 > 0.0) {
            d6 = d9;
            d9 += d3;
        } else if (d3 < 0.0) {
            d9 = d6;
            d6 += d3;
        } else {
            return class007342.y(class068892);
        }
        return new class00734(d4, d5, d6, d7, d8, d9);
    }

    public static boolean addEntityCollisionsIfRequired(boolean bl, class07049 class070492, class07299 class072992, List<class00494> list, class00734 class007342) {
        if (bl) {
            LithiumEntityCollisions.appendEntityCollisions(list, class072992, class070492, class007342);
        }
        return false;
    }

    public static boolean addWorldBorderCollisionIfRequired(boolean bl, class07049 class070492, ArrayList<class00494> arrayList, class00734 class007342) {
        if (bl && class070492 != null) {
            LithiumEntityCollisions.appendWorldBorderCollision(arrayList, class070492, class007342);
        }
        return false;
    }

    public static boolean addLastBlockCollisionIfRequired(boolean bl, ChunkAwareBlockCollisionSweeperVoxelShape chunkAwareBlockCollisionSweeperVoxelShape, List<class00494> list) {
        class00494 class004942;
        if (bl && (class004942 = chunkAwareBlockCollisionSweeperVoxelShape.getLastCollision()) != null) {
            list.add(class004942);
        }
        return false;
    }

    public static boolean doesBoxCollideWithHardEntities(class07309 class073092, class07049 class070492, class00734 class007342) {
        if (LithiumEntityCollisions.isBoxEmpty(class007342)) {
            return false;
        }
        return LithiumEntityCollisions.getEntityWorldBorderCollisionIterable(class073092, class070492, class007342.M(1.0E-7), false).iterator().hasNext();
    }

    public static boolean doesBoxCollideWithWorldBorder(class07322 class073222, class07049 class070492, class00734 class007342) {
        if (LithiumEntityCollisions.isWithinWorldBorder(class073222.method_8621(), class007342)) {
            return false;
        }
        class00494 class004942 = LithiumEntityCollisions.getWorldBorderCollision(class073222, class070492, class007342);
        return class004942 != null && class00389.L((class00494)class004942, (class00494)class00389.N((class00734)class007342), (class07003)class07003.Z);
    }

    private static class00494 getCollisionShapeBelowEntityFallback(class07299 class072992, class07049 class070492, class00734 class007342) {
        int n = class04995.N((double)(class007342.N + (class007342.u - class007342.N) / 2.0));
        int n2 = class04995.N((double)class007342.y);
        int n3 = class04995.N((double)(class007342.L + (class007342.R - class007342.L) / 2.0));
        if (class072992.method_31601(n2)) {
            return null;
        }
        class08050 class080502 = class072992.method_8402(Pos$ChunkCoord.fromBlockCoord(n), Pos$ChunkCoord.fromBlockCoord(n3), class00549.m, false);
        if (class080502 != null) {
            class00554 class005542 = class080502.u()[Pos$SectionYIndex.fromBlockCoord((class05474)class072992, n2)];
            return class005542.N(n & 0xF, n2 & 0xF, n3 & 0xF).y((class07290)class072992, new class07209(n, n2, n3), class070492 == null ? class06092.N() : class06092.N((class07049)class070492));
        }
        return null;
    }

    public static Iterable<class00494> getEntityWorldBorderCollisionIterable(class07309 class073092, class07049 class070492, class00734 class007342, boolean bl) {
        assert (!bl || class070492 != null);
        return new LithiumEntityCollisions$1(class073092, class007342, class070492, bl);
    }

    public static class00494 getWorldBorderCollision(class07322 class073222, class07049 class070492, class00734 class007342) {
        class08057 class080572 = class073222.method_8621();
        return class080572.N(class070492, class007342) ? class080572.N() : null;
    }

    public static boolean isWithinWorldBorder(class08057 class080572, class00734 class007342) {
        double d = Math.floor(class080572.L());
        double d2 = Math.floor(class080572.u());
        double d3 = Math.ceil(class080572.i());
        double d4 = Math.ceil(class080572.R());
        return class007342.N >= d && class007342.N <= d3 && class007342.L >= d2 && class007342.L <= d4 && class007342.u >= d && class007342.u <= d3 && class007342.R >= d2 && class007342.R <= d4;
    }

    public static void appendWorldBorderCollision(ArrayList<class00494> arrayList, class07049 class070492, class00734 class007342) {
        class08057 class080572 = class070492.method_73183().method_8621();
        if (!LithiumEntityCollisions.isWithinWorldBorder(class080572, class007342) && LithiumEntityCollisions.isWithinWorldBorder(class080572, class070492.method_5829())) {
            arrayList.add(class080572.N());
        }
    }

    private static boolean isBoxEmpty(class00734 class007342) {
        return class007342.N() <= 1.0E-7;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.Reference2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceReferenceImmutablePair
 *  minecraft.class02289
 *  minecraft.class04499
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07144
 *  minecraft.class07518
 */
package net.caffeinemc.mods.lithium.common.entity;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.Reference2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceReferenceImmutablePair;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.logging.Logger;
import minecraft.class02289;
import minecraft.class04499;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07144;
import minecraft.class07518;
import net.caffeinemc.mods.lithium.common.reflection.ReflectionUtil;
import net.caffeinemc.mods.lithium.common.services.PlatformMappingInformation;

public class EntityClassGroup {
    private static final byte ABSENT_VALUE = 3;
    public static final EntityClassGroup CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE;
    private final BiPredicate<Class<?>, Supplier<class07078<?>>> classAndTypeFitEvaluator;
    private volatile Reference2ByteOpenHashMap<Class<?>> class2GroupContains;
    private volatile ObjectOpenHashSet<ReferenceReferenceImmutablePair<Class<?>, class07078<?>>> containedClassAndTypePairs;

    public EntityClassGroup(BiPredicate<Class<?>, Supplier<class07078<?>>> biPredicate) {
        this.classAndTypeFitEvaluator = biPredicate;
        this.clear();
    }

    static {
        String string = PlatformMappingInformation.INSTANCE.mapMethodName("intermediary", "net.minecraft.class_1297", "method_30949", "(Lnet/minecraft/class_1297;)Z", "canCollideWith");
        CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE = new EntityClassGroup((clazz, supplier) -> ReflectionUtil.hasMethodOverride(clazz, class07049.class, true, string, class07049.class));
        if (!CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE.contains(class07518.class, class07078.NK)) {
            throw new AssertionError();
        }
        if (!CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE.contains(class04499.class, class07078.ya) || !CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE.contains(class02289.class, class07078.n)) {
            throw new AssertionError();
        }
        if (CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE.contains(class07144.class, class07078.yU)) {
            Logger.getLogger("Lithium EntityClassGroup").warning("Either Lithium EntityClassGroup is broken or something else gave Shulkers the minecart-like collision behavior.");
        }
        CUSTOM_COLLIDE_LIKE_MINECART_BOAT_WINDCHARGE.clear();
    }

    public void clear() {
        this.class2GroupContains = new Reference2ByteOpenHashMap();
        this.class2GroupContains.defaultReturnValue((byte)3);
        this.containedClassAndTypePairs = null;
    }

    public boolean contains(Class<?> clazz, class07078<?> class070782) {
        byte by = this.class2GroupContains.getByte(clazz);
        if (by < 2) {
            return by == 1;
        }
        return this.checkDetailedContains(clazz, class070782, by);
    }

    public boolean contains(class07049 class070492) {
        return this.contains(class070492.getClass(), class070492.method_5864());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean testAndAddClass(Class<?> clazz, class07078<?> class070782) {
        boolean bl;
        EntityClassGroup entityClassGroup = this;
        synchronized (entityClassGroup) {
            byte by;
            byte by2;
            if (this.class2GroupContains.containsKey(clazz)) {
                return this.contains(clazz, class070782);
            }
            Reference2ByteOpenHashMap reference2ByteOpenHashMap = this.class2GroupContains.clone();
            boolean[] blArray = new boolean[1];
            Supplier<class07078> supplier = () -> {
                blArray[0] = true;
                return class070782;
            };
            bl = this.classAndTypeFitEvaluator.test(clazz, supplier);
            byte by3 = by2 = bl ? (byte)1 : 0;
            if (blArray[0]) {
                by2 = 2;
                ObjectOpenHashSet objectOpenHashSet = this.containedClassAndTypePairs;
                ObjectOpenHashSet objectOpenHashSet2 = objectOpenHashSet = objectOpenHashSet == null ? new ObjectOpenHashSet() : objectOpenHashSet.clone();
                if (bl) {
                    objectOpenHashSet.add((Object)ReferenceReferenceImmutablePair.of(clazz, class070782));
                    this.containedClassAndTypePairs = objectOpenHashSet;
                }
            }
            if ((by = reference2ByteOpenHashMap.put(clazz, by2)) != 3 && by != by2) {
                throw new IllegalStateException("Entity class group class fit evaluator must be a pure function! Class fit for " + String.valueOf(clazz) + " changed from " + by + " to " + by2 + " when evaluating for " + String.valueOf(class070782) + "!");
            }
            this.class2GroupContains = reference2ByteOpenHashMap;
        }
        return bl;
    }

    private boolean checkDetailedContains(Class<?> clazz, class07078<?> class070782, byte by) {
        if (by == 3) {
            return this.testAndAddClass(clazz, class070782);
        }
        ObjectOpenHashSet<ReferenceReferenceImmutablePair<Class<?>, class07078<?>>> objectOpenHashSet = this.containedClassAndTypePairs;
        return objectOpenHashSet != null && objectOpenHashSet.contains((Object)ReferenceReferenceImmutablePair.of(clazz, class070782));
    }
}


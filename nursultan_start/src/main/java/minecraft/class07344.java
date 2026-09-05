/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10740
 *  com.google.common.collect.Maps
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.shorts.ShortArrayList
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00536
 *  minecraft.class00544
 *  minecraft.class00548
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00571
 *  minecraft.class00751
 *  minecraft.class00772
 *  minecraft.class00891
 *  minecraft.class01042
 *  minecraft.class01296
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01962
 *  minecraft.class02277
 *  minecraft.class02999
 *  minecraft.class03032
 *  minecraft.class03298
 *  minecraft.class03322
 *  minecraft.class03925
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04306
 *  minecraft.class04310
 *  minecraft.class04333
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04651
 *  minecraft.class04748
 *  minecraft.class04775
 *  minecraft.class04782
 *  minecraft.class04932
 *  minecraft.class05368
 *  minecraft.class05474
 *  minecraft.class05688
 *  minecraft.class05795
 *  minecraft.class06113
 *  minecraft.class06614
 *  minecraft.class07001
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07717
 *  minecraft.class07730
 *  minecraft.class07741
 *  minecraft.class07757
 *  minecraft.class07830
 *  minecraft.class07841
 *  minecraft.class08050
 *  minecraft.class08094
 *  minecraft.class08299
 *  minecraft.class08303
 *  minecraft.class08308
 *  minecraft.class08319
 *  minecraft.class08329
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10740;
import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00536;
import minecraft.class00544;
import minecraft.class00548;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00571;
import minecraft.class00751;
import minecraft.class00772;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class01296;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01962;
import minecraft.class02277;
import minecraft.class02999;
import minecraft.class03032;
import minecraft.class03298;
import minecraft.class03322;
import minecraft.class03925;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04306;
import minecraft.class04310;
import minecraft.class04333;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04651;
import minecraft.class04748;
import minecraft.class04775;
import minecraft.class04782;
import minecraft.class04932;
import minecraft.class05368;
import minecraft.class05474;
import minecraft.class05688;
import minecraft.class05795;
import minecraft.class06113;
import minecraft.class06614;
import minecraft.class07001;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07348;
import minecraft.class07359;
import minecraft.class07361;
import minecraft.class07371;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07717;
import minecraft.class07730;
import minecraft.class07741;
import minecraft.class07757;
import minecraft.class07830;
import minecraft.class07841;
import minecraft.class08050;
import minecraft.class08094;
import minecraft.class08299;
import minecraft.class08303;
import minecraft.class08308;
import minecraft.class08319;
import minecraft.class08329;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class07344 {
    private class06614 containerFactory;
    private class07321 chunkPos;
    private int minSectionY;
    private long lastUpdateTime;
    private long inhabitedTime;
    private class00549 chunkStatus;
    private @Nullable class04333 blendingData;
    private @Nullable class02999 belowZeroRetrogen;
    private class07371 upgradeData;
    private long @Nullable [] carvingMask;
    private Map<class07830, long[]> heightmaps;
    private class08094 packedTicks;
    private @Nullable ShortList[] postProcessingSections;
    private boolean lightCorrect;
    private List<class07359> sectionData;
    private List<class07001> entities;
    private List<class07001> blockEntities;
    private class07001 structureData;
    private static final Codec<List<class04306<class00891>>> w = class04306.N((Codec)class04206.i.T()).listOf();
    private static final Codec<List<class04306<class04651>>> k = class04306.N((Codec)class04206.L.T()).listOf();
    private static final Logger Y = LogUtils.getLogger();
    private static final String Q = "UpgradeData";
    private static final String O = "block_ticks";
    private static final String g = "fluid_ticks";
    public static final String N = "xPos";
    public static final String y = "zPos";
    public static final String L = "Heightmaps";
    public static final String u = "isLightOn";
    public static final String i = "sections";
    public static final String R = "BlockLight";
    public static final String M = "SkyLight";
    private static final Logger I = LoggerFactory.getLogger((String)"SerializableChunkDataMixin");
    private @Nullable class07001 J;

    public class07321 L() {
        return this.chunkPos;
    }

    public class00549 M() {
        return this.chunkStatus;
    }

    public boolean P() {
        return this.lightCorrect;
    }

    public List<class07001> T() {
        return this.entities;
    }

    public class07344(class06614 class066142, class07321 class073212, int n, long l, long l2, class00549 class005492, @Nullable class04333 class043332, @Nullable class02999 class029992, class07371 class073712, long @Nullable [] lArray, Map<class07830, long[]> map, class08094 class080942, @Nullable ShortList[] shortListArray, boolean bl, List<class07359> list, List<class07001> list2, List<class07001> list3, class07001 class070012) {
        this.containerFactory = class066142;
        this.chunkPos = class073212;
        this.minSectionY = n;
        this.lastUpdateTime = l;
        this.inhabitedTime = l2;
        this.chunkStatus = class005492;
        this.blendingData = class043332;
        this.belowZeroRetrogen = class029992;
        this.upgradeData = class073712;
        this.carvingMask = lArray;
        this.heightmaps = map;
        this.packedTicks = class080942;
        this.postProcessingSections = shortListArray;
        this.lightCorrect = bl;
        this.sectionData = list;
        this.entities = list2;
        this.blockEntities = list3;
        this.structureData = class070012;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class07344 && Objects.equals(this.containerFactory, ((class07344)object).containerFactory) && Objects.equals(this.chunkPos, ((class07344)object).chunkPos) && this.minSectionY == ((class07344)object).minSectionY && this.lastUpdateTime == ((class07344)object).lastUpdateTime && this.inhabitedTime == ((class07344)object).inhabitedTime && Objects.equals(this.chunkStatus, ((class07344)object).chunkStatus) && Objects.equals(this.blendingData, ((class07344)object).blendingData) && Objects.equals(this.belowZeroRetrogen, ((class07344)object).belowZeroRetrogen) && Objects.equals(this.upgradeData, ((class07344)object).upgradeData) && Objects.equals(this.carvingMask, ((class07344)object).carvingMask) && Objects.equals(this.heightmaps, ((class07344)object).heightmaps) && Objects.equals(this.packedTicks, ((class07344)object).packedTicks) && Objects.equals(this.postProcessingSections, ((class07344)object).postProcessingSections) && this.lightCorrect == ((class07344)object).lightCorrect && Objects.equals(this.sectionData, ((class07344)object).sectionData) && Objects.equals(this.entities, ((class07344)object).entities) && Objects.equals(this.blockEntities, ((class07344)object).blockEntities) && Objects.equals(this.structureData, ((class07344)object).structureData);
    }

    public final String toString() {
        return "class07344[containerFactory=" + Objects.toString(this.containerFactory) + ", chunkPos=" + Objects.toString(this.chunkPos) + ", minSectionY=" + Integer.toString(this.minSectionY) + ", lastUpdateTime=" + Long.toString(this.lastUpdateTime) + ", inhabitedTime=" + Long.toString(this.inhabitedTime) + ", chunkStatus=" + Objects.toString(this.chunkStatus) + ", blendingData=" + Objects.toString(this.blendingData) + ", belowZeroRetrogen=" + Objects.toString(this.belowZeroRetrogen) + ", upgradeData=" + Objects.toString(this.upgradeData) + ", carvingMask=" + Objects.toString(this.carvingMask) + ", heightmaps=" + Objects.toString(this.heightmaps) + ", packedTicks=" + Objects.toString(this.packedTicks) + ", postProcessingSections=" + Objects.toString(this.postProcessingSections) + ", lightCorrect=" + Boolean.toString(this.lightCorrect) + ", sectionData=" + Objects.toString(this.sectionData) + ", entities=" + Objects.toString(this.entities) + ", blockEntities=" + Objects.toString(this.blockEntities) + ", structureData=" + Objects.toString(this.structureData) + "]";
    }

    public final int hashCode() {
        return (((((((((((((((((0 * 31 + Objects.hashCode(this.containerFactory)) * 31 + Objects.hashCode(this.chunkPos)) * 31 + Integer.hashCode(this.minSectionY)) * 31 + Long.hashCode(this.lastUpdateTime)) * 31 + Long.hashCode(this.inhabitedTime)) * 31 + Objects.hashCode(this.chunkStatus)) * 31 + Objects.hashCode(this.blendingData)) * 31 + Objects.hashCode(this.belowZeroRetrogen)) * 31 + Objects.hashCode(this.upgradeData)) * 31 + Objects.hashCode(this.carvingMask)) * 31 + Objects.hashCode(this.heightmaps)) * 31 + Objects.hashCode(this.packedTicks)) * 31 + Objects.hashCode(this.postProcessingSections)) * 31 + Boolean.hashCode(this.lightCorrect)) * 31 + Objects.hashCode(this.sectionData)) * 31 + Objects.hashCode(this.entities)) * 31 + Objects.hashCode(this.blockEntities)) * 31 + Objects.hashCode(this.structureData);
    }

    public @Nullable class04333 B() {
        return this.blendingData;
    }

    public @Nullable class02999 Z() {
        return this.belowZeroRetrogen;
    }

    public long i() {
        return this.lastUpdateTime;
    }

    public List<class07001> b() {
        return this.blockEntities;
    }

    public List<class07359> s() {
        return this.sectionData;
    }

    public @Nullable ShortList[] m() {
        return this.postProcessingSections;
    }

    public class07001 j() {
        return this.structureData;
    }

    public long @Nullable [] U() {
        return this.carvingMask;
    }

    public class07371 z() {
        return this.upgradeData;
    }

    public int u() {
        return this.minSectionY;
    }

    public class06614 y() {
        return this.containerFactory;
    }

    public Map<class07830, long[]> E() {
        return this.heightmaps;
    }

    public static class07344 N(class04782 class047822, class08050 class080502) {
        Object object;
        Object object22;
        class00536 class005362;
        Object object3;
        if (!class080502.T()) {
            throw new IllegalArgumentException("Chunk can't be serialized: " + String.valueOf(class080502));
        }
        class07321 class073212 = class080502.R();
        ArrayList<class07359> arrayList = new ArrayList<class07359>();
        class00554[] class00554Array = class080502.u();
        class04775 class047752 = class047822.method_14178().L();
        for (int i = class047752.u(); i < class047752.i(); ++i) {
            int n = class080502.method_31603(i);
            boolean bl = n >= 0 && n < class00554Array.length;
            object3 = class047752.N(class00772.field_9282).N(class01296.N((class07321)class073212, (int)i));
            class005362 = class047752.N(class00772.field_9284).N(class01296.N((class07321)class073212, (int)i));
            object22 = object3 != null && !object3.u() ? object3.y() : null;
            class00536 class005363 = object = class005362 != null && !class005362.u() ? class005362.y() : null;
            if (!bl && object22 == null && object == null) continue;
            class00554 class005542 = bl ? class00554Array[n].U() : null;
            arrayList.add(new class07359(i, class005542, (class00536)object22, (class00536)object));
        }
        ArrayList<class07001> arrayList2 = new ArrayList<class07001>(class080502.L().size());
        for (class07209 class072092 : class080502.L()) {
            object3 = class080502.N(class072092, (class01929)class047822.method_30349());
            if (object3 == null) continue;
            arrayList2.add((class07001)object3);
        }
        ArrayList<class07001> arrayList3 = new ArrayList<class07001>();
        long[] lArray = null;
        if (class080502.E().u() == class00544.field_12808) {
            object3 = (class07361)class080502;
            arrayList3.addAll(((class07361)((Object)object3)).o());
            class005362 = ((class07361)((Object)object3)).O();
            if (class005362 != null) {
                lArray = class005362.N();
            }
        }
        object3 = new EnumMap(class07830.class);
        for (Object object22 : class080502.i()) {
            if (!class080502.E().i().contains(object22.getKey())) continue;
            object = ((class07841)object22.getValue()).N();
            object3.put((class07830)object22.getKey(), (long[])object.clone());
        }
        class005362 = class080502.N(class047822.N());
        object22 = (ShortList[])Arrays.stream(class080502.m()).map(shortList -> shortList != null && !shortList.isEmpty() ? new ShortArrayList(shortList) : null).toArray(ShortList[]::new);
        object = class07344.N(class03298.N((class04782)class047822), class073212, class080502.M(), class080502.B());
        class07344 class073442 = new class07344(class047822.method_74142(), class073212, class080502.method_32891(), class047822.N(), class080502.n(), class080502.E(), (class04333)class01962.N((Object)class080502.v(), class03032::N), class080502.l(), class080502.b().L(), lArray, (Map<class07830, long[]>)object3, (class08094)class005362, (ShortList[])object22, class080502.t(), arrayList, arrayList3, arrayList2, (class07001)object);
        class07344.N(class047822, class080502, new CallbackInfoReturnable("", false, (Object)class073442));
        return class073442;
    }

    private static void N(class07321 class073212, int n, String string) {
        Y.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{class073212.B, n, class073212.Z, string});
    }

    public class07361 N(class04782 class047822, class05368 class053682, class02277 class022772, class07321 class073212) {
        Object object;
        Object object222;
        if (!Objects.equals(class073212, this.chunkPos)) {
            Y.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{class073212, class073212, this.chunkPos});
            class047822.method_8503().N(this.chunkPos, class073212, class022772);
        }
        class00554[] class00554Array = new class00554[class047822.method_32890()];
        boolean bl = class047822.method_8597().i();
        class05795 class057952 = class047822.method_14178().L();
        class06614 class066142 = class047822.method_74142();
        boolean bl2 = false;
        for (Object object222 : this.sectionData) {
            boolean bl3;
            object = class01296.N((class07321)class073212, (int)object222.N());
            if (object222.y() != null) {
                class00554Array[class047822.method_31603((int)object222.N())] = object222.y();
                class053682.N((class01296)object, object222.y());
            }
            boolean bl4 = object222.L() != null;
            boolean bl5 = bl3 = bl && object222.u() != null;
            if (!bl4 && !bl3) continue;
            if (!bl2) {
                class057952.y(class073212, true);
                bl2 = true;
            }
            if (bl4) {
                class057952.N(class00772.field_9282, (class01296)object, object222.L());
            }
            if (!bl3) continue;
            class057952.N(class00772.field_9284, (class01296)object, object222.u());
        }
        class00544 class005442 = this.chunkStatus.u();
        if (class005442 == class00544.field_12807) {
            object = new class04310(this.packedTicks.N());
            var15_14 = new class04310(this.packedTicks.y());
            object222 = new class00570((class07299)class047822.method_8410(), class073212, this.upgradeData, (class04310)object, (class04310)var15_14, this.inhabitedTime, class00554Array, class07344.N(class047822, this.entities, this.blockEntities), class03032.N((class04333)this.blendingData));
        } else {
            object = class05688.N((List)this.packedTicks.N());
            var15_14 = class05688.N((List)this.packedTicks.y());
            class07361 class073612 = new class07361(class073212, this.upgradeData, class00554Array, (class05688<class00891>)object, (class05688<class04651>)var15_14, (class05474)class047822, class066142, class03032.N((class04333)this.blendingData));
            object222 = class073612;
            object222.L(this.inhabitedTime);
            if (this.belowZeroRetrogen != null) {
                class073612.N(this.belowZeroRetrogen);
            }
            class073612.N(this.chunkStatus);
            if (this.chunkStatus.N(class00549.U)) {
                class073612.N(class057952);
            }
        }
        object222.N(this.lightCorrect);
        object = EnumSet.noneOf(class07830.class);
        for (class07830 class078302 : object222.E().i()) {
            long[] object3 = this.heightmaps.get(class078302);
            if (object3 != null) {
                object222.N(class078302, object3);
                continue;
            }
            ((AbstractCollection)object).add(class078302);
        }
        class07841.N((class08050)object222, (Set)object);
        object222.N_86(class07344.N(class03298.N((class04782)class047822), this.structureData, class047822.method_8412()));
        object222.y(class07344.N(class047822.method_30349(), class073212, this.structureData));
        for (int i = 0; i < this.postProcessingSections.length; ++i) {
            ShortList shortList = this.postProcessingSections[i];
            if (shortList == null) continue;
            object222.N(shortList, i);
        }
        if (class005442 == class00544.field_12807) {
            class00548 class005482 = new class00548((class00570)object222, false);
            class00548 class005483 = class005482;
            class005483 = new CallbackInfoReturnable("", false, (Object)class005483);
            this.N(class047822, class053682, class022772, class073212, (CallbackInfoReturnable)class005483);
            return class005482;
        }
        class07361 class073613 = (class07361)((Object)object222);
        for (class07001 class070012 : this.entities) {
            class073613.y(class070012);
        }
        for (class07001 class070013 : this.blockEntities) {
            class073613.N(class070013);
        }
        if (this.carvingMask != null) {
            class073613.N(new class03322(this.carvingMask, object222.method_31607()));
        }
        class07361 class073612 = class073613;
        class07361 class073614 = class073612;
        class073614 = new CallbackInfoReturnable("", false, (Object)class073614);
        this.N(class047822, class053682, class022772, class073212, (CallbackInfoReturnable)class073614);
        return class073612;
    }

    private static void N(Logger logger, String string, Object object, Object object2) {
        logger.debug(string, object, object2);
    }

    private static void N(class05474 class054742, class06614 class066142, class07001 class070012, CallbackInfoReturnable callbackInfoReturnable, LocalRef localRef) {
        class07344 class073442 = (class07344)callbackInfoReturnable.getReturnValue();
        if (class073442 == null) {
            return;
        }
        class07001 class070013 = class070012.W("fabric:attachments").orElse(null);
        if (class070013 != null) {
            class073442.J = class070013;
        }
    }

    private void N(class04782 class047822, class05368 class053682, class02277 class022772, class07321 class073212, CallbackInfoReturnable callbackInfoReturnable) {
        class07361 class073612 = (class07361)((Object)callbackInfoReturnable.getReturnValue());
        if (class073612 != null && this.J != null) {
            class07001 class070012 = new class07001();
            class070012.N("fabric:attachments", (class07709)this.J);
            try (class04495 class044952 = new class04495(I);){
                class08299 class082992 = class08308.N((class04490)class044952, (class01929)class047822.method_30349(), (class07001)class070012);
                ((AttachmentTargetImpl)class073612).fabric_readAttachmentsFromNbt(class082992);
            }
        }
    }

    private static void N(class04782 class047822, class08050 class080502, CallbackInfoReturnable callbackInfoReturnable) {
        try (class04495 class044952 = new class04495(I);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class047822.method_30349());
            ((AttachmentTargetImpl)class080502).fabric_writeAttachmentsToNbt((class08329)class083032);
            class07001 class070012 = class083032.y().W("fabric:attachments").orElse(null);
            if (class070012 != null) {
                ((class07344)callbackInfoReturnable.getReturnValue()).J = class070012;
            }
        }
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.J != null) {
            ((class07001)callbackInfoReturnable.getReturnValue()).N("fabric:attachments", (class07709)this.J);
        }
    }

    public static @Nullable class07344 N(class05474 class054742, class06614 class066142, class07001 class070013) {
        ShortArrayList shortArrayList;
        Object object;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init(null);
        if (class070013.Z("Status").isEmpty()) {
            CallbackInfoReturnable callbackInfoReturnable = null;
            callbackInfoReturnable = new CallbackInfoReturnable("", false, callbackInfoReturnable);
            class07344.N(class054742, class066142, class070013, callbackInfoReturnable, (LocalRef)localRefImpl);
            return null;
        }
        class07321 class073212 = new class07321(class070013.y(N, 0), class070013.y(y, 0));
        long l = class070013.y("LastUpdate", 0L);
        long l2 = class070013.y("InhabitedTime", 0L);
        class00549 class005492 = class070013.N_15("Status", class00549.P).orElse(class00549.L);
        class07371 class073712 = class070013.W(Q).map(class070012 -> new class07371((class07001)class070012, class054742)).orElse(class07371.N);
        boolean bl = class070013.y(u, false);
        class04333 class043332 = class070013.N_15("blending_data", class04333.N).orElse(null);
        class02999 class029992 = class070013.N_15("below_zero_retrogen", class02999.N).orElse(null);
        long[] lArray = class070013.E("carving_mask").orElse(null);
        EnumMap<class07830, long[]> enumMap = new EnumMap<class07830, long[]>(class07830.class);
        class070013.W(L).ifPresent(class070012 -> {
            for (class07830 class078302 : class005492.i()) {
                class070012.E(class078302.N()).ifPresent(lArray -> enumMap.put(class078302, (long[])lArray));
            }
        });
        List var15 = class04306.N(class070013.N_15(O, w).orElse(List.of()), (class07321)class073212);
        List var16 = class04306.N(class070013.N_15(g, k).orElse(List.of()), (class07321)class073212);
        class08094 class080942 = new class08094(var15, var16);
        class07741 class077412 = class070013.s("PostProcessing");
        ShortList[] shortListArray = new ShortList[class077412.size()];
        for (int i = 0; i < class077412.size(); ++i) {
            object = class077412.i(i).orElse(null);
            if (object == null || object.isEmpty()) continue;
            shortArrayList = new ShortArrayList(object.size());
            for (int j = 0; j < object.size(); ++j) {
                shortArrayList.add(object.N(j, (short)0));
            }
            shortListArray[i] = shortArrayList;
        }
        List list = class070013.P("entities").stream().flatMap(class07741::z).toList();
        object = class070013.P("block_entities").stream().flatMap(class07741::z).toList();
        shortArrayList = class070013.m("structures");
        class07741 class077413 = class070013.s(i);
        ArrayList<class07359> arrayList = new ArrayList<class07359>(class077413.size());
        Codec var25 = class066142.B();
        Codec var26 = class066142.i();
        for (int i = 0; i < class077413.size(); ++i) {
            class00554 class005542;
            class00536 class005362;
            Object object2;
            Optional var28 = class077413.N(i);
            if (var28.isEmpty()) continue;
            class07001 class070014 = (class07001)var28.get();
            byte by = class070014.y("Y", (byte)0);
            if (by >= class054742.method_32891() && by <= class054742.method_31597()) {
                object2 = class070014.W("block_states").map(class070012 -> (class07348)var26.parse((DynamicOps)class07713.N, class070012).promotePartial(string -> class07344.N(class073212, by, string)).getOrThrow(class10740::new)).orElseGet(() -> ((class06614)class066142).N());
                class005362 = class070014.W("biomes").map(class070012 -> (class03925)var25.parse((DynamicOps)class07713.N, class070012).promotePartial(string -> class07344.N(class073212, by, string)).getOrThrow(class10740::new)).orElseGet(() -> ((class06614)class066142).y());
                class005542 = new class00554((class07348)object2, (class03925)class005362);
            } else {
                class005542 = null;
            }
            object2 = class070014.z(R).map(class00536::new).orElse(null);
            class005362 = class070014.z(M).map(class00536::new).orElse(null);
            arrayList.add(new class07359(by, class005542, (class00536)object2, class005362));
        }
        class07344 class073442 = new class07344(class066142, class073212, class054742.method_32891(), l, l2, class005492, class043332, class029992, class073712, lArray, enumMap, class080942, shortListArray, bl, arrayList, list, (List<class07001>)object, (class07001)shortArrayList);
        class07344 class073443 = class073442;
        class073443 = new CallbackInfoReturnable("", false, (Object)class073443);
        class07344.N(class054742, class066142, class070013, (CallbackInfoReturnable)class073443, (LocalRef)localRefImpl);
        return class073442;
    }

    private static Map<class04748, class04932> N(class03298 class032982, class07001 class070012, long l) {
        HashMap hashMap = Maps.newHashMap();
        class00751 class007512 = class032982.y().L(class04227.yj);
        class07001 class070013 = class070012.m("starts");
        for (String string : class070013.i()) {
            class01894 class018942 = class01894.L((String)string);
            class04748 class047482 = (class04748)class007512.N(class018942);
            if (class047482 == null) {
                Y.error("Unknown structure start: {}", (Object)class018942);
                continue;
            }
            class04932 class049322 = class04932.N((class03298)class032982, (class07001)class070013.m(string), (long)l);
            if (class049322 == null) continue;
            hashMap.put(class047482, class049322);
        }
        return hashMap;
    }

    private static class07001 N(class03298 class032982, class07321 class073212, Map<class04748, class04932> map, Map<class04748, LongSet> map2) {
        class07001 class070012 = new class07001();
        class07001 class070013 = new class07001();
        class00751 class007512 = class032982.y().L(class04227.yj);
        for (Map.Entry<class04748, class04932> object : map.entrySet()) {
            class01894 class018942 = class007512.y((Object)object.getKey());
            class070013.N(class018942.toString(), (class07709)object.getValue().N(class032982, class073212));
        }
        class070012.N("starts", (class07709)class070013);
        class07001 class070014 = new class07001();
        for (Map.Entry<class04748, LongSet> entry : map2.entrySet()) {
            if (entry.getValue().isEmpty()) continue;
            class01894 class018943 = class007512.y((Object)entry.getKey());
            class070014.N(class018943.toString(), entry.getValue().toLongArray());
        }
        class070012.N("References", (class07709)class070014);
        return class070012;
    }

    private static @Nullable class00571 N(class04782 class047822, List<class07001> list, List<class07001> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        return class005702 -> {
            if (!list.isEmpty()) {
                try (class04495 class044952 = new class04495(class005702.Q(), Y);){
                    class047822.method_31423(class07078.N((class08319)class08308.N((class04490)class044952, (class01929)class047822.method_30349(), (List)list), (class07299)class047822, (class06113)class06113.field_52444));
                }
            }
            for (class07001 class070012 : list2) {
                boolean bl = class070012.y("keepPacked", false);
                if (bl) {
                    class005702.N(class070012);
                    continue;
                }
                class07209 class072092 = class00394.N((class07321)class005702.R(), (class07001)class070012);
                class00394 class003942 = class00394.N((class07209)class072092, (class00500)class005702.method_8320(class072092), (class07001)class070012, (class01929)class047822.method_30349());
                if (class003942 == null) continue;
                class005702.N(class003942);
            }
        };
    }

    public static class00549 N(@Nullable class07001 class070012) {
        return class070012 != null ? class070012.N_15("Status", class00549.P).orElse(class00549.L) : class00549.L;
    }

    private static Map<class04748, LongSet> N(class01042 class010422, class07321 class073212, class07001 class070012) {
        HashMap hashMap = Maps.newHashMap();
        class00751 class007512 = class010422.L(class04227.yj);
        class070012.m("References").N((T string, U class077092) -> {
            class01894 class018942 = class01894.L((String)string);
            class04748 class047482 = (class04748)class007512.N(class018942);
            if (class047482 == null) {
                class07344.N(Y, "Found reference to unknown structure '{}' in chunk {}, discarding", class018942, class073212);
                return;
            }
            Optional var7 = class077092.aj_();
            if (var7.isEmpty()) {
                return;
            }
            hashMap.put(class047482, new LongOpenHashSet(Arrays.stream((long[])var7.get()).filter(l -> {
                class07321 class073213 = new class07321(l);
                if (class073213.N(class073212) > 8) {
                    Y.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{class018942, class073213, class073212});
                    return false;
                }
                return true;
            }).toArray()));
        });
        return hashMap;
    }

    private static class07741 N(@Nullable ShortList[] shortListArray) {
        class07741 class077412 = new class07741();
        for (ShortList shortList : shortListArray) {
            class07741 class077413 = new class07741();
            if (shortList != null) {
                for (int i = 0; i < shortList.size(); ++i) {
                    class077413.add((Object)class07730.N((short)shortList.getShort(i)));
                }
            }
            class077412.add((Object)class077413);
        }
        return class077412;
    }

    private static /* synthetic */ void N(class07001 class070012, class07830 class078302, long[] lArray) {
        class070012.N(class078302.N(), (class07709)new class07757(lArray));
    }

    public class07001 N() {
        class07359 class0735922;
        class07001 class070012 = class07717.i((class07001)new class07001());
        class070012.N(N, this.chunkPos.B);
        class070012.N("yPos", this.minSectionY);
        class070012.N(y, this.chunkPos.Z);
        class070012.N("LastUpdate", this.lastUpdateTime);
        class070012.N("InhabitedTime", this.inhabitedTime);
        class070012.N_67("Status", class04206.W.y((Object)this.chunkStatus).toString());
        class070012.y("blending_data", class04333.N, (Object)this.blendingData);
        class070012.y("below_zero_retrogen", class02999.N, (Object)this.belowZeroRetrogen);
        if (!this.upgradeData.N()) {
            class070012.N(Q, (class07709)this.upgradeData.y());
        }
        class07741 class077412 = new class07741();
        Codec var3 = this.containerFactory.i();
        Codec var4 = this.containerFactory.B();
        for (class07359 class0735922 : this.sectionData) {
            class07001 class070013 = new class07001();
            class00554 class005542 = class0735922.y();
            if (class005542 != null) {
                class070013.N("block_states", var3, (Object)class005542.B());
                class070013.N("biomes", var4, (Object)class005542.Z());
            }
            if (class0735922.L() != null) {
                class070013.N(R, class0735922.L().N());
            }
            if (class0735922.u() != null) {
                class070013.N(M, class0735922.u().N());
            }
            if (class070013.z()) continue;
            class070013.N("Y", (byte)class0735922.N());
            class077412.add((Object)class070013);
        }
        class070012.N(i, (class07709)class077412);
        if (this.lightCorrect) {
            class070012.N(u, true);
        }
        class07741 class077413 = new class07741();
        class077413.addAll(this.blockEntities);
        class070012.N("block_entities", (class07709)class077413);
        if (this.chunkStatus.u() == class00544.field_12808) {
            class0735922 = new class07741();
            class0735922.addAll(this.entities);
            class070012.N("entities", (class07709)class0735922);
            if (this.carvingMask != null) {
                class070012.N("carving_mask", this.carvingMask);
            }
        }
        class07344.N(class070012, this.packedTicks);
        class070012.N("PostProcessing", (class07709)class07344.N(this.postProcessingSections));
        class0735922 = new class07001();
        this.heightmaps.forEach((arg_0, arg_1) -> class07344.N((class07001)class0735922, arg_0, arg_1));
        class070012.N(L, (class07709)class0735922);
        class070012.N("structures", (class07709)this.structureData);
        class07001 class070014 = class070012;
        this.N(new CallbackInfoReturnable("", false, (Object)class070014));
        return class070014;
    }

    private static void N(class07001 class070012, class08094 class080942) {
        class070012.N(O, w, (Object)class080942.N());
        class070012.N(g, k, (Object)class080942.y());
    }

    public class08094 W() {
        return this.packedTicks;
    }

    public long R() {
        return this.inhabitedTime;
    }
}


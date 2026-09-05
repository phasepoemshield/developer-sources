/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09371
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00500
 *  minecraft.class00667
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class03222
 *  minecraft.class03556
 *  minecraft.class03925
 *  minecraft.class04330
 *  minecraft.class04688
 *  minecraft.class06614
 *  minecraft.class07299
 *  minecraft.class07348
 *  minecraft.class07350
 *  net.caffeinemc.mods.lithium.common.block.BlockCountingSection
 *  net.caffeinemc.mods.lithium.common.block.BlockListeningSection
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlags
 *  net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate
 *  net.caffeinemc.mods.lithium.common.tracking.block.BlockChangeTracker
 *  net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback
 *  net.caffeinemc.mods.lithium.common.tracking.block.SectionedBlockChangeTracker
 *  net.caffeinemc.mods.lithium.common.world.section.LithiumSectionData
 *  net.caffeinemc.mods.lithium.common.world.section.LithiumSectionData$SectionData
 *  net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper
 *  net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper$LithiumBlockCounter
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09371;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00667;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class03222;
import minecraft.class03556;
import minecraft.class03925;
import minecraft.class04330;
import minecraft.class04688;
import minecraft.class06614;
import minecraft.class07299;
import minecraft.class07348;
import minecraft.class07350;
import net.caffeinemc.mods.lithium.common.block.BlockCountingSection;
import net.caffeinemc.mods.lithium.common.block.BlockListeningSection;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;
import net.caffeinemc.mods.lithium.common.tracking.block.BlockChangeTracker;
import net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback;
import net.caffeinemc.mods.lithium.common.tracking.block.SectionedBlockChangeTracker;
import net.caffeinemc.mods.lithium.common.world.section.LithiumSectionData;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00554
implements BlockCountingSection,
BlockListeningSection,
LithiumSectionData {
    public static final int N = 16;
    public static final int y = 16;
    public static final int L = 4096;
    public static final int u = 2;
    private short i;
    private short R;
    private short M;
    private final class07348<class00500> B;
    private class03925<class03556<class00780>> Z;
    private LithiumSectionData.SectionData z;

    public class03556<class00780> L(int n, int n2, int n3) {
        return (class03556)this.Z.N(n, n2, n3);
    }

    public boolean L() {
        return this.i == 0;
    }

    public void L(class00667 class006672) {
        class006672.writeShort((int)this.i);
        this.B.y(class006672);
        this.Z.y(class006672);
    }

    public void M() {
        class09371 class093712;
        this.N((CallbackInfo)null);
        this.y((CallbackInfo)null);
        class09371 class093713 = class093712 = new class09371(this);
        class07350 class073502 = this.N((class07350)class093713);
        class07348<class00500> var2 = this.B;
        this.N(var2, class073502, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_2841, net.minecraft.class_2841$class_4464]");
            ((class07348)objectArray[0]).N((class07350)objectArray[1]);
            return null;
        });
        this.i = (short)class093712.N;
        this.R = (short)class093712.y;
        this.M = (short)class093712.L;
    }

    private class00554(class00554 class005542) {
        this.i = class005542.i;
        this.R = class005542.R;
        this.M = class005542.M;
        this.B = class005542.B.sodium$copy();
        this.Z = class005542.Z.sodium$copy();
    }

    public class00554(class07348<class00500> class073482, class03925<class03556<class00780>> class039252) {
        this.B = class073482;
        this.Z = class039252;
        this.M();
    }

    public class00554(class06614 class066142) {
        this.B = class066142.N();
        this.Z = class066142.y();
        this.N(class066142, null);
        this.y(class066142, null);
    }

    public class07348<class00500> B() {
        return this.B;
    }

    public class03925<class03556<class00780>> Z() {
        return this.Z;
    }

    public boolean i() {
        return this.R > 0;
    }

    public class00554 U() {
        return new class00554(this);
    }

    public int z() {
        return 2 + this.B.y() + this.Z.y();
    }

    public boolean u() {
        return this.i() || this.R();
    }

    private void y(CallbackInfo callbackInfo) {
        this.lithium$getSectionData().setRandomTickableBlocksByY(new byte[RandomTickingSectionDataHelper.BYTE_COUNT]);
    }

    public void y(class00667 class006672) {
        class07348 var2 = this.Z.i();
        var2.N(class006672);
        this.Z = var2;
    }

    private void y(class06614 class066142, CallbackInfo callbackInfo) {
        LithiumSectionData.SectionData sectionData = this.lithium$getSectionData();
        if (sectionData.getRandomTickableBlocksByY() != null) {
            throw new IllegalStateException("RandomTickableBlocksByY already initialized!");
        }
        sectionData.setRandomTickableBlocksByY(new byte[RandomTickingSectionDataHelper.BYTE_COUNT]);
        if (this.B.N((Predicate)BlockStateFlags.RANDOM_TICKING)) {
            byte[] byArray = sectionData.getRandomTickableBlocksByY();
            int n = 4096;
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)Math.min(248, n);
                n -= byArray[i];
            }
        }
    }

    public class04688 y(int n, int n2, int n3) {
        return ((class00500)this.B.N(n, n2, n3)).Y();
    }

    private void y(int n, int n2, int n3, class00500 class005002, boolean bl, CallbackInfoReturnable callbackInfoReturnable, class00500 class005003) {
        int n4 = ((BlockStateFlagHolder)class005003).lithium$getAllFlags();
        int n5 = ((BlockStateFlagHolder)class005002).lithium$getAllFlags();
        int n6 = 1 << BlockStateFlags.RANDOM_TICKING.getIndex();
        if ((n4 & n6) != (n5 & n6)) {
            if ((n4 & n6) != 0) {
                RandomTickingSectionDataHelper.removeAt((int)n, (int)n2, (int)n3, (byte[])this.lithium$getSectionDataDirect().getRandomTickableBlocksByY());
            } else {
                RandomTickingSectionDataHelper.addAt((int)n, (int)n2, (int)n3, (byte[])this.lithium$getSectionDataDirect().getRandomTickableBlocksByY());
            }
        }
    }

    public void y() {
        this.B.M();
    }

    private void E() {
        LithiumSectionData.SectionData sectionData = this.lithium$getSectionData();
        sectionData.setCountsByFlag(new short[BlockStateFlags.NUM_TRACKED_FLAGS]);
        for (TrackedBlockStatePredicate trackedBlockStatePredicate : BlockStateFlags.TRACKED_FLAGS) {
            if (!this.B.N((Predicate)trackedBlockStatePredicate)) continue;
            sectionData.getCountsByFlag()[trackedBlockStatePredicate.getIndex()] = 4096;
        }
    }

    private void N(int n, int n2, int n3, class00500 class005002, boolean bl, CallbackInfoReturnable callbackInfoReturnable, class00500 class005003) {
        this.lithium$trackBlockStateChange(class005002, class005003);
        ChunkSectionChangeCallback chunkSectionChangeCallback = this.lithium$getSectionData().getChangeListener();
        if (chunkSectionChangeCallback != null) {
            chunkSectionChangeCallback.onBlockChange((BlockListeningSection)this, n, n2, n3, class005003, class005002);
        }
    }

    private void N(class00667 class006672, CallbackInfo callbackInfo) {
        this.lithium$getSectionData().setCountsByFlag(null);
    }

    private void N(CallbackInfo callbackInfo) {
        this.lithium$getSectionData().setCountsByFlag(new short[BlockStateFlags.NUM_TRACKED_FLAGS]);
    }

    private class07350 N(class07350 class073502) {
        short[] sArray = Objects.requireNonNull(this.lithium$getSectionData().getCountsByFlag());
        return (class005002, n) -> {
            class073502.accept(class005002, n);
            class00554.N(sArray, class005002, (short)n);
        };
    }

    private void N(class07348 class073482, class07350 class073502, Operation operation) {
        byte[] byArray = Objects.requireNonNull(this.lithium$getSectionData().getRandomTickableBlocksByY());
        RandomTickingSectionDataHelper.LithiumBlockCounter lithiumBlockCounter = new RandomTickingSectionDataHelper.LithiumBlockCounter(byArray, class073502);
        operation.call(new Object[]{class073482, lithiumBlockCounter});
        lithiumBlockCounter.handleAfterCounting(this);
    }

    private static void N(short[] sArray, class00500 class005002, short s) {
        int n;
        int n2 = ((BlockStateFlagHolder)class005002).lithium$getAllFlags();
        while ((n = Integer.numberOfTrailingZeros(n2)) < 32 && n < sArray.length) {
            int n3 = n;
            sArray[n3] = (short)(sArray[n3] + s);
            n2 &= ~(1 << n);
        }
    }

    public class00500 N(int n, int n2, int n3, class00500 class005002) {
        boolean bl = true;
        class00500 class005003 = class005002;
        int n4 = n3;
        int n5 = n2;
        int n6 = n;
        class00554 class005542 = this;
        return this.N(class005542, n6, n5, n4, class005003, bl);
    }

    public void N(class04330 class043302, class03222 class032222, int n, int n2, int n3) {
        class07348 var6 = this.Z.i();
        int n4 = 4;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < 4; ++k) {
                    var6.y(i, j, k, (Object)class043302.method_38109(n + i, n2 + j, n3 + k, class032222));
                }
            }
        }
        this.Z = var6;
    }

    public void N(class00667 class006672) {
        this.N(class006672, null);
        this.i = class006672.readShort();
        this.B.N(class006672);
        class07348 var2 = this.Z.i();
        var2.N(class006672);
        this.Z = var2;
    }

    public void N() {
        this.B.R();
    }

    public boolean N(Predicate<class00500> predicate) {
        return this.B.N(predicate);
    }

    private class00500 N(class00554 class005542, int n, int n2, int n3, class00500 class005002, boolean bl) {
        return this.N(n, n2, n3, class005002, false);
    }

    private void N(class06614 class066142, CallbackInfo callbackInfo) {
        LithiumSectionData.SectionData sectionData = this.lithium$getSectionData();
        if (sectionData.getCountsByFlag() != null) {
            throw new IllegalStateException("CountsByFlag already initialized!");
        }
        sectionData.setCountsByFlag(new short[BlockStateFlags.NUM_TRACKED_FLAGS]);
        for (TrackedBlockStatePredicate trackedBlockStatePredicate : BlockStateFlags.TRACKED_FLAGS) {
            if (!this.B.N((Predicate)trackedBlockStatePredicate)) continue;
            sectionData.getCountsByFlag()[trackedBlockStatePredicate.getIndex()] = 4096;
        }
    }

    private boolean N(class00500 class005002) {
        return class005002.N(class00869.N) || class005002.N(class00869.mr) || class005002.N(class00869.mh);
    }

    public class00500 N(int n, int n2, int n3) {
        return (class00500)this.B.N(n, n2, n3);
    }

    public class00500 N(int n, int n2, int n3, class00500 class005002, boolean bl) {
        class00500 class005003 = bl ? (class00500)this.B.N(n, n2, n3, (Object)class005002) : (class00500)this.B.y(n, n2, n3, (Object)class005002);
        this.N(n, n2, n3, class005002, bl, null, class005003);
        this.y(n, n2, n3, class005002, bl, null, class005003);
        class04688 class046882 = class005003.Y();
        class04688 class046883 = class005002.Y();
        class00500 class005004 = class005003;
        if (!this.N(class005004)) {
            this.i = (short)(this.i - 1);
            if (class005003.Q()) {
                this.R = (short)(this.R - 1);
            }
        }
        if (!class046882.W()) {
            this.M = (short)(this.M - 1);
        }
        if (!this.N(class005004 = class005002)) {
            this.i = (short)(this.i + 1);
            if (class005002.Q()) {
                this.R = (short)(this.R + 1);
            }
        }
        if (!class046883.W()) {
            this.M = (short)(this.M + 1);
        }
        return class005003;
    }

    public void lithium$addToCallback(SectionedBlockChangeTracker sectionedBlockChangeTracker, long l, class07299 class072992) {
        LithiumSectionData.SectionData sectionData = this.lithium$getSectionData();
        if (sectionData.getChangeListener() == null) {
            if (l == Long.MIN_VALUE || class072992 == null) {
                throw new IllegalArgumentException("Expected world and section pos during intialization!");
            }
            sectionData.setChangeListener(ChunkSectionChangeCallback.create((long)l, (class07299)class072992));
        }
        sectionData.getChangeListener().addTracker((BlockChangeTracker)sectionedBlockChangeTracker);
    }

    public void lithium$removeFromCallback(SectionedBlockChangeTracker sectionedBlockChangeTracker) {
        ChunkSectionChangeCallback chunkSectionChangeCallback = this.lithium$getSectionData().getChangeListener();
        if (chunkSectionChangeCallback != null) {
            chunkSectionChangeCallback.removeTracker((BlockChangeTracker)sectionedBlockChangeTracker);
        }
    }

    public boolean R() {
        return this.M > 0;
    }

    public boolean lithium$mayContainAny(TrackedBlockStatePredicate trackedBlockStatePredicate) {
        LithiumSectionData.SectionData sectionData = this.lithium$getSectionData();
        if (sectionData.getCountsByFlag() == null) {
            this.E();
        }
        return sectionData.getCountsByFlag()[trackedBlockStatePredicate.getIndex()] != 0;
    }

    public LithiumSectionData.SectionData lithium$getSectionData() {
        if (this.z == null) {
            this.z = new LithiumSectionData.SectionData(this);
        }
        return this.z;
    }

    public short lithium$getCount(int n) {
        LithiumSectionData.SectionData sectionData = this.lithium$getSectionData();
        if (sectionData.getCountsByFlag() == null) {
            this.E();
        }
        return sectionData.getCountsByFlag()[n];
    }

    public void lithium$trackBlockStateChange(class00500 class005002, class00500 class005003) {
        int n;
        short[] sArray = this.lithium$getSectionData().getCountsByFlag();
        if (sArray == null) {
            return;
        }
        int n2 = ((BlockStateFlagHolder)class005003).lithium$getAllFlags();
        int n3 = ((BlockStateFlagHolder)class005002).lithium$getAllFlags();
        int n4 = n2 ^ n3;
        while ((n = Integer.numberOfTrailingZeros(n4)) < 32 && n < sArray.length) {
            int n5 = 1 << n;
            if ((n4 & n5) != 0) {
                int n6 = n;
                sArray[n6] = (short)(sArray[n6] + (short)(1 - ((n2 >>> n & 1) << 1)));
            }
            n4 &= ~n5;
        }
    }

    public LithiumSectionData.SectionData lithium$getSectionDataDirect() {
        if (this.z == null) {
            throw new NullPointerException("SectionData has not been created yet!");
        }
        return this.z;
    }
}


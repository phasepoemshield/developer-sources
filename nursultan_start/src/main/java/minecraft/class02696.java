/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00548
 *  minecraft.class00549
 *  minecraft.class00570
 *  minecraft.class01607
 *  minecraft.class01929
 *  minecraft.class02236
 *  minecraft.class02237
 *  minecraft.class02248
 *  minecraft.class02999
 *  minecraft.class03001
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04763
 *  minecraft.class04775
 *  minecraft.class04782
 *  minecraft.class05795
 *  minecraft.class05974
 *  minecraft.class06113
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07361
 *  minecraft.class07529
 *  minecraft.class07830
 *  minecraft.class07841
 *  minecraft.class08050
 *  minecraft.class08308
 *  minecraft.class08319
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$Generate
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$LevelTypeChange
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$Load
 *  net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import minecraft.class00548;
import minecraft.class00549;
import minecraft.class00570;
import minecraft.class01607;
import minecraft.class01929;
import minecraft.class02236;
import minecraft.class02237;
import minecraft.class02248;
import minecraft.class02688;
import minecraft.class02999;
import minecraft.class03001;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04763;
import minecraft.class04775;
import minecraft.class04782;
import minecraft.class05795;
import minecraft.class05974;
import minecraft.class06113;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07361;
import minecraft.class07529;
import minecraft.class07830;
import minecraft.class07841;
import minecraft.class08050;
import minecraft.class08308;
import minecraft.class08319;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;
import net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02696 {
    private static final Logger N = LogUtils.getLogger();
    private static final class04763[] y = class04763.values();

    static CompletableFuture<class08050> L(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class026882.N().method_39778(class080502);
        return CompletableFuture.completedFuture(class080502);
    }

    static CompletableFuture<class08050> M(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class04782 class047822 = class026882.N();
        class01607 class016072 = new class01607(class047822, class022482, class022372, class080502);
        class026882.y().N(class016072, class047822.method_27056().N(class016072), class047822.method_14178().W(), class080502);
        return CompletableFuture.completedFuture(class080502);
    }

    static CompletableFuture<class08050> B(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class04782 class047822 = class026882.N();
        class01607 class016072 = new class01607(class047822, class022482, class022372, class080502);
        if (class080502 instanceof class07361) {
            class07361 class073612 = (class07361)class080502;
            class03001.N_37((class05974)class016072, (class07361)class073612);
        }
        class026882.y().N(class016072, class047822.method_8412(), class047822.method_14178().W(), class047822.method_22385(), class047822.method_27056().N(class016072), class080502);
        return CompletableFuture.completedFuture(class080502);
    }

    static CompletableFuture<class08050> Z(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class04782 class047822 = class026882.N();
        class07841.N((class08050)class080502, EnumSet.of(class07830.field_13197, class07830.field_13203, class07830.field_13200, class07830.field_13202));
        class01607 class016072 = new class01607(class047822, class022482, class022372, class080502);
        if (!class07529.NO) {
            class026882.y().N((class05974)class016072, class080502, class047822.method_27056().N(class016072));
        }
        class03001.N((class01607)class016072, (class08050)class080502);
        return CompletableFuture.completedFuture(class080502);
    }

    static CompletableFuture<class08050> i(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class04782 class047822 = class026882.N();
        class01607 class016072 = new class01607(class047822, class022482, class022372, class080502);
        return class026882.y().N(class047822.method_14178().W(), class03001.N((class01607)class016072), class047822.method_27056().N(class016072), class080502);
    }

    static CompletableFuture<class08050> U(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        boolean bl = class02696.N(class080502);
        return class026882.u().y(class080502, bl);
    }

    static CompletableFuture<class08050> z(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class04775 class047752 = class026882.u();
        class080502.k();
        ((class07361)class080502).N((class05795)class047752);
        boolean bl = class02696.N(class080502);
        return class047752.N(class080502, bl);
    }

    static CompletableFuture<class08050> u(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class04782 class047822 = class026882.N();
        class01607 class016072 = new class01607(class047822, class022482, class022372, class080502);
        class026882.y().N((class05974)class016072, class047822.method_27056().N(class016072), class080502);
        return CompletableFuture.completedFuture(class080502);
    }

    static CompletableFuture<class08050> y(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class04782 class047822 = class026882.N();
        if (class047822.method_8503().yn().l().u()) {
            class026882.y().N(class047822.method_30349(), class047822.method_14178().E(), class047822.method_27056(), class080502, class026882.L(), class047822.method_27983());
        }
        class047822.method_39778(class080502);
        return CompletableFuture.completedFuture(class080502);
    }

    static CompletableFuture<class08050> E(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        if (!class080502.d()) {
            class026882.y().N(new class01607(class026882.N(), class022482, class022372, class080502));
        }
        return CompletableFuture.completedFuture(class080502);
    }

    private static boolean N(class08050 class080502) {
        return class080502.E().N(class00549.E) && class080502.t();
    }

    private static void N(class08050 class080502, class02688 class026882, class02236 class022362, CallbackInfoReturnable callbackInfoReturnable) {
        class00570 class005702 = (class00570)callbackInfoReturnable.getReturnValue();
        ((ServerChunkEvents.Load)ServerChunkEvents.CHUNK_LOAD.invoker()).onChunkLoad(class026882.N(), class005702);
        if (!(class080502 instanceof class00548)) {
            ((ServerChunkEvents.Generate)ServerChunkEvents.CHUNK_GENERATE.invoker()).onChunkGenerate(class026882.N(), class005702);
        }
        ChunkLevelTypeEventTracker chunkLevelTypeEventTracker = (ChunkLevelTypeEventTracker)class022362;
        for (int i = chunkLevelTypeEventTracker.fabric_getCurrentEventLevelType().ordinal(); i < class022362.j().ordinal(); ++i) {
            class04763 class047632 = y[i];
            class04763 class047633 = y[i + 1];
            ((ServerChunkEvents.LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker()).onChunkLevelTypeChange(class026882.N(), class005702, class047632, class047633);
            chunkLevelTypeEventTracker.fabric_setCurrentEventLevelType(class047633);
        }
    }

    static CompletableFuture<class08050> N(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        return CompletableFuture.completedFuture(class080502);
    }

    private static void N(class04782 class047822, class08319 class083192) {
        if (!class083192.N()) {
            class047822.method_31426(class07078.N((class08319)class083192, (class07299)class047822, (class06113)class06113.field_52444));
        }
    }

    static CompletableFuture<class08050> W(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080502) {
        class07321 class073212 = class080502.R();
        class02236 class022362 = (class02236)class022482.N(class073212.B, class073212.Z);
        return CompletableFuture.supplyAsync(() -> {
            class00570 class005703;
            class07361 class073612 = (class07361)class080502;
            class04782 class047822 = class026882.N();
            if (class073612 instanceof class00548) {
                class005703 = ((class00548)class073612).I();
            } else {
                class005703 = new class00570(class047822, class073612, class005702 -> {
                    try (class04495 class044952 = new class04495(class080502.Q(), N);){
                        class02696.N(class047822, class08308.N((class04490)class044952, (class01929)class047822.method_30349(), (List)class073612.o()));
                    }
                });
                class022362.N(new class00548(class005703, false));
            }
            class005703.y(() -> ((class02236)class022362).j());
            class005703.I();
            class005703.y(true);
            class005703.K();
            class005703.y(class047822);
            class005703.N(class026882.R());
            class00570 class005704 = class005703;
            class02696.N(class080502, class026882, class022362, new CallbackInfoReturnable("", false, (Object)class005704));
            return class005704;
        }, class026882.i());
    }

    static CompletableFuture<class08050> R(class02688 class026882, class02237 class022372, class02248<class02236> class022482, class08050 class080503) {
        class04782 class047822 = class026882.N();
        class01607 class016072 = new class01607(class047822, class022482, class022372, class080503);
        return class026882.y().N(class03001.N((class01607)class016072), class047822.method_14178().W(), class047822.method_27056().N(class016072), class080503).thenApply(class080502 -> {
            class07361 class073612;
            class02999 class029992;
            if (class080502 instanceof class07361 && (class029992 = (class073612 = (class07361)class080502).l()) != null) {
                class02999.N((class07361)class073612);
                if (class029992.y()) {
                    class029992.y(class073612);
                }
            }
            return class080502;
        });
    }
}


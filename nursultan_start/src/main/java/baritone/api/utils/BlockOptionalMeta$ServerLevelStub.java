/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00272
 *  minecraft.class00558
 *  minecraft.class00611
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01089
 *  minecraft.class01093
 *  minecraft.class01214
 *  minecraft.class01255
 *  minecraft.class01603
 *  minecraft.class01929
 *  minecraft.class02003
 *  minecraft.class02314
 *  minecraft.class02331
 *  minecraft.class02796
 *  minecraft.class02969
 *  minecraft.class03078
 *  minecraft.class03448
 *  minecraft.class03470
 *  minecraft.class03545
 *  minecraft.class03767
 *  minecraft.class04298
 *  minecraft.class04782
 *  minecraft.class04785
 *  minecraft.class05212
 *  minecraft.class05946
 *  minecraft.class05975
 *  minecraft.class06202
 *  minecraft.class06683
 *  minecraft.class07299
 *  minecraft.class08050
 */
package baritone.api.utils;

import baritone.api.utils.BlockOptionalMeta;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import javax.annotation.Nullable;
import minecraft.class00272;
import minecraft.class00558;
import minecraft.class00611;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01089;
import minecraft.class01093;
import minecraft.class01214;
import minecraft.class01255;
import minecraft.class01603;
import minecraft.class01929;
import minecraft.class02003;
import minecraft.class02314;
import minecraft.class02331;
import minecraft.class02796;
import minecraft.class02969;
import minecraft.class03078;
import minecraft.class03448;
import minecraft.class03470;
import minecraft.class03545;
import minecraft.class03767;
import minecraft.class04298;
import minecraft.class04782;
import minecraft.class04785;
import minecraft.class05212;
import minecraft.class05946;
import minecraft.class05975;
import minecraft.class06202;
import minecraft.class06683;
import minecraft.class07299;
import minecraft.class08050;
import sun.misc.Unsafe;

public class BlockOptionalMeta$ServerLevelStub
extends class04782 {
    private static class06202 client;
    private static Unsafe unsafe;
    private static CompletableFuture<class01042> registryAccess;
    static final /* synthetic */ boolean $assertionsDisabled;

    public class01042 method_30349() {
        return registryAccess.join();
    }

    public /* synthetic */ class06683 method_8428() {
        return super.method_14170();
    }

    public BlockOptionalMeta$ServerLevelStub(class02796 class027962, Executor executor, class04785 class047852, class05212 class052122, class05946<class07299> class059462, class01255 class012552, boolean bl, long l, List<class05975> list, boolean bl2, @Nullable class03470 class034702) {
        super(class027962, executor, class047852, class052122, class059462, class012552, bl, l, list, bl2, class034702);
    }

    static {
        $assertionsDisabled = !BlockOptionalMeta.class.desiredAssertionStatus();
        client = class06202.Nq();
        unsafe = BlockOptionalMeta$ServerLevelStub.getUnsafe();
        registryAccess = BlockOptionalMeta$ServerLevelStub.load();
    }

    public static CompletableFuture<class01042> load() {
        class03545 class035452 = new class03545(class01603.field_14190, List.of(class01093.N()));
        class02003 class020032 = class02969.N();
        List list = class01214.N((class01089)class035452, (class01042)class020032.N((Object)class02969.field_39971));
        List list2 = class01214.N((class01022)class020032.y((Object)class02969.field_39972), (List)list);
        class02003 class020033 = class020032.N((Object)class02969.field_39972, new class01022[]{class03078.N((class01089)class035452, (List)list2, (List)class03078.N)});
        return class02314.N((class02003)class020033, (List)list, (class01089)class035452, (Executor)ForkJoinPool.commonPool()).thenApply(class023472 -> class023472.N().N());
    }

    public static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe)field.get(null);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public class02331 holder() {
        return new class02331((class01929)this.method_30349().method_40316());
    }

    public /* synthetic */ class04298 method_8397() {
        return super.method_14196();
    }

    public /* synthetic */ class00272 method_8433() {
        return super.method_64577();
    }

    public /* synthetic */ class00611 method_75598() {
        return super.method_75728();
    }

    public class03767 method_45162() {
        if (!$assertionsDisabled && (class03448)BlockOptionalMeta$ServerLevelStub.client.T_3 == null) {
            throw new AssertionError();
        }
        return ((class03448)BlockOptionalMeta$ServerLevelStub.client.T_3).method_45162();
    }

    public /* synthetic */ class08050 method_8392(int n, int n2) {
        return super.method_8497(n, n2);
    }

    public /* synthetic */ class04298 method_8405() {
        return super.method_14179();
    }

    public /* synthetic */ class00558 method_8398() {
        return super.method_14178();
    }

    public static BlockOptionalMeta$ServerLevelStub fastCreate() {
        try {
            return (BlockOptionalMeta$ServerLevelStub)((Object)unsafe.allocateInstance(BlockOptionalMeta$ServerLevelStub.class));
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException(instantiationException);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.accessor.IChunkArray
 *  baritone.utils.accessor.IClientChunkProvider
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  jerozgen.languagereload.mixin.ClientChunkManagerAccessor
 *  minecraft.class00538
 *  minecraft.class00549
 *  minecraft.class00558
 *  minecraft.class00561
 *  minecraft.class00570
 *  minecraft.class00667
 *  minecraft.class00772
 *  minecraft.class00795
 *  minecraft.class01296
 *  minecraft.class01705
 *  minecraft.class01806
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05795
 *  minecraft.class06202
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07830
 *  net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Load
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Unload
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import baritone.utils.accessor.IChunkArray;
import baritone.utils.accessor.IClientChunkProvider;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import jerozgen.languagereload.mixin.ClientChunkManagerAccessor;
import minecraft.class00538;
import minecraft.class00549;
import minecraft.class00558;
import minecraft.class00561;
import minecraft.class00570;
import minecraft.class00667;
import minecraft.class00772;
import minecraft.class00795;
import minecraft.class01296;
import minecraft.class01705;
import minecraft.class01806;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05795;
import minecraft.class06202;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07830;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class01688
extends class00558
implements IClientChunkProvider,
ClientChunkManagerAccessor {
    static final Logger N = LogUtils.getLogger();
    private final class00570 u;
    private final class05795 i;
    volatile class01705 y;
    final class03448 L;

    public class05795 L() {
        return this.i;
    }

    public class01688(class03448 class034482, int n) {
        this.L = class034482;
        this.u = new class00561((class07299)class034482, new class07321(0, 0), (class03556)class034482.method_30349().L(class04227.NA).y(class00795.y));
        this.i = new class05795((class00538)this, true, class034482.method_8597().i());
        this.y = new class01705(this, class01688.y(n));
    }

    public class07290 i() {
        return this.L;
    }

    public void u(int n, int n2) {
        this.y.u = n;
        this.y.i = n2;
    }

    public int y() {
        return this.y.R;
    }

    private void y(int n, int n2, class00667 class006672, Map map, Consumer consumer, CallbackInfoReturnable callbackInfoReturnable) {
        ChunkTrackerHolder.get((class03448)this.L).onChunkStatusAdded(n, n2, 1);
    }

    private static int y(int n) {
        return Math.max(2, n) + 3;
    }

    public @Nullable class00570 N(int n, int n2, class00549 class005492, boolean bl) {
        class00570 class005702;
        if (this.y.y(n, n2) && class01688.N(class005702 = this.y.N(this.y.N(n, n2)), n, n2)) {
            return class005702;
        }
        if (bl) {
            return this.u;
        }
        return null;
    }

    public void N(int n, int n2, int n3, boolean bl) {
        this.y.N(n, n2, n3, bl);
    }

    private void N(class07321 class073212, CallbackInfo callbackInfo) {
        ChunkTrackerHolder.get((class03448)this.L).onChunkStatusRemoved(class073212.B, class073212.Z, 1);
    }

    private void N(int n, CallbackInfo callbackInfo, class01705 class017052, class00570 class005702, class07321 class073212) {
        if (!class017052.y(class073212.B, class073212.Z)) {
            ((ClientChunkEvents.Unload)ClientChunkEvents.CHUNK_UNLOAD.invoker()).onChunkUnload(this.L, class005702);
        }
    }

    private void N(class07321 class073212, CallbackInfo callbackInfo, class00570 class005702) {
        ((ClientChunkEvents.Unload)ClientChunkEvents.CHUNK_UNLOAD.invoker()).onChunkUnload(this.L, class005702);
    }

    private void N(int n, int n2, class00667 class006672, Map map, Consumer consumer, CallbackInfoReturnable callbackInfoReturnable, class00570 class005702) {
        if (class005702 != null) {
            ((ClientChunkEvents.Unload)ClientChunkEvents.CHUNK_UNLOAD.invoker()).onChunkUnload(this.L, class005702);
        }
    }

    private void N(int n, int n2, class00667 class006672, Map map, Consumer consumer, CallbackInfoReturnable callbackInfoReturnable) {
        ((ClientChunkEvents.Load)ClientChunkEvents.CHUNK_LOAD.invoker()).onChunkLoad(this.L, (class00570)callbackInfoReturnable.getReturnValue());
    }

    public void N(class07321 class073212) {
        if (!this.y.y(class073212.B, class073212.Z)) {
            return;
        }
        int n = this.y.N(class073212.B, class073212.Z);
        class00570 class005702 = this.y.N(n);
        if (class01688.N(class005702, class073212.B, class073212.Z)) {
            this.N(class073212, null, class005702);
            this.y.y(n, class005702);
            this.N(class073212, null);
        }
    }

    public void N(int n) {
        int n2 = this.y.L;
        int n3 = class01688.y(n);
        if (n2 != n3) {
            class01705 class017052 = new class01705(this, n3);
            class017052.u = this.y.u;
            class017052.i = this.y.i;
            for (int i = 0; i < this.y.N.length(); ++i) {
                class00570 class005702 = (class00570)this.y.N.get(i);
                if (class005702 == null) continue;
                class07321 class073212 = class005702.R();
                int n4 = class073212.B;
                int n5 = class073212.Z;
                this.N(n, null, class017052, class005702, class073212);
                if (!class017052.y(n4, n5)) continue;
                class017052.N(class017052.N(class073212.B, class073212.Z), class005702);
            }
            this.y = class017052;
        }
    }

    public void N(int n, int n2, class00667 class006672) {
        if (!this.y.y(n, n2)) {
            N.warn("Ignoring chunk since it's not in the view range: {}, {}", (Object)n, (Object)n2);
            return;
        }
        int n3 = this.y.N(n, n2);
        class00570 class005702 = (class00570)this.y.N.get(n3);
        if (!class01688.N(class005702, n, n2)) {
            N.warn("Ignoring chunk since it's not present: {}, {}", (Object)n, (Object)n2);
        } else {
            class005702.N(class006672);
        }
    }

    public @Nullable class00570 N(int n, int n2, class00667 class006672, Map<class07830, long[]> map, Consumer<class01806> consumer) {
        if (!this.y.y(n, n2)) {
            N.warn("Ignoring chunk since it's not in the view range: {}, {}", (Object)n, (Object)n2);
            return null;
        }
        int n3 = this.y.N(n, n2);
        class00570 class005702 = (class00570)this.y.N.get(n3);
        class07321 class073212 = new class07321(n, n2);
        if (!class01688.N(class005702, n, n2)) {
            this.N(n, n2, class006672, map, consumer, null, class005702);
            class005702 = new class00570((class07299)this.L, class073212);
            class005702.N(class006672, map, consumer);
            this.y.N(n3, class005702);
        } else {
            class005702.N(class006672, map, consumer);
            this.y.N(class005702);
        }
        this.L.N(class073212);
        this.y(n, n2, class006672, map, consumer, null);
        class00570 class005703 = class005702;
        this.N(n, n2, class006672, map, consumer, new CallbackInfoReturnable("", false, (Object)class005703));
        return class005703;
    }

    public void N(BooleanSupplier booleanSupplier, boolean bl) {
    }

    public void N(class00772 class007722, class01296 class012962) {
        ((class03063)class06202.Nq().B_2).N(class012962.N(), class012962.y(), class012962.L());
    }

    public String N() {
        return this.y.N.length() + ", " + this.y();
    }

    private static boolean N(@Nullable class00570 class005702, int n, int n2) {
        if (class005702 == null) {
            return false;
        }
        class07321 class073212 = class005702.R();
        return class073212.B == n && class073212.Z == n2;
    }

    public LongOpenHashSet R() {
        return this.y.y;
    }

    public IChunkArray extractReferenceArray() {
        for (Field field : class01688.class.getDeclaredFields()) {
            if (!IChunkArray.class.isAssignableFrom(field.getType())) continue;
            try {
                return (IChunkArray)field.get((Object)this);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
        }
        throw new RuntimeException(Arrays.toString(class01688.class.getDeclaredFields()));
    }

    public class01688 createThreadSafeCopy() {
        IChunkArray iChunkArray = this.extractReferenceArray();
        class01688 class016882 = new class01688(this.L, iChunkArray.viewDistance() - 3);
        IChunkArray iChunkArray2 = ((IClientChunkProvider)class016882).extractReferenceArray();
        iChunkArray2.copyFrom(iChunkArray);
        if (iChunkArray2.viewDistance() != iChunkArray.viewDistance()) {
            throw new IllegalStateException(iChunkArray2.viewDistance() + " " + iChunkArray.viewDistance());
        }
        return class016882;
    }

    public /* synthetic */ class01705 languagereload_getChunks() {
        return this.y;
    }
}


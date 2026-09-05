/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09447
 *  Nursultan.class10738
 *  baritone.utils.accessor.IPalettedContainer
 *  baritone.utils.accessor.IPalettedContainer$IData
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class00567
 *  minecraft.class00667
 *  minecraft.class01198
 *  minecraft.class01807
 *  minecraft.class03236
 *  minecraft.class03925
 *  minecraft.class03936
 *  minecraft.class03945
 *  minecraft.class04552
 *  minecraft.class05559
 *  minecraft.class06338
 *  minecraft.class06617
 *  minecraft.class07340
 *  minecraft.class07342
 *  net.caffeinemc.mods.lithium.common.world.chunk.CompactingPackedIntegerArray
 *  net.caffeinemc.mods.lithium.common.world.chunk.LithiumHashPalette
 *  net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper$LithiumBlockCounter
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.StrategyAccessor
 *  net.caffeinemc.mods.sodium.client.world.BitStorageExtension
 *  net.caffeinemc.mods.sodium.client.world.PalettedContainerROExtension
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09447;
import Nursultan.class10738;
import baritone.utils.accessor.IPalettedContainer;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import minecraft.class00567;
import minecraft.class00667;
import minecraft.class01198;
import minecraft.class01807;
import minecraft.class03236;
import minecraft.class03925;
import minecraft.class03936;
import minecraft.class03945;
import minecraft.class04552;
import minecraft.class05559;
import minecraft.class06338;
import minecraft.class06617;
import minecraft.class07340;
import minecraft.class07342;
import minecraft.class07350;
import minecraft.class07365;
import net.caffeinemc.mods.lithium.common.world.chunk.CompactingPackedIntegerArray;
import net.caffeinemc.mods.lithium.common.world.chunk.LithiumHashPalette;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper;
import net.caffeinemc.mods.lithium.mixin.util.accessors.StrategyAccessor;
import net.caffeinemc.mods.sodium.client.world.BitStorageExtension;
import net.caffeinemc.mods.sodium.client.world.PalettedContainerROExtension;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07348<T>
implements class03925<T>,
class07342<T>,
IPalettedContainer,
PalettedContainerROExtension {
    private static final int N = 0;
    private volatile class07365<T> y;
    private final class01807<T> L;
    private class05559 u = new class05559("PalettedContainer");
    private static final MethodHandle i;
    private static final ThreadLocal R;
    private static final ThreadLocal M;

    public int L() {
        return this.y.L().L();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void L(int n, int n2, int n3, T t) {
        this.R();
        try {
            this.y(this.L.N(n, n2, n3), t);
        }
        finally {
            this.M();
        }
    }

    public void M() {
    }

    public class07348(T t, class01807<T> class018072) {
        this.L = class018072;
        this.y = this.N(null, 0);
        this.y.u().method_12291(t, (class07342)this);
        this.N((CallbackInfo)null);
    }

    private class07348(class07348<T> class073482) {
        this.L = class073482.L;
        this.y = class073482.y.N();
        this.N((CallbackInfo)null);
    }

    private class07348(class01807<T> class018072, class06617 class066172, class04552 class045522, class07340<T> class073402) {
        this.L = class018072;
        this.y = new class07365<T>(class066172, class045522, class073402);
        this.N((CallbackInfo)null);
    }

    static {
        MethodHandle methodHandle;
        Field field = null;
        for (Field field2 : class07348.class.getDeclaredFields()) {
            Class<?> var5 = field2.getType();
            if (!IPalettedContainer.IData.class.isAssignableFrom(var5) || (field2.getModifiers() & 0x18) != 0 || field2.isSynthetic()) continue;
            if (field != null) {
                throw new IllegalStateException("PalettedContainer has more than one Data field.");
            }
            field = field2;
        }
        if (field == null) {
            throw new IllegalStateException("PalettedContainer has no Data field.");
        }
        try {
            methodHandle = MethodHandles.lookup().unreflectGetter(field);
        }
        catch (IllegalAccessException methodType) {
            throw new IllegalStateException("PalettedContainer may not access its own field?!", methodType);
        }
        MethodType methodType = MethodType.methodType(IPalettedContainer.IData.class, class07348.class);
        i = MethodHandles.explicitCastArguments(methodHandle, methodType);
        R = ThreadLocal.withInitial(() -> new short[4096]);
        M = ThreadLocal.withInitial(() -> new short[64]);
    }

    private IPalettedContainer.IData Z() {
        try {
            return (IPalettedContainer.IData)i.invoke(this);
        }
        catch (Throwable throwable) {
            throw (RuntimeException)class07348.N(throwable, RuntimeException.class);
        }
    }

    public class07348<T> i() {
        return new class07348<Object>(this.y.u().method_12288(0), this.L);
    }

    public class07348<T> sodium$copy() {
        return new class07348<T>(this);
    }

    public void y(class00667 class006672) {
        this.R();
        try {
            this.y.N(class006672, this.L.y());
        }
        finally {
            this.M();
        }
    }

    private void y(int n, T t) {
        int n2 = this.y.u().method_12291(t, (class07342)this);
        this.y.L().y(n, n2);
    }

    public int y() {
        return this.y.N(this.L.y());
    }

    public static <T> Codec<class03925<T>> y(Codec<T> codec, class01807<T> class018073, T t) {
        class03945 class039452 = (class018072, class039362) -> class07348.N(class018072, class039362).map(class073482 -> class073482);
        return class07348.N(codec, class018073, t, class039452);
    }

    public T y(int n, int n2, int n3, T t) {
        return this.N(this.L.N(n, n2, n3), t);
    }

    private short[] y(int n) {
        return switch (n) {
            case 64 -> (short[])M.get();
            case 4096 -> (short[])R.get();
            default -> new short[n];
        };
    }

    public void N(class07350 class073502, CallbackInfo callbackInfo) {
        int n2 = this.y.u().method_12197();
        if (n2 > 4096) {
            return;
        }
        short[] sArray = new short[n2];
        this.y.L().N((int n) -> {
            int n2 = n;
            sArray[n2] = (short)(sArray[n2] + 1);
        });
        for (int i = 0; i < sArray.length; ++i) {
            Object object = this.y.u().method_12288(i);
            if (object == null) continue;
            class073502.accept(object, sArray[i]);
        }
        callbackInfo.cancel();
    }

    private IntConsumer N(IntConsumer intConsumer, class07350 class073502, Int2IntOpenHashMap int2IntOpenHashMap) {
        if (class073502 instanceof RandomTickingSectionDataHelper.LithiumBlockCounter) {
            RandomTickingSectionDataHelper.LithiumBlockCounter lithiumBlockCounter = (RandomTickingSectionDataHelper.LithiumBlockCounter)class073502;
            class07340<T> class073402 = this.y.u();
            return new class10738(this, intConsumer, lithiumBlockCounter, int2IntOpenHashMap, class073402);
        }
        return intConsumer;
    }

    public static <T> Codec<class07348<T>> N(Codec<T> codec, class01807<T> class018072, T t) {
        class03945 class039452 = class07348::N;
        return class07348.N(codec, class018072, t, class039452);
    }

    private static Throwable N(Throwable throwable, Class clazz) throws Throwable {
        throw throwable;
    }

    public void N(CallbackInfo callbackInfo) {
        this.u = null;
    }

    public class03936 N(class01807 class018072) {
        LithiumHashPalette lithiumHashPalette;
        this.R();
        LithiumHashPalette lithiumHashPalette2 = null;
        Optional optional = Optional.empty();
        List list = null;
        class07340<T> class073402 = this.y.u();
        class04552 class045522 = this.y.L();
        if (class045522 instanceof class03236 || class073402.method_12197() == 1) {
            list = List.of(class073402.method_12288(0));
        } else if (class073402 instanceof LithiumHashPalette) {
            lithiumHashPalette2 = lithiumHashPalette = (LithiumHashPalette)class073402;
        }
        if (list == null) {
            class06617 class066172;
            lithiumHashPalette = new LithiumHashPalette(class045522.L());
            short[] sArray = this.y(class018072.N());
            ((CompactingPackedIntegerArray)class045522).lithium$compact(this.y.u(), (class07340)lithiumHashPalette, sArray);
            if (lithiumHashPalette2 != null && lithiumHashPalette2.method_12197() == lithiumHashPalette.method_12197() && !(class066172 = ((StrategyAccessor)class018072).lithium$getConfigurationForPaletteSize(lithiumHashPalette2.method_12197())).N() && class045522.L() == class066172.L()) {
                optional = this.N((long[])class045522.N().clone());
                list = lithiumHashPalette2.getElements();
            } else {
                int n = ((StrategyAccessor)class018072).lithium$getConfigurationForPaletteSize(lithiumHashPalette.method_12197()).L();
                if (n != 0) {
                    class01198 class011982 = new class01198(n, sArray.length);
                    for (int i = 0; i < sArray.length; ++i) {
                        class011982.y(i, (int)sArray[i]);
                    }
                    optional = this.N(class011982.N());
                }
                list = lithiumHashPalette.getElements();
            }
        }
        this.M();
        return new class03936(list, optional);
    }

    private Optional N(long[] lArray) {
        return Optional.of(Arrays.stream(lArray));
    }

    protected T N(int n) {
        class07365<T> class073652 = this.y;
        return (T)class073652.u().method_12288(class073652.L().N(n));
    }

    public void N(Consumer<T> consumer) {
        class07340 class073402 = this.y.u();
        IntArraySet intArraySet = new IntArraySet();
        this.y.L().N(arg_0 -> ((IntSet)intArraySet).add(arg_0));
        intArraySet.forEach(n -> consumer.accept(class073402.method_12288(n)));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class00667 class006672) {
        this.R();
        try {
            byte by = class006672.readByte();
            class07365<T> class073652 = this.N(this.y, by);
            class073652.u().method_12289(class006672, this.L.y());
            class006672.L(class073652.L().N());
            this.y = class073652;
        }
        finally {
            this.M();
        }
    }

    public static <T> DataResult<class07348<T>> N(class01807<T> class018072, class03936<T> class039362) {
        class03236 class032362;
        class07340 class073402;
        List list = class039362.N();
        int n = class018072.N();
        class06617 class066172 = class018072.y(list.size());
        int n2 = class066172.L();
        if (class039362.L() != -1 && n2 != class039362.L()) {
            return DataResult.error(() -> "Invalid bit count, calculated " + n2 + ", but container declared " + class039362.L());
        }
        if (class066172.y() == 0) {
            class073402 = class066172.N(class018072, list);
            class032362 = new class03236(n);
        } else {
            Optional var8 = class039362.y();
            if (var8.isEmpty()) {
                return DataResult.error(() -> "Missing values for non-zero storage");
            }
            long[] lArray = ((LongStream)var8.get()).toArray();
            try {
                if (class066172.N() || class066172.y() != n2) {
                    class00567 class005672 = new class00567(n2, list);
                    class01198 class011982 = new class01198(n2, n, lArray);
                    class07340 class073403 = class066172.N(class018072, list);
                    int[] nArray = class07348.N((class04552)class011982, class005672, class073403);
                    class073402 = class073403;
                    class032362 = new class01198(class066172.y(), n, nArray);
                } else {
                    class073402 = class066172.N(class018072, list);
                    class032362 = new class01198(class066172.y(), n, lArray);
                }
            }
            catch (class09447 class094472) {
                return DataResult.error(() -> "Failed to read PalettedContainer: " + class094472.getMessage());
            }
        }
        return DataResult.success(new class07348<T>(class018072, class066172, (class04552)class032362, class073402));
    }

    private static <T> int[] N(class04552 class045522, class07340<T> class073402, class07340<T> class073403) {
        int[] nArray = new int[class045522.y()];
        class045522.N(nArray);
        class07342 class073422 = class07342.N();
        int n = -1;
        int n2 = -1;
        for (int i = 0; i < nArray.length; ++i) {
            int n3 = nArray[i];
            if (n3 != n) {
                n = n3;
                n2 = class073403.method_12291(class073402.method_12288(n3), class073422);
            }
            nArray[i] = n2;
        }
        return nArray;
    }

    private static <T, C extends class03925<T>> Codec<C> N(Codec<T> codec, class01807<T> class018072, T t, class03945<T, C> class039452) {
        return RecordCodecBuilder.create(instance -> instance.group((App)codec.mapResult(class06338.N((Object)t)).listOf().fieldOf("palette").forGetter(class03936::N), (App)Codec.LONG_STREAM.lenientOptionalFieldOf("data").forGetter(class03936::y)).apply((Applicative)instance, class03936::new)).comapFlatMap(class039362 -> class039452.read(class018072, class039362), class039252 -> class039252.N(class018072));
    }

    private class07365<T> N(@Nullable class07365<T> class073652, int n) {
        class06617 class066172 = this.L.N(n);
        if (class073652 != null && class066172.equals((Object)class073652.y())) {
            return class073652;
        }
        class03236 class032362 = class066172.y() == 0 ? new class03236(this.L.N()) : new class01198(class066172.y(), this.L.N());
        class07340 class073402 = class066172.N(this.L, List.of());
        return new class07365(class066172, (class04552)class032362, class073402);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public T N(int n, int n2, int n3, T t) {
        this.R();
        try {
            T t2 = this.N(this.L.N(n, n2, n3), t);
            return t2;
        }
        finally {
            this.M();
        }
    }

    private T N(int n, T t) {
        int n2 = this.y.u().method_12291(t, (class07342)this);
        int n3 = this.y.L().N(n, n2);
        return (T)this.y.u().method_12288(n3);
    }

    public T N(int n, int n2, int n3) {
        return this.N(this.L.N(n, n2, n3));
    }

    public boolean N(Predicate<T> predicate) {
        return this.y.u().method_19525(predicate);
    }

    public void N(class07350<T> class073502) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class073502, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (this.y.u().method_12197() == 1) {
            class073502.accept(this.y.u().method_12288(0), this.y.L().y());
            return;
        }
        Int2IntOpenHashMap int2IntOpenHashMap = new Int2IntOpenHashMap();
        IntConsumer intConsumer = n -> int2IntOpenHashMap.addTo(n, 1);
        this.y.L().N(this.N(intConsumer, class073502, int2IntOpenHashMap));
        int2IntOpenHashMap.int2IntEntrySet().forEach(entry -> class073502.accept(this.y.u().method_12288(entry.getIntKey()), entry.getIntValue()));
    }

    public void sodium$unpack(Object[] objectArray) {
        class01807<T> class018072 = Objects.requireNonNull(this.L);
        if (objectArray.length != class018072.N()) {
            throw new IllegalArgumentException("Array is wrong size");
        }
        class07365<T> class073652 = Objects.requireNonNull(this.y, "PalettedContainer must have data");
        ((BitStorageExtension)class073652.L()).sodium$unpack(objectArray, class073652.u());
    }

    public void sodium$unpack(Object[] objectArray, int n, int n2, int n3, int n4, int n5, int n6) {
        class01807<T> class018072 = Objects.requireNonNull(this.L);
        if (objectArray.length != class018072.N()) {
            throw new IllegalArgumentException("Array is wrong size");
        }
        class07365<T> class073652 = Objects.requireNonNull(this.y, "PalettedContainer must have data");
        class04552 class045522 = class073652.L();
        class07340<T> class073402 = class073652.u();
        for (int i = n2; i <= n5; ++i) {
            for (int j = n3; j <= n6; ++j) {
                for (int k = n; k <= n4; ++k) {
                    Object object;
                    int n7 = class018072.N(k, i, j);
                    int n8 = class045522.N(n7);
                    objectArray[n7] = object = class073402.method_12288(n8);
                }
            }
        }
    }

    public void R() {
    }

    public int onResize(int n, T t) {
        class07365<T> class073652 = this.y;
        class07365<T> class073653 = this.N(class073652, n);
        class073653.N(class073652.u(), class073652.L());
        this.y = class073653;
        return class073653.u().method_12291(t, class07342.N());
    }

    public class07340 getPalette() {
        return this.Z().getPalette();
    }

    public class04552 getStorage() {
        return this.Z().getStorage();
    }
}


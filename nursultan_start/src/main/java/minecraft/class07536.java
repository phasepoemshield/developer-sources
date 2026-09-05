/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10765
 *  com.google.common.base.Function
 *  com.google.common.base.Ticker
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.util.concurrent.MoreExecutors
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.jtracy.Zone
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectLists
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceImmutableList
 *  it.unimi.dsi.fastutil.objects.ReferenceList
 *  minecraft.class00751
 *  minecraft.class01036
 *  minecraft.class01894
 *  minecraft.class02587
 *  minecraft.class03393
 *  minecraft.class03682
 *  minecraft.class03914
 *  minecraft.class04995
 *  minecraft.class04999
 *  minecraft.class06069
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 *  minecraft.class07980
 *  minecraft.class08092
 *  minecraft.class08717
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10765;
import com.google.common.base.Function;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.MoreExecutors;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLists;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceImmutableList;
import it.unimi.dsi.fastutil.objects.ReferenceList;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01036;
import minecraft.class01894;
import minecraft.class02587;
import minecraft.class03393;
import minecraft.class03682;
import minecraft.class03914;
import minecraft.class04995;
import minecraft.class04999;
import minecraft.class06069;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07524;
import minecraft.class07529;
import minecraft.class07533;
import minecraft.class07540;
import minecraft.class07543;
import minecraft.class07545;
import minecraft.class07551;
import minecraft.class07552;
import minecraft.class07553;
import minecraft.class07555;
import minecraft.class07561;
import minecraft.class07563;
import minecraft.class07878;
import minecraft.class07980;
import minecraft.class08092;
import minecraft.class08717;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07536 {
    public static final Logger N = LogUtils.getLogger();
    private static final int B = 255;
    private static final int Z = 10;
    private static final String z = "max.bg.threads";
    private static final class08717 U = class07536.L("Main");
    private static final class08717 E = class07536.N("IO-Worker-", false);
    private static final class08717 W = class07536.N("Download-", true);
    private static final DateTimeFormatter m = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH.mm.ss", Locale.ROOT);
    public static final int y = 8;
    private static final Set<String> P = Set.of("http", "https");
    public static final long L = 1000000L;
    public static class03393 u = System::nanoTime;
    public static final Ticker i = new class07543();
    public static final UUID R = new UUID(0L, 0L);
    public static final FileSystemProvider M = FileSystemProvider.installedProviders().stream().filter(fileSystemProvider -> fileSystemProvider.getScheme().equalsIgnoreCase("jar")).findFirst().orElseThrow(() -> new IllegalStateException("No jar file system provider found"));
    private static Consumer<String> s = string -> {};

    public static <T> void L(List<T> list, class06069 class060692) {
        for (int i = list.size(); i > 1; --i) {
            int n = class060692.y(i);
            list.set(i - 1, list.set(n, list.get(i - 1)));
        }
    }

    public static long L() {
        return class07536.u() / 1000000L;
    }

    public static <V> CompletableFuture<List<V>> L(List<? extends CompletableFuture<V>> list) {
        if (list.isEmpty()) {
            return CompletableFuture.completedFuture(List.of());
        }
        if (list.size() == 1) {
            return ((CompletableFuture)list.getFirst()).thenApply(ObjectLists::singleton);
        }
        return CompletableFuture.allOf(list.toArray(new CompletableFuture[0])).thenApply(void_ -> list.stream().map(CompletableFuture::join).toList());
    }

    public static String L(Throwable throwable) {
        if (throwable.getCause() != null) {
            return class07536.L(throwable.getCause());
        }
        if (throwable.getMessage() != null) {
            return throwable.getMessage();
        }
        return throwable.toString();
    }

    private static class08717 L(String string) {
        Object object;
        int n = class07536.M();
        if (n <= 0) {
            object = MoreExecutors.newDirectExecutorService();
        } else {
            AtomicInteger atomicInteger = new AtomicInteger(1);
            object = new ForkJoinPool(n, forkJoinPool -> {
                String string2 = "Worker-" + string + "-" + atomicInteger.getAndIncrement();
                class07524 class075242 = new class07524(forkJoinPool, string2, string);
                class075242.setName(string2);
                return class075242;
            }, class07536::N, true);
        }
        return new class08717((ExecutorService)object);
    }

    private static BooleanSupplier L(Path path) {
        return new class07551(path);
    }

    public static <T> CompletableFuture<T> L(java.util.function.Function<Executor, CompletableFuture<T>> function) {
        return class07536.N_78(function, CompletableFuture::isDone);
    }

    public static int M() {
        return class04995.N((int)(Runtime.getRuntime().availableProcessors() - 1), (int)1, (int)class07536.T());
    }

    public static <T> ToIntFunction<T> M(List<T> list) {
        int n = list.size();
        if (n < 8) {
            ReferenceImmutableList referenceImmutableList = new ReferenceImmutableList(list);
            return arg_0 -> ((ReferenceList)referenceImmutableList).indexOf(arg_0);
        }
        Reference2IntOpenHashMap reference2IntOpenHashMap = new Reference2IntOpenHashMap(n);
        reference2IntOpenHashMap.defaultReturnValue(-1);
        for (int i = 0; i < n; ++i) {
            reference2IntOpenHashMap.put(list.get(i), i);
        }
        return reference2IntOpenHashMap;
    }

    public static boolean P() {
        return System.getProperty("os.arch").toLowerCase(Locale.ROOT).equals("aarch64");
    }

    private static int T() {
        String string = System.getProperty(z);
        if (string != null) {
            try {
                int n = Integer.parseInt(string);
                if (n >= 1 && n <= 255) {
                    return n;
                }
                N.error("Wrong {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{z, string, 255});
            }
            catch (NumberFormatException numberFormatException) {
                N.error("Could not parse {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{z, string, 255});
            }
        }
        return 255;
    }

    public static class08717 B() {
        return U;
    }

    public static class08717 Z() {
        return E;
    }

    public static long i() {
        return Instant.now().toEpochMilli();
    }

    public static <V> CompletableFuture<List<V>> i(List<? extends CompletableFuture<? extends V>> list) {
        CompletableFuture completableFuture = new CompletableFuture();
        return class07536.N_76(list, throwable -> {
            if (completableFuture.completeExceptionally((Throwable)throwable)) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((CompletableFuture)iterator.next()).cancel(true);
                }
            }
        }).applyToEither((CompletionStage)completableFuture, java.util.function.Function.identity());
    }

    public static void s() {
        class10765 class107652 = new class10765("Timer hack thread");
        class107652.setDaemon(true);
        class107652.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(N));
        class107652.start();
    }

    public static class07533 m() {
        String string = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (string.contains("win")) {
            return class07533.field_1133;
        }
        if (string.contains("mac")) {
            return class07533.field_1137;
        }
        if (string.contains("solaris")) {
            return class07533.field_1134;
        }
        if (string.contains("sunos")) {
            return class07533.field_1134;
        }
        if (string.contains("linux")) {
            return class07533.field_1135;
        }
        if (string.contains("unix")) {
            return class07533.field_1135;
        }
        return class07533.field_1132;
    }

    public static void U() {
        U.N(3L, TimeUnit.SECONDS);
        E.N(3L, TimeUnit.SECONDS);
    }

    public static class08717 z() {
        return W;
    }

    private static void u(String string) {
        Instant instant = Instant.now();
        N.warn("Did you remember to set a breakpoint here?");
        if (!(Duration.between(instant, Instant.now()).toMillis() > 500L)) {
            s.accept(string);
        }
    }

    public static long u() {
        return u.getAsLong();
    }

    public static <V> CompletableFuture<List<V>> u(List<? extends CompletableFuture<? extends V>> list) {
        CompletableFuture completableFuture = new CompletableFuture();
        return class07536.N_76(list, completableFuture::completeExceptionally).applyToEither((CompletionStage)completableFuture, java.util.function.Function.identity());
    }

    public static <T> Optional<T> y_9(List<T> list, class06069 class060692) {
        if (list.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(class07536.N_77(list, class060692));
    }

    public static <T, R> java.util.function.Function<T, R> y_4(java.util.function.Function<T, R> function) {
        return new class07555(function);
    }

    public static <T> List<T> y(T[] TArray, class06069 class060692) {
        ObjectArrayList objectArrayList = new ObjectArrayList((Object[])TArray);
        class07536.L(objectArrayList, class060692);
        return objectArrayList;
    }

    public static <T> T y(Iterable<T> iterable, @Nullable T t) {
        Iterator<T> iterator = iterable.iterator();
        T t2 = null;
        while (iterator.hasNext()) {
            T t3 = iterator.next();
            if (t3 == t) {
                if (t2 != null) break;
                t2 = (T)(iterator.hasNext() ? Iterators.getLast(iterator) : t);
                break;
            }
            t2 = t3;
        }
        return t2;
    }

    public static void y(Path path, Path path2, Path path3) throws IOException {
        Path path4 = path.relativize(path3);
        Path path5 = path2.resolve(path4);
        Files.copy(path3, path5, new CopyOption[0]);
    }

    public static void y(String string) {
        N.error(string);
        if (class07529.ND) {
            class07536.u(string);
        }
    }

    public static <T extends Throwable> T y(T t) {
        if (class07529.ND) {
            N.error("Trying to throw a fatal exception, pausing in IDE", t);
            class07536.u(t.getMessage());
        }
        return t;
    }

    public static <T> Collector<T, ?, List<T>> y() {
        return Collectors.toCollection(Lists::newArrayList);
    }

    private static BooleanSupplier y(Path path) {
        return new class07540(path);
    }

    public static <T> Predicate<T> y(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return object -> predicate.test(object) || predicate2.test(object);
    }

    public static <T> Predicate<T> y(Predicate<? super T> predicate, Predicate<? super T> predicate2, Predicate<? super T> predicate3) {
        return object -> predicate.test(object) || predicate2.test(object) || predicate3.test(object);
    }

    private static @Nullable Type<?> y(DSL.TypeReference typeReference, String string) {
        Type type;
        block2: {
            type = null;
            try {
                type = class04999.N().getSchema(DataFixUtils.makeKey((int)class07529.y().comp_4026().y())).getChoiceType(typeReference, string);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                N.error("No data fixer registered for {}", (Object)string);
                if (!class07529.ND) break block2;
                throw illegalArgumentException;
            }
        }
        return type;
    }

    public static <T> Predicate<T> y(Predicate<? super T> predicate, Predicate<? super T> predicate2, Predicate<? super T> predicate3, Predicate<? super T> predicate4) {
        return object -> predicate.test(object) || predicate2.test(object) || predicate3.test(object) || predicate4.test(object);
    }

    public static <T> Predicate<T> y_10(Predicate<? super T> predicate) {
        return predicate;
    }

    @SafeVarargs
    public static <T> Predicate<T> y(Predicate<? super T> ... predicateArray) {
        return object -> {
            Predicate[] predicateArray2 = predicateArray;
            int n = predicateArray2.length;
            for (int i = 0; i < n; ++i) {
                if (!predicateArray2[i].test(object)) continue;
                return true;
            }
            return false;
        };
    }

    public static <T> Predicate<T> y(List<? extends Predicate<? super T>> list) {
        return switch (list.size()) {
            case 0 -> class07536.W();
            case 1 -> class07536.y_10(list.get(0));
            case 2 -> class07536.y(list.get(0), list.get(1));
            case 3 -> class07536.y(list.get(0), list.get(1), list.get(2));
            case 4 -> class07536.y(list.get(0), list.get(1), list.get(2), list.get(3));
            case 5 -> class07536.y(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
            default -> class07536.y((Predicate[])list.toArray(Predicate[]::new));
        };
    }

    public static <T> Predicate<T> y(Predicate<? super T> predicate, Predicate<? super T> predicate2, Predicate<? super T> predicate3, Predicate<? super T> predicate4, Predicate<? super T> predicate5) {
        return object -> predicate.test(object) || predicate2.test(object) || predicate3.test(object) || predicate4.test(object) || predicate5.test(object);
    }

    public static <T> Predicate<T> E() {
        return object -> true;
    }

    public static <A, B> Typed<B> N(Typed<A> typed, Type<B> type, UnaryOperator<Dynamic<?>> unaryOperator) {
        Dynamic dynamic = (Dynamic)typed.write().getOrThrow();
        return class07536.N(type, (Dynamic)unaryOperator.apply(dynamic), true);
    }

    public static <T> Typed<T> N(Type<T> type, Dynamic<?> dynamic) {
        return class07536.N(type, dynamic, false);
    }

    public static <T> Typed<T> N(Type<T> type, Dynamic<?> dynamic, boolean bl) {
        DataResult dataResult = type.readTyped(dynamic).map(Pair::getFirst);
        try {
            if (bl) {
                return (Typed)dataResult.getPartialOrThrow(IllegalStateException::new);
            }
            return (Typed)dataResult.getOrThrow(IllegalStateException::new);
        }
        catch (IllegalStateException illegalStateException) {
            class07080 class070802 = class07080.N((Throwable)illegalStateException, (String)"Reading type");
            class07074 class070742 = class070802.N("Info");
            class070742.N("Data", dynamic);
            class070742.N("Type", type);
            throw new class07878(class070802);
        }
    }

    public static IntArrayList N(IntStream intStream, class06069 class060692) {
        IntArrayList intArrayList = IntArrayList.wrap((int[])intStream.toArray());
        for (int i = intArrayList.size(); i > 1; --i) {
            int n = class060692.y(i);
            intArrayList.set(i - 1, intArrayList.set(n, intArrayList.getInt(i - 1)));
        }
        return intArrayList;
    }

    public static <T> List<T> N(Stream<T> stream, class06069 class060692) {
        ObjectArrayList objectArrayList = (ObjectArrayList)stream.collect(ObjectArrayList.toList());
        class07536.L(objectArrayList, class060692);
        return objectArrayList;
    }

    public static int N(int[] nArray, class06069 class060692) {
        return nArray[class060692.y(nArray.length)];
    }

    public static <T, U, R> BiFunction<T, U, R> N(BiFunction<T, U, R> biFunction) {
        return new class07561(biFunction);
    }

    public static <T> T N_78(java.util.function.Function<Executor, T> function, Predicate<T> predicate) {
        int n;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        T t = function.apply(linkedBlockingQueue::add);
        while (!predicate.test(t)) {
            try {
                Runnable runnable = (Runnable)linkedBlockingQueue.poll(100L, TimeUnit.MILLISECONDS);
                if (runnable == null) continue;
                runnable.run();
            }
            catch (InterruptedException interruptedException) {
                N.warn("Interrupted wait");
                break;
            }
        }
        if ((n = linkedBlockingQueue.size()) > 0) {
            N.warn("Tasks left in queue: {}", (Object)n);
        }
        return t;
    }

    public static <T extends Comparable<T>> String N(class08092<T> class080922, Object object) {
        return class080922.y((Comparable)object);
    }

    public static String N(String string, @Nullable class01894 class018942) {
        if (class018942 == null) {
            return string + ".unregistered_sadface";
        }
        return string + "." + class018942.y() + "." + class018942.N().replace('/', '.');
    }

    public static <T> List<T> N(ObjectArrayList<T> objectArrayList, class06069 class060692) {
        ObjectArrayList objectArrayList2 = new ObjectArrayList(objectArrayList);
        class07536.L(objectArrayList2, class060692);
        return objectArrayList2;
    }

    public static <K, V> Map<K, V> N(Map<K, V> map, K k, V v) {
        return ImmutableMap.builderWithExpectedSize((int)(map.size() + 1)).putAll(map).put(k, v).buildKeepingLast();
    }

    public static <T> List<T> N(T t, List<T> list) {
        return ImmutableList.builderWithExpectedSize((int)(list.size() + 1)).add(t).addAll(list).build();
    }

    public static <T> List<T> N(List<T> list, T t) {
        return ImmutableList.builderWithExpectedSize((int)(list.size() + 1)).addAll(list).add(t).build();
    }

    public static <K, V> Collector<Map.Entry<? extends K, ? extends V>, ?, Map<K, V>> N() {
        return Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue);
    }

    public static URI N(String string) throws URISyntaxException {
        URI uRI = new URI(string);
        String string2 = uRI.getScheme();
        if (string2 == null) {
            throw new URISyntaxException(string, "Missing protocol in URI: " + string);
        }
        String string3 = string2.toLowerCase(Locale.ROOT);
        if (!P.contains(string3)) {
            throw new URISyntaxException(string, "Unsupported protocol in URI: " + string);
        }
        return uRI;
    }

    public static DateTimeFormatter N(FormatStyle formatStyle) {
        return DateTimeFormatter.ofLocalizedDateTime(formatStyle);
    }

    public static int N(int n, int n2) {
        return (int)Math.max(Math.min((long)n + (long)(n >> 1), 0x7FFFFFF7L), (long)n2);
    }

    public static <T> boolean N(int n, int n2, List<T> list) {
        if (n == 1) {
            return true;
        }
        int n3 = n / 2;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n3; ++j) {
                T t;
                int n4 = n - 1 - j;
                T t2 = list.get(j + i * n);
                if (t2.equals(t = list.get(n4 + i * n))) continue;
                return false;
            }
        }
        return true;
    }

    public static <T> Predicate<T> N(List<? extends Predicate<? super T>> list) {
        return switch (list.size()) {
            case 0 -> class07536.E();
            case 1 -> class07536.N_79(list.get(0));
            case 2 -> class07536.N(list.get(0), list.get(1));
            case 3 -> class07536.N(list.get(0), list.get(1), list.get(2));
            case 4 -> class07536.N(list.get(0), list.get(1), list.get(2), list.get(3));
            case 5 -> class07536.N(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
            default -> class07536.N((Predicate[])list.toArray(Predicate[]::new));
        };
    }

    @SafeVarargs
    public static <T> Predicate<T> N(Predicate<? super T> ... predicateArray) {
        return object -> {
            Predicate[] predicateArray2 = predicateArray;
            int n = predicateArray2.length;
            for (int i = 0; i < n; ++i) {
                if (predicateArray2[i].test(object)) continue;
                return false;
            }
            return true;
        };
    }

    public static <K, V1, V2> Map<K, V2> N(Map<K, V1> map, Function<V1, V2> function) {
        return Maps.transformValues(map, function);
    }

    public static <K, V1, V2> Map<K, V2> N(Map<K, V1> map, java.util.function.Function<? super V1, V2> function) {
        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> function.apply((Object)entry.getValue())));
    }

    public static <K extends Enum<K>, V> Map<K, V> N_74(Class<K> clazz, java.util.function.Function<K, V> function) {
        EnumMap<Enum, V> enumMap = new EnumMap<Enum, V>(clazz);
        for (Enum enum_ : (Enum[])clazz.getEnumConstants()) {
            enumMap.put(enum_, function.apply(enum_));
        }
        return enumMap;
    }

    public static <T> T N(T t, Consumer<? super T> consumer) {
        consumer.accept(t);
        return t;
    }

    public static <T> T N(Supplier<T> supplier) {
        return supplier.get();
    }

    public static <T> T N(Iterable<T> iterable, @Nullable T t) {
        Iterator<T> iterator = iterable.iterator();
        T t2 = iterator.next();
        if (t != null) {
            T t3 = t2;
            while (true) {
                if (t3 == t) {
                    if (!iterator.hasNext()) break;
                    return iterator.next();
                }
                if (!iterator.hasNext()) continue;
                t3 = iterator.next();
            }
        }
        return t2;
    }

    public static <T> String N(class00751<T> class007512, T t) {
        class01894 class018942 = class007512.y(t);
        if (class018942 == null) {
            return "[unregistered]";
        }
        return class018942.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void N(Runnable runnable, String string) {
        block16: {
            if (class07529.ND) {
                Thread thread = Thread.currentThread();
                String string2 = thread.getName();
                thread.setName(string);
                try (Zone zone = TracyClient.beginZone((String)string, (boolean)class07529.ND);){
                    runnable.run();
                    break block16;
                }
                finally {
                    thread.setName(string2);
                }
            }
            try (Zone zone = TracyClient.beginZone((String)string, (boolean)class07529.ND);){
                runnable.run();
            }
        }
    }

    public static @Nullable Type<?> N(DSL.TypeReference typeReference, String string) {
        if (!class07529.Nx) {
            return null;
        }
        return class07536.y(typeReference, string);
    }

    private static void N(Thread thread, Throwable throwable) {
        class07536.y(throwable);
        if (throwable instanceof CompletionException) {
            throwable = throwable.getCause();
        }
        if (throwable instanceof class07878) {
            class03914.N((String)((class07878)throwable).N().N(class02587.N));
            System.exit(-1);
        }
        N.error("Caught exception in thread {}", (Object)thread, (Object)throwable);
    }

    public static void N(Throwable throwable) {
        throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
    }

    private static class08717 N(String string, boolean bl) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        return new class08717(Executors.newCachedThreadPool(runnable -> {
            Thread thread = new Thread(runnable);
            String string2 = string + atomicInteger.getAndIncrement();
            TracyClient.setThreadName((String)string2, (int)string.hashCode());
            thread.setName(string2);
            thread.setDaemon(bl);
            thread.setUncaughtExceptionHandler(class07536::N);
            return thread;
        }));
    }

    public static <T> Predicate<T> N(Predicate<? super T> predicate, Predicate<? super T> predicate2, Predicate<? super T> predicate3, Predicate<? super T> predicate4, Predicate<? super T> predicate5) {
        return object -> predicate.test(object) && predicate2.test(object) && predicate3.test(object) && predicate4.test(object) && predicate5.test(object);
    }

    public static <T> Predicate<T> N(Predicate<? super T> predicate, Predicate<? super T> predicate2, Predicate<? super T> predicate3, Predicate<? super T> predicate4) {
        return object -> predicate.test(object) && predicate2.test(object) && predicate3.test(object) && predicate4.test(object);
    }

    public static <T> Predicate<T> N(Predicate<? super T> predicate, Predicate<? super T> predicate2, Predicate<? super T> predicate3) {
        return object -> predicate.test(object) && predicate2.test(object) && predicate3.test(object);
    }

    public static <T> Predicate<T> N(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return object -> predicate.test(object) && predicate2.test(object);
    }

    public static <T> Predicate<T> N_79(Predicate<? super T> predicate) {
        return predicate;
    }

    public static int N(String string, int n, int n2) {
        int n3 = string.length();
        if (n2 >= 0) {
            for (int i = 0; n < n3 && i < n2; ++i) {
                if (!Character.isHighSurrogate(string.charAt(n++)) || n >= n3 || !Character.isLowSurrogate(string.charAt(n))) continue;
                ++n;
            }
        } else {
            for (int i = n2; n > 0 && i < 0; ++i) {
                if (!Character.isLowSurrogate(string.charAt(--n)) || n <= 0 || !Character.isHighSurrogate(string.charAt(n - 1))) continue;
                --n;
            }
        }
        return n;
    }

    public static boolean N(Path path, Path path2, Path path3, boolean bl) {
        if (Files.exists(path, new LinkOption[0]) && !class07536.N(10, "create backup " + String.valueOf(path3), class07536.N(path3), class07536.N(path, path3), class07536.L(path3))) {
            return false;
        }
        if (!class07536.N(10, "remove old " + String.valueOf(path), class07536.N(path), class07536.y(path))) {
            return false;
        }
        if (!class07536.N(10, "replace " + String.valueOf(path) + " with " + String.valueOf(path2), class07536.N(path2, path), class07536.L(path)) && !bl) {
            class07536.N(10, "restore " + String.valueOf(path) + " from " + String.valueOf(path3), class07536.N(path3, path), class07536.L(path));
            return false;
        }
        return true;
    }

    public static void N(Path path, Path path2, Path path3) {
        class07536.N(path, path2, path3, false);
    }

    private static boolean N(int n, String string, BooleanSupplier ... booleanSupplierArray) {
        for (int i = 0; i < n; ++i) {
            if (class07536.N(booleanSupplierArray)) {
                return true;
            }
            N.error("Failed to {}, retrying {}/{}", new Object[]{string, i, n});
        }
        N.error("Failed to {}, aborting, progress might be lost", (Object)string);
        return false;
    }

    private static boolean N(BooleanSupplier ... booleanSupplierArray) {
        for (BooleanSupplier booleanSupplier : booleanSupplierArray) {
            if (booleanSupplier.getAsBoolean()) continue;
            N.warn("Failed to execute {}", (Object)booleanSupplier);
            return false;
        }
        return true;
    }

    private static BooleanSupplier N(Path path) {
        return new class07552(path);
    }

    public static <K, V> class03682<K, V> N(java.util.function.Function<K, V> function) {
        return new class03682(function);
    }

    public static String N_75(String string, class01036 class010362) {
        return string.toLowerCase(Locale.ROOT).chars().mapToObj(n -> class010362.test((char)n) ? Character.toString((char)n) : "_").collect(Collectors.joining());
    }

    public static <T> DataResult<List<T>> N(List<T> list, int n) {
        if (list.size() != n) {
            Supplier<String> supplier = () -> "Input is not a list of " + n + " elements";
            if (list.size() >= n) {
                return DataResult.error(supplier, list.subList(0, n));
            }
            return DataResult.error(supplier);
        }
        return DataResult.success(list);
    }

    public static DataResult<long[]> N(LongStream longStream, int n) {
        long[] lArray = longStream.limit(n + 1).toArray();
        if (lArray.length != n) {
            Supplier<String> supplier = () -> "Input is not a list of " + n + " longs";
            if (lArray.length >= n) {
                return DataResult.error(supplier, (Object)Arrays.copyOf(lArray, n));
            }
            return DataResult.error(supplier);
        }
        return DataResult.success((Object)lArray);
    }

    public static DataResult<int[]> N(IntStream intStream, int n) {
        int[] nArray = intStream.limit(n + 1).toArray();
        if (nArray.length != n) {
            Supplier<String> supplier = () -> "Input is not a list of " + n + " ints";
            if (nArray.length >= n) {
                return DataResult.error(supplier, (Object)Arrays.copyOf(nArray, n));
            }
            return DataResult.error(supplier);
        }
        return DataResult.success((Object)nArray);
    }

    public static Consumer<String> N(String string, Consumer<String> consumer) {
        return string2 -> consumer.accept(string + string2);
    }

    private static <V> CompletableFuture<List<V>> N_76(List<? extends CompletableFuture<? extends V>> list, Consumer<Throwable> consumer) {
        ObjectArrayList objectArrayList = new ObjectArrayList();
        objectArrayList.size(list.size());
        CompletableFuture[] completableFutureArray = new CompletableFuture[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            int n = i;
            completableFutureArray[i] = list.get(i).whenComplete((object, throwable) -> {
                if (throwable != null) {
                    consumer.accept((Throwable)throwable);
                } else {
                    objectArrayList.set(n, object);
                }
            });
        }
        return CompletableFuture.allOf(completableFutureArray).thenApply(void_ -> objectArrayList);
    }

    public static void N(String string, Throwable throwable) {
        N.error(string, throwable);
        if (class07529.ND) {
            class07536.u(string);
        }
    }

    public static Runnable N(Runnable runnable, Supplier<String> supplier) {
        if (class07529.c) {
            String string = supplier.get();
            return new class07545(runnable, string);
        }
        return runnable;
    }

    public static <T> Supplier<T> N(Supplier<T> supplier, Supplier<String> supplier2) {
        if (class07529.c) {
            String string = supplier2.get();
            return new class07553(supplier, string);
        }
        return supplier;
    }

    public static <T> Optional<T> N(Optional<T> optional, Consumer<T> consumer, Runnable runnable) {
        if (optional.isPresent()) {
            consumer.accept(optional.get());
        } else {
            runnable.run();
        }
        return optional;
    }

    private static BooleanSupplier N(Path path, Path path2) {
        return new class07563(path, path2);
    }

    public static <T> T N_77(List<T> list, class06069 class060692) {
        return list.get(class060692.y(list.size()));
    }

    public static <T> T N(T[] TArray, class06069 class060692) {
        return TArray[class060692.y(TArray.length)];
    }

    public static void N(Consumer<String> consumer) {
        s = consumer;
    }

    public static <T> Predicate<T> W() {
        return object -> false;
    }

    public static String R() {
        return m.format(ZonedDateTime.now());
    }

    public static <T> ToIntFunction<T> R(List<T> list) {
        int n = list.size();
        if (n < 8) {
            return list::indexOf;
        }
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap(n);
        object2IntOpenHashMap.defaultReturnValue(-1);
        for (int i = 0; i < n; ++i) {
            object2IntOpenHashMap.put(list.get(i), i);
        }
        return object2IntOpenHashMap;
    }
}


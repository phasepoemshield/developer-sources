/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  minecraft.class01929
 *  minecraft.class03172
 *  minecraft.class03519
 *  minecraft.class04995
 *  minecraft.class05715
 *  minecraft.class06555
 *  minecraft.class07001
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07717
 *  minecraft.class07726
 *  minecraft.class07742
 *  minecraft.class08413
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01929;
import minecraft.class03172;
import minecraft.class03519;
import minecraft.class04995;
import minecraft.class05715;
import minecraft.class06555;
import minecraft.class07001;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07717;
import minecraft.class07726;
import minecraft.class07742;
import minecraft.class08413;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00408
implements AutoCloseable {
    private static final Logger N = LogUtils.getLogger();
    private final Map<class08413<?>, Optional<class06555>> y = new HashMap();
    private final DataFixer L;
    private final class01929 u;
    private final Path i;
    private CompletableFuture<?> R = CompletableFuture.completedFuture(null);

    private <T extends class06555> @Nullable T L(class08413<T> class084132) {
        try {
            Path path = this.N(class084132.N());
            if (Files.exists(path, new LinkOption[0])) {
                class07001 class070012 = this.N(class084132.N(), class084132.u(), class07529.y().comp_4026().y());
                class03519 class035192 = this.u.N((DynamicOps)class07713.N);
                return (T)((class06555)class084132.L().parse((DynamicOps)class035192, (Object)class070012.N("data")).resultOrPartial(string -> N.error("Failed to parse saved data for '{}': {}", (Object)class084132, string)).orElse(null));
            }
        }
        catch (Exception exception) {
            N.error("Error loading saved data: {}", class084132, (Object)exception);
        }
        return null;
    }

    private Map<class08413<?>, class07001> L() {
        Object2ObjectArrayMap object2ObjectArrayMap = new Object2ObjectArrayMap();
        class03519 class035192 = this.u.N((DynamicOps)class07713.N);
        this.y.forEach((arg_0, arg_1) -> this.N((Map)object2ObjectArrayMap, class035192, arg_0, arg_1));
        return object2ObjectArrayMap;
    }

    public class00408(Path path, DataFixer dataFixer, class01929 class019292) {
        this.L = dataFixer;
        this.i = path;
        this.u = class019292;
    }

    @Override
    public void close() {
        this.y();
    }

    public void y() {
        this.N().join();
    }

    public <T extends class06555> @Nullable T y(class08413<T> class084132) {
        Optional<T> optional;
        Optional<class06555> var2 = this.y.get(class084132);
        if (var2 == null) {
            optional = Optional.ofNullable(this.L(class084132));
            this.y.put(class084132, optional);
        }
        return (T)((class06555)optional.orElse(null));
    }

    private class07001 N(class05715 class057152, DataFixer dataFixer, class07001 class070012, int n, int n2, Operation operation) {
        if (class057152 == null) {
            return class070012;
        }
        return (class07001)operation.call(new Object[]{class057152, dataFixer, class070012, n, n2});
    }

    private Path N(String string) {
        return this.i.resolve(string + ".dat");
    }

    private <T extends class06555> class07001 N(class08413<T> class084132, class06555 class065552, class03519<class07709> class035192) {
        Codec codec = class084132.L();
        class07001 class070012 = new class07001();
        class070012.N("data", (class07709)codec.encodeStart(class035192, (Object)class065552).getOrThrow());
        class07717.i((class07001)class070012);
        return class070012;
    }

    public CompletableFuture<?> N() {
        Map<class08413<?>, class07001> var1 = this.L();
        if (var1.isEmpty()) {
            return CompletableFuture.completedFuture(null);
        }
        int n = class07536.M();
        int n2 = var1.size();
        this.R = n2 > n ? this.R.thenCompose(object -> {
            ArrayList<CompletableFuture<Void>> arrayList = new ArrayList<CompletableFuture<Void>>(n);
            int n3 = class04995.R((int)n2, (int)n);
            for (List list : Iterables.partition(var1.entrySet(), (int)n3)) {
                arrayList.add(CompletableFuture.runAsync(() -> {
                    for (Map.Entry entry : list) {
                        this.N((class08413)entry.getKey(), (class07001)entry.getValue());
                    }
                }, (Executor)class07536.Z()));
            }
            return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
        }) : this.R.thenCompose(object -> CompletableFuture.allOf((CompletableFuture[])var1.entrySet().stream().map(entry -> CompletableFuture.runAsync(() -> this.N((class08413)entry.getKey(), (class07001)entry.getValue()), (Executor)class07536.Z())).toArray(CompletableFuture[]::new)));
        return this.R;
    }

    private boolean N(PushbackInputStream pushbackInputStream) throws IOException {
        byte[] byArray = new byte[2];
        boolean bl = false;
        int n = pushbackInputStream.read(byArray, 0, 2);
        if (n == 2 && ((byArray[1] & 0xFF) << 8 | byArray[0] & 0xFF) == 35615) {
            bl = true;
        }
        if (n != 0) {
            pushbackInputStream.unread(byArray, 0, n);
        }
        return bl;
    }

    public class07001 N(String string, class05715 class057152, int n) throws IOException {
        try (InputStream inputStream = Files.newInputStream(this.N(string), new OpenOption[0]);){
            class07001 class070012;
            try (PushbackInputStream pushbackInputStream = new PushbackInputStream((InputStream)new class03172(inputStream), 2);){
                class07001 class070013;
                if (this.N(pushbackInputStream)) {
                    class070013 = class07742.N_82((InputStream)pushbackInputStream, (class07726)class07726.L());
                } else {
                    try (DataInputStream dataInputStream = new DataInputStream(pushbackInputStream);){
                        class070013 = class07742.N((DataInput)dataInputStream);
                    }
                }
                int n2 = class07717.y((class07001)class070013, (int)1343);
                int n3 = n;
                int n4 = n2;
                class07001 class070014 = class070013;
                DataFixer dataFixer = this.L;
                class05715 class057153 = class057152;
                class070012 = this.N(class057153, dataFixer, class070014, n4, n3, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)5, (String)"[net.minecraft.class_4284, com.mojang.datafixers.DataFixer, net.minecraft.class_2487, int, int]");
                    Object[] objectArray2 = objectArray;
                    return ((class05715)objectArray[0]).N((DataFixer)objectArray2[1], (class07001)objectArray2[2], ((Integer)objectArray2[3]).intValue(), ((Integer)objectArray2[4]).intValue());
                });
            }
            return class070012;
        }
    }

    public <T extends class06555> void N(class08413<T> class084132, T t) {
        this.y.put(class084132, Optional.of(t));
        t.method_80();
    }

    private /* synthetic */ void N(Map map, class03519 class035192, class08413 class084132, Optional optional) {
        optional.filter(class06555::method_79).ifPresent(class065552 -> {
            map.put(class084132, this.N((class08413)class084132, (class06555)class065552, (class03519<class07709>)class035192));
            class065552.method_78(false);
        });
    }

    public <T extends class06555> T N(class08413<T> class084132) {
        T t = this.y(class084132);
        if (t != null) {
            return t;
        }
        class06555 class065552 = (class06555)class084132.y().get();
        this.N(class084132, class065552);
        return (T)class065552;
    }

    private void N(class08413<?> class084132, class07001 class070012) {
        Path path = this.N(class084132.N());
        try {
            class07742.N((class07001)class070012, (Path)path);
        }
        catch (IOException iOException) {
            N.error("Could not save data to {}", (Object)path.getFileName(), (Object)iOException);
        }
    }
}


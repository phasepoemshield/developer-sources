/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02277
 *  minecraft.class03190
 *  minecraft.class05715
 *  minecraft.class05918
 *  minecraft.class06820
 *  minecraft.class07001
 *  minecraft.class07080
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07878
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import minecraft.class02277;
import minecraft.class03190;
import minecraft.class05715;
import minecraft.class05918;
import minecraft.class06820;
import minecraft.class07001;
import minecraft.class07080;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07878;
import org.jspecify.annotations.Nullable;

public class class06172
implements AutoCloseable {
    private final class05918 N;
    private final DataFixer y;
    private final class05715 L;
    private final Supplier<class06820> u;

    public class06172(class02277 class022772, Path path, DataFixer dataFixer, boolean bl, class05715 class057152) {
        this(class022772, path, dataFixer, bl, class057152, class06820.N);
    }

    public class06172(class02277 class022772, Path path, DataFixer dataFixer, boolean bl, class05715 class057152, Supplier<class06820> supplier) {
        this.y = dataFixer;
        this.L = class057152;
        this.N = new class05918(class022772, path, bl);
        this.u = Suppliers.memoize(supplier::get);
    }

    protected void i(class07321 class073212) {
        this.u.get().N(class073212);
    }

    public class02277 m() {
        return this.N.N();
    }

    @Override
    public void close() throws IOException {
        this.N.close();
    }

    public CompletableFuture<Optional<class07001>> u(class07321 class073212) {
        return this.N.N(class073212);
    }

    public CompletableFuture<Void> y(boolean bl) {
        return this.N.N(bl);
    }

    public boolean y(class07321 class073212, int n) {
        return this.N.N(class073212, n);
    }

    public CompletableFuture<Void> N(class07321 class073212, Supplier<class07001> supplier) {
        this.i(class073212);
        return this.N.N(class073212, supplier);
    }

    public CompletableFuture<Void> N(class07321 class073212, class07001 class070012) {
        return this.N(class073212, () -> class070012);
    }

    public Dynamic<class07709> N(Dynamic<class07709> dynamic, int n) {
        return new Dynamic(dynamic.getOps(), (Object)this.N((class07001)dynamic.getValue(), n, null));
    }

    public static void N(class07001 class070012, @Nullable class07001 class070013) {
        if (class070013 != null) {
            class070012.N("__context", (class07709)class070013);
        }
    }

    public class07001 N(class07001 class070012, int n) {
        return this.N(class070012, n, null);
    }

    private static void N(class07001 class070012) {
        class070012.b("__context");
    }

    public class07001 N(class07001 class070012, int n, @Nullable class07001 class070013) {
        int n2 = class07717.y((class07001)class070012, (int)n);
        if (n2 == class07529.y().comp_4026().y()) {
            return class070012;
        }
        try {
            class070012 = this.u.get().applyFix(class070012);
            class06172.N(class070012, class070013);
            class070012 = this.L.N(this.y, class070012, Math.max(this.u.get().N(), n2));
            class06172.N(class070012);
            class07717.i((class07001)class070012);
            return class070012;
        }
        catch (Exception exception) {
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Updated chunk");
            class070802.N("Updated chunk details").N("Data version", (Object)n2);
            throw new class07878(class070802);
        }
    }

    public class03190 W() {
        return this.N;
    }
}


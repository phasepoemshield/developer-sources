/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09427
 *  com.google.common.collect.Lists
 *  com.google.common.hash.HashCode
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00642
 *  minecraft.class01055
 *  minecraft.class01057
 *  minecraft.class01061
 *  minecraft.class01078
 *  minecraft.class01090
 *  minecraft.class01283
 *  minecraft.class01603
 *  minecraft.class01613
 *  minecraft.class01789
 *  minecraft.class02267
 *  minecraft.class02268
 *  minecraft.class03802
 *  minecraft.class03805
 *  minecraft.class03813
 *  minecraft.class03820
 *  minecraft.class03821
 *  minecraft.class03826
 *  minecraft.class03837
 *  minecraft.class04771
 *  minecraft.class05007
 *  minecraft.class06202
 *  minecraft.class07529
 *  minecraft.class08735
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09427;
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import minecraft.class00192;
import minecraft.class00214;
import minecraft.class00221;
import minecraft.class00222;
import minecraft.class00224;
import minecraft.class00230;
import minecraft.class00233;
import minecraft.class00392;
import minecraft.class00642;
import minecraft.class01055;
import minecraft.class01057;
import minecraft.class01061;
import minecraft.class01078;
import minecraft.class01090;
import minecraft.class01283;
import minecraft.class01603;
import minecraft.class01613;
import minecraft.class01789;
import minecraft.class02267;
import minecraft.class02268;
import minecraft.class03802;
import minecraft.class03805;
import minecraft.class03813;
import minecraft.class03820;
import minecraft.class03821;
import minecraft.class03826;
import minecraft.class03837;
import minecraft.class04771;
import minecraft.class05007;
import minecraft.class06202;
import minecraft.class07529;
import minecraft.class08735;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00232
implements AutoCloseable {
    private static final class00392 i = class00392.L((String)"resourcePack.server.name");
    private static final Pattern R = Pattern.compile("^[a-fA-F0-9]{40}$");
    static final Logger N = LogUtils.getLogger();
    private static final class01057 M = consumer -> {};
    private static final class02268 B = new class02268(true, class01090.field_14280, true);
    private static final class03802 Z = new class00224();
    final class06202 y;
    private class01057 z = M;
    private @Nullable class03805 U;
    final class03837 L;
    private final class01789 E;
    private class01283 W = class01283.R;
    class03802 u = Z;
    private int m;

    public void L() {
        if (this.U != null) {
            this.U.N(true);
            this.U = null;
            this.z = M;
        }
    }

    public void M() {
        this.L.L();
    }

    public class00232(class06202 class062022, Path path, class09427 class094272) {
        this.y = class062022;
        try {
            this.E = new class01789(path);
        }
        catch (IOException iOException) {
            throw new UncheckedIOException("Failed to open download queue in directory " + String.valueOf(path), iOException);
        }
        Executor executor = arg_0 -> ((class06202)class062022).N(arg_0);
        this.L = new class03837(this.N(this.E, executor, class094272.N, class094272.y), (class03802)new class00230(this), this.z(), this.N(executor), class03826.field_47647);
    }

    public void B() {
        this.L.u();
    }

    public void Z() {
        this.L.y();
        this.u = Z;
        this.L.i();
    }

    public void i() {
        this.L.y();
    }

    @Override
    public void close() throws IOException {
        this.E.close();
    }

    private class03820 z() {
        return this::N;
    }

    public void u() {
        if (this.U != null) {
            this.U.N();
            this.U = null;
        }
    }

    public CompletableFuture<Void> y(UUID uUID) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        class03802 class038022 = this.u;
        this.u = new class00221(this, class038022, uUID, completableFuture);
        return completableFuture;
    }

    private static class01057 y(List<class01055> list) {
        if (list.isEmpty()) {
            return M;
        }
        return list::forEach;
    }

    public void y() {
        if (this.U != null) {
            this.U.N(false);
            List<Object> list = this.N(this.U.y());
            if (list == null) {
                N.warn("Double failure in loading server packs");
                list = List.of();
            }
            this.z = class00232.y(list);
        }
    }

    class05007 N(int n) {
        return new class00192(this, n);
    }

    public class01057 N() {
        return consumer -> this.z.method_14453(consumer);
    }

    private @Nullable List<class01055> N(List<class03821> list) {
        ArrayList<class01055> arrayList = new ArrayList<class01055>(list.size());
        for (class03821 class038212 : Lists.reverse(list)) {
            class08735 class087352;
            class01613 class016132;
            String string = String.format(Locale.ROOT, "server/%08X/%s", this.m++, class038212.N());
            Path path = class038212.y();
            class02267 class022672 = new class02267(string, i, this.W, Optional.empty());
            class01078 class010782 = class01055.N((class02267)class022672, (class01061)(class016132 = new class01613(path)), (class08735)(class087352 = class07529.y().method_70592(class01603.field_14188)), (class01603)class01603.field_14188);
            if (class010782 == null) {
                N.warn("Invalid pack metadata in {}, ignoring all", (Object)path);
                return null;
            }
            arrayList.add(new class01055(class022672, (class01061)class016132, class010782, B));
        }
        return arrayList;
    }

    public void N(UUID uUID, Path path) {
        this.L.N(uUID, path);
    }

    private Runnable N(Executor executor) {
        return new class00214(this, executor);
    }

    private class03813 N(class01789 class017892, Executor executor, class04771 class047712, Proxy proxy) {
        return new class00222(this, class047712, class017892, proxy, executor);
    }

    public void N(UUID uUID, URL uRL, @Nullable String string) {
        HashCode hashCode = class00232.N(string);
        this.L.N(uUID, uRL, hashCode);
    }

    private static @Nullable HashCode N(@Nullable String string) {
        if (string != null && R.matcher(string).matches()) {
            return HashCode.fromString((String)string.toLowerCase(Locale.ROOT));
        }
        return null;
    }

    public void N(UUID uUID) {
        this.L.N(uUID);
    }

    public void N(class00642 class006422, class03826 class038262) {
        this.W = class01283.R;
        this.u = class00232.N(class006422);
        switch (class038262) {
            case field_47648: {
                this.L.L();
                break;
            }
            case field_47649: {
                this.L.u();
                break;
            }
            case field_47647: {
                this.L.i();
            }
        }
    }

    private static class03802 N(class00642 class006422) {
        return new class00233(class006422);
    }

    private void N(class03805 class038052) {
        this.U = class038052;
        List list = class038052.y();
        List<Object> list2 = this.N(list);
        if (list2 == null) {
            class038052.N(false);
            List list3 = class038052.y();
            list2 = this.N(list3);
            if (list2 == null) {
                N.warn("Double failure in loading server packs");
                list2 = List.of();
            }
        }
        this.z = class00232.y(list2);
        this.y.yy();
    }

    public void R() {
        this.W = class01283.i;
        this.u = Z;
        this.L.L();
    }
}


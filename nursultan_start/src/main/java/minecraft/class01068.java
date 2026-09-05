/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class01603
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class03545
 *  minecraft.class03554
 *  minecraft.class06162
 *  minecraft.class06164
 *  minecraft.class06244
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01079;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class03545;
import minecraft.class03554;
import minecraft.class06162;
import minecraft.class06164;
import minecraft.class06244;
import org.slf4j.Logger;

public class class01068
implements class01089,
AutoCloseable {
    private static final Logger N = LogUtils.getLogger();
    private class03554 y;
    private final List<class01081> u = Lists.newArrayList();
    private final class01603 i;

    @Override
    public Map<class01894, List<class01079>> L(String string, Predicate<class01894> predicate) {
        return this.y.L(string, predicate);
    }

    public class01068(class01603 class016032) {
        this.i = class016032;
        this.y = new class03545(class016032, List.of());
    }

    @Override
    public void close() {
        this.y.close();
    }

    @Override
    public Stream<class01622> y() {
        return this.y.y();
    }

    @Override
    public Map<class01894, class01079> y(String string, Predicate<class01894> predicate) {
        return this.y.y(string, predicate);
    }

    @Override
    public List<class01079> N(class01894 class018942) {
        return this.y.N(class018942);
    }

    @Override
    public Set<String> N() {
        return this.y.N();
    }

    public void N(class01081 class010812) {
        this.u.add(class010812);
    }

    public class06164 N(Executor executor, Executor executor2, CompletableFuture<class06244> completableFuture, List<class01622> list) {
        N.info("Reloading ResourceManager: {}", LogUtils.defer(() -> list.stream().map(class01622::method_14409).collect(Collectors.joining(", "))));
        this.y.close();
        this.y = new class03545(this.i, list);
        return class06162.N((class01089)this.y, this.u, (Executor)executor, (Executor)executor2, completableFuture, (boolean)N.isDebugEnabled());
    }

    public Optional<class01079> method_14486(class01894 class018942) {
        return this.y.method_14486(class018942);
    }
}


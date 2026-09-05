/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09441
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectFunction
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class01101
 *  minecraft.class01102
 *  minecraft.class01103
 *  minecraft.class01296
 *  minecraft.class04594
 *  minecraft.class04763
 *  minecraft.class07062
 *  minecraft.class07209
 *  minecraft.class07321
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.PersistentEntitySectionManagerAccessor
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.PersistentEntitySectionManagerAccessor
 *  net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.PersistentEntitySectionManagerAccessor
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09441;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01101;
import minecraft.class01102;
import minecraft.class01103;
import minecraft.class01109;
import minecraft.class01113;
import minecraft.class01124;
import minecraft.class01129;
import minecraft.class01130;
import minecraft.class01131;
import minecraft.class01133;
import minecraft.class01135;
import minecraft.class01136;
import minecraft.class01296;
import minecraft.class04594;
import minecraft.class04763;
import minecraft.class07062;
import minecraft.class07209;
import minecraft.class07321;
import net.caffeinemc.mods.lithium.mixin.util.accessors.PersistentEntitySectionManagerAccessor;
import org.slf4j.Logger;

public class class01104<T extends class01135>
implements AutoCloseable,
net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.PersistentEntitySectionManagerAccessor,
PersistentEntitySectionManagerAccessor,
net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.PersistentEntitySectionManagerAccessor {
    public static final Logger N = LogUtils.getLogger();
    public final Set<UUID> y = Sets.newHashSet();
    public final class01109<T> L;
    private final class01136<T> i;
    private final class01131<T> R;
    public final class01129<T> u;
    private final class01124<T> M;
    private final Long2ObjectMap<class01102> B = new Long2ObjectOpenHashMap();
    private final Long2ObjectMap<class01133> Z = new Long2ObjectOpenHashMap();
    private final LongSet z = new LongOpenHashSet();
    private final Queue<class01130<T>> U = Queues.newConcurrentLinkedQueue();

    public /* synthetic */ class01129 getCache() {
        return this.u;
    }

    public void L(T t) {
        this.L.u(t);
    }

    public void L() {
        this.Z().forEach(l -> {
            if (this.B.get(l) == class01102.field_27289) {
                this.u(l);
            } else {
                this.N(l, (T class011352) -> {});
            }
        });
    }

    private void L(long l) {
        this.Z.put(l, (Object)class01133.field_27276);
        class07321 class073212 = new class07321(l);
        ((CompletableFuture)this.i.N(class073212).thenAccept(this.U::add)).exceptionally(throwable -> {
            N.error("Failed to read chunk {}", (Object)class073212, throwable);
            return null;
        });
    }

    private void M(class01135 class011352) {
        class011352.method_31745(class07062.field_27000);
        class011352.method_31744(class01113.N);
    }

    public int M() {
        return this.R.y();
    }

    public class01104(Class<T> clazz, class01109<T> class011092, class01136<T> class011362) {
        this.R = new class01131();
        this.u = new class01129<T>(clazz, (Long2ObjectFunction<class01102>)this.B);
        this.B.defaultReturnValue((Object)class01102.field_27289);
        this.Z.defaultReturnValue((Object)class01133.field_27275);
        this.L = class011092;
        this.i = class011362;
        this.M = new class01103(this.R, this.u);
    }

    private void B() {
        this.z.removeIf(l -> {
            if (this.B.get(l) != class01102.field_27289) {
                return true;
            }
            return this.u(l);
        });
    }

    private LongSet Z() {
        LongSet longSet = this.u.N();
        for (Long2ObjectMap.Entry entry : Long2ObjectMaps.fastIterable(this.Z)) {
            if (entry.getValue() != class01133.field_27277) continue;
            longSet.add(entry.getLongKey());
        }
        return longSet;
    }

    public class01124<T> i() {
        return this.M;
    }

    public void i(T t) {
        this.L.y(t);
        this.R.y(t);
    }

    @Override
    public void close() throws IOException {
        this.u();
        this.i.close();
    }

    private boolean u(long l) {
        if (!this.N(l, (T class011352) -> class011352.method_31748().forEach(this::M))) {
            return false;
        }
        this.Z.remove(l);
        return true;
    }

    public void u() {
        LongSet longSet = this.Z();
        while (!longSet.isEmpty()) {
            this.i.N(false);
            this.N();
            longSet.removeIf(l -> this.B.get(l) == class01102.field_27289 ? this.u(l) : this.N(l, (T class011352) -> {}));
        }
        this.i.N(true);
    }

    public void u(T t) {
        this.R.N(t);
        this.L.L(t);
    }

    public boolean y(class07321 class073212) {
        return ((class01102)this.B.get(class073212.y())).N();
    }

    public void y() {
        this.N();
        this.B();
    }

    private void y(long l) {
        if ((class01133)((Object)this.Z.get(l)) == class01133.field_27275) {
            this.L(l);
        }
    }

    public void y(T t) {
        this.L.i(t);
    }

    public void y(Stream<T> stream) {
        stream.forEach(class011352 -> this.N(class011352, false));
    }

    public boolean N(UUID uUID) {
        return this.y.contains(uUID);
    }

    public void N(long l, class01101<T> class011012) {
        if (class011012.N()) {
            this.u.i(l);
        }
    }

    public boolean N(T t) {
        return this.N(t, false);
    }

    public void N() {
        class01130<T> class011302;
        while ((class011302 = this.U.poll()) != null) {
            class011302.y().forEach(class011352 -> this.N(class011352, true));
            this.Z.put(class011302.N().y(), (Object)class01133.field_27277);
        }
    }

    public boolean N(class07321 class073212) {
        return ((class01102)this.B.get(class073212.y())).N();
    }

    public static <T extends class01135> class01102 N(T t, class01102 class011022) {
        return t.method_31747() ? class01102.field_27291 : class011022;
    }

    public boolean N(class07209 class072092) {
        return ((class01102)this.B.get(class07321.N((class07209)class072092))).N();
    }

    public void N(class07321 class073212, class04763 class047632) {
        class01102 class011022 = class01102.N((class04763)class047632);
        this.N(class073212, class011022);
    }

    public void N(class07321 class073212, class01102 class011022) {
        long l = class073212.y();
        if (class011022 == class01102.field_27289) {
            this.B.remove(l);
            this.z.add(l);
        } else {
            this.B.put(l, (Object)class011022);
            this.z.remove(l);
            this.y(l);
        }
        this.u.y(l).forEach(class011012 -> {
            class01102 class011023 = class011012.N(class011022);
            boolean bl = class011023.y();
            boolean bl2 = class011022.y();
            boolean bl3 = class011023.N();
            boolean bl4 = class011022.N();
            if (bl3 && !bl4) {
                class011012.y().filter(class011352 -> !class011352.method_31747()).forEach(this::L);
            }
            if (bl && !bl2) {
                class011012.y().filter(class011352 -> !class011352.method_31747()).forEach(this::i);
            } else if (!bl && bl2) {
                class011012.y().filter(class011352 -> !class011352.method_31747()).forEach(this::u);
            }
            if (!bl3 && bl4) {
                class011012.y().filter(class011352 -> !class011352.method_31747()).forEach(this::y);
            }
        });
    }

    private boolean N(long l, Consumer<T> consumer) {
        class01133 class011332 = (class01133)((Object)this.Z.get(l));
        if (class011332 == class01133.field_27276) {
            return false;
        }
        List<T> list = this.u.y(l).flatMap(class011012 -> class011012.y().filter(class01135::method_31746)).collect(Collectors.toList());
        if (list.isEmpty()) {
            if (class011332 == class01133.field_27277) {
                this.i.N(new class01130(new class07321(l), ImmutableList.of()));
            }
            return true;
        }
        if (class011332 == class01133.field_27275) {
            this.L(l);
            return false;
        }
        this.i.N(new class01130(new class07321(l), list));
        list.forEach(consumer);
        return true;
    }

    public void N(Stream<T> stream) {
        stream.forEach(class011352 -> this.N(class011352, true));
    }

    private boolean N(T t, boolean bl) {
        class01102 class011022;
        if (!this.R(t)) {
            return false;
        }
        long l = class01296.L((class07209)t.method_24515());
        class01101<T> class011012 = this.u.L(l);
        class011012.N(t);
        t.method_31744((class01113)new class09441(this, t, l, class011012));
        if (!bl) {
            this.L.M(t);
        }
        if ((class011022 = class01104.N(t, class011012.L())).y()) {
            this.u(t);
        }
        if (class011022.N()) {
            this.y(t);
        }
        return true;
    }

    public void N(Writer writer) throws IOException {
        class04594 class045942 = class04594.N().N("x").N("y").N("z").N("visibility").N("load_status").N("entity_count").N(writer);
        this.u.N().forEach(l2 -> {
            class01133 class011332 = (class01133)((Object)((Object)this.Z.get(l2)));
            this.u.N(l2).forEach(l -> {
                class01101<T> class011012 = this.u.u(l);
                if (class011012 != null) {
                    try {
                        class045942.N(new Object[]{class01296.y((long)l), class01296.L((long)l), class01296.u((long)l), class011012.L(), class011332, class011012.u()});
                    }
                    catch (IOException iOException) {
                        throw new UncheckedIOException(iOException);
                    }
                }
            });
        });
    }

    public boolean N(long l) {
        return this.Z.get(l) == class01133.field_27277;
    }

    private boolean R(T t) {
        if (!this.y.add(t.method_5667())) {
            N.warn("UUID of added entity already exists: {}", t);
            return false;
        }
        return true;
    }

    public String R() {
        return this.y.size() + "," + this.R.y() + "," + this.u.y() + "," + this.Z.size() + "," + this.B.size() + "," + this.U.size() + "," + this.z.size();
    }
}


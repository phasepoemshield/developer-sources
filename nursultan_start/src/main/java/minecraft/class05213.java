/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10680
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00247
 *  minecraft.class00392
 *  minecraft.class01022
 *  minecraft.class01054
 *  minecraft.class01057
 *  minecraft.class01093
 *  minecraft.class01247
 *  minecraft.class01270
 *  minecraft.class01590
 *  minecraft.class01603
 *  minecraft.class01623
 *  minecraft.class01885
 *  minecraft.class01894
 *  minecraft.class01896
 *  minecraft.class01897
 *  minecraft.class01898
 *  minecraft.class01908
 *  minecraft.class01910
 *  minecraft.class01929
 *  minecraft.class01930
 *  minecraft.class01950
 *  minecraft.class02003
 *  minecraft.class02102
 *  minecraft.class02969
 *  minecraft.class03241
 *  minecraft.class03255
 *  minecraft.class03271
 *  minecraft.class03281
 *  minecraft.class03519
 *  minecraft.class03661
 *  minecraft.class03678
 *  minecraft.class03686
 *  minecraft.class03764
 *  minecraft.class03767
 *  minecraft.class03776
 *  minecraft.class03779
 *  minecraft.class03781
 *  minecraft.class03783
 *  minecraft.class03794
 *  minecraft.class03796
 *  minecraft.class03981
 *  minecraft.class04095
 *  minecraft.class04173
 *  minecraft.class04227
 *  minecraft.class04382
 *  minecraft.class04654
 *  minecraft.class04785
 *  minecraft.class05071
 *  minecraft.class05081
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05733
 *  minecraft.class05934
 *  minecraft.class05946
 *  minecraft.class05964
 *  minecraft.class06132
 *  minecraft.class06202
 *  minecraft.class06207
 *  minecraft.class06228
 *  minecraft.class06290
 *  minecraft.class06307
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06984
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07312
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07671
 *  minecraft.class08152
 *  minecraft.class08394
 *  minecraft.class08707
 *  minecraft.class08710
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10680;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00247;
import minecraft.class00392;
import minecraft.class01022;
import minecraft.class01054;
import minecraft.class01057;
import minecraft.class01093;
import minecraft.class01247;
import minecraft.class01270;
import minecraft.class01590;
import minecraft.class01603;
import minecraft.class01623;
import minecraft.class01885;
import minecraft.class01894;
import minecraft.class01896;
import minecraft.class01897;
import minecraft.class01898;
import minecraft.class01908;
import minecraft.class01910;
import minecraft.class01929;
import minecraft.class01930;
import minecraft.class01950;
import minecraft.class02003;
import minecraft.class02102;
import minecraft.class02969;
import minecraft.class03241;
import minecraft.class03255;
import minecraft.class03271;
import minecraft.class03281;
import minecraft.class03519;
import minecraft.class03661;
import minecraft.class03678;
import minecraft.class03686;
import minecraft.class03764;
import minecraft.class03767;
import minecraft.class03776;
import minecraft.class03779;
import minecraft.class03781;
import minecraft.class03783;
import minecraft.class03794;
import minecraft.class03796;
import minecraft.class03981;
import minecraft.class04095;
import minecraft.class04173;
import minecraft.class04227;
import minecraft.class04382;
import minecraft.class04654;
import minecraft.class04785;
import minecraft.class05071;
import minecraft.class05081;
import minecraft.class05096;
import minecraft.class05208;
import minecraft.class05219;
import minecraft.class05220;
import minecraft.class05230;
import minecraft.class05362;
import minecraft.class05733;
import minecraft.class05934;
import minecraft.class05946;
import minecraft.class05964;
import minecraft.class06132;
import minecraft.class06202;
import minecraft.class06207;
import minecraft.class06228;
import minecraft.class06290;
import minecraft.class06307;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06984;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07312;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07671;
import minecraft.class08152;
import minecraft.class08394;
import minecraft.class08707;
import minecraft.class08710;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class05213
extends class05096 {
    private static final int M = 1;
    private static final int B = 210;
    private static final Logger Z = LogUtils.getLogger();
    private static final String z = "mcworld-";
    static final class00392 N = class00392.L((String)"selectWorld.gameMode");
    static final class00392 y = class00392.L((String)"selectWorld.enterName");
    static final class00392 L = class00392.L((String)"selectWorld.experiments");
    static final class00392 u = class00392.L((String)"selectWorld.allowCommands.info");
    private static final class00392 U = class00392.L((String)"createWorld.preparing");
    private static final int E = 10;
    private static final int W = 8;
    public static final class01894 i = class01894.y((String)"textures/gui/tab_header_background.png");
    private final class03686 m = new class03686((class05096)this);
    final class03661 R;
    private final class03271 P = new class03271(class046542 -> {
        class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
    }, class046542 -> this.method_37066((class04654)class046542));
    private boolean s;
    private final class04173 T;
    private final class00247 b;
    private final Runnable j;
    private @Nullable Path v;
    private @Nullable class01623 n;
    private @Nullable class03281 t;

    static /* synthetic */ class01590 L(class05213 class052132) {
        return class052132.field_22793;
    }

    private @Nullable Pair<Path, class01623> L(class03776 class037762) {
        Path path = this.u();
        if (path != null) {
            if (this.n == null) {
                this.n = class01093.N((Path)path, (class04173)this.T);
                this.N((CallbackInfoReturnable)null);
                this.n.N();
            }
            this.n.y((Collection)class037762.N().N());
            return Pair.of((Object)path, (Object)this.n);
        }
        return null;
    }

    private static class01623 L(class01623 class016232) {
        class016232.N.add(new ModResourcePackCreator(class01603.field_14190));
        return class016232;
    }

    private void L() {
        class01896 class018962 = this.R.U();
        class03781 class037812 = class018962.i().N(class018962.u());
        class02003 var3 = class018962.R().N((Object)class02969.field_39973, new class01022[]{class037812.y()});
        Lifecycle lifecycle = class03794.N((class03767)class018962.B().y()) ? Lifecycle.experimental() : Lifecycle.stable();
        Lifecycle lifecycle2 = var3.N().u();
        Lifecycle lifecycle3 = lifecycle2.add(lifecycle);
        boolean bl = !this.s && lifecycle2 == Lifecycle.stable();
        class07312 class073122 = this.N(class037812.u() == class06228.field_40375);
        class06207 class062072 = new class06207(class073122, this.R.U().L(), class037812.u(), lifecycle3);
        class01910.N((class06202)this.field_22787, (class05213)this, (Lifecycle)lifecycle3, () -> this.N((class02003<class02969>)var3, class062072), (boolean)bl);
    }

    static /* synthetic */ class06202 M(class05213 class052132) {
        return class052132.field_22787;
    }

    private class05213(class06202 class062022, Runnable runnable, class01896 class018962, Optional<class05946<class04382>> optional, OptionalLong optionalLong, class00247 class002472) {
        super((class00392)class00392.L((String)"selectWorld.create"));
        this.j = runnable;
        this.T = class062022.Ni();
        this.b = class002472;
        this.R = new class03661(class062022.NL().L(), class018962, optional, optionalLong);
    }

    static /* synthetic */ class06202 i(class05213 class052132) {
        return class052132.field_22787;
    }

    private void i() {
        if (this.v != null && Files.exists(this.v, new LinkOption[0])) {
            try (Stream<Path> var1 = Files.walk(this.v, new FileVisitOption[0]);){
                var1.sorted(Comparator.reverseOrder()).forEach(path -> {
                    try {
                        Files.delete(path);
                    }
                    catch (IOException iOException) {
                        Z.warn("Failed to remove temporary file {}", path, (Object)iOException);
                    }
                });
            }
            catch (IOException iOException) {
                Z.warn("Failed to list temporary dir {}", (Object)this.v);
            }
        }
        this.v = null;
    }

    static /* synthetic */ class01590 u(class05213 class052132) {
        return class052132.field_22793;
    }

    private @Nullable Path u() {
        if (this.v == null) {
            try {
                this.v = Files.createTempDirectory(z, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                Z.warn("Failed to create temporary dir", (Throwable)iOException);
                class06132.L((class06202)this.field_22787, (String)this.R.L());
                this.y();
            }
        }
        return this.v;
    }

    void y(class03776 class037762) {
        Pair<Path, class01623> var2 = this.L(class037762);
        if (var2 != null) {
            this.field_22787.N((class05096)new class01270((class01623)var2.getSecond(), class016232 -> this.N((class01623)class016232, true, this::y), (Path)var2.getFirst(), (class00392)class00392.L((String)"dataPack.title")));
        }
    }

    public void y() {
        this.j.run();
        this.i();
    }

    public static void y(class06202 class062022, Runnable runnable) {
        class08710 class087102 = (class012482, class020032, class037832) -> new class01896(class037832.N().N(), class037832.N().y(), class020032, class012482, class037832.y(), new class08707(class03678.field_20626, new class10680().N(class07305.N, (Object)false).N(class07305.y, (Object)false).N(class07305.S, (Object)false).N(), class04095.B));
        Function<class01930, class03796> function = class019302 -> new class03796(class05934.y(), class05964.L((class01929)class019302.L()));
        class05213.N(class062022, runnable, function, class087102, (class05946<class04382>)class05964.y, (class052132, class020032, class062072, path) -> class052132.N((class02003<class02969>)class020032, (class05081)class062072));
    }

    static /* synthetic */ class01590 y(class05213 class052132) {
        return class052132.field_22793;
    }

    private static /* synthetic */ boolean N(List list, String string) {
        return !list.contains(string);
    }

    private static /* synthetic */ DataResult N(DynamicOps dynamicOps, JsonElement jsonElement) {
        return class03796.N.parse(dynamicOps, (Object)jsonElement);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        this.n.N.add(new ModResourcePackCreator(class01603.field_14190));
    }

    static /* synthetic */ class01590 N(class05213 class052132) {
        return class052132.field_22793;
    }

    static /* synthetic */ void N(class05213 class052132, class04654 class046542) {
        class052132.method_48265(class046542);
    }

    private boolean N(class02003<class02969> class020032, class05081 class050812) {
        String string = this.R.L();
        class01896 class018962 = this.R.U();
        class05213.N(this.field_22787, U);
        Optional<class04785> var5 = class05213.N(this.field_22787, string, this.v);
        if (var5.isEmpty()) {
            class06132.L((class06202)this.field_22787, (String)string);
            return false;
        }
        this.field_22787.S().N(var5.get(), class018962.M(), class020032, class050812);
        return true;
    }

    private class07312 N(boolean bl) {
        String string = this.R.y().trim();
        if (bl) {
            class07305 class073052 = new class07305(class03776.u.y());
            class073052.N(class07305.N, (Object)false, null);
            return new class07312(string, class07282.field_9219, false, class07086.field_5801, true, class073052, class03776.u);
        }
        return new class07312(string, this.R.u().field_20629, this.R.R(), this.R.i(), this.R.M(), this.R.T(), this.R.U().B());
    }

    public static void N(class06202 class062022, Runnable runnable) {
        class05213.N(class062022, runnable, (class052132, class020032, class062072, path) -> class052132.N((class02003<class02969>)class020032, (class05081)class062072));
    }

    void N(class03776 class037762) {
        Pair<Path, class01623> var2 = this.L(class037762);
        if (var2 != null) {
            this.field_22787.N((class05096)new class01950((class05096)this, (class01623)var2.getSecond(), class016232 -> this.N((class01623)class016232, false, this::N)));
        }
    }

    private void N(class01623 class016232, boolean bl2, Consumer<class03776> consumer) {
        List list;
        ImmutableList immutableList = ImmutableList.copyOf((Collection)class016232.i());
        class03776 class037762 = new class03776(new class01247((List)immutableList, list = (List)class016232.L().stream().filter(arg_0 -> class05213.N((List)immutableList, arg_0)).collect(ImmutableList.toImmutableList())), this.R.U().B().y());
        if (this.R.N(class037762)) {
            this.field_22787.N((class05096)this);
            return;
        }
        if (class03794.N((class03767)class016232.R()) && bl2) {
            this.field_22787.N((class05096)new class03779(class016232.M(), bl -> {
                if (bl) {
                    this.N(class016232, class037762, consumer);
                } else {
                    consumer.accept(this.R.U().B());
                }
            }));
        } else {
            this.N(class016232, class037762, consumer);
        }
    }

    private void N(class01623 class016232, class03776 class037762, Consumer<class03776> consumer) {
        this.field_22787.y((class05096)new class06307((class00392)class00392.L((String)"dataPack.validation.working")));
        ((CompletableFuture)((CompletableFuture)class01897.N((class01908)class05213.N(class016232, class037762), class019302 -> {
            if (class019302.L().y(class04227.yO).z().findAny().isEmpty()) {
                throw new IllegalStateException("Needs at least one world preset to continue");
            }
            if (class019302.L().y(class04227.NA).z().findAny().isEmpty()) {
                throw new IllegalStateException("Needs at least one biome continue");
            }
            class01896 class018962 = this.R.U();
            DataResult dataResult = class03796.N((DynamicOps)class018962.N().N((DynamicOps)JsonOps.INSTANCE), (class05934)class018962.L(), (class03764)class018962.i()).setLifecycle(Lifecycle.stable());
            class03519 class035192 = class019302.L().N((DynamicOps)JsonOps.INSTANCE);
            class03796 class037962 = (class03796)dataResult.flatMap(arg_0 -> class05213.N((DynamicOps)class035192, arg_0)).getOrThrow(string -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + string));
            return new class03981((Object)new class03783(class037962, class019302.y()), class019302.u());
        }, (class035542, class012482, class020032, class037832) -> {
            class035542.close();
            return new class01896(class037832.N(), class020032, class012482, class037832.y());
        }, (Executor)class07536.B(), (Executor)this.field_22787).thenApply(class018962 -> {
            class018962.y();
            return class018962;
        })).thenAcceptAsync(arg_0 -> ((class03661)this.R).N(arg_0), (Executor)this.field_22787)).handleAsync((void_, throwable) -> {
            if (throwable != null) {
                Z.warn("Failed to validate datapack", throwable);
                this.field_22787.N((class05096)new class05733(bl -> {
                    if (bl) {
                        consumer.accept(this.R.U().B());
                    } else {
                        consumer.accept(class03776.u);
                    }
                }, (class00392)class00392.L((String)"dataPack.validation.failed"), class05220.N, (class00392)class00392.L((String)"dataPack.validation.back"), (class00392)class00392.L((String)"dataPack.validation.reset")));
            } else {
                this.field_22787.N((class05096)this);
            }
            return null;
        }, (Executor)this.field_22787);
    }

    public static void N(class06202 class062022, Runnable runnable, class00247 class002472) {
        class08710 class087102 = (class012482, class020032, class037832) -> new class01896(class037832.N(), class020032, class012482, class037832.y());
        Function<class01930, class03796> function = class019302 -> new class03796(class05934.N(), class05964.N((class01929)class019302.L()));
        class05213.N(class062022, runnable, function, class087102, (class05946<class04382>)class05964.N, class002472);
    }

    private static void N(class06202 class062022, Runnable runnable, Function<class01930, class03796> function, class08710 class087102, class05946<class04382> class059462, class00247 class002472) {
        class05213.N(class062022, U);
        class01623 class016232 = new class01623(new class01057[]{new class01093(class062022.Ni())});
        class03776 class037762 = class07529.ND ? new class03776(new class01247(List.of("vanilla", "tests"), List.of()), class03794.B) : class05213.R();
        class01623 class016233 = class016232;
        class016232 = class05213.L(class016232);
        CompletableFuture completableFuture = class01897.N((class01908)class05213.N(class016233, class037762), class019302 -> new class03981((Object)new class03783((class03796)function.apply(class019302), class019302.y()), class019302.u()), (class035542, class012482, class020032, class037832) -> {
            class035542.close();
            return class087102.apply(class012482, class020032, class037832);
        }, (Executor)class07536.B(), (Executor)class062022);
        class062022.y(completableFuture::isDone);
        class062022.N((class05096)new class05213(class062022, runnable, (class01896)completableFuture.join(), Optional.of(class059462), OptionalLong.empty(), class002472));
    }

    public static class05213 N(class06202 class062022, Runnable runnable, class07312 class073122, class01896 class018962, @Nullable Path path2) {
        class05213 class052133 = new class05213(class062022, runnable, class018962, class05964.N((class03764)class018962.i()), OptionalLong.of(class018962.L().L()), (class052132, class020032, class062072, path) -> class052132.N((class02003<class02969>)class020032, (class05081)class062072));
        class052133.s = true;
        class052133.R.N(class073122.N());
        class052133.R.N(class073122.i());
        class052133.R.N(class073122.u());
        class052133.R.T().N(class073122.R(), null);
        if (class073122.L()) {
            class052133.R.N(class03678.field_20625);
        } else if (class073122.y().M()) {
            class052133.R.N(class03678.field_20624);
        } else if (class073122.y().R()) {
            class052133.R.N(class03678.field_20626);
        }
        class052133.v = path2;
        return class052133;
    }

    public class03661 N() {
        return this.R;
    }

    private static void N(class06202 class062022, class00392 class003922) {
        class062022.y((class05096)new class06307(class003922));
    }

    private void N(class02003<class02969> class020032, class06207 class062072) {
        boolean bl = this.b.create(this, class020032, class062072, this.v);
        this.i();
        if (!bl) {
            this.y();
        }
    }

    private static void N(Path path, Path path2, Path path3) {
        try {
            class07536.y((Path)path, (Path)path2, (Path)path3);
        }
        catch (IOException iOException) {
            Z.warn("Failed to copy datapack file from {} to {}", (Object)path3, (Object)path2);
            throw new UncheckedIOException(iOException);
        }
    }

    public static @Nullable Path N(Path path, class06202 class062022) {
        MutableObject mutableObject = new MutableObject();
        try (Stream<Path> var3 = Files.walk(path, new FileVisitOption[0]);){
            var3.filter(path2 -> !path2.equals(path)).forEach(path2 -> {
                Path path3 = (Path)mutableObject.get();
                if (path3 == null) {
                    try {
                        path3 = Files.createTempDirectory(z, new FileAttribute[0]);
                    }
                    catch (IOException iOException) {
                        Z.warn("Failed to create temporary dir");
                        throw new UncheckedIOException(iOException);
                    }
                    mutableObject.setValue((Object)path3);
                }
                class05213.N(path, path3, path2);
            });
        }
        catch (IOException | UncheckedIOException exception) {
            Z.warn("Failed to copy datapacks from world {}", (Object)path, (Object)exception);
            class06132.L((class06202)class062022, (String)path.toString());
            return null;
        }
        return (Path)mutableObject.get();
    }

    private static class01908 N(class01623 class016232, class03776 class037762) {
        class01898 class018982 = new class01898(class016232, class037762, false, true);
        return new class01908(class018982, class07671.field_25421, (class08152)class06984.L);
    }

    /*
     * WARNING - bad return control flow
     */
    private static Optional<class04785> N(class06202 class062022, String string, @Nullable Path path) {
        Optional<class04785> optional;
        block12: {
            class04785 class047852;
            block11: {
                class047852 = class062022.NL().i(string);
                if (path != null) break block11;
                return Optional.of(class047852);
            }
            Stream<Path> var4 = Files.walk(path, new FileVisitOption[0]);
            try {
                Path path4 = class047852.N(class05071.z);
                class06290.L((Path)path4);
                var4.filter(path2 -> !path2.equals(path)).forEach(path3 -> class05213.N(path, path4, path3));
                optional = Optional.of(class047852);
                if (var4 == null) break block12;
            }
            catch (Throwable throwable) {
                try {
                    try {
                        if (var4 != null) {
                            try {
                                var4.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (IOException | UncheckedIOException exception) {
                        Z.warn("Failed to copy datapacks to world {}", (Object)string, (Object)exception);
                        class047852.close();
                    }
                }
                catch (IOException | UncheckedIOException exception2) {
                    Z.warn("Failed to create access for {}", (Object)string, (Object)exception2);
                }
            }
            var4.close();
        }
        return optional;
        return Optional.empty();
    }

    public void method_25426() {
        this.t = class03281.method_48623((class03271)this.P, (int)this.field_22789).N(new class03241[]{new class05230(this), new class05208(this), new class05219(this)}).N();
        this.method_37063((class04654)this.t);
        class01885 class018852 = (class01885)this.m.y((class02102)class01885.i().N(8));
        class018852.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectWorld.create"), class053622 -> this.L()).N());
        class018852.N((class02102)class05362.method_46430((class00392)class05220.i, class053622 -> this.y()).N());
        this.m.method_48206(class064782 -> {
            class064782.method_48591(1);
            this.method_37063((class04654)class064782);
        });
        this.t.method_48987(0, false);
        this.R.N();
        this.method_48640();
    }

    protected void method_56131() {
    }

    public boolean method_25404(class06601 class066012) {
        if (this.t.method_25404(class066012)) {
            return true;
        }
        if (super.method_25404(class066012)) {
            return true;
        }
        if (class066012.u()) {
            this.L();
            return true;
        }
        return false;
    }

    public void method_48640() {
        if (this.t == null) {
            return;
        }
        this.t.method_48618(this.field_22789);
        this.t.method_49613();
        int n = this.t.method_48202().L();
        class03255 class032552 = new class03255(0, n, this.field_22789, this.field_22790 - this.m.y() - n);
        this.P.N(class032552);
        this.m.y(n);
        this.m.N();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(class08394.Na, class05096.field_49896, 0, this.field_22790 - this.m.y() - 2, 0.0f, 0.0f, this.field_22789, 2, 32, 2);
    }

    public void method_25419() {
        this.y();
    }

    protected void method_57735(class01054 class010542) {
        class010542.N(class08394.Na, i, 0, 0, 0.0f, 0.0f, this.field_22789, this.m.L(), 16, 16);
        this.method_57736(class010542, 0, this.m.L(), this.field_22789, this.field_22790);
    }

    private static class03776 R() {
        return ModPackResourcesUtil.createDefaultDataConfiguration();
    }

    static /* synthetic */ class06202 R(class05213 class052132) {
        return class052132.field_22787;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  net.minecraft.client.util.DefaultSkinHelper
 *  net.minecraft.entity.player.SkinTextures
 *  net.minecraft.util.Identifier
 */
package oxxxde;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotakbaz.rain.friend.FriendManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.entity.player.SkinTextures;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0634\u063a;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#RT\u0010&\u001aB\u0012\f\u0012\n !*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n !*\u0004\u0018\u00010%0% !* \u0012\f\u0012\n !*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n !*\u0004\u0018\u00010%0%\u0018\u00010$0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'RT\u0010(\u001aB\u0012\f\u0012\n !*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n !*\u0004\u0018\u00010%0% !* \u0012\f\u0012\n !*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n !*\u0004\u0018\u00010%0%\u0018\u00010$0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+\u00a8\u0006,"}, d2={"Loxxxde/\u0633\u0624;", "", "<init>", "()V", "Loxxxde/\u0630\u0648;", "friend", "Lnet/minecraft/class_2960;", "resolveTexture", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;)Lnet/minecraft/class_2960;", "", "name", "(Ljava/lang/String;)Lnet/minecraft/class_2960;", "", "requestSkin", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;)V", "clear", "clearAll", "normalizedName", "loadSkin", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;Ljava/lang/String;)V", "Ljava/util/UUID;", "resolveUUID", "(Ljava/lang/String;)Ljava/util/UUID;", "fetchOnlineUUID", "offlineUUID", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "fallbackTexture", "Lnet/minecraft/class_2960;", "Ljava/util/concurrent/atomic/AtomicInteger;", "skinThreadCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "skinExecutor", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "", "loadingSkins", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "failedSkins", "Ljava/util/concurrent/ConcurrentHashMap;", "uuidCache", "Ljava/util/concurrent/ConcurrentHashMap;", "rain-visuals"})
public final class \u0633\u0624 {
    private static final ExecutorService skinExecutor;
    private static final ConcurrentHashMap.KeySetView<String, Boolean> loadingSkins;
    @NotNull
    public static final \u0633\u0624 INSTANCE;
    private static final ConcurrentHashMap.KeySetView<String, Boolean> failedSkins;
    @NotNull
    private static final ConcurrentHashMap<String, UUID> uuidCache;
    @NotNull
    private static final Identifier fallbackTexture;
    @NotNull
    private static final AtomicInteger skinThreadCounter;

    static {
        INSTANCE = new \u0633\u0624();
        Identifier identifier = DefaultSkinHelper.getTexture();
        Intrinsics.checkNotNullExpressionValue(identifier, "getDefaultTexture(...)");
        fallbackTexture = identifier;
        skinThreadCounter = new AtomicInteger();
        skinExecutor = Executors.newFixedThreadPool(2, \u0633\u0624::skinExecutor$lambda$0);
        loadingSkins = ConcurrentHashMap.newKeySet();
        failedSkins = ConcurrentHashMap.newKeySet();
        uuidCache = new ConcurrentHashMap();
    }

    private static final void requestSkin$lambda$0(FriendManager.FriendEntry $friend, String $normalizedName) {
        INSTANCE.loadSkin($friend, $normalizedName);
    }

    /*
     * Exception decompiling
     */
    private final UUID fetchOnlineUUID(String name) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void clearAll() {
        loadingSkins.clear();
        failedSkins.clear();
        Iterable $this$forEach$iv = \u0634\u063a.INSTANCE.getFriends();
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            Object element$iv = iterator2.next();
            String name = (String)element$iv;
            boolean bl = false;
            FriendManager.FriendEntry friendEntry = \u0634\u063a.INSTANCE.getFriend(name);
            if (friendEntry == null) continue;
            friendEntry.setSkinTexture(null);
        }
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final UUID resolveUUID(@NotNull String name) {
        void $this$getOrPut$iv;
        Intrinsics.checkNotNullParameter(name, "name");
        String normalizedName = this.normalize(name);
        ConcurrentMap concurrentMap = uuidCache;
        String key$iv = normalizedName;
        boolean $i$f$getOrPut = false;
        Object object = $this$getOrPut$iv.get(key$iv);
        if (object == null) {
            UUID uUID;
            Object object2;
            boolean bl = false;
            Object object3 = INSTANCE;
            try {
                \u0633\u0624 $this$resolveUUID_u24lambda_u240_u240 = object3;
                boolean bl2 = false;
                object2 = Result.constructor-impl($this$resolveUUID_u24lambda_u240_u240.fetchOnlineUUID(name));
            }
            catch (Throwable bl2) {
                object2 = Result.constructor-impl(ResultKt.createFailure(bl2));
            }
            object3 = object2;
            Throwable throwable = Result.exceptionOrNull-impl(object3);
            if (throwable != null) {
                void var9_11;
                Object it = object2 = throwable;
                boolean bl3 = false;
                var9_11.printStackTrace();
            }
            if ((uUID = (UUID)(Result.isFailure-impl(object3) ? null : object3)) == null) {
                uUID = INSTANCE.offlineUUID(name);
            }
            UUID default$iv = uUID;
            boolean bl4 = false;
            object = $this$getOrPut$iv.putIfAbsent(key$iv, default$iv);
            if (object == null) {
                void var11_13;
                object = var11_13;
            }
        }
        Intrinsics.checkNotNullExpressionValue(object, "getOrPut(...)");
        return (UUID)object;
    }

    public final void requestSkin(@NotNull FriendManager.FriendEntry friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        String normalizedName = this.normalize(friend.getName());
        if (friend.getSkinTexture() != null) {
            return;
        }
        if (failedSkins.contains(normalizedName)) {
            return;
        }
        if (!loadingSkins.add(normalizedName)) {
            return;
        }
        skinExecutor.execute(() -> \u0633\u0624.requestSkin$lambda$0(friend, normalizedName));
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Identifier resolveTexture(@NotNull FriendManager.FriendEntry friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        Identifier identifier = friend.getSkinTexture();
        if (identifier != null) {
            void var2_2;
            Identifier it = identifier;
            boolean bl = false;
            return var2_2;
        }
        this.requestSkin(friend);
        return fallbackTexture;
    }

    @NotNull
    public final Identifier resolveTexture(@NotNull String name) {
        FriendManager.FriendEntry friendEntry;
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(name, "name");
                friendEntry = \u0634\u063a.INSTANCE.getFriend(name);
                if (friendEntry == null) break block2;
                FriendManager.FriendEntry p0 = friendEntry;
                boolean bl = false;
                Identifier identifier = this.resolveTexture(p0);
                friendEntry = identifier;
                if (identifier != null) break block3;
            }
            friendEntry = fallbackTexture;
        }
        return friendEntry;
    }

    private static final Thread skinExecutor$lambda$0(Runnable runnable) {
        Thread thread2;
        Thread $this$skinExecutor_u24lambda_u240_u240 = thread2 = new Thread(runnable, "Rain-Friend-Skin-" + skinThreadCounter.incrementAndGet());
        boolean bl = false;
        $this$skinExecutor_u24lambda_u240_u240.setDaemon(true);
        return thread2;
    }

    private final String normalize(String name) {
        String string = name;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        return string2;
    }

    private \u0633\u0624() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void loadSkin(FriendManager.FriendEntry friend, String normalizedName) {
        String name = friend.getName();
        boolean waitingForSkinFuture = false;
        try {
            UUID uuid = this.resolveUUID(name);
            SkinTextures skinTextures = DefaultSkinHelper.getSkinTextures((UUID)uuid);
            Intrinsics.checkNotNullExpressionValue(skinTextures, "get(...)");
            SkinTextures defaultSkin = skinTextures;
            Identifier identifier = defaultSkin.body().id();
            Intrinsics.checkNotNullExpressionValue(identifier, "id(...)");
            Identifier defaultTexture = identifier;
            ProfileResult profileResult = \u0636\u0643.getMc().getApiServices().sessionService().fetchProfile(uuid, true);
            if (profileResult == null || (profileResult = profileResult.profile()) == null) {
                profileResult = new GameProfile(uuid, name);
            }
            ProfileResult profile = profileResult;
            CompletableFuture completableFuture = \u0636\u0643.getMc().getSkinProvider().fetchSkinTextures((GameProfile)profile);
            Intrinsics.checkNotNullExpressionValue(completableFuture, "get(...)");
            CompletableFuture skinFuture = completableFuture;
            waitingForSkinFuture = true;
            skinFuture.whenComplete((arg_0, arg_1) -> \u0633\u0624.loadSkin$lambda$1((arg_0, arg_1) -> \u0633\u0624.loadSkin$lambda$0(defaultSkin, defaultTexture, friend, normalizedName, arg_0, arg_1), arg_0, arg_1));
        }
        catch (Exception e) {
            try {
                e.printStackTrace();
                failedSkins.add(normalizedName);
                if (waitingForSkinFuture) return;
            }
            catch (Throwable throwable) {
                void var2_2;
                if (waitingForSkinFuture) throw throwable;
                loadingSkins.remove(var2_2);
                throw throwable;
            }
            loadingSkins.remove(normalizedName);
            return;
        }
        return;
    }

    private final UUID offlineUUID(String name) {
        String string = "OfflinePlayer:" + name;
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
        byte[] byArray = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        UUID uUID = UUID.nameUUIDFromBytes(byArray);
        Intrinsics.checkNotNullExpressionValue(uUID, "nameUUIDFromBytes(...)");
        return uUID;
    }

    public final void clear(@NotNull FriendManager.FriendEntry friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        String normalizedName = this.normalize(friend.getName());
        loadingSkins.remove(normalizedName);
        failedSkins.remove(normalizedName);
        friend.setSkinTexture(null);
    }

    private static final void loadSkin$lambda$1(Function2 $tmp0, Object p0, Object p1) {
        $tmp0.invoke(p0, p1);
    }

    private static final Unit loadSkin$lambda$0(SkinTextures $defaultSkin, Identifier $defaultTexture, FriendManager.FriendEntry $friend, String $normalizedName, Optional skin, Throwable throwable) {
        Throwable throwable2 = throwable;
        if (throwable2 != null) {
            throwable2.printStackTrace();
        }
        \u0636\u0643.getMc().execute(() -> \u0633\u0624.loadSkin$lambda$0$0(skin, $defaultSkin, throwable, $defaultTexture, $friend, $normalizedName));
        return Unit.INSTANCE;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void loadSkin$lambda$0$0(Optional $skin, SkinTextures $defaultSkin, Throwable $throwable, Identifier $defaultTexture, FriendManager.FriendEntry $friend, String $normalizedName) {
        try {
            Optional optional = $skin;
            Identifier texture = optional != null && (optional = optional.orElse($defaultSkin)) != null && (optional = optional.body()) != null ? optional.id() : null;
            if ($throwable == null && texture != null) {
                if (!Intrinsics.areEqual(texture, $defaultTexture)) {
                    $friend.setSkinTexture(texture);
                    return;
                }
            }
            failedSkins.add($normalizedName);
            return;
        }
        finally {
            loadingSkins.remove($normalizedName);
        }
    }
}


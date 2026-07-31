/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  net.minecraft.class_1068
 *  net.minecraft.class_2960
 *  net.minecraft.class_8685
 */
package kotakbaz.rain.friend;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.friend.B;
import kotakbaz.rain.friend.C;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import net.minecraft.class_1068;
import net.minecraft.class_2960;
import net.minecraft.class_8685;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.friend.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\n \u001b*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#RT\u0010&\u001aB\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u001b*\u0004\u0018\u00010%0% \u001b* \u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u001b*\u0004\u0018\u00010%0%\u0018\u00010$0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'RT\u0010(\u001aB\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u001b*\u0004\u0018\u00010%0% \u001b* \u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u001b*\u0004\u0018\u00010%0%\u0018\u00010$0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+\u00a8\u0006,"}, d2={"Lkotakbaz/rain/friend/FriendSkinResolver;", "", "<init>", "()V", "Lkotakbaz/rain/friend/FriendManager$FriendEntry;", "friend", "Lnet/minecraft/class_2960;", "resolveTexture", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;)Lnet/minecraft/class_2960;", "", "name", "(Ljava/lang/String;)Lnet/minecraft/class_2960;", "", "requestSkin", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;)V", "clear", "clearAll", "normalizedName", "loadSkin", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;Ljava/lang/String;)V", "Ljava/util/UUID;", "resolveUUID", "(Ljava/lang/String;)Ljava/util/UUID;", "fetchOnlineUUID", "offlineUUID", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "fallbackTexture", "Lnet/minecraft/class_2960;", "Ljava/util/concurrent/atomic/AtomicInteger;", "skinThreadCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/ExecutorService;", "skinExecutor", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "", "loadingSkins", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "failedSkins", "Ljava/util/concurrent/ConcurrentHashMap;", "uuidCache", "Ljava/util/concurrent/ConcurrentHashMap;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFriendSkinResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendSkinResolver.kt\nkotakbaz/rain/friend/FriendSkinResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,179:1\n1#2:180\n1#2:185\n1915#3,2:181\n72#4,2:183\n*S KotlinDebug\n*F\n+ 1 FriendSkinResolver.kt\nkotakbaz/rain/friend/FriendSkinResolver\n*L\n127#1:185\n69#1:181,2\n127#1:183,2\n*E\n"})
public final class a_0 {
    @NotNull
    public static final a_0 INSTANCE;
    private static final class_2960 a;
    @NotNull
    private static final AtomicInteger A;
    private static final ExecutorService b;
    private static final ConcurrentHashMap.KeySetView<String, Boolean> B;
    private static final ConcurrentHashMap.KeySetView<String, Boolean> c;
    @NotNull
    private static final ConcurrentHashMap<String, UUID> C;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    private a_0() {
        super();
    }

    @NotNull
    public final class_2960 resolveTexture(@NotNull B b2) {
        long l = 3252540959382690316L;
        int n = F[0];
        n ^= F[1];
        Intrinsics.checkNotNullParameter(b2, (String)d[n += F[2]]);
        class_2960 class_29602 = b2.getSkinTexture();
        if (class_29602 != null) {
            class_2960 class_29603 = class_29602;
            long l2 = l;
            int n2 = F[3];
            n2 += F[4];
            l = l2 ^ (0L ^ l2) & -1L << (n2 -= F[5]);
            return class_29603;
        }
        this.requestSkin(b2);
        class_2960 class_29604 = a;
        int n3 = F[6];
        n3 -= F[7];
        Intrinsics.checkNotNullExpressionValue(class_29604, (String)d[n3 += F[8]]);
        return class_29604;
    }

    @NotNull
    public final class_2960 resolveTexture(@NotNull String string) {
        B b2;
        block3: {
            block2: {
                long l = -1482169327922540730L;
                int n = F[9];
                n -= F[10];
                Intrinsics.checkNotNullParameter(string, (String)d[n ^= F[11]]);
                b2 = kotakbaz.rain.friend.C.INSTANCE.getFriend(string);
                if (b2 == null) break block2;
                B b3 = b2;
                long l2 = l;
                int n2 = F[12];
                n2 += F[13];
                l = l2 ^ (0L ^ l2) & -1L << (n2 ^= F[14]);
                class_2960 class_29602 = this.resolveTexture(b3);
                b2 = class_29602;
                if (class_29602 != null) break block3;
            }
            class_2960 class_29603 = a;
            b2 = class_29603;
            int n = F[15];
            n -= F[16];
            Intrinsics.checkNotNullExpressionValue(class_29603, (String)d[n += F[17]]);
        }
        return b2;
    }

    public final void requestSkin(@NotNull B b2) {
        int n = F[18];
        n += F[19];
        Intrinsics.checkNotNullParameter(b2, (String)d[n -= F[20]]);
        String string = this.normalize(b2.getName());
        if (b2.getSkinTexture() != null) {
            return;
        }
        if (c.contains(string)) {
            return;
        }
        if (!B.add(string)) {
            return;
        }
        b.execute(() -> a_0.requestSkin$lambda$0(b2, string));
    }

    public final void clear(@NotNull B b2) {
        int n = F[21];
        n ^= F[22];
        Intrinsics.checkNotNullParameter(b2, (String)d[n += F[23]]);
        String string = this.normalize(b2.getName());
        B.remove(string);
        c.remove(string);
        b2.setSkinTexture(null);
    }

    public final void clearAll() {
        long l = 1869695010113994859L;
        B.clear();
        c.clear();
        Iterable iterable = kotakbaz.rain.friend.C.INSTANCE.getFriends();
        long l2 = l;
        int n = F[24];
        n -= F[25];
        l = l2 ^ (0L ^ l2) & -1L << (n -= F[26]);
        for (Object t2 : iterable) {
            String string = (String)t2;
            long l3 = l;
            int n2 = F[27];
            n2 += F[28];
            l = l3 ^ (0L ^ l3) & -1L >>> (n2 -= F[29]);
            B b2 = kotakbaz.rain.friend.C.INSTANCE.getFriend(string);
            if (b2 == null) continue;
            b2.setSkinTexture(null);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void loadSkin(B b2, String string) {
        ProfileResult profileResult;
        class_8685 class_86852;
        long l;
        block8: {
            class_8685 class_86853;
            long l2 = -2512313172975887353L;
            l = -3013188772171691490L;
            String string2 = b2.getName();
            long l3 = l;
            int n = F[30];
            n ^= F[31];
            l = l3 ^ (0L ^ l3) & -1L << (n -= F[32]);
            UUID uUID = this.resolveUUID(string2);
            class_86852 = class_1068.method_4648((UUID)uUID);
            boolean bl = F[33];
            bl -= F[34];
            ProfileResult profileResult2 = b_0.getMc().method_1495().fetchProfile(uUID, bl -= F[35]);
            if (profileResult2 == null || (profileResult2 = profileResult2.profile()) == null) {
                profileResult2 = profileResult = new GameProfile(uUID, string2);
            }
            if ((class_86853 = b_0.getMc().method_1582().method_72180((GameProfile)profileResult, class_86852)) == null || Intrinsics.areEqual(class_86853.comp_1626(), class_86852.comp_1626())) break block8;
            b2.setSkinTexture(class_86853.comp_1626());
            B.remove(string);
            return;
        }
        try {
            CompletableFuture completableFuture = b_0.getMc().method_1582().method_52863((GameProfile)profileResult);
            long l4 = l;
            int n = F[36];
            n -= F[37];
            l = l4 ^ (0x100000000L ^ l4) & -1L << (n ^= F[38]);
            completableFuture.whenComplete((arg_0, arg_1) -> a_0.loadSkin$lambda$1((arg_0, arg_1) -> a_0.loadSkin$lambda$0(class_86852, b2, string, arg_0, arg_1), arg_0, arg_1));
        }
        catch (Exception exception) {
            try {
                exception.printStackTrace();
                c.add(string);
            }
            catch (Throwable throwable) {
                int n = F[42];
                n += F[43];
                if ((int)(l >>> (n += F[44])) == 0) {
                    B.remove(string);
                }
                throw throwable;
            }
            int n = F[39];
            n ^= F[40];
            if ((int)(l >>> (n ^= F[41])) == 0) {
                B.remove(string);
            }
        }
    }

    @NotNull
    public final UUID resolveUUID(@NotNull String string) {
        long l = 3821649935960675908L;
        long l2 = 5209126498739193226L;
        long l3 = -4447518386991908670L;
        int n = F[45];
        n ^= F[46];
        Intrinsics.checkNotNullParameter(string, (String)d[n ^= F[47]]);
        String string2 = this.normalize(string);
        ConcurrentMap concurrentMap = C;
        String string3 = string2;
        long l4 = l2;
        int n2 = F[48];
        n2 += F[49];
        l2 = l4 ^ (0L ^ l4) & -1L << (n2 ^= F[50]);
        Object object = concurrentMap.get(string3);
        if (object == null) {
            UUID uUID;
            Object object2;
            long l5 = l2;
            int n3 = F[51];
            n3 ^= F[52];
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n3 ^= F[53]);
            Object object3 = INSTANCE;
            try {
                object2 = object3;
                long l6 = l3;
                int n4 = F[54];
                n4 ^= F[55];
                l3 = l6 ^ (0L ^ l6) & -1L << (n4 += F[56]);
                object2 = Result.constructor-impl(super.fetchOnlineUUID(string));
            }
            catch (Throwable throwable) {
                object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
            object3 = object2;
            Throwable throwable = Result.exceptionOrNull-impl(object3);
            if (throwable != null) {
                Object object4 = object2 = throwable;
                long l7 = l3;
                int n5 = F[57];
                n5 ^= F[58];
                l3 = l7 ^ (0L ^ l7) & -1L >>> (n5 += F[59]);
                ((Throwable)object4).printStackTrace();
            }
            if ((uUID = (UUID)(Result.isFailure-impl(object3) ? null : object3)) == null) {
                uUID = INSTANCE.offlineUUID(string);
            }
            UUID uUID2 = uUID;
            long l8 = l;
            int n6 = F[60];
            n6 -= F[61];
            l = l8 ^ (0L ^ l8) & -1L << (n6 ^= F[62]);
            object = concurrentMap.putIfAbsent(string3, uUID2);
            if (object == null) {
                object = uUID2;
            }
        }
        int n7 = F[63];
        n7 ^= F[64];
        Intrinsics.checkNotNullExpressionValue(object, (String)d[n7 -= F[65]]);
        return (UUID)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final UUID fetchOnlineUUID(String string) {
        String string2;
        long l = 5681877770131407593L;
        long l2 = -6157076014808460089L;
        String string3 = string2 = URLEncoder.encode(string, StandardCharsets.UTF_8);
        int n = F[66];
        n += F[67];
        int n2 = F[69];
        n2 -= F[70];
        Object object = new URI((String)d[n += F[68]] + (String)d[n2 ^= F[71]] + string3).toURL().openConnection();
        int n3 = F[72];
        n3 -= F[73];
        int n4 = F[75];
        n4 += F[76];
        Intrinsics.checkNotNull(object, (String)d[n3 -= F[74]] + (String)d[n4 -= F[77]]);
        HttpURLConnection httpURLConnection = (HttpURLConnection)object;
        try {
            Object object2;
            int n5;
            int n6 = F[78];
            n6 -= F[79];
            httpURLConnection.setConnectTimeout(n6 ^= F[80]);
            int n7 = F[81];
            n7 += F[82];
            httpURLConnection.setReadTimeout(n7 ^= F[83]);
            int n8 = F[84];
            n8 += F[85];
            int n9 = F[87];
            n9 += F[88];
            int n10 = F[90];
            n10 -= F[91];
            httpURLConnection.setRequestProperty((String)d[n8 += F[86]], (String)d[n9 ^= F[89]] + (String)d[n10 ^= F[92]]);
            int n11 = F[93];
            n11 ^= F[94];
            long l3 = l2;
            int n12 = F[96];
            n12 -= F[97];
            l2 = l3 ^ ((long)httpURLConnection.getResponseCode() << (n11 += F[95]) ^ l3) & -1L << (n12 += F[98]);
            int n13 = F[99];
            n13 ^= F[100];
            int n14 = F[102];
            n14 += F[103];
            if ((n13 -= F[101]) <= (int)(l2 >>> (n14 += F[104]))) {
                int n15 = F[105];
                n15 -= F[106];
                int n16 = F[108];
                n16 -= F[109];
                if ((int)(l2 >>> (n15 ^= F[107])) < (n16 += F[110])) {
                    int n17 = F[111];
                    n17 += F[112];
                    n5 = n17 ^= F[113];
                } else {
                    int n18 = F[114];
                    n18 += F[115];
                    n5 = n18 ^= F[116];
                }
            } else {
                int n19 = F[117];
                n19 += F[118];
                n5 = n19 -= F[119];
            }
            if (n5 == 0) {
                object = null;
                return object;
            }
            object = new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8);
            Throwable throwable = null;
            try {
                String string4;
                Object object3;
                Object object4;
                block22: {
                    block21: {
                        object2 = (InputStreamReader)object;
                        long l4 = l;
                        int n20 = F[120];
                        n20 += F[121];
                        l = l4 ^ (0L ^ l4) & -1L >>> (n20 ^= F[122]);
                        object4 = new Gson().fromJson((Reader)object2, JsonObject.class);
                        if (object4 == null) break block21;
                        int n21 = F[123];
                        n21 += F[124];
                        object3 = ((JsonObject)object4).get((String)d[n21 -= F[125]]);
                        if (object3 != null && (string4 = ((JsonElement)object3).getAsString()) != null) break block22;
                    }
                    UUID uUID = null;
                    UUID uUID2 = uUID;
                    return uUID2;
                }
                String string5 = string4;
                object4 = string5;
                int n22 = F[126];
                n22 += F[127];
                int n23 = F[129];
                n23 ^= F[130];
                object3 = new Regex((String)d[n22 ^= F[128]] + (String)d[n23 ^= F[131]]);
                int n24 = F[132];
                n24 ^= F[133];
                string4 = (String)d[n24 ^= F[134]];
                object2 = UUID.fromString(((Regex)object3).replaceFirst((CharSequence)object4, string4));
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                CloseableKt.closeFinally((Closeable)object, throwable);
            }
            object = object2;
        }
        finally {
            httpURLConnection.disconnect();
        }
        return object;
    }

    private final UUID offlineUUID(String string) {
        String string2 = string;
        int n = F[135];
        n ^= F[136];
        String string3 = (String)d[n += F[137]] + string2;
        Charset charset = StandardCharsets.UTF_8;
        int n2 = F[138];
        n2 += F[139];
        Intrinsics.checkNotNullExpressionValue(charset, (String)d[n2 -= F[140]]);
        byte[] byArray = string3.getBytes(charset);
        int n3 = F[141];
        n3 -= F[142];
        Intrinsics.checkNotNullExpressionValue(byArray, (String)d[n3 ^= F[143]]);
        UUID uUID = UUID.nameUUIDFromBytes(byArray);
        int n4 = F[144];
        n4 ^= F[145];
        int n5 = F[147];
        n5 ^= F[148];
        Intrinsics.checkNotNullExpressionValue(uUID, (String)d[n4 -= F[146]] + (String)d[n5 ^= F[149]]);
        return uUID;
    }

    private final String normalize(String string) {
        String string2 = string;
        Locale locale = Locale.ROOT;
        int n = F[150];
        n += F[151];
        Intrinsics.checkNotNullExpressionValue(locale, (String)d[n += F[152]]);
        String string3 = string2.toLowerCase(locale);
        int n2 = F[153];
        n2 += F[154];
        int n3 = F[156];
        n3 -= F[157];
        Intrinsics.checkNotNullExpressionValue(string3, (String)d[n2 ^= F[155]] + (String)d[n3 += F[158]]);
        return string3;
    }

    private static final Thread skinExecutor$lambda$0(Runnable runnable) {
        Thread thread;
        long l = -3377810645586847243L;
        long l2 = -2007675515502186257L;
        int n = F[159];
        n += F[160];
        long l3 = l;
        int n2 = F[162];
        n2 -= F[163];
        l = l3 ^ ((long)A.incrementAndGet() << (n += F[161]) ^ l3) & -1L << (n2 -= F[164]);
        int n3 = F[165];
        n3 ^= F[166];
        int n4 = F[168];
        n4 += F[169];
        int n5 = F[171];
        n5 ^= F[172];
        Thread thread2 = thread = new Thread(runnable, (String)d[n3 += F[167]] + (String)d[n4 -= F[170]] + (int)(l >>> (n5 += F[173])));
        long l4 = l2;
        int n6 = F[174];
        n6 += F[175];
        l2 = l4 ^ (0L ^ l4) & -1L << (n6 -= F[176]);
        boolean bl = F[177];
        bl += F[178];
        thread2.setDaemon(bl += F[179]);
        return thread;
    }

    private static final void requestSkin$lambda$0(B b2, String string) {
        INSTANCE.loadSkin(b2, string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void loadSkin$lambda$0$0(Optional optional, class_8685 class_86852, B b2, String string) {
        try {
            if (optional != null && optional.isPresent()) {
                class_2960 class_29602 = ((class_8685)optional.get()).comp_1626();
                if (!Intrinsics.areEqual(class_29602, class_86852.comp_1626())) {
                    b2.setSkinTexture(class_29602);
                } else {
                    c.add(string);
                }
            } else {
                c.add(string);
            }
        }
        finally {
            B.remove(string);
        }
    }

    private static final Unit loadSkin$lambda$0(class_8685 class_86852, B b2, String string, Optional optional, Throwable throwable) {
        Throwable throwable2 = throwable;
        if (throwable2 != null) {
            throwable2.printStackTrace();
        }
        b_0.getMc().execute(() -> a_0.loadSkin$lambda$0$0(optional, class_86852, b2, string));
        return Unit.INSTANCE;
    }

    private static final void loadSkin$lambda$1(Function2 function2, Object object, Object object2) {
        function2.invoke(object, object2);
    }

    static {
        a_0.b();
        long l = -7655316800247867681L;
        long l2 = 7613305915686535487L;
        long l3 = -1943030219286379898L;
        long l4 = -1128461984925053830L;
        long l5 = -9021098780154267163L;
        long l6 = -3585737548443495757L;
        long l7 = 2774388547085486284L;
        long l8 = -7555497313033287389L;
        long l9 = -1113700108122342446L;
        long l10 = -1495952775780565188L;
        long l11 = -6523019958519603831L;
        long l12 = 5457989599856378109L;
        long l13 = -6665536767302429965L;
        long l14 = 3944260809139767944L;
        int n = F[180];
        n ^= F[181];
        d = new Object[n -= F[182]];
        long l15 = l14;
        int n2 = F[183];
        n2 += F[184];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += F[185]);
        Object[] objectArray = new Object[F[186]];
        objectArray[a_0.F[187]] = D;
        objectArray[a_0.F[188]] = F[189];
        int n3 = F[190];
        Object object = a_0.A()[F[191]];
        if (object == null) {
            char[] cArray = "\u38e9\u29b0\u29b7\u38f2\u29a5\u2982\u38f2\u29b1\u2989\u2984\u2997\u299e\u29a7\u38ef\u29ac\u2983\u2986\u29a2\u2985\u2990\u38f4\u29a5\u38c9\u29ac\u2997\u29a1\u38f0\u299b\u388e\u2987\u2980\u2999\u29b2\u2991\u2983\u29a6\u29ad\u38f5\u38f2\u29ae\u38f4\u298a\u29be\u298a\u2992\u2988\u38f7\u38e3\u299a\u29a4\u29a6\u38f1\u38c8\u29b7\u2987\u38e8\u38ef\u29ac\u2999\u38e3\u2997\u29a1\u2985\u38f2\u2987\u2981\u2999\u2984\u29b5\u29b0\u29ae\u29bb\u2984\u2992\u298a\u2985\u388e\u29b7\u29ba\u2980\u29a7\u38cb\u298f\u29b7\u2984\u2989\u299b\u2994\u38f0\u298b\u38e9\u38f4\u29a1\u299b\u298a\u2984\u2984\u29ba\u29b1\u2992\u38f5\u2981\u298d\u299b\u29af\u2990\u2985\u38f5\u2982\u29a3\u2991\u2986\u29a5\u299e\u29ad\u29ac\u2989\u38f2\u2985\u29a3\u2992\u29a4\u29ad\u29be\u29b2\u29af\u29b5\u298f\u29b5\u2991\u29b2\u298f\u2989\u2991\u29be\u29ae\u29b2\u38f2\u29b7\u38f0\u2995\u2990\u38f7\u2987\u2991\u2984\u298d\u298a\u2981\u38c8\u38e9\u2981\u2982\u299a\u299e\u29a4\u38f4\u29b5\u388e\u38f2\u38c8\u38ef\u2985\u38f7\u2980\u2981\u298d\u29ae\u298d\u2986\u29b2\u299a\u38f2\u2990\u29b0\u29af\u299a\u2a4e\u2983\u299a\u299b\u29a1\u2995\u38f0\u298f\u29a4\u2a4e\u38f4\u29a7\u29ae\u38e9\u2992\u38c8\u2990\u299b\u29b4\u2985\u29a5\u2989\u29b5\u38c8\u29af\u29a2\u29a0\u29a5\u38f0\u38eb\u298b\u29a2\u29bb\u298f\u29b0\u29b9\u38f2\u298a\u29b0\u2989\u298b\u29a7\u2985\u2983\u29b7\u29ad\u38c8\u298c\u29a1\u2995\u2991\u29a4\u29a6\u29a7\u2997\u2a4e\u29aa\u2991\u29b4\u2982\u29b5\u29b1\u38e9\u2980\u2995\u2999\u298c\u29b0\u38cb\u2997\u29a0\u29ba\u2981\u29b1\u29af\u2992\u29a2\u29ad\u38f7\u2990\u38c8\u29a4\u38f2\u29b7\u38f4\u29b0\u2995\u2980\u299b\u38ef\u38ef\u299e\u29a0\u298c\u2991\u38c8\u299a\u38e9\u38ef\u29b7\u2990\u298a\u38eb\u29bb\u2994\u38e9\u38eb\u2981\u29be\u38e9\u2997\u38c8\u299a\u29a6\u29ac\u29bb\u38c8\u38c8\u29b2\u38f1\u38eb\u298b\u298f\u29a5\u29b2\u29a1\u298d\u2999\u2984\u29b5\u2984\u298c\u38c8\u29ad\u38f0\u38c8\u38c9\u38e3\u38f0\u38f5\u38e3\u38f5\u29ba\u2982\u2989\u38f4\u299b\u38f2\u299b\u29a3\u38f2\u298b\u29a4\u29b9\u29a6\u388e\u2999\u38f2\u29aa\u38f0\u38cb\u2983\u298b\u38e8\u2980\u2981\u38e3\u29a7\u38e3\u2984\u2a4e\u29b4\u29a4\u2989\u2982\u38f4\u388e\u29a4\u29ae\u2990\u2989\u2988\u2990\u2981\u38c9\u38f1\u38f1\u38e9\u29a4\u2983\u38c9\u299e\u2990\u2994\u29bb\u2986\u38f4\u29a0\u38f1\u29af\u38cb\u38cb\u29b7\u2991\u38e8\u29a1\u388e\u38cb\u29b5\u38f0\u2987\u298f\u29b7\u2995\u38e3\u29a6\u2980\u29a6\u299b\u29a4\u2986\u38f2\u29ba\u29a2\u38eb\u2984\u38f5\u29a0\u29ac\u2983\u29a4\u29a3\u29a6\u38ef\u29a0\u38e8\u2985\u2990\u29a5\u29a7\u38ef\u38f7\u29b5\u2990\u38f2\u29ba\u29a0\u38f5\u298c\u2983\u2995\u38ef\u29ae\u29ad\u2980\u2990\u2990\u38e8\u2981\u29ae\u2a4e\u388e\u38c9\u29a1\u29ac\u29b7\u38f7\u2980\u2982\u298f\u2a4e\u38e9\u29a6\u29a0\u38cb\u298f\u29a7\u29b0\u2992\u38c8\u29a7\u29b4\u29a0\u2990\u29ae\u298a\u29b4\u29be\u38f4\u298b\u2997\u2995\u2986\u299b\u38eb\u29a6\u2990\u388e\u2990\u38e3\u38f5\u38e8\u29b1\u29ae\u29ba\u29b7\u38e9\u38f1\u29ac\u29b2\u299e\u299a\u38e8\u38c8\u29af\u2995\u38cb\u38f0\u2980\u38eb\u38c9\u298c\u29af\u38f5\u2995\u38e9\u29b9\u2985\u2a4e\u38f1\u2981\u29af\u29b2\u29b0\u2992\u299a\u29a2\u38f0\u2997\u29a0\u299e\u2997\u299e\u299e\u2a4e\u38f7\u298c\u38cb\u29be\u38e8\u2991\u29ad\u38f5\u29a6\u29ac\u38f1\u29a2\u298a\u29bb\u38c8\u298a\u299a\u29ba\u38eb\u38eb\u298f\u2980\u38e3\u38cb\u38e9\u2997\u29b7\u38e8\u38f7\u29b5\u2992\u29be\u2985\u29a5\u29af\u298b\u29aa\u38f0\u299a\u29b2\u38c9\u29a4\u38f1\u29af\u2992\u38eb\u2987\u38f7\u2994\u29b5\u298c\u38c9\u2983\u38c8".toCharArray();
            for (int i = F[192]; i < F[193]; ++i) {
                int n4 = cArray[i];
                n4 += F[194];
                n4 += F[195];
                n4 ^= F[196];
                n4 ^= F[197];
                n4 -= F[198];
                n4 += F[199];
                n4 ^= F[200];
                n4 ^= F[201];
                n4 ^= F[202];
                n4 += F[203];
                cArray[i] = (char)(n4 ^= F[204]);
            }
            object = a_0.A()[a_0.F[205]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = F[206];
        n5 -= F[207];
        l5 = l16 ^ (0x19300000000L ^ l16) & -1L << (n5 -= F[208]);
        long l17 = l12;
        int n6 = F[209];
        n6 += F[210];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= F[211]);
        while (true) {
            int n7 = F[212];
            n7 += F[213];
            if ((int)l12 >= (int)(l5 >>> (n7 -= F[214]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = F[215];
            n9 -= F[216];
            int n10 = F[218];
            n10 += F[219];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= F[217])) & -1L >>> (n10 ^= F[220]);
            long l19 = l8;
            int n11 = F[221];
            n11 ^= F[222];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += F[223]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = F[224];
            n13 ^= F[225];
            int n14 = F[227];
            n14 += F[228];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= F[226])) & -1L >>> (n14 += F[229]);
            int n15 = F[230];
            n15 -= F[231];
            long l21 = l9;
            int n16 = F[233];
            n16 += F[234];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= F[232]) ^ l21) & -1L << (n16 += F[235]);
            int n17 = F[236];
            n17 += F[237];
            n17 ^= F[238];
            int n18 = F[239];
            n18 ^= F[240];
            long l22 = l11;
            int n19 = F[242];
            n19 += F[243];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += F[241]))) ^ l22) & -1L >>> (n19 -= F[244]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = F[245];
            n20 -= F[246];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += F[247]);
            while (true) {
                int n21 = F[248];
                n21 -= F[249];
                if ((int)(l13 >>> (n21 -= F[250])) >= (int)l11) break;
                int n22 = F[251];
                n22 += F[252];
                int n23 = F[254];
                n23 -= F[255];
                cArray2[(int)(l13 >>> (n22 -= a_0.F[253]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= F[256]))];
                l13 += 0x100000000L;
            }
            int n24 = F[257];
            n24 -= F[258];
            int n25 = (int)(l14 >>> (n24 += F[259]));
            l14 += 0x100000000L;
            a_0.d[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = F[260];
            n26 ^= F[261];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += F[262]);
        }
        INSTANCE = new a_0();
        a = class_1068.method_4649();
        A = new AtomicInteger();
        int n27 = F[263];
        n27 += F[264];
        b = Executors.newFixedThreadPool(n27 -= F[265], a_0::skinExecutor$lambda$0);
        B = ConcurrentHashMap.newKeySet();
        c = ConcurrentHashMap.newKeySet();
        C = new ConcurrentHashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[F[266]];
        String string = (String)object[F[267]];
        object = object[F[268]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[269]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[270]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[272] ^ F[273]];
                byArray[a_0.F[274] ^ a_0.F[275]] = F[276] ^ F[277];
                byArray[a_0.F[278] ^ a_0.F[279]] = F[280] ^ F[281];
                byArray[a_0.F[282] ^ a_0.F[283]] = F[284] ^ F[285];
                byArray[a_0.F[286] ^ a_0.F[287]] = F[288] ^ F[289];
                byArray[a_0.F[290] ^ a_0.F[291]] = F[292] ^ F[293];
                byArray[a_0.F[294] ^ a_0.F[295]] = F[296] ^ F[297];
                byArray[a_0.F[298] ^ a_0.F[299]] = F[300] ^ F[301];
                byArray[a_0.F[302] ^ a_0.F[303]] = F[304] ^ F[305];
                byArray[a_0.F[306] ^ a_0.F[307]] = F[308] ^ F[309];
                byArray[a_0.F[310] ^ a_0.F[311]] = F[312] ^ F[313];
                byArray[a_0.F[314] ^ a_0.F[315]] = F[316] ^ F[317];
                byArray[a_0.F[318] ^ a_0.F[319]] = F[320] ^ F[321];
                byArray[a_0.F[322] ^ a_0.F[323]] = F[324] ^ F[325];
                byArray[a_0.F[326] ^ a_0.F[327]] = F[328] ^ F[329];
                byArray[a_0.F[330] ^ a_0.F[331]] = F[332] ^ F[333];
                byArray[a_0.F[334] ^ a_0.F[335]] = F[336] ^ F[337];
                objectArray2[a_0.F[271]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[338]];
            if (e == null) {
                byte[] byArray2 = new byte[F[339] ^ F[340]];
                byArray2[a_0.F[341] ^ a_0.F[342]] = F[343] ^ F[344];
                byArray2[a_0.F[345] ^ a_0.F[346]] = F[347] ^ F[348];
                byArray2[a_0.F[349] ^ a_0.F[350]] = F[351] ^ F[352];
                byArray2[a_0.F[353] ^ a_0.F[354]] = F[355] ^ F[356];
                byArray2[a_0.F[357] ^ a_0.F[358]] = F[359] ^ F[360];
                byArray2[a_0.F[361] ^ a_0.F[362]] = F[363] ^ F[364];
                byArray2[a_0.F[365] ^ a_0.F[366]] = F[367] ^ F[368];
                byArray2[a_0.F[369] ^ a_0.F[370]] = F[371] ^ F[372];
                byArray2[a_0.F[373] ^ a_0.F[374]] = F[375] ^ F[376];
                byArray2[a_0.F[377] ^ a_0.F[378]] = F[379] ^ F[380];
                byArray2[a_0.F[381] ^ a_0.F[382]] = F[383] ^ F[384];
                byArray2[a_0.F[385] ^ a_0.F[386]] = F[387] ^ F[388];
                byArray2[a_0.F[389] ^ a_0.F[390]] = F[391] ^ F[392];
                byArray2[a_0.F[393] ^ a_0.F[394]] = F[395] ^ F[396];
                byArray2[a_0.F[397] ^ a_0.F[398]] = F[399] ^ 0x9935;
                byArray2[0x3DAF ^ 0x3DBA] = 0x3D8E ^ 0x3DBA;
                byArray2[0x40FE ^ 0x40E5] = 0xFFFFBF50 ^ 0x40E5;
                byArray2[0xE972 ^ 0xE97F] = 0xFFFF1682 ^ 0xE97F;
                byArray2[0x6EC0 ^ 0x6EDD] = 0xFFFF910E ^ 0x6EDD;
                byArray2[0xBB8B ^ 0xBB8C] = 0xFFFF4460 ^ 0xBB8C;
                byArray2[0xABEC ^ 0xABF5] = 0xFFFF5412 ^ 0xABF5;
                byArray2[0x9237 ^ 0x923E] = 0x920B ^ 0x923E;
                byArray2[0x5CB3 ^ 0x5CA3] = 0xFFFFA301 ^ 0x5CA3;
                byArray2[0x8F4D ^ 0x8F55] = 0x8F7E ^ 0x8F55;
                byArray2[0xA873 ^ 0xA867] = 0xFFFF57AB ^ 0xA867;
                byArray2[0xE2D6 ^ 0xE2D0] = 0xFFFF1D4B ^ 0xE2D0;
                byArray2[0xC59 ^ 0xC4A] = 0xFFFFF395 ^ 0xC4A;
                byArray2[0x3C16 ^ 0x3C12] = 0x3C7E ^ 0x3C12;
                byArray2[0x4432 ^ 0x442C] = 0xFFFFBBA4 ^ 0x442C;
                byArray2[0xFA1E ^ 0xFA15] = 0xFA55 ^ 0xFA15;
                byArray2[0xC5CC ^ 0xC5DE] = 0xFFFF3A7F ^ 0xC5DE;
                byArray2[0xCC84 ^ 0xCC98] = 0xFFFF332C ^ 0xCC98;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u8dd5\u8dc7\u8dcc\u8dd1\u8dd3\u8ff7\u8de0\u8e2a\u8dc1\u8e2d\u8dcd\u8e36\u8e22\u8e24\u8dd4\u8dcd\u8dc2\u8ff2".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 -= 12080;
                        n2 -= 33969;
                        n2 += 18913;
                        n2 ^= 0x6FC1;
                        n2 -= 48419;
                        n2 ^= 0x48E5;
                        n2 -= 52071;
                        n2 += 25336;
                        n2 += 27321;
                        n2 -= 64634;
                        n2 += 8525;
                        cArray[i] = (char)(n2 += 4895);
                    }
                    object4 = a_0.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[2] = 64;
                byArray4[1] = -46;
                byArray4[6] = -98;
                byArray4[11] = 40;
                byArray4[5] = -68;
                byArray4[14] = 31;
                byArray4[4] = -107;
                byArray4[13] = 70;
                byArray4[15] = 28;
                byArray4[8] = -55;
                byArray4[0] = 52;
                byArray4[3] = -13;
                byArray4[10] = 54;
                byArray4[9] = -27;
                byArray4[7] = -2;
                byArray4[12] = -124;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 20, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ud586\ud522\ud5dc".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 55953;
                        n3 -= 7889;
                        n3 -= 40852;
                        n3 ^= 0x26A5;
                        n3 -= 48519;
                        n3 ^= 0x1668;
                        n3 -= 9240;
                        n3 ^= 0x59AD;
                        n3 += 15757;
                        n3 += 42878;
                        cArray[i] = (char)(n3 ^= 0x644F);
                    }
                    object5 = a_0.A()[2] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = a_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u8faf\u8fab\u8fd9\u8fbd\u8fa9\u8fac\u8fa9\u8fbd\u8fa2\u8fb1\u8fa9\u8fd9\u8fbb\u8fa2\u8fcf\u8fce\u8fce\u8fd7\u8fd0\u8fd5".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0x1AC0;
                    n4 ^= 0x2451;
                    n4 ^= 0xD031;
                    n4 ^= 0x55C2;
                    n4 -= 35814;
                    n4 += 6487;
                    n4 -= 17610;
                    n4 ^= 0xB2B;
                    n4 ^= 0xFBDD;
                    cArray[i] = (char)(n4 += 29375);
                }
                object6 = a_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)e), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = f;
        if (f == null) {
            f = new Object[4];
            objectArray = f;
        }
        return objectArray;
    }

    public static void b() {
        F = new int[0x19E3 ^ 0x1873];
        a_0.F[0x63D7 ^ 0x62AF] = 0x87B6 ^ 0x62AF;
        a_0.F[0x22D ^ 0x2AD] = 0x2E3 ^ 0x2AD;
        a_0.F[0x80AC ^ 0x80C2] = 0xFFFF7F01 ^ 0x80C2;
        a_0.F[0x10146 ^ 0x10045] = 0xFFFEFFE5 ^ 0x10045;
        a_0.F[0x5C53 ^ 0x5CE8] = 0x5CE8 ^ 0x5CE8;
        a_0.F[0x7B47 ^ 0x7B69] = 0x7B4F ^ 0x7B69;
        a_0.F[0xBAAB ^ 0xBBEA] = 0xC6A2 ^ 0xBBEA;
        a_0.F[0xA10 ^ 0xA4D] = 0xA6A ^ 0xA4D;
        a_0.F[0x7228 ^ 0x72CA] = 0xFFFF8D1B ^ 0x72CA;
        a_0.F[0xC5D3 ^ 0xC57E] = 0xFFFF3AEF ^ 0xC57E;
        a_0.F[0x5C11 ^ 0x5C39] = 0x5C3E ^ 0x5C39;
        a_0.F[0xB0B9 ^ 0xB02B] = 0xB064 ^ 0xB02B;
        a_0.F[0x10BB2 ^ 0x10BBB] = 0xFFFEF466 ^ 0x10BBB;
        a_0.F[0xECFA ^ 0xEC3B] = 0xEE7B ^ 0xEC3B;
        a_0.F[0x69E7 ^ 0x6934] = 0x697D ^ 0x6934;
        a_0.F[0xEC74 ^ 0xECD5] = 0xFFFF1371 ^ 0xECD5;
        a_0.F[0x594A ^ 0x591F] = 0xFFFFA6F9 ^ 0x591F;
        a_0.F[0x10B57 ^ 0x10AD8] = 0xFFFE6C14 ^ 0x10AD8;
        a_0.F[0x8E0F ^ 0x8F7A] = 0x6A63 ^ 0x8F7A;
        a_0.F[0x85B3 ^ 0x85ED] = 0xFFFF7A61 ^ 0x85ED;
        a_0.F[0x97AC ^ 0x9680] = 0xFFFF46ED ^ 0x9680;
        a_0.F[0x1D8 ^ 0x100] = 0x153 ^ 0x100;
        a_0.F[0x81E4 ^ 0x81A2] = 0x81F1 ^ 0x81A2;
        a_0.F[0xBE1B ^ 0xBE44] = 0xBE31 ^ 0xBE44;
        a_0.F[0x6E5F ^ 0x6E39] = 0x6E9D ^ 0x6E39;
        a_0.F[0x2DBE ^ 0x2CA8] = 0x307C ^ 0x2CA8;
        a_0.F[0xFB0C ^ 0xFB9B] = 0xFFFF0419 ^ 0xFB9B;
        a_0.F[0xF056 ^ 0xF144] = 0x28BA ^ 0xF144;
        a_0.F[0x7A75 ^ 0x7B70] = 0x7B22 ^ 0x7B70;
        a_0.F[0xA8FC ^ 0xA84A] = 0xFFFF57BC ^ 0xA84A;
        a_0.F[0x3659 ^ 0x370B] = 0x370B ^ 0x370B;
        a_0.F[0xB56B ^ 0xB557] = 0xB55A ^ 0xB557;
        a_0.F[0xF509 ^ 0xF54C] = 0xF5D8 ^ 0xF54C;
        a_0.F[0x3C18 ^ 0x3CC4] = 0xFFFFC357 ^ 0x3CC4;
        a_0.F[0x94CF ^ 0x944B] = 0xFFFF6BCC ^ 0x944B;
        a_0.F[0xA615 ^ 0xA610] = 0xA629 ^ 0xA610;
        a_0.F[0xD00C ^ 0xD187] = 0xFFFF52BE ^ 0xD187;
        a_0.F[0xB573 ^ 0xB517] = 0xB532 ^ 0xB517;
        a_0.F[0x147E ^ 0x14A5] = 0x1485 ^ 0x14A5;
        a_0.F[0x2F02 ^ 0x2E7B] = 0xA8FF ^ 0x2E7B;
        a_0.F[0x8CA ^ 0x8E3] = 0xFFFFF746 ^ 0x8E3;
        a_0.F[0x102E0 ^ 0x1026A] = 0xFFFEFD0C ^ 0x1026A;
        a_0.F[0x10CBC ^ 0x10CFC] = 0x10C95 ^ 0x10CFC;
        a_0.F[0xF1AD ^ 0xF163] = 0xF1F7 ^ 0xF163;
        a_0.F[0xB444 ^ 0xB518] = 0x8A4E ^ 0xB518;
        a_0.F[0xB28C ^ 0xB245] = 0xCB89 ^ 0xB245;
        a_0.F[0x6D44 ^ 0x6C7B] = 0x1133 ^ 0x6C7B;
        a_0.F[0x10B71 ^ 0x10A2E] = 0x1878E ^ 0x10A2E;
        a_0.F[0x8AC6 ^ 0x8AA5] = 0x8A63 ^ 0x8AA5;
        a_0.F[0x6106 ^ 0x605B] = 0xEDD9 ^ 0x605B;
        a_0.F[0x8BD3 ^ 0x8B7B] = 0x8B4E ^ 0x8B7B;
        a_0.F[0x5B11 ^ 0x5B5D] = 0x5B59 ^ 0x5B5D;
        a_0.F[0x627C ^ 0x63FF] = 0x5255 ^ 0x63FF;
        a_0.F[0x65BD ^ 0x6556] = 0x652A ^ 0x6556;
        a_0.F[0xABF0 ^ 0xAA8B] = 0x2C3A ^ 0xAA8B;
        a_0.F[0x8B7 ^ 0x9AB] = 0xFFFF6F75 ^ 0x9AB;
        a_0.F[0x4ADB ^ 0x4AFB] = 0xFFFFB500 ^ 0x4AFB;
        a_0.F[0xA02D ^ 0xA14F] = 0x1622 ^ 0xA14F;
        a_0.F[0x3B79 ^ 0x3BDC] = 0xFFFFC451 ^ 0x3BDC;
        a_0.F[0x5DE2 ^ 0x5CAD] = 0x7530 ^ 0x5CAD;
        a_0.F[0x5BEA ^ 0x5B1D] = 0x5B1A ^ 0x5B1D;
        a_0.F[0xCA70 ^ 0xCB3E] = 0xE2A0 ^ 0xCB3E;
        a_0.F[0xFF9E ^ 0xFEB0] = 0x6F6 ^ 0xFEB0;
        a_0.F[0x2BF0 ^ 0x2BD3] = 0xFFFFD462 ^ 0x2BD3;
        a_0.F[0x1043E ^ 0x10413] = 0xFFFEFB9E ^ 0x10413;
        a_0.F[0x96A6 ^ 0x9613] = 0xFFFF69E8 ^ 0x9613;
        a_0.F[0x6A7E ^ 0x6B45] = 0x3A7A ^ 0x6B45;
        a_0.F[0xA7AF ^ 0xA6DB] = 0x3770 ^ 0xA6DB;
        a_0.F[0xCCA4 ^ 0xCC17] = 0xFFFF33EB ^ 0xCC17;
        a_0.F[0x8180 ^ 0x808D] = 0x808C ^ 0x808D;
        a_0.F[0xBE3B ^ 0xBF53] = 0xAAF ^ 0xBF53;
        a_0.F[0x7F0D ^ 0x7E06] = 0x7E04 ^ 0x7E06;
        a_0.F[0x7EAE ^ 0x7FD1] = 0xFFFF3BB6 ^ 0x7FD1;
        a_0.F[0x8B16 ^ 0x8BBD] = 0x8B40 ^ 0x8BBD;
        a_0.F[0xBC33 ^ 0xBCCB] = 0xBC81 ^ 0xBCCB;
        a_0.F[0x9434 ^ 0x9465] = 0xFFFF7FBE ^ 0x9465;
        a_0.F[0x2DD0 ^ 0x2C96] = 0xFDC5 ^ 0x2C96;
        a_0.F[0xB09 ^ 0xA0F] = 0xFFFFF5B6 ^ 0xA0F;
        a_0.F[0x59AF ^ 0x58BB] = 0xFFFF7E9E ^ 0x58BB;
        a_0.F[0xDC58 ^ 0xDC4E] = 0xFFFF23E0 ^ 0xDC4E;
        a_0.F[0xA786 ^ 0xA6FA] = 0x2071 ^ 0xA6FA;
        a_0.F[0x3BD6 ^ 0x3A9F] = 0xEBCD ^ 0x3A9F;
        a_0.F[0x7601 ^ 0x769B] = 0x7680 ^ 0x769B;
        a_0.F[0x2FB7 ^ 0x2ED2] = 0x9B3F ^ 0x2ED2;
        a_0.F[0x53BD ^ 0x528B] = 0x5921 ^ 0x528B;
        a_0.F[0x6612 ^ 0x679C] = 0xFEA9 ^ 0x679C;
        a_0.F[0xBE1F ^ 0xBE93] = 0xFFFF4106 ^ 0xBE93;
        a_0.F[0xE45C ^ 0xE52D] = 0x7499 ^ 0xE52D;
        a_0.F[0x279F ^ 0x26A7] = 0x2D52 ^ 0x26A7;
        a_0.F[0x3830 ^ 0x389A] = 0xFFFFC778 ^ 0x389A;
        a_0.F[0x764C ^ 0x766D] = 0xFFFF89CB ^ 0x766D;
        a_0.F[0x2C8A ^ 0x2C7A] = 0x2C3F ^ 0x2C7A;
        a_0.F[0x172F ^ 0x167E] = 0x3FE3 ^ 0x167E;
        a_0.F[0x1B40 ^ 0x1A02] = 0xEF0E ^ 0x1A02;
        a_0.F[0xD927 ^ 0xD95D] = 0xFFFF26C9 ^ 0xD95D;
        a_0.F[0x6F24 ^ 0x6FE2] = 0x4E15 ^ 0x6FE2;
        a_0.F[0x8449 ^ 0x8456] = 0x8427 ^ 0x8456;
        a_0.F[0x731 ^ 0x63B] = 0x63A ^ 0x63B;
        a_0.F[0xC1A3 ^ 0xC1B6] = 0xFFFF3E15 ^ 0xC1B6;
        a_0.F[0xD2EC ^ 0xD36B] = 0x76D4 ^ 0xD36B;
        a_0.F[0x12D4 ^ 0x13BE] = 0xF2F2 ^ 0x13BE;
        a_0.F[0x1128 ^ 0x1072] = 0x2F24 ^ 0x1072;
        a_0.F[0xE029 ^ 0xE05C] = 0xE0C5 ^ 0xE05C;
        a_0.F[0x684 ^ 0x785] = 0x7F9 ^ 0x785;
        a_0.F[0x7CFD ^ 0x7C96] = 0x7CE1 ^ 0x7C96;
        a_0.F[0xECFA ^ 0xECCF] = 0xFFFF133F ^ 0xECCF;
        a_0.F[0xCD47 ^ 0xCC45] = 0xFFFF33B9 ^ 0xCC45;
        a_0.F[0x2E7B ^ 0x2EB6] = 0x2EB6 ^ 0x2EB6;
        a_0.F[0xACC7 ^ 0xAC6E] = 0xFFFF53C0 ^ 0xAC6E;
        a_0.F[0x887E ^ 0x889E] = 0xFFFF772E ^ 0x889E;
        a_0.F[0x5334 ^ 0x53ED] = 0x53A7 ^ 0x53ED;
        a_0.F[0x466 ^ 0x424] = 0xFFFFFBEC ^ 0x424;
        a_0.F[0x6873 ^ 0x6917] = 0xDE7A ^ 0x6917;
        a_0.F[0x10061 ^ 0x10078] = 0xFFFEFF83 ^ 0x10078;
        a_0.F[0x3DB3 ^ 0x3D3D] = 0x3D28 ^ 0x3D3D;
        a_0.F[0x3746 ^ 0x3669] = 0xCE25 ^ 0x3669;
        a_0.F[0x5765 ^ 0x565C] = 0x5DFE ^ 0x565C;
        a_0.F[0x3912 ^ 0x399A] = 0x39CE ^ 0x399A;
        a_0.F[0xC3FD ^ 0xC2C1] = 0x93D7 ^ 0xC2C1;
        a_0.F[0x4A63 ^ 0x4A1C] = 0xFFFFB596 ^ 0x4A1C;
        a_0.F[0xE341 ^ 0xE31A] = 0xFFFF1CA2 ^ 0xE31A;
        a_0.F[0xF67F ^ 0xF70C] = 0x6691 ^ 0xF70C;
        a_0.F[0x6265 ^ 0x6322] = 0xB270 ^ 0x6322;
        a_0.F[0x512D ^ 0x5153] = 0x519D ^ 0x5153;
        a_0.F[0x1F65 ^ 0x1FE8] = 0x1FD1 ^ 0x1FE8;
        a_0.F[0x2729 ^ 0x260A] = 0x2ACF ^ 0x260A;
        a_0.F[0xEE55 ^ 0xEEF6] = 0xEE8C ^ 0xEEF6;
        a_0.F[0xBB79 ^ 0xBB53] = 0xBB69 ^ 0xBB53;
        a_0.F[0xB3BC ^ 0xB30E] = 0xFFFF4C91 ^ 0xB30E;
        a_0.F[0x50CF ^ 0x5022] = 0x5032 ^ 0x5022;
        a_0.F[0x4D29 ^ 0x4DAA] = 0x4D97 ^ 0x4DAA;
        a_0.F[0xB035 ^ 0xB097] = 0xB0DC ^ 0xB097;
        a_0.F[0xBFB8 ^ 0xBEEB] = 0x4425 ^ 0xBEEB;
        a_0.F[0x529A ^ 0x5310] = 0x2FD7 ^ 0x5310;
        a_0.F[0x8A34 ^ 0x8A39] = 0x8A2B ^ 0x8A39;
        a_0.F[0xA0A5 ^ 0xA1E1] = 0xFFFFAB0D ^ 0xA1E1;
        a_0.F[0x6C90 ^ 0x6DE6] = 0x88FF ^ 0x6DE6;
        a_0.F[0xE522 ^ 0xE54F] = 0xE55D ^ 0xE54F;
        a_0.F[0x6899 ^ 0x6818] = 0xFFFF97A4 ^ 0x6818;
        a_0.F[0xB2B3 ^ 0xB23C] = 0xB215 ^ 0xB23C;
        a_0.F[0x4FCA ^ 0x4F65] = 0x4F02 ^ 0x4F65;
        a_0.F[0x109E6 ^ 0x108E6] = 0xFFFEF716 ^ 0x108E6;
        a_0.F[0xC9F7 ^ 0xC9FB] = 0xC9F0 ^ 0xC9FB;
        a_0.F[0x6037 ^ 0x604A] = 0xFFFF9FCE ^ 0x604A;
        a_0.F[0xD814 ^ 0xD903] = 0xC5D5 ^ 0xD903;
        a_0.F[0x9FF8 ^ 0x9ED2] = 0xB103 ^ 0x9ED2;
        a_0.F[0xEED6 ^ 0xEFD1] = 0xEF96 ^ 0xEFD1;
        a_0.F[0x9FC6 ^ 0x9F14] = 0xFFFF60DE ^ 0x9F14;
        a_0.F[0xF3D0 ^ 0xF3FC] = 0xF3A2 ^ 0xF3FC;
        a_0.F[0x23EE ^ 0x22DA] = 0xF9C6 ^ 0x22DA;
        a_0.F[0xE13F ^ 0xE16B] = 0xFFFF1ECC ^ 0xE16B;
        a_0.F[0xF7E9 ^ 0xF777] = 0xF739 ^ 0xF777;
        a_0.F[0x1459 ^ 0x15D9] = 0xAE01 ^ 0x15D9;
        a_0.F[0xB90F ^ 0xB9DA] = 0xFFFF4640 ^ 0xB9DA;
        a_0.F[0x98B0 ^ 0x98A0] = 0xFFFF677F ^ 0x98A0;
        a_0.F[0xCC4B ^ 0xCD25] = 0xF3D2 ^ 0xCD25;
        a_0.F[0x7B8B ^ 0x7BBF] = 0x7B85 ^ 0x7BBF;
        a_0.F[0xFC80 ^ 0xFC06] = 0xFFFF0390 ^ 0xFC06;
        a_0.F[0x5D23 ^ 0x5C7A] = 0x6326 ^ 0x5C7A;
        a_0.F[0x730D ^ 0x7388] = 0x738D ^ 0x7388;
        a_0.F[0xF252 ^ 0xF367] = 0x286B ^ 0xF367;
        a_0.F[0x8E2D ^ 0x8E3C] = 0xFFFF719A ^ 0x8E3C;
        a_0.F[0x7BBA ^ 0x7B1D] = 0x7B12 ^ 0x7B1D;
        a_0.F[0xB20E ^ 0xB201] = 0xB243 ^ 0xB201;
        a_0.F[0x7D3C ^ 0x7DC0] = 0x7DC2 ^ 0x7DC0;
        a_0.F[0x4ECB ^ 0x4EFA] = 0xFFFFB109 ^ 0x4EFA;
        a_0.F[0x23ED ^ 0x23CB] = 0xFFFFDC71 ^ 0x23CB;
        a_0.F[0xEBDE ^ 0xEBC2] = 0xFFFF141D ^ 0xEBC2;
        a_0.F[0xD458 ^ 0xD43A] = 0xD417 ^ 0xD43A;
        a_0.F[0x168 ^ 0x1DC] = 0xFFFFFE34 ^ 0x1DC;
        a_0.F[0xE039 ^ 0xE031] = 0xFFFF1FD1 ^ 0xE031;
        a_0.F[0xE966 ^ 0xE876] = 0xE52C ^ 0xE876;
        a_0.F[0x10CC3 ^ 0x10DCC] = 0x10DCC ^ 0x10DCC;
        a_0.F[0x9BF1 ^ 0x9B1E] = 0x9B5E ^ 0x9B1E;
        a_0.F[0xC1B4 ^ 0xC18F] = 0xFFFF3E59 ^ 0xC18F;
        a_0.F[0x9DA5 ^ 0x9DC9] = 0x9CB2 ^ 0x9DC9;
        a_0.F[0x976F ^ 0x965E] = 0x6E12 ^ 0x965E;
        a_0.F[0xCE83 ^ 0xCFB4] = 0xC416 ^ 0xCFB4;
        a_0.F[0x2042 ^ 0x2089] = 0xA734 ^ 0x2089;
        a_0.F[0xC99C ^ 0xC8AC] = 0x30E5 ^ 0xC8AC;
        a_0.F[0x6637 ^ 0x66AF] = 0xFFFF993F ^ 0x66AF;
        a_0.F[0xB9A ^ 0xBD1] = 0xFFFFF41F ^ 0xBD1;
        a_0.F[0x8DCC ^ 0x8DF6] = 0xFFFF724E ^ 0x8DF6;
        a_0.F[0x4889 ^ 0x488D] = 0xFFFFB703 ^ 0x488D;
        a_0.F[0xF8D7 ^ 0xF952] = 0x5CD9 ^ 0xF952;
        a_0.F[0xAD23 ^ 0xAD83] = 0xFFFF522D ^ 0xAD83;
        a_0.F[0xAEA2 ^ 0xAE47] = 0xAE35 ^ 0xAE47;
        a_0.F[0xA9F8 ^ 0xA9B7] = 0xA9F4 ^ 0xA9B7;
        a_0.F[0x10607 ^ 0x10675] = 0xFFFEF998 ^ 0x10675;
        a_0.F[0xE5B3 ^ 0xE571] = 0x201 ^ 0xE571;
        a_0.F[0xF09C ^ 0xF0AF] = 0xFFFF0F45 ^ 0xF0AF;
        a_0.F[0x4C9 ^ 0x419] = 0x461 ^ 0x419;
        a_0.F[0xA31 ^ 0xAC8] = 0xFFFFF505 ^ 0xAC8;
        a_0.F[0xDB35 ^ 0xDB3F] = 0xFFFF24B3 ^ 0xDB3F;
        a_0.F[0xF0B0 ^ 0xF1AE] = 0x507F ^ 0xF1AE;
        a_0.F[0xEF18 ^ 0xEE22] = 0xBF1B ^ 0xEE22;
        a_0.F[0x8D52 ^ 0x8DBE] = 0xFFFF7218 ^ 0x8DBE;
        a_0.F[0x10353 ^ 0x103B0] = 0xFFFEFC2E ^ 0x103B0;
        a_0.F[0x77CE ^ 0x76E8] = 0x903B ^ 0x76E8;
        a_0.F[0xEBB2 ^ 0xEB6D] = 0xEB79 ^ 0xEB6D;
        a_0.F[0xEBFF ^ 0xEB43] = 0xEB42 ^ 0xEB43;
        a_0.F[0x2EFC ^ 0x2F81] = 0x9457 ^ 0x2F81;
        a_0.F[0xDD5A ^ 0xDC43] = 0xC095 ^ 0xDC43;
        a_0.F[0x5E4C ^ 0x5E7B] = 0xFFFFA1E5 ^ 0x5E7B;
        a_0.F[0xA861 ^ 0xA8A2] = 0x30B2 ^ 0xA8A2;
        a_0.F[0xFA22 ^ 0xFB2A] = 0xFFFF04E5 ^ 0xFB2A;
        a_0.F[0x10E4A ^ 0x10EDF] = 0x10E9B ^ 0x10EDF;
        a_0.F[0x8195 ^ 0x8167] = 0xFFFF7EC7 ^ 0x8167;
        a_0.F[0x40BB ^ 0x4027] = 0xFFFFBFB6 ^ 0x4027;
        a_0.F[0x6633 ^ 0x667D] = 0x759A ^ 0x667D;
        a_0.F[0xEC81 ^ 0xEDD4] = 0x6D84 ^ 0xEDD4;
        a_0.F[0x862B ^ 0x86EC] = 0x6E54 ^ 0x86EC;
        a_0.F[0xE7F1 ^ 0xE6F8] = 0xE6EC ^ 0xE6F8;
        a_0.F[0xA357 ^ 0xA351] = 0xA32C ^ 0xA351;
        a_0.F[0x2FE6 ^ 0x2F81] = 0xFFFFD02D ^ 0x2F81;
        a_0.F[0x2740 ^ 0x27BD] = 0xFFFFD81E ^ 0x27BD;
        a_0.F[0x39FE ^ 0x399B] = 0x3980 ^ 0x399B;
        a_0.F[0x133C ^ 0x1337] = 0x136D ^ 0x1337;
        a_0.F[0x6F3 ^ 0x6D4] = 0xFFFFF956 ^ 0x6D4;
        a_0.F[0xB4FD ^ 0xB44D] = 0xB461 ^ 0xB44D;
        a_0.F[0xE11E ^ 0xE1F9] = 0xE1F8 ^ 0xE1F9;
        a_0.F[0x6A3D ^ 0x6BB4] = 0x1764 ^ 0x6BB4;
        a_0.F[0x2802 ^ 0x284A] = 0xFFFFD79B ^ 0x284A;
        a_0.F[0x5007 ^ 0x50C2] = 0x6BA5 ^ 0x50C2;
        a_0.F[0x6DE4 ^ 0x6D2B] = 0xFFFF92D7 ^ 0x6D2B;
        a_0.F[0x36B9 ^ 0x379D] = 0xFFFFC4D5 ^ 0x379D;
        a_0.F[0x5820 ^ 0x58FA] = 0xFFFFA769 ^ 0x58FA;
        a_0.F[0x26DA ^ 0x26BA] = 0x269F ^ 0x26BA;
        a_0.F[0x4D33 ^ 0x4D4B] = 0xFFFFB2EA ^ 0x4D4B;
        a_0.F[0x1078B ^ 0x10694] = 0x1A740 ^ 0x10694;
        a_0.F[0x9C7C ^ 0x9CC5] = 0xFFFF6317 ^ 0x9CC5;
        a_0.F[0x376B ^ 0x364A] = 0x979E ^ 0x364A;
        a_0.F[0x446 ^ 0x4F8] = 0x4FA ^ 0x4F8;
        a_0.F[0x8C4 ^ 0x87C] = 0xFFFFF7F2 ^ 0x87C;
        a_0.F[0xB186 ^ 0xB158] = 0xB129 ^ 0xB158;
        a_0.F[0xA65C ^ 0xA6B5] = 0xFFFF5962 ^ 0xA6B5;
        a_0.F[0x9EED ^ 0x9FA7] = 0xD44C ^ 0x9FA7;
        a_0.F[0x9169 ^ 0x914D] = 0xFFFF6E09 ^ 0x914D;
        a_0.F[0xC7B1 ^ 0xC6F9] = 0xFFFFE864 ^ 0xC6F9;
        a_0.F[0xF05 ^ 0xFE3] = 0xFFFFF037 ^ 0xFE3;
        a_0.F[0x669B ^ 0x6665] = 0xFFFF99AE ^ 0x6665;
        a_0.F[0x3496 ^ 0x34A6] = 0x348D ^ 0x34A6;
        a_0.F[0x1371 ^ 0x1300] = 0x1338 ^ 0x1300;
        a_0.F[0x321A ^ 0x325E] = 0xFFFFCDA8 ^ 0x325E;
        a_0.F[0x7A87 ^ 0x7BB4] = 0xA0B8 ^ 0x7BB4;
        a_0.F[0x9F70 ^ 0x9F49] = 0xFFFF60BB ^ 0x9F49;
        a_0.F[0x10D24 ^ 0x10DAD] = 0x10D94 ^ 0x10DAD;
        a_0.F[0x23E7 ^ 0x2331] = 0xFFFFDCE5 ^ 0x2331;
        a_0.F[0x8AFC ^ 0x8AAB] = 0x8AD7 ^ 0x8AAB;
        a_0.F[0x1B46 ^ 0x1B70] = 0xFFFFE4D5 ^ 0x1B70;
        a_0.F[0x3CD3 ^ 0x3DFE] = 0x122B ^ 0x3DFE;
        a_0.F[0x8CB8 ^ 0x8D85] = 0xDCBA ^ 0x8D85;
        a_0.F[0x327C ^ 0x336F] = 0xEA9D ^ 0x336F;
        a_0.F[0x3415 ^ 0x3481] = 0xFFFFCB6D ^ 0x3481;
        a_0.F[0xB245 ^ 0xB377] = 0x6874 ^ 0xB377;
        a_0.F[0x4D3F ^ 0x4C67] = 0xCC3B ^ 0x4C67;
        a_0.F[0x7BBD ^ 0x7AF1] = 0x3116 ^ 0x7AF1;
        a_0.F[0xD095 ^ 0xD081] = 0xD0CF ^ 0xD081;
        a_0.F[0x797E ^ 0x785C] = 0x7499 ^ 0x785C;
        a_0.F[0x754 ^ 0x720] = 0x70D ^ 0x720;
        a_0.F[0x4B16 ^ 0x4A5D] = 0x1BF ^ 0x4A5D;
        a_0.F[0x645E ^ 0x6544] = 0xFC49 ^ 0x6544;
        a_0.F[0x640C ^ 0x6524] = 0x8380 ^ 0x6524;
        a_0.F[0x5B0B ^ 0x5A55] = 0xD7D6 ^ 0x5A55;
        a_0.F[0x761A ^ 0x76DE] = 0x3408 ^ 0x76DE;
        a_0.F[0xFAE ^ 0xF93] = 0xFD4 ^ 0xF93;
        a_0.F[0x6E42 ^ 0x6F0F] = 0x24ED ^ 0x6F0F;
        a_0.F[0x1072D ^ 0x107B0] = 0xFFFEF865 ^ 0x107B0;
        a_0.F[0x5B10 ^ 0x5BAD] = 0x5BAD ^ 0x5BAD;
        a_0.F[0x3BFD ^ 0x3BFA] = 0x3BB9 ^ 0x3BFA;
        a_0.F[0x43F4 ^ 0x439D] = 0x4330 ^ 0x439D;
        a_0.F[0x536B ^ 0x5211] = 0xD49A ^ 0x5211;
        a_0.F[0x300B ^ 0x30B4] = 0x30B4 ^ 0x30B4;
        a_0.F[0xED48 ^ 0xED4B] = 0xED80 ^ 0xED4B;
        a_0.F[0x83D8 ^ 0x8391] = 0x83B3 ^ 0x8391;
        a_0.F[0x9D61 ^ 0x9DC7] = 0xFFFF6248 ^ 0x9DC7;
        a_0.F[0xE023 ^ 0xE0B2] = 0xE08F ^ 0xE0B2;
        a_0.F[0x10D29 ^ 0x10DDD] = 0xFFFEF20D ^ 0x10DDD;
        a_0.F[0x7CE0 ^ 0x7CB2] = 0x7CC3 ^ 0x7CB2;
        a_0.F[0xC80A ^ 0xC961] = 0x2832 ^ 0xC961;
        a_0.F[0x38D6 ^ 0x3816] = 0x3816 ^ 0x3816;
        a_0.F[0xFEEC ^ 0xFFB7] = 0xFFFF3F71 ^ 0xFFB7;
        a_0.F[0x161C ^ 0x1602] = 0x1668 ^ 0x1602;
        a_0.F[0xC017 ^ 0xC00D] = 0xFFFF3FB9 ^ 0xC00D;
        a_0.F[0x83C1 ^ 0x8370] = 0x8316 ^ 0x8370;
        a_0.F[0xDAD4 ^ 0xDA93] = 0xDACB ^ 0xDA93;
        a_0.F[0x103EC ^ 0x1039F] = 0x103DF ^ 0x1039F;
        a_0.F[0xA0C3 ^ 0xA194] = 0xFFFFDE76 ^ 0xA194;
        a_0.F[0x27C7 ^ 0x2729] = 0xFFFFD88F ^ 0x2729;
        a_0.F[0x1E9A ^ 0x1E11] = 0x1E22 ^ 0x1E11;
        a_0.F[0x981E ^ 0x988E] = 0x98FC ^ 0x988E;
        a_0.F[0x6520 ^ 0x6556] = 0xFFFF9A8B ^ 0x6556;
        a_0.F[0xC61A ^ 0xC74E] = 0x3DA0 ^ 0xC74E;
        a_0.F[0x830C ^ 0x8202] = 0x8203 ^ 0x8202;
        a_0.F[0xC329 ^ 0xC38D] = 0xFFFF3C3C ^ 0xC38D;
        a_0.F[0x2DF2 ^ 0x2DAA] = 0xFFFFD221 ^ 0x2DAA;
        a_0.F[0xA16D ^ 0xA1EF] = 0xFFFF5E62 ^ 0xA1EF;
        a_0.F[0xBB76 ^ 0xBB35] = 0xBB61 ^ 0xBB35;
        a_0.F[0x4819 ^ 0x496B] = 0xD8C0 ^ 0x496B;
        a_0.F[0x9CD1 ^ 0x9CCC] = 0x9CD1 ^ 0x9CCC;
        a_0.F[0xDF06 ^ 0xDE6A] = 0x3F26 ^ 0xDE6A;
        a_0.F[0xCD37 ^ 0xCD80] = 0xCD40 ^ 0xCD80;
        a_0.F[0x57B8 ^ 0x576F] = 0x57F1 ^ 0x576F;
        a_0.F[0x70BC ^ 0x71EA] = 0xF1B6 ^ 0x71EA;
        a_0.F[0x6546 ^ 0x65FC] = 0x65FF ^ 0x65FC;
        a_0.F[0x1094 ^ 0x105E] = 0xD962 ^ 0x105E;
        a_0.F[0x7F5E ^ 0x7ED6] = 0xDB5E ^ 0x7ED6;
        a_0.F[0x2818 ^ 0x2842] = 0x2875 ^ 0x2842;
        a_0.F[0x9DB6 ^ 0x9C9F] = 0x7A41 ^ 0x9C9F;
        a_0.F[0xE906 ^ 0xE907] = 0xE934 ^ 0xE907;
        a_0.F[0x31AB ^ 0x30C8] = 0x87D5 ^ 0x30C8;
        a_0.F[0x8154 ^ 0x8058] = 0x8058 ^ 0x8058;
        a_0.F[0xD064 ^ 0xD02E] = 0xFFFF2F8F ^ 0xD02E;
        a_0.F[0xDD80 ^ 0xDD71] = 0xDD6A ^ 0xDD71;
        a_0.F[0x8A45 ^ 0x8A08] = 0xFFFF75B3 ^ 0x8A08;
        a_0.F[0xA4F7 ^ 0xA4F9] = 0xA4C4 ^ 0xA4F9;
        a_0.F[0x3AEC ^ 0x3B83] = 0xFFFFFAA5 ^ 0x3B83;
        a_0.F[0xC153 ^ 0xC1A8] = 0xFFFF3E69 ^ 0xC1A8;
        a_0.F[0xE3CB ^ 0xE39D] = 0xE3E7 ^ 0xE39D;
        a_0.F[0x9B8F ^ 0x9BE0] = 0xFFFF6429 ^ 0x9BE0;
        a_0.F[0x8246 ^ 0x82D0] = 0x83D3 ^ 0x82D0;
        a_0.F[0xF4B ^ 0xF79] = 0xF47 ^ 0xF79;
        a_0.F[0xA981 ^ 0xA918] = 0xFFFF56BE ^ 0xA918;
        a_0.F[0x5B93 ^ 0x5BC0] = 0xFFFFA404 ^ 0x5BC0;
        a_0.F[0xA76D ^ 0xA62D] = 0xFFFF24B0 ^ 0xA62D;
        a_0.F[0x37F3 ^ 0x3722] = 0x37BD ^ 0x3722;
        a_0.F[0xA78 ^ 0xB6D] = 0xD29F ^ 0xB6D;
        a_0.F[0x2C7F ^ 0x2D1E] = 0x9A76 ^ 0x2D1E;
        a_0.F[0xEA7A ^ 0xEA23] = 0xEA26 ^ 0xEA23;
        a_0.F[0x3B92 ^ 0x3B89] = 0x3BD7 ^ 0x3B89;
        a_0.F[0x22A0 ^ 0x22C8] = 0xFFFFDD18 ^ 0x22C8;
        a_0.F[0x57EB ^ 0x5711] = 0x574C ^ 0x5711;
        a_0.F[0xAB85 ^ 0xAB76] = 0xAB26 ^ 0xAB76;
        a_0.F[0x920A ^ 0x9273] = 0x9260 ^ 0x9273;
        a_0.F[0xBD5 ^ 0xBF7] = 0xFFFFF403 ^ 0xBF7;
        a_0.F[0xF4F7 ^ 0xF597] = 0x7814 ^ 0xF597;
        a_0.F[0xF6E5 ^ 0xF7C5] = 0x5639 ^ 0xF7C5;
        a_0.F[0xBFF1 ^ 0xBF5D] = 0xBF2F ^ 0xBF5D;
        a_0.F[0xDDA0 ^ 0xDCCD] = 0xE238 ^ 0xDCCD;
        a_0.F[0x5DAD ^ 0x5C93] = 0x21DC ^ 0x5C93;
        a_0.F[0x5389 ^ 0x530E] = 0xFFFFACB8 ^ 0x530E;
        a_0.F[0xAEB0 ^ 0xAF34] = 0x9ED2 ^ 0xAF34;
        a_0.F[0xED1A ^ 0xEDEC] = 0xED89 ^ 0xEDEC;
        a_0.F[0x2247 ^ 0x2362] = 0x2FA7 ^ 0x2362;
        a_0.F[0xC305 ^ 0xC396] = 0xFFFF3C3B ^ 0xC396;
        a_0.F[0xEE90 ^ 0xEFE7] = 0xA89 ^ 0xEFE7;
        a_0.F[0x1A3E ^ 0x1AF2] = 0xD1C ^ 0x1AF2;
        a_0.F[0x439F ^ 0x42F9] = 0xF705 ^ 0x42F9;
        a_0.F[0xED10 ^ 0xEDF4] = 0xEDE4 ^ 0xEDF4;
        a_0.F[0x709F ^ 0x706A] = 0x7014 ^ 0x706A;
        a_0.F[0x68E9 ^ 0x6899] = 0x68E9 ^ 0x6899;
        a_0.F[0xC790 ^ 0xC76F] = 0xFFFF38D4 ^ 0xC76F;
        a_0.F[0x10A15 ^ 0x10AF4] = 0x10A94 ^ 0x10AF4;
        a_0.F[0xFFE ^ 0xF36] = 0xA75D ^ 0xF36;
        a_0.F[0x10F1 ^ 0x11B2] = 0xE4B5 ^ 0x11B2;
        a_0.F[0x10DF0 ^ 0x10DCE] = 0xFFFEF228 ^ 0x10DCE;
        a_0.F[0x5744 ^ 0x5655] = 0x5B1F ^ 0x5655;
        a_0.F[0x487 ^ 0x45A] = 0x427 ^ 0x45A;
        a_0.F[0x11F4 ^ 0x1075] = 0x2189 ^ 0x1075;
        a_0.F[0x10A92 ^ 0x10BC2] = 0x1225C ^ 0x10BC2;
        a_0.F[0x43AE ^ 0x43B6] = 0xFFFFBC79 ^ 0x43B6;
        a_0.F[0x104E3 ^ 0x104F4] = 0x104FB ^ 0x104F4;
        a_0.F[0x7964 ^ 0x7966] = 0xFFFF86CD ^ 0x7966;
        a_0.F[0x6692 ^ 0x67FB] = 0x86A1 ^ 0x67FB;
        a_0.F[0xA668 ^ 0xA716] = 0x1CCE ^ 0xA716;
        a_0.F[0x9787 ^ 0x97ED] = 0x97BB ^ 0x97ED;
        a_0.F[0xCF6B ^ 0xCEE6] = 0x57DB ^ 0xCEE6;
        a_0.F[0xC3BD ^ 0xC23F] = 0xF3D9 ^ 0xC23F;
        a_0.F[0x7604 ^ 0x7604] = 0x766C ^ 0x7604;
        a_0.F[0xDD71 ^ 0xDD2D] = 0xDD4A ^ 0xDD2D;
        a_0.F[0x51EA ^ 0x5196] = 0x51D7 ^ 0x5196;
        a_0.F[0x30EA ^ 0x309D] = 0x30EB ^ 0x309D;
        a_0.F[0x690E ^ 0x6815] = 0xF116 ^ 0x6815;
        a_0.F[0x512D ^ 0x51B6] = 0xFFFFAE64 ^ 0x51B6;
        a_0.F[0xF996 ^ 0xF9ED] = 0xFFFF06AB ^ 0xF9ED;
        a_0.F[0xE4EB ^ 0xE59B] = 0xDB6C ^ 0xE59B;
        a_0.F[0x100E9 ^ 0x1018E] = 0x1B404 ^ 0x1018E;
        a_0.F[0x27D8 ^ 0x27CB] = 0x27A9 ^ 0x27CB;
        a_0.F[0x9FAF ^ 0x9FEE] = 0xFFFF606F ^ 0x9FEE;
        a_0.F[0xE3FD ^ 0xE2DA] = 0x404 ^ 0xE2DA;
        a_0.F[0xF38F ^ 0xF3EE] = 0xF3DC ^ 0xF3EE;
        a_0.F[0x246D ^ 0x25E1] = 0x5926 ^ 0x25E1;
        a_0.F[0xA6F ^ 0xB72] = 0x9271 ^ 0xB72;
        a_0.F[0x1905 ^ 0x19EF] = 0xFFFFE622 ^ 0x19EF;
        a_0.F[0x5918 ^ 0x590A] = 0xFFFFA6F6 ^ 0x590A;
        a_0.F[0x2169 ^ 0x21C7] = 0xFFFFDE22 ^ 0x21C7;
        a_0.F[0xC7B ^ 0xC44] = 0xFFFFF3BD ^ 0xC44;
        a_0.F[0x14E6 ^ 0x1479] = 0x14B7 ^ 0x1479;
        a_0.F[0x5A70 ^ 0x5AA4] = 0x5AFE ^ 0x5AA4;
        a_0.F[0xC770 ^ 0xC6F6] = 0x637E ^ 0xC6F6;
        a_0.F[0x7B2F ^ 0x7A6A] = 0x8F6D ^ 0x7A6A;
        a_0.F[0xDBB4 ^ 0xDBE4] = 0xDBC8 ^ 0xDBE4;
        a_0.F[0x2C48 ^ 0x2CA0] = 0xFFFFD353 ^ 0x2CA0;
        a_0.F[0xFF0F ^ 0xFE17] = 0xE2BE ^ 0xFE17;
        a_0.F[0x1AA4 ^ 0x1B8F] = 0x345A ^ 0x1B8F;
        a_0.F[0xC822 ^ 0xC807] = 0xFFFF37AD ^ 0xC807;
        a_0.F[0x91B4 ^ 0x919F] = 0xFFFF6E17 ^ 0x919F;
        a_0.F[0x6E1 ^ 0x7E5] = 0x7D0 ^ 0x7E5;
        a_0.F[0xE065 ^ 0xE04A] = 0xFFFF1FE9 ^ 0xE04A;
        a_0.F[0x6F32 ^ 0x6F0A] = 0xFFFF90EF ^ 0x6F0A;
    }
}


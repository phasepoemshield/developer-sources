/*
 * Decompiled with CFR 0.152.
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
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.friend.FriendManager;
import kotakbaz.rain.friend.b_0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\n \u001b*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#RT\u0010&\u001aB\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u001b*\u0004\u0018\u00010%0% \u001b* \u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u001b*\u0004\u0018\u00010%0%\u0018\u00010$0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'RT\u0010(\u001aB\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u001b*\u0004\u0018\u00010%0% \u001b* \u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u001b*\u0004\u0018\u00010%0%\u0018\u00010$0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+\u00a8\u0006,"}, d2={"Lkotakbaz/rain/friend/FriendSkinResolver;", "", "<init>", "()V", "Lkotakbaz/rain/friend/FriendManager$FriendEntry;", "friend", "Lnet/minecraft/class_2960;", "resolveTexture", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;)Lnet/minecraft/class_2960;", "", "name", "(Ljava/lang/String;)Lnet/minecraft/class_2960;", "", "requestSkin", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;)V", "clear", "clearAll", "normalizedName", "loadSkin", "(Lkotakbaz/rain/friend/FriendManager$FriendEntry;Ljava/lang/String;)V", "Ljava/util/UUID;", "resolveUUID", "(Ljava/lang/String;)Ljava/util/UUID;", "fetchOnlineUUID", "offlineUUID", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "fallbackTexture", "Lnet/minecraft/class_2960;", "Ljava/util/concurrent/atomic/AtomicInteger;", "skinThreadCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/ExecutorService;", "skinExecutor", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "", "loadingSkins", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "failedSkins", "Ljava/util/concurrent/ConcurrentHashMap;", "uuidCache", "Ljava/util/concurrent/ConcurrentHashMap;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFriendSkinResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendSkinResolver.kt\nkotakbaz/rain/friend/FriendSkinResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,179:1\n1#2:180\n1#2:185\n1915#3,2:181\n72#4,2:183\n*S KotlinDebug\n*F\n+ 1 FriendSkinResolver.kt\nkotakbaz/rain/friend/FriendSkinResolver\n*L\n127#1:185\n69#1:181,2\n127#1:183,2\n*E\n"})
public final class FriendSkinResolver {
    @NotNull
    public static final FriendSkinResolver INSTANCE;
    private static final Identifier a;
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

    private FriendSkinResolver() {
    }

    @NotNull
    public final Identifier resolveTexture(@NotNull b_0 friend) {
        long l2 = 3252540959382690316L;
        int n2 = F[0];
        n2 ^= F[1];
        Intrinsics.checkNotNullParameter(friend, (String)d[n2 += F[2]]);
        Identifier identifier = friend.getSkinTexture();
        if (identifier != null) {
            Identifier identifier2 = identifier;
            long l3 = l2;
            int n3 = F[3];
            n3 += F[4];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= F[5]);
            return identifier2;
        }
        this.requestSkin(friend);
        Identifier identifier3 = a;
        int n4 = F[6];
        n4 -= F[7];
        Intrinsics.checkNotNullExpressionValue(identifier3, (String)d[n4 += F[8]]);
        return identifier3;
    }

    @NotNull
    public final Identifier resolveTexture(@NotNull String name) {
        b_0 b_02;
        block3: {
            block2: {
                long l2 = -1482169327922540730L;
                int n2 = F[9];
                n2 -= F[10];
                Intrinsics.checkNotNullParameter(name, (String)d[n2 ^= F[11]]);
                b_02 = FriendManager.INSTANCE.getFriend(name);
                if (b_02 == null) break block2;
                b_0 b_03 = b_02;
                long l3 = l2;
                int n3 = F[12];
                n3 += F[13];
                l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= F[14]);
                Identifier identifier = this.resolveTexture(b_03);
                b_02 = identifier;
                if (identifier != null) break block3;
            }
            Identifier identifier = a;
            b_02 = identifier;
            int n4 = F[15];
            n4 -= F[16];
            Intrinsics.checkNotNullExpressionValue(identifier, (String)d[n4 += F[17]]);
        }
        return b_02;
    }

    public final void requestSkin(@NotNull b_0 friend) {
        int n2 = F[18];
        n2 += F[19];
        Intrinsics.checkNotNullParameter(friend, (String)d[n2 -= F[20]]);
        String string = this.normalize(friend.getName());
        if (friend.getSkinTexture() != null) {
            return;
        }
        if (c.contains(string)) {
            return;
        }
        if (!B.add(string)) {
            return;
        }
        b.execute(() -> FriendSkinResolver.requestSkin$lambda$0(friend, string));
    }

    public final void clear(@NotNull b_0 friend) {
        int n2 = F[21];
        n2 ^= F[22];
        Intrinsics.checkNotNullParameter(friend, (String)d[n2 += F[23]]);
        String string = this.normalize(friend.getName());
        B.remove(string);
        c.remove(string);
        friend.setSkinTexture(null);
    }

    public final void clearAll() {
        long l2 = 1869695010113994859L;
        B.clear();
        c.clear();
        Iterable iterable = FriendManager.INSTANCE.getFriends();
        long l3 = l2;
        int n2 = F[24];
        n2 -= F[25];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 -= F[26]);
        for (Object t2 : iterable) {
            String string = (String)t2;
            long l4 = l2;
            int n3 = F[27];
            n3 += F[28];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 -= F[29]);
            b_0 b_02 = FriendManager.INSTANCE.getFriend(string);
            if (b_02 == null) continue;
            b_02.setSkinTexture(null);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void loadSkin(b_0 friend, String normalizedName) {
        ProfileResult profileResult;
        SkinTextures skinTextures;
        long l2;
        block8: {
            SkinTextures skinTextures2;
            long l3 = -2512313172975887353L;
            l2 = -3013188772171691490L;
            String string = friend.getName();
            long l4 = l2;
            int n2 = F[30];
            n2 ^= F[31];
            l2 = l4 ^ (0L ^ l4) & -1L << (n2 -= F[32]);
            UUID uUID = this.resolveUUID(string);
            skinTextures = DefaultSkinHelper.getSkinTextures((UUID)uUID);
            boolean bl = F[33];
            bl -= F[34];
            ProfileResult profileResult2 = kotakbaz.rain.client.extensions.b.getMc().getSessionService().fetchProfile(uUID, bl -= F[35]);
            if (profileResult2 == null || (profileResult2 = profileResult2.profile()) == null) {
                profileResult2 = profileResult = new GameProfile(uUID, string);
            }
            if ((skinTextures2 = kotakbaz.rain.client.extensions.b.getMc().getSkinProvider().getSkinTextures((GameProfile)profileResult, skinTextures)) == null || Intrinsics.areEqual(skinTextures2.texture(), skinTextures.texture())) break block8;
            friend.setSkinTexture(skinTextures2.texture());
            B.remove(normalizedName);
            return;
        }
        try {
            CompletableFuture completableFuture = kotakbaz.rain.client.extensions.b.getMc().getSkinProvider().fetchSkinTextures((GameProfile)profileResult);
            long l5 = l2;
            int n3 = F[36];
            n3 -= F[37];
            l2 = l5 ^ (0x100000000L ^ l5) & -1L << (n3 ^= F[38]);
            completableFuture.whenComplete((arg_0, arg_1) -> FriendSkinResolver.loadSkin$lambda$1((arg_0, arg_1) -> FriendSkinResolver.loadSkin$lambda$0(skinTextures, friend, normalizedName, arg_0, arg_1), arg_0, arg_1));
        }
        catch (Exception exception) {
            try {
                exception.printStackTrace();
                c.add(normalizedName);
            }
            catch (Throwable throwable) {
                int n4 = F[42];
                n4 += F[43];
                if ((int)(l2 >>> (n4 += F[44])) == 0) {
                    B.remove(normalizedName);
                }
                throw throwable;
            }
            int n5 = F[39];
            n5 ^= F[40];
            if ((int)(l2 >>> (n5 ^= F[41])) == 0) {
                B.remove(normalizedName);
            }
        }
    }

    @NotNull
    public final UUID resolveUUID(@NotNull String name) {
        long l2 = 3821649935960675908L;
        long l3 = 5209126498739193226L;
        long l4 = -4447518386991908670L;
        int n2 = F[45];
        n2 ^= F[46];
        Intrinsics.checkNotNullParameter(name, (String)d[n2 ^= F[47]]);
        String string = this.normalize(name);
        ConcurrentMap concurrentMap = C;
        String string2 = string;
        long l5 = l3;
        int n3 = F[48];
        n3 += F[49];
        l3 = l5 ^ (0L ^ l5) & -1L << (n3 ^= F[50]);
        Object object = concurrentMap.get(string2);
        if (object == null) {
            UUID uUID;
            Object object2;
            long l6 = l3;
            int n4 = F[51];
            n4 ^= F[52];
            l3 = l6 ^ (0L ^ l6) & -1L >>> (n4 ^= F[53]);
            Object object3 = INSTANCE;
            try {
                object2 = object3;
                long l7 = l4;
                int n5 = F[54];
                n5 ^= F[55];
                l4 = l7 ^ (0L ^ l7) & -1L << (n5 += F[56]);
                object2 = Result.cfr_renamed_1(super.fetchOnlineUUID(name));
            }
            catch (Throwable throwable) {
                object2 = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
            }
            object3 = object2;
            Throwable throwable = Result.cfr_renamed_2(object3);
            if (throwable != null) {
                Object object4 = object2 = throwable;
                long l8 = l4;
                int n6 = F[57];
                n6 ^= F[58];
                l4 = l8 ^ (0L ^ l8) & -1L >>> (n6 += F[59]);
                ((Throwable)object4).printStackTrace();
            }
            if ((uUID = (UUID)(Result.cfr_renamed_3(object3) ? null : object3)) == null) {
                uUID = INSTANCE.offlineUUID(name);
            }
            UUID uUID2 = uUID;
            long l9 = l2;
            int n7 = F[60];
            n7 -= F[61];
            l2 = l9 ^ (0L ^ l9) & -1L << (n7 ^= F[62]);
            object = concurrentMap.putIfAbsent(string2, uUID2);
            if (object == null) {
                object = uUID2;
            }
        }
        int n8 = F[63];
        n8 ^= F[64];
        Intrinsics.checkNotNullExpressionValue(object, (String)d[n8 -= F[65]]);
        return (UUID)object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final UUID fetchOnlineUUID(String name) {
        String string;
        long l2 = 5681877770131407593L;
        long l3 = -6157076014808460089L;
        String string2 = string = URLEncoder.encode(name, StandardCharsets.UTF_8);
        int n2 = F[66];
        n2 += F[67];
        int n3 = F[69];
        n3 -= F[70];
        Object object = new URI((String)d[n2 += F[68]] + (String)d[n3 ^= F[71]] + string2).toURL().openConnection();
        int n4 = F[72];
        n4 -= F[73];
        int n5 = F[75];
        n5 += F[76];
        Intrinsics.checkNotNull(object, (String)d[n4 -= F[74]] + (String)d[n5 -= F[77]]);
        HttpURLConnection httpURLConnection = (HttpURLConnection)object;
        try {
            Object object2;
            int n6;
            int n7 = F[78];
            n7 -= F[79];
            httpURLConnection.setConnectTimeout(n7 ^= F[80]);
            int n8 = F[81];
            n8 += F[82];
            httpURLConnection.setReadTimeout(n8 ^= F[83]);
            int n9 = F[84];
            n9 += F[85];
            int n10 = F[87];
            n10 += F[88];
            int n11 = F[90];
            n11 -= F[91];
            httpURLConnection.setRequestProperty((String)d[n9 += F[86]], (String)d[n10 ^= F[89]] + (String)d[n11 ^= F[92]]);
            int n12 = F[93];
            n12 ^= F[94];
            long l4 = l3;
            int n13 = F[96];
            n13 -= F[97];
            l3 = l4 ^ ((long)httpURLConnection.getResponseCode() << (n12 += F[95]) ^ l4) & -1L << (n13 += F[98]);
            int n14 = F[99];
            n14 ^= F[100];
            int n15 = F[102];
            n15 += F[103];
            if ((n14 -= F[101]) <= (int)(l3 >>> (n15 += F[104]))) {
                int n16 = F[105];
                n16 -= F[106];
                int n17 = F[108];
                n17 -= F[109];
                if ((int)(l3 >>> (n16 ^= F[107])) < (n17 += F[110])) {
                    int n18 = F[111];
                    n18 += F[112];
                    n6 = n18 ^= F[113];
                } else {
                    int n19 = F[114];
                    n19 += F[115];
                    n6 = n19 ^= F[116];
                }
            } else {
                int n20 = F[117];
                n20 += F[118];
                n6 = n20 -= F[119];
            }
            if (n6 == 0) {
                object = null;
                return object;
            }
            object = new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8);
            Throwable throwable = null;
            try {
                String string3;
                Object object3;
                Object object4;
                block22: {
                    block21: {
                        object2 = (InputStreamReader)object;
                        long l5 = l2;
                        int n21 = F[120];
                        n21 += F[121];
                        l2 = l5 ^ (0L ^ l5) & -1L >>> (n21 ^= F[122]);
                        object4 = new Gson().fromJson((Reader)object2, JsonObject.class);
                        if (object4 == null) break block21;
                        int n22 = F[123];
                        n22 += F[124];
                        object3 = ((JsonObject)object4).get((String)d[n22 -= F[125]]);
                        if (object3 != null && (string3 = ((JsonElement)object3).getAsString()) != null) break block22;
                    }
                    UUID uUID = null;
                    UUID uUID2 = uUID;
                    return uUID2;
                }
                String string4 = string3;
                object4 = string4;
                int n23 = F[126];
                n23 += F[127];
                int n24 = F[129];
                n24 ^= F[130];
                object3 = new Regex((String)d[n23 ^= F[128]] + (String)d[n24 ^= F[131]]);
                int n25 = F[132];
                n25 ^= F[133];
                string3 = (String)d[n25 ^= F[134]];
                object2 = UUID.fromString(((Regex)object3).replaceFirst((CharSequence)object4, string3));
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

    private final UUID offlineUUID(String name) {
        String string = name;
        int n2 = F[135];
        n2 ^= F[136];
        String string2 = (String)d[n2 += F[137]] + string;
        Charset charset = StandardCharsets.UTF_8;
        int n3 = F[138];
        n3 += F[139];
        Intrinsics.checkNotNullExpressionValue(charset, (String)d[n3 -= F[140]]);
        byte[] byArray = string2.getBytes(charset);
        int n4 = F[141];
        n4 -= F[142];
        Intrinsics.checkNotNullExpressionValue(byArray, (String)d[n4 ^= F[143]]);
        UUID uUID = UUID.nameUUIDFromBytes(byArray);
        int n5 = F[144];
        n5 ^= F[145];
        int n6 = F[147];
        n6 ^= F[148];
        Intrinsics.checkNotNullExpressionValue(uUID, (String)d[n5 -= F[146]] + (String)d[n6 ^= F[149]]);
        return uUID;
    }

    private final String normalize(String name) {
        String string = name;
        Locale locale = Locale.ROOT;
        int n2 = F[150];
        n2 += F[151];
        Intrinsics.checkNotNullExpressionValue(locale, (String)d[n2 += F[152]]);
        String string2 = string.toLowerCase(locale);
        int n3 = F[153];
        n3 += F[154];
        int n4 = F[156];
        n4 -= F[157];
        Intrinsics.checkNotNullExpressionValue(string2, (String)d[n3 ^= F[155]] + (String)d[n4 += F[158]]);
        return string2;
    }

    private static final Thread skinExecutor$lambda$0(Runnable runnable) {
        Thread thread;
        long l2 = -3377810645586847243L;
        long l3 = -2007675515502186257L;
        int n2 = F[159];
        n2 += F[160];
        long l4 = l2;
        int n3 = F[162];
        n3 -= F[163];
        l2 = l4 ^ ((long)A.incrementAndGet() << (n2 += F[161]) ^ l4) & -1L << (n3 -= F[164]);
        int n4 = F[165];
        n4 ^= F[166];
        int n5 = F[168];
        n5 += F[169];
        int n6 = F[171];
        n6 ^= F[172];
        Thread thread2 = thread = new Thread(runnable, (String)d[n4 += F[167]] + (String)d[n5 -= F[170]] + (int)(l2 >>> (n6 += F[173])));
        long l5 = l3;
        int n7 = F[174];
        n7 += F[175];
        l3 = l5 ^ (0L ^ l5) & -1L << (n7 -= F[176]);
        boolean bl = F[177];
        bl += F[178];
        thread2.setDaemon(bl += F[179]);
        return thread;
    }

    private static final void requestSkin$lambda$0(b_0 $friend, String $normalizedName) {
        INSTANCE.loadSkin($friend, $normalizedName);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void loadSkin$lambda$0$0(Optional $skinTextures, SkinTextures $defaultSkin, b_0 $friend, String $normalizedName) {
        try {
            if ($skinTextures != null && $skinTextures.isPresent()) {
                Identifier identifier = ((SkinTextures)$skinTextures.get()).texture();
                if (!Intrinsics.areEqual(identifier, $defaultSkin.texture())) {
                    $friend.setSkinTexture(identifier);
                } else {
                    c.add($normalizedName);
                }
            } else {
                c.add($normalizedName);
            }
        }
        finally {
            B.remove($normalizedName);
        }
    }

    private static final Unit loadSkin$lambda$0(SkinTextures $defaultSkin, b_0 $friend, String $normalizedName, Optional skinTextures, Throwable throwable) {
        Throwable throwable2 = throwable;
        if (throwable2 != null) {
            throwable2.printStackTrace();
        }
        kotakbaz.rain.client.extensions.b.getMc().execute(() -> FriendSkinResolver.loadSkin$lambda$0$0(skinTextures, $defaultSkin, $friend, $normalizedName));
        return Unit.INSTANCE;
    }

    private static final void loadSkin$lambda$1(Function2 $tmp0, Object p0, Object p1) {
        $tmp0.invoke(p0, p1);
    }

    static {
        FriendSkinResolver.b();
        long l2 = -7655316800247867681L;
        long l3 = 7613305915686535487L;
        long l4 = -1943030219286379898L;
        long l5 = -1128461984925053830L;
        long l6 = -9021098780154267163L;
        long l7 = -3585737548443495757L;
        long l8 = 2774388547085486284L;
        long l9 = -7555497313033287389L;
        long l10 = -1113700108122342446L;
        long l11 = -1495952775780565188L;
        long l12 = -6523019958519603831L;
        long l13 = 5457989599856378109L;
        long l14 = -6665536767302429965L;
        long l15 = 3944260809139767944L;
        int n2 = F[180];
        n2 ^= F[181];
        d = new Object[n2 -= F[182]];
        long l16 = l15;
        int n3 = F[183];
        n3 += F[184];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += F[185]);
        Object[] objectArray = new Object[F[186]];
        objectArray[FriendSkinResolver.F[187]] = D;
        objectArray[FriendSkinResolver.F[188]] = F[189];
        int n4 = F[190];
        Object object = FriendSkinResolver.A()[F[191]];
        if (object == null) {
            char[] cArray = "\u38e9\u29b0\u29b7\u38f2\u29a5\u2982\u38f2\u29b1\u2989\u2984\u2997\u299e\u29a7\u38ef\u29ac\u2983\u2986\u29a2\u2985\u2990\u38f4\u29a5\u38c9\u29ac\u2997\u29a1\u38f0\u299b\u388e\u2987\u2980\u2999\u29b2\u2991\u2983\u29a6\u29ad\u38f5\u38f2\u29ae\u38f4\u298a\u29be\u298a\u2992\u2988\u38f7\u38e3\u299a\u29a4\u29a6\u38f1\u38c8\u29b7\u2987\u38e8\u38ef\u29ac\u2999\u38e3\u2997\u29a1\u2985\u38f2\u2987\u2981\u2999\u2984\u29b5\u29b0\u29ae\u29bb\u2984\u2992\u298a\u2985\u388e\u29b7\u29ba\u2980\u29a7\u38cb\u298f\u29b7\u2984\u2989\u299b\u2994\u38f0\u298b\u38e9\u38f4\u29a1\u299b\u298a\u2984\u2984\u29ba\u29b1\u2992\u38f5\u2981\u298d\u299b\u29af\u2990\u2985\u38f5\u2982\u29a3\u2991\u2986\u29a5\u299e\u29ad\u29ac\u2989\u38f2\u2985\u29a3\u2992\u29a4\u29ad\u29be\u29b2\u29af\u29b5\u298f\u29b5\u2991\u29b2\u298f\u2989\u2991\u29be\u29ae\u29b2\u38f2\u29b7\u38f0\u2995\u2990\u38f7\u2987\u2991\u2984\u298d\u298a\u2981\u38c8\u38e9\u2981\u2982\u299a\u299e\u29a4\u38f4\u29b5\u388e\u38f2\u38c8\u38ef\u2985\u38f7\u2980\u2981\u298d\u29ae\u298d\u2986\u29b2\u299a\u38f2\u2990\u29b0\u29af\u299a\u2a4e\u2983\u299a\u299b\u29a1\u2995\u38f0\u298f\u29a4\u2a4e\u38f4\u29a7\u29ae\u38e9\u2992\u38c8\u2990\u299b\u29b4\u2985\u29a5\u2989\u29b5\u38c8\u29af\u29a2\u29a0\u29a5\u38f0\u38eb\u298b\u29a2\u29bb\u298f\u29b0\u29b9\u38f2\u298a\u29b0\u2989\u298b\u29a7\u2985\u2983\u29b7\u29ad\u38c8\u298c\u29a1\u2995\u2991\u29a4\u29a6\u29a7\u2997\u2a4e\u29aa\u2991\u29b4\u2982\u29b5\u29b1\u38e9\u2980\u2995\u2999\u298c\u29b0\u38cb\u2997\u29a0\u29ba\u2981\u29b1\u29af\u2992\u29a2\u29ad\u38f7\u2990\u38c8\u29a4\u38f2\u29b7\u38f4\u29b0\u2995\u2980\u299b\u38ef\u38ef\u299e\u29a0\u298c\u2991\u38c8\u299a\u38e9\u38ef\u29b7\u2990\u298a\u38eb\u29bb\u2994\u38e9\u38eb\u2981\u29be\u38e9\u2997\u38c8\u299a\u29a6\u29ac\u29bb\u38c8\u38c8\u29b2\u38f1\u38eb\u298b\u298f\u29a5\u29b2\u29a1\u298d\u2999\u2984\u29b5\u2984\u298c\u38c8\u29ad\u38f0\u38c8\u38c9\u38e3\u38f0\u38f5\u38e3\u38f5\u29ba\u2982\u2989\u38f4\u299b\u38f2\u299b\u29a3\u38f2\u298b\u29a4\u29b9\u29a6\u388e\u2999\u38f2\u29aa\u38f0\u38cb\u2983\u298b\u38e8\u2980\u2981\u38e3\u29a7\u38e3\u2984\u2a4e\u29b4\u29a4\u2989\u2982\u38f4\u388e\u29a4\u29ae\u2990\u2989\u2988\u2990\u2981\u38c9\u38f1\u38f1\u38e9\u29a4\u2983\u38c9\u299e\u2990\u2994\u29bb\u2986\u38f4\u29a0\u38f1\u29af\u38cb\u38cb\u29b7\u2991\u38e8\u29a1\u388e\u38cb\u29b5\u38f0\u2987\u298f\u29b7\u2995\u38e3\u29a6\u2980\u29a6\u299b\u29a4\u2986\u38f2\u29ba\u29a2\u38eb\u2984\u38f5\u29a0\u29ac\u2983\u29a4\u29a3\u29a6\u38ef\u29a0\u38e8\u2985\u2990\u29a5\u29a7\u38ef\u38f7\u29b5\u2990\u38f2\u29ba\u29a0\u38f5\u298c\u2983\u2995\u38ef\u29ae\u29ad\u2980\u2990\u2990\u38e8\u2981\u29ae\u2a4e\u388e\u38c9\u29a1\u29ac\u29b7\u38f7\u2980\u2982\u298f\u2a4e\u38e9\u29a6\u29a0\u38cb\u298f\u29a7\u29b0\u2992\u38c8\u29a7\u29b4\u29a0\u2990\u29ae\u298a\u29b4\u29be\u38f4\u298b\u2997\u2995\u2986\u299b\u38eb\u29a6\u2990\u388e\u2990\u38e3\u38f5\u38e8\u29b1\u29ae\u29ba\u29b7\u38e9\u38f1\u29ac\u29b2\u299e\u299a\u38e8\u38c8\u29af\u2995\u38cb\u38f0\u2980\u38eb\u38c9\u298c\u29af\u38f5\u2995\u38e9\u29b9\u2985\u2a4e\u38f1\u2981\u29af\u29b2\u29b0\u2992\u299a\u29a2\u38f0\u2997\u29a0\u299e\u2997\u299e\u299e\u2a4e\u38f7\u298c\u38cb\u29be\u38e8\u2991\u29ad\u38f5\u29a6\u29ac\u38f1\u29a2\u298a\u29bb\u38c8\u298a\u299a\u29ba\u38eb\u38eb\u298f\u2980\u38e3\u38cb\u38e9\u2997\u29b7\u38e8\u38f7\u29b5\u2992\u29be\u2985\u29a5\u29af\u298b\u29aa\u38f0\u299a\u29b2\u38c9\u29a4\u38f1\u29af\u2992\u38eb\u2987\u38f7\u2994\u29b5\u298c\u38c9\u2983\u38c8".toCharArray();
            for (int i2 = F[192]; i2 < F[193]; ++i2) {
                int n5 = cArray[i2];
                n5 += F[194];
                n5 += F[195];
                n5 ^= F[196];
                n5 ^= F[197];
                n5 -= F[198];
                n5 += F[199];
                n5 ^= F[200];
                n5 ^= F[201];
                n5 ^= F[202];
                n5 += F[203];
                cArray[i2] = (char)(n5 ^= F[204]);
            }
            object = FriendSkinResolver.A()[FriendSkinResolver.F[205]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)FriendSkinResolver.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = F[206];
        n6 -= F[207];
        l6 = l17 ^ (0x19300000000L ^ l17) & -1L << (n6 -= F[208]);
        long l18 = l13;
        int n7 = F[209];
        n7 += F[210];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= F[211]);
        while (true) {
            int n8 = F[212];
            n8 += F[213];
            if ((int)l13 >= (int)(l6 >>> (n8 -= F[214]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = F[215];
            n10 -= F[216];
            int n11 = F[218];
            n11 += F[219];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= F[217])) & -1L >>> (n11 ^= F[220]);
            long l20 = l9;
            int n12 = F[221];
            n12 ^= F[222];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += F[223]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = F[224];
            n14 ^= F[225];
            int n15 = F[227];
            n15 += F[228];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= F[226])) & -1L >>> (n15 += F[229]);
            int n16 = F[230];
            n16 -= F[231];
            long l22 = l10;
            int n17 = F[233];
            n17 += F[234];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= F[232]) ^ l22) & -1L << (n17 += F[235]);
            int n18 = F[236];
            n18 += F[237];
            n18 ^= F[238];
            int n19 = F[239];
            n19 ^= F[240];
            long l23 = l12;
            int n20 = F[242];
            n20 += F[243];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += F[241]))) ^ l23) & -1L >>> (n20 -= F[244]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = F[245];
            n21 -= F[246];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += F[247]);
            while (true) {
                int n22 = F[248];
                n22 -= F[249];
                if ((int)(l14 >>> (n22 -= F[250])) >= (int)l12) break;
                int n23 = F[251];
                n23 += F[252];
                int n24 = F[254];
                n24 -= F[255];
                cArray2[(int)(l14 >>> (n23 -= FriendSkinResolver.F[253]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= F[256]))];
                l14 += 0x100000000L;
            }
            int n25 = F[257];
            n25 -= F[258];
            int n26 = (int)(l15 >>> (n25 += F[259]));
            l15 += 0x100000000L;
            FriendSkinResolver.d[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = F[260];
            n27 ^= F[261];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += F[262]);
        }
        INSTANCE = new FriendSkinResolver();
        a = DefaultSkinHelper.getTexture();
        A = new AtomicInteger();
        int n28 = F[263];
        n28 += F[264];
        b = Executors.newFixedThreadPool(n28 -= F[265], FriendSkinResolver::skinExecutor$lambda$0);
        B = ConcurrentHashMap.newKeySet();
        c = ConcurrentHashMap.newKeySet();
        C = new ConcurrentHashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[F[266]];
        String string = (String)object[F[267]];
        object = object[F[268]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[269]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[270]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[272] ^ F[273]];
                byArray[FriendSkinResolver.F[274] ^ FriendSkinResolver.F[275]] = F[276] ^ F[277];
                byArray[FriendSkinResolver.F[278] ^ FriendSkinResolver.F[279]] = F[280] ^ F[281];
                byArray[FriendSkinResolver.F[282] ^ FriendSkinResolver.F[283]] = F[284] ^ F[285];
                byArray[FriendSkinResolver.F[286] ^ FriendSkinResolver.F[287]] = F[288] ^ F[289];
                byArray[FriendSkinResolver.F[290] ^ FriendSkinResolver.F[291]] = F[292] ^ F[293];
                byArray[FriendSkinResolver.F[294] ^ FriendSkinResolver.F[295]] = F[296] ^ F[297];
                byArray[FriendSkinResolver.F[298] ^ FriendSkinResolver.F[299]] = F[300] ^ F[301];
                byArray[FriendSkinResolver.F[302] ^ FriendSkinResolver.F[303]] = F[304] ^ F[305];
                byArray[FriendSkinResolver.F[306] ^ FriendSkinResolver.F[307]] = F[308] ^ F[309];
                byArray[FriendSkinResolver.F[310] ^ FriendSkinResolver.F[311]] = F[312] ^ F[313];
                byArray[FriendSkinResolver.F[314] ^ FriendSkinResolver.F[315]] = F[316] ^ F[317];
                byArray[FriendSkinResolver.F[318] ^ FriendSkinResolver.F[319]] = F[320] ^ F[321];
                byArray[FriendSkinResolver.F[322] ^ FriendSkinResolver.F[323]] = F[324] ^ F[325];
                byArray[FriendSkinResolver.F[326] ^ FriendSkinResolver.F[327]] = F[328] ^ F[329];
                byArray[FriendSkinResolver.F[330] ^ FriendSkinResolver.F[331]] = F[332] ^ F[333];
                byArray[FriendSkinResolver.F[334] ^ FriendSkinResolver.F[335]] = F[336] ^ F[337];
                objectArray2[FriendSkinResolver.F[271]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[338]];
            if (e == null) {
                byte[] byArray2 = new byte[F[339] ^ F[340]];
                byArray2[FriendSkinResolver.F[341] ^ FriendSkinResolver.F[342]] = F[343] ^ F[344];
                byArray2[FriendSkinResolver.F[345] ^ FriendSkinResolver.F[346]] = F[347] ^ F[348];
                byArray2[FriendSkinResolver.F[349] ^ FriendSkinResolver.F[350]] = F[351] ^ F[352];
                byArray2[FriendSkinResolver.F[353] ^ FriendSkinResolver.F[354]] = F[355] ^ F[356];
                byArray2[FriendSkinResolver.F[357] ^ FriendSkinResolver.F[358]] = F[359] ^ F[360];
                byArray2[FriendSkinResolver.F[361] ^ FriendSkinResolver.F[362]] = F[363] ^ F[364];
                byArray2[FriendSkinResolver.F[365] ^ FriendSkinResolver.F[366]] = F[367] ^ F[368];
                byArray2[FriendSkinResolver.F[369] ^ FriendSkinResolver.F[370]] = F[371] ^ F[372];
                byArray2[FriendSkinResolver.F[373] ^ FriendSkinResolver.F[374]] = F[375] ^ F[376];
                byArray2[FriendSkinResolver.F[377] ^ FriendSkinResolver.F[378]] = F[379] ^ F[380];
                byArray2[FriendSkinResolver.F[381] ^ FriendSkinResolver.F[382]] = F[383] ^ F[384];
                byArray2[FriendSkinResolver.F[385] ^ FriendSkinResolver.F[386]] = F[387] ^ F[388];
                byArray2[FriendSkinResolver.F[389] ^ FriendSkinResolver.F[390]] = F[391] ^ F[392];
                byArray2[FriendSkinResolver.F[393] ^ FriendSkinResolver.F[394]] = F[395] ^ F[396];
                byArray2[FriendSkinResolver.F[397] ^ FriendSkinResolver.F[398]] = F[399] ^ 0x9935;
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
                Object object4 = FriendSkinResolver.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u8dd5\u8dc7\u8dcc\u8dd1\u8dd3\u8ff7\u8de0\u8e2a\u8dc1\u8e2d\u8dcd\u8e36\u8e22\u8e24\u8dd4\u8dcd\u8dc2\u8ff2".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 12080;
                        n3 -= 33969;
                        n3 += 18913;
                        n3 ^= 0x6FC1;
                        n3 -= 48419;
                        n3 ^= 0x48E5;
                        n3 -= 52071;
                        n3 += 25336;
                        n3 += 27321;
                        n3 -= 64634;
                        n3 += 8525;
                        cArray[i2] = (char)(n3 += 4895);
                    }
                    object4 = FriendSkinResolver.A()[1] = new String(cArray);
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
                Object object5 = FriendSkinResolver.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ud586\ud522\ud5dc".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 55953;
                        n4 -= 7889;
                        n4 -= 40852;
                        n4 ^= 0x26A5;
                        n4 -= 48519;
                        n4 ^= 0x1668;
                        n4 -= 9240;
                        n4 ^= 0x59AD;
                        n4 += 15757;
                        n4 += 42878;
                        cArray[i3] = (char)(n4 ^= 0x644F);
                    }
                    object5 = FriendSkinResolver.A()[2] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = FriendSkinResolver.A()[3];
            if (object6 == null) {
                char[] cArray = "\u8faf\u8fab\u8fd9\u8fbd\u8fa9\u8fac\u8fa9\u8fbd\u8fa2\u8fb1\u8fa9\u8fd9\u8fbb\u8fa2\u8fcf\u8fce\u8fce\u8fd7\u8fd0\u8fd5".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x1AC0;
                    n5 ^= 0x2451;
                    n5 ^= 0xD031;
                    n5 ^= 0x55C2;
                    n5 -= 35814;
                    n5 += 6487;
                    n5 -= 17610;
                    n5 ^= 0xB2B;
                    n5 ^= 0xFBDD;
                    cArray[i4] = (char)(n5 += 29375);
                }
                object6 = FriendSkinResolver.A()[3] = new String(cArray);
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
        FriendSkinResolver.F[0x63D7 ^ 0x62AF] = 0x87B6 ^ 0x62AF;
        FriendSkinResolver.F[0x22D ^ 0x2AD] = 0x2E3 ^ 0x2AD;
        FriendSkinResolver.F[0x80AC ^ 0x80C2] = 0xFFFF7F01 ^ 0x80C2;
        FriendSkinResolver.F[0x10146 ^ 0x10045] = 0xFFFEFFE5 ^ 0x10045;
        FriendSkinResolver.F[0x5C53 ^ 0x5CE8] = 0x5CE8 ^ 0x5CE8;
        FriendSkinResolver.F[0x7B47 ^ 0x7B69] = 0x7B4F ^ 0x7B69;
        FriendSkinResolver.F[0xBAAB ^ 0xBBEA] = 0xC6A2 ^ 0xBBEA;
        FriendSkinResolver.F[0xA10 ^ 0xA4D] = 0xA6A ^ 0xA4D;
        FriendSkinResolver.F[0x7228 ^ 0x72CA] = 0xFFFF8D1B ^ 0x72CA;
        FriendSkinResolver.F[0xC5D3 ^ 0xC57E] = 0xFFFF3AEF ^ 0xC57E;
        FriendSkinResolver.F[0x5C11 ^ 0x5C39] = 0x5C3E ^ 0x5C39;
        FriendSkinResolver.F[0xB0B9 ^ 0xB02B] = 0xB064 ^ 0xB02B;
        FriendSkinResolver.F[0x10BB2 ^ 0x10BBB] = 0xFFFEF466 ^ 0x10BBB;
        FriendSkinResolver.F[0xECFA ^ 0xEC3B] = 0xEE7B ^ 0xEC3B;
        FriendSkinResolver.F[0x69E7 ^ 0x6934] = 0x697D ^ 0x6934;
        FriendSkinResolver.F[0xEC74 ^ 0xECD5] = 0xFFFF1371 ^ 0xECD5;
        FriendSkinResolver.F[0x594A ^ 0x591F] = 0xFFFFA6F9 ^ 0x591F;
        FriendSkinResolver.F[0x10B57 ^ 0x10AD8] = 0xFFFE6C14 ^ 0x10AD8;
        FriendSkinResolver.F[0x8E0F ^ 0x8F7A] = 0x6A63 ^ 0x8F7A;
        FriendSkinResolver.F[0x85B3 ^ 0x85ED] = 0xFFFF7A61 ^ 0x85ED;
        FriendSkinResolver.F[0x97AC ^ 0x9680] = 0xFFFF46ED ^ 0x9680;
        FriendSkinResolver.F[0x1D8 ^ 0x100] = 0x153 ^ 0x100;
        FriendSkinResolver.F[0x81E4 ^ 0x81A2] = 0x81F1 ^ 0x81A2;
        FriendSkinResolver.F[0xBE1B ^ 0xBE44] = 0xBE31 ^ 0xBE44;
        FriendSkinResolver.F[0x6E5F ^ 0x6E39] = 0x6E9D ^ 0x6E39;
        FriendSkinResolver.F[0x2DBE ^ 0x2CA8] = 0x307C ^ 0x2CA8;
        FriendSkinResolver.F[0xFB0C ^ 0xFB9B] = 0xFFFF0419 ^ 0xFB9B;
        FriendSkinResolver.F[0xF056 ^ 0xF144] = 0x28BA ^ 0xF144;
        FriendSkinResolver.F[0x7A75 ^ 0x7B70] = 0x7B22 ^ 0x7B70;
        FriendSkinResolver.F[0xA8FC ^ 0xA84A] = 0xFFFF57BC ^ 0xA84A;
        FriendSkinResolver.F[0x3659 ^ 0x370B] = 0x370B ^ 0x370B;
        FriendSkinResolver.F[0xB56B ^ 0xB557] = 0xB55A ^ 0xB557;
        FriendSkinResolver.F[0xF509 ^ 0xF54C] = 0xF5D8 ^ 0xF54C;
        FriendSkinResolver.F[0x3C18 ^ 0x3CC4] = 0xFFFFC357 ^ 0x3CC4;
        FriendSkinResolver.F[0x94CF ^ 0x944B] = 0xFFFF6BCC ^ 0x944B;
        FriendSkinResolver.F[0xA615 ^ 0xA610] = 0xA629 ^ 0xA610;
        FriendSkinResolver.F[0xD00C ^ 0xD187] = 0xFFFF52BE ^ 0xD187;
        FriendSkinResolver.F[0xB573 ^ 0xB517] = 0xB532 ^ 0xB517;
        FriendSkinResolver.F[0x147E ^ 0x14A5] = 0x1485 ^ 0x14A5;
        FriendSkinResolver.F[0x2F02 ^ 0x2E7B] = 0xA8FF ^ 0x2E7B;
        FriendSkinResolver.F[0x8CA ^ 0x8E3] = 0xFFFFF746 ^ 0x8E3;
        FriendSkinResolver.F[0x102E0 ^ 0x1026A] = 0xFFFEFD0C ^ 0x1026A;
        FriendSkinResolver.F[0x10CBC ^ 0x10CFC] = 0x10C95 ^ 0x10CFC;
        FriendSkinResolver.F[0xF1AD ^ 0xF163] = 0xF1F7 ^ 0xF163;
        FriendSkinResolver.F[0xB444 ^ 0xB518] = 0x8A4E ^ 0xB518;
        FriendSkinResolver.F[0xB28C ^ 0xB245] = 0xCB89 ^ 0xB245;
        FriendSkinResolver.F[0x6D44 ^ 0x6C7B] = 0x1133 ^ 0x6C7B;
        FriendSkinResolver.F[0x10B71 ^ 0x10A2E] = 0x1878E ^ 0x10A2E;
        FriendSkinResolver.F[0x8AC6 ^ 0x8AA5] = 0x8A63 ^ 0x8AA5;
        FriendSkinResolver.F[0x6106 ^ 0x605B] = 0xEDD9 ^ 0x605B;
        FriendSkinResolver.F[0x8BD3 ^ 0x8B7B] = 0x8B4E ^ 0x8B7B;
        FriendSkinResolver.F[0x5B11 ^ 0x5B5D] = 0x5B59 ^ 0x5B5D;
        FriendSkinResolver.F[0x627C ^ 0x63FF] = 0x5255 ^ 0x63FF;
        FriendSkinResolver.F[0x65BD ^ 0x6556] = 0x652A ^ 0x6556;
        FriendSkinResolver.F[0xABF0 ^ 0xAA8B] = 0x2C3A ^ 0xAA8B;
        FriendSkinResolver.F[0x8B7 ^ 0x9AB] = 0xFFFF6F75 ^ 0x9AB;
        FriendSkinResolver.F[0x4ADB ^ 0x4AFB] = 0xFFFFB500 ^ 0x4AFB;
        FriendSkinResolver.F[0xA02D ^ 0xA14F] = 0x1622 ^ 0xA14F;
        FriendSkinResolver.F[0x3B79 ^ 0x3BDC] = 0xFFFFC451 ^ 0x3BDC;
        FriendSkinResolver.F[0x5DE2 ^ 0x5CAD] = 0x7530 ^ 0x5CAD;
        FriendSkinResolver.F[0x5BEA ^ 0x5B1D] = 0x5B1A ^ 0x5B1D;
        FriendSkinResolver.F[0xCA70 ^ 0xCB3E] = 0xE2A0 ^ 0xCB3E;
        FriendSkinResolver.F[0xFF9E ^ 0xFEB0] = 0x6F6 ^ 0xFEB0;
        FriendSkinResolver.F[0x2BF0 ^ 0x2BD3] = 0xFFFFD462 ^ 0x2BD3;
        FriendSkinResolver.F[0x1043E ^ 0x10413] = 0xFFFEFB9E ^ 0x10413;
        FriendSkinResolver.F[0x96A6 ^ 0x9613] = 0xFFFF69E8 ^ 0x9613;
        FriendSkinResolver.F[0x6A7E ^ 0x6B45] = 0x3A7A ^ 0x6B45;
        FriendSkinResolver.F[0xA7AF ^ 0xA6DB] = 0x3770 ^ 0xA6DB;
        FriendSkinResolver.F[0xCCA4 ^ 0xCC17] = 0xFFFF33EB ^ 0xCC17;
        FriendSkinResolver.F[0x8180 ^ 0x808D] = 0x808C ^ 0x808D;
        FriendSkinResolver.F[0xBE3B ^ 0xBF53] = 0xAAF ^ 0xBF53;
        FriendSkinResolver.F[0x7F0D ^ 0x7E06] = 0x7E04 ^ 0x7E06;
        FriendSkinResolver.F[0x7EAE ^ 0x7FD1] = 0xFFFF3BB6 ^ 0x7FD1;
        FriendSkinResolver.F[0x8B16 ^ 0x8BBD] = 0x8B40 ^ 0x8BBD;
        FriendSkinResolver.F[0xBC33 ^ 0xBCCB] = 0xBC81 ^ 0xBCCB;
        FriendSkinResolver.F[0x9434 ^ 0x9465] = 0xFFFF7FBE ^ 0x9465;
        FriendSkinResolver.F[0x2DD0 ^ 0x2C96] = 0xFDC5 ^ 0x2C96;
        FriendSkinResolver.F[0xB09 ^ 0xA0F] = 0xFFFFF5B6 ^ 0xA0F;
        FriendSkinResolver.F[0x59AF ^ 0x58BB] = 0xFFFF7E9E ^ 0x58BB;
        FriendSkinResolver.F[0xDC58 ^ 0xDC4E] = 0xFFFF23E0 ^ 0xDC4E;
        FriendSkinResolver.F[0xA786 ^ 0xA6FA] = 0x2071 ^ 0xA6FA;
        FriendSkinResolver.F[0x3BD6 ^ 0x3A9F] = 0xEBCD ^ 0x3A9F;
        FriendSkinResolver.F[0x7601 ^ 0x769B] = 0x7680 ^ 0x769B;
        FriendSkinResolver.F[0x2FB7 ^ 0x2ED2] = 0x9B3F ^ 0x2ED2;
        FriendSkinResolver.F[0x53BD ^ 0x528B] = 0x5921 ^ 0x528B;
        FriendSkinResolver.F[0x6612 ^ 0x679C] = 0xFEA9 ^ 0x679C;
        FriendSkinResolver.F[0xBE1F ^ 0xBE93] = 0xFFFF4106 ^ 0xBE93;
        FriendSkinResolver.F[0xE45C ^ 0xE52D] = 0x7499 ^ 0xE52D;
        FriendSkinResolver.F[0x279F ^ 0x26A7] = 0x2D52 ^ 0x26A7;
        FriendSkinResolver.F[0x3830 ^ 0x389A] = 0xFFFFC778 ^ 0x389A;
        FriendSkinResolver.F[0x764C ^ 0x766D] = 0xFFFF89CB ^ 0x766D;
        FriendSkinResolver.F[0x2C8A ^ 0x2C7A] = 0x2C3F ^ 0x2C7A;
        FriendSkinResolver.F[0x172F ^ 0x167E] = 0x3FE3 ^ 0x167E;
        FriendSkinResolver.F[0x1B40 ^ 0x1A02] = 0xEF0E ^ 0x1A02;
        FriendSkinResolver.F[0xD927 ^ 0xD95D] = 0xFFFF26C9 ^ 0xD95D;
        FriendSkinResolver.F[0x6F24 ^ 0x6FE2] = 0x4E15 ^ 0x6FE2;
        FriendSkinResolver.F[0x8449 ^ 0x8456] = 0x8427 ^ 0x8456;
        FriendSkinResolver.F[0x731 ^ 0x63B] = 0x63A ^ 0x63B;
        FriendSkinResolver.F[0xC1A3 ^ 0xC1B6] = 0xFFFF3E15 ^ 0xC1B6;
        FriendSkinResolver.F[0xD2EC ^ 0xD36B] = 0x76D4 ^ 0xD36B;
        FriendSkinResolver.F[0x12D4 ^ 0x13BE] = 0xF2F2 ^ 0x13BE;
        FriendSkinResolver.F[0x1128 ^ 0x1072] = 0x2F24 ^ 0x1072;
        FriendSkinResolver.F[0xE029 ^ 0xE05C] = 0xE0C5 ^ 0xE05C;
        FriendSkinResolver.F[0x684 ^ 0x785] = 0x7F9 ^ 0x785;
        FriendSkinResolver.F[0x7CFD ^ 0x7C96] = 0x7CE1 ^ 0x7C96;
        FriendSkinResolver.F[0xECFA ^ 0xECCF] = 0xFFFF133F ^ 0xECCF;
        FriendSkinResolver.F[0xCD47 ^ 0xCC45] = 0xFFFF33B9 ^ 0xCC45;
        FriendSkinResolver.F[0x2E7B ^ 0x2EB6] = 0x2EB6 ^ 0x2EB6;
        FriendSkinResolver.F[0xACC7 ^ 0xAC6E] = 0xFFFF53C0 ^ 0xAC6E;
        FriendSkinResolver.F[0x887E ^ 0x889E] = 0xFFFF772E ^ 0x889E;
        FriendSkinResolver.F[0x5334 ^ 0x53ED] = 0x53A7 ^ 0x53ED;
        FriendSkinResolver.F[0x466 ^ 0x424] = 0xFFFFFBEC ^ 0x424;
        FriendSkinResolver.F[0x6873 ^ 0x6917] = 0xDE7A ^ 0x6917;
        FriendSkinResolver.F[0x10061 ^ 0x10078] = 0xFFFEFF83 ^ 0x10078;
        FriendSkinResolver.F[0x3DB3 ^ 0x3D3D] = 0x3D28 ^ 0x3D3D;
        FriendSkinResolver.F[0x3746 ^ 0x3669] = 0xCE25 ^ 0x3669;
        FriendSkinResolver.F[0x5765 ^ 0x565C] = 0x5DFE ^ 0x565C;
        FriendSkinResolver.F[0x3912 ^ 0x399A] = 0x39CE ^ 0x399A;
        FriendSkinResolver.F[0xC3FD ^ 0xC2C1] = 0x93D7 ^ 0xC2C1;
        FriendSkinResolver.F[0x4A63 ^ 0x4A1C] = 0xFFFFB596 ^ 0x4A1C;
        FriendSkinResolver.F[0xE341 ^ 0xE31A] = 0xFFFF1CA2 ^ 0xE31A;
        FriendSkinResolver.F[0xF67F ^ 0xF70C] = 0x6691 ^ 0xF70C;
        FriendSkinResolver.F[0x6265 ^ 0x6322] = 0xB270 ^ 0x6322;
        FriendSkinResolver.F[0x512D ^ 0x5153] = 0x519D ^ 0x5153;
        FriendSkinResolver.F[0x1F65 ^ 0x1FE8] = 0x1FD1 ^ 0x1FE8;
        FriendSkinResolver.F[0x2729 ^ 0x260A] = 0x2ACF ^ 0x260A;
        FriendSkinResolver.F[0xEE55 ^ 0xEEF6] = 0xEE8C ^ 0xEEF6;
        FriendSkinResolver.F[0xBB79 ^ 0xBB53] = 0xBB69 ^ 0xBB53;
        FriendSkinResolver.F[0xB3BC ^ 0xB30E] = 0xFFFF4C91 ^ 0xB30E;
        FriendSkinResolver.F[0x50CF ^ 0x5022] = 0x5032 ^ 0x5022;
        FriendSkinResolver.F[0x4D29 ^ 0x4DAA] = 0x4D97 ^ 0x4DAA;
        FriendSkinResolver.F[0xB035 ^ 0xB097] = 0xB0DC ^ 0xB097;
        FriendSkinResolver.F[0xBFB8 ^ 0xBEEB] = 0x4425 ^ 0xBEEB;
        FriendSkinResolver.F[0x529A ^ 0x5310] = 0x2FD7 ^ 0x5310;
        FriendSkinResolver.F[0x8A34 ^ 0x8A39] = 0x8A2B ^ 0x8A39;
        FriendSkinResolver.F[0xA0A5 ^ 0xA1E1] = 0xFFFFAB0D ^ 0xA1E1;
        FriendSkinResolver.F[0x6C90 ^ 0x6DE6] = 0x88FF ^ 0x6DE6;
        FriendSkinResolver.F[0xE522 ^ 0xE54F] = 0xE55D ^ 0xE54F;
        FriendSkinResolver.F[0x6899 ^ 0x6818] = 0xFFFF97A4 ^ 0x6818;
        FriendSkinResolver.F[0xB2B3 ^ 0xB23C] = 0xB215 ^ 0xB23C;
        FriendSkinResolver.F[0x4FCA ^ 0x4F65] = 0x4F02 ^ 0x4F65;
        FriendSkinResolver.F[0x109E6 ^ 0x108E6] = 0xFFFEF716 ^ 0x108E6;
        FriendSkinResolver.F[0xC9F7 ^ 0xC9FB] = 0xC9F0 ^ 0xC9FB;
        FriendSkinResolver.F[0x6037 ^ 0x604A] = 0xFFFF9FCE ^ 0x604A;
        FriendSkinResolver.F[0xD814 ^ 0xD903] = 0xC5D5 ^ 0xD903;
        FriendSkinResolver.F[0x9FF8 ^ 0x9ED2] = 0xB103 ^ 0x9ED2;
        FriendSkinResolver.F[0xEED6 ^ 0xEFD1] = 0xEF96 ^ 0xEFD1;
        FriendSkinResolver.F[0x9FC6 ^ 0x9F14] = 0xFFFF60DE ^ 0x9F14;
        FriendSkinResolver.F[0xF3D0 ^ 0xF3FC] = 0xF3A2 ^ 0xF3FC;
        FriendSkinResolver.F[0x23EE ^ 0x22DA] = 0xF9C6 ^ 0x22DA;
        FriendSkinResolver.F[0xE13F ^ 0xE16B] = 0xFFFF1ECC ^ 0xE16B;
        FriendSkinResolver.F[0xF7E9 ^ 0xF777] = 0xF739 ^ 0xF777;
        FriendSkinResolver.F[0x1459 ^ 0x15D9] = 0xAE01 ^ 0x15D9;
        FriendSkinResolver.F[0xB90F ^ 0xB9DA] = 0xFFFF4640 ^ 0xB9DA;
        FriendSkinResolver.F[0x98B0 ^ 0x98A0] = 0xFFFF677F ^ 0x98A0;
        FriendSkinResolver.F[0xCC4B ^ 0xCD25] = 0xF3D2 ^ 0xCD25;
        FriendSkinResolver.F[0x7B8B ^ 0x7BBF] = 0x7B85 ^ 0x7BBF;
        FriendSkinResolver.F[0xFC80 ^ 0xFC06] = 0xFFFF0390 ^ 0xFC06;
        FriendSkinResolver.F[0x5D23 ^ 0x5C7A] = 0x6326 ^ 0x5C7A;
        FriendSkinResolver.F[0x730D ^ 0x7388] = 0x738D ^ 0x7388;
        FriendSkinResolver.F[0xF252 ^ 0xF367] = 0x286B ^ 0xF367;
        FriendSkinResolver.F[0x8E2D ^ 0x8E3C] = 0xFFFF719A ^ 0x8E3C;
        FriendSkinResolver.F[0x7BBA ^ 0x7B1D] = 0x7B12 ^ 0x7B1D;
        FriendSkinResolver.F[0xB20E ^ 0xB201] = 0xB243 ^ 0xB201;
        FriendSkinResolver.F[0x7D3C ^ 0x7DC0] = 0x7DC2 ^ 0x7DC0;
        FriendSkinResolver.F[0x4ECB ^ 0x4EFA] = 0xFFFFB109 ^ 0x4EFA;
        FriendSkinResolver.F[0x23ED ^ 0x23CB] = 0xFFFFDC71 ^ 0x23CB;
        FriendSkinResolver.F[0xEBDE ^ 0xEBC2] = 0xFFFF141D ^ 0xEBC2;
        FriendSkinResolver.F[0xD458 ^ 0xD43A] = 0xD417 ^ 0xD43A;
        FriendSkinResolver.F[0x168 ^ 0x1DC] = 0xFFFFFE34 ^ 0x1DC;
        FriendSkinResolver.F[0xE039 ^ 0xE031] = 0xFFFF1FD1 ^ 0xE031;
        FriendSkinResolver.F[0xE966 ^ 0xE876] = 0xE52C ^ 0xE876;
        FriendSkinResolver.F[0x10CC3 ^ 0x10DCC] = 0x10DCC ^ 0x10DCC;
        FriendSkinResolver.F[0x9BF1 ^ 0x9B1E] = 0x9B5E ^ 0x9B1E;
        FriendSkinResolver.F[0xC1B4 ^ 0xC18F] = 0xFFFF3E59 ^ 0xC18F;
        FriendSkinResolver.F[0x9DA5 ^ 0x9DC9] = 0x9CB2 ^ 0x9DC9;
        FriendSkinResolver.F[0x976F ^ 0x965E] = 0x6E12 ^ 0x965E;
        FriendSkinResolver.F[0xCE83 ^ 0xCFB4] = 0xC416 ^ 0xCFB4;
        FriendSkinResolver.F[0x2042 ^ 0x2089] = 0xA734 ^ 0x2089;
        FriendSkinResolver.F[0xC99C ^ 0xC8AC] = 0x30E5 ^ 0xC8AC;
        FriendSkinResolver.F[0x6637 ^ 0x66AF] = 0xFFFF993F ^ 0x66AF;
        FriendSkinResolver.F[0xB9A ^ 0xBD1] = 0xFFFFF41F ^ 0xBD1;
        FriendSkinResolver.F[0x8DCC ^ 0x8DF6] = 0xFFFF724E ^ 0x8DF6;
        FriendSkinResolver.F[0x4889 ^ 0x488D] = 0xFFFFB703 ^ 0x488D;
        FriendSkinResolver.F[0xF8D7 ^ 0xF952] = 0x5CD9 ^ 0xF952;
        FriendSkinResolver.F[0xAD23 ^ 0xAD83] = 0xFFFF522D ^ 0xAD83;
        FriendSkinResolver.F[0xAEA2 ^ 0xAE47] = 0xAE35 ^ 0xAE47;
        FriendSkinResolver.F[0xA9F8 ^ 0xA9B7] = 0xA9F4 ^ 0xA9B7;
        FriendSkinResolver.F[0x10607 ^ 0x10675] = 0xFFFEF998 ^ 0x10675;
        FriendSkinResolver.F[0xE5B3 ^ 0xE571] = 0x201 ^ 0xE571;
        FriendSkinResolver.F[0xF09C ^ 0xF0AF] = 0xFFFF0F45 ^ 0xF0AF;
        FriendSkinResolver.F[0x4C9 ^ 0x419] = 0x461 ^ 0x419;
        FriendSkinResolver.F[0xA31 ^ 0xAC8] = 0xFFFFF505 ^ 0xAC8;
        FriendSkinResolver.F[0xDB35 ^ 0xDB3F] = 0xFFFF24B3 ^ 0xDB3F;
        FriendSkinResolver.F[0xF0B0 ^ 0xF1AE] = 0x507F ^ 0xF1AE;
        FriendSkinResolver.F[0xEF18 ^ 0xEE22] = 0xBF1B ^ 0xEE22;
        FriendSkinResolver.F[0x8D52 ^ 0x8DBE] = 0xFFFF7218 ^ 0x8DBE;
        FriendSkinResolver.F[0x10353 ^ 0x103B0] = 0xFFFEFC2E ^ 0x103B0;
        FriendSkinResolver.F[0x77CE ^ 0x76E8] = 0x903B ^ 0x76E8;
        FriendSkinResolver.F[0xEBB2 ^ 0xEB6D] = 0xEB79 ^ 0xEB6D;
        FriendSkinResolver.F[0xEBFF ^ 0xEB43] = 0xEB42 ^ 0xEB43;
        FriendSkinResolver.F[0x2EFC ^ 0x2F81] = 0x9457 ^ 0x2F81;
        FriendSkinResolver.F[0xDD5A ^ 0xDC43] = 0xC095 ^ 0xDC43;
        FriendSkinResolver.F[0x5E4C ^ 0x5E7B] = 0xFFFFA1E5 ^ 0x5E7B;
        FriendSkinResolver.F[0xA861 ^ 0xA8A2] = 0x30B2 ^ 0xA8A2;
        FriendSkinResolver.F[0xFA22 ^ 0xFB2A] = 0xFFFF04E5 ^ 0xFB2A;
        FriendSkinResolver.F[0x10E4A ^ 0x10EDF] = 0x10E9B ^ 0x10EDF;
        FriendSkinResolver.F[0x8195 ^ 0x8167] = 0xFFFF7EC7 ^ 0x8167;
        FriendSkinResolver.F[0x40BB ^ 0x4027] = 0xFFFFBFB6 ^ 0x4027;
        FriendSkinResolver.F[0x6633 ^ 0x667D] = 0x759A ^ 0x667D;
        FriendSkinResolver.F[0xEC81 ^ 0xEDD4] = 0x6D84 ^ 0xEDD4;
        FriendSkinResolver.F[0x862B ^ 0x86EC] = 0x6E54 ^ 0x86EC;
        FriendSkinResolver.F[0xE7F1 ^ 0xE6F8] = 0xE6EC ^ 0xE6F8;
        FriendSkinResolver.F[0xA357 ^ 0xA351] = 0xA32C ^ 0xA351;
        FriendSkinResolver.F[0x2FE6 ^ 0x2F81] = 0xFFFFD02D ^ 0x2F81;
        FriendSkinResolver.F[0x2740 ^ 0x27BD] = 0xFFFFD81E ^ 0x27BD;
        FriendSkinResolver.F[0x39FE ^ 0x399B] = 0x3980 ^ 0x399B;
        FriendSkinResolver.F[0x133C ^ 0x1337] = 0x136D ^ 0x1337;
        FriendSkinResolver.F[0x6F3 ^ 0x6D4] = 0xFFFFF956 ^ 0x6D4;
        FriendSkinResolver.F[0xB4FD ^ 0xB44D] = 0xB461 ^ 0xB44D;
        FriendSkinResolver.F[0xE11E ^ 0xE1F9] = 0xE1F8 ^ 0xE1F9;
        FriendSkinResolver.F[0x6A3D ^ 0x6BB4] = 0x1764 ^ 0x6BB4;
        FriendSkinResolver.F[0x2802 ^ 0x284A] = 0xFFFFD79B ^ 0x284A;
        FriendSkinResolver.F[0x5007 ^ 0x50C2] = 0x6BA5 ^ 0x50C2;
        FriendSkinResolver.F[0x6DE4 ^ 0x6D2B] = 0xFFFF92D7 ^ 0x6D2B;
        FriendSkinResolver.F[0x36B9 ^ 0x379D] = 0xFFFFC4D5 ^ 0x379D;
        FriendSkinResolver.F[0x5820 ^ 0x58FA] = 0xFFFFA769 ^ 0x58FA;
        FriendSkinResolver.F[0x26DA ^ 0x26BA] = 0x269F ^ 0x26BA;
        FriendSkinResolver.F[0x4D33 ^ 0x4D4B] = 0xFFFFB2EA ^ 0x4D4B;
        FriendSkinResolver.F[0x1078B ^ 0x10694] = 0x1A740 ^ 0x10694;
        FriendSkinResolver.F[0x9C7C ^ 0x9CC5] = 0xFFFF6317 ^ 0x9CC5;
        FriendSkinResolver.F[0x376B ^ 0x364A] = 0x979E ^ 0x364A;
        FriendSkinResolver.F[0x446 ^ 0x4F8] = 0x4FA ^ 0x4F8;
        FriendSkinResolver.F[0x8C4 ^ 0x87C] = 0xFFFFF7F2 ^ 0x87C;
        FriendSkinResolver.F[0xB186 ^ 0xB158] = 0xB129 ^ 0xB158;
        FriendSkinResolver.F[0xA65C ^ 0xA6B5] = 0xFFFF5962 ^ 0xA6B5;
        FriendSkinResolver.F[0x9EED ^ 0x9FA7] = 0xD44C ^ 0x9FA7;
        FriendSkinResolver.F[0x9169 ^ 0x914D] = 0xFFFF6E09 ^ 0x914D;
        FriendSkinResolver.F[0xC7B1 ^ 0xC6F9] = 0xFFFFE864 ^ 0xC6F9;
        FriendSkinResolver.F[0xF05 ^ 0xFE3] = 0xFFFFF037 ^ 0xFE3;
        FriendSkinResolver.F[0x669B ^ 0x6665] = 0xFFFF99AE ^ 0x6665;
        FriendSkinResolver.F[0x3496 ^ 0x34A6] = 0x348D ^ 0x34A6;
        FriendSkinResolver.F[0x1371 ^ 0x1300] = 0x1338 ^ 0x1300;
        FriendSkinResolver.F[0x321A ^ 0x325E] = 0xFFFFCDA8 ^ 0x325E;
        FriendSkinResolver.F[0x7A87 ^ 0x7BB4] = 0xA0B8 ^ 0x7BB4;
        FriendSkinResolver.F[0x9F70 ^ 0x9F49] = 0xFFFF60BB ^ 0x9F49;
        FriendSkinResolver.F[0x10D24 ^ 0x10DAD] = 0x10D94 ^ 0x10DAD;
        FriendSkinResolver.F[0x23E7 ^ 0x2331] = 0xFFFFDCE5 ^ 0x2331;
        FriendSkinResolver.F[0x8AFC ^ 0x8AAB] = 0x8AD7 ^ 0x8AAB;
        FriendSkinResolver.F[0x1B46 ^ 0x1B70] = 0xFFFFE4D5 ^ 0x1B70;
        FriendSkinResolver.F[0x3CD3 ^ 0x3DFE] = 0x122B ^ 0x3DFE;
        FriendSkinResolver.F[0x8CB8 ^ 0x8D85] = 0xDCBA ^ 0x8D85;
        FriendSkinResolver.F[0x327C ^ 0x336F] = 0xEA9D ^ 0x336F;
        FriendSkinResolver.F[0x3415 ^ 0x3481] = 0xFFFFCB6D ^ 0x3481;
        FriendSkinResolver.F[0xB245 ^ 0xB377] = 0x6874 ^ 0xB377;
        FriendSkinResolver.F[0x4D3F ^ 0x4C67] = 0xCC3B ^ 0x4C67;
        FriendSkinResolver.F[0x7BBD ^ 0x7AF1] = 0x3116 ^ 0x7AF1;
        FriendSkinResolver.F[0xD095 ^ 0xD081] = 0xD0CF ^ 0xD081;
        FriendSkinResolver.F[0x797E ^ 0x785C] = 0x7499 ^ 0x785C;
        FriendSkinResolver.F[0x754 ^ 0x720] = 0x70D ^ 0x720;
        FriendSkinResolver.F[0x4B16 ^ 0x4A5D] = 0x1BF ^ 0x4A5D;
        FriendSkinResolver.F[0x645E ^ 0x6544] = 0xFC49 ^ 0x6544;
        FriendSkinResolver.F[0x640C ^ 0x6524] = 0x8380 ^ 0x6524;
        FriendSkinResolver.F[0x5B0B ^ 0x5A55] = 0xD7D6 ^ 0x5A55;
        FriendSkinResolver.F[0x761A ^ 0x76DE] = 0x3408 ^ 0x76DE;
        FriendSkinResolver.F[0xFAE ^ 0xF93] = 0xFD4 ^ 0xF93;
        FriendSkinResolver.F[0x6E42 ^ 0x6F0F] = 0x24ED ^ 0x6F0F;
        FriendSkinResolver.F[0x1072D ^ 0x107B0] = 0xFFFEF865 ^ 0x107B0;
        FriendSkinResolver.F[0x5B10 ^ 0x5BAD] = 0x5BAD ^ 0x5BAD;
        FriendSkinResolver.F[0x3BFD ^ 0x3BFA] = 0x3BB9 ^ 0x3BFA;
        FriendSkinResolver.F[0x43F4 ^ 0x439D] = 0x4330 ^ 0x439D;
        FriendSkinResolver.F[0x536B ^ 0x5211] = 0xD49A ^ 0x5211;
        FriendSkinResolver.F[0x300B ^ 0x30B4] = 0x30B4 ^ 0x30B4;
        FriendSkinResolver.F[0xED48 ^ 0xED4B] = 0xED80 ^ 0xED4B;
        FriendSkinResolver.F[0x83D8 ^ 0x8391] = 0x83B3 ^ 0x8391;
        FriendSkinResolver.F[0x9D61 ^ 0x9DC7] = 0xFFFF6248 ^ 0x9DC7;
        FriendSkinResolver.F[0xE023 ^ 0xE0B2] = 0xE08F ^ 0xE0B2;
        FriendSkinResolver.F[0x10D29 ^ 0x10DDD] = 0xFFFEF20D ^ 0x10DDD;
        FriendSkinResolver.F[0x7CE0 ^ 0x7CB2] = 0x7CC3 ^ 0x7CB2;
        FriendSkinResolver.F[0xC80A ^ 0xC961] = 0x2832 ^ 0xC961;
        FriendSkinResolver.F[0x38D6 ^ 0x3816] = 0x3816 ^ 0x3816;
        FriendSkinResolver.F[0xFEEC ^ 0xFFB7] = 0xFFFF3F71 ^ 0xFFB7;
        FriendSkinResolver.F[0x161C ^ 0x1602] = 0x1668 ^ 0x1602;
        FriendSkinResolver.F[0xC017 ^ 0xC00D] = 0xFFFF3FB9 ^ 0xC00D;
        FriendSkinResolver.F[0x83C1 ^ 0x8370] = 0x8316 ^ 0x8370;
        FriendSkinResolver.F[0xDAD4 ^ 0xDA93] = 0xDACB ^ 0xDA93;
        FriendSkinResolver.F[0x103EC ^ 0x1039F] = 0x103DF ^ 0x1039F;
        FriendSkinResolver.F[0xA0C3 ^ 0xA194] = 0xFFFFDE76 ^ 0xA194;
        FriendSkinResolver.F[0x27C7 ^ 0x2729] = 0xFFFFD88F ^ 0x2729;
        FriendSkinResolver.F[0x1E9A ^ 0x1E11] = 0x1E22 ^ 0x1E11;
        FriendSkinResolver.F[0x981E ^ 0x988E] = 0x98FC ^ 0x988E;
        FriendSkinResolver.F[0x6520 ^ 0x6556] = 0xFFFF9A8B ^ 0x6556;
        FriendSkinResolver.F[0xC61A ^ 0xC74E] = 0x3DA0 ^ 0xC74E;
        FriendSkinResolver.F[0x830C ^ 0x8202] = 0x8203 ^ 0x8202;
        FriendSkinResolver.F[0xC329 ^ 0xC38D] = 0xFFFF3C3C ^ 0xC38D;
        FriendSkinResolver.F[0x2DF2 ^ 0x2DAA] = 0xFFFFD221 ^ 0x2DAA;
        FriendSkinResolver.F[0xA16D ^ 0xA1EF] = 0xFFFF5E62 ^ 0xA1EF;
        FriendSkinResolver.F[0xBB76 ^ 0xBB35] = 0xBB61 ^ 0xBB35;
        FriendSkinResolver.F[0x4819 ^ 0x496B] = 0xD8C0 ^ 0x496B;
        FriendSkinResolver.F[0x9CD1 ^ 0x9CCC] = 0x9CD1 ^ 0x9CCC;
        FriendSkinResolver.F[0xDF06 ^ 0xDE6A] = 0x3F26 ^ 0xDE6A;
        FriendSkinResolver.F[0xCD37 ^ 0xCD80] = 0xCD40 ^ 0xCD80;
        FriendSkinResolver.F[0x57B8 ^ 0x576F] = 0x57F1 ^ 0x576F;
        FriendSkinResolver.F[0x70BC ^ 0x71EA] = 0xF1B6 ^ 0x71EA;
        FriendSkinResolver.F[0x6546 ^ 0x65FC] = 0x65FF ^ 0x65FC;
        FriendSkinResolver.F[0x1094 ^ 0x105E] = 0xD962 ^ 0x105E;
        FriendSkinResolver.F[0x7F5E ^ 0x7ED6] = 0xDB5E ^ 0x7ED6;
        FriendSkinResolver.F[0x2818 ^ 0x2842] = 0x2875 ^ 0x2842;
        FriendSkinResolver.F[0x9DB6 ^ 0x9C9F] = 0x7A41 ^ 0x9C9F;
        FriendSkinResolver.F[0xE906 ^ 0xE907] = 0xE934 ^ 0xE907;
        FriendSkinResolver.F[0x31AB ^ 0x30C8] = 0x87D5 ^ 0x30C8;
        FriendSkinResolver.F[0x8154 ^ 0x8058] = 0x8058 ^ 0x8058;
        FriendSkinResolver.F[0xD064 ^ 0xD02E] = 0xFFFF2F8F ^ 0xD02E;
        FriendSkinResolver.F[0xDD80 ^ 0xDD71] = 0xDD6A ^ 0xDD71;
        FriendSkinResolver.F[0x8A45 ^ 0x8A08] = 0xFFFF75B3 ^ 0x8A08;
        FriendSkinResolver.F[0xA4F7 ^ 0xA4F9] = 0xA4C4 ^ 0xA4F9;
        FriendSkinResolver.F[0x3AEC ^ 0x3B83] = 0xFFFFFAA5 ^ 0x3B83;
        FriendSkinResolver.F[0xC153 ^ 0xC1A8] = 0xFFFF3E69 ^ 0xC1A8;
        FriendSkinResolver.F[0xE3CB ^ 0xE39D] = 0xE3E7 ^ 0xE39D;
        FriendSkinResolver.F[0x9B8F ^ 0x9BE0] = 0xFFFF6429 ^ 0x9BE0;
        FriendSkinResolver.F[0x8246 ^ 0x82D0] = 0x83D3 ^ 0x82D0;
        FriendSkinResolver.F[0xF4B ^ 0xF79] = 0xF47 ^ 0xF79;
        FriendSkinResolver.F[0xA981 ^ 0xA918] = 0xFFFF56BE ^ 0xA918;
        FriendSkinResolver.F[0x5B93 ^ 0x5BC0] = 0xFFFFA404 ^ 0x5BC0;
        FriendSkinResolver.F[0xA76D ^ 0xA62D] = 0xFFFF24B0 ^ 0xA62D;
        FriendSkinResolver.F[0x37F3 ^ 0x3722] = 0x37BD ^ 0x3722;
        FriendSkinResolver.F[0xA78 ^ 0xB6D] = 0xD29F ^ 0xB6D;
        FriendSkinResolver.F[0x2C7F ^ 0x2D1E] = 0x9A76 ^ 0x2D1E;
        FriendSkinResolver.F[0xEA7A ^ 0xEA23] = 0xEA26 ^ 0xEA23;
        FriendSkinResolver.F[0x3B92 ^ 0x3B89] = 0x3BD7 ^ 0x3B89;
        FriendSkinResolver.F[0x22A0 ^ 0x22C8] = 0xFFFFDD18 ^ 0x22C8;
        FriendSkinResolver.F[0x57EB ^ 0x5711] = 0x574C ^ 0x5711;
        FriendSkinResolver.F[0xAB85 ^ 0xAB76] = 0xAB26 ^ 0xAB76;
        FriendSkinResolver.F[0x920A ^ 0x9273] = 0x9260 ^ 0x9273;
        FriendSkinResolver.F[0xBD5 ^ 0xBF7] = 0xFFFFF403 ^ 0xBF7;
        FriendSkinResolver.F[0xF4F7 ^ 0xF597] = 0x7814 ^ 0xF597;
        FriendSkinResolver.F[0xF6E5 ^ 0xF7C5] = 0x5639 ^ 0xF7C5;
        FriendSkinResolver.F[0xBFF1 ^ 0xBF5D] = 0xBF2F ^ 0xBF5D;
        FriendSkinResolver.F[0xDDA0 ^ 0xDCCD] = 0xE238 ^ 0xDCCD;
        FriendSkinResolver.F[0x5DAD ^ 0x5C93] = 0x21DC ^ 0x5C93;
        FriendSkinResolver.F[0x5389 ^ 0x530E] = 0xFFFFACB8 ^ 0x530E;
        FriendSkinResolver.F[0xAEB0 ^ 0xAF34] = 0x9ED2 ^ 0xAF34;
        FriendSkinResolver.F[0xED1A ^ 0xEDEC] = 0xED89 ^ 0xEDEC;
        FriendSkinResolver.F[0x2247 ^ 0x2362] = 0x2FA7 ^ 0x2362;
        FriendSkinResolver.F[0xC305 ^ 0xC396] = 0xFFFF3C3B ^ 0xC396;
        FriendSkinResolver.F[0xEE90 ^ 0xEFE7] = 0xA89 ^ 0xEFE7;
        FriendSkinResolver.F[0x1A3E ^ 0x1AF2] = 0xD1C ^ 0x1AF2;
        FriendSkinResolver.F[0x439F ^ 0x42F9] = 0xF705 ^ 0x42F9;
        FriendSkinResolver.F[0xED10 ^ 0xEDF4] = 0xEDE4 ^ 0xEDF4;
        FriendSkinResolver.F[0x709F ^ 0x706A] = 0x7014 ^ 0x706A;
        FriendSkinResolver.F[0x68E9 ^ 0x6899] = 0x68E9 ^ 0x6899;
        FriendSkinResolver.F[0xC790 ^ 0xC76F] = 0xFFFF38D4 ^ 0xC76F;
        FriendSkinResolver.F[0x10A15 ^ 0x10AF4] = 0x10A94 ^ 0x10AF4;
        FriendSkinResolver.F[0xFFE ^ 0xF36] = 0xA75D ^ 0xF36;
        FriendSkinResolver.F[0x10F1 ^ 0x11B2] = 0xE4B5 ^ 0x11B2;
        FriendSkinResolver.F[0x10DF0 ^ 0x10DCE] = 0xFFFEF228 ^ 0x10DCE;
        FriendSkinResolver.F[0x5744 ^ 0x5655] = 0x5B1F ^ 0x5655;
        FriendSkinResolver.F[0x487 ^ 0x45A] = 0x427 ^ 0x45A;
        FriendSkinResolver.F[0x11F4 ^ 0x1075] = 0x2189 ^ 0x1075;
        FriendSkinResolver.F[0x10A92 ^ 0x10BC2] = 0x1225C ^ 0x10BC2;
        FriendSkinResolver.F[0x43AE ^ 0x43B6] = 0xFFFFBC79 ^ 0x43B6;
        FriendSkinResolver.F[0x104E3 ^ 0x104F4] = 0x104FB ^ 0x104F4;
        FriendSkinResolver.F[0x7964 ^ 0x7966] = 0xFFFF86CD ^ 0x7966;
        FriendSkinResolver.F[0x6692 ^ 0x67FB] = 0x86A1 ^ 0x67FB;
        FriendSkinResolver.F[0xA668 ^ 0xA716] = 0x1CCE ^ 0xA716;
        FriendSkinResolver.F[0x9787 ^ 0x97ED] = 0x97BB ^ 0x97ED;
        FriendSkinResolver.F[0xCF6B ^ 0xCEE6] = 0x57DB ^ 0xCEE6;
        FriendSkinResolver.F[0xC3BD ^ 0xC23F] = 0xF3D9 ^ 0xC23F;
        FriendSkinResolver.F[0x7604 ^ 0x7604] = 0x766C ^ 0x7604;
        FriendSkinResolver.F[0xDD71 ^ 0xDD2D] = 0xDD4A ^ 0xDD2D;
        FriendSkinResolver.F[0x51EA ^ 0x5196] = 0x51D7 ^ 0x5196;
        FriendSkinResolver.F[0x30EA ^ 0x309D] = 0x30EB ^ 0x309D;
        FriendSkinResolver.F[0x690E ^ 0x6815] = 0xF116 ^ 0x6815;
        FriendSkinResolver.F[0x512D ^ 0x51B6] = 0xFFFFAE64 ^ 0x51B6;
        FriendSkinResolver.F[0xF996 ^ 0xF9ED] = 0xFFFF06AB ^ 0xF9ED;
        FriendSkinResolver.F[0xE4EB ^ 0xE59B] = 0xDB6C ^ 0xE59B;
        FriendSkinResolver.F[0x100E9 ^ 0x1018E] = 0x1B404 ^ 0x1018E;
        FriendSkinResolver.F[0x27D8 ^ 0x27CB] = 0x27A9 ^ 0x27CB;
        FriendSkinResolver.F[0x9FAF ^ 0x9FEE] = 0xFFFF606F ^ 0x9FEE;
        FriendSkinResolver.F[0xE3FD ^ 0xE2DA] = 0x404 ^ 0xE2DA;
        FriendSkinResolver.F[0xF38F ^ 0xF3EE] = 0xF3DC ^ 0xF3EE;
        FriendSkinResolver.F[0x246D ^ 0x25E1] = 0x5926 ^ 0x25E1;
        FriendSkinResolver.F[0xA6F ^ 0xB72] = 0x9271 ^ 0xB72;
        FriendSkinResolver.F[0x1905 ^ 0x19EF] = 0xFFFFE622 ^ 0x19EF;
        FriendSkinResolver.F[0x5918 ^ 0x590A] = 0xFFFFA6F6 ^ 0x590A;
        FriendSkinResolver.F[0x2169 ^ 0x21C7] = 0xFFFFDE22 ^ 0x21C7;
        FriendSkinResolver.F[0xC7B ^ 0xC44] = 0xFFFFF3BD ^ 0xC44;
        FriendSkinResolver.F[0x14E6 ^ 0x1479] = 0x14B7 ^ 0x1479;
        FriendSkinResolver.F[0x5A70 ^ 0x5AA4] = 0x5AFE ^ 0x5AA4;
        FriendSkinResolver.F[0xC770 ^ 0xC6F6] = 0x637E ^ 0xC6F6;
        FriendSkinResolver.F[0x7B2F ^ 0x7A6A] = 0x8F6D ^ 0x7A6A;
        FriendSkinResolver.F[0xDBB4 ^ 0xDBE4] = 0xDBC8 ^ 0xDBE4;
        FriendSkinResolver.F[0x2C48 ^ 0x2CA0] = 0xFFFFD353 ^ 0x2CA0;
        FriendSkinResolver.F[0xFF0F ^ 0xFE17] = 0xE2BE ^ 0xFE17;
        FriendSkinResolver.F[0x1AA4 ^ 0x1B8F] = 0x345A ^ 0x1B8F;
        FriendSkinResolver.F[0xC822 ^ 0xC807] = 0xFFFF37AD ^ 0xC807;
        FriendSkinResolver.F[0x91B4 ^ 0x919F] = 0xFFFF6E17 ^ 0x919F;
        FriendSkinResolver.F[0x6E1 ^ 0x7E5] = 0x7D0 ^ 0x7E5;
        FriendSkinResolver.F[0xE065 ^ 0xE04A] = 0xFFFF1FE9 ^ 0xE04A;
        FriendSkinResolver.F[0x6F32 ^ 0x6F0A] = 0xFFFF90EF ^ 0x6F0A;
    }
}


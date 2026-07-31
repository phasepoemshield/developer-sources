/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.friend;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.interfaces.ILoadable;
import kotakbaz.rain.friend.A;
import kotakbaz.rain.friend.B;
import kotakbaz.rain.friend.FriendSkinResolver;
import kotakbaz.rain.friend.b;
import kotakbaz.rain.friend.b_0;
import kotakbaz.rain.friend.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003@ABB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u00a2\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b \u0010\u0010J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003J\u001b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\"\u0010\u001bJ\u001b\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b$\u0010\u001bJ\u000f\u0010%\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002\u00a2\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b(\u0010\u0003J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b)\u0010\u001bR\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010+R\u001c\u00101\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R\u001c\u00104\u001a\n 0*\u0004\u0018\u000103038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00105R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010<\u001a\u00020;8\u0006\u00a2\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\u00a8\u0006C"}, d2={"Lkotakbaz/rain/friend/FriendManager;", "Lkotakbaz/rain/client/interfaces/ILoadable;", "<init>", "()V", "", "load", "", "name", "Lkotakbaz/rain/friend/FriendManager$AddResult;", "add", "(Ljava/lang/String;)Lkotakbaz/rain/friend/FriendManager$AddResult;", "Lkotakbaz/rain/friend/FriendManager$RemoveResult;", "remove", "(Ljava/lang/String;)Lkotakbaz/rain/friend/FriendManager$RemoveResult;", "", "clear", "()Z", "isFriend", "(Ljava/lang/String;)Z", "", "getFriends", "()Ljava/util/List;", "Lkotakbaz/rain/friend/FriendManager$FriendEntry;", "getFriendEntries", "getFriend", "(Ljava/lang/String;)Lkotakbaz/rain/friend/FriendManager$FriendEntry;", "getAddedDate", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/google/gson/JsonArray;", "friends", "loadFriends", "(Lcom/google/gson/JsonArray;)Z", "save", "ensureDirectory", "sanitizeName", "value", "sanitizeDate", "currentDate", "()Ljava/lang/String;", "sortedEntries", "invalidateSortedEntries", "normalize", "FRIENDS_KEY", "Ljava/lang/String;", "NAME_KEY", "ADDED_AT_KEY", "PIN_KEY", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "Ljava/time/format/DateTimeFormatter;", "dateFormatter", "Ljava/time/format/DateTimeFormatter;", "Ljava/util/LinkedHashMap;", "friendsByName", "Ljava/util/LinkedHashMap;", "sortedEntriesCache", "Ljava/util/List;", "Ljava/nio/file/Path;", "filePath", "Ljava/nio/file/Path;", "getFilePath", "()Ljava/nio/file/Path;", "FriendEntry", "AddResult", "RemoveResult", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFriendManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendManager.kt\nkotakbaz/rain/friend/FriendManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1586#2:250\n1661#2,3:251\n1915#2,2:254\n1915#2,2:256\n1068#2:259\n1#3:258\n*S KotlinDebug\n*F\n+ 1 FriendManager.kt\nkotakbaz/rain/friend/FriendManager\n*L\n115#1:250\n115#1:251,3\n135#1:254,2\n171#1:256,2\n214#1:259\n*E\n"})
public final class FriendManager
implements ILoadable {
    @NotNull
    public static final FriendManager INSTANCE;
    @NotNull
    private static final String a = "friends";
    @NotNull
    private static final String A = "name";
    @NotNull
    private static final String b = "addedAt";
    @NotNull
    private static final String B = "pin";
    private static final Gson c;
    private static final DateTimeFormatter C;
    @NotNull
    private static final LinkedHashMap<String, b_0> d;
    @Nullable
    private static List<b_0> D;
    @NotNull
    private static final Path e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    private FriendManager() {
    }

    @NotNull
    public final Path getFilePath() {
        return e;
    }

    @Override
    public void load() {
        long l2 = 6169901897646318186L;
        this.ensureDirectory();
        d.clear();
        this.invalidateSortedEntries();
        int n2 = h[0];
        n2 += h[1];
        if (!Files.exists(e, new LinkOption[n2 -= h[2]])) {
            return;
        }
        FriendManager friendManager = this;
        try {
            JsonArray jsonArray;
            Object object = friendManager;
            long l3 = l2;
            int n3 = h[3];
            n3 ^= h[4];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 += h[5]);
            JsonElement jsonElement = JsonParser.parseString(Files.readString(e));
            if (jsonElement.isJsonArray()) {
                jsonArray = jsonElement.getAsJsonArray();
            } else if (jsonElement.isJsonObject()) {
                int n4 = h[6];
                n4 += h[7];
                jsonArray = jsonElement.getAsJsonObject().getAsJsonArray((String)E[n4 += h[8]]);
            } else {
                jsonArray = null;
            }
            if (jsonArray == null) {
                return;
            }
            JsonArray jsonArray2 = jsonArray;
            if (((FriendManager)object).loadFriends(jsonArray2)) {
                ((FriendManager)object).invalidateSortedEntries();
                ((FriendManager)object).save();
            }
            object = Result.cfr_renamed_1(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            Object object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
    }

    @NotNull
    public final c add(@NotNull String name) {
        int n2 = h[9];
        n2 -= h[10];
        Intrinsics.checkNotNullParameter(name, (String)E[n2 += h[11]]);
        String string = this.sanitizeName(name);
        if (string == null) {
            return kotakbaz.rain.friend.c.b;
        }
        String string2 = string;
        String string3 = this.normalize(string2);
        if (d.containsKey(string3)) {
            return kotakbaz.rain.friend.c.A;
        }
        boolean bl = h[12];
        bl ^= h[13];
        int n3 = h[15];
        n3 += h[16];
        B b2 = new B(string2, this.currentDate(), bl -= h[14], n3 ^= h[17], null);
        ((Map)d).put(string3, b2);
        this.invalidateSortedEntries();
        if (!this.save()) {
            d.remove(string3);
            this.invalidateSortedEntries();
            return kotakbaz.rain.friend.c.B;
        }
        FriendSkinResolver.INSTANCE.requestSkin((b_0)((Object)b2));
        return kotakbaz.rain.friend.c.a;
    }

    @NotNull
    public final A remove(@NotNull String name) {
        int n2 = h[18];
        n2 -= h[19];
        Intrinsics.checkNotNullParameter(name, (String)E[n2 ^= h[20]]);
        String string = this.sanitizeName(name);
        if (string == null) {
            return kotakbaz.rain.friend.A.b;
        }
        String string2 = string;
        String string3 = this.normalize(string2);
        B b2 = (B)d.remove(string3);
        if (b2 == null) {
            return kotakbaz.rain.friend.A.A;
        }
        B b3 = b2;
        this.invalidateSortedEntries();
        if (!this.save()) {
            ((Map)d).put(string3, b3);
            this.invalidateSortedEntries();
            return kotakbaz.rain.friend.A.B;
        }
        FriendSkinResolver.INSTANCE.clear((b_0)((Object)b3));
        return kotakbaz.rain.friend.A.a;
    }

    public final boolean clear() {
        if (d.isEmpty()) {
            boolean bl = h[21];
            bl += h[22];
            return bl ^= h[23];
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        d.clear();
        this.invalidateSortedEntries();
        if (this.save()) {
            FriendSkinResolver.INSTANCE.clearAll();
            boolean bl = h[24];
            bl -= h[25];
            return bl ^= h[26];
        }
        d.putAll(linkedHashMap);
        this.invalidateSortedEntries();
        boolean bl = h[27];
        bl -= h[28];
        return bl -= h[29];
    }

    public final boolean isFriend(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            boolean bl = h[30];
            bl -= h[31];
            return bl += h[32];
        }
        String string2 = string;
        return d.containsKey(this.normalize(string2));
    }

    @NotNull
    public final List<String> getFriends() {
        long l2 = -5737469828478141907L;
        long l3 = -7439650588582819878L;
        Iterable iterable = this.sortedEntries();
        long l4 = l2;
        int n2 = h[33];
        n2 -= h[34];
        l2 = l4 ^ (0L ^ l4) & -1L << (n2 ^= h[35]);
        Iterable iterable2 = iterable;
        int n3 = h[36];
        n3 += h[37];
        Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, n3 -= h[38]));
        long l5 = l2;
        int n4 = h[39];
        n4 += h[40];
        l2 = l5 ^ (0L ^ l5) & -1L >>> (n4 += h[41]);
        for (Object t2 : iterable2) {
            B b2 = (B)t2;
            Collection collection2 = collection;
            long l6 = l3;
            int n5 = h[42];
            n5 += h[43];
            l3 = l6 ^ (0L ^ l6) & -1L << (n5 += h[44]);
            collection2.add(b2.getName());
        }
        return (List)collection;
    }

    @NotNull
    public final List<b_0> getFriendEntries() {
        return this.sortedEntries();
    }

    @Nullable
    public final b_0 getFriend(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            return null;
        }
        String string2 = string;
        return (B)((Object)d.get(this.normalize(string2)));
    }

    @Nullable
    public final String getAddedDate(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            return null;
        }
        String string2 = string;
        B b2 = (B)((Object)d.get(this.normalize(string2)));
        return b2 != null ? b2.getAddedAt() : null;
    }

    private final boolean loadFriends(JsonArray friends) {
        long l2;
        long l3 = -8168562502906858594L;
        long l4 = 597429617760843680L;
        long l5 = -6466396394274978608L;
        long l6 = -537675919400871105L;
        long l7 = l2 = -5593715795589116059L;
        int n2 = h[45];
        n2 += h[46];
        l2 = l7 ^ (0L ^ l7) & -1L >>> (n2 -= h[47]);
        Iterable iterable = friends;
        long l8 = l6;
        int n3 = h[48];
        n3 += h[49];
        l6 = l8 ^ (0L ^ l8) & -1L >>> (n3 += h[50]);
        for (Object t2 : iterable) {
            String string;
            int n4;
            JsonObject jsonObject;
            JsonElement jsonElement = (JsonElement)t2;
            long l9 = l2;
            int n5 = h[51];
            n5 += h[52];
            l2 = l9 ^ (0L ^ l9) & -1L << (n5 += h[53]);
            if (jsonElement.isJsonPrimitive()) {
                if (INSTANCE.sanitizeName(jsonElement.getAsString()) == null) continue;
                boolean bl = h[54];
                bl ^= h[55];
                int n6 = h[57];
                n6 += h[58];
                d.putIfAbsent(INSTANCE.normalize((String)((Object)jsonObject)), (b_0)((Object)new B((String)((Object)jsonObject), INSTANCE.currentDate(), bl -= h[56], n6 ^= h[59], null)));
                long l10 = l2;
                int n7 = h[60];
                n7 -= h[61];
                l2 = l10 ^ (1L ^ l10) & -1L >>> (n7 ^= h[62]);
                continue;
            }
            if (!jsonElement.isJsonObject()) continue;
            jsonObject = jsonElement.getAsJsonObject();
            int n8 = h[63];
            n8 += h[64];
            JsonElement jsonElement2 = jsonObject.get((String)E[n8 -= h[65]]);
            if (INSTANCE.sanitizeName(jsonElement2 != null ? jsonElement2.getAsString() : null) == null) continue;
            int n9 = h[66];
            n9 += h[67];
            JsonElement jsonElement3 = jsonObject.get((String)E[n9 -= h[68]]);
            String string2 = INSTANCE.sanitizeDate(jsonElement3 != null ? jsonElement3.getAsString() : null);
            int n10 = h[69];
            n10 -= h[70];
            JsonElement jsonElement4 = jsonObject.get((String)E[n10 += h[71]]);
            if (jsonElement4 != null) {
                n4 = jsonElement4.getAsBoolean();
            } else {
                int n11 = h[72];
                n11 -= h[73];
                n4 = n11 ^= h[74];
            }
            long l11 = l4;
            int n12 = h[75];
            n12 ^= h[76];
            l4 = l11 ^ ((long)n4 ^ l11) & -1L >>> (n12 += h[77]);
            if (string2 == null) {
                long l12 = l2;
                int n13 = h[78];
                n13 += h[79];
                l2 = l12 ^ (1L ^ l12) & -1L >>> (n13 ^= h[80]);
            }
            int n14 = h[81];
            n14 ^= h[82];
            if (!jsonObject.has((String)E[n14 -= h[83]])) {
                long l13 = l2;
                int n15 = h[84];
                n15 += h[85];
                l2 = l13 ^ (1L ^ l13) & -1L >>> (n15 -= h[86]);
            }
            String string4 = INSTANCE.normalize(string);
            string4 = string2;
            if (string4 == null) {
                string4 = INSTANCE.currentDate();
            }
            d.putIfAbsent(string3, (b_0)((Object)new B(string, string4, (boolean)l4)));
        }
        return (int)l2 != 0;
    }

    private final boolean save() {
        Object object;
        Object object2;
        long l2 = 6964573865868895538L;
        long l3 = -7079845559592203541L;
        this.ensureDirectory();
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Object object3 = this.sortedEntries();
        long l4 = l2;
        int n2 = h[87];
        n2 += h[88];
        l2 = l4 ^ (0L ^ l4) & -1L << (n2 ^= h[89]);
        Iterator iterator2 = object3.iterator();
        while (iterator2.hasNext()) {
            object2 = iterator2.next();
            B b2 = (B)object2;
            long l5 = l2;
            int n3 = h[90];
            n3 ^= h[91];
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n3 -= h[92]);
            JsonObject jsonObject2 = new JsonObject();
            int n4 = h[93];
            n4 -= h[94];
            jsonObject2.addProperty((String)E[n4 ^= h[95]], b2.getName());
            int n5 = h[96];
            n5 ^= h[97];
            jsonObject2.addProperty((String)E[n5 -= h[98]], b2.getAddedAt());
            int n6 = h[99];
            n6 += h[100];
            jsonObject2.addProperty((String)E[n6 -= h[101]], b2.getPin());
            jsonArray.add(jsonObject2);
        }
        int n7 = h[102];
        n7 -= h[103];
        jsonObject.add((String)E[n7 -= h[104]], jsonArray);
        object3 = this;
        try {
            object = (FriendManager)object3;
            long l6 = l3;
            int n8 = h[105];
            n8 ^= h[106];
            l3 = l6 ^ (0L ^ l6) & -1L << (n8 += h[107]);
            int n9 = h[108];
            n9 ^= h[109];
            object2 = new OpenOption[n9 -= h[110]];
            int n10 = h[111];
            n10 ^= h[112];
            object2[n10 += FriendManager.h[113]] = StandardOpenOption.CREATE;
            int n11 = h[114];
            n11 ^= h[115];
            object2[n11 ^= FriendManager.h[116]] = StandardOpenOption.TRUNCATE_EXISTING;
            int n12 = h[117];
            n12 += h[118];
            object2[n12 ^= FriendManager.h[119]] = StandardOpenOption.WRITE;
            object = Result.cfr_renamed_1(Files.writeString(e, (CharSequence)c.toJson(jsonObject), object2));
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        return Result.cfr_renamed_4(object);
    }

    private final void ensureDirectory() {
        int n2 = h[120];
        n2 -= h[121];
        Files.createDirectories(e.getParent(), new FileAttribute[n2 += h[122]]);
    }

    private final String sanitizeName(String name) {
        String string;
        long l2 = 7909410990097490205L;
        String string2 = name;
        if (string2 != null && (string2 = ((Object)StringsKt.trim((CharSequence)string2)).toString()) != null) {
            int n2;
            String string3;
            String string4 = string3 = string2;
            long l3 = l2;
            int n3 = h[123];
            n3 -= h[124];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 += h[125]);
            if (((CharSequence)string4).length() > 0) {
                int n4 = h[126];
                n4 += h[127];
                n2 = n4 ^= h[128];
            } else {
                int n5 = h[129];
                n5 += h[130];
                n2 = n5 ^= h[131];
            }
            string = n2 != 0 ? string3 : null;
        } else {
            string = null;
        }
        return string;
    }

    private final String sanitizeDate(String value2) {
        Object object;
        String string;
        long l2;
        block8: {
            block7: {
                int n2;
                String string2;
                l2 = 925471427363762732L;
                string = value2;
                if (string == null || (string = ((Object)StringsKt.trim((CharSequence)string)).toString()) == null) break block7;
                String string3 = string2 = string;
                long l3 = l2;
                int n3 = h[132];
                n3 += h[133];
                l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= h[134]);
                if (((CharSequence)string3).length() > 0) {
                    int n4 = h[135];
                    n4 ^= h[136];
                    n2 = n4 += h[137];
                } else {
                    int n5 = h[138];
                    n5 += h[139];
                    n2 = n5 ^= h[140];
                }
                if ((string = n2 != 0 ? string2 : null) != null) break block8;
            }
            return null;
        }
        String string4 = string;
        Object object2 = this;
        try {
            object = object2;
            long l4 = l2;
            int n6 = h[141];
            n6 += h[142];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n6 += h[143]);
            object = Result.cfr_renamed_1(LocalDate.parse(string4, C).format(C));
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (String)(Result.cfr_renamed_3(object2) ? null : object2);
    }

    private final String currentDate() {
        String string = LocalDate.now().format(C);
        int n2 = h[144];
        n2 ^= h[145];
        Intrinsics.checkNotNullExpressionValue(string, (String)E[n2 ^= h[146]]);
        return string;
    }

    private final List<b_0> sortedEntries() {
        long l2 = 892274901954351941L;
        long l3 = 6769031889125831107L;
        List<b_0> list = D;
        if (list != null) {
            List<b_0> list2 = list;
            long l4 = l2;
            int n2 = h[147];
            n2 ^= h[148];
            l2 = l4 ^ (0L ^ l4) & -1L << (n2 += h[149]);
            return list2;
        }
        Collection<b_0> collection = d.values();
        int n3 = h[150];
        n3 ^= h[151];
        int n4 = h[153];
        n4 += h[154];
        int n5 = h[156];
        n5 ^= h[157];
        Intrinsics.checkNotNullExpressionValue(collection, (String)E[n3 -= h[152]] + (String)E[n4 -= h[155]] + (String)E[n5 += h[158]]);
        List<b_0> list3 = (List<b_0>)collection;
        long l5 = l2;
        int n6 = h[159];
        n6 ^= h[160];
        l2 = l5 ^ (0L ^ l5) & -1L >>> (n6 ^= h[161]);
        List<b_0> list4 = list3 = CollectionsKt.sortedWith(list3, new b());
        long l6 = l3;
        int n7 = h[162];
        n7 -= h[163];
        l3 = l6 ^ (0L ^ l6) & -1L << (n7 -= h[164]);
        D = list4;
        return list3;
    }

    private final void invalidateSortedEntries() {
        D = null;
    }

    private final String normalize(String name) {
        String string = name;
        Locale locale = Locale.ROOT;
        int n2 = h[165];
        n2 -= h[166];
        Intrinsics.checkNotNullExpressionValue(locale, (String)E[n2 += h[167]]);
        String string2 = string.toLowerCase(locale);
        int n3 = h[168];
        n3 += h[169];
        int n4 = h[171];
        n4 ^= h[172];
        Intrinsics.checkNotNullExpressionValue(string2, (String)E[n3 -= h[170]] + (String)E[n4 += h[173]]);
        return string2;
    }

    static {
        FriendManager.b();
        long l2 = 6933493892320844610L;
        long l3 = -3579443474669179918L;
        long l4 = -5596200328349774350L;
        long l5 = -4455028736239917645L;
        long l6 = -4273990561991394639L;
        long l7 = 618636141722398988L;
        long l8 = 3261440508298268614L;
        long l9 = -8319559635428841305L;
        long l10 = -3316694292751330785L;
        long l11 = 605510252150476961L;
        long l12 = -7656320417928684479L;
        long l13 = -5021859907648212830L;
        long l14 = -60961254839166855L;
        long l15 = -7001748329407284435L;
        int n2 = h[174];
        n2 += h[175];
        E = new Object[n2 -= h[176]];
        long l16 = l15;
        int n3 = h[177];
        n3 += h[178];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += h[179]);
        Object[] objectArray = new Object[h[180]];
        objectArray[FriendManager.h[181]] = f;
        objectArray[FriendManager.h[182]] = h[183];
        int n4 = h[184];
        Object object = FriendManager.A()[h[185]];
        if (object == null) {
            char[] cArray = "\u33aa\u338b\u33a5\u33b4\u337c\u336b\u3396\u33a4\u33aa\u339f\u3398\u3392\u337a\u336e\u336d\u33bf\u33b3\u33b6\u3395\u3386\u338e\u3376\u33ad\u33b4\u3394\u3397\u3385\u33a0\u33bf\u3384\u3397\u33b7\u33a9\u3392\u337a\u3377\u33a9\u33a9\u3379\u3376\u337a\u339d\u33a5\u33bf\u33b5\u33a7\u33aa\u338e\u339b\u337e\u3380\u3393\u3370\u337a\u3370\u3391\u3385\u3392\u33bc\u337b\u339b\u339e\u3379\u3369\u3371\u3389\u3394\u3385\u3387\u33b4\u3399\u33a4\u337c\u3379\u338a\u338e\u3389\u339a\u3395\u3386\u33b4\u33a5\u339c\u3369\u3386\u33b4\u337d\u33a0\u3386\u33aa\u3394\u337d\u33a0\u3399\u33b3\u3395\u33b3\u3376\u3390\u338a\u336b\u33a6\u3393\u33b6\u33b5\u339a\u33b0\u3384\u3380\u337c\u338e\u33a7\u3390\u3399\u337b\u339d\u3386\u3377\u337f\u337a\u338b\u339b\u3379\u33a7\u3380\u3380\u33b6\u339d\u33a9\u3391\u33bf\u33a6\u336a\u33a5\u33a7\u3389\u3391\u33b4\u339c\u339f\u337b\u33a5\u33ab\u3370\u338a\u3390\u3375\u339e\u3386\u3399\u3374\u3373\u3372\u337f\u3371\u33b6\u3385\u337e\u3396\u3379\u337e\u337e\u3378\u33a4\u3390\u33a5\u337f\u33b7\u3373\u3377\u338d\u3390\u3385\u339e\u3395\u3394\u338d\u3390\u3386\u337d\u339e\u338d\u33b5\u337c\u33b3\u33bf\u3393\u3370\u3389\u3375\u3374\u3391\u3377\u339c\u33a0\u3375\u3394\u33a6\u3380\u3384\u3389\u33b3\u3394\u339e\u337e\u3377\u3395\u339c\u339d\u336d\u3397\u336e\u3389\u336e\u339a\u336b\u33b5\u33bf\u3398\u33ad\u3377\u33a5\u33a6\u3387\u339b\u3384\u33a4\u33ad\u3399\u33a6\u3379\u339c\u339c\u339a\u3378\u3373\u337b\u33ad\u33bf\u337f\u338e\u33b5\u33aa\u339b\u337c\u338e\u3391\u3379\u3387\u3385\u3390\u33b3\u3377\u3384\u336d\u33a6\u337c\u33ad\u3369\u3392\u33bc\u33a9\u3394\u33b5\u3369\u3372\u33a0\u3378\u339c\u33a4\u337c\u3389\u33aa\u337d\u3384\u33b7\u33a6\u33a5\u33e1\u33e1".toCharArray();
            for (int i2 = h[186]; i2 < h[187]; ++i2) {
                int n5 = cArray[i2];
                n5 += h[188];
                n5 ^= h[189];
                n5 ^= h[190];
                n5 -= h[191];
                n5 -= h[192];
                n5 -= h[193];
                n5 -= h[194];
                n5 += h[195];
                n5 += h[196];
                n5 ^= h[197];
                n5 += h[198];
                n5 ^= h[199];
                cArray[i2] = (char)(n5 ^= h[200]);
            }
            object = FriendManager.A()[FriendManager.h[201]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)FriendManager.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = h[202];
        n6 ^= h[203];
        l6 = l17 ^ (0xBB00000000L ^ l17) & -1L << (n6 ^= h[204]);
        long l18 = l13;
        int n7 = h[205];
        n7 ^= h[206];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += h[207]);
        while (true) {
            int n8 = h[208];
            n8 ^= h[209];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= h[210]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = h[211];
            n10 -= h[212];
            int n11 = h[214];
            n11 ^= h[215];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= h[213])) & -1L >>> (n11 ^= h[216]);
            long l20 = l9;
            int n12 = h[217];
            n12 ^= h[218];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += h[219]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = h[220];
            n14 ^= h[221];
            int n15 = h[223];
            n15 ^= h[224];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += h[222])) & -1L >>> (n15 ^= h[225]);
            int n16 = h[226];
            n16 += h[227];
            long l22 = l10;
            int n17 = h[229];
            n17 += h[230];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= h[228]) ^ l22) & -1L << (n17 ^= h[231]);
            int n18 = h[232];
            n18 ^= h[233];
            n18 -= h[234];
            int n19 = h[235];
            n19 += h[236];
            long l23 = l12;
            int n20 = h[238];
            n20 += h[239];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= h[237]))) ^ l23) & -1L >>> (n20 += h[240]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = h[241];
            n21 ^= h[242];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= h[243]);
            while (true) {
                int n22 = h[244];
                if ((int)(l14 >>> (n22 -= h[245])) >= (int)l12) break;
                int n23 = h[246];
                n23 ^= h[247];
                int n24 = h[249];
                n24 -= h[250];
                cArray2[(int)(l14 >>> (n23 -= FriendManager.h[248]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= h[251]))];
                l14 += 0x100000000L;
            }
            int n25 = h[252];
            n25 += h[253];
            int n26 = (int)(l15 >>> (n25 ^= h[254]));
            l15 += 0x100000000L;
            FriendManager.E[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = h[255];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += h[256]);
        }
        INSTANCE = new FriendManager();
        c = new GsonBuilder().setPrettyPrinting().create();
        int n28 = h[257];
        n28 ^= h[258];
        C = DateTimeFormatter.ofPattern((String)E[n28 += h[259]], Locale.ROOT);
        d = new LinkedHashMap();
        int n29 = h[260];
        n29 ^= h[261];
        n29 ^= h[262];
        int n30 = h[263];
        n30 -= h[264];
        String[] stringArray = new String[n30 -= h[265]];
        int n31 = h[266];
        n31 ^= h[267];
        int n32 = h[269];
        n32 -= h[270];
        stringArray[n31 += FriendManager.h[268]] = (String)E[n32 -= h[271]];
        int n33 = h[272];
        n33 -= h[273];
        int n34 = h[275];
        n34 += h[276];
        stringArray[n33 += FriendManager.h[274]] = (String)E[n34 ^= h[277]];
        Path path = Paths.get(System.getProperty((String)E[n29]), stringArray);
        int n35 = h[278];
        n35 ^= h[279];
        Intrinsics.checkNotNullExpressionValue(path, (String)E[n35 += h[280]]);
        e = path;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[h[281]];
        String string = (String)object[h[282]];
        object = object[h[283]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[284]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[285]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[287] ^ h[288]];
                byArray[FriendManager.h[289] ^ FriendManager.h[290]] = h[291] ^ h[292];
                byArray[FriendManager.h[293] ^ FriendManager.h[294]] = h[295] ^ h[296];
                byArray[FriendManager.h[297] ^ FriendManager.h[298]] = h[299] ^ h[300];
                byArray[FriendManager.h[301] ^ FriendManager.h[302]] = h[303] ^ h[304];
                byArray[FriendManager.h[305] ^ FriendManager.h[306]] = h[307] ^ h[308];
                byArray[FriendManager.h[309] ^ FriendManager.h[310]] = h[311] ^ h[312];
                byArray[FriendManager.h[313] ^ FriendManager.h[314]] = h[315] ^ h[316];
                byArray[FriendManager.h[317] ^ FriendManager.h[318]] = h[319] ^ h[320];
                byArray[FriendManager.h[321] ^ FriendManager.h[322]] = h[323] ^ h[324];
                byArray[FriendManager.h[325] ^ FriendManager.h[326]] = h[327] ^ h[328];
                byArray[FriendManager.h[329] ^ FriendManager.h[330]] = h[331] ^ h[332];
                byArray[FriendManager.h[333] ^ FriendManager.h[334]] = h[335] ^ h[336];
                byArray[FriendManager.h[337] ^ FriendManager.h[338]] = h[339] ^ h[340];
                byArray[FriendManager.h[341] ^ FriendManager.h[342]] = h[343] ^ h[344];
                byArray[FriendManager.h[345] ^ FriendManager.h[346]] = h[347] ^ h[348];
                byArray[FriendManager.h[349] ^ FriendManager.h[350]] = h[351] ^ h[352];
                objectArray2[FriendManager.h[286]] = byArray;
            }
            byte[] byArray = (byte[])object3[h[353]];
            if (F == null) {
                byte[] byArray2 = new byte[h[354] ^ h[355]];
                byArray2[FriendManager.h[356] ^ FriendManager.h[357]] = h[358] ^ h[359];
                byArray2[FriendManager.h[360] ^ FriendManager.h[361]] = h[362] ^ h[363];
                byArray2[FriendManager.h[364] ^ FriendManager.h[365]] = h[366] ^ h[367];
                byArray2[FriendManager.h[368] ^ FriendManager.h[369]] = h[370] ^ h[371];
                byArray2[FriendManager.h[372] ^ FriendManager.h[373]] = h[374] ^ h[375];
                byArray2[FriendManager.h[376] ^ FriendManager.h[377]] = h[378] ^ h[379];
                byArray2[FriendManager.h[380] ^ FriendManager.h[381]] = h[382] ^ h[383];
                byArray2[FriendManager.h[384] ^ FriendManager.h[385]] = h[386] ^ h[387];
                byArray2[FriendManager.h[388] ^ FriendManager.h[389]] = h[390] ^ h[391];
                byArray2[FriendManager.h[392] ^ FriendManager.h[393]] = h[394] ^ h[395];
                byArray2[FriendManager.h[396] ^ FriendManager.h[397]] = h[398] ^ h[399];
                byArray2[0x2DBC ^ 0x2DBD] = 0xFFFFD25E ^ 0x2DBD;
                byArray2[0xE339 ^ 0xE325] = 0xFFFF1C93 ^ 0xE325;
                byArray2[0x1A7C ^ 0x1A6E] = 0x1A0F ^ 0x1A6E;
                byArray2[0x949D ^ 0x9493] = 0x94CC ^ 0x9493;
                byArray2[0xDDEA ^ 0xDDF0] = 0xDDA6 ^ 0xDDF0;
                byArray2[0x9876 ^ 0x9876] = 0x9817 ^ 0x9876;
                byArray2[0x5320 ^ 0x5324] = 0x5353 ^ 0x5324;
                byArray2[0xCE72 ^ 0xCE62] = 0xFFFF318A ^ 0xCE62;
                byArray2[0xDE70 ^ 0xDE7B] = 0xFFFF21DE ^ 0xDE7B;
                byArray2[0x704F ^ 0x7052] = 0x7050 ^ 0x7052;
                byArray2[0xCFC4 ^ 0xCFD2] = 0xCFDF ^ 0xCFD2;
                byArray2[0xCBBA ^ 0xCBB3] = 0xCB98 ^ 0xCBB3;
                byArray2[0x2F7B ^ 0x2F7D] = 0x2F2C ^ 0x2F7D;
                byArray2[0x4009 ^ 0x400C] = 0x4061 ^ 0x400C;
                byArray2[0x2D4D ^ 0x2D58] = 0xFFFFD28E ^ 0x2D58;
                byArray2[0x6CAB ^ 0x6CA1] = 0xFFFF930B ^ 0x6CA1;
                byArray2[0x763 ^ 0x76E] = 0x724 ^ 0x76E;
                byArray2[0xDD48 ^ 0xDD5B] = 0xDD0B ^ 0xDD5B;
                byArray2[0xB5F1 ^ 0xB5FD] = 0xFFFF4A57 ^ 0xB5FD;
                byArray2[0xE875 ^ 0xE877] = 0xE87D ^ 0xE877;
                byArray2[0x8259 ^ 0x824D] = 0x8263 ^ 0x824D;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = FriendManager.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u3af6\u3af0\u3afb\u3af2\u3aec\u3b60\u3aff\u3b19\u3b22\u3b0e\u3aee\u3b15\u3b11\u3b13\u3b03\u3aee\u3af1\u3b61".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 57856;
                        n3 += 46467;
                        n3 -= 30134;
                        n3 -= 9657;
                        n3 ^= 0x1729;
                        n3 ^= 0x5FE9;
                        n3 ^= 0x9789;
                        n3 ^= 0x467A;
                        n3 ^= 0x3FCA;
                        n3 ^= 0x9BC;
                        cArray[i2] = (char)(n3 -= 56319);
                    }
                    object4 = FriendManager.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[10] = 98;
                byArray4[0] = 43;
                byArray4[9] = -57;
                byArray4[4] = -121;
                byArray4[2] = 118;
                byArray4[12] = 59;
                byArray4[13] = -80;
                byArray4[6] = 44;
                byArray4[8] = 60;
                byArray4[1] = 98;
                byArray4[11] = -1;
                byArray4[7] = -65;
                byArray4[3] = -29;
                byArray4[15] = -57;
                byArray4[5] = 110;
                byArray4[14] = -89;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 16, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = FriendManager.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u1db3\u1daf\u1ec1".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 59712;
                        n4 ^= 0xA962;
                        n4 += 65188;
                        n4 ^= 0xE928;
                        n4 -= 6442;
                        n4 -= 22763;
                        n4 -= 29388;
                        n4 ^= 0xDE8C;
                        n4 += 16306;
                        n4 += 33811;
                        n4 += 25140;
                        n4 ^= 0x8254;
                        n4 ^= 0x9FB4;
                        cArray[i3] = (char)(n4 += 39800);
                    }
                    object5 = FriendManager.A()[2] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = FriendManager.A()[3];
            if (object6 == null) {
                char[] cArray = "\u351d\u3501\u35af\u36eb\u351f\u351e\u351f\u36eb\u35ac\u3517\u351f\u35af\u36b1\u35ac\u357d\u3570\u3570\u3575\u35aa\u3573".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x4AB1;
                    n5 += 40482;
                    n5 += 52324;
                    n5 -= 63591;
                    n5 ^= 0xBE48;
                    n5 += 10394;
                    n5 -= 12811;
                    n5 ^= 0x1D9E;
                    n5 -= 53950;
                    cArray[i4] = (char)(n5 ^= 0x888F);
                }
                object6 = FriendManager.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)F), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = G;
        if (G == null) {
            G = new Object[4];
            objectArray = G;
        }
        return objectArray;
    }

    public static void b() {
        h = new int[0xDB24 ^ 0xDAB4];
        FriendManager.h[0xA762 ^ 0xA602] = 0x5B87 ^ 0xA602;
        FriendManager.h[0x2273 ^ 0x22CF] = 0xF12F ^ 0x22CF;
        FriendManager.h[0xAD63 ^ 0xADB1] = 0xADFC ^ 0xADB1;
        FriendManager.h[0x4994 ^ 0x49A7] = 0x499F ^ 0x49A7;
        FriendManager.h[0x2E22 ^ 0x2FA8] = 0xB3B2 ^ 0x2FA8;
        FriendManager.h[0x92AB ^ 0x93C6] = 0x4C87 ^ 0x93C6;
        FriendManager.h[0xFA93 ^ 0xFBA7] = 0xE476 ^ 0xFBA7;
        FriendManager.h[0x1152 ^ 0x1046] = 0xFFFFEF81 ^ 0x1046;
        FriendManager.h[0x81AE ^ 0x80E5] = 0xF039 ^ 0x80E5;
        FriendManager.h[0xA86 ^ 0xBE2] = 0x635 ^ 0xBE2;
        FriendManager.h[0x1E40 ^ 0x1F02] = 0xB846 ^ 0x1F02;
        FriendManager.h[0xF337 ^ 0xF31E] = 0xFFFF0CE9 ^ 0xF31E;
        FriendManager.h[0x2740 ^ 0x2716] = 0xFFFFD886 ^ 0x2716;
        FriendManager.h[0x7E43 ^ 0x7E01] = 0xFFFF81D7 ^ 0x7E01;
        FriendManager.h[0x5C88 ^ 0x5C8A] = 0xFFFFA31B ^ 0x5C8A;
        FriendManager.h[0x4643 ^ 0x4692] = 0xFFFFB91E ^ 0x4692;
        FriendManager.h[0xE3AD ^ 0xE38F] = 0xFFFF1C02 ^ 0xE38F;
        FriendManager.h[0xADA6 ^ 0xADAF] = 0xFFFF524A ^ 0xADAF;
        FriendManager.h[0x6B39 ^ 0x6A3E] = 0x6A1C ^ 0x6A3E;
        FriendManager.h[0x40B4 ^ 0x405A] = 0xFFFFBFB6 ^ 0x405A;
        FriendManager.h[0xFE93 ^ 0xFE22] = 0xFE35 ^ 0xFE22;
        FriendManager.h[0x1E1C ^ 0x1F60] = 0xEFE4 ^ 0x1F60;
        FriendManager.h[0x425 ^ 0x4B7] = 0xFFFFFB24 ^ 0x4B7;
        FriendManager.h[0xB712 ^ 0xB70C] = 0xB791 ^ 0xB70C;
        FriendManager.h[0x7967 ^ 0x792B] = 0x7923 ^ 0x792B;
        FriendManager.h[0xFD1 ^ 0xF9E] = 0xFFFFF019 ^ 0xF9E;
        FriendManager.h[0xAF7F ^ 0xAE7E] = 0xFFFF519E ^ 0xAE7E;
        FriendManager.h[0x5CF7 ^ 0x5D8C] = 0x9962 ^ 0x5D8C;
        FriendManager.h[0x5374 ^ 0x5276] = 0x520C ^ 0x5276;
        FriendManager.h[0xFFF6 ^ 0xFEB2] = 0x59F6 ^ 0xFEB2;
        FriendManager.h[0xC328 ^ 0xC24E] = 0xCFA8 ^ 0xC24E;
        FriendManager.h[0x5EBD ^ 0x5F34] = 0xC374 ^ 0x5F34;
        FriendManager.h[0xE6C0 ^ 0xE6D0] = 0xE6E8 ^ 0xE6D0;
        FriendManager.h[0x4598 ^ 0x4494] = 0x44DE ^ 0x4494;
        FriendManager.h[0xF8F0 ^ 0xF86C] = 0xFFFF07B5 ^ 0xF86C;
        FriendManager.h[0x8C15 ^ 0x8C2B] = 0x8C13 ^ 0x8C2B;
        FriendManager.h[0x11DF ^ 0x10E5] = 0xE43B ^ 0x10E5;
        FriendManager.h[0xED5B ^ 0xEC4A] = 0xFFFF13C3 ^ 0xEC4A;
        FriendManager.h[0x8D9C ^ 0x8C8B] = 0xFFFF7303 ^ 0x8C8B;
        FriendManager.h[0xC7E4 ^ 0xC75E] = 0xC75E ^ 0xC75E;
        FriendManager.h[0x1338 ^ 0x13FB] = 0x9EAC ^ 0x13FB;
        FriendManager.h[0x99ED ^ 0x99BC] = 0xFFFF6620 ^ 0x99BC;
        FriendManager.h[0xC134 ^ 0xC1EA] = 0xC19E ^ 0xC1EA;
        FriendManager.h[0x2D42 ^ 0x2D2D] = 0x2D1D ^ 0x2D2D;
        FriendManager.h[0x8C1E ^ 0x8C74] = 0x8C1C ^ 0x8C74;
        FriendManager.h[0x52EA ^ 0x5279] = 0xFFFFAD8B ^ 0x5279;
        FriendManager.h[0x2C77 ^ 0x2D10] = 0x20C8 ^ 0x2D10;
        FriendManager.h[0xA492 ^ 0xA5BB] = 0x2D42 ^ 0xA5BB;
        FriendManager.h[0x2071 ^ 0x20CE] = 0x4C65 ^ 0x20CE;
        FriendManager.h[0xCF2D ^ 0xCFE0] = 0xCFB2 ^ 0xCFE0;
        FriendManager.h[0xB865 ^ 0xB8C3] = 0xFFFF470E ^ 0xB8C3;
        FriendManager.h[0x51D6 ^ 0x5084] = 0x3A1B ^ 0x5084;
        FriendManager.h[0x88F5 ^ 0x89EE] = 0x89EE ^ 0x89EE;
        FriendManager.h[0x8EEE ^ 0x8ECE] = 0xFFFF7158 ^ 0x8ECE;
        FriendManager.h[0x742 ^ 0x74A] = 0x715 ^ 0x74A;
        FriendManager.h[0x1078E ^ 0x10756] = 0xFFFEF8CA ^ 0x10756;
        FriendManager.h[0x1B07 ^ 0x1A12] = 0x1A7C ^ 0x1A12;
        FriendManager.h[0x630 ^ 0x74F] = 0xF7DC ^ 0x74F;
        FriendManager.h[0x3A16 ^ 0x3AA3] = 0x3AA3 ^ 0x3AA3;
        FriendManager.h[0x6BD7 ^ 0x6BD6] = 0x6BB5 ^ 0x6BD6;
        FriendManager.h[0x70DE ^ 0x715C] = 0x3970 ^ 0x715C;
        FriendManager.h[0xAE35 ^ 0xAF59] = 0x7007 ^ 0xAF59;
        FriendManager.h[0x270 ^ 0x330] = 0x76B ^ 0x330;
        FriendManager.h[0x9BD7 ^ 0x9B11] = 0x64C ^ 0x9B11;
        FriendManager.h[0x7FB3 ^ 0x7F6E] = 0xFFFF8090 ^ 0x7F6E;
        FriendManager.h[0x53DA ^ 0x5252] = 0xCE09 ^ 0x5252;
        FriendManager.h[0x871F ^ 0x8799] = 0x87E2 ^ 0x8799;
        FriendManager.h[0xC72F ^ 0xC773] = 0xFFFF38A0 ^ 0xC773;
        FriendManager.h[0xE9D4 ^ 0xE910] = 0xD48 ^ 0xE910;
        FriendManager.h[0x93F2 ^ 0x9392] = 0xFFFF6C13 ^ 0x9392;
        FriendManager.h[0x146A ^ 0x1452] = 0xFFFFEBD0 ^ 0x1452;
        FriendManager.h[0x5CC8 ^ 0x5C5D] = 0x5C41 ^ 0x5C5D;
        FriendManager.h[0xD227 ^ 0xD378] = 0xFFFFD11A ^ 0xD378;
        FriendManager.h[0xDADC ^ 0xDABD] = 0xFFFF2565 ^ 0xDABD;
        FriendManager.h[0x7E50 ^ 0x7E45] = 0x7EC3 ^ 0x7E45;
        FriendManager.h[0xF38E ^ 0xF2A4] = 0x7A51 ^ 0xF2A4;
        FriendManager.h[0xAE11 ^ 0xAE00] = 0xAE4B ^ 0xAE00;
        FriendManager.h[0x28DA ^ 0x29BB] = 0x29BB ^ 0x29BB;
        FriendManager.h[0x1DCC ^ 0x1CDC] = 0xFFFFE3EF ^ 0x1CDC;
        FriendManager.h[0x5C22 ^ 0x5CC7] = 0xFFFFA33A ^ 0x5CC7;
        FriendManager.h[0x5AD7 ^ 0x5B98] = 0x42D2 ^ 0x5B98;
        FriendManager.h[0x6BFD ^ 0x6BDB] = 0xFFFF944C ^ 0x6BDB;
        FriendManager.h[0x2972 ^ 0x2905] = 0x2946 ^ 0x2905;
        FriendManager.h[0xDD4E ^ 0xDC3C] = 0x6F97 ^ 0xDC3C;
        FriendManager.h[0x932C ^ 0x9394] = 0x9396 ^ 0x9394;
        FriendManager.h[0xB669 ^ 0xB65E] = 0xFFFF49F5 ^ 0xB65E;
        FriendManager.h[0x4794 ^ 0x47E8] = 0xFFFFB805 ^ 0x47E8;
        FriendManager.h[0x8680 ^ 0x860C] = 0xFFFF79E4 ^ 0x860C;
        FriendManager.h[0x2032 ^ 0x2162] = 0x3847 ^ 0x2162;
        FriendManager.h[0x50CA ^ 0x500F] = 0xD113 ^ 0x500F;
        FriendManager.h[0x8791 ^ 0x8691] = 0x868C ^ 0x8691;
        FriendManager.h[0xE4AB ^ 0xE5DD] = 0x5712 ^ 0xE5DD;
        FriendManager.h[0x5BBE ^ 0x5B68] = 0x5B1B ^ 0x5B68;
        FriendManager.h[0x84F6 ^ 0x85BC] = 0xF562 ^ 0x85BC;
        FriendManager.h[0xA3A2 ^ 0xA31B] = 0xA31B ^ 0xA31B;
        FriendManager.h[0xE097 ^ 0xE1FD] = 0xAFB ^ 0xE1FD;
        FriendManager.h[0xF89F ^ 0xF85F] = 0xD0F4 ^ 0xF85F;
        FriendManager.h[0x7C6 ^ 0x730] = 0xFFFFF887 ^ 0x730;
        FriendManager.h[0x90E5 ^ 0x91AC] = 0xE17D ^ 0x91AC;
        FriendManager.h[0x5C37 ^ 0x5C6A] = 0xFFFFA38A ^ 0x5C6A;
        FriendManager.h[0xB92C ^ 0xB933] = 0xB900 ^ 0xB933;
        FriendManager.h[0x197A ^ 0x19D3] = 0xFFFFE609 ^ 0x19D3;
        FriendManager.h[0x1F08 ^ 0x1E72] = 0xFFFF2525 ^ 0x1E72;
        FriendManager.h[0x431E ^ 0x4252] = 0x328C ^ 0x4252;
        FriendManager.h[0xCFAC ^ 0xCF31] = 0xFFFF30AB ^ 0xCF31;
        FriendManager.h[0xC591 ^ 0xC576] = 0xFFFF3AA0 ^ 0xC576;
        FriendManager.h[0x97EB ^ 0x9717] = 0xFFFF68CD ^ 0x9717;
        FriendManager.h[0x2192 ^ 0x2161] = 0xFFFFDEA3 ^ 0x2161;
        FriendManager.h[0x4C72 ^ 0x4C3A] = 0xFFFFB365 ^ 0x4C3A;
        FriendManager.h[0x6A4A ^ 0x6BCB] = 0x23C2 ^ 0x6BCB;
        FriendManager.h[0x74FC ^ 0x74B2] = 0x74AF ^ 0x74B2;
        FriendManager.h[0x10F69 ^ 0x10F05] = 0xFFFEF0E0 ^ 0x10F05;
        FriendManager.h[0xCCA1 ^ 0xCCAC] = 0xFFFF333D ^ 0xCCAC;
        FriendManager.h[0xDB99 ^ 0xDB79] = 0xFFFF24D2 ^ 0xDB79;
        FriendManager.h[0x4B53 ^ 0x4A59] = 0xFFFFB599 ^ 0x4A59;
        FriendManager.h[0x8FF9 ^ 0x8F26] = 0x8F2C ^ 0x8F26;
        FriendManager.h[0xF574 ^ 0xF5A3] = 0xFFFF0A6C ^ 0xF5A3;
        FriendManager.h[0x10A74 ^ 0x10A0A] = 0xFFFEF525 ^ 0x10A0A;
        FriendManager.h[0xA20 ^ 0xA27] = 0xFFFFF5F2 ^ 0xA27;
        FriendManager.h[0x2A7D ^ 0x2B03] = 0xDBB0 ^ 0x2B03;
        FriendManager.h[0x8A0E ^ 0x8B2A] = 0xE3F8 ^ 0x8B2A;
        FriendManager.h[0x2EA5 ^ 0x2EA6] = 0x2EFC ^ 0x2EA6;
        FriendManager.h[0x1CEB ^ 0x1CD1] = 0xFFFFE30E ^ 0x1CD1;
        FriendManager.h[0x120E ^ 0x1263] = 0xFFFFEDEA ^ 0x1263;
        FriendManager.h[0xD147 ^ 0xD061] = 0xC93A ^ 0xD061;
        FriendManager.h[0x9173 ^ 0x9000] = 0x23CA ^ 0x9000;
        FriendManager.h[0x90A ^ 0x937] = 0xFFFFF6EA ^ 0x937;
        FriendManager.h[0xE121 ^ 0xE06F] = 0xF94A ^ 0xE06F;
        FriendManager.h[0x4FE5 ^ 0x4EFC] = 0x4EFD ^ 0x4EFC;
        FriendManager.h[0x8F04 ^ 0x8FB9] = 0xEC1A ^ 0x8FB9;
        FriendManager.h[0xA42A ^ 0xA437] = 0xFFFF5BF4 ^ 0xA437;
        FriendManager.h[0x1077F ^ 0x107B3] = 0x107DC ^ 0x107B3;
        FriendManager.h[0xA381 ^ 0xA3F5] = 0xFFFF5C04 ^ 0xA3F5;
        FriendManager.h[0x9C0B ^ 0x9C39] = 0xFFFF63D2 ^ 0x9C39;
        FriendManager.h[0xC9A5 ^ 0xC8AD] = 0xFFFF377E ^ 0xC8AD;
        FriendManager.h[0x773C ^ 0x76B1] = 0x978B ^ 0x76B1;
        FriendManager.h[0x6E82 ^ 0x6F0D] = 0x8E37 ^ 0x6F0D;
        FriendManager.h[0x430C ^ 0x4348] = 0xFFFFBCA5 ^ 0x4348;
        FriendManager.h[0x2E45 ^ 0x2E5E] = 0xFFFFD1AB ^ 0x2E5E;
        FriendManager.h[0x2C28 ^ 0x2D50] = 0xE9A6 ^ 0x2D50;
        FriendManager.h[0x4B63 ^ 0x4BBA] = 0x4BEF ^ 0x4BBA;
        FriendManager.h[0xD403 ^ 0xD530] = 0xCAFE ^ 0xD530;
        FriendManager.h[0xB09 ^ 0xB3C] = 0xFFFFF4DA ^ 0xB3C;
        FriendManager.h[0x2241 ^ 0x2233] = 0x2268 ^ 0x2233;
        FriendManager.h[0x51D2 ^ 0x5197] = 0x51D5 ^ 0x5197;
        FriendManager.h[0x9669 ^ 0x964A] = 0xFFFF6993 ^ 0x964A;
        FriendManager.h[0xA1C1 ^ 0xA1A8] = 0xA1AA ^ 0xA1A8;
        FriendManager.h[0xC6D2 ^ 0xC755] = 0xF55F ^ 0xC755;
        FriendManager.h[0x9474 ^ 0x947B] = 0x946C ^ 0x947B;
        FriendManager.h[0x184C ^ 0x193C] = 0xAAEF ^ 0x193C;
        FriendManager.h[0xD5DF ^ 0xD4C9] = 0xD4CC ^ 0xD4C9;
        FriendManager.h[0x3981 ^ 0x3929] = 0x392D ^ 0x3929;
        FriendManager.h[0x215D ^ 0x2108] = 0xFFFFDEE3 ^ 0x2108;
        FriendManager.h[0xB912 ^ 0xB865] = 0xABF ^ 0xB865;
        FriendManager.h[0x9679 ^ 0x96E7] = 0xFFFF692D ^ 0x96E7;
        FriendManager.h[0xC83 ^ 0xC76] = 0xC77 ^ 0xC76;
        FriendManager.h[0xD202 ^ 0xD266] = 0xD205 ^ 0xD266;
        FriendManager.h[0x4DA3 ^ 0x4D8E] = 0x4DB8 ^ 0x4D8E;
        FriendManager.h[0xD7C5 ^ 0xD748] = 0xFFFF28EE ^ 0xD748;
        FriendManager.h[0x37DA ^ 0x37CE] = 0x37A8 ^ 0x37CE;
        FriendManager.h[0x73F7 ^ 0x7368] = 0xFFFF8CE2 ^ 0x7368;
        FriendManager.h[0xAD46 ^ 0xACCA] = 0x4DF3 ^ 0xACCA;
        FriendManager.h[0xF2FF ^ 0xF2F4] = 0xFFFF0D0D ^ 0xF2F4;
        FriendManager.h[0xFEB3 ^ 0xFF98] = 0xFFFF88F9 ^ 0xFF98;
        FriendManager.h[0x7A19 ^ 0x7B2F] = 0x9B6B ^ 0x7B2F;
        FriendManager.h[0x5279 ^ 0x5298] = 0xFFFFAD19 ^ 0x5298;
        FriendManager.h[0x3DAE ^ 0x3C2B] = 0xE21 ^ 0x3C2B;
        FriendManager.h[0xE62B ^ 0xE686] = 0xFFFF195A ^ 0xE686;
        FriendManager.h[0x89A3 ^ 0x895C] = 0x895F ^ 0x895C;
        FriendManager.h[0xCDB4 ^ 0xCC3F] = 0x507F ^ 0xCC3F;
        FriendManager.h[0x246B ^ 0x24B8] = 0x24DF ^ 0x24B8;
        FriendManager.h[0x1095B ^ 0x10902] = 0xFFFEF6B5 ^ 0x10902;
        FriendManager.h[0xA44A ^ 0xA418] = 0xA43D ^ 0xA418;
        FriendManager.h[0x370C ^ 0x3613] = 0xD1F2 ^ 0x3613;
        FriendManager.h[0x5146 ^ 0x50C0] = 0xFFFF9D7B ^ 0x50C0;
        FriendManager.h[0x3600 ^ 0x36B0] = 0xFFFFC932 ^ 0x36B0;
        FriendManager.h[0x752E ^ 0x7406] = 0x6D5D ^ 0x7406;
        FriendManager.h[0xA1B0 ^ 0xA1B5] = 0xFFFF5E70 ^ 0xA1B5;
        FriendManager.h[0x5558 ^ 0x546A] = 0x4BBB ^ 0x546A;
        FriendManager.h[0x68FA ^ 0x6810] = 0xFFFF97B4 ^ 0x6810;
        FriendManager.h[0xEB45 ^ 0xEB03] = 0xEB46 ^ 0xEB03;
        FriendManager.h[0xC30E ^ 0xC207] = 0xC24A ^ 0xC207;
        FriendManager.h[0x10B7 ^ 0x1075] = 0x587 ^ 0x1075;
        FriendManager.h[0x1093E ^ 0x10960] = 0xFFFEF6B3 ^ 0x10960;
        FriendManager.h[0x3E02 ^ 0x3F2C] = 0x7D70 ^ 0x3F2C;
        FriendManager.h[0x6C03 ^ 0x6CB4] = 0x6CB4 ^ 0x6CB4;
        FriendManager.h[0x6C25 ^ 0x6CBC] = 0xFFFF93F5 ^ 0x6CBC;
        FriendManager.h[0x97BF ^ 0x97CE] = 0x9781 ^ 0x97CE;
        FriendManager.h[0x2129 ^ 0x2179] = 0xFFFFDEFD ^ 0x2179;
        FriendManager.h[0x3582 ^ 0x35AE] = 0xFFFFCA2C ^ 0x35AE;
        FriendManager.h[0x251F ^ 0x259C] = 0xFFFFDA3F ^ 0x259C;
        FriendManager.h[0xA355 ^ 0xA3DA] = 0xA3D5 ^ 0xA3DA;
        FriendManager.h[0x1789 ^ 0x168D] = 0xFFFFE968 ^ 0x168D;
        FriendManager.h[0x102C ^ 0x1088] = 0xFFFFEF7E ^ 0x1088;
        FriendManager.h[0xD969 ^ 0xD9CC] = 0xFFFF26A3 ^ 0xD9CC;
        FriendManager.h[0x97C7 ^ 0x969B] = 0x29F3 ^ 0x969B;
        FriendManager.h[0xCD38 ^ 0xCD08] = 0xFFFF32CC ^ 0xCD08;
        FriendManager.h[0x106E2 ^ 0x10615] = 0xFFFEF9B3 ^ 0x10615;
        FriendManager.h[0xE260 ^ 0xE299] = 0xE281 ^ 0xE299;
        FriendManager.h[0xD9CC ^ 0xD9DE] = 0xD909 ^ 0xD9DE;
        FriendManager.h[0xEB5D ^ 0xEB28] = 0xEB7B ^ 0xEB28;
        FriendManager.h[0x3856 ^ 0x3801] = 0xFFFFC7E9 ^ 0x3801;
        FriendManager.h[0x5AC4 ^ 0x5A89] = 0xFFFFA54C ^ 0x5A89;
        FriendManager.h[0x5C7A ^ 0x5C70] = 0xFFFFA3BA ^ 0x5C70;
        FriendManager.h[0x4857 ^ 0x4906] = 0x2391 ^ 0x4906;
        FriendManager.h[0x46AC ^ 0x47B1] = 0x47B0 ^ 0x47B1;
        FriendManager.h[0x1EE ^ 0xD1] = 0xFFFFFB33 ^ 0xD1;
        FriendManager.h[0x6E18 ^ 0x6EE8] = 0x6E90 ^ 0x6EE8;
        FriendManager.h[0x10F3B ^ 0x10EB5] = 0x1EFCA ^ 0x10EB5;
        FriendManager.h[0x65A2 ^ 0x65DF] = 0x65EC ^ 0x65DF;
        FriendManager.h[0x1564 ^ 0x1443] = 0xD41 ^ 0x1443;
        FriendManager.h[0x1068 ^ 0x10DA] = 0xFFFFEF76 ^ 0x10DA;
        FriendManager.h[0xA0C6 ^ 0xA05C] = 0xA00D ^ 0xA05C;
        FriendManager.h[0x68B9 ^ 0x6893] = 0x68C8 ^ 0x6893;
        FriendManager.h[0x1B60 ^ 0x1B5B] = 0x1B45 ^ 0x1B5B;
        FriendManager.h[0x5ADC ^ 0x5BE4] = 0xBBA0 ^ 0x5BE4;
        FriendManager.h[0xB213 ^ 0xB287] = 0xFFFF4D71 ^ 0xB287;
        FriendManager.h[0xEA04 ^ 0xEB0A] = 0xFFFF1494 ^ 0xEB0A;
        FriendManager.h[0x3037 ^ 0x304C] = 0xFFFFCF96 ^ 0x304C;
        FriendManager.h[0x6B5F ^ 0x6BDF] = 0xFFFF945C ^ 0x6BDF;
        FriendManager.h[0x82F5 ^ 0x83B6] = 0xFFFFDB16 ^ 0x83B6;
        FriendManager.h[0x392 ^ 0x359] = 0xFFFFFC90 ^ 0x359;
        FriendManager.h[0x1CEE ^ 0x1CF2] = 0x1CC0 ^ 0x1CF2;
        FriendManager.h[0xAAFA ^ 0xAA13] = 0xFFFF55FE ^ 0xAA13;
        FriendManager.h[0xB4DC ^ 0xB44A] = 0xB453 ^ 0xB44A;
        FriendManager.h[0x93BB ^ 0x93DC] = 0x93EF ^ 0x93DC;
        FriendManager.h[0xAC19 ^ 0xACCC] = 0xFFFF533E ^ 0xACCC;
        FriendManager.h[0x7675 ^ 0x761B] = 0x7672 ^ 0x761B;
        FriendManager.h[0x8FC3 ^ 0x8EEF] = 0x61A ^ 0x8EEF;
        FriendManager.h[0x4BA0 ^ 0x4A23] = 0x22A ^ 0x4A23;
        FriendManager.h[0xC42F ^ 0xC4AB] = 0xC4A1 ^ 0xC4AB;
        FriendManager.h[0x7CF9 ^ 0x7CA3] = 0xFFFF8366 ^ 0x7CA3;
        FriendManager.h[0x8B11 ^ 0x8B86] = 0x8BF7 ^ 0x8B86;
        FriendManager.h[0xD656 ^ 0xD6DE] = 0xD6B9 ^ 0xD6DE;
        FriendManager.h[0x10984 ^ 0x109F2] = 0xFFFEF61C ^ 0x109F2;
        FriendManager.h[0x10112 ^ 0x10008] = 0x1000A ^ 0x10008;
        FriendManager.h[0x5BBC ^ 0x5B3D] = 0xFFFFA463 ^ 0x5B3D;
        FriendManager.h[0x7136 ^ 0x7055] = 0xD5F8 ^ 0x7055;
        FriendManager.h[0x9D0D ^ 0x9DD9] = 0x9DAD ^ 0x9DD9;
        FriendManager.h[0x5D25 ^ 0x5DF5] = 0xFFFFA214 ^ 0x5DF5;
        FriendManager.h[0xF01A ^ 0xF0FC] = 0xFFFF0F05 ^ 0xF0FC;
        FriendManager.h[0x9790 ^ 0x9695] = 0x96CD ^ 0x9695;
        FriendManager.h[0x1154 ^ 0x11A5] = 0x11EC ^ 0x11A5;
        FriendManager.h[0x902B ^ 0x90E2] = 0x90E2 ^ 0x90E2;
        FriendManager.h[0x14CA ^ 0x15F1] = 0xFFFF1E97 ^ 0x15F1;
        FriendManager.h[0x9E4F ^ 0x9E59] = 0xFFFF6194 ^ 0x9E59;
        FriendManager.h[0xB199 ^ 0xB09A] = 0xB0E1 ^ 0xB09A;
        FriendManager.h[0xD503 ^ 0xD5EB] = 0xD5B2 ^ 0xD5EB;
        FriendManager.h[0xE503 ^ 0xE5F8] = 0xE5C5 ^ 0xE5F8;
        FriendManager.h[0xAC5F ^ 0xAD6E] = 0xB2BA ^ 0xAD6E;
        FriendManager.h[0x101B2 ^ 0x1013B] = 0x10170 ^ 0x1013B;
        FriendManager.h[0xAC89 ^ 0xAC19] = 0xAC0E ^ 0xAC19;
        FriendManager.h[0x561F ^ 0x56D5] = 0xFFFFA953 ^ 0x56D5;
        FriendManager.h[0xCA3A ^ 0xCA03] = 0xCA38 ^ 0xCA03;
        FriendManager.h[0x5F7A ^ 0x5E66] = 0x5E67 ^ 0x5E66;
        FriendManager.h[0x39CB ^ 0x39BB] = 0xFFFFC63A ^ 0x39BB;
        FriendManager.h[0x564E ^ 0x56CB] = 0x569A ^ 0x56CB;
        FriendManager.h[0x959B ^ 0x94CC] = 0xFFFFD588 ^ 0x94CC;
        FriendManager.h[0x6396 ^ 0x6320] = 0x6321 ^ 0x6320;
        FriendManager.h[0x9609 ^ 0x96FD] = 0x96DC ^ 0x96FD;
        FriendManager.h[0x3119 ^ 0x312F] = 0x3106 ^ 0x312F;
        FriendManager.h[0xE33 ^ 0xE68] = 0xE5E ^ 0xE68;
        FriendManager.h[0x2385 ^ 0x233E] = 0x2226 ^ 0x233E;
        FriendManager.h[0xE652 ^ 0xE73B] = 0xC7A ^ 0xE73B;
        FriendManager.h[0x52E6 ^ 0x523C] = 0xFFFFAD98 ^ 0x523C;
        FriendManager.h[0xA6D1 ^ 0xA79C] = 0xBEB0 ^ 0xA79C;
        FriendManager.h[0x6A38 ^ 0x6B66] = 0x96E3 ^ 0x6B66;
        FriendManager.h[0x54A2 ^ 0x5416] = 0x5415 ^ 0x5416;
        FriendManager.h[0x10470 ^ 0x10545] = 0x1E506 ^ 0x10545;
        FriendManager.h[0x7B7A ^ 0x7BD8] = 0xFFFF8419 ^ 0x7BD8;
        FriendManager.h[0x2B8E ^ 0x2AF7] = 0xEE19 ^ 0x2AF7;
        FriendManager.h[0x83EF ^ 0x8287] = 0x69CE ^ 0x8287;
        FriendManager.h[0x10901 ^ 0x1082C] = 0x14A7E ^ 0x1082C;
        FriendManager.h[0x3429 ^ 0x3554] = 0xC5C7 ^ 0x3554;
        FriendManager.h[0x10B78 ^ 0x10B6F] = 0x10B3D ^ 0x10B6F;
        FriendManager.h[0x103D6 ^ 0x1030A] = 0x10379 ^ 0x1030A;
        FriendManager.h[0xF9F4 ^ 0xF9A7] = 0xFFFF0610 ^ 0xF9A7;
        FriendManager.h[0x9BCC ^ 0x9B31] = 0x9B55 ^ 0x9B31;
        FriendManager.h[0x9FDB ^ 0x9F59] = 0x9F1C ^ 0x9F59;
        FriendManager.h[0x1A4 ^ 0x1A8] = 0x1F9 ^ 0x1A8;
        FriendManager.h[0xB31B ^ 0xB274] = 0x6D35 ^ 0xB274;
        FriendManager.h[0x3895 ^ 0x3986] = 0x3931 ^ 0x3986;
        FriendManager.h[0x859C ^ 0x8484] = 0x84FE ^ 0x8484;
        FriendManager.h[0x9CA4 ^ 0x9CC7] = 0xFFFF63AB ^ 0x9CC7;
        FriendManager.h[0x21DB ^ 0x21EA] = 0x219B ^ 0x21EA;
        FriendManager.h[0x9E48 ^ 0x9E5B] = 0x9E2B ^ 0x9E5B;
        FriendManager.h[0x613C ^ 0x6079] = 0x15BC ^ 0x6079;
        FriendManager.h[0x36CC ^ 0x37C7] = 0x37B1 ^ 0x37C7;
        FriendManager.h[0x2D8D ^ 0x2C82] = 0xFFFFD316 ^ 0x2C82;
        FriendManager.h[0xC86B ^ 0xC854] = 0xC806 ^ 0xC854;
        FriendManager.h[0x2E32 ^ 0x2EF3] = 0x6563 ^ 0x2EF3;
        FriendManager.h[0xBF05 ^ 0xBE5C] = 0x132 ^ 0xBE5C;
        FriendManager.h[0xC7FB ^ 0xC7BC] = 0xC7B4 ^ 0xC7BC;
        FriendManager.h[0xE56E ^ 0xE58A] = 0xFFFF1A7E ^ 0xE58A;
        FriendManager.h[0xAC06 ^ 0xAD24] = 0xC5F6 ^ 0xAD24;
        FriendManager.h[0x4930 ^ 0x4845] = 0xFA9F ^ 0x4845;
        FriendManager.h[0xB7F9 ^ 0xB714] = 0xFFFF48F0 ^ 0xB714;
        FriendManager.h[0x10285 ^ 0x103B5] = 0x141E9 ^ 0x103B5;
        FriendManager.h[0x6351 ^ 0x63DF] = 0x63B4 ^ 0x63DF;
        FriendManager.h[0x535A ^ 0x539D] = 0x8C02 ^ 0x539D;
        FriendManager.h[0xFB3D ^ 0xFA6B] = 0x44C0 ^ 0xFA6B;
        FriendManager.h[0x2171 ^ 0x2029] = 0x9E82 ^ 0x2029;
        FriendManager.h[0xD02F ^ 0xD081] = 0xFFFF2FF9 ^ 0xD081;
        FriendManager.h[0xE9D ^ 0xEB6] = 0xEF5 ^ 0xEB6;
        FriendManager.h[0x1213 ^ 0x12B2] = 0x12DD ^ 0x12B2;
        FriendManager.h[0xC7FE ^ 0xC6BF] = 0x61F1 ^ 0xC6BF;
        FriendManager.h[0x9322 ^ 0x921C] = 0x9647 ^ 0x921C;
        FriendManager.h[0x3A1D ^ 0x3AD2] = 0x3AF5 ^ 0x3AD2;
        FriendManager.h[0x10AE9 ^ 0x10BEF] = 0xFFFEF45D ^ 0x10BEF;
        FriendManager.h[0xB43 ^ 0xBC4] = 0xFFFFF415 ^ 0xBC4;
        FriendManager.h[0x9BC7 ^ 0x9BDF] = 0x9BF7 ^ 0x9BDF;
        FriendManager.h[0xEC4B ^ 0xEC02] = 0xFFFF13CC ^ 0xEC02;
        FriendManager.h[0xCBC7 ^ 0xCB68] = 0xCB49 ^ 0xCB68;
        FriendManager.h[0xD482 ^ 0xD5BF] = 0xD1E5 ^ 0xD5BF;
        FriendManager.h[0x80C0 ^ 0x81E5] = 0x98BD ^ 0x81E5;
        FriendManager.h[0x4B59 ^ 0x4A28] = 0xF9E2 ^ 0x4A28;
        FriendManager.h[0x5334 ^ 0x535F] = 0xFFFFACE9 ^ 0x535F;
        FriendManager.h[0x4358 ^ 0x4255] = 0xFFFFBD16 ^ 0x4255;
        FriendManager.h[0xAA3F ^ 0xAA31] = 0xFFFF55F1 ^ 0xAA31;
        FriendManager.h[0x80A1 ^ 0x803A] = 0xFFFF7FAC ^ 0x803A;
        FriendManager.h[0xC0EB ^ 0xC0F2] = 0xFFFF3F38 ^ 0xC0F2;
        FriendManager.h[0x10CE3 ^ 0x10DB7] = 0x16728 ^ 0x10DB7;
        FriendManager.h[0x9DFB ^ 0x9CD4] = 0xDE8C ^ 0x9CD4;
        FriendManager.h[0x5F9E ^ 0x5EF5] = 0xB5B4 ^ 0x5EF5;
        FriendManager.h[0x8B2B ^ 0x8BC9] = 0x8BF5 ^ 0x8BC9;
        FriendManager.h[0xD36 ^ 0xCB6] = 0x44AE ^ 0xCB6;
        FriendManager.h[0xF849 ^ 0xF861] = 0xF871 ^ 0xF861;
        FriendManager.h[0x45A1 ^ 0x4512] = 0x454F ^ 0x4512;
        FriendManager.h[0xB8F8 ^ 0xB9DB] = 0xFFFF2EC7 ^ 0xB9DB;
        FriendManager.h[0xF681 ^ 0xF610] = 0xFFFF0987 ^ 0xF610;
        FriendManager.h[0xECA ^ 0xEAF] = 0xFFFFF168 ^ 0xEAF;
        FriendManager.h[0xBF55 ^ 0xBFF5] = 0xFFFF4030 ^ 0xBFF5;
        FriendManager.h[0x120E ^ 0x132F] = 0x7BF6 ^ 0x132F;
        FriendManager.h[0xC463 ^ 0xC444] = 0xC45D ^ 0xC444;
        FriendManager.h[0x1310 ^ 0x136F] = 0x133C ^ 0x136F;
        FriendManager.h[0xA486 ^ 0xA5DB] = 0x5853 ^ 0xA5DB;
        FriendManager.h[0xB44B ^ 0xB57C] = 0xFFFFAAF2 ^ 0xB57C;
        FriendManager.h[0x86B2 ^ 0x86B4] = 0xFFFF7978 ^ 0x86B4;
        FriendManager.h[0xDCC0 ^ 0xDC6C] = 0xFFFF2382 ^ 0xDC6C;
        FriendManager.h[0xBDE ^ 0xB81] = 0xB8F ^ 0xB81;
        FriendManager.h[0xCC02 ^ 0xCC6A] = 0xCC50 ^ 0xCC6A;
        FriendManager.h[0xCAB2 ^ 0xCB36] = 0xF922 ^ 0xCB36;
        FriendManager.h[0xA3F9 ^ 0xA3F9] = 0xFFFF5CD7 ^ 0xA3F9;
        FriendManager.h[0x9B0D ^ 0x9B6F] = 0x9B22 ^ 0x9B6F;
        FriendManager.h[0x3D16 ^ 0x3D55] = 0x3D75 ^ 0x3D55;
        FriendManager.h[0x633E ^ 0x63B4] = 0xFFFF9C73 ^ 0x63B4;
        FriendManager.h[0xCBA9 ^ 0xCB9D] = 0xCB9F ^ 0xCB9D;
        FriendManager.h[0x26D4 ^ 0x26AE] = 0xFFFFD95D ^ 0x26AE;
        FriendManager.h[0xF79E ^ 0xF775] = 0xFFFF0899 ^ 0xF775;
        FriendManager.h[0x8DB0 ^ 0x8DE8] = 0xFFFF7247 ^ 0x8DE8;
        FriendManager.h[0x1E74 ^ 0x1E98] = 0xFFFFE140 ^ 0x1E98;
        FriendManager.h[0x6ED5 ^ 0x6F9D] = 0x1A5C ^ 0x6F9D;
        FriendManager.h[0x6595 ^ 0x64D3] = 0x1112 ^ 0x64D3;
        FriendManager.h[0x6986 ^ 0x68DC] = 0xD7B4 ^ 0x68DC;
        FriendManager.h[0x6BC1 ^ 0x6B0F] = 0xFFFF94A4 ^ 0x6B0F;
        FriendManager.h[0xE9E8 ^ 0xE8F6] = 0xE8F6 ^ 0xE8F6;
        FriendManager.h[0x5C5B ^ 0x5C28] = 0xFFFFA383 ^ 0x5C28;
        FriendManager.h[0xE824 ^ 0xE91D] = 0x1DC1 ^ 0xE91D;
        FriendManager.h[0xDB8A ^ 0xDAD9] = 0xB07B ^ 0xDAD9;
        FriendManager.h[0xDD01 ^ 0xDDF9] = 0xFFFF2208 ^ 0xDDF9;
        FriendManager.h[0xE5E6 ^ 0xE5C7] = 0xFFFF1A41 ^ 0xE5C7;
        FriendManager.h[0x1EFD ^ 0x1FC1] = 0xEB1F ^ 0x1FC1;
        FriendManager.h[0x2011 ^ 0x200B] = 0x2054 ^ 0x200B;
        FriendManager.h[0x108E ^ 0x10DA] = 0xFFFFEF1F ^ 0x10DA;
        FriendManager.h[0xB276 ^ 0xB236] = 0xB233 ^ 0xB236;
        FriendManager.h[0xEB2C ^ 0xEB03] = 0xEB78 ^ 0xEB03;
        FriendManager.h[0xCD78 ^ 0xCD86] = 0xCD98 ^ 0xCD86;
        FriendManager.h[0xBD43 ^ 0xBD02] = 0xBD4B ^ 0xBD02;
        FriendManager.h[0xE923 ^ 0xE980] = 0xFFFF162B ^ 0xE980;
        FriendManager.h[0x92EF ^ 0x9248] = 0x922C ^ 0x9248;
        FriendManager.h[0xDBBD ^ 0xDBC5] = 0xFFFF2471 ^ 0xDBC5;
        FriendManager.h[0x5131 ^ 0x5114] = 0x5120 ^ 0x5114;
        FriendManager.h[0xF8D5 ^ 0xF87E] = 0xFFFF07BE ^ 0xF87E;
        FriendManager.h[0x21F4 ^ 0x20D4] = 0xC725 ^ 0x20D4;
        FriendManager.h[0xED1C ^ 0xEC79] = 0xE1A1 ^ 0xEC79;
        FriendManager.h[0xD390 ^ 0xD3F6] = 0xD38E ^ 0xD3F6;
        FriendManager.h[0x63E7 ^ 0x6293] = 0xD04E ^ 0x6293;
        FriendManager.h[0x2140 ^ 0x21FE] = 0x7559 ^ 0x21FE;
        FriendManager.h[0x34EF ^ 0x35B4] = 0xFFFF7571 ^ 0x35B4;
        FriendManager.h[0xF08C ^ 0xF1CB] = 0xFFFF7B9E ^ 0xF1CB;
        FriendManager.h[0xD089 ^ 0xD002] = 0xD023 ^ 0xD002;
        FriendManager.h[0x48F8 ^ 0x4802] = 0xFFFFB7F9 ^ 0x4802;
        FriendManager.h[0xB55E ^ 0xB596] = 0xADE9 ^ 0xB596;
        FriendManager.h[0x91E5 ^ 0x919C] = 0xFFFF6E3B ^ 0x919C;
        FriendManager.h[0xA41 ^ 0xAAE] = 0xFFFFF512 ^ 0xAAE;
        FriendManager.h[0xAA5D ^ 0xAAF7] = 0xFFFF553F ^ 0xAAF7;
        FriendManager.h[0x1FED ^ 0x1EFF] = 0x1EA8 ^ 0x1EFF;
        FriendManager.h[0xA2FA ^ 0xA2B0] = 0xFFFF5D21 ^ 0xA2B0;
        FriendManager.h[0xFE32 ^ 0xFEAA] = 0xFEFC ^ 0xFEAA;
        FriendManager.h[0x244 ^ 0x26A] = 0x20F ^ 0x26A;
        FriendManager.h[0xDE6F ^ 0xDF0D] = 0x7A80 ^ 0xDF0D;
        FriendManager.h[0x7A12 ^ 0x7B7C] = 0xA435 ^ 0x7B7C;
        FriendManager.h[0x6B70 ^ 0x6B82] = 0xFFFF9429 ^ 0x6B82;
        FriendManager.h[0x1C30 ^ 0x1CD3] = 0xFFFFE34B ^ 0x1CD3;
        FriendManager.h[0xAF15 ^ 0xAF29] = 0xFFFF50DC ^ 0xAF29;
        FriendManager.h[0xDBF7 ^ 0xDBBC] = 0xDBEF ^ 0xDBBC;
        FriendManager.h[0x1712 ^ 0x1647] = 0xA8EC ^ 0x1647;
        FriendManager.h[0xAC6B ^ 0xAC4F] = 0xFFFF5322 ^ 0xAC4F;
        FriendManager.h[0x10A68 ^ 0x10A6C] = 0x10A6D ^ 0x10A6C;
        FriendManager.h[0x1489 ^ 0x1452] = 0x147D ^ 0x1452;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotakbaz.rain.friend.FriendManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0630\u0651;
import oxxxde.\u0633\u0624;
import oxxxde.\u0647;
import ru.ocz.protection.annotation.Compile;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003@ABB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u00a2\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b \u0010\u0010J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003J\u001b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\"\u0010\u001bJ\u001b\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b$\u0010\u001bJ\u000f\u0010%\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002\u00a2\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b(\u0010\u0003J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b)\u0010\u001bR\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010+R\u001c\u00101\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R\u001c\u00104\u001a\n 0*\u0004\u0018\u000103038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00105R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010<\u001a\u00020;8\u0006\u00a2\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\u00a8\u0006C"}, d2={"Loxxxde/\u0634\u063a;", "Loxxxde/\u0647;", "<init>", "()V", "", "load", "", "name", "Loxxxde/\u062f\u0645;", "add", "(Ljava/lang/String;)Lkotakbaz/rain/friend/FriendManager$AddResult;", "Loxxxde/\u0626;", "remove", "(Ljava/lang/String;)Lkotakbaz/rain/friend/FriendManager$RemoveResult;", "", "clear", "()Z", "isFriend", "(Ljava/lang/String;)Z", "", "getFriends", "()Ljava/util/List;", "Loxxxde/\u0630\u0648;", "getFriendEntries", "getFriend", "(Ljava/lang/String;)Lkotakbaz/rain/friend/FriendManager$FriendEntry;", "getAddedDate", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/google/gson/JsonArray;", "friends", "loadFriends", "(Lcom/google/gson/JsonArray;)Z", "save", "ensureDirectory", "sanitizeName", "value", "sanitizeDate", "currentDate", "()Ljava/lang/String;", "sortedEntries", "invalidateSortedEntries", "normalize", "FRIENDS_KEY", "Ljava/lang/String;", "NAME_KEY", "ADDED_AT_KEY", "PIN_KEY", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "Ljava/time/format/DateTimeFormatter;", "dateFormatter", "Ljava/time/format/DateTimeFormatter;", "Ljava/util/LinkedHashMap;", "friendsByName", "Ljava/util/LinkedHashMap;", "sortedEntriesCache", "Ljava/util/List;", "Ljava/nio/file/Path;", "filePath", "Ljava/nio/file/Path;", "getFilePath", "()Ljava/nio/file/Path;", "FriendEntry", "AddResult", "RemoveResult", "rain-visuals"})
public final class \u0634\u063a
implements \u0647 {
    @Nullable
    private static List<FriendManager.FriendEntry> sortedEntriesCache;
    @NotNull
    private static final String NAME_KEY = "name";
    @NotNull
    private static final Path filePath;
    @NotNull
    private static final String FRIENDS_KEY = "friends";
    @NotNull
    public static final \u0634\u063a INSTANCE;
    private static final Gson gson;
    @NotNull
    private static final LinkedHashMap<String, FriendManager.FriendEntry> friendsByName;
    @NotNull
    private static final String PIN_KEY = "pin";
    @NotNull
    private static final String ADDED_AT_KEY = "addedAt";
    private static final DateTimeFormatter dateFormatter;

    /*
     * WARNING - void declaration
     */
    private final List<FriendManager.FriendEntry> sortedEntries() {
        void var2_6;
        List<FriendManager.FriendEntry> list;
        List<FriendManager.FriendEntry> list2 = sortedEntriesCache;
        if (list2 != null) {
            List<FriendManager.FriendEntry> it = list2;
            boolean bl = false;
            return it;
        }
        Collection<FriendManager.FriendEntry> collection = friendsByName.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$sortedBy$iv = collection;
        boolean $i$f$sortedBy = false;
        List<FriendManager.FriendEntry> it = list = CollectionsKt.sortedWith($this$sortedBy$iv, new \u0630\u0651());
        boolean bl = false;
        sortedEntriesCache = var2_6;
        return list;
    }

    private final String sanitizeDate(String value) {
        Object object;
        String string;
        block6: {
            block5: {
                String string2;
                string = value;
                if (string == null || (string = ((Object)StringsKt.trim((CharSequence)string)).toString()) == null) break block5;
                String p0 = string2 = string;
                boolean bl = false;
                String string3 = ((CharSequence)p0).length() > 0 ? string2 : null;
                string = string3;
                if (string3 != null) break block6;
            }
            return null;
        }
        String date = string;
        Object object2 = this;
        try {
            \u0634\u063a $this$sanitizeDate_u24lambda_u240 = object2;
            boolean bl = false;
            object = Result.constructor-impl(LocalDate.parse(date, dateFormatter).format(dateFormatter));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (String)(Result.isFailure-impl(object2) ? null : object2);
    }

    public final boolean clear() {
        if (friendsByName.isEmpty()) {
            return true;
        }
        LinkedHashMap snapshot = new LinkedHashMap(friendsByName);
        friendsByName.clear();
        this.invalidateSortedEntries();
        if (this.save()) {
            \u0633\u0624.INSTANCE.clearAll();
            return true;
        }
        friendsByName.putAll(snapshot);
        this.invalidateSortedEntries();
        return false;
    }

    private final String currentDate() {
        String string = LocalDate.now().format(dateFormatter);
        Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        return string;
    }

    private \u0634\u063a() {
    }

    private final String normalize(String name) {
        String string = name;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        return string2;
    }

    private final String sanitizeName(String name) {
        String string;
        String string2 = name;
        if (string2 != null && (string2 = ((Object)StringsKt.trim((CharSequence)string2)).toString()) != null) {
            String string3 = string2;
            String p0 = string3;
            boolean bl = false;
            string = ((CharSequence)p0).length() > 0 ? string3 : null;
        } else {
            string = null;
        }
        return string;
    }

    @NotNull
    public final List<FriendManager.FriendEntry> getFriendEntries() {
        return this.sortedEntries();
    }

    @Nullable
    public final FriendManager.FriendEntry getFriend(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            return null;
        }
        String friendName = string;
        return friendsByName.get(this.normalize(friendName));
    }

    public final boolean isFriend(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            return false;
        }
        String friendName = string;
        return friendsByName.containsKey(this.normalize(friendName));
    }

    private final boolean save() {
        Object object;
        this.ensureDirectory();
        JsonObject root = new JsonObject();
        JsonArray friends = new JsonArray();
        Iterable $this$forEach$iv = this.sortedEntries();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            FriendManager.FriendEntry friend = (FriendManager.FriendEntry)element$iv;
            boolean bl = false;
            JsonObject entry = new JsonObject();
            entry.addProperty(NAME_KEY, friend.getName());
            entry.addProperty(ADDED_AT_KEY, friend.getAddedAt());
            entry.addProperty(PIN_KEY, friend.getPin());
            friends.add(entry);
        }
        root.add(FRIENDS_KEY, friends);
        \u0634\u063a \u0634\u063a2 = this;
        try {
            \u0634\u063a $this$save_u24lambda_u241 = \u0634\u063a2;
            boolean bl = false;
            OpenOption[] openOptionArray = new OpenOption[3];
            openOptionArray[0] = StandardOpenOption.CREATE;
            openOptionArray[1] = StandardOpenOption.TRUNCATE_EXISTING;
            openOptionArray[2] = StandardOpenOption.WRITE;
            object = Result.constructor-impl(Files.writeString(filePath, (CharSequence)gson.toJson(root), openOptionArray));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        return Result.isSuccess-impl(object);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final List<String> getFriends() {
        void var4_4;
        void $this$mapTo$iv$iv;
        Iterable $this$map$iv = this.sortedEntries();
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            FriendManager.FriendEntry p0 = (FriendManager.FriendEntry)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(p0.getName());
        }
        return (List)var4_4;
    }

    static {
        INSTANCE = new \u0634\u063a();
        gson = new GsonBuilder().setPrettyPrinting().create();
        dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yy", Locale.ROOT);
        friendsByName = new LinkedHashMap();
        String[] stringArray = new String[2];
        stringArray[0] = "Rain";
        stringArray[1] = "friends.json";
        Path path = Paths.get(System.getProperty("user.dir"), stringArray);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        filePath = path;
    }

    @Nullable
    public final String getAddedDate(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            return null;
        }
        String friendName = string;
        FriendManager.FriendEntry friendEntry = friendsByName.get(this.normalize(friendName));
        return friendEntry != null ? friendEntry.getAddedAt() : null;
    }

    @NotNull
    @Compile
    public final FriendManager.AddResult add(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, NAME_KEY);
        String string2 = this.sanitizeName(string);
        if (string2 == null) {
            return FriendManager.AddResult.INVALID_NAME;
        }
        String string3 = this.normalize(string2);
        if (friendsByName.containsKey(string3)) {
            return FriendManager.AddResult.ALREADY_ADDED;
        }
        FriendManager.FriendEntry friendEntry = new FriendManager.FriendEntry(string2, this.currentDate(), false, 4, null);
        friendsByName.put(string3, friendEntry);
        this.invalidateSortedEntries();
        if (!this.save()) {
            friendsByName.remove(string3);
            this.invalidateSortedEntries();
            return FriendManager.AddResult.SAVE_FAILED;
        }
        \u0633\u0624.INSTANCE.requestSkin(friendEntry);
        return FriendManager.AddResult.ADDED;
    }

    private final void ensureDirectory() {
        Files.createDirectories(filePath.getParent(), new FileAttribute[0]);
    }

    private final void invalidateSortedEntries() {
        sortedEntriesCache = null;
    }

    @NotNull
    public final Path getFilePath() {
        return filePath;
    }

    /*
     * WARNING - void declaration
     */
    private final boolean loadFriends(JsonArray friends) {
        void var2_2;
        boolean migrated = false;
        Iterable $this$forEach$iv = friends;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var12_12;
            String friendName;
            JsonElement element = (JsonElement)element$iv;
            boolean bl = false;
            if (element.isJsonPrimitive()) {
                String friendName2;
                if (INSTANCE.sanitizeName(element.getAsString()) == null) continue;
                friendsByName.putIfAbsent(INSTANCE.normalize(friendName2), new FriendManager.FriendEntry(friendName2, INSTANCE.currentDate(), false, 4, null));
                migrated = true;
                continue;
            }
            if (!element.isJsonObject()) continue;
            JsonObject root = element.getAsJsonObject();
            JsonElement jsonElement = root.get(NAME_KEY);
            if (INSTANCE.sanitizeName(jsonElement != null ? jsonElement.getAsString() : null) == null) continue;
            JsonElement jsonElement2 = root.get(ADDED_AT_KEY);
            String addedAt = INSTANCE.sanitizeDate(jsonElement2 != null ? jsonElement2.getAsString() : null);
            JsonElement jsonElement3 = root.get(PIN_KEY);
            boolean pin = jsonElement3 != null ? jsonElement3.getAsBoolean() : false;
            if (addedAt == null) {
                migrated = true;
            }
            if (!root.has(PIN_KEY)) {
                migrated = true;
            }
            String string = INSTANCE.normalize(friendName);
            String string2 = addedAt;
            if (string2 == null) {
                string2 = INSTANCE.currentDate();
            }
            friendsByName.putIfAbsent(string, new FriendManager.FriendEntry(friendName, string2, (boolean)var12_12));
        }
        return (boolean)var2_2;
    }

    @Override
    @Compile
    public void load() {
        Object object;
        this.ensureDirectory();
        friendsByName.clear();
        this.invalidateSortedEntries();
        if (!Files.exists(filePath, new LinkOption[0])) {
            return;
        }
        try {
            JsonArray jsonArray;
            JsonElement jsonElement = JsonParser.parseString(Files.readString(filePath));
            if (jsonElement.isJsonArray()) {
                jsonArray = jsonElement.getAsJsonArray();
            } else {
                if (!jsonElement.isJsonObject()) {
                    return;
                }
                jsonArray = jsonElement.getAsJsonObject().getAsJsonArray(FRIENDS_KEY);
            }
            if (jsonArray == null) {
                return;
            }
            if (this.loadFriends(jsonArray)) {
                this.invalidateSortedEntries();
                this.save();
            }
            object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
    }

    @NotNull
    public final FriendManager.RemoveResult remove(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, NAME_KEY);
        String string = this.sanitizeName(name);
        if (string == null) {
            return FriendManager.RemoveResult.INVALID_NAME;
        }
        String friendName = string;
        String key = this.normalize(friendName);
        FriendManager.FriendEntry friendEntry = (FriendManager.FriendEntry)friendsByName.remove(key);
        if (friendEntry == null) {
            return FriendManager.RemoveResult.NOT_FOUND;
        }
        FriendManager.FriendEntry removedEntry = friendEntry;
        this.invalidateSortedEntries();
        if (!this.save()) {
            ((Map)friendsByName).put(key, removedEntry);
            this.invalidateSortedEntries();
            return FriendManager.RemoveResult.SAVE_FAILED;
        }
        \u0633\u0624.INSTANCE.clear(removedEntry);
        return FriendManager.RemoveResult.REMOVED;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.logging.LogUtils
 *  minecraft.class05018
 *  minecraft.class08774
 *  minecraft.class08957
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import minecraft.class01084;
import minecraft.class05018;
import minecraft.class08774;
import minecraft.class08957;
import org.slf4j.Logger;

public class class01053
implements class08957 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 1000;
    private static final int L = 1;
    private boolean u = true;
    private final Map<String, class01084> i = new ConcurrentHashMap<String, class01084>();
    private final Map<UUID, class01084> R = new ConcurrentHashMap<UUID, class01084>();
    private final GameProfileRepository M;
    private final Gson B = new GsonBuilder().create();
    private final File Z;
    private final AtomicLong z = new AtomicLong();

    private static DateFormat L() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
    }

    public class01053(GameProfileRepository gameProfileRepository, File file) {
        this.M = gameProfileRepository;
        this.Z = file;
        Lists.reverse(this.u()).forEach(this::N);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<class01084> u() {
        ArrayList arrayList = Lists.newArrayList();
        try (BufferedReader bufferedReader = Files.newReader((File)this.Z, (Charset)StandardCharsets.UTF_8);){
            JsonArray jsonArray = (JsonArray)this.B.fromJson((Reader)bufferedReader, JsonArray.class);
            if (jsonArray == null) {
                ArrayList arrayList2 = arrayList;
                return arrayList2;
            }
            DateFormat dateFormat = class01053.L();
            jsonArray.forEach(jsonElement -> class01053.N(jsonElement, dateFormat).ifPresent(arrayList::add));
            return arrayList;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return arrayList;
        }
        catch (JsonParseException | IOException throwable) {
            N.warn("Failed to load profile cache {}", (Object)this.Z, (Object)throwable);
        }
        return arrayList;
    }

    private class01084 y(class08774 class087742) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        calendar.setTime(new Date());
        calendar.add(2, 1);
        Date date = calendar.getTime();
        class01084 class010842 = new class01084(class087742, date);
        this.N(class010842);
        this.N();
        return class010842;
    }

    private long y() {
        return this.z.incrementAndGet();
    }

    private Optional<class08774> y(String string) {
        if (this.u) {
            return Optional.of(class08774.N((String)string));
        }
        return Optional.empty();
    }

    private Stream<class01084> N(int n) {
        return ImmutableList.copyOf(this.R.values()).stream().sorted(Comparator.comparing(class01084::L).reversed()).limit(n);
    }

    private static JsonElement N(class01084 class010842, DateFormat dateFormat) {
        JsonObject jsonObject = new JsonObject();
        class010842.N().y(jsonObject);
        jsonObject.addProperty("expiresOn", dateFormat.format(class010842.y()));
        return jsonObject;
    }

    private static Optional<class01084> N(JsonElement jsonElement, DateFormat dateFormat) {
        JsonElement jsonElement2;
        JsonObject jsonObject;
        class08774 class087742;
        if (jsonElement.isJsonObject() && (class087742 = class08774.N((JsonObject)(jsonObject = jsonElement.getAsJsonObject()))) != null && (jsonElement2 = jsonObject.get("expiresOn")) != null) {
            String string = jsonElement2.getAsString();
            try {
                Date date = dateFormat.parse(string);
                return Optional.of(new class01084(class087742, date));
            }
            catch (ParseException parseException) {
                N.warn("Failed to parse date {}", (Object)string, (Object)parseException);
            }
        }
        return Optional.empty();
    }

    public Optional<class08774> N(UUID uUID) {
        class01084 class010842 = this.R.get(uUID);
        if (class010842 == null) {
            return Optional.empty();
        }
        class010842.N(this.y());
        return Optional.of(class010842.N());
    }

    public void N(class08774 class087742) {
        this.y(class087742);
    }

    public Optional<class08774> N(String string) {
        Optional<Object> optional;
        String string2 = string.toLowerCase(Locale.ROOT);
        class01084 class010842 = this.i.get(string2);
        boolean bl = false;
        if (class010842 != null && new Date().getTime() >= class010842.N.getTime()) {
            this.R.remove(class010842.N().N());
            this.i.remove(class010842.N().y().toLowerCase(Locale.ROOT));
            bl = true;
            class010842 = null;
        }
        if (class010842 != null) {
            class010842.N(this.y());
            optional = Optional.of(class010842.N());
        } else {
            Optional<class08774> var6 = this.N(this.M, string2);
            if (var6.isPresent()) {
                optional = Optional.of(this.y(var6.get()).N());
                bl = false;
            } else {
                optional = Optional.empty();
            }
        }
        if (bl) {
            this.N();
        }
        return optional;
    }

    private Optional<class08774> N(GameProfileRepository gameProfileRepository, String string) {
        if (!class05018.R((String)string)) {
            return this.y(string);
        }
        Optional<class08774> optional = gameProfileRepository.findProfileByName(string).map(class08774::new);
        if (optional.isEmpty()) {
            return this.y(string);
        }
        return optional;
    }

    private void N(class01084 class010842) {
        class08774 class087742 = class010842.N();
        class010842.N(this.y());
        this.i.put(class087742.y().toLowerCase(Locale.ROOT), class010842);
        this.R.put(class087742.N(), class010842);
    }

    public void N(boolean bl) {
        this.u = bl;
    }

    public void N() {
        JsonArray jsonArray = new JsonArray();
        DateFormat dateFormat = class01053.L();
        this.N(1000).forEach(class010842 -> jsonArray.add(class01053.N(class010842, dateFormat)));
        String string = this.B.toJson((JsonElement)jsonArray);
        try (BufferedWriter bufferedWriter = Files.newWriter((File)this.Z, (Charset)StandardCharsets.UTF_8);){
            bufferedWriter.write(string);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}


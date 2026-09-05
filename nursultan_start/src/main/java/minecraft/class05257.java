/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10456
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  minecraft.class01829
 *  minecraft.class04551
 *  minecraft.class05001
 *  minecraft.class07529
 *  minecraft.class08735
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10456;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import minecraft.class01829;
import minecraft.class04551;
import minecraft.class05001;
import minecraft.class07529;
import minecraft.class08735;
import org.slf4j.Logger;

public class class05257 {
    private static final Logger y = LogUtils.getLogger();
    public static final class04551 N = class05257.N(UUID.randomUUID().toString().replaceAll("-", ""), "Development Version");

    private static class04551 N(JsonObject jsonObject) {
        JsonObject jsonObject2 = class05001.n((JsonObject)jsonObject, (String)"pack_version");
        return new class10456(class05001.Z((JsonObject)jsonObject, (String)"id"), class05001.Z((JsonObject)jsonObject, (String)"name"), new class01829(class05001.P((JsonObject)jsonObject, (String)"world_version"), class05001.N((JsonObject)jsonObject, (String)"series_id", (String)"main")), class05001.P((JsonObject)jsonObject, (String)"protocol_version"), class08735.N((int)class05001.P((JsonObject)jsonObject2, (String)"resource_major"), (int)class05001.P((JsonObject)jsonObject2, (String)"resource_minor")), class08735.N((int)class05001.P((JsonObject)jsonObject2, (String)"data_major"), (int)class05001.P((JsonObject)jsonObject2, (String)"data_minor")), Date.from(ZonedDateTime.parse(class05001.Z((JsonObject)jsonObject, (String)"build_time")).toInstant()), class05001.U((JsonObject)jsonObject, (String)"stable"));
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static class04551 N() {
        try (InputStream inputStream = class05257.class.getResourceAsStream("/version.json");){
            class04551 class045512;
            if (inputStream == null) {
                y.warn("Missing version information!");
                class04551 class045513 = N;
                return class045513;
            }
            try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);){
                class045512 = class05257.N(class05001.N((Reader)inputStreamReader));
            }
            return class045512;
        }
        catch (JsonParseException | IOException throwable) {
            throw new IllegalStateException("Game version information is corrupt", throwable);
        }
    }

    public static class04551 N(String string, String string2) {
        return class05257.N(string, string2, true);
    }

    public static class04551 N(String string, String string2, boolean bl) {
        return new class10456(string, string2, new class01829(4671, "main"), class07529.L(), class08735.N((int)75, (int)0), class08735.N((int)94, (int)1), new Date(), bl);
    }
}


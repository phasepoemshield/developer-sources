/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  minecraft.class02986
 *  minecraft.class02993
 *  minecraft.class05001
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Splitter;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import minecraft.class02986;
import minecraft.class02993;
import minecraft.class05001;
import org.slf4j.Logger;

public class class00198 {
    private static final Logger y = LogUtils.getLogger();
    public static final Splitter N = Splitter.on((char)'/');

    public static Path N(Path path, String string) {
        Path path2 = path.resolve("objects");
        class02986 class029862 = class02993.L();
        Path path3 = path.resolve("indexes/" + string + ".json");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path3, StandardCharsets.UTF_8);){
            JsonObject jsonObject = class05001.N((Reader)bufferedReader);
            JsonObject jsonObject2 = class05001.N((JsonObject)jsonObject, (String)"objects", null);
            if (jsonObject2 != null) {
                for (Map.Entry entry : jsonObject2.entrySet()) {
                    JsonObject jsonObject3 = (JsonObject)entry.getValue();
                    String string2 = (String)entry.getKey();
                    List var12 = N.splitToList((CharSequence)string2);
                    String string3 = class05001.Z((JsonObject)jsonObject3, (String)"hash");
                    Path path4 = path2.resolve(string3.substring(0, 2) + "/" + string3);
                    class029862.N(var12, path4);
                }
            }
        }
        catch (JsonParseException jsonParseException) {
            y.error("Unable to parse resource index file: {}", (Object)path3);
        }
        catch (IOException iOException) {
            y.error("Can't open the resource index file: {}", (Object)path3);
        }
        return class029862.N("index-" + string).getPath("/", new String[0]);
    }
}


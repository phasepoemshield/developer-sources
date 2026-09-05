/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class02267
 *  minecraft.class02968
 *  minecraft.class03652
 *  minecraft.class05001
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import minecraft.class01622;
import minecraft.class02267;
import minecraft.class02968;
import minecraft.class03652;
import minecraft.class05001;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class01598
implements class01622 {
    private static final Logger field_14182 = LogUtils.getLogger();
    private final class02267 field_49031;

    public class01598(class02267 class022672) {
        this.field_49031 = class022672;
    }

    @Override
    public class02267 method_56926() {
        return this.field_49031;
    }

    public static <T> @Nullable T method_14392(class02968<T> class029682, InputStream inputStream, class02267 class022672) {
        JsonObject jsonObject;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
            jsonObject = class05001.N((Reader)bufferedReader);
        }
        catch (Exception exception) {
            field_14182.error("Couldn't load {} {} metadata: {}", new Object[]{class022672.N(), class029682.N(), exception.getMessage()});
            return null;
        }
        if (!jsonObject.has(class029682.N())) {
            return null;
        }
        return class029682.y().parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonObject.get(class029682.N())).ifError(error -> field_14182.error("Couldn't load {} {} metadata: {}", new Object[]{class022672.N(), class029682.N(), error.message()})).result().orElse(null);
    }

    @Override
    public <T> @Nullable T method_14407(class02968<T> class029682) throws IOException {
        class03652<InputStream> var2 = this.method_14410("pack.mcmeta");
        if (var2 == null) {
            return null;
        }
        try (InputStream inputStream = (InputStream)var2.get();){
            T t = class01598.method_14392(class029682, inputStream, this.field_49031);
            return t;
        }
    }
}


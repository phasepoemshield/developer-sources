/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class03443
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import java.util.List;
import minecraft.class03327;
import minecraft.class03342;
import minecraft.class03355;
import minecraft.class03371;
import minecraft.class03443;
import minecraft.class06202;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03325 {
    private static final class03325 N = new class03355("");
    private static final Logger y = LogUtils.getLogger();
    private static final Gson L = new GsonBuilder().create();
    private final Path u;
    private @Nullable class03342 i;

    class03325(String string) {
        this.u = ((File)class06202.Nq().l_1).toPath().resolve(string);
    }

    public void N(class06202 class062022) {
        if ((class03443)class062022.T_2 == null || this.i == null) {
            y.error("Failed to log session for quickplay. Missing world data or gamemode");
            return;
        }
        class07536.Z().execute(() -> {
            try {
                Files.deleteIfExists(this.u);
            }
            catch (IOException iOException) {
                y.error("Failed to delete quickplay log file {}", (Object)this.u, (Object)iOException);
            }
            class03327 class033272 = new class03327(this.i, Instant.now(), ((class03443)class062022.T_2).U());
            Codec.list(class03327.N).encodeStart((DynamicOps)JsonOps.INSTANCE, List.of(class033272)).resultOrPartial(class07536.N((String)"Quick Play: ", arg_0 -> ((Logger)y).error(arg_0))).ifPresent(jsonElement -> {
                try {
                    Files.createDirectories(this.u.getParent(), new FileAttribute[0]);
                    Files.writeString(this.u, (CharSequence)L.toJson(jsonElement), new OpenOption[0]);
                }
                catch (IOException iOException) {
                    y.error("Failed to write to quickplay log file {}", (Object)this.u, (Object)iOException);
                }
            });
        });
    }

    public void N(class03371 class033712, String string, String string2) {
        this.i = new class03342(class033712, string, string2);
    }

    public static class03325 N(@Nullable String string) {
        if (string == null) {
            return N;
        }
        return new class03325(string);
    }
}


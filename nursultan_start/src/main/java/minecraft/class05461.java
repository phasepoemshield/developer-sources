/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 *  minecraft.class02571
 *  minecraft.class02588
 *  minecraft.class02593
 *  minecraft.class03055
 *  minecraft.class05001
 *  minecraft.class06068
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import minecraft.class02571;
import minecraft.class02588;
import minecraft.class02593;
import minecraft.class03055;
import minecraft.class05001;
import minecraft.class05469;
import minecraft.class05477;
import minecraft.class05479;
import minecraft.class06068;
import org.jspecify.annotations.Nullable;

public class class05461
extends class02593 {
    private static final String B = "v1/chat";
    final URL N;
    final class05479 y;
    final URL L;
    final class05479 u;
    private final String Z;

    private class05461(URL uRL, class02571 class025712, URL uRL2, class05479 class054792, URL uRL3, class05479 class054793, String string, class02588 class025882, ExecutorService executorService) {
        super(uRL, class025712, class025882, executorService);
        this.N = uRL2;
        this.y = class054792;
        this.L = uRL3;
        this.u = class054793;
        this.Z = string;
    }

    private void y(JsonObject jsonObject, URL uRL) throws IOException {
        try (InputStream inputStream = this.N(jsonObject, uRL).getInputStream();){
            this.N(inputStream);
        }
    }

    protected class06068 N(String string, class02588 class025882, JsonObject jsonObject) {
        if (class05001.N((JsonObject)jsonObject, (String)"response", (boolean)false)) {
            return class06068.N((String)string);
        }
        if (class05001.N((JsonObject)jsonObject, (String)"hashed", null) == null) {
            return class06068.y((String)string);
        }
        JsonArray jsonArray = class05001.t((JsonObject)jsonObject, (String)"hashes");
        class03055 class030552 = this.N(string, jsonArray, class025882);
        return new class06068(string, class030552);
    }

    public static @Nullable class02593 N(String string) {
        try {
            String string2;
            class02571 class025712;
            JsonObject jsonObject = class05001.N((String)string);
            URI uRI = new URI(class05001.Z((JsonObject)jsonObject, (String)"apiServer"));
            String string5 = class05001.Z((JsonObject)jsonObject, (String)"apiKey");
            if (string5.isEmpty()) {
                throw new IllegalArgumentException("Missing API key");
            }
            int n = class05001.N((JsonObject)jsonObject, (String)"ruleId", (int)1);
            String string6 = class05001.N((JsonObject)jsonObject, (String)"serverId", (String)"");
            String string7 = class05001.N((JsonObject)jsonObject, (String)"roomId", (String)"Java:Chat");
            int n2 = class05001.N((JsonObject)jsonObject, (String)"hashesToDrop", (int)-1);
            int n3 = class05001.N((JsonObject)jsonObject, (String)"maxConcurrentRequests", (int)7);
            JsonObject jsonObject2 = class05001.N((JsonObject)jsonObject, (String)"endpoints", null);
            String string8 = class05461.N((JsonObject)jsonObject2, (String)"chat", (String)B);
            boolean bl = string8.equals(B);
            URL uRL = uRI.resolve("/" + string8).toURL();
            URL uRL2 = class05461.N((URI)uRI, (JsonObject)jsonObject2, (String)"join", (String)"v1/join");
            URL uRL3 = class05461.N((URI)uRI, (JsonObject)jsonObject2, (String)"leave", (String)"v1/leave");
            class05479 class054792 = gameProfile -> {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("server", string6);
                jsonObject.addProperty("room", string7);
                jsonObject.addProperty("user_id", gameProfile.id().toString());
                jsonObject.addProperty("user_display_name", gameProfile.name());
                return jsonObject;
            };
            if (bl) {
                class025712 = (gameProfile, string3) -> {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("rule", (Number)n);
                    jsonObject.addProperty("server", string6);
                    jsonObject.addProperty("room", string7);
                    jsonObject.addProperty("player", gameProfile.id().toString());
                    jsonObject.addProperty("player_display_name", gameProfile.name());
                    jsonObject.addProperty("text", string3);
                    jsonObject.addProperty("language", "*");
                    return jsonObject;
                };
            } else {
                string2 = String.valueOf(n);
                class025712 = (gameProfile, string4) -> {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("rule_id", string2);
                    jsonObject.addProperty("category", string6);
                    jsonObject.addProperty("subcategory", string7);
                    jsonObject.addProperty("user_id", gameProfile.id().toString());
                    jsonObject.addProperty("user_display_name", gameProfile.name());
                    jsonObject.addProperty("text", string4);
                    jsonObject.addProperty("language", "*");
                    return jsonObject;
                };
            }
            string2 = class02588.y((int)n2);
            ExecutorService executorService = class05461.N((int)n3);
            String string9 = Base64.getEncoder().encodeToString(string5.getBytes(StandardCharsets.US_ASCII));
            return new class05461(uRL, class025712, uRL2, class054792, uRL3, class054792, string9, (class02588)string2, executorService);
        }
        catch (Exception exception) {
            i.warn("Failed to parse chat filter config {}", (Object)string, (Object)exception);
            return null;
        }
    }

    public class05477 N(GameProfile gameProfile) {
        return new class05469(this, gameProfile);
    }

    void N(GameProfile gameProfile, URL uRL, class05479 class054792, Executor executor) {
        executor.execute(() -> {
            JsonObject jsonObject = class054792.encode(gameProfile);
            try {
                this.y(jsonObject, uRL);
            }
            catch (Exception exception) {
                i.warn("Failed to send join/leave packet to {} for player {}", new Object[]{uRL, gameProfile, exception});
            }
        });
    }

    protected void N(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("Authorization", "Basic " + this.Z);
    }
}


package org.zenith.managers;

import org.zenith.module.Emotes;
import org.zenith.module.Module;

import org.zenith.config.CosmeticManager;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.event.Event18;
import org.zenith.ZenithClient;

import org.zenith.module.AutoInventory;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.minecraftApi.codec.EmotecraftGsonCodec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EmoteManager {
   public static final Logger logger3 = LoggerFactory.getLogger("Zenith/Emotes");
   public static final List<String> list117 = List.of(
      "backflip", "clap", "club_penguin_dance", "crying", "kazotsky_kick", "palm", "point", "roblox_potion_dance", "twerk", "waving"
   );
   public static final List<String> list118 = List.of("/assets/zenith/emotes/spemotes/index.txt");
   public final Map<String, EmoteMetadata> map61;

   public EmoteManager() {
      var linkedhashmap = new LinkedHashMap();

      for (String s : list117) {
         CosmeticManager(s).ifPresent(var1x -> linkedhashmap.put(var1x.id(), var1x));
      }

      for (String s1 : list118) {
         EmoteManager(s1).forEach(var1x -> CosmeticManager(var1x).ifPresent(var1xx -> linkedhashmap.put(var1xx.id(), var1xx)));
      }

      this.map61 = Collections.unmodifiableMap(linkedhashmap);
      logger3.info("Loaded {} built-in Zenith emotes", this.map61.size());
   }

   public Optional<EmoteMetadata> find(String var1) {
      return var1 != null && !var1.isBlank() ? Optional.ofNullable(this.map61.get(EmotePlayback(var1))) : Optional.empty();
   }

   public Collection<EmoteMetadata> all() {
      return this.map61.values();
   }

   public List<String> AutoInventory() {
      return List.copyOf(this.map61.keySet());
   }

   public static List<String> EmoteManager(String var0) {
      try {
         List list;
         try (InputStream inputstream = EmoteManager.class.getResourceAsStream(var0)) {
            if (inputstream == null) {
               logger3.warn("Missing built-in emote index {}", var0);
               return List.of();
            }

            try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, StandardCharsets.UTF_8))) {
               list = bufferedreader.lines().map(String::trim).filter(var0x -> !var0x.isEmpty() && !var0x.startsWith("#")).toList();
            }
         }

         return list;
      } catch (IOException ioexception) {
         logger3.warn("Could not load built-in emote index {}", var0, ioexception);
         return List.of();
      }
   }

   public static Optional<EmoteMetadata> CosmeticManager(String var0) {
      String s = "/assets/zenith/emotes/" + var0 + ".json";

      try {
         Optional optional;
         try (InputStream inputstream = EmoteManager.class.getResourceAsStream(s)) {
            if (inputstream == null) {
               logger3.warn("Missing built-in emote resource {}", s);
               return Optional.empty();
            }

            var collection = EmotecraftGsonCodec.INSTANCE.decode(inputstream);
            if (collection.isEmpty()) {
               logger3.warn("Built-in emote {} contains no animations", var0);
               return Optional.empty();
            }

            KeyframeAnimation keyframeanimation = (KeyframeAnimation)collection.iterator().next();
            optional = Optional.of(
               new EmoteMetadata(
                  EmotePlayback(var0),
                  keyframeanimation.getUuid(),
                  on23(keyframeanimation, "name", Event18(var0)),
                  on23(keyframeanimation, "author", "Unknown"),
                  Identifier.of("Zenith".toLowerCase(Locale.ROOT), "emotes/" + var0 + ".png"),
                  keyframeanimation
               )
            );
         }

         return optional;
      } catch (RuntimeException | IOException ioexception) {
         logger3.warn("Could not load built-in emote {}", var0, ioexception);
         return Optional.empty();
      }
   }

   public static String on23(KeyframeAnimation var0, String var1, String var2) {
      if (var0.extraData.get(var1) instanceof String s && !s.isBlank()) {
         try {
            JsonElement jsonelement = JsonParser.parseString(s);
            if (jsonelement.isJsonPrimitive() && jsonelement.getAsJsonPrimitive().isString()) {
               return jsonelement.getAsString();
            }

            if (jsonelement.isJsonObject()) {
               JsonObject jsonobject = jsonelement.getAsJsonObject();
               if (jsonobject.has("fallback") && jsonobject.get("fallback").isJsonPrimitive()) {
                  return jsonobject.get("fallback").getAsString();
               }
            }
         } catch (RuntimeException runtimeexception) {
         }

         return s;
      }

      return var2;
   }

   public static String EmotePlayback(String var0) {
      return var0.trim().toLowerCase(Locale.ROOT).replace(' ', '_');
   }

   public static String Event18(String var0) {
      var arraylist = new ArrayList();

      for (String s : var0.split("_")) {
         arraylist.add(s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1));
      }

      return String.join(" ", arraylist);
   }
}

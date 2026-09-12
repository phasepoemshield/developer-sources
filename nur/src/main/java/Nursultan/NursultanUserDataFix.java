package nursultan;

import Nursultan.class11664;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.util.ChatColorUtil;
import com.viaversion.viaversion.util.ConfigSection;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import minecraft.class06581;
import minecraft.class06584;

public class NursultanUserDataFix {
   private static volatile boolean bootstrapped = false;
   private static volatile Map<String, Integer> blockNameToId1_20_5 = null;
   private static volatile List<String> blockIdToName1_20_5 = null;
   private static volatile Map<String, Integer> soundNameToId1_20_5 = null;
   private static volatile List<String> soundIdToName1_20_5 = null;

   public static synchronized void markBootstrapped() {
      bootstrapped = true;
   }

   public static synchronized void bootstrapMods() {
      if (bootstrapped) {
         return;
      }
      bootstrapped = true;

      try {
         Class<?> loaderClass = Class.forName("net.fabricmc.loader.impl.FabricLoaderImpl");
         Object loader = loaderClass.getField("INSTANCE").get(null);
         Method isModLoadedMethod = loaderClass.getMethod("isModLoaded", String.class);
         if (Boolean.TRUE.equals(isModLoadedMethod.invoke(loader, "fabric-api"))
             || Boolean.TRUE.equals(isModLoadedMethod.invoke(loader, "nursultan"))) {
            System.out.println("[NursultanFix] Embedded mods already registered in FabricLoader. Skipping redundant bootstrap.");
            return;
         }

         System.out.println("[NursultanFix] Bootstrapping embedded mods from nursultan-mods.json into FabricLoader...");

         Class<?> mainClass = Class.forName("Main");
         Method selfPathMethod = mainClass.getDeclaredMethod("selfPath");
         selfPathMethod.setAccessible(true);
         Path selfPath = (Path)selfPathMethod.invoke(null);
         Method registerModsMethod = mainClass.getDeclaredMethod("registerMods", loaderClass, Path.class);
         registerModsMethod.setAccessible(true);
         List<Object[]> modsList = (List<Object[]>)registerModsMethod.invoke(null, loader, selfPath);
         int modCount = modsList != null ? modsList.size() : 0;
         System.out.println("[NursultanFix] Registered " + modCount + " embedded mods into FabricLoader.");
         Method instantiateMethod = mainClass.getDeclaredMethod("instantiate", loaderClass, List.class);
         instantiateMethod.setAccessible(true);
         instantiateMethod.invoke(null, loader, modsList);
         System.out.println("[NursultanFix] Instantiated embedded mod entrypoints.");

         try {
            Class<?> preLaunchClass = Class.forName("net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint");
            Method invokeEntrypointsMethod = loaderClass.getMethod("invokeEntrypoints", String.class, Class.class, Consumer.class);
            invokeEntrypointsMethod.invoke(loader, "preLaunch", preLaunchClass, (Consumer<Object>)entrypoint -> {
               try {
                  preLaunchClass.getMethod("onPreLaunch").invoke(entrypoint);
               } catch (Throwable var3x) {
               }
            });
            System.out.println("[NursultanFix] Invoked preLaunch entrypoints.");
         } catch (Throwable var11) {
            System.out.println("[NursultanFix] Note: preLaunch invoke: " + var11.getMessage());
         }

         System.out.println("[NursultanFix] All embedded mods successfully bootstrapped!");
      } catch (Throwable var12) {
         System.err.println("[NursultanFix] Warning during mod bootstrap: " + var12.getMessage());
         var12.printStackTrace();
      }
   }

   public static Object resolve(OptionSet options, OptionSpec<?> spec, String errorMessage) {
      bootstrapMods();
      if (options != null && spec != null && options.has(spec)) {
         try {
            return options.valueOf(spec);
         } catch (Throwable var4) {
         }
      }

      if (errorMessage != null) {
         String lower = errorMessage.toLowerCase();
         if (lower.contains("login")) {
            return "soezproject SRC BY @SvitikAccountBot";
         }

         if (lower.contains("uid")) {
            return 1;
         }

         if (lower.contains("subscribe")) {
            return 999999999L;
         }

         if (lower.contains("role")) {
            return "premium";
         }

         if (lower.contains("hash")) {
            return "0";
         }

         if (lower.contains("api token") || lower.contains("apitoken")) {
            return "0";
         }

         if (lower.contains("bought products") || lower.contains("boughtproducts")) {
            return "premium";
         }

         if (lower.contains("avatar")) {
            return "none";
         }
      }

      return "";
   }

   public static String resolveConfigString(ConfigSection section, String key, String def) {
      return section == null ? ChatColorUtil.translateAlternateColorCodes(def) : ChatColorUtil.translateAlternateColorCodes(section.getString(key, def));
   }

   public static class06584 resolveItemStack(Object instance) {
      if (instance instanceof class11664 inst) {
         try {
            class06581 item = inst.i();
            if (item != null) {
               return item.E();
            }
         } catch (Throwable var3) {
         }
      }

      return null;
   }

   private static synchronized void ensure1_20_5Mappings() {
      if (blockNameToId1_20_5 == null) {
         Map<String, Integer> bMap = new HashMap<>(1500);
         List<String> bList = new ArrayList<>(1500);
         Map<String, Integer> sMap = new HashMap<>(2500);
         List<String> sList = new ArrayList<>(2500);

         try {
            CompoundTag tag = MappingDataLoader.INSTANCE.loadNBT("extra-identifiers-1.20.3.nbt");
            if (tag != null) {
               ListTag<?> blockTag = tag.getListTag("blocks");
               if (blockTag != null) {
                  for (int i = 0; i < blockTag.size(); i++) {
                     Object item = blockTag.get(i);
                     String name = item instanceof Tag ? ((Tag)item).asRawString() : item.toString();
                     addBlockMapping(bMap, bList, name);
                  }
               }

               ListTag<?> soundTag = tag.getListTag("sounds");
               if (soundTag != null) {
                  for (int i = 0; i < soundTag.size(); i++) {
                     Object item = soundTag.get(i);
                     String name = item instanceof Tag ? ((Tag)item).asRawString() : item.toString();
                     addSoundMapping(sMap, sList, name);
                  }
               }
            }
         } catch (Throwable var16) {
            System.err.println("[NursultanFix] Warning loading extra-identifiers via MappingDataLoader: " + var16);
         }

         if (bList.isEmpty() || sList.isEmpty()) {
            try (InputStream is = NursultanUserDataFix.class.getClassLoader().getResourceAsStream("assets/viaversion/data/extra-identifiers-1.20.3.nbt")) {
               if (is != null) {
                  DataInputStream dis = new DataInputStream(is);
                  byte rootType = dis.readByte();
                  if (rootType == 10) {
                     dis.readUTF();

                     while (dis.available() > 0) {
                        byte tagType = dis.readByte();
                        if (tagType == 0) {
                           break;
                        }

                        String name = dis.readUTF();
                        if (tagType == 9) {
                           byte elemType = dis.readByte();
                           int count = dis.readInt();

                           for (int i = 0; i < count; i++) {
                              if (elemType == 8) {
                                 String str = dis.readUTF();
                                 if ("blocks".equals(name)) {
                                    addBlockMapping(bMap, bList, str);
                                 } else if ("sounds".equals(name)) {
                                    addSoundMapping(sMap, sList, str);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } catch (Throwable var15) {
               System.err.println("[NursultanFix] Warning loading extra-identifiers via stream: " + var15);
            }
         }

         blockNameToId1_20_5 = bMap;
         blockIdToName1_20_5 = bList;
         soundNameToId1_20_5 = sMap;
         soundIdToName1_20_5 = sList;
         System.out.println("[NursultanFix] Loaded 1.20.5 mappings: " + bList.size() + " blocks, " + sList.size() + " sounds.");
      }
   }

   private static void addBlockMapping(Map<String, Integer> bMap, List<String> bList, String rawName) {
      if (rawName != null) {
         int id = bList.size();
         bList.add(rawName);
         bMap.put(rawName, id);
         if (rawName.startsWith("minecraft:")) {
            bMap.put(rawName.substring(10), id);
         } else {
            bMap.put("minecraft:" + rawName, id);
         }
      }
   }

   private static void addSoundMapping(Map<String, Integer> sMap, List<String> sList, String rawName) {
      if (rawName != null) {
         int id = sList.size();
         sList.add(rawName);
         sMap.put(rawName, id);
         if (rawName.startsWith("minecraft:")) {
            sMap.put(rawName.substring(10), id);
         } else {
            sMap.put("minecraft:" + rawName, id);
         }
      }
   }

   public static int resolve1_20_5BlockId(String name) {
      if (name == null) {
         return -1;
      } else {
         try {
            ensure1_20_5Mappings();
            Integer id = blockNameToId1_20_5.get(name);
            if (id != null) {
               return id;
            }

            if (name.startsWith("minecraft:")) {
               id = blockNameToId1_20_5.get(name.substring(10));
               if (id != null) {
                  return id;
               }
            }
         } catch (Throwable var2) {
         }

         return -1;
      }
   }

   public static String resolve1_20_5BlockName(int id) {
      try {
         ensure1_20_5Mappings();
         if (id >= 0 && id < blockIdToName1_20_5.size()) {
            return blockIdToName1_20_5.get(id);
         }
      } catch (Throwable var2) {
      }

      return null;
   }

   public static int resolve1_20_5SoundId(String name) {
      if (name == null) {
         return -1;
      } else {
         try {
            ensure1_20_5Mappings();
            Integer id = soundNameToId1_20_5.get(name);
            if (id != null) {
               return id;
            }

            if (name.startsWith("minecraft:")) {
               id = soundNameToId1_20_5.get(name.substring(10));
               if (id != null) {
                  return id;
               }
            }
         } catch (Throwable var2) {
         }

         return -1;
      }
   }

   public static String resolve1_20_5SoundName(int id) {
      try {
         ensure1_20_5Mappings();
         if (id >= 0 && id < soundIdToName1_20_5.size()) {
            return soundIdToName1_20_5.get(id);
         }
      } catch (Throwable var2) {
      }

      return null;
   }
}

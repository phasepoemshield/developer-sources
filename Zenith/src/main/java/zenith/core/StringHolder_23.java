package zenith;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.ResourceType;

public final class StringHolder_23 {
   private static final String l1I11llIl1Il1ll = "cosmetics";
   private static final String l1llI1IIlIl11lI1IIl = ".lua";
   /** false until Figura is initialized. Must not start as true or init is skipped forever. */
   private static boolean lllIllllI = false;
   public static final ConcurrentHashMap<Object, Object> I11Il1lIIllII1l1I1I11 = new ConcurrentHashMap<>();

   private StringHolder_23() {
   }

   public static String ZenithInternal095(Path path) {
      return path == null ? "" : ZenithClient.AhHelper.toPath().relativize(path).toString();
   }

   public static Path EventImpl_29(String s) {
      return s == null ? null : ZenithClient.AhHelper.toPath().resolve(s);
   }

   public static Object StringHolder_8(Path path, UUID uuid) {
      llllIIl1IIlIl11l1I();
      IllIIlIlIl1I1I111111IIlI11();
      if (uuid == null) {
         return null;
      }

      Path path1 = Event(path);
      if (path1 == null) {
         return null;
      }

      EventImpl_24(path1);

      try {
         // Local player: use official Figura API (registers into AvatarManager.LOADED_USERS)
         try {
            Method isLocal = Class.forName("org.figuramc.figura.FiguraMod").getMethod("isLocal", UUID.class);
            if (Boolean.TRUE.equals(isLocal.invoke(null, uuid))) {
               Method loadLocal = StringHolder_8(Class.forName("org.figuramc.figura.avatar.AvatarManager"), "loadLocalAvatar", Path.class);
               if (loadLocal != null) {
                  loadLocal.invoke(null, path1);
                  return ll11II111111I1I1IlIIl11111lI1().get(uuid);
               }
            }
         } catch (Exception ignored) {
         }

         Class<?> avatarManager = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Method clear = StringHolder_8(avatarManager, "clearAvatars", UUID.class);
         if (clear != null) {
            clear.invoke(null, uuid);
         }

         ConcurrentHashMap<Object, Object> loaded = ll11II111111I1I1IlIIl11111lI1();
         Object object = loaded.get(uuid);
         if (object == null) {
            object = EventTarget(uuid);
            if (object != null) {
               loaded.put(uuid, object);
            }
         }
         if (object == null) {
            return null;
         }

         Class oclass = Class.forName("org.figuramc.figura.avatar.local.LocalAvatarLoader");
         Method method = StringHolder_8(oclass, "loadAvatar", Path.class, object.getClass());
         if (method == null) {
            method = StringHolder_8(oclass, "loadAvatar", 2);
         }
         if (method != null) {
            method.setAccessible(true);
            method.invoke(null, path1, object);
         }
         return object;
      } catch (Exception exception) {
         exception.printStackTrace();
         return null;
      }
   }

   public static void EventBus(UUID uuid, String s) {
      if (uuid != null && s != null && !s.isBlank()) {
         StringHolder_8(uuid, EventImpl_29(s));
      }
   }

   public static void StringHolder_8(UUID uuid, Path path) {
      if (uuid != null && path != null) {
         llllIIl1IIlIl11l1I();
         IllIIlIlIl1I1I111111IIlI11();

         try {
            Object object = StringHolder_8(path, uuid);
            if (object != null) {
               I11Il1lIIllII1l1I1I11.put(uuid, object);
            }
         } catch (Exception exception) {
         }
      }
   }

   private static void llllIIl1IIlIl11l1I() {
      if (!lllIllllI) {
         try {
            ZenithInternal042("org.figuramc.figura.config.ConfigManager", "init");
            l1l1Il1l1lIIl1lI();
            ZenithInternal042("org.figuramc.figura.FiguraMod", "onClientInit");
            ZenithInternal042("org.figuramc.figura.commands.fabric.FiguraCommandsFabric", "init");
            if (ZenithInternal042("org.figuramc.figura.FiguraMod", "getResourceListeners") instanceof Iterable iterable) {
               ResourceManagerHelper resourcemanagerhelper = ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES);
               Class oclass = Class.forName("org.figuramc.figura.utils.FiguraResourceListener");

               for (Object object : iterable) {
                  if (oclass.isInstance(object) && object instanceof SimpleSynchronousResourceReloadListener simplesynchronousresourcereloadlistener) {
                     resourcemanagerhelper.registerReloadListener(simplesynchronousresourcereloadlistener);
                  }
               }
            }

            lllIllllI = true;
         } catch (Exception exception) {
         }
      }
   }

   private static void IllIIlIlIl1I1I111111IIlI11() {
      try {
         Class oclass = Class.forName("org.figuramc.figura.permissions.PermissionManager");
         Field field = oclass.getDeclaredField("CATEGORIES");
         field.setAccessible(true);
         Object object = field.get(null);
         boolean flag = false;
         if (object instanceof Map map) {
            flag = map.isEmpty();
         } else if (object instanceof Iterable iterable) {
            flag = !iterable.iterator().hasNext();
         }

         if (flag) {
            oclass.getMethod("init").invoke(null);
         }
      } catch (Exception exception) {
      }
   }

   private static void l1l1Il1l1lIIl1lI() {
      net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
      if (MinecraftClient != null) {
         try {
            Files.createDirectories(MinecraftClient.runDirectory.toPath().resolve("cosmetics"));
         } catch (Exception exception1) {
         }
      }

      try {
         Class oclass = Class.forName("org.figuramc.figura.config.Configs");
         Field field = oclass.getDeclaredField("MAIN_DIR");
         field.setAccessible(true);
         Object object = field.get(null);
         if (object == null) {
            return;
         }

         Method method;
         try {
            method = object.getClass().getMethod("setValue", Object.class);
         } catch (NoSuchMethodException nosuchmethodexception) {
            method = object.getClass().getMethod("setValue", String.class);
         }

         method.setAccessible(true);
         method.invoke(object, "cosmetics");
      } catch (Exception exception) {
      }
   }

   public static Path Event(Path path) {
      if (path != null && Files.isDirectory(path)) {
         try {
            Path path1;
            try (Stream stream = Files.list(path)) {
               boolean flag = stream.anyMatch(path2 -> path2.getFileName().toString().equalsIgnoreCase("avatar.json"));
               path1 = flag ? path : null;
            }

            return path1;
         } catch (Exception exception) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static void EventImpl_24(Path path) {
      if (path != null && Files.isDirectory(path)) {
         try (Stream stream = Files.walk(path)) {
            stream.filter(path1 -> Files.isRegularFile(path1)).filter(StringHolder_23::ZenithInternal028).forEach(StringHolder_23::EventImpl_21);
         } catch (Exception exception) {
         }
      }
   }

   private static boolean ZenithInternal028(Path path) {
      Path path1 = path.getFileName();
      return path1 != null && path1.toString().toLowerCase(Locale.ROOT).endsWith(".lua");
   }

   private static void EventImpl_21(Path path) {
      try {
         byte[] abyte = Files.readAllBytes(path);
         if (abyte.length < 3) {
            return;
         }

         boolean flag = (abyte[0] & 255) == 239 && (abyte[1] & 255) == 187 && (abyte[2] & 255) == 191;
         if (!flag) {
            return;
         }

         byte[] abyte1 = new byte[abyte.length - 3];
         System.arraycopy(abyte, 3, abyte1, 0, abyte1.length);
         Files.write(path, abyte1);
      } catch (Exception exception) {
      }
   }

   private static ConcurrentHashMap<Object, Object> ll11II111111I1I1IlIIl11111lI1() {
      try {
         Class oclass = Class.forName("org.figuramc.figura.avatar.AvatarManager");

         for (Field field : oclass.getDeclaredFields()) {
            if (Map.class.isAssignableFrom(field.getType())) {
               field.setAccessible(true);
               Object object = field.get(null);
               if (object instanceof ConcurrentHashMap) {
                  return (ConcurrentHashMap<Object, Object>)object;
               }
            }
         }
      } catch (Exception exception) {
      }

      return new ConcurrentHashMap<>();
   }

   private static Object EventTarget(UUID uuid) {
      try {
         Class oclass = Class.forName("org.figuramc.figura.avatar.UserData");
         Constructor constructor = oclass.getConstructor(UUID.class);
         constructor.setAccessible(true);
         return constructor.newInstance(uuid);
      } catch (Exception exception) {
         return null;
      }
   }

   private static Object ZenithInternal042(String s, String s1) throws Exception {
      Class oclass = Class.forName(s);
      Method method = oclass.getMethod(s1);
      method.setAccessible(true);
      return method.invoke(null);
   }

   private static Method StringHolder_8(Class<?> oclass, String s, Class<?>... aclass) {
      try {
         Method method1 = oclass.getMethod(s, aclass);
         method1.setAccessible(true);
         return method1;
      } catch (Exception exception1) {
         try {
            Method method = oclass.getDeclaredMethod(s, aclass);
            method.setAccessible(true);
            return method;
         } catch (Exception exception) {
            return null;
         }
      }
   }

   private static Method StringHolder_8(Class<?> oclass, String s, int i) {
      for (Method method : oclass.getMethods()) {
         if (method.getName().equals(s) && method.getParameterCount() == i) {
            return method;
         }
      }

      for (Method method1 : oclass.getDeclaredMethods()) {
         if (method1.getName().equals(s) && method1.getParameterCount() == i) {
            method1.setAccessible(true);
            return method1;
         }
      }

      return null;
   }
}

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
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourceType;

/**
 * Figura cosmetics bridge (runtime class name kept as zenith.l1ll111IIIl).
 */
public final class l1ll111IIIl {
   private static final String l1I11llIl1Il1ll = "cosmetics";
   private static final String l1llI1IIlIl11lI1IIl = ".lua";
   /** false until Figura is initialized. Original jar started as true and skipped init forever. */
   private static boolean lllIllllI = false;

   public static final ConcurrentHashMap<Object, Object> I11Il1lIIllII1l1I1I11 = new TrackingMap();

   private l1ll111IIIl() {
   }

   private static Path zenithRoot() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (client == null || client.runDirectory == null) {
         return Path.of("Zenith");
      }
      return client.runDirectory.toPath().resolve("Zenith");
   }

   public static String l1lll11l1l(Path path) {
      if (path == null) {
         return "";
      }
      try {
         return zenithRoot().relativize(path).toString();
      } catch (Exception e) {
         return path.toString();
      }
   }

   public static Path ll1I1II1Il(String s) {
      return s == null ? null : zenithRoot().resolve(s);
   }

   public static Object II1Il11l111II11IIl(Path path, UUID uuid) {
      llllIIl1IIlIl11l1I();
      IllIIlIlIl1I1I111111IIlI11();
      if (uuid == null) {
         return null;
      }

      Path avatarDir = lIIl11l111lIIl1ll(path);
      if (avatarDir == null) {
         return null;
      }

      stripLuaBom(avatarDir);

      try {
         if (isLocalPlayer(uuid)) {
            Method loadLocal = findMethod(Class.forName("org.figuramc.figura.avatar.AvatarManager"), "loadLocalAvatar", Path.class);
            if (loadLocal != null) {
               loadLocal.invoke(null, avatarDir);
               return getLoadedUsers().get(uuid);
            }
         }

         Class<?> avatarManager = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Method clear = findMethod(avatarManager, "clearAvatars", UUID.class);
         if (clear != null) {
            clear.invoke(null, uuid);
         }

         ConcurrentHashMap<Object, Object> loaded = getLoadedUsers();
         Object user = loaded.get(uuid);
         if (user == null) {
            user = createUserData(uuid);
            if (user != null) {
               loaded.put(uuid, user);
            }
         }
         if (user == null) {
            return null;
         }

         markFetched(uuid);

         Class<?> loader = Class.forName("org.figuramc.figura.avatar.local.LocalAvatarLoader");
         Method method = findMethod(loader, "loadAvatar", Path.class, user.getClass());
         if (method == null) {
            method = findMethodByArity(loader, "loadAvatar", 2);
         }
         if (method != null) {
            method.setAccessible(true);
            method.invoke(null, avatarDir, user);
         }
         return user;
      } catch (Exception exception) {
         exception.printStackTrace();
         return null;
      }
   }

   public static void l1I1IlllIlI(UUID uuid, String s) {
      if (uuid != null && s != null && !s.isBlank()) {
         II1Il11l111II11IIl(uuid, ll1I1II1Il(s));
      }
   }

   public static void II1Il11l111II11IIl(UUID uuid, Path path) {
      if (uuid == null || path == null) {
         return;
      }
      llllIIl1IIlIl11l1I();
      IllIIlIlIl1I1I111111IIlI11();
      try {
         Object object = II1Il11l111II11IIl(path, uuid);
         if (object != null) {
            I11Il1lIIllII1l1I1I11.put(uuid, object);
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private static void llllIIl1IIlIl11l1I() {
      if (lllIllllI) {
         return;
      }
      try {
         invokeStatic("org.figuramc.figura.config.ConfigManager", "init");
         configureMainDir();
         invokeStatic("org.figuramc.figura.FiguraMod", "onClientInit");
         try {
            invokeStatic("org.figuramc.figura.commands.fabric.FiguraCommandsFabric", "init");
         } catch (Exception ignored) {
         }
         Object listeners = invokeStatic("org.figuramc.figura.FiguraMod", "getResourceListeners");
         if (listeners instanceof Iterable<?> iterable) {
            ResourceManagerHelper helper = ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES);
            Class<?> listenerClass = Class.forName("org.figuramc.figura.utils.FiguraResourceListener");
            for (Object object : iterable) {
               if (listenerClass.isInstance(object) && object instanceof SimpleSynchronousResourceReloadListener sync) {
                  helper.registerReloadListener(sync);
               }
            }
         }
         lllIllllI = true;
         System.out.println("[Zenith Cosmetics] Figura initialized");
      } catch (Exception exception) {
         System.err.println("[Zenith Cosmetics] Figura init failed: " + exception);
         exception.printStackTrace();
      }
   }

   private static void IllIIlIlIl1I1I111111IIlI11() {
      try {
         Class<?> oclass = Class.forName("org.figuramc.figura.permissions.PermissionManager");
         Field field = oclass.getDeclaredField("CATEGORIES");
         field.setAccessible(true);
         Object object = field.get(null);
         boolean empty = false;
         if (object instanceof Map<?, ?> map) {
            empty = map.isEmpty();
         } else if (object instanceof Iterable<?> iterable) {
            empty = !iterable.iterator().hasNext();
         }
         if (empty) {
            oclass.getMethod("init").invoke(null);
         }
      } catch (Exception ignored) {
      }
   }

   private static void configureMainDir() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (client != null) {
         try {
            Files.createDirectories(client.runDirectory.toPath().resolve("cosmetics"));
         } catch (Exception ignored) {
         }
      }
      try {
         Class<?> oclass = Class.forName("org.figuramc.figura.config.Configs");
         Field field = oclass.getDeclaredField("MAIN_DIR");
         field.setAccessible(true);
         Object object = field.get(null);
         if (object == null) {
            return;
         }
         Method method;
         try {
            method = object.getClass().getMethod("setValue", Object.class);
         } catch (NoSuchMethodException e) {
            method = object.getClass().getMethod("setValue", String.class);
         }
         method.setAccessible(true);
         method.invoke(object, "cosmetics");
      } catch (Exception ignored) {
      }
   }

   /** Kept for binary compatibility with callers that may use the old name via reflection/javap. */
   public static Path lIIl11l111lIIl1ll(Path path) {
      if (path != null && Files.isDirectory(path)) {
         try (Stream<Path> stream = Files.list(path)) {
            boolean hasAvatar = stream.anyMatch(p -> p.getFileName().toString().equalsIgnoreCase("avatar.json"));
            return hasAvatar ? path : null;
         } catch (Exception exception) {
            return null;
         }
      }
      return null;
   }

   private static void stripLuaBom(Path path) {
      if (path == null || !Files.isDirectory(path)) {
         return;
      }
      try (Stream<Path> stream = Files.walk(path)) {
         stream.filter(Files::isRegularFile)
            .filter(p -> {
               Path name = p.getFileName();
               return name != null && name.toString().toLowerCase(Locale.ROOT).endsWith(".lua");
            })
            .forEach(l1ll111IIIl::stripBomFile);
      } catch (Exception ignored) {
      }
   }

   private static void stripBomFile(Path path) {
      try {
         byte[] bytes = Files.readAllBytes(path);
         if (bytes.length < 3) {
            return;
         }
         boolean bom = (bytes[0] & 255) == 239 && (bytes[1] & 255) == 187 && (bytes[2] & 255) == 191;
         if (!bom) {
            return;
         }
         byte[] stripped = new byte[bytes.length - 3];
         System.arraycopy(bytes, 3, stripped, 0, stripped.length);
         Files.write(path, stripped);
      } catch (Exception ignored) {
      }
   }

   @SuppressWarnings("unchecked")
   private static ConcurrentHashMap<Object, Object> getLoadedUsers() {
      try {
         Class<?> oclass = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         try {
            Field named = oclass.getDeclaredField("LOADED_USERS");
            named.setAccessible(true);
            Object object = named.get(null);
            if (object instanceof ConcurrentHashMap<?, ?> map) {
               return (ConcurrentHashMap<Object, Object>) object;
            }
         } catch (NoSuchFieldException ignored) {
         }
         for (Field field : oclass.getDeclaredFields()) {
            if (Map.class.isAssignableFrom(field.getType())) {
               field.setAccessible(true);
               Object object = field.get(null);
               if (object instanceof ConcurrentHashMap<?, ?> map) {
                  return (ConcurrentHashMap<Object, Object>) object;
               }
            }
         }
      } catch (Exception ignored) {
      }
      return new ConcurrentHashMap<>();
   }

   private static Object createUserData(UUID uuid) {
      try {
         Class<?> oclass = Class.forName("org.figuramc.figura.avatar.UserData");
         Constructor<?> constructor = oclass.getConstructor(UUID.class);
         constructor.setAccessible(true);
         return constructor.newInstance(uuid);
      } catch (Exception exception) {
         exception.printStackTrace();
         return null;
      }
   }

   private static Object invokeStatic(String className, String methodName) throws Exception {
      Class<?> oclass = Class.forName(className);
      Method method = oclass.getMethod(methodName);
      method.setAccessible(true);
      return method.invoke(null);
   }

   private static Method findMethod(Class<?> oclass, String name, Class<?>... params) {
      try {
         Method method = oclass.getMethod(name, params);
         method.setAccessible(true);
         return method;
      } catch (Exception e1) {
         try {
            Method method = oclass.getDeclaredMethod(name, params);
            method.setAccessible(true);
            return method;
         } catch (Exception e2) {
            return null;
         }
      }
   }

   private static Method findMethodByArity(Class<?> oclass, String name, int arity) {
      for (Method method : oclass.getMethods()) {
         if (method.getName().equals(name) && method.getParameterCount() == arity) {
            return method;
         }
      }
      for (Method method : oclass.getDeclaredMethods()) {
         if (method.getName().equals(name) && method.getParameterCount() == arity) {
            method.setAccessible(true);
            return method;
         }
      }
      return null;
   }

   private static boolean isLocalPlayer(UUID uuid) {
      try {
         Method m = Class.forName("org.figuramc.figura.FiguraMod").getMethod("isLocal", UUID.class);
         Object result = m.invoke(null, uuid);
         return result instanceof Boolean b && b;
      } catch (Exception e) {
         MinecraftClient client = MinecraftClient.getInstance();
         return client != null && client.player != null && client.player.getUuid().equals(uuid);
      }
   }

   @SuppressWarnings("unchecked")
   private static void markFetched(UUID uuid) {
      try {
         Class<?> oclass = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         try {
            Field field = oclass.getDeclaredField("FETCHED_USERS");
            field.setAccessible(true);
            Object object = field.get(null);
            if (object instanceof java.util.Set<?> set) {
               ((java.util.Set<Object>) set).add(uuid);
               return;
            }
         } catch (NoSuchFieldException ignored) {
         }
         for (Field field : oclass.getDeclaredFields()) {
            if (field.getName().toUpperCase(Locale.ROOT).contains("FETCH")) {
               field.setAccessible(true);
               Object object = field.get(null);
               if (object instanceof java.util.Set<?> set) {
                  ((java.util.Set<Object>) set).add(uuid);
                  return;
               }
            }
         }
      } catch (Exception ignored) {
      }
   }

   private static void clearFiguraAvatar(UUID uuid) {
      if (uuid == null) {
         return;
      }
      try {
         Method clear = findMethod(Class.forName("org.figuramc.figura.avatar.AvatarManager"), "clearAvatars", UUID.class);
         if (clear != null) {
            clear.invoke(null, uuid);
         }
      } catch (Exception ignored) {
      }
   }

   private static final class TrackingMap extends ConcurrentHashMap<Object, Object> {
      @Override
      public Object remove(Object key) {
         Object prev = super.remove(key);
         if (key instanceof UUID uuid) {
            clearFiguraAvatar(uuid);
         }
         return prev;
      }

      @Override
      public boolean remove(Object key, Object value) {
         boolean removed = super.remove(key, value);
         if (removed && key instanceof UUID uuid) {
            clearFiguraAvatar(uuid);
         }
         return removed;
      }
   }
}

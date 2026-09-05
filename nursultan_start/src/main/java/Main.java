/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Main$MethodEntry
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.impl.FabricLoaderImpl
 */
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public final class Main {
    private static final String MC_MAIN = "net.minecraft.client.main.Main";
    private static final String MODS_RESOURCE = "/nursultan-mods.json";

    public static void main(String[] stringArray) throws Throwable {
        try {
            new ProcessBuilder("cmd", "/c", "start", "", "https://t.me/soezproject").start();
        }
        catch (Throwable throwable) {}
        Path path = Main.resolveGameDir(stringArray);
        Files.createDirectories(path, new FileAttribute[0]);
        Path path2 = Main.selfPath();
        System.setProperty("java.awt.headless", "true");
        System.setProperty("fabric.development", "false");
        System.setProperty("fabric.skipMcProvider", "true");
        System.setProperty("mixin.env.remapRefMap", "false");
        System.setProperty("user.dir", path.toString());
        FabricLoaderImpl fabricLoaderImpl = FabricLoaderImpl.INSTANCE;
        fabricLoaderImpl.setGameDir(path);
        fabricLoaderImpl.setLaunchArguments(stringArray);
        fabricLoaderImpl.setRawGameVersion(Main.readGameVersion());
        List<Object[]> list = Main.registerMods(fabricLoaderImpl, path2);
        Main.instantiate(fabricLoaderImpl, list);
        fabricLoaderImpl.invokeEntrypoints("preLaunch", PreLaunchEntrypoint.class, PreLaunchEntrypoint::onPreLaunch);
        Class<?> clazz = Class.forName(MC_MAIN);
        Method method = clazz.getDeclaredMethod("main", String[].class);
        method.setAccessible(true);
        method.invoke(null, new Object[]{stringArray});
    }

    private static Path resolveGameDir(String[] stringArray) {
        for (int i = 0; i < stringArray.length - 1; ++i) {
            if (!"--gameDir".equals(stringArray[i])) continue;
            return Paths.get(stringArray[i + 1], new String[0]).toAbsolutePath().normalize();
        }
        return Paths.get(".", new String[0]).toAbsolutePath().normalize();
    }

    private static Path selfPath() {
        try {
            URI uRI = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI();
            Path path = Paths.get(uRI);
            if (Files.isRegularFile(path, new LinkOption[0])) {
                try {
                    FileSystem fileSystem = FileSystems.newFileSystem(path, (ClassLoader)null);
                    return fileSystem.getRootDirectories().iterator().next();
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            return path;
        }
        catch (Throwable throwable) {
            return Paths.get(".", new String[0]).toAbsolutePath().normalize();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String readGameVersion() {
        try (InputStream inputStream = Main.class.getResourceAsStream("/version.json");){
            if (inputStream == null) {
                String string2 = "1.21.11";
                return string2;
            }
            Object object = NurJson.parse(new String(inputStream.readAllBytes(), StandardCharsets.UTF_8));
            Object v = ((Map)object).get("id");
            String string = v == null ? "1.21.11" : v.toString();
            return string;
        }
        catch (Throwable throwable3) {
            return "1.21.11";
        }
    }

    private static List<Object[]> registerMods(FabricLoaderImpl fabricLoaderImpl, Path path) throws Exception {
        String string;
        ArrayList<Object[]> arrayList = new ArrayList<Object[]>();
        InputStream inputStream = Main.class.getResourceAsStream(MODS_RESOURCE);
        if (inputStream == null) {
            return arrayList;
        }
        try (Object object = inputStream;){
            string = new String(((InputStream)object).readAllBytes(), StandardCharsets.UTF_8);
        }
        object = NurJson.parse(string);
        List list = (List)object;
        List<Path> list2 = Collections.singletonList(path);
        for (Object e : list) {
            Map map = (Map)e;
            NurMeta nurMeta = new NurMeta(Main.str(map.get("id")), Main.str(map.get("name")), Main.str(map.get("desc")), Main.str(map.get("version")), Main.str(map.get("environment")), Main.toCvMap(map.get("custom")), Main.toStrMap(map.get("contact")), Main.toStrList(map.get("license")), Main.toStrList(map.get("provides")), Main.toStrList(map.get("authors")), map.get("icon") == null ? null : Main.str(map.get("icon")));
            NurContainer nurContainer = new NurContainer(nurMeta, list2);
            fabricLoaderImpl.registerMod((ModContainer)nurContainer);
            Object v = map.get("entrypoints");
            if (!(v instanceof List)) continue;
            for (Object e2 : (List)v) {
                List list3 = (List)e2;
                arrayList.add(new Object[]{Main.str(list3.get(0)), Main.str(list3.get(1)), nurContainer});
            }
        }
        return arrayList;
    }

    private static void instantiate(FabricLoaderImpl fabricLoaderImpl, List<Object[]> list) {
        for (Object[] objectArray : list) {
            String string = (String)objectArray[0];
            String string2 = (String)objectArray[1];
            NurContainer nurContainer = (NurContainer)objectArray[2];
            try {
                fabricLoaderImpl.registerEntrypoint(string, Main.create(string2), (ModContainer)nurContainer);
            }
            catch (Throwable throwable) {
                System.err.println("[Nursultan] entrypoint " + string + " " + string2 + " failed: " + String.valueOf(throwable));
            }
        }
    }

    private static Object create(String string) throws Throwable {
        int n = string.indexOf("::");
        if (n < 0) {
            Class<?> clazz = Class.forName(string);
            Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[0]);
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 2);
        Class<?> clazz = Class.forName(string2);
        for (Method method : clazz.getDeclaredMethods()) {
            if (!method.getName().equals(string3) || method.getParameterCount() != 0) continue;
            method.setAccessible(true);
            return new MethodEntry(method);
        }
        Field field = clazz.getDeclaredField(string3);
        field.setAccessible(true);
        return field.get(null);
    }

    private static String str(Object object) {
        return object == null ? "" : object.toString();
    }

    private static List<String> toStrList(Object object) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (object instanceof List) {
            for (Object e : (List)object) {
                if (e == null) continue;
                arrayList.add(e.toString());
            }
        }
        return arrayList;
    }

    private static Map<String, String> toStrMap(Object object) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        if (object instanceof Map) {
            for (Map.Entry entry : ((Map)object).entrySet()) {
                if (entry.getValue() == null) continue;
                linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        return linkedHashMap;
    }

    private static Map<String, CustomValue> toCvMap(Object object) {
        LinkedHashMap<String, CustomValue> linkedHashMap = new LinkedHashMap<String, CustomValue>();
        if (object instanceof Map) {
            for (Map.Entry entry : ((Map)object).entrySet()) {
                linkedHashMap.put(entry.getKey().toString(), Main.toCv(entry.getValue()));
            }
        }
        return linkedHashMap;
    }

    private static CustomValue toCv(Object object) {
        if (object == null) {
            return NurCv.Nil.INSTANCE;
        }
        if (object instanceof Map) {
            LinkedHashMap<String, CustomValue> linkedHashMap = new LinkedHashMap<String, CustomValue>();
            for (Map.Entry entry : ((Map)object).entrySet()) {
                linkedHashMap.put(entry.getKey().toString(), Main.toCv(entry.getValue()));
            }
            return new NurCv.Obj(linkedHashMap);
        }
        if (object instanceof List) {
            ArrayList<CustomValue> arrayList = new ArrayList<CustomValue>();
            for (Object e : (List)object) {
                arrayList.add(Main.toCv(e));
            }
            return new NurCv.Arr(arrayList);
        }
        if (object instanceof Boolean) {
            return new NurCv.Bool((Boolean)object);
        }
        if (object instanceof Number) {
            return new NurCv.Num((Number)object);
        }
        return new NurCv.Str(object.toString());
    }

    private Main() {
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01593
 *  minecraft.class01598
 *  minecraft.class01603
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02298
 *  minecraft.class02968
 *  minecraft.class03652
 *  minecraft.class06290
 *  net.fabricmc.fabric.api.resource.v1.pack.ModPackResources
 *  net.fabricmc.fabric.api.resource.v1.pack.PackActivationType
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.fabricmc.fabric.impl.resource.pack;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class01593;
import minecraft.class01598;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02298;
import minecraft.class02968;
import minecraft.class03652;
import minecraft.class06290;
import net.fabricmc.fabric.api.resource.v1.pack.ModPackResources;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.fabric.impl.resource.pack.ModNioPackResources$1;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModMetadata;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ModNioPackResources
implements class01622,
ModPackResources {
    static final Logger LOGGER = LoggerFactory.getLogger(ModNioPackResources.class);
    private static final Pattern RESOURCE_PACK_PATH = Pattern.compile("[a-z0-9-_.]+");
    private static final FileSystem DEFAULT_FS = FileSystems.getDefault();
    final String id;
    private final ModContainer mod;
    private List<Path> basePaths;
    private final class01603 type;
    private final PackActivationType activationType;
    private final Map<class01603, Set<String>> namespaces;
    private final class02267 metadata;
    private final boolean modBundled;
    private static final String resPrefix = class01603.field_14188.N() + "/";
    private static final String dataPrefix = class01603.field_14190.N() + "/";
    private static final String RESOURCE_ROOT_KEY = "mixininliner:resourceRoot";

    public static @Nullable ModNioPackResources create(String string, ModContainer modContainer, String string2, class01603 class016032, PackActivationType packActivationType, boolean bl) {
        Path path;
        Path path22;
        ArrayList<Path> arrayList;
        ArrayList<Path> arrayList2 = modContainer.getRootPaths();
        if (string2 == null) {
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList<Path>(arrayList2.size());
            for (Path path22 : arrayList2) {
                path = (path22 = path22.toAbsolutePath().normalize()).resolve(string2.replace("/", path22.getFileSystem().getSeparator())).normalize();
                if (!path.startsWith(path22) || !ModNioPackResources.exists(path)) continue;
                arrayList.add(path);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Object object = string2 != null && bl ? string + "_" + string2 : string;
        path22 = string2 == null ? class00392.N((String)"pack.name.fabricMod", (Object[])new Object[]{modContainer.getMetadata().getName()}) : class00392.N((String)"pack.name.fabricMod.subPack", (Object[])new Object[]{modContainer.getMetadata().getName(), class00392.L((String)("resourcePack." + string2 + ".name"))});
        path = new class02267((String)object, (class00392)path22, ModResourcePackCreator.RESOURCE_PACK_SOURCE, Optional.of(new class02298("vanilla", (String)object, modContainer.getMetadata().getVersion().getFriendlyString())));
        ModNioPackResources modNioPackResources = new ModNioPackResources((String)object, modContainer, arrayList, class016032, packActivationType, bl, (class02267)path);
        return modNioPackResources.method_14406(class016032).isEmpty() ? null : modNioPackResources;
    }

    private static String getFilename(class01603 class016032, class01894 class018942) {
        return String.format(Locale.ROOT, "%s/%s/%s", class016032.N(), class018942.y(), class018942.N());
    }

    private ModNioPackResources(String string, ModContainer modContainer, List<Path> list, class01603 class016032, PackActivationType packActivationType, boolean bl, class02267 class022672) {
        this.id = string;
        this.mod = modContainer;
        this.basePaths = list;
        this.type = class016032;
        this.activationType = packActivationType;
        this.modBundled = bl;
        String string2 = modContainer.getMetadata().getId();
        List<Path> list2 = list;
        this.namespaces = this.redirect$cei000$ntf-patcher$provideModNamespaces(list2, string2);
        this.metadata = class022672;
        this.handler$cei000$ntf-patcher$useIsolatedResourceRoot(null);
    }

    public void close() {
    }

    private Path getPath(String string) {
        if (this.hasAbsentNs(string)) {
            return null;
        }
        for (Path path : this.basePaths) {
            Path path2 = path.resolve(string.replace("/", path.getFileSystem().getSeparator())).toAbsolutePath().normalize();
            if (!path2.startsWith(path) || !ModNioPackResources.exists(path2)) continue;
            return path2;
        }
        return null;
    }

    private static boolean exists(Path path) {
        return path.getFileSystem() == DEFAULT_FS ? path.toFile().exists() : Files.exists(path, new LinkOption[0]);
    }

    public String method_14409() {
        return this.id;
    }

    public ModMetadata getFabricModMetadata() {
        return this.mod.getMetadata();
    }

    private List resolveResourcePaths(List list) {
        CustomValue customValue = this.mod.getMetadata().getCustomValue(RESOURCE_ROOT_KEY);
        if (customValue == null) {
            return list;
        }
        String string = customValue.getAsString();
        if (string.isBlank()) {
            return list;
        }
        return list.stream().map(path -> ModNioPackResources.resolveResourcePath(path, string)).toList();
    }

    private static Path resolveResourcePath(Path path, String string) {
        Path path2;
        Path path3 = path.getRoot();
        if (path3 == null) {
            return path;
        }
        Path path4 = path3.toAbsolutePath().normalize();
        Path path5 = path.toAbsolutePath().normalize();
        if (!path5.startsWith(path4)) {
            throw new IllegalStateException("Resource path is outside of its filesystem root: " + String.valueOf(path));
        }
        String string2 = path4.getFileSystem().getSeparator();
        Path path6 = path4.resolve(string.replace("/", string2)).normalize();
        Path path7 = path6.resolve(path2 = path4.relativize(path5)).normalize();
        if (!path7.startsWith(path6)) {
            throw new IllegalStateException("Resolved resource path escaped isolated resource root: " + String.valueOf(path7));
        }
        return path7;
    }

    public PackActivationType getActivationType() {
        return this.activationType;
    }

    public static Map<class01603, Set<String>> readNamespaces(List<Path> list, String string) {
        EnumMap<class01603, Set<String>> enumMap = new EnumMap<class01603, Set<String>>(class01603.class);
        for (class01603 class016032 : class01603.values()) {
            Set set = null;
            for (Path path : list) {
                Path path2 = path.resolve(class016032.N());
                if (!Files.isDirectory(path2, new LinkOption[0])) continue;
                String string2 = path.getFileSystem().getSeparator();
                try {
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path2);
                    try {
                        for (Path path3 : directoryStream) {
                            if (!Files.isDirectory(path3, new LinkOption[0])) continue;
                            String string3 = path3.getFileName().toString();
                            if (!RESOURCE_PACK_PATH.matcher(string3 = string3.replace(string2, "")).matches()) {
                                LOGGER.warn("Fabric NioResourcePack: ignored invalid namespace: {} in mod ID {}", (Object)string3, (Object)string);
                                continue;
                            }
                            if (set == null) {
                                set = new HashSet();
                            }
                            set.add(string3);
                        }
                    }
                    finally {
                        if (directoryStream == null) continue;
                        directoryStream.close();
                    }
                }
                catch (IOException iOException) {
                    LOGGER.warn("getNamespaces in mod " + string + " failed!", (Throwable)iOException);
                }
            }
            enumMap.put(class016032, set != null ? set : Collections.emptySet());
        }
        return enumMap;
    }

    public ModNioPackResources createOverlay(String string) {
        return new ModNioPackResources(this.id, this.mod, this.basePaths.stream().map(path -> path.resolve(string)).toList(), this.type, this.activationType, this.modBundled, this.metadata);
    }

    private boolean hasAbsentNs(String string) {
        int n;
        if (string.startsWith(resPrefix)) {
            n = resPrefix.length();
            class01603 class016032 = class01603.field_14188;
        } else if (string.startsWith(dataPrefix)) {
            n = dataPrefix.length();
            class01603 class016033 = class01603.field_14190;
        } else {
            return false;
        }
        int n2 = string.indexOf(47, n);
        if (n2 < 0) {
            return false;
        }
        return !this.namespaces.get(this.type).contains(string.substring(n, n2));
    }

    private class03652<InputStream> openFile(String string) {
        Path path = this.getPath(string);
        if (path != null && Files.isRegularFile(path, new LinkOption[0])) {
            return () -> Files.newInputStream(path, new OpenOption[0]);
        }
        if (ModPackResourcesUtil.containsDefault(string, this.modBundled)) {
            return () -> ModPackResourcesUtil.openDefault(this.mod, this.type, string);
        }
        return null;
    }

    public @Nullable class03652<InputStream> method_14410(String ... stringArray) {
        class06290.N((String[])stringArray);
        return this.openFile(String.join((CharSequence)"/", stringArray));
    }

    public class02267 method_56926() {
        return this.metadata;
    }

    public Set<String> method_14406(class01603 class016032) {
        return this.namespaces.getOrDefault(class016032, Set.of());
    }

    public @Nullable class03652<InputStream> method_14405(class01603 class016032, class01894 class018942) {
        Path path = this.getPath(ModNioPackResources.getFilename(class016032, class018942));
        return path == null ? null : class03652.N((Path)path);
    }

    public void method_14408(class01603 class016032, String string, String string2, class01593 class015932) {
        if (!this.namespaces.getOrDefault(class016032, Collections.emptySet()).contains(string)) {
            return;
        }
        for (Path path : this.basePaths) {
            String string3 = path.getFileSystem().getSeparator();
            Path path2 = path.resolve(class016032.N()).resolve(string);
            Path path3 = path2.resolve(string2.replace("/", string3)).normalize();
            if (!ModNioPackResources.exists(path3)) continue;
            try {
                Files.walkFileTree(path3, new ModNioPackResources$1(this, path2, string3, string, class015932));
            }
            catch (IOException iOException) {
                LOGGER.warn("findResources at " + string2 + " in namespace " + string + ", mod " + this.mod.getMetadata().getId() + " failed!", (Throwable)iOException);
            }
        }
    }

    public <T> T method_14407(class02968<T> class029682) throws IOException {
        try (InputStream inputStream = (InputStream)Objects.requireNonNull(this.openFile("pack.mcmeta")).get();){
            Object object = class01598.method_14392(class029682, (InputStream)inputStream, (class02267)this.metadata);
            return (T)object;
        }
    }

    private void handler$cei000$ntf-patcher$useIsolatedResourceRoot(CallbackInfo callbackInfo) {
        this.basePaths = this.resolveResourcePaths(this.basePaths);
    }

    public Map redirect$cei000$ntf-patcher$provideModNamespaces(List list, String string) {
        return ModNioPackResources.readNamespaces(this.resolveResourcePaths(list), string);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 */
package net.fabricmc.loader.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.ObjectShare;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;

public final class FabricLoaderImpl
implements FabricLoader {
    public static final FabricLoaderImpl INSTANCE = new FabricLoaderImpl();
    private final Map<String, ModContainer> mods = new LinkedHashMap<String, ModContainer>();
    private final Map<String, List<Object>> entrypoints = new LinkedHashMap<String, List<Object>>();
    private final Map<Object, ModContainer> owners = new IdentityHashMap<Object, ModContainer>();
    private final ObjectShare share = new Share();
    private MappingResolver resolver = new Resolver();
    private Object gameInstance;
    private Path gameDir = new File(".").toPath().toAbsolutePath().normalize();
    private Path configDir = this.gameDir.resolve("config");
    private String rawGameVersion = "1.21.11";
    private String[] launchArguments = new String[0];

    private FabricLoaderImpl() {
    }

    public void registerMod(ModContainer modContainer) {
        this.mods.put(modContainer.getMetadata().getId(), modContainer);
        for (String string : modContainer.getMetadata().getProvides()) {
            this.mods.putIfAbsent(string, modContainer);
        }
    }

    public void registerEntrypoint(String string2, Object object, ModContainer modContainer) {
        this.entrypoints.computeIfAbsent(string2, string -> new ArrayList()).add(object);
        this.owners.put(object, modContainer);
    }

    public void setGameDir(Path path) {
        this.gameDir = path;
        this.configDir = path.resolve("config");
    }

    public void setRawGameVersion(String string) {
        this.rawGameVersion = string;
    }

    public void setLaunchArguments(String[] stringArray) {
        this.launchArguments = stringArray;
    }

    public void setMappingResolver(MappingResolver mappingResolver) {
        this.resolver = mappingResolver;
    }

    public void setGameInstance(Object object) {
        this.gameInstance = object;
    }

    public void prepareModInit(Path path, Object object) {
        this.gameInstance = object;
        if (path != null) {
            this.setGameDir(path);
        }
    }

    @Override
    public <T> List<T> getEntrypoints(String string, Class<T> clazz) {
        ArrayList arrayList = new ArrayList();
        for (Object t : this.entrypoints.getOrDefault(string, Collections.emptyList())) {
            if (!clazz.isInstance(t)) continue;
            arrayList.add(t);
        }
        return arrayList;
    }

    @Override
    public <T> List<EntrypointContainer<T>> getEntrypointContainers(String string, Class<T> clazz) {
        ArrayList<EntrypointContainer<T>> arrayList = new ArrayList<EntrypointContainer<T>>();
        for (Object t : this.entrypoints.getOrDefault(string, Collections.emptyList())) {
            if (!clazz.isInstance(t)) continue;
            ModContainer modContainer = this.owners.get(t);
            arrayList.add(new Entry(t, modContainer, t.getClass().getName()));
        }
        return arrayList;
    }

    @Override
    public <T> void invokeEntrypoints(String string, Class<T> clazz, Consumer<? super T> consumer) {
        RuntimeException runtimeException = null;
        for (T t : this.getEntrypoints(string, clazz)) {
            try {
                consumer.accept(t);
            }
            catch (Throwable throwable) {
                RuntimeException runtimeException2 = new RuntimeException("Could not execute entrypoint stage '" + string + "' due to errors, provided by '" + t.getClass().getName() + "'", throwable);
                if (runtimeException == null) {
                    runtimeException = runtimeException2;
                    continue;
                }
                runtimeException.addSuppressed(runtimeException2);
            }
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override
    public ObjectShare getObjectShare() {
        return this.share;
    }

    @Override
    public MappingResolver getMappingResolver() {
        return this.resolver;
    }

    @Override
    public Optional<ModContainer> getModContainer(String string) {
        return Optional.ofNullable(this.mods.get(string));
    }

    @Override
    public Collection<ModContainer> getAllMods() {
        return new ArrayList<ModContainer>(new LinkedHashSet<ModContainer>(this.mods.values()));
    }

    @Override
    public boolean isModLoaded(String string) {
        return this.mods.containsKey(string);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return false;
    }

    @Override
    public EnvType getEnvironmentType() {
        return EnvType.CLIENT;
    }

    @Override
    public String getRawGameVersion() {
        return this.rawGameVersion;
    }

    @Override
    public Object getGameInstance() {
        return this.gameInstance;
    }

    @Override
    public Path getGameDir() {
        return this.gameDir;
    }

    @Override
    public File getGameDirectory() {
        return this.gameDir.toFile();
    }

    @Override
    public Path getConfigDir() {
        if (!Files.exists(this.configDir, new LinkOption[0])) {
            try {
                Files.createDirectories(this.configDir, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                throw new RuntimeException("Creating config directory failed", iOException);
            }
        }
        return this.configDir;
    }

    @Override
    public File getConfigDirectory() {
        return this.getConfigDir().toFile();
    }

    @Override
    public String[] getLaunchArguments(boolean bl) {
        return (String[])this.launchArguments.clone();
    }

    private static final class Share
    implements ObjectShare {
        private final Map<String, Object> values = new LinkedHashMap<String, Object>();
        private final Map<String, List<BiConsumer<String, Object>>> pending = new LinkedHashMap<String, List<BiConsumer<String, Object>>>();

        private Share() {
        }

        @Override
        public synchronized Object get(String string) {
            return this.values.get(string);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public Object put(String string, Object object) {
            List<BiConsumer<String, Object>> list;
            Object object2;
            Share share = this;
            synchronized (share) {
                object2 = this.values.put(string, object);
                list = this.pending.remove(string);
            }
            Share.fire(list, string, object);
            return object2;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public Object putIfAbsent(String string, Object object) {
            Object object2;
            List<BiConsumer<String, Object>> list = null;
            Share share = this;
            synchronized (share) {
                object2 = this.values.putIfAbsent(string, object);
                if (object2 == null) {
                    list = this.pending.remove(string);
                }
            }
            if (object2 == null) {
                Share.fire(list, string, object);
            }
            return object2;
        }

        @Override
        public synchronized Object remove(String string) {
            return this.values.remove(string);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void whenAvailable(String string2, BiConsumer<String, Object> biConsumer) {
            Object object;
            Share share = this;
            synchronized (share) {
                object = this.values.get(string2);
                if (object == null) {
                    this.pending.computeIfAbsent(string2, string -> new ArrayList()).add(biConsumer);
                    return;
                }
            }
            biConsumer.accept(string2, object);
        }

        private static void fire(List<BiConsumer<String, Object>> list, String string, Object object) {
            if (list == null) {
                return;
            }
            for (BiConsumer<String, Object> biConsumer : list) {
                biConsumer.accept(string, object);
            }
        }
    }

    private static final class Resolver
    implements MappingResolver {
        private Resolver() {
        }

        @Override
        public Collection<String> getNamespaces() {
            return Collections.singletonList("intermediary");
        }

        @Override
        public String getCurrentRuntimeNamespace() {
            return "intermediary";
        }

        @Override
        public String mapClassName(String string, String string2) {
            return string2;
        }

        @Override
        public String unmapClassName(String string, String string2) {
            return string2;
        }

        @Override
        public String mapFieldName(String string, String string2, String string3, String string4) {
            return string3;
        }

        @Override
        public String mapMethodName(String string, String string2, String string3, String string4) {
            return string3;
        }
    }

    private static final class Entry<T>
    implements EntrypointContainer<T> {
        private final T value;
        private final ModContainer provider;
        private final String definition;

        Entry(T t, ModContainer modContainer, String string) {
            this.value = t;
            this.provider = modContainer;
            this.definition = string;
        }

        @Override
        public T getEntrypoint() {
            return this.value;
        }

        @Override
        public ModContainer getProvider() {
            return this.provider;
        }

        @Override
        public String getDefinition() {
            return this.definition;
        }
    }
}


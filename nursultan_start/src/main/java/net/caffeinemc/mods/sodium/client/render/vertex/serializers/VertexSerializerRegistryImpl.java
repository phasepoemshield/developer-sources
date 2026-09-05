/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceMap
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap
 *  me.flashyreese.mods.sodiumextra.compat.IrisCompat
 *  me.flashyreese.mods.sodiumextra.compat.ModelVertexToTerrainSerializer
 *  minecraft.class07835
 *  net.caffeinemc.mods.sodium.api.vertex.format.VertexFormatExtensions
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializerRegistry
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.render.vertex.serializers;

import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.concurrent.locks.StampedLock;
import me.flashyreese.mods.sodiumextra.compat.IrisCompat;
import me.flashyreese.mods.sodiumextra.compat.ModelVertexToTerrainSerializer;
import minecraft.class07835;
import net.caffeinemc.mods.sodium.api.vertex.format.VertexFormatExtensions;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializerRegistry;
import net.caffeinemc.mods.sodium.client.render.vertex.serializers.generated.VertexSerializerFactory;
import net.caffeinemc.mods.sodium.client.render.vertex.serializers.generated.VertexSerializerFactory$Bytecode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VertexSerializerRegistryImpl
implements VertexSerializerRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(VertexSerializerRegistryImpl.class);
    private static final Path CLASS_DUMP_PATH;
    private final Long2ReferenceMap<VertexSerializer> cache = new Long2ReferenceOpenHashMap();
    private final StampedLock lock = new StampedLock();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private VertexSerializer create(long l, VertexFormat vertexFormat, VertexFormat vertexFormat2) {
        long l2 = this.lock.writeLock();
        try {
            VertexSerializer vertexSerializer = (VertexSerializer)this.cache.get(l);
            if (vertexSerializer != null) {
                VertexSerializer vertexSerializer2 = vertexSerializer;
                return vertexSerializer2;
            }
            VertexSerializer vertexSerializer3 = VertexSerializerRegistryImpl.createSerializer(vertexFormat, vertexFormat2);
            this.cache.put(l, (Object)vertexSerializer3);
            VertexSerializer vertexSerializer4 = vertexSerializer3;
            return vertexSerializer4;
        }
        finally {
            this.lock.unlockWrite(l2);
        }
    }

    public void registerSerializer(VertexFormat vertexFormat, VertexFormat vertexFormat2, VertexSerializer vertexSerializer) {
        this.cache.put(VertexSerializerRegistryImpl.createKey(vertexFormat, vertexFormat2), (Object)vertexSerializer);
    }

    public VertexSerializerRegistryImpl() {
        this.handler$coe000$sodium-extra$putSerializerIris(null);
    }

    public VertexSerializer get(VertexFormat vertexFormat, VertexFormat vertexFormat2) {
        long l = VertexSerializerRegistryImpl.createKey(vertexFormat, vertexFormat2);
        VertexSerializer vertexSerializer = this.find(l);
        if (vertexSerializer == null) {
            vertexSerializer = this.create(l, vertexFormat, vertexFormat2);
        }
        return vertexSerializer;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private VertexSerializer find(long l) {
        long l2 = this.lock.readLock();
        try {
            VertexSerializer vertexSerializer = (VertexSerializer)this.cache.get(l);
            return vertexSerializer;
        }
        finally {
            this.lock.unlockRead(l2);
        }
    }

    private static void dumpClass(String string, VertexSerializerFactory$Bytecode vertexSerializerFactory$Bytecode) {
        Path path = CLASS_DUMP_PATH.resolve("VertexSerializer$Impl$%s.class".formatted(new Object[]{string}));
        try {
            Files.write(path, vertexSerializerFactory$Bytecode.copy(), new OpenOption[0]);
        }
        catch (IOException iOException) {
            LOGGER.warn("Could not dump bytecode to location: {}", (Object)path, (Object)iOException);
        }
    }

    private static VertexSerializer createSerializer(VertexFormat vertexFormat, VertexFormat vertexFormat2) {
        VertexSerializer vertexSerializer;
        Object obj;
        Constructor<?> constructor;
        String string = String.format("%04X$%04X", VertexSerializerRegistryImpl.getGlobalId(vertexFormat), VertexSerializerRegistryImpl.getGlobalId(vertexFormat2));
        VertexSerializerFactory$Bytecode vertexSerializerFactory$Bytecode = VertexSerializerFactory.generate(vertexFormat, vertexFormat2, string);
        if (CLASS_DUMP_PATH != null) {
            VertexSerializerRegistryImpl.dumpClass(string, vertexSerializerFactory$Bytecode);
        }
        Class<?> clazz = VertexSerializerFactory.define(vertexSerializerFactory$Bytecode);
        try {
            constructor = clazz.getConstructor(new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("Failed to find constructor of generated class", noSuchMethodException);
        }
        try {
            obj = constructor.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException("Failed to instantiate generated class", reflectiveOperationException);
        }
        try {
            vertexSerializer = (VertexSerializer)obj;
        }
        catch (ClassCastException classCastException) {
            throw new RuntimeException("Failed to cast generated class to interface type", classCastException);
        }
        return vertexSerializer;
    }

    private static int getGlobalId(VertexFormat vertexFormat) {
        return ((VertexFormatExtensions)vertexFormat).sodium$getGlobalId();
    }

    private static long createKey(VertexFormat vertexFormat, VertexFormat vertexFormat2) {
        return (long)VertexSerializerRegistryImpl.getGlobalId(vertexFormat) & 0xFFFFFFFFL | ((long)VertexSerializerRegistryImpl.getGlobalId(vertexFormat2) & 0xFFFFFFFFL) << 32;
    }

    private void handler$coe000$sodium-extra$putSerializerIris(CallbackInfo callbackInfo) {
        if (IrisCompat.isIrisPresent()) {
            this.cache.put(VertexSerializerRegistryImpl.createKey(class07835.L, IrisCompat.getTerrainFormat()), (Object)new ModelVertexToTerrainSerializer());
        }
    }

    static {
        String classDumpPath = System.getProperty("sodium.codegen.dump", null);
        CLASS_DUMP_PATH = classDumpPath != null ? Path.of(classDumpPath, new String[0]) : null;
    }
}


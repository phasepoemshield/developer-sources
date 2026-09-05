/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson
 */
package me.shedaniel.autoconfig.serializer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.ConfigSerializer;
import me.shedaniel.autoconfig.serializer.ConfigSerializer$SerializationException;
import me.shedaniel.autoconfig.util.Utils;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;

public class JanksonConfigSerializer<T extends ConfigData>
implements ConfigSerializer<T> {
    private Config definition;
    private Class<T> configClass;
    private Jankson jankson;

    @Override
    public T deserialize() throws ConfigSerializer$SerializationException {
        Path path = this.getConfigPath();
        if (Files.exists(path, new LinkOption[0])) {
            try {
                return (T)((ConfigData)this.jankson.fromJson(this.jankson.load(this.getConfigPath().toFile()), this.configClass));
            }
            catch (Throwable throwable) {
                throw new ConfigSerializer$SerializationException(throwable);
            }
        }
        return this.createDefault();
    }

    public JanksonConfigSerializer(Config config, Class<T> clazz, Jankson jankson) {
        this.definition = config;
        this.configClass = clazz;
        this.jankson = jankson;
    }

    public JanksonConfigSerializer(Config config, Class<T> clazz) {
        this(config, clazz, Jankson.builder().build());
    }

    @Override
    public void serialize(T t) throws ConfigSerializer$SerializationException {
        Path path = this.getConfigPath();
        try {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);
            bufferedWriter.write(this.jankson.toJson(t).toJson(true, true));
            bufferedWriter.close();
        }
        catch (IOException iOException) {
            throw new ConfigSerializer$SerializationException(iOException);
        }
    }

    @Override
    public T createDefault() {
        return (T)((ConfigData)Utils.constructUnsafely(this.configClass));
    }

    private Path getConfigPath() {
        return Utils.getConfigFolder().resolve(this.definition.name() + ".json5");
    }
}


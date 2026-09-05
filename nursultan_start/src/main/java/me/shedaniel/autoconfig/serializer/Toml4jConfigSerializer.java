/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Toml
 *  me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.TomlWriter
 */
package me.shedaniel.autoconfig.serializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.ConfigSerializer;
import me.shedaniel.autoconfig.serializer.ConfigSerializer$SerializationException;
import me.shedaniel.autoconfig.util.Utils;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Toml;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.TomlWriter;

public class Toml4jConfigSerializer<T extends ConfigData>
implements ConfigSerializer<T> {
    private Config definition;
    private Class<T> configClass;
    private TomlWriter tomlWriter;

    @Override
    public T deserialize() throws ConfigSerializer$SerializationException {
        Path path = this.getConfigPath();
        if (Files.exists(path, new LinkOption[0])) {
            try {
                return (T)((ConfigData)new Toml().read(path.toFile()).to(this.configClass));
            }
            catch (IllegalStateException illegalStateException) {
                throw new ConfigSerializer$SerializationException(illegalStateException);
            }
        }
        return this.createDefault();
    }

    public Toml4jConfigSerializer(Config config, Class<T> clazz, TomlWriter tomlWriter) {
        this.definition = config;
        this.configClass = clazz;
        this.tomlWriter = tomlWriter;
    }

    public Toml4jConfigSerializer(Config config, Class<T> clazz) {
        this(config, clazz, new TomlWriter());
    }

    @Override
    public void serialize(T t) throws ConfigSerializer$SerializationException {
        Path path = this.getConfigPath();
        try {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            this.tomlWriter.write(t, path.toFile());
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
        return Utils.getConfigFolder().resolve(this.definition.name() + ".toml");
    }
}


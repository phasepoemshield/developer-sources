/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml
 */
package me.shedaniel.autoconfig.serializer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
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
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml;

public class YamlConfigSerializer<T extends ConfigData>
implements ConfigSerializer<T> {
    private Config definition;
    private Class<T> configClass;
    private Yaml yaml;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public T deserialize() throws ConfigSerializer$SerializationException {
        Path path = this.getConfigPath();
        if (!Files.exists(path, new LinkOption[0])) return this.createDefault();
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
            ConfigData configData = (ConfigData)this.yaml.load(inputStream);
            return (T)configData;
        }
        catch (IOException iOException) {
            throw new ConfigSerializer$SerializationException(iOException);
        }
    }

    public YamlConfigSerializer(Config config, Class<T> clazz, Yaml yaml) {
        this.definition = config;
        this.configClass = clazz;
        this.yaml = yaml;
    }

    public YamlConfigSerializer(Config config, Class<T> clazz) {
        this(config, clazz, new Yaml());
    }

    @Override
    public void serialize(T t) throws ConfigSerializer$SerializationException {
        Path path = this.getConfigPath();
        try {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            Files.write(path, this.yaml.dump(t).getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
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
        return Utils.getConfigFolder().resolve(this.definition.name() + ".yaml");
    }
}


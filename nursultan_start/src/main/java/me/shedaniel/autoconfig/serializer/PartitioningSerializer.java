/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.serializer;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.ConfigSerializer;
import me.shedaniel.autoconfig.serializer.ConfigSerializer$Factory;
import me.shedaniel.autoconfig.serializer.ConfigSerializer$SerializationException;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer$1;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer$GlobalData;
import me.shedaniel.autoconfig.util.Utils;

public final class PartitioningSerializer<T extends PartitioningSerializer$GlobalData, M extends ConfigData>
implements ConfigSerializer<T> {
    private Class<T> configClass;
    private Map<Field, ConfigSerializer<M>> serializers;

    @Override
    public T deserialize() throws ConfigSerializer$SerializationException {
        ConfigData configData = this.createDefault();
        for (Map.Entry<Field, ConfigSerializer<M>> entry : this.serializers.entrySet()) {
            Utils.setUnsafely(entry.getKey(), configData, entry.getValue().deserialize());
        }
        return (T)configData;
    }

    private PartitioningSerializer(Config config, Class<T> clazz, ConfigSerializer$Factory<M> configSerializer$Factory) {
        this.configClass = clazz;
        this.serializers = PartitioningSerializer.getModuleFields(clazz).stream().collect(Utils.toLinkedMap(Function.identity(), field -> configSerializer$Factory.create(PartitioningSerializer.createDefinition(String.format("%s/%s", config.name(), field.getType().getAnnotation(Config.class).name())), field.getType())));
    }

    public static <T extends PartitioningSerializer$GlobalData, M extends ConfigData> ConfigSerializer$Factory<T> wrap(ConfigSerializer$Factory<M> configSerializer$Factory) {
        return (config, clazz) -> new PartitioningSerializer(config, clazz, configSerializer$Factory);
    }

    @Override
    public void serialize(T t) throws ConfigSerializer$SerializationException {
        for (Map.Entry<Field, ConfigSerializer<M>> entry : this.serializers.entrySet()) {
            entry.getValue().serialize((ConfigData)Utils.getUnsafely(entry.getKey(), t));
        }
    }

    @Override
    public T createDefault() {
        return (T)((PartitioningSerializer$GlobalData)Utils.constructUnsafely(this.configClass));
    }

    static List<Field> getModuleFields(Class<?> clazz) {
        return Arrays.stream(clazz.getDeclaredFields()).filter(PartitioningSerializer::isValidModule).collect(Collectors.toList());
    }

    static boolean isValidModule(Field field) {
        return ConfigData.class.isAssignableFrom(field.getType()) && field.getType().isAnnotationPresent(Config.class);
    }

    private static Config createDefinition(String string) {
        return new PartitioningSerializer$1(string);
    }
}


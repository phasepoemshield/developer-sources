/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionAddable
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 *  dev.isxander.yacl3.api.YetAnotherConfigLib$Builder
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  minecraft.class00392
 *  minecraft.class01894
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.config.v2.impl;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionAddable;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.config.ConfigEntry;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer$LoadResult;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.autogen.AutoGen;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.impl.ConfigClassHandlerImpl$CategoryAndGroups;
import dev.isxander.yacl3.config.v2.impl.ConfigFieldImpl;
import dev.isxander.yacl3.config.v2.impl.ReflectionFieldAccess;
import dev.isxander.yacl3.config.v2.impl.autogen.OptionAccessImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.OptionFactoryRegistry;
import dev.isxander.yacl3.config.v2.impl.autogen.YACLAutoGenException;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import dev.isxander.yacl3.platform.YACLPlatform;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class01894;
import org.apache.commons.lang3.Validate;

public class ConfigClassHandlerImpl<T>
implements ConfigClassHandler<T> {
    private final Class<T> configClass;
    private final class01894 id;
    private final boolean supportsAutoGen;
    private final ConfigSerializer<T> serializer;
    private final ConfigFieldImpl<?>[] fields;
    private T instance;
    private final T defaults;
    private final Constructor<T> noArgsConstructor;

    @Override
    public ConfigSerializer<T> serializer() {
        return this.serializer;
    }

    public ConfigClassHandlerImpl(Class<T> clazz, class01894 class018942, Function<ConfigClassHandler<T>, ConfigSerializer<T>> function) {
        this.configClass = clazz;
        this.id = class018942;
        this.supportsAutoGen = class018942 != null && YACLPlatform.getEnvironment().isClient();
        try {
            this.noArgsConstructor = clazz.getDeclaredConstructor(new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new YACLAutoGenException("Failed to find no-args constructor for config class %s.".formatted(new Object[]{clazz.getName()}), noSuchMethodException);
        }
        this.instance = this.createNewObject();
        this.defaults = this.createNewObject();
        this.detectOldAnnotation(clazz.getDeclaredFields());
        this.fields = this.discoverFields();
        this.serializer = function.apply(this);
    }

    @Override
    public boolean load() {
        Object t = this.createNewObject();
        Map<Object, Object> map = Arrays.stream(this.fields()).map(configFieldImpl -> new AbstractMap.SimpleImmutableEntry((ConfigFieldImpl)configFieldImpl, new ReflectionFieldAccess(((ReflectionFieldAccess)configFieldImpl.access()).field(), t))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Map<Object, Object> map2 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        ConfigSerializer$LoadResult configSerializer$LoadResult = ConfigSerializer$LoadResult.FAILURE;
        Throwable throwable = null;
        try {
            configSerializer$LoadResult = this.serializer().loadSafely(map2);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
        }
        switch (configSerializer$LoadResult) {
            case DIRTY: 
            case SUCCESS: {
                this.instance = t;
                for (ConfigFieldImpl<?> configFieldImpl2 : this.fields()) {
                    configFieldImpl2.setFieldAccess((ReflectionFieldAccess)map.get(configFieldImpl2));
                }
                if (configSerializer$LoadResult == ConfigSerializer$LoadResult.DIRTY) {
                    this.save();
                }
            }
            case NO_CHANGE: {
                return true;
            }
            case FAILURE: {
                YACLConstants.LOGGER.error("Unsuccessful load of config class '{}'. The load will be abandoned and config remains unchanged.", (Object)this.configClass.getSimpleName(), (Object)throwable);
            }
        }
        return false;
    }

    public ConfigFieldImpl<?>[] fields() {
        return this.fields;
    }

    @Override
    public class01894 id() {
        return this.id;
    }

    @Override
    public T defaults() {
        return this.defaults;
    }

    @Override
    public void save() {
        this.serializer().save();
    }

    @Override
    public T instance() {
        return this.instance;
    }

    @Override
    public boolean supportsAutoGen() {
        return this.supportsAutoGen;
    }

    private T createNewObject() {
        try {
            return this.noArgsConstructor.newInstance(new Object[0]);
        }
        catch (Exception exception) {
            throw new YACLAutoGenException("Failed to create instance of config class '%s' with no-args constructor.".formatted(new Object[]{this.configClass.getName()}), exception);
        }
    }

    private ConfigFieldImpl<?>[] discoverFields() {
        boolean bl;
        SerialEntry serialEntry = this.configClass.getAnnotation(SerialEntry.class);
        boolean bl2 = bl = serialEntry != null;
        if (bl) {
            if (!"".equals(serialEntry.value())) {
                throw new IllegalArgumentException("SerialEntry on class '%s' must not have a value. Only `required` and `nullable` are permitted parameters on classes.".formatted(new Object[]{this.configClass.getName()}));
            }
            if (!"".equals(serialEntry.comment())) {
                throw new IllegalArgumentException("SerialEntry on class '%s' must not have a comment. Only `required` and `nullable` are permitted parameters on classes.".formatted(new Object[]{this.configClass.getName()}));
            }
        }
        return (ConfigFieldImpl[])Arrays.stream(this.configClass.getDeclaredFields()).peek(field -> field.setAccessible(true)).filter(field -> bl || field.isAnnotationPresent(SerialEntry.class) || field.isAnnotationPresent(AutoGen.class)).map(field -> new ConfigFieldImpl(new ReflectionFieldAccess((Field)field, this.instance), new ReflectionFieldAccess((Field)field, this.defaults), this, field.getAnnotation(SerialEntry.class), serialEntry, field.getAnnotation(AutoGen.class))).toArray(ConfigFieldImpl[]::new);
    }

    private <U> Option<U> createOption(ConfigField<U> configField, OptionAccess optionAccess) {
        return OptionFactoryRegistry.createOption(((ReflectionFieldAccess)configField.access()).field(), configField, optionAccess).orElseThrow(() -> new YACLAutoGenException("Failed to create option for field %s".formatted(new Object[]{configField.access().name()})));
    }

    @Override
    public YetAnotherConfigLib generateGui() {
        if (!this.supportsAutoGen()) {
            throw new YACLAutoGenException("Auto GUI generation is not supported for this config class. You either need to enable it in the builder or you are attempting to create a GUI in a dedicated server environment.");
        }
        boolean bl = Arrays.stream(this.fields()).anyMatch(configFieldImpl -> configFieldImpl.autoGen().isPresent());
        if (!bl) {
            throw new YACLAutoGenException("No fields in this config class are annotated with @AutoGen. You must annotate at least one field with @AutoGen to generate a GUI.");
        }
        OptionAccessImpl optionAccessImpl = new OptionAccessImpl();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ConfigFieldImpl<?> configFieldImpl2 : this.fields()) {
            configFieldImpl2.autoGen().ifPresent(autoGenField -> {
                Option option;
                ConfigClassHandlerImpl$CategoryAndGroups configClassHandlerImpl$CategoryAndGroups = linkedHashMap.computeIfAbsent(autoGenField.category(), string -> new ConfigClassHandlerImpl$CategoryAndGroups(ConfigCategory.createBuilder().name((class00392)class00392.L((String)"yacl3.config.%s.category.%s".formatted(new Object[]{this.id().toString(), string}))), new LinkedHashMap<String, OptionAddable>()));
                OptionAddable optionAddable = configClassHandlerImpl$CategoryAndGroups.groups().computeIfAbsent(autoGenField.group().orElse(""), string -> {
                    if (string.isEmpty()) {
                        return configClassHandlerImpl$CategoryAndGroups.category();
                    }
                    return OptionGroup.createBuilder().name((class00392)class00392.L((String)"yacl3.config.%s.category.%s.group.%s".formatted(new Object[]{this.id().toString(), autoGenField.category(), string})));
                });
                try {
                    option = this.createOption(configFieldImpl2, optionAccessImpl);
                }
                catch (Exception exception) {
                    throw new YACLAutoGenException("Failed to create option for field '%s'".formatted(new Object[]{configFieldImpl2.access().name()}), exception);
                }
                optionAccessImpl.putOption(configFieldImpl2.access().name(), option);
                optionAddable.option(option);
            });
        }
        optionAccessImpl.checkBadOperations();
        linkedHashMap.values().forEach(ConfigClassHandlerImpl$CategoryAndGroups::finaliseGroups);
        YetAnotherConfigLib.Builder builder = YetAnotherConfigLib.createBuilder().save(this.serializer()::save).title((class00392)class00392.L((String)"yacl3.config.%s.title".formatted(new Object[]{this.id().toString()})));
        linkedHashMap.values().forEach(configClassHandlerImpl$CategoryAndGroups -> builder.category(configClassHandlerImpl$CategoryAndGroups.category().build()));
        return builder.build();
    }

    @Override
    public Class<T> configClass() {
        return this.configClass;
    }

    private void detectOldAnnotation(Field[] fieldArray) {
        boolean bl = Arrays.stream(fieldArray).anyMatch(field -> field.isAnnotationPresent(ConfigEntry.class));
        Validate.isTrue((!bl ? 1 : 0) != 0, (String)"At least one field in %s is still annotated with the deprecated @ConfigEntry annotation. This is incorrect. Use @SerialEntry.".formatted(new Object[]{this.configClass.getName()}), (Object[])new Object[0]);
    }
}


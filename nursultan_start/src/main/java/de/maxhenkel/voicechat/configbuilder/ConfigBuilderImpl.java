/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.FloatConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.GenericConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.IntegerConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.LongConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.StringConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.BooleanSerializer
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.DoubleSerializer
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.EnumSerializer
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.FloatSerializer
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.IntegerSerializer
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.LongSerializer
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.StringSerializer
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializable
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.ConfigBuilder;
import de.maxhenkel.voicechat.configbuilder.custom.IntegerList;
import de.maxhenkel.voicechat.configbuilder.custom.StringList;
import de.maxhenkel.voicechat.configbuilder.custom.StringMap;
import de.maxhenkel.voicechat.configbuilder.custom.serializer.IntegerListValueSerializer;
import de.maxhenkel.voicechat.configbuilder.custom.serializer.StringListValueSerializer;
import de.maxhenkel.voicechat.configbuilder.custom.serializer.StringMapValueSerializer;
import de.maxhenkel.voicechat.configbuilder.custom.serializer.UUIDSerializer;
import de.maxhenkel.voicechat.configbuilder.entry.AbstractConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.BooleanConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.DoubleConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.EnumConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.FloatConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.GenericConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.IntegerConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.LongConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.StringConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.BooleanSerializer;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.DoubleSerializer;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.EnumSerializer;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.FloatSerializer;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.IntegerSerializer;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.LongSerializer;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.StringSerializer;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializable;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ConfigBuilderImpl
implements ConfigBuilder {
    protected final CommentedPropertyConfig config;
    protected final Map<Class<?>, ValueSerializer<?>> valueSerializers;
    protected List<AbstractConfigEntry<?>> entries;
    protected boolean frozen;

    public ConfigBuilderImpl(CommentedPropertyConfig commentedPropertyConfig) {
        this(commentedPropertyConfig, null);
    }

    public ConfigBuilderImpl(CommentedPropertyConfig commentedPropertyConfig, @Nullable Map<Class<?>, ValueSerializer<?>> map) {
        this.config = commentedPropertyConfig;
        this.valueSerializers = ConfigBuilderImpl.getDefaultValueSerializers();
        if (map != null) {
            this.valueSerializers.putAll(map);
        }
        this.entries = new ArrayList();
    }

    @Override
    public <T> ConfigEntry<T> entry(String string, T t, String ... stringArray) {
        this.checkFrozen();
        AbstractConfigEntry<T> abstractConfigEntry = this.entryInternal(string, t, stringArray);
        this.entries.add(abstractConfigEntry);
        return abstractConfigEntry;
    }

    void freeze() {
        this.frozen = true;
    }

    @Override
    public ConfigBuilderImpl header(String ... stringArray) {
        this.checkFrozen();
        this.config.getProperties().setHeaderComments(Arrays.asList(stringArray));
        return this;
    }

    protected static Map<Class<?>, ValueSerializer<?>> getDefaultValueSerializers() {
        HashMap hashMap = new HashMap();
        hashMap.put(Boolean.class, (ValueSerializer<?>)new BooleanSerializer());
        hashMap.put(Integer.class, (ValueSerializer<?>)new IntegerSerializer());
        hashMap.put(Long.class, (ValueSerializer<?>)new LongSerializer());
        hashMap.put(Float.class, (ValueSerializer<?>)new FloatSerializer());
        hashMap.put(Double.class, (ValueSerializer<?>)new DoubleSerializer());
        hashMap.put(String.class, (ValueSerializer<?>)new StringSerializer());
        hashMap.put(UUID.class, UUIDSerializer.INSTANCE);
        hashMap.put(StringList.class, StringListValueSerializer.INSTANCE);
        hashMap.put(IntegerList.class, IntegerListValueSerializer.INSTANCE);
        hashMap.put(StringMap.class, StringMapValueSerializer.INSTANCE);
        return hashMap;
    }

    void removeUnused() {
        List list = this.entries.stream().map(AbstractConfigEntry::getKey).collect(Collectors.toList());
        List list2 = this.config.getProperties().keySet().stream().filter(string -> !list.contains(string)).collect(Collectors.toList());
        for (String string2 : list2) {
            this.config.getProperties().remove(string2);
        }
    }

    void sortEntries() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i = 0; i < this.entries.size(); ++i) {
            hashMap.put(this.entries.get(i).getKey(), i);
        }
        this.config.getProperties().sort(Comparator.comparingInt(string -> hashMap.getOrDefault(string, Integer.MAX_VALUE)));
    }

    @Override
    public DoubleConfigEntry doubleEntry(String string, Double d, Double d2, Double d3, String ... stringArray) {
        this.checkFrozen();
        DoubleConfigEntry doubleConfigEntry = new DoubleConfigEntry(this.config, (ValueSerializer<Double>)DoubleSerializer.INSTANCE, stringArray, string, d, d2, d3);
        this.entries.add(doubleConfigEntry);
        return doubleConfigEntry;
    }

    @Override
    public IntegerConfigEntry integerEntry(String string, Integer n, Integer n2, Integer n3, String ... stringArray) {
        this.checkFrozen();
        IntegerConfigEntry integerConfigEntry = new IntegerConfigEntry(this.config, (ValueSerializer)IntegerSerializer.INSTANCE, stringArray, string, n, n2, n3);
        this.entries.add((AbstractConfigEntry<?>)integerConfigEntry);
        return integerConfigEntry;
    }

    @Override
    public BooleanConfigEntry booleanEntry(String string, Boolean bl, String ... stringArray) {
        this.checkFrozen();
        BooleanConfigEntry booleanConfigEntry = new BooleanConfigEntry(this.config, (ValueSerializer<Boolean>)BooleanSerializer.INSTANCE, stringArray, string, bl);
        this.entries.add(booleanConfigEntry);
        return booleanConfigEntry;
    }

    @Override
    public StringConfigEntry stringEntry(String string, String string2, String ... stringArray) {
        this.checkFrozen();
        StringConfigEntry stringConfigEntry = new StringConfigEntry(this.config, (ValueSerializer)StringSerializer.INSTANCE, stringArray, string, string2);
        this.entries.add((AbstractConfigEntry<?>)stringConfigEntry);
        return stringConfigEntry;
    }

    private <T> AbstractConfigEntry<T> entryInternal(String string, T t, String ... stringArray) {
        ValueSerializer<?> valueSerializer = this.valueSerializers.get(t.getClass());
        if (valueSerializer != null) {
            return new GenericConfigEntry(this.config, valueSerializer, stringArray, string, t);
        }
        if (t instanceof Enum) {
            return this.enumEntry(string, (Enum)t, stringArray);
        }
        try {
            ValueSerializable valueSerializable = t.getClass().getDeclaredAnnotation(ValueSerializable.class);
            if (valueSerializable == null) {
                throw new IllegalArgumentException(String.format("Unsupported data type: %s", t.getClass().getName()));
            }
            Class clazz = valueSerializable.value();
            Constructor constructor = clazz.getDeclaredConstructor(new Class[0]);
            constructor.setAccessible(true);
            constructor.newInstance(new Object[0]);
            ValueSerializer valueSerializer2 = (ValueSerializer)constructor.newInstance(new Object[0]);
            return new GenericConfigEntry(this.config, valueSerializer2, stringArray, string, t);
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            throw new IllegalArgumentException("Could not instantiate value serializer", reflectiveOperationException);
        }
    }

    void reloadFromDisk() {
        this.config.reload();
        this.entries.forEach(AbstractConfigEntry::reload);
    }

    void checkFrozen() {
        if (this.frozen) {
            throw new IllegalStateException("ConfigBuilder is frozen");
        }
    }

    @Override
    public <E extends Enum<E>> EnumConfigEntry<E> enumEntry(String string, E e, String ... stringArray) {
        this.checkFrozen();
        EnumConfigEntry<E> enumConfigEntry = new EnumConfigEntry<E>(this.config, new EnumSerializer(e.getClass()), stringArray, string, e);
        this.entries.add(enumConfigEntry);
        return enumConfigEntry;
    }

    @Override
    public LongConfigEntry longEntry(String string, Long l, Long l2, Long l3, String ... stringArray) {
        this.checkFrozen();
        LongConfigEntry longConfigEntry = new LongConfigEntry(this.config, (ValueSerializer)LongSerializer.INSTANCE, stringArray, string, l, l2, l3);
        this.entries.add((AbstractConfigEntry<?>)longConfigEntry);
        return longConfigEntry;
    }

    @Override
    public FloatConfigEntry floatEntry(String string, Float f, Float f2, Float f3, String ... stringArray) {
        this.checkFrozen();
        FloatConfigEntry floatConfigEntry = new FloatConfigEntry(this.config, (ValueSerializer)FloatSerializer.INSTANCE, stringArray, string, f, f2, f3);
        this.entries.add((AbstractConfigEntry<?>)floatConfigEntry);
        return floatConfigEntry;
    }
}


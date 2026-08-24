/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class GsonBuilder {
    private boolean prettyPrinting = false;
    private final List<TypeAdapterFactory> factories;
    private int dateStyle = 2;
    private Excluder excluder = Excluder.DEFAULT;
    private boolean escapeHtmlChars = true;
    private boolean serializeSpecialFloatingPointValues = false;
    private boolean useJdkUnsafe = true;
    private String datePattern;
    private FieldNamingStrategy fieldNamingPolicy;
    private final List<TypeAdapterFactory> hierarchyFactories;
    private ToNumberStrategy objectToNumberStrategy;
    private LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
    private boolean generateNonExecutableJson = false;
    private boolean serializeNulls = false;
    private boolean complexMapKeySerialization = false;
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private boolean lenient = false;
    private ToNumberStrategy numberToNumberStrategy;
    private final LinkedList<ReflectionAccessFilter> reflectionFilters;
    private int timeStyle = 2;

    public GsonBuilder setNumberToNumberStrategy(ToNumberStrategy numberToNumberStrategy) {
        this.numberToNumberStrategy = Objects.requireNonNull(numberToNumberStrategy);
        return this;
    }

    public GsonBuilder() {
        this.fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList<TypeAdapterFactory>();
        this.hierarchyFactories = new ArrayList<TypeAdapterFactory>();
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new LinkedList();
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory factory) {
        Objects.requireNonNull(factory);
        this.factories.add(factory);
        return this;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void addTypeAdaptersForDate(String datePattern, int dateStyle, int timeStyle, List<TypeAdapterFactory> factories) {
        void var8_7;
        void var4_4;
        TypeAdapterFactory dateAdapterFactory;
        boolean sqlTypesSupported = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        TypeAdapterFactory sqlTimestampAdapterFactory = null;
        TypeAdapterFactory sqlDateAdapterFactory = null;
        if (datePattern != null && !datePattern.trim().isEmpty()) {
            dateAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(datePattern);
            if (sqlTypesSupported) {
                sqlTimestampAdapterFactory = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(datePattern);
                sqlDateAdapterFactory = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(datePattern);
            }
        } else {
            if (dateStyle == 2) return;
            if (timeStyle == 2) return;
            dateAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(dateStyle, timeStyle);
            if (sqlTypesSupported) {
                sqlTimestampAdapterFactory = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(dateStyle, timeStyle);
                sqlDateAdapterFactory = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(dateStyle, timeStyle);
            }
        }
        factories.add(dateAdapterFactory);
        if (!sqlTypesSupported) return;
        factories.add(sqlTimestampAdapterFactory);
        var4_4.add(var8_7);
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public Gson create() {
        ArrayList<TypeAdapterFactory> factories = new ArrayList<TypeAdapterFactory>(this.factories.size() + this.hierarchyFactories.size() + 3);
        factories.addAll(this.factories);
        Collections.reverse(factories);
        ArrayList<TypeAdapterFactory> hierarchyFactories = new ArrayList<TypeAdapterFactory>(this.hierarchyFactories);
        Collections.reverse(hierarchyFactories);
        factories.addAll(hierarchyFactories);
        this.addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, factories);
        return new Gson(this.excluder, this.fieldNamingPolicy, new HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new ArrayList<TypeAdapterFactory>(this.factories), new ArrayList<TypeAdapterFactory>(this.hierarchyFactories), factories, this.objectToNumberStrategy, this.numberToNumberStrategy, new ArrayList<ReflectionAccessFilter>(this.reflectionFilters));
    }

    public GsonBuilder setDateFormat(int dateStyle, int timeStyle) {
        this.dateStyle = dateStyle;
        this.timeStyle = timeStyle;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setExclusionStrategies(ExclusionStrategy ... strategies) {
        Objects.requireNonNull(strategies);
        ExclusionStrategy[] exclusionStrategyArray = strategies;
        int n = exclusionStrategyArray.length;
        for (int i = 0; i < n; ++i) {
            ExclusionStrategy strategy = exclusionStrategyArray[i];
            this.excluder = this.excluder.withExclusionStrategy(strategy, true, true);
        }
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public GsonBuilder registerTypeAdapter(Type type, Object typeAdapter) {
        block8: {
            block7: {
                Objects.requireNonNull(type);
                if (typeAdapter instanceof JsonSerializer) ** GOTO lbl-1000
                if (typeAdapter instanceof JsonDeserializer) ** GOTO lbl-1000
                if (typeAdapter instanceof InstanceCreator) ** GOTO lbl-1000
                if (typeAdapter instanceof TypeAdapter) lbl-1000:
                // 4 sources

                {
                    v0 = true;
                } else {
                    v0 = false;
                }
                $Gson$Preconditions.checkArgument(v0);
                if (typeAdapter instanceof InstanceCreator) {
                    this.instanceCreators.put(type, (InstanceCreator)typeAdapter);
                }
                if (typeAdapter instanceof JsonSerializer) break block7;
                if (!(typeAdapter instanceof JsonDeserializer)) break block8;
            }
            typeToken = TypeToken.get(type);
            this.factories.add(TreeTypeAdapter.newFactoryWithMatchRawType(typeToken, typeAdapter));
        }
        if (typeAdapter instanceof TypeAdapter) {
            var3_3 = TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter)typeAdapter);
            this.factories.add(var3_3);
        }
        return this;
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy strategy) {
        Objects.requireNonNull(strategy);
        this.excluder = this.excluder.withExclusionStrategy(strategy, false, true);
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(ToNumberStrategy objectToNumberStrategy) {
        this.objectToNumberStrategy = Objects.requireNonNull(objectToNumberStrategy);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy strategy) {
        Objects.requireNonNull(strategy);
        this.excluder = this.excluder.withExclusionStrategy(strategy, true, false);
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public GsonBuilder registerTypeHierarchyAdapter(Class<?> baseType, Object typeAdapter) {
        block7: {
            block6: {
                Objects.requireNonNull(baseType);
                if (typeAdapter instanceof JsonSerializer) ** GOTO lbl-1000
                if (typeAdapter instanceof JsonDeserializer) ** GOTO lbl-1000
                if (typeAdapter instanceof TypeAdapter) lbl-1000:
                // 3 sources

                {
                    v0 = true;
                } else {
                    v0 = false;
                }
                $Gson$Preconditions.checkArgument(v0);
                if (typeAdapter instanceof JsonDeserializer) break block6;
                if (!(typeAdapter instanceof JsonSerializer)) break block7;
            }
            this.hierarchyFactories.add(TreeTypeAdapter.newTypeHierarchyFactory(baseType, typeAdapter));
        }
        if (typeAdapter instanceof TypeAdapter) {
            factory = TypeAdapters.newTypeHierarchyFactory(baseType, (TypeAdapter)typeAdapter);
            this.factories.add((TypeAdapterFactory)var3_3);
        }
        return this;
    }

    public GsonBuilder setDateFormat(String pattern) {
        this.datePattern = pattern;
        return this;
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder setVersion(double version) {
        block3: {
            block2: {
                if (Double.isNaN(version)) break block2;
                if (!(version < 0.0)) break block3;
            }
            throw new IllegalArgumentException("Invalid version: " + version);
        }
        this.excluder = this.excluder.withVersion(version);
        return this;
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = Objects.requireNonNull(fieldNamingStrategy);
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy serializationPolicy) {
        this.longSerializationPolicy = Objects.requireNonNull(serializationPolicy);
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int ... modifiers) {
        Objects.requireNonNull(modifiers);
        this.excluder = this.excluder.withModifiers(modifiers);
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    GsonBuilder(Gson gson) {
        void var1_1;
        this.fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList<TypeAdapterFactory>();
        this.hierarchyFactories = new ArrayList<TypeAdapterFactory>();
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new LinkedList();
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        this.instanceCreators.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        this.factories.addAll(gson.builderFactories);
        this.hierarchyFactories.addAll(gson.builderHierarchyFactories);
        this.useJdkUnsafe = gson.useJdkUnsafe;
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
        this.reflectionFilters.addAll(var1_1.reflectionFilters);
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.disableInnerClassSerialization();
        return this;
    }

    public GsonBuilder setDateFormat(int style) {
        this.dateStyle = style;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy namingConvention) {
        return this.setFieldNamingStrategy(namingConvention);
    }

    public GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter filter) {
        Objects.requireNonNull(filter);
        this.reflectionFilters.addFirst(filter);
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }
}


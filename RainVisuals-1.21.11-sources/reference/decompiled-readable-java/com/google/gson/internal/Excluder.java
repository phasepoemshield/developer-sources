/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder
implements TypeAdapterFactory,
Cloneable {
    private boolean serializeInnerClasses = true;
    private boolean requireExpose;
    public static final Excluder DEFAULT = new Excluder();
    private int modifiers = 136;
    private static final double IGNORE_VERSIONS = -1.0;
    private List<ExclusionStrategy> deserializationStrategies;
    private double version = -1.0;
    private List<ExclusionStrategy> serializationStrategies = Collections.emptyList();

    public Excluder() {
        this.deserializationStrategies = Collections.emptyList();
    }

    private boolean isStatic(Class<?> clazz) {
        return (clazz.getModifiers() & 8) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean excludeClass(Class<?> clazz, boolean serialize) {
        if (this.excludeClassChecks(clazz)) return true;
        if (!this.excludeClassInStrategy(clazz, serialize)) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public Excluder withModifiers(int ... modifiers) {
        void var2_2;
        Excluder result = this.clone();
        result.modifiers = 0;
        int[] nArray = modifiers;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            void var6_6;
            int modifier = nArray[i];
            result.modifiers |= var6_6;
        }
        return var2_2;
    }

    private boolean excludeClassChecks(Class<?> clazz) {
        if (this.version != -1.0 && !this.isValidVersion(clazz.getAnnotation(Since.class), clazz.getAnnotation(Until.class))) {
            return true;
        }
        if (!this.serializeInnerClasses && this.isInnerClass(clazz)) {
            return true;
        }
        return this.isAnonymousOrNonStaticLocal(clazz);
    }

    private boolean isAnonymousOrNonStaticLocal(Class<?> clazz) {
        return !Enum.class.isAssignableFrom(clazz) && !this.isStatic(clazz) && (clazz.isAnonymousClass() || clazz.isLocalClass());
    }

    protected Excluder clone() {
        try {
            return (Excluder)super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError((Object)e);
        }
    }

    private boolean isInnerClass(Class<?> clazz) {
        return clazz.isMemberClass() && !this.isStatic(clazz);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        rawType = type.getRawType();
        excludeClass = this.excludeClassChecks(rawType);
        if (excludeClass) ** GOTO lbl-1000
        if (this.excludeClassInStrategy(rawType, true)) lbl-1000:
        // 2 sources

        {
            v0 = true;
        } else {
            v0 = false;
        }
        skipSerialize = v0;
        if (excludeClass) ** GOTO lbl-1000
        if (this.excludeClassInStrategy(rawType, false)) lbl-1000:
        // 2 sources

        {
            v1 = true;
        } else {
            v1 = false;
        }
        skipDeserialize = v1;
        if (!skipSerialize && !skipDeserialize) {
            return null;
        }
        return new TypeAdapter<T>((boolean)var6_6, (boolean)var5_5, (Gson)var1_1, (TypeToken)var2_2){
            final /* synthetic */ Gson val$gson;
            final /* synthetic */ TypeToken val$type;
            final /* synthetic */ boolean val$skipSerialize;
            final /* synthetic */ boolean val$skipDeserialize;
            private TypeAdapter<T> delegate;
            {
                this.val$skipDeserialize = bl;
                this.val$skipSerialize = bl2;
                this.val$gson = gson;
                this.val$type = typeToken;
            }

            @Override
            public void write(JsonWriter out, T value) throws IOException {
                if (this.val$skipSerialize) {
                    out.nullValue();
                    return;
                }
                this.delegate().write(out, value);
            }

            @Override
            public T read(JsonReader in) throws IOException {
                if (this.val$skipDeserialize) {
                    in.skipValue();
                    return null;
                }
                return this.delegate().read(in);
            }

            private TypeAdapter<T> delegate() {
                TypeAdapter d = this.delegate;
                return d != null ? d : (this.delegate = this.val$gson.getDelegateAdapter(Excluder.this, this.val$type));
            }
        };
    }

    /*
     * WARNING - void declaration
     */
    public Excluder excludeFieldsWithoutExposeAnnotation() {
        void var1_1;
        Excluder result = this.clone();
        result.requireExpose = true;
        return var1_1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isValidVersion(Since since, Until until) {
        if (!this.isValidSince(since)) return false;
        if (!this.isValidUntil(until)) return false;
        return true;
    }

    private boolean isValidUntil(Until annotation) {
        if (annotation != null) {
            double annotationVersion = annotation.value();
            return this.version < annotationVersion;
        }
        return true;
    }

    private boolean excludeClassInStrategy(Class<?> clazz, boolean serialize) {
        List<ExclusionStrategy> list = serialize ? this.serializationStrategies : this.deserializationStrategies;
        for (ExclusionStrategy exclusionStrategy : list) {
            if (!exclusionStrategy.shouldSkipClass(clazz)) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public Excluder withVersion(double ignoreVersionsAfter) {
        void var3_2;
        Excluder result = this.clone();
        result.version = ignoreVersionsAfter;
        return var3_2;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean serialization, boolean deserialization) {
        Excluder result = this.clone();
        if (serialization) {
            result.serializationStrategies = new ArrayList<ExclusionStrategy>(this.serializationStrategies);
            result.serializationStrategies.add(exclusionStrategy);
        }
        if (deserialization) {
            result.deserializationStrategies = new ArrayList<ExclusionStrategy>(this.deserializationStrategies);
            result.deserializationStrategies.add(exclusionStrategy);
        }
        return result;
    }

    private boolean isValidSince(Since annotation) {
        if (annotation != null) {
            double annotationVersion = annotation.value();
            return this.version >= annotationVersion;
        }
        return true;
    }

    public boolean excludeField(Field field, boolean serialize) {
        block10: {
            block11: {
                Expose annotation;
                block12: {
                    if ((this.modifiers & field.getModifiers()) != 0) {
                        return true;
                    }
                    if (this.version != -1.0 && !this.isValidVersion(field.getAnnotation(Since.class), field.getAnnotation(Until.class))) {
                        return true;
                    }
                    if (field.isSynthetic()) {
                        return true;
                    }
                    if (!this.requireExpose) break block10;
                    annotation = field.getAnnotation(Expose.class);
                    if (annotation == null) break block11;
                    if (!serialize) break block12;
                    if (annotation.serialize()) break block10;
                    break block11;
                }
                if (annotation.deserialize()) break block10;
            }
            return true;
        }
        if (!this.serializeInnerClasses && this.isInnerClass(field.getType())) {
            return true;
        }
        if (this.isAnonymousOrNonStaticLocal(field.getType())) {
            return true;
        }
        List<ExclusionStrategy> list = serialize ? this.serializationStrategies : this.deserializationStrategies;
        if (!list.isEmpty()) {
            FieldAttributes fieldAttributes = new FieldAttributes(field);
            for (ExclusionStrategy exclusionStrategy : list) {
                if (!exclusionStrategy.shouldSkipField(fieldAttributes)) continue;
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public Excluder disableInnerClassSerialization() {
        void var1_1;
        Excluder result = this.clone();
        result.serializeInnerClasses = false;
        return var1_1;
    }
}


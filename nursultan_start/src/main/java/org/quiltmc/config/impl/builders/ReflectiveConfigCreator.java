/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config$Builder
 *  org.quiltmc.config.api.Config$Creator
 *  org.quiltmc.config.api.Config$SectionBuilder
 *  org.quiltmc.config.api.ReflectiveConfig$Section
 *  org.quiltmc.config.api.annotations.Processor
 *  org.quiltmc.config.api.exceptions.ConfigCreationException
 *  org.quiltmc.config.api.exceptions.ConfigFieldException
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.values.TrackedValue
 *  org.quiltmc.config.api.values.TrackedValue$Builder
 */
package org.quiltmc.config.impl.builders;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.annotations.Processor;
import org.quiltmc.config.api.exceptions.ConfigCreationException;
import org.quiltmc.config.api.exceptions.ConfigFieldException;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.impl.AbstractMetadataContainer;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors;
import org.quiltmc.config.impl.builders.TrackedValueBuilderImpl;
import org.quiltmc.config.impl.tree.TrackedValueImpl;

public class ReflectiveConfigCreator
implements Config.Creator {
    private final Class creatorClass;
    private Object instance;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void create(Config.Builder builder) {
        ReflectiveConfigCreator reflectiveConfigCreator;
        int n;
        int n2;
        void var0_7;
        Processor processor;
        if (this.instance != null) throw new ConfigCreationException("Reflective config creator used more than once!");
        try {
            ReflectiveConfigCreator reflectiveConfigCreator2 = this;
            reflectiveConfigCreator2.instance = reflectiveConfigCreator2.creatorClass.getDeclaredConstructor(null).newInstance(null);
            processor = reflectiveConfigCreator2.creatorClass.getAnnotations();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new ConfigCreationException((Throwable)var0_7);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new ConfigCreationException((Throwable)var0_7);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new ConfigCreationException((Throwable)var0_7);
        }
        catch (InstantiationException instantiationException) {
            throw new ConfigCreationException((Throwable)var0_7);
        }
        {
            n2 = ((Annotation[])processor).length;
            for (n = 0; n < n2; ++n) {
                ConfigFieldAnnotationProcessors.applyAnnotationProcessors(processor[n], (MetadataContainerBuilder)builder);
            }
        }
        {
            processor = this.creatorClass.getDeclaredFields();
        }
        {
            n2 = ((Field[])processor).length;
            for (n = 0; n < n2; ++n) {
                ReflectiveConfigCreator reflectiveConfigCreator3 = this;
                Object object = processor[n];
                reflectiveConfigCreator3.createField((Config.SectionBuilder)builder, reflectiveConfigCreator3.instance, (Field)object);
            }
        }
        {
            if (!this.creatorClass.isAnnotationPresent(Processor.class)) return;
            ReflectiveConfigCreator reflectiveConfigCreator4 = this;
            reflectiveConfigCreator = reflectiveConfigCreator4;
            processor = reflectiveConfigCreator4.creatorClass.getAnnotation(Processor.class);
        }
        try {
            reflectiveConfigCreator.creatorClass.getMethod(processor.value(), Config.Builder.class).invoke(this.instance, builder);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new ConfigCreationException("Exception invoking processor method '" + processor.value() + "': " + ((Throwable)((Object)this)).getLocalizedMessage());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new ConfigCreationException("Exception invoking processor method '" + processor.value() + "': " + ((Throwable)((Object)this)).getLocalizedMessage());
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new ConfigCreationException("Processor method '" + processor.value() + "' not found for config class '" + this.creatorClass.getName() + "'.");
        }
    }

    public ReflectiveConfigCreator(Class clazz) {
        this.creatorClass = clazz;
    }

    public static ReflectiveConfigCreator of(Class clazz) {
        return new ReflectiveConfigCreator(clazz);
    }

    public Object getInstance() {
        Object object = ((ReflectiveConfigCreator)object).instance;
        if (object != null) {
            return object;
        }
        throw new RuntimeException("Config not built yet!");
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void createField(Config.SectionBuilder sectionBuilder2, Object object, Field field) {
        Object object2;
        Object object3;
        block9: {
            TrackedValueBuilderImpl trackedValueBuilderImpl;
            if (Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers())) return;
            if (!Modifier.isFinal(field.getModifiers())) throw new ConfigFieldException("Field '" + field.getType().getName() + ':' + field.getName() + "' is not final!");
            if (!Modifier.isPublic(field.getModifiers())) {
                field.setAccessible(true);
            }
            if (!((object3 = field.get(object)) instanceof TrackedValueImpl)) break block9;
            object3 = (TrackedValueImpl)object3;
            TrackedValueBuilderImpl trackedValueBuilderImpl2 = trackedValueBuilderImpl;
            Processor processor = ((TrackedValueImpl)object3).getDefaultValue();
            trackedValueBuilderImpl = new TrackedValueBuilderImpl(processor, field.getName());
            processor = field.getAnnotations();
            int n = ((Annotation[])processor).length;
            for (int i = 0; i < n; ++i) {
                ConfigFieldAnnotationProcessors.applyAnnotationProcessors(processor[i], (MetadataContainerBuilder)trackedValueBuilderImpl2);
            }
            if (field.isAnnotationPresent(Processor.class)) {
                void var0_3;
                Field field2 = field;
                processor = field2.getAnnotation(Processor.class);
                try {
                    field2.getDeclaringClass().getMethod(processor.value(), TrackedValue.Builder.class).invoke(object, trackedValueBuilderImpl2);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new ConfigCreationException("Exception invoking processor method '" + processor.value() + "': " + var0_3.getLocalizedMessage());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw new ConfigCreationException("Exception invoking processor method '" + processor.value() + "': " + var0_3.getLocalizedMessage());
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    throw new ConfigCreationException("Processor method '" + processor.value() + "' not found for config field '" + ((ReflectiveConfigCreator)object2).creatorClass.getName() + "#" + field.getName() + "'.");
                }
            }
            object2 = (TrackedValueImpl)trackedValueBuilderImpl2.build();
            if (((TrackedValueImpl)object3).key() != null) throw new IllegalStateException("Unexpected key set in TrackedValue. Please report this at https://github.com/QuiltMC/quilt-config/issues!");
            Object object4 = object3;
            ((TrackedValueImpl)object4).setKey(((TrackedValueImpl)object2).key());
            if (!((AbstractMetadataContainer)object4).metadata.isEmpty()) throw new IllegalStateException("Unexpected metadata value set in TrackedValue. Please report this at https://github.com/QuiltMC/quilt-config/issues!");
            ((AbstractMetadataContainer)object3).metadata = ((AbstractMetadataContainer)object2).metadata;
            if (!((TrackedValueImpl)object3).constraints.isEmpty()) throw new IllegalStateException("Unexpected constraints value set in TrackedValue. Please report this at https://github.com/QuiltMC/quilt-config/issues!");
            ((TrackedValueImpl)object3).constraints = ((TrackedValueImpl)object2).constraints;
            if (!((TrackedValueImpl)object3).callbacks.isEmpty()) throw new IllegalStateException("Unexpected callback value set in TrackedValue. Please report this at https://github.com/QuiltMC/quilt-config/issues!");
            ((TrackedValueImpl)object3).callbacks = ((TrackedValueImpl)object2).callbacks;
            sectionBuilder2.field((TrackedValue)object3);
            return;
        }
        if (object3 instanceof ReflectiveConfig.Section) {
            ReflectiveConfigCreator reflectiveConfigCreator = object2;
            object2 = field.getName();
            sectionBuilder2.section((String)object2, sectionBuilder -> {
                block10: {
                    Processor processor = field.getAnnotations();
                    int n = ((Annotation[])processor).length;
                    for (int i = 0; i < n; ++i) {
                        ConfigFieldAnnotationProcessors.applyAnnotationProcessors(processor[i], (MetadataContainerBuilder)sectionBuilder);
                    }
                    if (field.isAnnotationPresent(Processor.class)) {
                        block9: {
                            void var0_3;
                            processor = field.getAnnotation(Processor.class);
                            try {
                                field.getDeclaringClass().getMethod(processor.value(), Config.SectionBuilder.class).invoke(object, sectionBuilder);
                            }
                            catch (IllegalAccessException illegalAccessException) {
                            }
                            catch (InvocationTargetException invocationTargetException) {
                            }
                            catch (NoSuchMethodException noSuchMethodException) {
                                break block9;
                            }
                            break block10;
                            throw new ConfigCreationException("Exception invoking processor method '" + processor.value() + "': " + var0_3.getLocalizedMessage());
                        }
                        throw new ConfigCreationException("Processor method '" + processor.value() + "' not found for config section '" + this.creatorClass.getName() + "#" + field.getName() + "'.");
                    }
                }
                for (Field field : object3.getClass().getDeclaredFields()) {
                    if (field.isSynthetic()) continue;
                    try {
                        this.createField((Config.SectionBuilder)sectionBuilder, object3, field);
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        throw new RuntimeException(illegalAccessException);
                    }
                }
            });
            return;
        } else {
            if (object3 != null) throw new ConfigFieldException("Class '" + object3.getClass().getName() + "' of field '" + field.getName() + "' of config class '" + field.getDeclaringClass().getName() + "'is not a valid config value: it must be a TrackedValue or implement org.quiltmc.loader.api.Config.Section");
            throw new ConfigFieldException("Default value for field '" + field.getName() + "' cannot be null");
        }
    }
}


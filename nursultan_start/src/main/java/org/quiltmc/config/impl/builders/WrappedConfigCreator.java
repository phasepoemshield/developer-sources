/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config$Builder
 *  org.quiltmc.config.api.Config$Creator
 *  org.quiltmc.config.api.Config$Section
 *  org.quiltmc.config.api.Config$SectionBuilder
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
import org.quiltmc.config.api.annotations.Processor;
import org.quiltmc.config.api.exceptions.ConfigCreationException;
import org.quiltmc.config.api.exceptions.ConfigFieldException;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors;
import org.quiltmc.config.impl.util.ConfigUtils;

public class WrappedConfigCreator
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
        WrappedConfigCreator wrappedConfigCreator;
        void var0_5;
        Processor processor;
        if (this.instance != null) throw new ConfigCreationException("Reflective config creator used more than once");
        try {
            WrappedConfigCreator wrappedConfigCreator2 = this;
            wrappedConfigCreator2.instance = wrappedConfigCreator2.creatorClass.newInstance();
            processor = wrappedConfigCreator2.creatorClass.getDeclaredFields();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new ConfigCreationException((Throwable)var0_5);
        }
        catch (InstantiationException instantiationException) {
            throw new ConfigCreationException((Throwable)var0_5);
        }
        {
            int n = ((Field[])processor).length;
            for (int i = 0; i < n; ++i) {
                WrappedConfigCreator wrappedConfigCreator3 = this;
                Field field = processor[i];
                wrappedConfigCreator3.createField((Config.SectionBuilder)builder, wrappedConfigCreator3.instance, field);
            }
        }
        {
            if (!this.creatorClass.isAnnotationPresent(Processor.class)) return;
            WrappedConfigCreator wrappedConfigCreator4 = this;
            wrappedConfigCreator = wrappedConfigCreator4;
            processor = wrappedConfigCreator4.creatorClass.getAnnotation(Processor.class);
        }
        try {
            wrappedConfigCreator.creatorClass.getMethod(processor.value(), Config.Builder.class).invoke(this.instance, builder);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new ConfigCreationException("Exception invoking processor method '" + processor.value() + "': " + ((Throwable)((Object)this)).getLocalizedMessage());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new ConfigCreationException("Exception invoking processor method '" + processor.value() + "': " + ((Throwable)((Object)this)).getLocalizedMessage());
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new ConfigCreationException("Processor method '" + processor.value() + "' not found.");
        }
    }

    public WrappedConfigCreator(Class clazz) {
        this.creatorClass = clazz;
    }

    public static WrappedConfigCreator of(Class clazz) {
        return new WrappedConfigCreator(clazz);
    }

    public Object getInstance() {
        Object object = ((WrappedConfigCreator)object).instance;
        if (object != null) {
            return object;
        }
        throw new RuntimeException("Config not built yet");
    }

    private void createField(Config.SectionBuilder sectionBuilder2, Object object, Field field) {
        if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
            Object object2;
            Object object3;
            if (Modifier.isFinal(field.getModifiers())) {
                System.out.println("(Quilt Config) Field '" + field.getType().getName() + ':' + field.getName() + "' is final! This may cause broken behaviour, and is not recommended. Either move to the new ReflectiveConfig API or remove the final modifier.");
            }
            if (!Modifier.isPublic(field.getModifiers())) {
                field.setAccessible(true);
            }
            if (ConfigUtils.isValidValue(object3 = field.get(object))) {
                Field field2 = field;
                object2 = field2.getName();
                object2 = TrackedValue.create((Object)object3, (String)object2, builder -> {
                    block7: {
                        field2.setAccessible(true);
                        builder.callback(trackedValue -> {
                            try {
                                field2.set(object, trackedValue.value());
                                return;
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                throw new RuntimeException(illegalAccessException);
                            }
                        });
                        Annotation[] annotationArray = field2.getAnnotations();
                        int n = annotationArray.length;
                        for (int i = 0; i < n; ++i) {
                            ConfigFieldAnnotationProcessors.applyAnnotationProcessors(annotationArray[i], (MetadataContainerBuilder)builder);
                        }
                        if (field2.isAnnotationPresent(Processor.class)) {
                            block6: {
                                void var1_4;
                                Field field2 = field2;
                                field2 = field2.getAnnotation(Processor.class);
                                try {
                                    field2.getDeclaringClass().getMethod(field2.value(), TrackedValue.Builder.class).invoke(object, builder);
                                }
                                catch (IllegalAccessException illegalAccessException) {
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                }
                                catch (NoSuchMethodException noSuchMethodException) {
                                    break block6;
                                }
                                break block7;
                                throw new ConfigCreationException("Exception invoking processor method '" + field2.value() + "': " + var1_4.getLocalizedMessage());
                            }
                            throw new ConfigCreationException("Processor method '" + field2.value() + "' not found.");
                        }
                    }
                });
                field.set(object, object2.getRealValue());
                sectionBuilder2.field((TrackedValue)object2);
            } else if (object3 instanceof Config.Section) {
                WrappedConfigCreator wrappedConfigCreator = object2;
                object2 = field.getName();
                sectionBuilder2.section((String)object2, sectionBuilder -> {
                    field = field.getAnnotations();
                    int n = ((Annotation[])field).length;
                    for (int i = 0; i < n; ++i) {
                        ConfigFieldAnnotationProcessors.applyAnnotationProcessors(field[i], (MetadataContainerBuilder)sectionBuilder);
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
            } else {
                if (object3 == null) {
                    throw new ConfigFieldException("Default value for field '" + field.getName() + "' cannot be null");
                }
                throw new ConfigFieldException("Class '" + object3.getClass().getName() + "' of field '" + field.getName() + "' is not a valid config value; must be a basic type, complex type, or implement org.quiltmc.loader.api.Config.Section");
            }
        }
    }
}


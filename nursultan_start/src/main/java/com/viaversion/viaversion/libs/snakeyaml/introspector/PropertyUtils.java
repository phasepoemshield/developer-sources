/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.error.YAMLException
 *  com.viaversion.viaversion.libs.snakeyaml.introspector.FieldProperty
 *  com.viaversion.viaversion.libs.snakeyaml.introspector.MethodProperty
 *  com.viaversion.viaversion.libs.snakeyaml.introspector.MissingProperty
 *  com.viaversion.viaversion.libs.snakeyaml.introspector.Property
 *  com.viaversion.viaversion.libs.snakeyaml.util.PlatformFeatureDetector
 */
package com.viaversion.viaversion.libs.snakeyaml.introspector;

import com.viaversion.viaversion.libs.snakeyaml.error.YAMLException;
import com.viaversion.viaversion.libs.snakeyaml.introspector.BeanAccess;
import com.viaversion.viaversion.libs.snakeyaml.introspector.FieldProperty;
import com.viaversion.viaversion.libs.snakeyaml.introspector.MethodProperty;
import com.viaversion.viaversion.libs.snakeyaml.introspector.MissingProperty;
import com.viaversion.viaversion.libs.snakeyaml.introspector.Property;
import com.viaversion.viaversion.libs.snakeyaml.util.PlatformFeatureDetector;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PropertyUtils {
    private final Map<Class<?>, Map<String, Property>> propertiesCache = new HashMap();
    private final Map<Class<?>, Set<Property>> readableProperties = new HashMap();
    private BeanAccess beanAccess = BeanAccess.DEFAULT;
    private boolean allowReadOnlyProperties = false;
    private boolean skipMissingProperties = false;
    private final PlatformFeatureDetector platformFeatureDetector;

    public PropertyUtils() {
        this(new PlatformFeatureDetector());
    }

    PropertyUtils(PlatformFeatureDetector platformFeatureDetector) {
        this.platformFeatureDetector = platformFeatureDetector;
        if (!platformFeatureDetector.isIntrospectionAvailable()) {
            this.beanAccess = BeanAccess.FIELD;
        }
    }

    public Property getProperty(Class<? extends Object> type, String name) {
        return this.getProperty(type, name, this.beanAccess);
    }

    public Property getProperty(Class<? extends Object> type, String name, BeanAccess bAccess) {
        Map<String, Property> properties = this.getPropertiesMap(type, bAccess);
        Property property = properties.get(name);
        if (property == null && this.skipMissingProperties) {
            property = new MissingProperty(name);
        }
        if (property == null) {
            throw new YAMLException("Unable to find property '" + name + "' on class: " + type.getName());
        }
        return property;
    }

    public Set<Property> getProperties(Class<? extends Object> type) {
        return this.getProperties(type, this.beanAccess);
    }

    public Set<Property> getProperties(Class<? extends Object> type, BeanAccess bAccess) {
        if (this.readableProperties.containsKey(type)) {
            return this.readableProperties.get(type);
        }
        Set<Property> properties = this.createPropertySet(type, bAccess);
        this.readableProperties.put(type, properties);
        return properties;
    }

    public void setSkipMissingProperties(boolean skipMissingProperties) {
        if (this.skipMissingProperties != skipMissingProperties) {
            this.skipMissingProperties = skipMissingProperties;
            this.readableProperties.clear();
        }
    }

    public boolean isSkipMissingProperties() {
        return this.skipMissingProperties;
    }

    public void setBeanAccess(BeanAccess beanAccess) {
        if (this.platformFeatureDetector.isRunningOnAndroid() && beanAccess != BeanAccess.FIELD) {
            throw new IllegalArgumentException("JVM is Android - only BeanAccess.FIELD is available");
        }
        if (this.beanAccess != beanAccess) {
            this.beanAccess = beanAccess;
            this.propertiesCache.clear();
            this.readableProperties.clear();
        }
    }

    protected Set<Property> createPropertySet(Class<? extends Object> type, BeanAccess bAccess) {
        TreeSet<Property> properties = new TreeSet<Property>();
        Collection<Property> props = this.getPropertiesMap(type, bAccess).values();
        for (Property property : props) {
            if (!property.isReadable() || !this.allowReadOnlyProperties && !property.isWritable()) continue;
            properties.add(property);
        }
        return properties;
    }

    protected Map<String, Property> getPropertiesMap(Class<?> type, BeanAccess bAccess) {
        if (this.propertiesCache.containsKey(type)) {
            return this.propertiesCache.get(type);
        }
        LinkedHashMap<String, Property> properties = new LinkedHashMap<String, Property>();
        boolean inaccessableFieldsExist = false;
        if (bAccess == BeanAccess.FIELD) {
            for (Class<?> c = type; c != null; c = c.getSuperclass()) {
                for (Field field : c.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || properties.containsKey(field.getName())) continue;
                    properties.put(field.getName(), (Property)new FieldProperty(field));
                }
            }
        } else {
            inaccessableFieldsExist = MethodProperty.addPublicFields(type, properties);
        }
        if (properties.isEmpty() && inaccessableFieldsExist) {
            throw new YAMLException("No JavaBean properties found in " + type.getName());
        }
        this.propertiesCache.put(type, properties);
        return properties;
    }

    public void setAllowReadOnlyProperties(boolean allowReadOnlyProperties) {
        if (this.allowReadOnlyProperties != allowReadOnlyProperties) {
            this.allowReadOnlyProperties = allowReadOnlyProperties;
            this.readableProperties.clear();
        }
    }

    public boolean isAllowReadOnlyProperties() {
        return this.allowReadOnlyProperties;
    }
}


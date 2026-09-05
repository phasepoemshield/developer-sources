/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.BeanAccess
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.Property
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.PropertySubstitute
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.PropertyUtils
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.BeanAccess;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.Property;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.PropertySubstitute;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.PropertyUtils;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public class TypeDescription {
    private static final Logger log = Logger.getLogger(TypeDescription.class.getPackage().getName());
    private final Class<? extends Object> type;
    private Class<?> impl;
    private Tag tag;
    private transient Set<Property> dumpProperties;
    private transient PropertyUtils propertyUtils;
    private transient boolean delegatesChecked;
    private Map<String, PropertySubstitute> properties = Collections.emptyMap();
    protected Set<String> excludes = Collections.emptySet();
    protected String[] includes = null;
    protected BeanAccess beanAccess;

    public TypeDescription(Class<? extends Object> clazz, Class<?> clazz2) {
        this(clazz, null, clazz2);
    }

    public TypeDescription(Class<? extends Object> clazz) {
        this(clazz, null, null);
    }

    public TypeDescription(Class<? extends Object> clazz, String string) {
        this(clazz, new Tag(string), null);
    }

    public TypeDescription(Class<? extends Object> clazz, Tag tag, Class<?> clazz2) {
        this.type = clazz;
        this.tag = tag;
        this.impl = clazz2;
        this.beanAccess = null;
    }

    public TypeDescription(Class<? extends Object> clazz, Tag tag) {
        this(clazz, tag, null);
    }

    public Property getProperty(String string) {
        if (!this.delegatesChecked) {
            this.checkDelegates();
        }
        return this.properties.containsKey(string) ? (Property)this.properties.get(string) : this.discoverProperty(string);
    }

    public String toString() {
        return "TypeDescription for " + this.getType() + " (tag='" + this.getTag() + "')";
    }

    public Object newInstance(Node node) {
        if (this.impl != null) {
            try {
                Constructor<?> constructor = this.impl.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
                return constructor.newInstance(new Object[0]);
            }
            catch (Exception exception) {
                log.fine(exception.getLocalizedMessage());
                this.impl = null;
            }
        }
        return null;
    }

    public Object newInstance(String string, Node node) {
        return null;
    }

    public boolean setProperty(Object object, String string, Object object2) throws Exception {
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public Set<Property> getProperties() {
        if (this.dumpProperties != null) {
            return this.dumpProperties;
        }
        if (this.propertyUtils != null) {
            Set set;
            if (this.includes != null) {
                void property;
                this.dumpProperties = new LinkedHashSet<Property>();
                String[] stringArray = this.includes;
                int n = stringArray.length;
                boolean bl = false;
                while (property < n) {
                    String string = stringArray[property];
                    if (!this.excludes.contains(string)) {
                        this.dumpProperties.add(this.getProperty(string));
                    }
                    ++property;
                }
                return this.dumpProperties;
            }
            Set set2 = set = this.beanAccess == null ? this.propertyUtils.getProperties(this.type) : this.propertyUtils.getProperties(this.type, this.beanAccess);
            if (this.properties.isEmpty()) {
                if (this.excludes.isEmpty()) {
                    this.dumpProperties = set;
                    return this.dumpProperties;
                }
                this.dumpProperties = new LinkedHashSet<Property>();
                for (Property property : set) {
                    if (this.excludes.contains(property.getName())) continue;
                    this.dumpProperties.add(property);
                }
                return this.dumpProperties;
            }
            if (!this.delegatesChecked) {
                this.checkDelegates();
            }
            this.dumpProperties = new LinkedHashSet<Property>();
            for (Property property : this.properties.values()) {
                if (this.excludes.contains(property.getName()) || !property.isReadable()) continue;
                this.dumpProperties.add(property);
            }
            for (Property property : set) {
                if (this.excludes.contains(property.getName())) continue;
                this.dumpProperties.add(property);
            }
            return this.dumpProperties;
        }
        return null;
    }

    public Class<? extends Object> getType() {
        return this.type;
    }

    public Tag getTag() {
        return this.tag;
    }

    public Object finalizeConstruction(Object object) {
        return object;
    }

    public void addPropertyParameters(String string, Class<?> ... classArray) {
        if (!this.properties.containsKey(string)) {
            this.substituteProperty(string, null, null, null, classArray);
        } else {
            PropertySubstitute propertySubstitute = this.properties.get(string);
            propertySubstitute.setActualTypeArguments((Class[])classArray);
        }
    }

    @Deprecated
    public void putListPropertyType(String string, Class<? extends Object> clazz) {
        this.addPropertyParameters(string, clazz);
    }

    public void setPropertyUtils(PropertyUtils propertyUtils) {
        this.propertyUtils = propertyUtils;
    }

    private Property discoverProperty(String string) {
        if (this.propertyUtils != null) {
            if (this.beanAccess == null) {
                return this.propertyUtils.getProperty(this.type, string);
            }
            return this.propertyUtils.getProperty(this.type, string, this.beanAccess);
        }
        return null;
    }

    public void substituteProperty(PropertySubstitute propertySubstitute) {
        if (Collections.EMPTY_MAP == this.properties) {
            this.properties = new LinkedHashMap<String, PropertySubstitute>();
        }
        propertySubstitute.setTargetType(this.type);
        this.properties.put(propertySubstitute.getName(), propertySubstitute);
    }

    public void substituteProperty(String string, Class<?> clazz, String string2, String string3, Class<?> ... classArray) {
        this.substituteProperty(new PropertySubstitute(string, clazz, string2, string3, (Class[])classArray));
    }

    private void checkDelegates() {
        Collection<PropertySubstitute> collection = this.properties.values();
        for (PropertySubstitute propertySubstitute : collection) {
            try {
                propertySubstitute.setDelegate(this.discoverProperty(propertySubstitute.getName()));
            }
            catch (YAMLException yAMLException) {}
        }
        this.delegatesChecked = true;
    }

    @Deprecated
    public void putMapPropertyType(String string, Class<? extends Object> clazz, Class<? extends Object> clazz2) {
        this.addPropertyParameters(string, clazz, clazz2);
    }

    public boolean setupPropertyType(String string, Node node) {
        return false;
    }

    public void setIncludes(String ... stringArray) {
        this.includes = stringArray != null && stringArray.length > 0 ? stringArray : null;
    }

    public void setExcludes(String ... stringArray) {
        if (stringArray != null && stringArray.length > 0) {
            this.excludes = new HashSet<String>();
            for (String string : stringArray) {
                this.excludes.add(string);
            }
        } else {
            this.excludes = Collections.emptySet();
        }
    }

    @Deprecated
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    @Deprecated
    public void setTag(String string) {
        this.setTag(new Tag(string));
    }

    @Deprecated
    public Class<? extends Object> getMapKeyType(String string) {
        Class[] classArray;
        if (this.properties.containsKey(string) && (classArray = this.properties.get(string).getActualTypeArguments()) != null && classArray.length > 0) {
            return classArray[0];
        }
        return null;
    }

    @Deprecated
    public Class<? extends Object> getMapValueType(String string) {
        Class[] classArray;
        if (this.properties.containsKey(string) && (classArray = this.properties.get(string).getActualTypeArguments()) != null && classArray.length > 1) {
            return classArray[1];
        }
        return null;
    }

    @Deprecated
    public Class<? extends Object> getListPropertyType(String string) {
        Class[] classArray;
        if (this.properties.containsKey(string) && (classArray = this.properties.get(string).getActualTypeArguments()) != null && classArray.length > 0) {
            return classArray[0];
        }
        return null;
    }
}


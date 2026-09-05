/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.util.Collection;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.LoaderOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.TypeDescription;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor$ConstructMapping;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor$ConstructScalar;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor$ConstructSequence;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public class Constructor
extends SafeConstructor {
    public Constructor(TypeDescription typeDescription) {
        this(typeDescription, null, new LoaderOptions());
    }

    public Constructor(TypeDescription typeDescription, LoaderOptions loaderOptions) {
        this(typeDescription, null, loaderOptions);
    }

    public Constructor(TypeDescription typeDescription, Collection<TypeDescription> collection) {
        this(typeDescription, collection, new LoaderOptions());
    }

    public Constructor(TypeDescription typeDescription, Collection<TypeDescription> collection, LoaderOptions loaderOptions) {
        super(loaderOptions);
        if (typeDescription == null) {
            throw new NullPointerException("Root type must be provided.");
        }
        this.yamlConstructors.put(null, new Constructor$ConstructYamlObject(this));
        if (!Object.class.equals(typeDescription.getType())) {
            this.rootTag = new Tag(typeDescription.getType());
        }
        this.yamlClassConstructors.put(NodeId.scalar, new Constructor$ConstructScalar(this));
        this.yamlClassConstructors.put(NodeId.mapping, new Constructor$ConstructMapping(this));
        this.yamlClassConstructors.put(NodeId.sequence, new Constructor$ConstructSequence(this));
        this.addTypeDescription(typeDescription);
        if (collection != null) {
            for (TypeDescription typeDescription2 : collection) {
                this.addTypeDescription(typeDescription2);
            }
        }
    }

    public Constructor(String string) throws ClassNotFoundException {
        this(Class.forName(Constructor.check(string)));
    }

    public Constructor(String string, LoaderOptions loaderOptions) throws ClassNotFoundException {
        this(Class.forName(Constructor.check(string)), loaderOptions);
    }

    public Constructor(LoaderOptions loaderOptions) {
        this(Object.class, loaderOptions);
    }

    public Constructor(Class<? extends Object> clazz) {
        this(new TypeDescription(Constructor.checkRoot(clazz)));
    }

    public Constructor(Class<? extends Object> clazz, LoaderOptions loaderOptions) {
        this(new TypeDescription(Constructor.checkRoot(clazz)), loaderOptions);
    }

    public Constructor() {
        this(Object.class);
    }

    private static final String check(String string) {
        if (string == null) {
            throw new NullPointerException("Root type must be provided.");
        }
        if (string.trim().length() == 0) {
            throw new YAMLException("Root type must be provided.");
        }
        return string;
    }

    private static Class<? extends Object> checkRoot(Class<? extends Object> clazz) {
        if (clazz == null) {
            throw new NullPointerException("Root class must be provided.");
        }
        return clazz;
    }

    public Class<?> getClassForName(String string) throws ClassNotFoundException {
        try {
            return Class.forName(string, true, Thread.currentThread().getContextClassLoader());
        }
        catch (ClassNotFoundException classNotFoundException) {
            return Class.forName(string);
        }
    }

    protected Class<?> getClassForNode(Node node) {
        Class clazz = (Class)this.typeTags.get(node.getTag());
        if (clazz == null) {
            Class<?> clazz2;
            String string = node.getTag().getClassName();
            try {
                clazz2 = this.getClassForName(string);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new YAMLException("Class not found: " + string);
            }
            this.typeTags.put(node.getTag(), clazz2);
            return clazz2;
        }
        return clazz;
    }
}


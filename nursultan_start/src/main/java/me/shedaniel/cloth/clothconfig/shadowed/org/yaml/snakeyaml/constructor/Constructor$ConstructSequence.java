/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;

public class Constructor$ConstructSequence
implements Construct {
    final /* synthetic */ Constructor this$0;

    protected Constructor$ConstructSequence(Constructor constructor) {
        this.this$0 = constructor;
    }

    @Override
    public void construct2ndStep(Node node, Object object) {
        SequenceNode sequenceNode = (SequenceNode)node;
        if (List.class.isAssignableFrom(node.getType())) {
            List list = (List)object;
            this.this$0.constructSequenceStep2(sequenceNode, list);
        } else if (node.getType().isArray()) {
            this.this$0.constructArrayStep2(sequenceNode, object);
        } else {
            throw new YAMLException("Immutable objects cannot be recursive.");
        }
    }

    @Override
    public Object construct(Node node) {
        SequenceNode sequenceNode = (SequenceNode)node;
        if (Set.class.isAssignableFrom(node.getType())) {
            if (node.isTwoStepsConstruction()) {
                throw new YAMLException("Set cannot be recursive.");
            }
            return this.this$0.constructSet(sequenceNode);
        }
        if (Collection.class.isAssignableFrom(node.getType())) {
            if (node.isTwoStepsConstruction()) {
                return this.this$0.newList(sequenceNode);
            }
            return this.this$0.constructSequence(sequenceNode);
        }
        if (node.getType().isArray()) {
            if (node.isTwoStepsConstruction()) {
                return this.this$0.createArray(node.getType(), sequenceNode.getValue().size());
            }
            return this.this$0.constructArray(sequenceNode);
        }
        ArrayList arrayList = new ArrayList(sequenceNode.getValue().size());
        for (java.lang.reflect.Constructor<?> iterator : node.getType().getDeclaredConstructors()) {
            if (sequenceNode.getValue().size() != iterator.getParameterTypes().length) continue;
            arrayList.add(iterator);
        }
        if (!arrayList.isEmpty()) {
            int n;
            Object object;
            if (arrayList.size() == 1) {
                object = new Object[sequenceNode.getValue().size()];
                java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor)arrayList.get(0);
                n = 0;
                for (Node node2 : sequenceNode.getValue()) {
                    Class<?> clazz = constructor.getParameterTypes()[n];
                    node2.setType(clazz);
                    object[n++] = this.this$0.constructObject(node2);
                }
                try {
                    constructor.setAccessible(true);
                    return constructor.newInstance((Object[])object);
                }
                catch (Exception exception) {
                    throw new YAMLException((Throwable)exception);
                }
            }
            object = this.this$0.constructSequence(sequenceNode);
            Class[] classArray = new Class[object.size()];
            n = 0;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object e = iterator.next();
                classArray[n] = e.getClass();
                ++n;
            }
            for (java.lang.reflect.Constructor constructor : arrayList) {
                Class<?>[] classArray2 = constructor.getParameterTypes();
                boolean bl = true;
                for (int i = 0; i < classArray2.length; ++i) {
                    if (this.wrapIfPrimitive(classArray2[i]).isAssignableFrom(classArray[i])) continue;
                    bl = false;
                    break;
                }
                if (!bl) continue;
                try {
                    constructor.setAccessible(true);
                    return constructor.newInstance(object.toArray());
                }
                catch (Exception exception) {
                    throw new YAMLException((Throwable)exception);
                }
            }
        }
        throw new YAMLException("No suitable constructor with " + String.valueOf(sequenceNode.getValue().size()) + " arguments found for " + node.getType());
    }

    private final Class<? extends Object> wrapIfPrimitive(Class<?> clazz) {
        if (!clazz.isPrimitive()) {
            return clazz;
        }
        if (clazz == Integer.TYPE) {
            return Integer.class;
        }
        if (clazz == Float.TYPE) {
            return Float.class;
        }
        if (clazz == Double.TYPE) {
            return Double.class;
        }
        if (clazz == Boolean.TYPE) {
            return Boolean.class;
        }
        if (clazz == Long.TYPE) {
            return Long.class;
        }
        if (clazz == Character.TYPE) {
            return Character.class;
        }
        if (clazz == Short.TYPE) {
            return Short.class;
        }
        if (clazz == Byte.TYPE) {
            return Byte.class;
        }
        throw new YAMLException("Unexpected primitive " + clazz);
    }
}


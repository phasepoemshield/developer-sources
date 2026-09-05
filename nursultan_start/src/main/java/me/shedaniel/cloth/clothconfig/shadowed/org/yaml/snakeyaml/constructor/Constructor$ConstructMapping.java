/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.Property
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.CollectionNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.TypeDescription;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.DuplicateKeyException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.Property;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.CollectionNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public class Constructor$ConstructMapping
implements Construct {
    final /* synthetic */ Constructor this$0;

    public Constructor$ConstructMapping(Constructor constructor) {
        this.this$0 = constructor;
    }

    protected Property getProperty(Class<? extends Object> clazz, String string) {
        return this.this$0.getPropertyUtils().getProperty(clazz, string);
    }

    private Object newInstance(TypeDescription typeDescription, String string, Node node) {
        Object object = typeDescription.newInstance(string, node);
        if (object != null) {
            this.this$0.constructedObjects.put(node, object);
            return this.this$0.constructObjectNoCheck(node);
        }
        return this.this$0.constructObject(node);
    }

    @Override
    public void construct2ndStep(Node node, Object object) {
        if (Map.class.isAssignableFrom(node.getType())) {
            this.this$0.constructMapping2ndStep((MappingNode)node, (Map)object);
        } else if (Set.class.isAssignableFrom(node.getType())) {
            this.this$0.constructSet2ndStep((MappingNode)node, (Set)object);
        } else {
            this.constructJavaBean2ndStep((MappingNode)node, object);
        }
    }

    @Override
    public Object construct(Node node) {
        MappingNode mappingNode = (MappingNode)node;
        if (Map.class.isAssignableFrom(node.getType())) {
            if (node.isTwoStepsConstruction()) {
                return this.this$0.newMap(mappingNode);
            }
            return this.this$0.constructMapping(mappingNode);
        }
        if (Collection.class.isAssignableFrom(node.getType())) {
            if (node.isTwoStepsConstruction()) {
                return this.this$0.newSet((CollectionNode)mappingNode);
            }
            return this.this$0.constructSet(mappingNode);
        }
        Object object = this.this$0.newInstance((Node)mappingNode);
        if (node.isTwoStepsConstruction()) {
            return object;
        }
        return this.constructJavaBean2ndStep(mappingNode, object);
    }

    protected Object constructJavaBean2ndStep(MappingNode mappingNode, Object object) {
        this.this$0.flattenMapping(mappingNode);
        Class clazz = mappingNode.getType();
        List list = mappingNode.getValue();
        for (NodeTuple nodeTuple : list) {
            if (!(nodeTuple.getKeyNode() instanceof ScalarNode)) {
                throw new YAMLException("Keys must be scalars but found: " + nodeTuple.getKeyNode());
            }
            ScalarNode scalarNode = (ScalarNode)nodeTuple.getKeyNode();
            Node node = nodeTuple.getValueNode();
            scalarNode.setType(String.class);
            String string = (String)this.this$0.constructObject((Node)scalarNode);
            try {
                Object object2;
                boolean bl;
                Property property;
                TypeDescription typeDescription = (TypeDescription)this.this$0.typeDefinitions.get(clazz);
                Property property2 = property = typeDescription == null ? this.getProperty(clazz, string) : typeDescription.getProperty(string);
                if (!property.isWritable()) {
                    throw new YAMLException("No writable property '" + string + "' on class: " + clazz.getName());
                }
                node.setType(property.getType());
                boolean bl2 = bl = typeDescription != null ? typeDescription.setupPropertyType(string, node) : false;
                if (!bl && node.getNodeId() != NodeId.scalar && (object2 = property.getActualTypeArguments()) != null && ((Class[])object2).length > 0) {
                    Object object3;
                    Class clazz2;
                    if (node.getNodeId() == NodeId.sequence) {
                        clazz2 = object2[0];
                        object3 = (SequenceNode)node;
                        object3.setListType(clazz2);
                    } else if (Set.class.isAssignableFrom(node.getType())) {
                        clazz2 = object2[0];
                        object3 = (MappingNode)node;
                        object3.setOnlyKeyType(clazz2);
                        object3.setUseClassConstructor(Boolean.valueOf(true));
                    } else if (Map.class.isAssignableFrom(node.getType())) {
                        clazz2 = object2[0];
                        object3 = object2[1];
                        MappingNode mappingNode2 = (MappingNode)node;
                        mappingNode2.setTypes(clazz2, (Class)object3);
                        mappingNode2.setUseClassConstructor(Boolean.valueOf(true));
                    }
                }
                Object object4 = object2 = typeDescription != null ? this.newInstance(typeDescription, string, node) : this.this$0.constructObject(node);
                if ((property.getType() == Float.TYPE || property.getType() == Float.class) && object2 instanceof Double) {
                    object2 = Float.valueOf(((Double)object2).floatValue());
                }
                if (property.getType() == String.class && Tag.BINARY.equals((Object)node.getTag()) && object2 instanceof byte[]) {
                    object2 = new String((byte[])object2);
                }
                if (typeDescription != null && typeDescription.setProperty(object, string, object2)) continue;
                property.set(object, object2);
            }
            catch (DuplicateKeyException duplicateKeyException) {
                throw duplicateKeyException;
            }
            catch (Exception exception) {
                throw new ConstructorException("Cannot create property=" + string + " for JavaBean=" + object, mappingNode.getStartMark(), exception.getMessage(), node.getStartMark(), exception);
            }
        }
        return object;
    }
}


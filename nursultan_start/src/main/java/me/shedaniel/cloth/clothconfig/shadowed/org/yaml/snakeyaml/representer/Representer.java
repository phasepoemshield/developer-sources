/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.TypeDescription
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.TypeDescription;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.Property;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.PropertyUtils;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Representer$RepresentJavaBean;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class Representer
extends SafeRepresenter {
    protected Map<Class<? extends Object>, TypeDescription> typeDefinitions = Collections.emptyMap();

    private void resetTag(Class<? extends Object> clazz, Node node) {
        Tag tag = node.getTag();
        if (tag.matches(clazz)) {
            if (Enum.class.isAssignableFrom(clazz)) {
                node.setTag(Tag.STR);
            } else {
                node.setTag(Tag.MAP);
            }
        }
    }

    public Representer() {
        this.representers.put(null, new Representer$RepresentJavaBean(this));
    }

    public Representer(DumperOptions dumperOptions) {
        super(dumperOptions);
        this.representers.put(null, new Representer$RepresentJavaBean(this));
    }

    protected Set<Property> getProperties(Class<? extends Object> clazz) {
        if (this.typeDefinitions.containsKey(clazz)) {
            return this.typeDefinitions.get(clazz).getProperties();
        }
        return this.getPropertyUtils().getProperties(clazz);
    }

    protected NodeTuple representJavaBeanProperty(Object object, Property property, Object object2, Tag tag) {
        ScalarNode scalarNode = (ScalarNode)this.representData(property.getName());
        boolean bl = this.representedObjects.containsKey(object2);
        Node node = this.representData(object2);
        if (object2 != null && !bl) {
            NodeId nodeId = node.getNodeId();
            if (tag == null) {
                if (nodeId == NodeId.scalar) {
                    if (property.getType() != Enum.class && object2 instanceof Enum) {
                        node.setTag(Tag.STR);
                    }
                } else {
                    if (nodeId == NodeId.mapping && property.getType() == object2.getClass() && !(object2 instanceof Map) && !node.getTag().equals(Tag.SET)) {
                        node.setTag(Tag.MAP);
                    }
                    this.checkGlobalTag(property, node, object2);
                }
            }
        }
        return new NodeTuple(scalarNode, node);
    }

    public TypeDescription addTypeDescription(TypeDescription typeDescription) {
        if (Collections.EMPTY_MAP == this.typeDefinitions) {
            this.typeDefinitions = new HashMap<Class<? extends Object>, TypeDescription>();
        }
        if (typeDescription.getTag() != null) {
            this.addClassTag(typeDescription.getType(), typeDescription.getTag());
        }
        typeDescription.setPropertyUtils(this.getPropertyUtils());
        return this.typeDefinitions.put(typeDescription.getType(), typeDescription);
    }

    public void setPropertyUtils(PropertyUtils propertyUtils) {
        super.setPropertyUtils(propertyUtils);
        Collection<TypeDescription> collection = this.typeDefinitions.values();
        for (TypeDescription typeDescription : collection) {
            typeDescription.setPropertyUtils(propertyUtils);
        }
    }

    protected void checkGlobalTag(Property property, Node node, Object object) {
        block10: {
            Class<?>[] classArray;
            block11: {
                if (object.getClass().isArray() && object.getClass().getComponentType().isPrimitive()) {
                    return;
                }
                classArray = property.getActualTypeArguments();
                if (classArray == null) break block10;
                if (node.getNodeId() != NodeId.sequence) break block11;
                Class<?> clazz = classArray[0];
                SequenceNode sequenceNode = (SequenceNode)node;
                Iterable<Object> iterable = Collections.EMPTY_LIST;
                if (object.getClass().isArray()) {
                    iterable = Arrays.asList((Object[])object);
                } else if (object instanceof Iterable) {
                    iterable = (Iterable)object;
                }
                Iterator iterator = iterable.iterator();
                if (!iterator.hasNext()) break block10;
                for (Node node2 : sequenceNode.getValue()) {
                    Object t = iterator.next();
                    if (t == null || !clazz.equals(t.getClass()) || node2.getNodeId() != NodeId.mapping) continue;
                    node2.setTag(Tag.MAP);
                }
                break block10;
            }
            if (object instanceof Set) {
                Class<?> clazz = classArray[0];
                MappingNode mappingNode = (MappingNode)node;
                Iterator<NodeTuple> iterator = mappingNode.getValue().iterator();
                Set set = (Set)object;
                for (Object e : set) {
                    NodeTuple nodeTuple = iterator.next();
                    Node node3 = nodeTuple.getKeyNode();
                    if (!clazz.equals(e.getClass()) || node3.getNodeId() != NodeId.mapping) continue;
                    node3.setTag(Tag.MAP);
                }
            } else if (object instanceof Map) {
                Class<?> clazz = classArray[0];
                Class<?> clazz2 = classArray[1];
                MappingNode mappingNode = (MappingNode)node;
                for (NodeTuple nodeTuple : mappingNode.getValue()) {
                    this.resetTag(clazz, nodeTuple.getKeyNode());
                    this.resetTag(clazz2, nodeTuple.getValueNode());
                }
            }
        }
    }

    protected MappingNode representJavaBean(Set<Property> set, Object object) {
        ArrayList<NodeTuple> arrayList = new ArrayList<NodeTuple>(set.size());
        Tag tag = (Tag)this.classTags.get(object.getClass());
        Tag tag2 = tag != null ? tag : new Tag(object.getClass());
        MappingNode mappingNode = new MappingNode(tag2, arrayList, DumperOptions.FlowStyle.AUTO);
        this.representedObjects.put(object, mappingNode);
        DumperOptions.FlowStyle flowStyle = DumperOptions.FlowStyle.FLOW;
        Iterator<Property> iterator = set.iterator();
        while (iterator.hasNext()) {
            Node node;
            Property property;
            Object object2;
            Tag tag3 = (object2 = (property = iterator.next()).get(object)) == null ? null : (Tag)this.classTags.get(object2.getClass());
            NodeTuple nodeTuple = this.representJavaBeanProperty(object, property, object2, tag3);
            if (nodeTuple == null) continue;
            if (!((ScalarNode)nodeTuple.getKeyNode()).isPlain()) {
                flowStyle = DumperOptions.FlowStyle.BLOCK;
            }
            if (!((node = nodeTuple.getValueNode()) instanceof ScalarNode) || !((ScalarNode)node).isPlain()) {
                flowStyle = DumperOptions.FlowStyle.BLOCK;
            }
            arrayList.add(nodeTuple);
        }
        if (this.defaultFlowStyle != DumperOptions.FlowStyle.AUTO) {
            mappingNode.setFlowStyle(this.defaultFlowStyle);
        } else {
            mappingNode.setFlowStyle(flowStyle);
        }
        return mappingNode;
    }
}


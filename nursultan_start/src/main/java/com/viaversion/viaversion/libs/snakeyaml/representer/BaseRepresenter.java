/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions$FlowStyle
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions$ScalarStyle
 *  com.viaversion.viaversion.libs.snakeyaml.introspector.PropertyUtils
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.AnchorNode
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.MappingNode
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.Node
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.NodeTuple
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.ScalarNode
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.SequenceNode
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.Tag
 */
package com.viaversion.viaversion.libs.snakeyaml.representer;

import com.viaversion.viaversion.libs.snakeyaml.DumperOptions;
import com.viaversion.viaversion.libs.snakeyaml.introspector.PropertyUtils;
import com.viaversion.viaversion.libs.snakeyaml.nodes.AnchorNode;
import com.viaversion.viaversion.libs.snakeyaml.nodes.MappingNode;
import com.viaversion.viaversion.libs.snakeyaml.nodes.Node;
import com.viaversion.viaversion.libs.snakeyaml.nodes.NodeTuple;
import com.viaversion.viaversion.libs.snakeyaml.nodes.ScalarNode;
import com.viaversion.viaversion.libs.snakeyaml.nodes.SequenceNode;
import com.viaversion.viaversion.libs.snakeyaml.nodes.Tag;
import com.viaversion.viaversion.libs.snakeyaml.representer.Represent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseRepresenter {
    protected final Map<Class<?>, Represent> representers = new HashMap();
    protected Represent nullRepresenter;
    protected final Map<Class<?>, Represent> multiRepresenters = new LinkedHashMap();
    protected DumperOptions.ScalarStyle defaultScalarStyle = DumperOptions.ScalarStyle.PLAIN;
    protected DumperOptions.FlowStyle defaultFlowStyle = DumperOptions.FlowStyle.AUTO;
    protected final Map<Object, Node> representedObjects = new IdentityHashMap<Object, Node>(){
        private static final long serialVersionUID = -5576159264232131854L;

        @Override
        public Node put(Object key, Node value) {
            return (Node)super.put(key, new AnchorNode(value));
        }
    };
    protected Object objectToRepresent;
    private PropertyUtils propertyUtils;
    private boolean explicitPropertyUtils = false;

    public final PropertyUtils getPropertyUtils() {
        if (this.propertyUtils == null) {
            this.propertyUtils = new PropertyUtils();
        }
        return this.propertyUtils;
    }

    public void setPropertyUtils(PropertyUtils propertyUtils) {
        this.propertyUtils = propertyUtils;
        this.explicitPropertyUtils = true;
    }

    protected Node representMapping(Tag tag, Map<?, ?> mapping, DumperOptions.FlowStyle flowStyle) {
        ArrayList<NodeTuple> value = new ArrayList<NodeTuple>(mapping.size());
        MappingNode node = new MappingNode(tag, value, flowStyle);
        this.representedObjects.put(this.objectToRepresent, (Node)node);
        DumperOptions.FlowStyle bestStyle = DumperOptions.FlowStyle.FLOW;
        for (Map.Entry<?, ?> entry : mapping.entrySet()) {
            Node nodeKey = this.representData(entry.getKey());
            Node nodeValue = this.representData(entry.getValue());
            if (!(nodeKey instanceof ScalarNode) || !((ScalarNode)nodeKey).isPlain()) {
                bestStyle = DumperOptions.FlowStyle.BLOCK;
            }
            if (!(nodeValue instanceof ScalarNode) || !((ScalarNode)nodeValue).isPlain()) {
                bestStyle = DumperOptions.FlowStyle.BLOCK;
            }
            value.add(new NodeTuple(nodeKey, nodeValue));
        }
        if (flowStyle == DumperOptions.FlowStyle.AUTO) {
            if (this.defaultFlowStyle != DumperOptions.FlowStyle.AUTO) {
                node.setFlowStyle(this.defaultFlowStyle);
            } else {
                node.setFlowStyle(bestStyle);
            }
        }
        return node;
    }

    protected Node representScalar(Tag tag, String value) {
        return this.representScalar(tag, value, this.defaultScalarStyle);
    }

    protected Node representScalar(Tag tag, String value, DumperOptions.ScalarStyle style) {
        return new ScalarNode(tag, value, null, null, style);
    }

    protected Node representSequence(Tag tag, Iterable<?> sequence, DumperOptions.FlowStyle flowStyle) {
        int size = 10;
        if (sequence instanceof List) {
            size = ((List)sequence).size();
        }
        ArrayList<Node> value = new ArrayList<Node>(size);
        SequenceNode node = new SequenceNode(tag, value, flowStyle);
        this.representedObjects.put(this.objectToRepresent, (Node)node);
        DumperOptions.FlowStyle bestStyle = DumperOptions.FlowStyle.FLOW;
        for (Object item : sequence) {
            Node nodeItem = this.representData(item);
            if (!(nodeItem instanceof ScalarNode) || !((ScalarNode)nodeItem).isPlain()) {
                bestStyle = DumperOptions.FlowStyle.BLOCK;
            }
            value.add(nodeItem);
        }
        if (flowStyle == DumperOptions.FlowStyle.AUTO) {
            if (this.defaultFlowStyle != DumperOptions.FlowStyle.AUTO) {
                node.setFlowStyle(this.defaultFlowStyle);
            } else {
                node.setFlowStyle(bestStyle);
            }
        }
        return node;
    }

    protected final Node representData(Object data) {
        Node node;
        this.objectToRepresent = data;
        if (this.representedObjects.containsKey(this.objectToRepresent)) {
            Node node2 = this.representedObjects.get(this.objectToRepresent);
            return node2;
        }
        if (data == null) {
            Node node3 = this.nullRepresenter.representData(null);
            return node3;
        }
        Class<?> clazz = data.getClass();
        if (this.representers.containsKey(clazz)) {
            Represent representer = this.representers.get(clazz);
            node = representer.representData(data);
        } else {
            Object representer;
            for (Class<?> repr : this.multiRepresenters.keySet()) {
                if (repr == null || !repr.isInstance(data)) continue;
                Represent representer2 = this.multiRepresenters.get(repr);
                Node node4 = representer2.representData(data);
                return node4;
            }
            if (this.multiRepresenters.containsKey(null)) {
                representer = this.multiRepresenters.get(null);
                node = representer.representData(data);
            } else {
                representer = this.representers.get(null);
                node = representer.representData(data);
            }
        }
        return node;
    }

    public Node represent(Object data) {
        Node node = this.representData(data);
        this.representedObjects.clear();
        this.objectToRepresent = null;
        return node;
    }

    public void setDefaultScalarStyle(DumperOptions.ScalarStyle defaultStyle) {
        this.defaultScalarStyle = defaultStyle;
    }

    public void setDefaultFlowStyle(DumperOptions.FlowStyle defaultFlowStyle) {
        this.defaultFlowStyle = defaultFlowStyle;
    }

    public DumperOptions.ScalarStyle getDefaultScalarStyle() {
        if (this.defaultScalarStyle == null) {
            return DumperOptions.ScalarStyle.PLAIN;
        }
        return this.defaultScalarStyle;
    }

    public final boolean isExplicitPropertyUtils() {
        return this.explicitPropertyUtils;
    }

    public DumperOptions.FlowStyle getDefaultFlowStyle() {
        return this.defaultFlowStyle;
    }
}


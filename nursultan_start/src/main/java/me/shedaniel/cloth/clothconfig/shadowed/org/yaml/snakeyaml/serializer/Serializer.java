/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$Version
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitable
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.AliasEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentEndEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentStartEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ImplicitTuple
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingEndEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingStartEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ScalarEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceEndEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceStartEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamEndEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamStartEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.AnchorNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.CollectionNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitable;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.AliasEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ImplicitTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ScalarEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.AnchorNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.CollectionNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.resolver.Resolver;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.AnchorGenerator;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.SerializerException;

public final class Serializer {
    private final Emitable emitter;
    private final Resolver resolver;
    private boolean explicitStart;
    private boolean explicitEnd;
    private DumperOptions.Version useVersion;
    private Map<String, String> useTags;
    private Set<Node> serializedNodes;
    private Map<Node, String> anchors;
    private AnchorGenerator anchorGenerator;
    private Boolean closed;
    private Tag explicitRoot;

    public Serializer(Emitable emitable, Resolver resolver, DumperOptions dumperOptions, Tag tag) {
        this.emitter = emitable;
        this.resolver = resolver;
        this.explicitStart = dumperOptions.isExplicitStart();
        this.explicitEnd = dumperOptions.isExplicitEnd();
        if (dumperOptions.getVersion() != null) {
            this.useVersion = dumperOptions.getVersion();
        }
        this.useTags = dumperOptions.getTags();
        this.serializedNodes = new HashSet<Node>();
        this.anchors = new HashMap<Node, String>();
        this.anchorGenerator = dumperOptions.getAnchorGenerator();
        this.closed = null;
        this.explicitRoot = tag;
    }

    public void close() throws IOException {
        if (this.closed == null) {
            throw new SerializerException("serializer is not opened");
        }
        if (!Boolean.TRUE.equals(this.closed)) {
            this.emitter.emit((Event)new StreamEndEvent(null, null));
            this.closed = Boolean.TRUE;
            this.serializedNodes.clear();
            this.anchors.clear();
        }
    }

    public void open() throws IOException {
        if (this.closed != null) {
            if (Boolean.TRUE.equals(this.closed)) {
                throw new SerializerException("serializer is closed");
            }
            throw new SerializerException("serializer is already opened");
        }
        this.emitter.emit((Event)new StreamStartEvent(null, null));
        this.closed = Boolean.FALSE;
    }

    public void serialize(Node node) throws IOException {
        if (this.closed == null) {
            throw new SerializerException("serializer is not opened");
        }
        if (this.closed.booleanValue()) {
            throw new SerializerException("serializer is closed");
        }
        this.emitter.emit((Event)new DocumentStartEvent(null, null, this.explicitStart, this.useVersion, this.useTags));
        this.anchorNode(node);
        if (this.explicitRoot != null) {
            node.setTag(this.explicitRoot);
        }
        this.serializeNode(node, null);
        this.emitter.emit((Event)new DocumentEndEvent(null, null, this.explicitEnd));
        this.serializedNodes.clear();
        this.anchors.clear();
    }

    private void anchorNode(Node node) {
        if (node.getNodeId() == NodeId.anchor) {
            node = ((AnchorNode)node).getRealNode();
        }
        if (this.anchors.containsKey(node)) {
            String string = this.anchors.get(node);
            if (null == string) {
                string = this.anchorGenerator.nextAnchor(node);
                this.anchors.put(node, string);
            }
        } else {
            this.anchors.put(node, node.getAnchor() != null ? this.anchorGenerator.nextAnchor(node) : null);
            switch (node.getNodeId()) {
                case sequence: {
                    SequenceNode sequenceNode = (SequenceNode)node;
                    List list = sequenceNode.getValue();
                    for (Node node2 : list) {
                        this.anchorNode(node2);
                    }
                    break;
                }
                case mapping: {
                    MappingNode mappingNode = (MappingNode)node;
                    List list = mappingNode.getValue();
                    for (NodeTuple nodeTuple : list) {
                        Node node3 = nodeTuple.getKeyNode();
                        Node node4 = nodeTuple.getValueNode();
                        this.anchorNode(node3);
                        this.anchorNode(node4);
                    }
                    break;
                }
            }
        }
    }

    private void serializeNode(Node node, Node node2) throws IOException {
        if (node.getNodeId() == NodeId.anchor) {
            node = ((AnchorNode)node).getRealNode();
        }
        String string = this.anchors.get(node);
        if (this.serializedNodes.contains(node)) {
            this.emitter.emit((Event)new AliasEvent(string, null, null));
        } else {
            this.serializedNodes.add(node);
            switch (node.getNodeId()) {
                case scalar: {
                    ScalarNode scalarNode = (ScalarNode)node;
                    Tag tag = this.resolver.resolve(NodeId.scalar, scalarNode.getValue(), true);
                    Tag tag2 = this.resolver.resolve(NodeId.scalar, scalarNode.getValue(), false);
                    ImplicitTuple implicitTuple = new ImplicitTuple(node.getTag().equals((Object)tag), node.getTag().equals((Object)tag2));
                    ScalarEvent scalarEvent = new ScalarEvent(string, node.getTag().getValue(), implicitTuple, scalarNode.getValue(), null, null, scalarNode.getScalarStyle());
                    this.emitter.emit((Event)scalarEvent);
                    break;
                }
                case sequence: {
                    SequenceNode sequenceNode = (SequenceNode)node;
                    boolean bl = node.getTag().equals((Object)this.resolver.resolve(NodeId.sequence, null, true));
                    this.emitter.emit((Event)new SequenceStartEvent(string, node.getTag().getValue(), bl, null, null, sequenceNode.getFlowStyle()));
                    List list = sequenceNode.getValue();
                    for (Node node3 : list) {
                        this.serializeNode(node3, node);
                    }
                    this.emitter.emit((Event)new SequenceEndEvent(null, null));
                    break;
                }
                default: {
                    Tag tag = this.resolver.resolve(NodeId.mapping, null, true);
                    boolean bl = node.getTag().equals((Object)tag);
                    this.emitter.emit((Event)new MappingStartEvent(string, node.getTag().getValue(), bl, null, null, ((CollectionNode)node).getFlowStyle()));
                    MappingNode mappingNode = (MappingNode)node;
                    List list = mappingNode.getValue();
                    for (NodeTuple nodeTuple : list) {
                        Node node4 = nodeTuple.getKeyNode();
                        Node node5 = nodeTuple.getValueNode();
                        this.serializeNode(node4, (Node)mappingNode);
                        this.serializeNode(node5, (Node)mappingNode);
                    }
                    this.emitter.emit((Event)new MappingEndEvent(null, null));
                }
            }
        }
    }
}


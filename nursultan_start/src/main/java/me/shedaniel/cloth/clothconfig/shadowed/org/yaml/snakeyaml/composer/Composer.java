/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.AliasEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingStartEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.NodeEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ScalarEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceStartEvent
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Parser
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.resolver.Resolver
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.composer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.LoaderOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.composer.ComposerException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.AliasEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.NodeEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ScalarEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Parser;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.resolver.Resolver;

public class Composer {
    protected final Parser parser;
    private final Resolver resolver;
    private final Map<String, Node> anchors;
    private final Set<Node> recursiveNodes;
    private int nonScalarAliasesCount = 0;
    private final LoaderOptions loadingConfig;

    public Composer(Parser parser, Resolver resolver) {
        this(parser, resolver, new LoaderOptions());
    }

    public Composer(Parser parser, Resolver resolver, LoaderOptions loaderOptions) {
        this.parser = parser;
        this.resolver = resolver;
        this.anchors = new HashMap<String, Node>();
        this.recursiveNodes = new HashSet<Node>();
        this.loadingConfig = loaderOptions;
    }

    public Node getNode() {
        this.parser.getEvent();
        Node node = this.composeNode(null);
        this.parser.getEvent();
        this.anchors.clear();
        this.recursiveNodes.clear();
        return node;
    }

    protected void composeMappingChildren(List<NodeTuple> list, MappingNode mappingNode) {
        Node node = this.composeKeyNode(mappingNode);
        if (node.getTag().equals((Object)Tag.MERGE)) {
            mappingNode.setMerged(true);
        }
        Node node2 = this.composeValueNode(mappingNode);
        list.add(new NodeTuple(node, node2));
    }

    protected Node composeSequenceNode(String string) {
        Tag tag;
        SequenceStartEvent sequenceStartEvent = (SequenceStartEvent)this.parser.getEvent();
        String string2 = sequenceStartEvent.getTag();
        boolean bl = false;
        if (string2 == null || string2.equals("!")) {
            tag = this.resolver.resolve(NodeId.sequence, null, sequenceStartEvent.getImplicit());
            bl = true;
        } else {
            tag = new Tag(string2);
        }
        ArrayList<Node> arrayList = new ArrayList<Node>();
        SequenceNode sequenceNode = new SequenceNode(tag, bl, arrayList, sequenceStartEvent.getStartMark(), null, sequenceStartEvent.getFlowStyle());
        if (string != null) {
            sequenceNode.setAnchor(string);
            this.anchors.put(string, (Node)sequenceNode);
        }
        while (!this.parser.checkEvent(Event.ID.SequenceEnd)) {
            arrayList.add(this.composeNode((Node)sequenceNode));
        }
        Event event = this.parser.getEvent();
        sequenceNode.setEndMark(event.getEndMark());
        return sequenceNode;
    }

    public Node getSingleNode() {
        this.parser.getEvent();
        Node node = null;
        if (!this.parser.checkEvent(Event.ID.StreamEnd)) {
            node = this.getNode();
        }
        if (!this.parser.checkEvent(Event.ID.StreamEnd)) {
            Event event = this.parser.getEvent();
            Mark mark = node != null ? node.getStartMark() : null;
            throw new ComposerException("expected a single document in the stream", mark, "but found another document", event.getStartMark());
        }
        this.parser.getEvent();
        return node;
    }

    protected Node composeScalarNode(String string) {
        Tag tag;
        ScalarEvent scalarEvent = (ScalarEvent)this.parser.getEvent();
        String string2 = scalarEvent.getTag();
        boolean bl = false;
        if (string2 == null || string2.equals("!")) {
            tag = this.resolver.resolve(NodeId.scalar, scalarEvent.getValue(), scalarEvent.getImplicit().canOmitTagInPlainScalar());
            bl = true;
        } else {
            tag = new Tag(string2);
        }
        ScalarNode scalarNode = new ScalarNode(tag, bl, scalarEvent.getValue(), scalarEvent.getStartMark(), scalarEvent.getEndMark(), scalarEvent.getScalarStyle());
        if (string != null) {
            scalarNode.setAnchor(string);
            this.anchors.put(string, (Node)scalarNode);
        }
        return scalarNode;
    }

    protected Node composeKeyNode(MappingNode mappingNode) {
        return this.composeNode((Node)mappingNode);
    }

    protected Node composeValueNode(MappingNode mappingNode) {
        return this.composeNode((Node)mappingNode);
    }

    protected Node composeMappingNode(String string) {
        Tag tag;
        MappingStartEvent mappingStartEvent = (MappingStartEvent)this.parser.getEvent();
        String string2 = mappingStartEvent.getTag();
        boolean bl = false;
        if (string2 == null || string2.equals("!")) {
            tag = this.resolver.resolve(NodeId.mapping, null, mappingStartEvent.getImplicit());
            bl = true;
        } else {
            tag = new Tag(string2);
        }
        ArrayList<NodeTuple> arrayList = new ArrayList<NodeTuple>();
        MappingNode mappingNode = new MappingNode(tag, bl, arrayList, mappingStartEvent.getStartMark(), null, mappingStartEvent.getFlowStyle());
        if (string != null) {
            mappingNode.setAnchor(string);
            this.anchors.put(string, (Node)mappingNode);
        }
        while (!this.parser.checkEvent(Event.ID.MappingEnd)) {
            this.composeMappingChildren(arrayList, mappingNode);
        }
        Event event = this.parser.getEvent();
        mappingNode.setEndMark(event.getEndMark());
        return mappingNode;
    }

    private Node composeNode(Node node) {
        Node node2;
        if (node != null) {
            this.recursiveNodes.add(node);
        }
        if (this.parser.checkEvent(Event.ID.Alias)) {
            AliasEvent aliasEvent = (AliasEvent)this.parser.getEvent();
            String string = aliasEvent.getAnchor();
            if (!this.anchors.containsKey(string)) {
                throw new ComposerException(null, null, "found undefined alias " + string, aliasEvent.getStartMark());
            }
            node2 = this.anchors.get(string);
            if (!(node2 instanceof ScalarNode)) {
                ++this.nonScalarAliasesCount;
                if (this.nonScalarAliasesCount > this.loadingConfig.getMaxAliasesForCollections()) {
                    throw new YAMLException("Number of aliases for non-scalar nodes exceeds the specified max=" + this.loadingConfig.getMaxAliasesForCollections());
                }
            }
            if (this.recursiveNodes.remove(node2)) {
                node2.setTwoStepsConstruction(true);
            }
        } else {
            NodeEvent nodeEvent = (NodeEvent)this.parser.peekEvent();
            String string = nodeEvent.getAnchor();
            node2 = this.parser.checkEvent(Event.ID.Scalar) ? this.composeScalarNode(string) : (this.parser.checkEvent(Event.ID.SequenceStart) ? this.composeSequenceNode(string) : this.composeMappingNode(string));
        }
        this.recursiveNodes.remove(node);
        return node2;
    }

    public boolean checkNode() {
        if (this.parser.checkEvent(Event.ID.StreamStart)) {
            this.parser.getEvent();
        }
        return !this.parser.checkEvent(Event.ID.StreamEnd);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.LoaderOptions
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.BaseConstructor
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.DuplicateKeyException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$1
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBool
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlInt
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlMap
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlNull
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.LoaderOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.BaseConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.DuplicateKeyException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSet;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlStr;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public class SafeConstructor
extends BaseConstructor {
    public static final ConstructUndefined undefinedConstructor;
    private static final Map<String, Boolean> BOOL_VALUES;
    private static final int[][] RADIX_MAX;
    private static final Pattern TIMESTAMP_REGEXP;
    private static final Pattern YMD_REGEXP;

    static /* synthetic */ Map access$000() {
        return BOOL_VALUES;
    }

    static /* synthetic */ Number access$100(SafeConstructor safeConstructor, int n, String string, int n2) {
        return safeConstructor.createNumber(n, string, n2);
    }

    static /* synthetic */ Pattern access$200() {
        return YMD_REGEXP;
    }

    static /* synthetic */ Pattern access$300() {
        return TIMESTAMP_REGEXP;
    }

    private static int maxLen(int n, int n2) {
        return Integer.toString(n, n2).length();
    }

    private static int maxLen(long l, int n) {
        return Long.toString(l, n).length();
    }

    public SafeConstructor() {
        this(new LoaderOptions());
    }

    public SafeConstructor(LoaderOptions loaderOptions) {
        super(loaderOptions);
        this.yamlConstructors.put(Tag.NULL, new ConstructYamlNull(this));
        this.yamlConstructors.put(Tag.BOOL, new ConstructYamlBool(this));
        this.yamlConstructors.put(Tag.INT, new ConstructYamlInt(this));
        this.yamlConstructors.put(Tag.FLOAT, new ConstructYamlFloat(this));
        this.yamlConstructors.put(Tag.BINARY, new ConstructYamlBinary(this));
        this.yamlConstructors.put(Tag.TIMESTAMP, new SafeConstructor$ConstructYamlTimestamp());
        this.yamlConstructors.put(Tag.OMAP, new ConstructYamlOmap(this));
        this.yamlConstructors.put(Tag.PAIRS, new ConstructYamlPairs(this));
        this.yamlConstructors.put(Tag.SET, new SafeConstructor$ConstructYamlSet(this));
        this.yamlConstructors.put(Tag.STR, new SafeConstructor$ConstructYamlStr(this));
        this.yamlConstructors.put(Tag.SEQ, new ConstructYamlSeq(this));
        this.yamlConstructors.put(Tag.MAP, new ConstructYamlMap(this));
        this.yamlConstructors.put(null, undefinedConstructor);
        this.yamlClassConstructors.put(NodeId.scalar, undefinedConstructor);
        this.yamlClassConstructors.put(NodeId.sequence, undefinedConstructor);
        this.yamlClassConstructors.put(NodeId.mapping, undefinedConstructor);
    }

    static {
        int[] nArray;
        undefinedConstructor = new ConstructUndefined();
        BOOL_VALUES = new HashMap<String, Boolean>();
        BOOL_VALUES.put("yes", Boolean.TRUE);
        BOOL_VALUES.put("no", Boolean.FALSE);
        BOOL_VALUES.put("true", Boolean.TRUE);
        BOOL_VALUES.put("false", Boolean.FALSE);
        BOOL_VALUES.put("on", Boolean.TRUE);
        BOOL_VALUES.put("off", Boolean.FALSE);
        RADIX_MAX = new int[17][2];
        for (int n : nArray = new int[]{2, 8, 10, 16}) {
            SafeConstructor.RADIX_MAX[n] = new int[]{SafeConstructor.maxLen(Integer.MAX_VALUE, n), SafeConstructor.maxLen(Long.MAX_VALUE, n)};
        }
        TIMESTAMP_REGEXP = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$");
        YMD_REGEXP = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");
    }

    protected static Number createLongOrBigInteger(String string, int n) {
        try {
            return Long.valueOf(string, n);
        }
        catch (NumberFormatException numberFormatException) {
            return new BigInteger(string, n);
        }
    }

    protected void processDuplicateKeys(MappingNode mappingNode) {
        List<NodeTuple> list = mappingNode.getValue();
        HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>(list.size());
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        int n = 0;
        for (NodeTuple nodeTuple : list) {
            Node node = nodeTuple.getKeyNode();
            if (!node.getTag().equals(Tag.MERGE)) {
                Integer n2;
                Object object = this.constructObject(node);
                if (object != null) {
                    try {
                        object.hashCode();
                    }
                    catch (Exception exception) {
                        throw new ConstructorException("while constructing a mapping", mappingNode.getStartMark(), "found unacceptable key " + object, nodeTuple.getKeyNode().getStartMark(), (Throwable)exception);
                    }
                }
                if ((n2 = hashMap.put(object, n)) != null) {
                    if (!this.isAllowDuplicateKeys()) {
                        throw new DuplicateKeyException(mappingNode.getStartMark(), object, nodeTuple.getKeyNode().getStartMark());
                    }
                    treeSet.add(n2);
                }
            }
            ++n;
        }
        Iterator<NodeTuple> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            list.remove((Integer)((Object)iterator.next()));
        }
    }

    protected void constructMapping2ndStep(MappingNode mappingNode, Map<Object, Object> map) {
        this.flattenMapping(mappingNode);
        super.constructMapping2ndStep(mappingNode, map);
    }

    protected void constructSet2ndStep(MappingNode mappingNode, Set<Object> set) {
        this.flattenMapping(mappingNode);
        super.constructSet2ndStep(mappingNode, set);
    }

    protected void flattenMapping(MappingNode mappingNode) {
        this.processDuplicateKeys(mappingNode);
        if (mappingNode.isMerged()) {
            mappingNode.setValue(this.mergeNode(mappingNode, true, new HashMap<Object, Integer>(), new ArrayList<NodeTuple>()));
        }
    }

    private Number createNumber(int n, String string, int n2) {
        Number number;
        int[] nArray;
        int n3;
        int n4 = n3 = string != null ? string.length() : 0;
        if (n < 0) {
            string = "-" + string;
        }
        int[] nArray2 = nArray = n2 < RADIX_MAX.length ? RADIX_MAX[n2] : null;
        if (nArray != null) {
            boolean bl;
            boolean bl2 = bl = n3 > nArray[0];
            if (bl) {
                if (n3 > nArray[1]) {
                    return new BigInteger(string, n2);
                }
                return SafeConstructor.createLongOrBigInteger(string, n2);
            }
        }
        try {
            number = Integer.valueOf(string, n2);
        }
        catch (NumberFormatException numberFormatException) {
            number = SafeConstructor.createLongOrBigInteger(string, n2);
        }
        return number;
    }

    private List<NodeTuple> mergeNode(MappingNode mappingNode, boolean bl, Map<Object, Integer> map, List<NodeTuple> list) {
        Iterator<NodeTuple> iterator = mappingNode.getValue().iterator();
        block4: while (iterator.hasNext()) {
            Object object;
            NodeTuple nodeTuple = iterator.next();
            Node node = nodeTuple.getKeyNode();
            Node node2 = nodeTuple.getValueNode();
            if (node.getTag().equals(Tag.MERGE)) {
                iterator.remove();
                switch (1.$SwitchMap$org$yaml$snakeyaml$nodes$NodeId[node2.getNodeId().ordinal()]) {
                    case 1: {
                        object = (MappingNode)node2;
                        this.mergeNode((MappingNode)object, false, map, list);
                        break;
                    }
                    case 2: {
                        SequenceNode sequenceNode = (SequenceNode)node2;
                        List<Node> list2 = sequenceNode.getValue();
                        for (Node node3 : list2) {
                            if (!(node3 instanceof MappingNode)) {
                                throw new ConstructorException("while constructing a mapping", mappingNode.getStartMark(), "expected a mapping for merging, but found " + (Object)((Object)node3.getNodeId()), node3.getStartMark());
                            }
                            MappingNode mappingNode2 = (MappingNode)node3;
                            this.mergeNode(mappingNode2, false, map, list);
                        }
                        continue block4;
                    }
                    default: {
                        throw new ConstructorException("while constructing a mapping", mappingNode.getStartMark(), "expected a mapping or list of mappings for merging, but found " + (Object)((Object)node2.getNodeId()), node2.getStartMark());
                    }
                }
                continue;
            }
            object = this.constructObject(node);
            if (!map.containsKey(object)) {
                list.add(nodeTuple);
                map.put(object, list.size() - 1);
                continue;
            }
            if (!bl) continue;
            list.set(map.get(object), nodeTuple);
        }
        return list;
    }
}


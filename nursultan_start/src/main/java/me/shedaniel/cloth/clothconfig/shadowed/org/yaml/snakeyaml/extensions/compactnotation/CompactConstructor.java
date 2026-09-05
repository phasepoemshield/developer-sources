/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation.CompactConstructor$ConstructCompactObject;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation.CompactData;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.Property;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;

public class CompactConstructor
extends Constructor {
    private static final Pattern GUESS_COMPACT = Pattern.compile("\\p{Alpha}.*\\s*\\((?:,?\\s*(?:(?:\\w*)|(?:\\p{Alpha}\\w*\\s*=.+))\\s*)+\\)");
    private static final Pattern FIRST_PATTERN = Pattern.compile("(\\p{Alpha}.*)(\\s*)\\((.*?)\\)");
    private static final Pattern PROPERTY_NAME_PATTERN = Pattern.compile("\\s*(\\p{Alpha}\\w*)\\s*=(.+)");
    private Construct compactConstruct;

    static /* synthetic */ List access$000(CompactConstructor compactConstructor, SequenceNode sequenceNode) {
        return compactConstructor.constructSequence(sequenceNode);
    }

    static /* synthetic */ String access$100(CompactConstructor compactConstructor, ScalarNode scalarNode) {
        return compactConstructor.constructScalar(scalarNode);
    }

    public Construct getConstructor(Node node) {
        ScalarNode scalarNode;
        ScalarNode scalarNode2;
        NodeTuple nodeTuple;
        Node node2;
        MappingNode mappingNode;
        List<NodeTuple> list;
        if (node instanceof MappingNode ? (list = (mappingNode = (MappingNode)node).getValue()).size() == 1 && (node2 = (nodeTuple = list.get(0)).getKeyNode()) instanceof ScalarNode && GUESS_COMPACT.matcher((scalarNode2 = (ScalarNode)node2).getValue()).matches() : node instanceof ScalarNode && GUESS_COMPACT.matcher((scalarNode = (ScalarNode)node).getValue()).matches()) {
            return this.getCompactConstruct();
        }
        return super.getConstructor(node);
    }

    protected void setProperties(Object object, Map<String, Object> map) throws Exception {
        if (map == null) {
            throw new NullPointerException("Data for Compact Object Notation cannot be null.");
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String string = entry.getKey();
            Property property = this.getPropertyUtils().getProperty(object.getClass(), string);
            try {
                property.set(object, entry.getValue());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new YAMLException("Cannot set property='" + string + "' with value='" + map.get(string) + "' (" + map.get(string).getClass() + ") in " + object);
            }
        }
    }

    protected Object createInstance(ScalarNode scalarNode, CompactData compactData) throws Exception {
        Class clazz = this.getClassForName(compactData.getPrefix());
        Class[] classArray = new Class[compactData.getArguments().size()];
        for (int i = 0; i < classArray.length; ++i) {
            classArray[i] = String.class;
        }
        java.lang.reflect.Constructor constructor = clazz.getDeclaredConstructor(classArray);
        constructor.setAccessible(true);
        return constructor.newInstance(compactData.getArguments().toArray());
    }

    protected void applySequence(Object object, List<?> list) {
        try {
            Property property = this.getPropertyUtils().getProperty(object.getClass(), this.getSequencePropertyName(object.getClass()));
            property.set(object, list);
        }
        catch (Exception exception) {
            throw new YAMLException(exception);
        }
    }

    public CompactData getCompactData(String string) {
        if (!string.endsWith(")")) {
            return null;
        }
        if (string.indexOf(40) < 0) {
            return null;
        }
        Matcher matcher = FIRST_PATTERN.matcher(string);
        if (matcher.matches()) {
            String string2 = matcher.group(1).trim();
            String string3 = matcher.group(3);
            CompactData compactData = new CompactData(string2);
            if (string3.length() == 0) {
                return compactData;
            }
            String[] stringArray = string3.split("\\s*,\\s*");
            for (int i = 0; i < stringArray.length; ++i) {
                String string4 = stringArray[i];
                if (string4.indexOf(61) < 0) {
                    compactData.getArguments().add(string4);
                    continue;
                }
                Matcher matcher2 = PROPERTY_NAME_PATTERN.matcher(string4);
                if (matcher2.matches()) {
                    String string5 = matcher2.group(1);
                    String string6 = matcher2.group(2).trim();
                    compactData.getProperties().put(string5, string6);
                    continue;
                }
                return null;
            }
            return compactData;
        }
        return null;
    }

    protected Construct createCompactConstruct() {
        return new CompactConstructor$ConstructCompactObject(this);
    }

    protected String getSequencePropertyName(Class<?> clazz) {
        Set<Property> set = this.getPropertyUtils().getProperties(clazz);
        Iterator<Property> iterator = set.iterator();
        while (iterator.hasNext()) {
            Property property = iterator.next();
            if (List.class.isAssignableFrom(property.getType())) continue;
            iterator.remove();
        }
        if (set.size() == 0) {
            throw new YAMLException("No list property found in " + clazz);
        }
        if (set.size() > 1) {
            throw new YAMLException("Many list properties found in " + clazz + "; Please override getSequencePropertyName() to specify which property to use.");
        }
        return set.iterator().next().getName();
    }

    protected Object constructCompactFormat(ScalarNode scalarNode, CompactData compactData) {
        try {
            Object object = this.createInstance(scalarNode, compactData);
            HashMap<String, Object> hashMap = new HashMap<String, Object>(compactData.getProperties());
            this.setProperties(object, hashMap);
            return object;
        }
        catch (Exception exception) {
            throw new YAMLException(exception);
        }
    }

    private Construct getCompactConstruct() {
        if (this.compactConstruct == null) {
            this.compactConstruct = this.createCompactConstruct();
        }
        return this.compactConstruct;
    }
}


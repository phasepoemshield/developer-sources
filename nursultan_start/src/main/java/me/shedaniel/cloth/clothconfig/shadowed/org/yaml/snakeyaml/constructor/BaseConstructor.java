/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.PropertyUtils
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

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.LoaderOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.TypeDescription;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.composer.Composer;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.BaseConstructor$RecursiveTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.PropertyUtils;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.CollectionNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public abstract class BaseConstructor {
    protected final Map<NodeId, Construct> yamlClassConstructors = new EnumMap<NodeId, Construct>(NodeId.class);
    protected final Map<Tag, Construct> yamlConstructors = new HashMap<Tag, Construct>();
    protected final Map<String, Construct> yamlMultiConstructors = new HashMap<String, Construct>();
    protected Composer composer;
    final Map<Node, Object> constructedObjects = new HashMap<Node, Object>();
    private final Set<Node> recursiveObjects = new HashSet<Node>();
    private final ArrayList<BaseConstructor$RecursiveTuple<Map<Object, Object>, BaseConstructor$RecursiveTuple<Object, Object>>> maps2fill = new ArrayList();
    private final ArrayList<BaseConstructor$RecursiveTuple<Set<Object>, Object>> sets2fill = new ArrayList();
    protected Tag rootTag = null;
    private PropertyUtils propertyUtils;
    private boolean explicitPropertyUtils = false;
    private boolean allowDuplicateKeys = true;
    private boolean wrappedToRootException = false;
    protected final Map<Class<? extends Object>, TypeDescription> typeDefinitions = new HashMap<Class<? extends Object>, TypeDescription>();
    protected final Map<Tag, Class<? extends Object>> typeTags = new HashMap<Tag, Class<? extends Object>>();
    protected LoaderOptions loadingConfig;

    public BaseConstructor() {
        this(new LoaderOptions());
    }

    public BaseConstructor(LoaderOptions loaderOptions) {
        this.typeDefinitions.put(SortedMap.class, new TypeDescription(SortedMap.class, Tag.OMAP, TreeMap.class));
        this.typeDefinitions.put(SortedSet.class, new TypeDescription(SortedSet.class, Tag.SET, TreeSet.class));
        this.loadingConfig = loaderOptions;
    }

    protected final Object newInstance(Class<?> clazz, Node node) throws InstantiationException {
        return this.newInstance(clazz, node, true);
    }

    protected Object newInstance(Node node) {
        try {
            return this.newInstance(Object.class, node);
        }
        catch (InstantiationException instantiationException) {
            throw new YAMLException((Throwable)instantiationException);
        }
    }

    protected Object newInstance(Class<?> clazz, Node node, boolean bl) throws InstantiationException {
        Object object;
        Object object2;
        Class clazz2 = node.getType();
        if (this.typeDefinitions.containsKey(clazz2) && (object2 = ((TypeDescription)(object = this.typeDefinitions.get(clazz2))).newInstance(node)) != null) {
            return object2;
        }
        if (bl && clazz.isAssignableFrom(clazz2) && !Modifier.isAbstract(clazz2.getModifiers())) {
            try {
                object = clazz2.getDeclaredConstructor(new Class[0]);
                ((Constructor)object).setAccessible(true);
                return ((Constructor)object).newInstance(new Object[0]);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                throw new InstantiationException("NoSuchMethodException:" + noSuchMethodException.getLocalizedMessage());
            }
            catch (Exception exception) {
                throw new YAMLException((Throwable)exception);
            }
        }
        throw new InstantiationException();
    }

    public Construct getConstructor(Node node) {
        if (node.useClassConstructor()) {
            return this.yamlClassConstructors.get(node.getNodeId());
        }
        Construct construct = this.yamlConstructors.get(node.getTag());
        if (construct == null) {
            for (String string : this.yamlMultiConstructors.keySet()) {
                if (!node.getTag().startsWith(string)) continue;
                return this.yamlMultiConstructors.get(string);
            }
            return this.yamlConstructors.get(null);
        }
        return construct;
    }

    protected Map<Object, Object> newMap(MappingNode mappingNode) {
        try {
            return (Map)this.newInstance(Map.class, (Node)mappingNode);
        }
        catch (InstantiationException instantiationException) {
            return this.createDefaultMap(mappingNode.getValue().size());
        }
    }

    protected Set<Object> newSet(CollectionNode<?> collectionNode) {
        try {
            return (Set)this.newInstance(Set.class, (Node)collectionNode);
        }
        catch (InstantiationException instantiationException) {
            return this.createDefaultSet(collectionNode.getValue().size());
        }
    }

    public Object getData() throws NoSuchElementException {
        if (!this.composer.checkNode()) {
            throw new NoSuchElementException("No document is available.");
        }
        Node node = this.composer.getNode();
        if (this.rootTag != null) {
            node.setTag(this.rootTag);
        }
        return this.constructDocument(node);
    }

    protected Object constructObjectNoCheck(Node node) {
        if (this.recursiveObjects.contains(node)) {
            throw new ConstructorException(null, null, "found unconstructable recursive node", node.getStartMark());
        }
        this.recursiveObjects.add(node);
        Construct construct = this.getConstructor(node);
        Object object = this.constructedObjects.containsKey(node) ? this.constructedObjects.get(node) : construct.construct(node);
        this.finalizeConstruction(node, object);
        this.constructedObjects.put(node, object);
        this.recursiveObjects.remove(node);
        if (node.isTwoStepsConstruction()) {
            construct.construct2ndStep(node, object);
        }
        return object;
    }

    protected Object finalizeConstruction(Node node, Object object) {
        Class clazz = node.getType();
        if (this.typeDefinitions.containsKey(clazz)) {
            return this.typeDefinitions.get(clazz).finalizeConstruction(object);
        }
        return object;
    }

    protected void constructMapping2ndStep(MappingNode mappingNode, Map<Object, Object> map) {
        List list = mappingNode.getValue();
        for (NodeTuple nodeTuple : list) {
            Node node = nodeTuple.getKeyNode();
            Node node2 = nodeTuple.getValueNode();
            Object object = this.constructObject(node);
            if (object != null) {
                try {
                    object.hashCode();
                }
                catch (Exception exception) {
                    throw new ConstructorException("while constructing a mapping", mappingNode.getStartMark(), "found unacceptable key " + object, nodeTuple.getKeyNode().getStartMark(), exception);
                }
            }
            Object object2 = this.constructObject(node2);
            if (node.isTwoStepsConstruction()) {
                if (this.loadingConfig.getAllowRecursiveKeys()) {
                    this.postponeMapFilling(map, object, object2);
                    continue;
                }
                throw new YAMLException("Recursive key for mapping is detected but it is not configured to be allowed.");
            }
            map.put(object, object2);
        }
    }

    protected void constructSet2ndStep(MappingNode mappingNode, Set<Object> set) {
        List list = mappingNode.getValue();
        for (NodeTuple nodeTuple : list) {
            Node node = nodeTuple.getKeyNode();
            Object object = this.constructObject(node);
            if (object != null) {
                try {
                    object.hashCode();
                }
                catch (Exception exception) {
                    throw new ConstructorException("while constructing a Set", mappingNode.getStartMark(), "found unacceptable key " + object, nodeTuple.getKeyNode().getStartMark(), exception);
                }
            }
            if (node.isTwoStepsConstruction()) {
                this.postponeSetFilling(set, object);
                continue;
            }
            set.add(object);
        }
    }

    protected void constructSequenceStep2(SequenceNode sequenceNode, Collection<Object> collection) {
        for (Node node : sequenceNode.getValue()) {
            collection.add(this.constructObject(node));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected Object constructArrayStep2(SequenceNode sequenceNode, Object object) {
        Class<?> clazz = sequenceNode.getType().getComponentType();
        int n = 0;
        for (Node node : sequenceNode.getValue()) {
            if (node.getType() == Object.class) {
                node.setType(clazz);
            }
            Object object2 = this.constructObject(node);
            if (clazz.isPrimitive()) {
                if (object2 == null) {
                    throw new NullPointerException("Unable to construct element value for " + node);
                }
                if (Byte.TYPE.equals(clazz)) {
                    Array.setByte(object, n, ((Number)object2).byteValue());
                } else if (Short.TYPE.equals(clazz)) {
                    Array.setShort(object, n, ((Number)object2).shortValue());
                } else if (Integer.TYPE.equals(clazz)) {
                    Array.setInt(object, n, ((Number)object2).intValue());
                } else if (Long.TYPE.equals(clazz)) {
                    Array.setLong(object, n, ((Number)object2).longValue());
                } else if (Float.TYPE.equals(clazz)) {
                    Array.setFloat(object, n, ((Number)object2).floatValue());
                } else if (Double.TYPE.equals(clazz)) {
                    Array.setDouble(object, n, ((Number)object2).doubleValue());
                } else if (Character.TYPE.equals(clazz)) {
                    Array.setChar(object, n, ((Character)object2).charValue());
                } else {
                    if (!Boolean.TYPE.equals(clazz)) throw new YAMLException("unexpected primitive type");
                    Array.setBoolean(object, n, (Boolean)object2);
                }
            } else {
                Array.set(object, n, object2);
            }
            ++n;
        }
        return object;
    }

    public Object getSingleData(Class<?> clazz) {
        Node node = this.composer.getSingleNode();
        if (node != null && !Tag.NULL.equals((Object)node.getTag())) {
            if (Object.class != clazz) {
                node.setTag(new Tag(clazz));
            } else if (this.rootTag != null) {
                node.setTag(this.rootTag);
            }
            return this.constructDocument(node);
        }
        Construct construct = this.yamlConstructors.get(Tag.NULL);
        return construct.construct(node);
    }

    public TypeDescription addTypeDescription(TypeDescription typeDescription) {
        if (typeDescription == null) {
            throw new NullPointerException("TypeDescription is required.");
        }
        Tag tag = typeDescription.getTag();
        this.typeTags.put(tag, typeDescription.getType());
        typeDescription.setPropertyUtils(this.getPropertyUtils());
        return this.typeDefinitions.put(typeDescription.getType(), typeDescription);
    }

    public final PropertyUtils getPropertyUtils() {
        if (this.propertyUtils == null) {
            this.propertyUtils = new PropertyUtils();
        }
        return this.propertyUtils;
    }

    public void setPropertyUtils(PropertyUtils propertyUtils) {
        this.propertyUtils = propertyUtils;
        this.explicitPropertyUtils = true;
        Collection<TypeDescription> collection = this.typeDefinitions.values();
        for (TypeDescription typeDescription : collection) {
            typeDescription.setPropertyUtils(propertyUtils);
        }
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    protected Map<Object, Object> constructMapping(MappingNode mappingNode) {
        Map<Object, Object> map = this.newMap(mappingNode);
        this.constructMapping2ndStep(mappingNode, map);
        return map;
    }

    private void fillRecursive() {
        if (!this.maps2fill.isEmpty()) {
            for (BaseConstructor$RecursiveTuple<Map<Object, Object>, BaseConstructor$RecursiveTuple<Object, Object>> baseConstructor$RecursiveTuple : this.maps2fill) {
                BaseConstructor$RecursiveTuple<Object, Object> baseConstructor$RecursiveTuple2 = baseConstructor$RecursiveTuple._2();
                baseConstructor$RecursiveTuple._1().put(baseConstructor$RecursiveTuple2._1(), baseConstructor$RecursiveTuple2._2());
            }
            this.maps2fill.clear();
        }
        if (!this.sets2fill.isEmpty()) {
            for (BaseConstructor$RecursiveTuple<Object, Object> baseConstructor$RecursiveTuple : this.sets2fill) {
                ((Set)baseConstructor$RecursiveTuple._1()).add(baseConstructor$RecursiveTuple._2());
            }
            this.sets2fill.clear();
        }
    }

    public String constructScalar(ScalarNode scalarNode) {
        return scalarNode.getValue();
    }

    protected Set<? extends Object> constructSet(SequenceNode sequenceNode) {
        Set<Object> set = this.newSet((CollectionNode<?>)sequenceNode);
        this.constructSequenceStep2(sequenceNode, set);
        return set;
    }

    protected Set<Object> constructSet(MappingNode mappingNode) {
        Set<Object> set = this.newSet((CollectionNode<?>)mappingNode);
        this.constructSet2ndStep(mappingNode, set);
        return set;
    }

    protected Map<Object, Object> createDefaultMap(int n) {
        return new LinkedHashMap<Object, Object>(n);
    }

    protected Object constructArray(SequenceNode sequenceNode) {
        return this.constructArrayStep2(sequenceNode, this.createArray(sequenceNode.getType(), sequenceNode.getValue().size()));
    }

    protected void postponeMapFilling(Map<Object, Object> map, Object object, Object object2) {
        this.maps2fill.add(0, new BaseConstructor$RecursiveTuple<Map<Object, Object>, BaseConstructor$RecursiveTuple<Object, Object>>(map, new BaseConstructor$RecursiveTuple<Object, Object>(object, object2)));
    }

    protected void postponeSetFilling(Set<Object> set, Object object) {
        this.sets2fill.add(0, new BaseConstructor$RecursiveTuple<Set<Object>, Object>(set, object));
    }

    protected Set<Object> createDefaultSet(int n) {
        return new LinkedHashSet<Object>(n);
    }

    protected Object createArray(Class<?> clazz, int n) {
        return Array.newInstance(clazz.getComponentType(), n);
    }

    protected Object constructObject(Node node) {
        if (this.constructedObjects.containsKey(node)) {
            return this.constructedObjects.get(node);
        }
        return this.constructObjectNoCheck(node);
    }

    protected final Object constructDocument(Node node) {
        try {
            Object object = this.constructObject(node);
            this.fillRecursive();
            Object object2 = object;
            return object2;
        }
        catch (RuntimeException runtimeException) {
            if (this.wrappedToRootException && !(runtimeException instanceof YAMLException)) {
                throw new YAMLException((Throwable)runtimeException);
            }
            throw runtimeException;
        }
        finally {
            this.constructedObjects.clear();
            this.recursiveObjects.clear();
        }
    }

    protected List<Object> createDefaultList(int n) {
        return new ArrayList<Object>(n);
    }

    public List<? extends Object> constructSequence(SequenceNode sequenceNode) {
        List<Object> list = this.newList(sequenceNode);
        this.constructSequenceStep2(sequenceNode, list);
        return list;
    }

    protected List<Object> newList(SequenceNode sequenceNode) {
        try {
            return (List)this.newInstance(List.class, (Node)sequenceNode);
        }
        catch (InstantiationException instantiationException) {
            return this.createDefaultList(sequenceNode.getValue().size());
        }
    }

    public boolean checkData() {
        return this.composer.checkNode();
    }

    public void setAllowDuplicateKeys(boolean bl) {
        this.allowDuplicateKeys = bl;
    }

    public boolean isAllowDuplicateKeys() {
        return this.allowDuplicateKeys;
    }

    public boolean isWrappedToRootException() {
        return this.wrappedToRootException;
    }

    public void setWrappedToRootException(boolean bl) {
        this.wrappedToRootException = bl;
    }

    public final boolean isExplicitPropertyUtils() {
        return this.explicitPropertyUtils;
    }
}


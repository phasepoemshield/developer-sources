/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.loader.impl.mapping;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class RuntimeMappingRegistry {
    private static final Map<MemberKey, String> FIELD_MAPPINGS = new HashMap<MemberKey, String>();
    private static final Map<MemberKey, String> METHOD_MAPPINGS = new HashMap<MemberKey, String>();
    private static final Map<ClassKey, String> CLASS_MAPPINGS = new HashMap<ClassKey, String>();
    private static final Set<String> NAMESPACES = new HashSet<String>();

    static synchronized Collection<String> getRegisteredNamespaces() {
        return Collections.unmodifiableSet(new HashSet<String>(NAMESPACES));
    }

    static synchronized String mapFieldName(String namespace, String owner, String name, String descriptor) {
        return RuntimeMappingRegistry.mapMemberName(FIELD_MAPPINGS, namespace, owner, name, descriptor);
    }

    static synchronized String mapClassName(String namespace, String className) {
        return CLASS_MAPPINGS.get(new ClassKey(namespace, className));
    }

    static synchronized String unmapClassName(String namespace, String runtimeClassName) {
        for (Map.Entry<ClassKey, String> entry : CLASS_MAPPINGS.entrySet()) {
            if (!entry.getKey().namespace.equals(namespace) || !entry.getValue().equals(runtimeClassName)) continue;
            return entry.getKey().className;
        }
        return null;
    }

    static synchronized String mapMethodName(String namespace, String owner, String name, String descriptor) {
        return RuntimeMappingRegistry.mapMemberName(METHOD_MAPPINGS, namespace, owner, name, descriptor);
    }

    private static void requireNonEmpty(String value, String name) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(name + " must not be empty");
        }
    }

    private RuntimeMappingRegistry() {
    }

    private static <K> void put(Map<K, String> mappings, K key, String runtimeName) {
        String previous = mappings.put(key, runtimeName);
        if (previous != null && !previous.equals(runtimeName)) {
            throw new IllegalStateException("Conflicting runtime mapping for " + key + ": " + previous + " != " + runtimeName);
        }
    }

    public static synchronized void registerClassMapping(String namespace, String className, String runtimeClassName) {
        RuntimeMappingRegistry.requireNonEmpty(namespace, "namespace");
        RuntimeMappingRegistry.requireNonEmpty(className, "className");
        RuntimeMappingRegistry.requireNonEmpty(runtimeClassName, "runtimeClassName");
        NAMESPACES.add(namespace);
        RuntimeMappingRegistry.put(CLASS_MAPPINGS, new ClassKey(namespace, className), runtimeClassName);
    }

    public static synchronized void registerMethodMapping(String namespace, String owner, String name, String descriptor, String runtimeName) {
        RuntimeMappingRegistry.registerMemberMapping(METHOD_MAPPINGS, namespace, owner, name, descriptor, runtimeName);
    }

    private static void registerMemberMapping(Map<MemberKey, String> mappings, String namespace, String owner, String name, String descriptor, String runtimeName) {
        RuntimeMappingRegistry.requireNonEmpty(namespace, "namespace");
        RuntimeMappingRegistry.requireNonEmpty(owner, "owner");
        RuntimeMappingRegistry.requireNonEmpty(name, "name");
        RuntimeMappingRegistry.requireNonEmpty(runtimeName, "runtimeName");
        NAMESPACES.add(namespace);
        RuntimeMappingRegistry.put(mappings, new MemberKey(namespace, owner, name, descriptor), runtimeName);
        if (descriptor != null) {
            RuntimeMappingRegistry.put(mappings, new MemberKey(namespace, owner, name, null), runtimeName);
        }
    }

    public static synchronized void registerFieldMapping(String namespace, String owner, String name, String descriptor, String runtimeName) {
        RuntimeMappingRegistry.registerMemberMapping(FIELD_MAPPINGS, namespace, owner, name, descriptor, runtimeName);
    }

    private static String mapMemberName(Map<MemberKey, String> mappings, String namespace, String owner, String name, String descriptor) {
        String mapped = mappings.get(new MemberKey(namespace, owner, name, descriptor));
        if (mapped == null && descriptor != null) {
            mapped = mappings.get(new MemberKey(namespace, owner, name, null));
        }
        return mapped;
    }

    private static final class ClassKey {
        private final String namespace;
        private final String className;

        private ClassKey(String namespace, String className) {
            this.namespace = namespace;
            this.className = className;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassKey)) {
                return false;
            }
            ClassKey other = (ClassKey)obj;
            return this.namespace.equals(other.namespace) && this.className.equals(other.className);
        }

        public String toString() {
            return this.namespace + ":" + this.className;
        }

        public int hashCode() {
            int result = this.namespace.hashCode();
            result = 31 * result + this.className.hashCode();
            return result;
        }
    }

    private static final class MemberKey {
        private final String namespace;
        private final String owner;
        private final String name;
        private final String descriptor;

        private MemberKey(String namespace, String owner, String name, String descriptor) {
            this.namespace = namespace;
            this.owner = owner;
            this.name = name;
            this.descriptor = descriptor;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MemberKey)) {
                return false;
            }
            MemberKey other = (MemberKey)obj;
            return this.namespace.equals(other.namespace) && this.owner.equals(other.owner) && this.name.equals(other.name) && (this.descriptor == null ? other.descriptor == null : this.descriptor.equals(other.descriptor));
        }

        public String toString() {
            return this.namespace + ":" + this.owner + "." + this.name + (this.descriptor != null ? this.descriptor : "");
        }

        public int hashCode() {
            int result = this.namespace.hashCode();
            result = 31 * result + this.owner.hashCode();
            result = 31 * result + this.name.hashCode();
            result = 31 * result + (this.descriptor != null ? this.descriptor.hashCode() : 0);
            return result;
        }
    }
}


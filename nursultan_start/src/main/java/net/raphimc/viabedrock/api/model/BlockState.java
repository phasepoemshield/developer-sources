/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.api.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class BlockState {
    private final String namespace;
    private final String identifier;
    private final Map<String, String> properties;

    public String namespace() {
        return this.namespace;
    }

    public boolean hasProperty(String key, String value) {
        return this.properties.containsKey(key) && this.properties.get(key).equals(value);
    }

    public static BlockState fromString(String string) {
        String identifier;
        String namespace = "minecraft";
        String propertiesString = null;
        if (string.contains("[") && string.endsWith("]")) {
            String[] split = string.split("\\[", 2);
            identifier = split[0];
            propertiesString = split[1].substring(0, split[1].length() - 1);
        } else {
            identifier = string;
        }
        if (identifier.contains(":")) {
            String[] namespaceAndIdentifier = identifier.split(":", 2);
            namespace = namespaceAndIdentifier[0];
            identifier = namespaceAndIdentifier[1];
        }
        if (propertiesString != null) {
            HashMap<String, String> properties = new HashMap<String, String>();
            String[] propertiesSplit = propertiesString.contains(",") ? propertiesString.split(",") : (!propertiesString.isEmpty() ? new String[]{propertiesString} : new String[]{});
            for (String property : propertiesSplit) {
                String[] split = property.split("=", 2);
                properties.put(split[0], split[1]);
            }
            return new BlockState(namespace, identifier, properties);
        }
        return new BlockState(namespace, identifier, Collections.emptyMap());
    }

    public BlockState(String namespace, String identifier, Map<String, String> properties) {
        if (namespace == null || identifier == null) {
            throw new IllegalArgumentException("BlockState namespace or identifier was null: " + namespace + ":" + identifier);
        }
        this.namespace = namespace;
        this.identifier = identifier.toLowerCase(Locale.ROOT);
        this.properties = Collections.unmodifiableMap(properties);
    }

    public BlockState(String identifier, Map<String, String> properties) {
        this("minecraft", identifier, properties);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockState)) {
            return false;
        }
        BlockState that = (BlockState)o;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.identifier, that.identifier) && Objects.equals(this.properties, that.properties);
    }

    public String toString() {
        return "BlockState{namespace='" + this.namespace + "', identifier='" + this.identifier + "', properties=" + String.valueOf(this.properties) + "}";
    }

    public int hashCode() {
        return Objects.hash(this.namespace, this.identifier, this.properties);
    }

    public Map<String, String> properties() {
        return this.properties;
    }

    public String identifier() {
        return this.identifier;
    }

    public BlockState withProperties(Map<String, String> properties) {
        HashMap<String, String> newProperties = new HashMap<String, String>(this.properties);
        newProperties.putAll(properties);
        return new BlockState(this.namespace, this.identifier, newProperties);
    }

    public String namespacedIdentifier() {
        return this.namespace + ":" + this.identifier;
    }

    public String toBlockStateString(boolean sorted) {
        StringBuilder builder = new StringBuilder();
        builder.append(this.namespace).append(":").append(this.identifier);
        if (!this.properties.isEmpty()) {
            builder.append("[");
            boolean first = true;
            for (Map.Entry<Object, Object> entry : (sorted ? new TreeMap<String, String>(this.properties) : this.properties).entrySet()) {
                if (!first) {
                    builder.append(",");
                }
                builder.append((String)entry.getKey()).append("=").append((String)entry.getValue());
                first = false;
            }
            builder.append("]");
        }
        return builder.toString();
    }

    public String toBlockStateString() {
        return this.toBlockStateString(false);
    }

    public BlockState replaceProperties(Map<String, String> properties) {
        HashMap<String, String> newProperties = new HashMap<String, String>(this.properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            if (!newProperties.containsKey(entry.getKey())) continue;
            newProperties.put(entry.getKey(), entry.getValue());
        }
        return new BlockState(this.namespace, this.identifier, newProperties);
    }

    public BlockState withoutProperties(String ... keys) {
        HashMap<String, String> newProperties = new HashMap<String, String>(this.properties);
        for (String key : keys) {
            newProperties.remove(key);
        }
        return new BlockState(this.namespace, this.identifier, newProperties);
    }

    public BlockState withProperty(String key, String value) {
        HashMap<String, String> newProperties = new HashMap<String, String>(this.properties);
        newProperties.put(key, value);
        return new BlockState(this.namespace, this.identifier, newProperties);
    }

    public BlockState replaceProperty(String key, String value) {
        if (!this.properties.containsKey(key)) {
            return this;
        }
        return this.withProperty(key, value);
    }

    public BlockState withNamespace(String namespace) {
        return new BlockState(namespace, this.identifier, this.properties);
    }

    public BlockState withIdentifier(String identifier) {
        return new BlockState(this.namespace, identifier, this.properties);
    }

    public BlockState withNamespacedIdentifier(String namespacedIdentifier) {
        if (namespacedIdentifier.contains(":")) {
            String[] namespaceAndIdentifier = namespacedIdentifier.split(":", 2);
            return new BlockState(namespaceAndIdentifier[0], namespaceAndIdentifier[1], this.properties);
        }
        return new BlockState(this.namespace, namespacedIdentifier, this.properties);
    }
}


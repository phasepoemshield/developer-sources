/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.util;

import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ConfigSection {
    protected final Config root;
    protected final String path;
    protected Map<String, Object> values;

    public @Nullable String getString(String key, @Nullable String def) {
        String s;
        Object object = this.values.get(key);
        return object instanceof String ? (s = (String)object) : def;
    }

    protected Logger logger() {
        return this.root().logger();
    }

    ConfigSection(Config root, String path) {
        this(root, path, new HashMap<String, Object>());
    }

    ConfigSection(Config root, String path, Map<String, Object> values) {
        this.root = root;
        this.path = path;
        this.values = values;
    }

    public <T> @Nullable T get(String key, @Nullable T def) {
        String[] parts = key.split("\\.");
        ConfigSection section = this;
        for (int i = 0; i < parts.length - 1; ++i) {
            if ((section = section.getSection(parts[i])) != null) continue;
            return def;
        }
        String valueKey = parts[parts.length - 1];
        Object o = section.values.get(valueKey);
        return (T)(o != null ? o : def);
    }

    public <T> @Nullable T get(String key) {
        return this.get(key, null);
    }

    public boolean getBoolean(String key, boolean def) {
        Object o = this.values.get(key);
        return o instanceof Boolean ? (Boolean)o : def;
    }

    public int getInt(String key, int def) {
        int n;
        Object object = this.values.get(key);
        if (object instanceof Number) {
            Number num = (Number)object;
            n = num.intValue();
        } else {
            n = def;
        }
        return n;
    }

    public double getDouble(String key, double def) {
        double d;
        Object object = this.values.get(key);
        if (object instanceof Number) {
            Number num = (Number)object;
            d = num.doubleValue();
        } else {
            d = def;
        }
        return d;
    }

    public boolean contains(String key) {
        return this.get(key) != null;
    }

    public void set(String path, Object value) {
        this.values.put(path, value);
    }

    public Config root() {
        return this.root;
    }

    public <T> List<T> getListSafe(String key, Class<T> type, String invalidValueMessage) {
        Object o = this.values.get(key);
        if (o instanceof List) {
            List list = (List)o;
            ArrayList<T> filteredValues = new ArrayList<T>(list.size());
            for (Object o1 : list) {
                if (type.isInstance(o1)) {
                    filteredValues.add(type.cast(o1));
                    continue;
                }
                if (invalidValueMessage == null) continue;
                this.logger().warning(String.format(invalidValueMessage, o1));
            }
            return filteredValues;
        }
        return new ArrayList();
    }

    private String fullKeyInPath(String key) {
        return this.path.isEmpty() ? key : this.path + "." + key;
    }

    public List<Integer> getIntegerList(String key) {
        Object o = this.values.get(key);
        return o != null ? (List)o : new ArrayList();
    }

    public List<String> getStringList(String key) {
        Object o = this.values.get(key);
        return o != null ? (List)o : new ArrayList();
    }

    public @Nullable ConfigSection getSection(String key) {
        Object o = this.get(key);
        return o instanceof Map ? new ConfigSection(this.root(), this.fullKeyInPath(key), (Map)o) : null;
    }

    public Map<String, Object> getValues() {
        return this.values;
    }

    public @Nullable JsonElement getSerializedComponent(String key) {
        Object o = this.values.get(key);
        if (o != null && !((String)o).isEmpty()) {
            return ComponentUtil.legacyToJson((String)o);
        }
        return null;
    }
}


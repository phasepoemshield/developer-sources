/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Keys;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Keys$Key;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Toml$Entry;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.TomlParser;

public class Toml {
    private static final Gson DEFAULT_GSON = new Gson();
    private Map<String, Object> values = new HashMap<String, Object>();
    private final Toml defaults;

    public String getString(String string, String string2) {
        String string3 = this.getString(string);
        return string3 == null ? string2 : string3;
    }

    public String getString(String string) {
        return (String)this.get(string);
    }

    public Date getDate(String string, Date date) {
        Date date2 = this.getDate(string);
        return date2 == null ? date : date2;
    }

    public Date getDate(String string) {
        return (Date)this.get(string);
    }

    public Toml() {
        this(null);
    }

    private Toml(Toml toml, Map<String, Object> map) {
        this.values = map;
        this.defaults = toml;
    }

    public Toml(Toml toml) {
        this(toml, new HashMap<String, Object>());
    }

    private Object get(String string) {
        Keys$Key[] keys$KeyArray;
        if (this.values.containsKey(string)) {
            return this.values.get(string);
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>(this.values);
        for (Keys$Key keys$Key : keys$KeyArray = Keys.split(string)) {
            if (keys$Key.index == -1 && hashMap instanceof Map && ((Map)hashMap).containsKey(keys$Key.path)) {
                return ((Map)hashMap).get(keys$Key.path);
            }
            hashMap = ((Map)hashMap).get(keys$Key.name);
            if (keys$Key.index > -1 && hashMap != null) {
                if (keys$Key.index >= ((List)((Object)hashMap)).size()) {
                    return null;
                }
                hashMap = ((List)((Object)hashMap)).get(keys$Key.index);
            }
            if (hashMap != null) continue;
            return this.defaults != null ? this.defaults.get(string) : null;
        }
        return hashMap;
    }

    public Boolean getBoolean(String string, Boolean bl) {
        Boolean bl2 = this.getBoolean(string);
        return bl2 == null ? bl : bl2;
    }

    public Boolean getBoolean(String string) {
        return (Boolean)this.get(string);
    }

    public Long getLong(String string, Long l) {
        Long l2 = this.getLong(string);
        return l2 == null ? l : l2;
    }

    public Long getLong(String string) {
        return (Long)this.get(string);
    }

    public Double getDouble(String string, Double d) {
        Double d2 = this.getDouble(string);
        return d2 == null ? d : d2;
    }

    public Double getDouble(String string) {
        return (Double)this.get(string);
    }

    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public boolean contains(String string) {
        return this.get(string) != null;
    }

    public <T> T to(Class<T> clazz) {
        JsonElement jsonElement = DEFAULT_GSON.toJsonTree(this.toMap());
        if (clazz == JsonElement.class) {
            return clazz.cast(jsonElement);
        }
        return (T)DEFAULT_GSON.fromJson(jsonElement, clazz);
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        LinkedHashSet<Map.Entry<String, Object>> linkedHashSet = new LinkedHashSet<Map.Entry<String, Object>>();
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Class<?> clazz = entry.getValue().getClass();
            if (Map.class.isAssignableFrom(clazz)) {
                linkedHashSet.add(new Toml$Entry(this, entry.getKey(), this.getTable(entry.getKey()), null));
                continue;
            }
            if (List.class.isAssignableFrom(clazz)) {
                List list = (List)entry.getValue();
                if (!list.isEmpty() && list.get(0) instanceof Map) {
                    linkedHashSet.add(new Toml$Entry(this, entry.getKey(), this.getTables(entry.getKey()), null));
                    continue;
                }
                linkedHashSet.add(new Toml$Entry(this, entry.getKey(), list, null));
                continue;
            }
            linkedHashSet.add(new Toml$Entry(this, entry.getKey(), entry.getValue(), null));
        }
        return linkedHashSet;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>(this.values);
        if (this.defaults != null) {
            for (Map.Entry<String, Object> entry : this.defaults.values.entrySet()) {
                if (hashMap.containsKey(entry.getKey())) continue;
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public Toml read(File file) {
        try {
            return this.read(new InputStreamReader((InputStream)new FileInputStream(file), "UTF8"));
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public Toml read(Reader reader) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(reader);
            StringBuilder stringBuilder = new StringBuilder();
            String string = bufferedReader.readLine();
            while (string != null) {
                stringBuilder.append(string).append('\n');
                string = bufferedReader.readLine();
            }
            this.read(stringBuilder.toString());
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        finally {
            try {
                bufferedReader.close();
            }
            catch (IOException iOException) {}
        }
        return this;
    }

    public Toml read(Toml toml) {
        this.values = toml.values;
        return this;
    }

    public Toml read(String string) throws IllegalStateException {
        Results results = TomlParser.run(string);
        if (results.errors.hasErrors()) {
            throw new IllegalStateException(results.errors.toString());
        }
        this.values = results.consume();
        return this;
    }

    public Toml read(InputStream inputStream) {
        return this.read(new InputStreamReader(inputStream));
    }

    public Toml getTable(String string) {
        Map map = (Map)this.get(string);
        return map != null ? new Toml(null, map) : null;
    }

    public <T> List<T> getList(String string) {
        List list = (List)this.get(string);
        return list;
    }

    public <T> List<T> getList(String string, List<T> list) {
        List<T> list2 = this.getList(string);
        return list2 != null ? list2 : list;
    }

    public List<Toml> getTables(String string) {
        List list = (List)this.get(string);
        if (list == null) {
            return null;
        }
        ArrayList<Toml> arrayList = new ArrayList<Toml>();
        for (Map map : list) {
            arrayList.add(new Toml(null, map));
        }
        return arrayList;
    }

    public boolean containsTable(String string) {
        Object object = this.get(string);
        return object != null && object instanceof Map;
    }

    public boolean containsPrimitive(String string) {
        Object object = this.get(string);
        return object != null && !(object instanceof Map) && !(object instanceof List);
    }

    public boolean containsTableArray(String string) {
        Object object = this.get(string);
        return object != null && object instanceof List;
    }
}


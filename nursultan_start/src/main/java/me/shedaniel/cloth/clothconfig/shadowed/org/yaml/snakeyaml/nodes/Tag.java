/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.UriEncoder
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.UriEncoder;

public final class Tag {
    public static final String PREFIX = "tag:yaml.org,2002:";
    public static final Tag YAML = new Tag("tag:yaml.org,2002:yaml");
    public static final Tag MERGE = new Tag("tag:yaml.org,2002:merge");
    public static final Tag SET = new Tag("tag:yaml.org,2002:set");
    public static final Tag PAIRS = new Tag("tag:yaml.org,2002:pairs");
    public static final Tag OMAP = new Tag("tag:yaml.org,2002:omap");
    public static final Tag BINARY = new Tag("tag:yaml.org,2002:binary");
    public static final Tag INT = new Tag("tag:yaml.org,2002:int");
    public static final Tag FLOAT = new Tag("tag:yaml.org,2002:float");
    public static final Tag TIMESTAMP = new Tag("tag:yaml.org,2002:timestamp");
    public static final Tag BOOL = new Tag("tag:yaml.org,2002:bool");
    public static final Tag NULL = new Tag("tag:yaml.org,2002:null");
    public static final Tag STR = new Tag("tag:yaml.org,2002:str");
    public static final Tag SEQ = new Tag("tag:yaml.org,2002:seq");
    public static final Tag MAP = new Tag("tag:yaml.org,2002:map");
    protected static final Map<Tag, Set<Class<?>>> COMPATIBILITY_MAP = new HashMap();
    private final String value;
    private boolean secondary = false;

    public String getClassName() {
        if (!this.value.startsWith(PREFIX)) {
            throw new YAMLException("Invalid tag: " + this.value);
        }
        return UriEncoder.decode((String)this.value.substring(PREFIX.length()));
    }

    public Tag(String string) {
        if (string == null) {
            throw new NullPointerException("Tag must be provided.");
        }
        if (string.length() == 0) {
            throw new IllegalArgumentException("Tag must not be empty.");
        }
        if (string.trim().length() != string.length()) {
            throw new IllegalArgumentException("Tag must not contain leading or trailing spaces.");
        }
        this.value = UriEncoder.encode((String)string);
        this.secondary = !string.startsWith(PREFIX);
    }

    public Tag(URI uRI) {
        if (uRI == null) {
            throw new NullPointerException("URI for tag must be provided.");
        }
        this.value = uRI.toASCIIString();
    }

    public Tag(Class<? extends Object> clazz) {
        if (clazz == null) {
            throw new NullPointerException("Class for tag must be provided.");
        }
        this.value = PREFIX + UriEncoder.encode((String)clazz.getName());
    }

    static {
        HashSet<Class<BigDecimal>> hashSet = new HashSet<Class<BigDecimal>>();
        hashSet.add(Double.class);
        hashSet.add(Float.class);
        hashSet.add(BigDecimal.class);
        COMPATIBILITY_MAP.put(FLOAT, hashSet);
        HashSet<Class<BigInteger>> hashSet2 = new HashSet<Class<BigInteger>>();
        hashSet2.add(Integer.class);
        hashSet2.add(Long.class);
        hashSet2.add(BigInteger.class);
        COMPATIBILITY_MAP.put(INT, hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(Date.class);
        try {
            hashSet3.add(Class.forName("java.sql.Date"));
            hashSet3.add(Class.forName("java.sql.Timestamp"));
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        COMPATIBILITY_MAP.put(TIMESTAMP, hashSet3);
    }

    public boolean equals(Object object) {
        if (object instanceof Tag) {
            return this.value.equals(((Tag)object).getValue());
        }
        return false;
    }

    public String toString() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String getValue() {
        return this.value;
    }

    public boolean startsWith(String string) {
        return this.value.startsWith(string);
    }

    public boolean matches(Class<? extends Object> clazz) {
        return this.value.equals(PREFIX + clazz.getName());
    }

    public boolean isCompatible(Class<?> clazz) {
        Set<Class<?>> set = COMPATIBILITY_MAP.get(this);
        if (set != null) {
            return set.contains(clazz);
        }
        return false;
    }

    public boolean isSecondary() {
        return this.secondary;
    }
}


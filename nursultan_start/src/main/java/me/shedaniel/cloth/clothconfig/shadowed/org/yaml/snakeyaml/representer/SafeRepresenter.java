/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$NonPrintableStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.BaseRepresenter
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentArray
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentBoolean
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentByteArray
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentDate
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentEnum
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.BaseRepresenter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentIterator;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentList;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentMap;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNull;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNumber;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentPrimitiveArray;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentSet;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentString;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter$RepresentUuid;

class SafeRepresenter
extends BaseRepresenter {
    protected Map<Class<? extends Object>, Tag> classTags;
    protected TimeZone timeZone = null;
    protected DumperOptions.NonPrintableStyle nonPrintableStyle;
    private static final Pattern MULTILINE_PATTERN = Pattern.compile("\n|\u0085|\u2028|\u2029");

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    static /* synthetic */ Pattern access$000() {
        return MULTILINE_PATTERN;
    }

    public SafeRepresenter() {
        this(new DumperOptions());
    }

    public SafeRepresenter(DumperOptions dumperOptions) {
        this.nullRepresenter = new SafeRepresenter$RepresentNull(this);
        this.representers.put(String.class, new SafeRepresenter$RepresentString(this));
        this.representers.put(Boolean.class, new RepresentBoolean(this));
        this.representers.put(Character.class, new SafeRepresenter$RepresentString(this));
        this.representers.put(UUID.class, new SafeRepresenter$RepresentUuid(this));
        this.representers.put(byte[].class, new RepresentByteArray(this));
        SafeRepresenter$RepresentPrimitiveArray safeRepresenter$RepresentPrimitiveArray = new SafeRepresenter$RepresentPrimitiveArray(this);
        this.representers.put(short[].class, safeRepresenter$RepresentPrimitiveArray);
        this.representers.put(int[].class, safeRepresenter$RepresentPrimitiveArray);
        this.representers.put(long[].class, safeRepresenter$RepresentPrimitiveArray);
        this.representers.put(float[].class, safeRepresenter$RepresentPrimitiveArray);
        this.representers.put(double[].class, safeRepresenter$RepresentPrimitiveArray);
        this.representers.put(char[].class, safeRepresenter$RepresentPrimitiveArray);
        this.representers.put(boolean[].class, safeRepresenter$RepresentPrimitiveArray);
        this.multiRepresenters.put(Number.class, new SafeRepresenter$RepresentNumber(this));
        this.multiRepresenters.put(List.class, new SafeRepresenter$RepresentList(this));
        this.multiRepresenters.put(Map.class, new SafeRepresenter$RepresentMap(this));
        this.multiRepresenters.put(Set.class, new SafeRepresenter$RepresentSet(this));
        this.multiRepresenters.put(Iterator.class, new SafeRepresenter$RepresentIterator(this));
        this.multiRepresenters.put(new Object[0].getClass(), new RepresentArray(this));
        this.multiRepresenters.put(Date.class, new RepresentDate(this));
        this.multiRepresenters.put(Enum.class, new RepresentEnum(this));
        this.multiRepresenters.put(Calendar.class, new RepresentDate(this));
        this.classTags = new HashMap<Class<? extends Object>, Tag>();
        this.nonPrintableStyle = dumperOptions.getNonPrintableStyle();
    }

    protected Tag getTag(Class<?> clazz, Tag tag) {
        if (this.classTags.containsKey(clazz)) {
            return this.classTags.get(clazz);
        }
        return tag;
    }

    public Tag addClassTag(Class<? extends Object> clazz, Tag tag) {
        if (tag == null) {
            throw new NullPointerException("Tag must be provided.");
        }
        return this.classTags.put(clazz, tag);
    }
}


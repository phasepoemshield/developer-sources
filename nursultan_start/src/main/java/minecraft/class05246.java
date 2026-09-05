/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class01219
 *  minecraft.class05031
 *  minecraft.class05033
 *  minecraft.class07830
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import minecraft.class01219;
import minecraft.class05031;
import minecraft.class05033;
import minecraft.class05239;
import minecraft.class07830;

public final class class05246
extends Enum<class05246>
implements class05033 {
    public static final /* enum */ class05246 field_16686 = new class05246("terrain_matching", (ImmutableList<class01219>)ImmutableList.of((Object)((Object)new class05239(class07830.field_13194, -1))));
    public static final /* enum */ class05246 field_16687 = new class05246("rigid", (ImmutableList<class01219>)ImmutableList.of());
    public static final class05031<class05246> field_24956;
    private final String field_16682;
    private final ImmutableList<class01219> field_16685;
    private static final /* synthetic */ class05246[] field_16683;

    private static /* synthetic */ class05246[] L() {
        return new class05246[]{field_16686, field_16687};
    }

    private class05246(String string2, ImmutableList<class01219> immutableList) {
        this.field_16682 = string2;
        this.field_16685 = immutableList;
    }

    public static class05246[] values() {
        return (class05246[])field_16683.clone();
    }

    public static class05246 valueOf(String string) {
        return Enum.valueOf(class05246.class, string);
    }

    public ImmutableList<class01219> y() {
        return this.field_16685;
    }

    public static class05246 N(String string) {
        return (class05246)field_24956.N(string);
    }

    public String N() {
        return this.field_16682;
    }

    public String method_15434() {
        return this.field_16682;
    }

    static {
        field_16683 = class05246.L();
        field_24956 = class05033.N(class05246::values);
    }
}


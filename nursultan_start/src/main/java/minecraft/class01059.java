/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class03652
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class01066;
import minecraft.class01071;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class03652;

final class class01059
extends Record {
    final class01894 fileLocation;
    private final class01894 metadataLocation;
    final List<class01071> fileSources;
    final Map<class01622, class03652<InputStream>> metaSources;

    public List<class01071> L() {
        return this.fileSources;
    }

    class01059(class01894 class018942) {
        this(class018942, class01066.y(class018942), new ArrayList<class01071>(), (Map<class01622, class03652<InputStream>>)new Object2ObjectArrayMap());
    }

    private class01059(class01894 class018942, class01894 class018943, List<class01071> list, Map<class01622, class03652<InputStream>> map) {
        this.fileLocation = class018942;
        this.metadataLocation = class018943;
        this.fileSources = list;
        this.metaSources = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01059.class, "fileLocation;metadataLocation;fileSources;metaSources", "fileLocation", "metadataLocation", "fileSources", "metaSources"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01059.class, "fileLocation;metadataLocation;fileSources;metaSources", "fileLocation", "metadataLocation", "fileSources", "metaSources"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01059.class, "fileLocation;metadataLocation;fileSources;metaSources", "fileLocation", "metadataLocation", "fileSources", "metaSources"}, this);
    }

    public Map<class01622, class03652<InputStream>> u() {
        return this.metaSources;
    }

    public class01894 y() {
        return this.metadataLocation;
    }

    public class01894 N() {
        return this.fileLocation;
    }
}


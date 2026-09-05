/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.materialmap.BlockEntry;

class IdMap$DuplicateTracker {
    private final Map<String, String> identifierToKeyMap = new HashMap<String, String>();
    private final Set<String> reportedDuplicates = new HashSet<String>();
    private final Map<String, Integer> duplicateCounts = new HashMap<String, Integer>();
    private final String fileName;
    private final String itemType;
    private final boolean debugEnabled;

    public IdMap$DuplicateTracker(String string, String string2) {
        this.fileName = string;
        this.itemType = string2;
        this.debugEnabled = Iris.getIrisConfig().areDebugOptionsEnabled();
    }

    public void reportSummary() {
        if (this.debugEnabled && !this.duplicateCounts.isEmpty()) {
            int n = this.duplicateCounts.values().stream().mapToInt(Integer::intValue).sum();
            Iris.logger.warn("Found {} duplicate {} in {}.", new Object[]{n, this.itemType + (n > 1 ? "s" : ""), this.fileName});
        }
    }

    public void checkAndRecord(String string, String string2, String string3) {
        if (this.identifierToKeyMap.containsKey(string)) {
            String string4 = this.identifierToKeyMap.get(string);
            String string5 = string + "|" + string4 + "|" + string2;
            this.duplicateCounts.put(string5, this.duplicateCounts.getOrDefault(string5, 0) + 1);
            if (this.debugEnabled && !this.reportedDuplicates.contains(string5)) {
                Iris.logger.warn("Duplicate {} in {}: '{}' in '{}' and '{}'", new Object[]{this.itemType, this.fileName, string3, string4, string2});
                this.reportedDuplicates.add(string5);
            } else {
                this.reportedDuplicates.add(string5);
            }
        }
        this.identifierToKeyMap.put(string, string2);
    }

    public static String getUniqueBlockIdentifier(BlockEntry blockEntry) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(blockEntry.id().toString());
        Map<String, String> map = blockEntry.propertyPredicates();
        if (map != null && !map.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<String>(map.keySet());
            Collections.sort(arrayList);
            for (String string : arrayList) {
                stringBuilder.append(':').append(string).append('=').append(map.get(string));
            }
        }
        return stringBuilder.toString();
    }
}


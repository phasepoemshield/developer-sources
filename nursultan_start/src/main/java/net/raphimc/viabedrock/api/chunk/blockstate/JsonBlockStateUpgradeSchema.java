/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.util.Pair
 *  net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgradeSchema
 *  net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgradeSchema$StopUpgrade
 */
package net.raphimc.viabedrock.api.chunk.blockstate;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgradeSchema;
import net.raphimc.viabedrock.api.util.NbtUtil;

public class JsonBlockStateUpgradeSchema
extends BlockStateUpgradeSchema {
    private static final String NEW_NAME_KEY = "viabedrock:newname_" + String.valueOf(UUID.randomUUID());

    public JsonBlockStateUpgradeSchema(JsonObject jsonObject) {
        super(jsonObject.get("maxVersionMajor").getAsInt(), jsonObject.get("maxVersionMinor").getAsInt(), jsonObject.get("maxVersionPatch").getAsInt(), jsonObject.get("maxVersionRevision").getAsInt());
        Cloneable mappings;
        String identifier;
        HashMap remappedPropertyValuesLookup = new HashMap();
        if (jsonObject.has("remappedPropertyValuesIndex")) {
            JsonObject remappedPropertyValuesIndex = jsonObject.get("remappedPropertyValuesIndex").getAsJsonObject();
            for (Object entry : remappedPropertyValuesIndex.entrySet()) {
                ArrayList<Pair> mappings2 = new ArrayList<Pair>();
                for (Object element : ((JsonElement)entry.getValue()).getAsJsonArray()) {
                    JsonObject mapping = element.getAsJsonObject();
                    mappings2.add(new Pair(this.getValue(mapping.get("old").getAsJsonObject()), this.getValue(mapping.get("new").getAsJsonObject())));
                }
                remappedPropertyValuesLookup.put((String)entry.getKey(), mappings2);
            }
        }
        if (jsonObject.has("remappedStates")) {
            JsonObject remappedStates = jsonObject.get("remappedStates").getAsJsonObject();
            for (Object entry : remappedStates.entrySet()) {
                identifier = ((String)entry.getKey()).toLowerCase(Locale.ROOT);
                mappings = new ArrayList();
                for (Object mappingEntry : ((JsonElement)entry.getValue()).getAsJsonArray()) {
                    JsonObject mappingObject = mappingEntry.getAsJsonObject();
                    CompoundTag oldStateTag = new CompoundTag();
                    if (mappingObject.get("oldState").isJsonObject()) {
                        for (Object property : mappingObject.get("oldState").getAsJsonObject().entrySet()) {
                            oldStateTag.put((String)property.getKey(), NbtUtil.createTag(this.getValue(((JsonElement)property.getValue()).getAsJsonObject())));
                        }
                    }
                    CompoundTag newStateTag = new CompoundTag();
                    if (mappingObject.get("newState").isJsonObject()) {
                        Object property;
                        property = mappingObject.get("newState").getAsJsonObject().entrySet().iterator();
                        while (property.hasNext()) {
                            Map.Entry property2 = (Map.Entry)property.next();
                            newStateTag.put((String)property2.getKey(), NbtUtil.createTag(this.getValue(((JsonElement)property2.getValue()).getAsJsonObject())));
                        }
                    }
                    ArrayList<String> copiedStates = new ArrayList<String>();
                    if (mappingObject.has("copiedState")) {
                        for (JsonElement property : mappingObject.get("copiedState").getAsJsonArray()) {
                            copiedStates.add(property.getAsString());
                        }
                    }
                    if (mappingObject.has("newName")) {
                        String newName = mappingObject.get("newName").getAsString();
                        mappings.add(new RemappedStatesEntry(oldStateTag, newStateTag, copiedStates, states -> newName.toLowerCase(Locale.ROOT)));
                        continue;
                    }
                    if (mappingObject.has("newFlattenedName")) {
                        JsonObject newFlattenedName = mappingObject.get("newFlattenedName").getAsJsonObject();
                        String prefix = newFlattenedName.get("prefix").getAsString();
                        String flattenedProperty = newFlattenedName.get("flattenedProperty").getAsString();
                        String suffix = newFlattenedName.get("suffix").getAsString();
                        JsonObject flattenedValueRemapsObject = newFlattenedName.getAsJsonObject("flattenedValueRemaps");
                        HashMap<String, String> flattenedValueRemaps = new HashMap<String, String>();
                        if (flattenedValueRemapsObject != null) {
                            for (Map.Entry remap : flattenedValueRemapsObject.entrySet()) {
                                flattenedValueRemaps.put((String)remap.getKey(), ((JsonElement)remap.getValue()).getAsString());
                            }
                        }
                        mappings.add(new RemappedStatesEntry(oldStateTag, newStateTag, copiedStates, states -> {
                            if (!states.contains(flattenedProperty)) {
                                return null;
                            }
                            String flattenedValue = states.get(flattenedProperty).getValue().toString();
                            String flattenedName = prefix + flattenedValueRemaps.getOrDefault(flattenedValue, flattenedValue) + suffix;
                            return flattenedName.toLowerCase(Locale.ROOT);
                        }));
                        continue;
                    }
                    throw new IllegalArgumentException("No new name or flattened name specified for " + identifier);
                }
                this.actions.add(tag -> {
                    String name = tag.getStringTag("name").getValue();
                    if (!name.equals(identifier)) {
                        return;
                    }
                    Tag patt6748$temp = tag.get("states");
                    if (patt6748$temp instanceof CompoundTag) {
                        CompoundTag states = (CompoundTag)patt6748$temp;
                        for (RemappedStatesEntry mapping : mappings) {
                            boolean matches = true;
                            if (mapping.oldStateTag != null) {
                                for (Object stateTag : mapping.oldStateTag.entrySet()) {
                                    if (((Tag)stateTag.getValue()).equals(states.get((String)stateTag.getKey()))) continue;
                                    matches = false;
                                    break;
                                }
                            }
                            if (!matches) continue;
                            CompoundTag newStates = mapping.newStateTag.copy();
                            for (String property : mapping.copiedStates) {
                                if (!states.contains(property)) continue;
                                newStates.put(property, states.get(property));
                            }
                            String newName = mapping.nameFunction.apply(states);
                            if (newName != null) {
                                tag.putString("name", newName);
                            }
                            tag.put("states", (Tag)newStates);
                            throw BlockStateUpgradeSchema.StopUpgrade.INSTANCE;
                        }
                    }
                });
            }
        }
        if (jsonObject.has("renamedIds")) {
            JsonObject renamedIds = jsonObject.get("renamedIds").getAsJsonObject();
            HashMap<String, String> mappings3 = new HashMap<String, String>();
            for (Map.Entry mappingEntry : renamedIds.entrySet()) {
                mappings3.put(((String)mappingEntry.getKey()).toLowerCase(Locale.ROOT), ((JsonElement)mappingEntry.getValue()).getAsString().toLowerCase(Locale.ROOT));
            }
            this.actions.add(tag -> {
                String name = tag.getStringTag("name").getValue();
                if (!mappings3.containsKey(name)) {
                    return;
                }
                tag.putString(NEW_NAME_KEY, (String)mappings3.get(name));
            });
        }
        if (jsonObject.has("flattenedProperties")) {
            JsonObject flattenedProperties = jsonObject.get("flattenedProperties").getAsJsonObject();
            for (Object entry : flattenedProperties.entrySet()) {
                identifier = ((String)entry.getKey()).toLowerCase(Locale.ROOT);
                JsonObject mappingObject = ((JsonElement)entry.getValue()).getAsJsonObject();
                String prefix = mappingObject.get("prefix").getAsString();
                String flattenedProperty = mappingObject.get("flattenedProperty").getAsString();
                String suffix = mappingObject.get("suffix").getAsString();
                JsonObject flattenedValueRemapsObject = mappingObject.getAsJsonObject("flattenedValueRemaps");
                HashMap<String, String> flattenedValueRemaps = new HashMap<String, String>();
                if (flattenedValueRemapsObject != null) {
                    for (Map.Entry remap : flattenedValueRemapsObject.entrySet()) {
                        flattenedValueRemaps.put((String)remap.getKey(), ((JsonElement)remap.getValue()).getAsString());
                    }
                }
                this.actions.add(tag -> {
                    String name = tag.getStringTag("name").getValue();
                    if (!name.equals(identifier)) {
                        return;
                    }
                    Tag patt10492$temp = tag.get("states");
                    if (patt10492$temp instanceof CompoundTag) {
                        CompoundTag states = (CompoundTag)patt10492$temp;
                        if (!states.contains(flattenedProperty)) {
                            return;
                        }
                        String flattenedValue = states.get(flattenedProperty).getValue().toString();
                        String flattenedName = prefix + flattenedValueRemaps.getOrDefault(flattenedValue, flattenedValue) + suffix;
                        tag.putString(NEW_NAME_KEY, flattenedName.toLowerCase(Locale.ROOT));
                        states.remove(flattenedProperty);
                    }
                });
            }
        }
        if (jsonObject.has("addedProperties")) {
            JsonObject addedProperties = jsonObject.get("addedProperties").getAsJsonObject();
            for (Object entry : addedProperties.entrySet()) {
                identifier = ((String)entry.getKey()).toLowerCase(Locale.ROOT);
                ArrayList<Pair> toAdd = new ArrayList<Pair>();
                for (Map.Entry toAddEntry : ((JsonElement)entry.getValue()).getAsJsonObject().entrySet()) {
                    toAdd.add(new Pair((Object)((String)toAddEntry.getKey()), this.getValue(((JsonElement)toAddEntry.getValue()).getAsJsonObject())));
                }
                this.actions.add(tag -> {
                    String name = tag.getStringTag("name").getValue();
                    if (!name.equals(identifier)) {
                        return;
                    }
                    Tag patt11947$temp = tag.get("states");
                    if (patt11947$temp instanceof CompoundTag) {
                        CompoundTag states = (CompoundTag)patt11947$temp;
                        for (Pair property : toAdd) {
                            states.put((String)property.key(), NbtUtil.createTag(property.value()));
                        }
                    }
                });
            }
        }
        if (jsonObject.has("removedProperties")) {
            JsonObject removedProperties = jsonObject.get("removedProperties").getAsJsonObject();
            for (Object entry : removedProperties.entrySet()) {
                identifier = ((String)entry.getKey()).toLowerCase(Locale.ROOT);
                ArrayList<String> toRemove = new ArrayList<String>();
                for (JsonElement toRemoveEntry : ((JsonElement)entry.getValue()).getAsJsonArray()) {
                    toRemove.add(toRemoveEntry.getAsString());
                }
                this.actions.add(tag -> {
                    String name = tag.getStringTag("name").getValue();
                    if (!name.equals(identifier)) {
                        return;
                    }
                    Tag patt13030$temp = tag.get("states");
                    if (patt13030$temp instanceof CompoundTag) {
                        CompoundTag states = (CompoundTag)patt13030$temp;
                        for (String property : toRemove) {
                            states.remove(property);
                        }
                    }
                });
            }
        }
        if (jsonObject.has("remappedPropertyValues")) {
            JsonObject remappedPropertyValues = jsonObject.get("remappedPropertyValues").getAsJsonObject();
            for (Object entry : remappedPropertyValues.entrySet()) {
                identifier = ((String)entry.getKey()).toLowerCase(Locale.ROOT);
                mappings = new HashMap();
                for (Object mappingEntry : ((JsonElement)entry.getValue()).getAsJsonObject().entrySet()) {
                    mappings.put((String)mappingEntry.getKey(), (List)remappedPropertyValuesLookup.get(((JsonElement)mappingEntry.getValue()).getAsString()));
                }
                this.actions.add(tag -> {
                    String name = tag.getStringTag("name").getValue();
                    if (!name.equals(identifier)) {
                        return;
                    }
                    Tag patt14199$temp = tag.get("states");
                    if (patt14199$temp instanceof CompoundTag) {
                        CompoundTag states = (CompoundTag)patt14199$temp;
                        for (Map.Entry mapping : mappings.entrySet()) {
                            Tag property = states.get((String)mapping.getKey());
                            if (property == null) continue;
                            Object value = property.getValue();
                            for (Pair valueMapping : (List)mapping.getValue()) {
                                if (!valueMapping.key().equals(value)) continue;
                                states.put((String)mapping.getKey(), NbtUtil.createTag(valueMapping.value()));
                            }
                        }
                    }
                });
            }
        }
        if (jsonObject.has("renamedProperties")) {
            JsonObject renamedProperties = jsonObject.get("renamedProperties").getAsJsonObject();
            for (Object entry : renamedProperties.entrySet()) {
                identifier = ((String)entry.getKey()).toLowerCase(Locale.ROOT);
                mappings = new HashMap();
                for (Object mappingEntry : ((JsonElement)entry.getValue()).getAsJsonObject().entrySet()) {
                    mappings.put((String)mappingEntry.getKey(), ((JsonElement)mappingEntry.getValue()).getAsString());
                }
                this.actions.add(tag -> {
                    String name = tag.getStringTag("name").getValue();
                    if (!name.equals(identifier)) {
                        return;
                    }
                    Tag patt15832$temp = tag.get("states");
                    if (patt15832$temp instanceof CompoundTag) {
                        CompoundTag states = (CompoundTag)patt15832$temp;
                        for (Map.Entry mapping : mappings.entrySet()) {
                            Tag property = states.remove((String)mapping.getKey());
                            if (property == null) continue;
                            states.put((String)mapping.getValue(), property);
                        }
                    }
                });
            }
        }
        this.actions.add(tag -> {
            String newName = tag.getString(NEW_NAME_KEY, null);
            if (newName != null) {
                tag.putString("name", newName);
                tag.remove(NEW_NAME_KEY);
            }
        });
    }

    private Object getValue(JsonObject obj) {
        if (obj.has("int")) {
            return obj.get("int").getAsInt();
        }
        if (obj.has("byte")) {
            return obj.get("byte").getAsByte();
        }
        if (obj.has("string")) {
            return obj.get("string").getAsString();
        }
        throw new IllegalArgumentException("Unknown json value type");
    }

    private record RemappedStatesEntry(CompoundTag oldStateTag, CompoundTag newStateTag, List<String> copiedStates, Function<CompoundTag, String> nameFunction) {
    }
}


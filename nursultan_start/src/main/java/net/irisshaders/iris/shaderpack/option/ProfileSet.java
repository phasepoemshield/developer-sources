/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.option;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.Profile;
import net.irisshaders.iris.shaderpack.option.Profile$Builder;
import net.irisshaders.iris.shaderpack.option.ProfileSet$ProfileResult;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;

public class ProfileSet {
    private final LinkedHashMap<String, Profile> orderedProfiles;
    private final List<Profile> sortedProfiles;

    public ProfileSet(LinkedHashMap<String, Profile> linkedHashMap) {
        ArrayList<Profile> arrayList = new ArrayList<Profile>(linkedHashMap.values());
        Comparator<Profile> comparator = Comparator.comparing(profile -> profile.precedence);
        Comparator<Profile> comparator2 = comparator.reversed();
        arrayList.sort(comparator2);
        this.sortedProfiles = arrayList;
        this.orderedProfiles = linkedHashMap;
    }

    public int size() {
        return this.sortedProfiles.size();
    }

    public void forEach(BiConsumer<String, Profile> biConsumer) {
        this.orderedProfiles.forEach(biConsumer);
    }

    private static Profile parse(String string, List<String> list, Map<String, List<String>> map, OptionSet optionSet) throws IllegalArgumentException {
        Profile$Builder profile$Builder = new Profile$Builder(string);
        List<String> list2 = map.get(string);
        if (list2 == null) {
            throw new IllegalArgumentException("Profile \"" + string + "\" does not exist!");
        }
        for (String string2 : list2) {
            if (string2.startsWith("!program.")) {
                profile$Builder.disableProgram(string2.substring("!program.".length()));
                continue;
            }
            if (string2.startsWith("profile.")) {
                String string3 = string2.substring("profile.".length());
                if (list.contains(string3)) {
                    throw new IllegalArgumentException("Error parsing profile \"" + string + "\", recursively included by: " + String.join((CharSequence)", ", list));
                }
                list.add(string3);
                profile$Builder.addAll(ProfileSet.parse(string3, list, map, optionSet));
                continue;
            }
            if (string2.startsWith("!")) {
                profile$Builder.option(string2.substring(1), "false");
                continue;
            }
            if (string2.contains("=")) {
                int n = string2.indexOf("=");
                profile$Builder.option(string2.substring(0, n), string2.substring(n + 1));
                continue;
            }
            if (string2.contains(":")) {
                int n = string2.indexOf(":");
                profile$Builder.option(string2.substring(0, n), string2.substring(n + 1));
                continue;
            }
            if (optionSet.isBooleanOption(string2)) {
                profile$Builder.option(string2, "true");
                continue;
            }
            Iris.logger.warn("Invalid pack option: " + string2);
        }
        return profile$Builder.build();
    }

    public ProfileSet$ProfileResult scan(OptionSet optionSet, OptionValues optionValues) {
        Profile profile;
        if (this.sortedProfiles.isEmpty()) {
            return new ProfileSet$ProfileResult(null, null, null);
        }
        for (int i = 0; i < this.sortedProfiles.size(); ++i) {
            profile = this.sortedProfiles.get(i);
            if (!profile.matches(optionSet, optionValues)) continue;
            Profile profile2 = this.sortedProfiles.get(Math.floorMod(i + 1, this.sortedProfiles.size()));
            Profile profile3 = this.sortedProfiles.get(Math.floorMod(i - 1, this.sortedProfiles.size()));
            return new ProfileSet$ProfileResult(profile, profile2, profile3);
        }
        Profile profile4 = (Profile)this.sortedProfiles.getFirst();
        profile = (Profile)this.sortedProfiles.getLast();
        return new ProfileSet$ProfileResult(null, profile4, profile);
    }

    private static /* synthetic */ void lambda$new$1(Profile profile) {
        System.out.println(profile.name + ":" + profile.precedence);
    }

    public static ProfileSet fromTree(Map<String, List<String>> map, OptionSet optionSet) {
        LinkedHashMap<String, Profile> linkedHashMap = new LinkedHashMap<String, Profile>();
        for (String string : map.keySet()) {
            linkedHashMap.put(string, ProfileSet.parse(string, new ArrayList<String>(), map, optionSet));
        }
        return new ProfileSet(linkedHashMap);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00493
 *  minecraft.class00497
 *  minecraft.class01890
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import minecraft.class00493;
import minecraft.class00497;
import minecraft.class01890;
import minecraft.class06679;

public final class class06645
extends Record {
    private final List<class00493> objectives;
    private final List<class06679> scores;
    private final Map<class01890, String> displaySlots;
    private final List<class00497> teams;
    public static final class06645 N = new class06645(List.of(), List.of(), Map.of(), List.of());
    public static final Codec<class06645> y = RecordCodecBuilder.create(instance -> instance.group((App)class00493.N.listOf().optionalFieldOf("Objectives", List.of()).forGetter(class06645::N), (App)class06679.u.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(class06645::y), (App)Codec.unboundedMap((Codec)class01890.field_45175, (Codec)Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(class06645::L), (App)class00497.N.listOf().optionalFieldOf("Teams", List.of()).forGetter(class06645::u)).apply(instance, class06645::new));

    public Map<class01890, String> L() {
        return this.displaySlots;
    }

    public class06645(List<class00493> list, List<class06679> list2, Map<class01890, String> map, List<class00497> list3) {
        this.objectives = list;
        this.scores = list2;
        this.displaySlots = map;
        this.teams = list3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06645.class, "objectives;scores;displaySlots;teams", "objectives", "scores", "displaySlots", "teams"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06645.class, "objectives;scores;displaySlots;teams", "objectives", "scores", "displaySlots", "teams"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06645.class, "objectives;scores;displaySlots;teams", "objectives", "scores", "displaySlots", "teams"}, this);
    }

    public List<class00497> u() {
        return this.teams;
    }

    public List<class06679> y() {
        return this.scores;
    }

    public List<class00493> N() {
        return this.objectives;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class04942;

public final class class04947
extends Record
implements class04942 {
    @SerializedName(value="seed")
    private final String seed;
    @SerializedName(value="worldTemplateId")
    private final long worldTemplateId;
    @SerializedName(value="levelType")
    private final int levelType;
    @SerializedName(value="generateStructures")
    private final boolean generateStructures;
    @SerializedName(value="experiments")
    private final Set<String> experiments;

    @SerializedName(value="levelType")
    public int L() {
        return this.levelType;
    }

    public class04947(String string, long l, int n, boolean bl, Set<String> set) {
        this.seed = string;
        this.worldTemplateId = l;
        this.levelType = n;
        this.generateStructures = bl;
        this.experiments = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04947.class, "seed;worldTemplateId;levelType;generateStructures;experiments", "seed", "worldTemplateId", "levelType", "generateStructures", "experiments"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04947.class, "seed;worldTemplateId;levelType;generateStructures;experiments", "seed", "worldTemplateId", "levelType", "generateStructures", "experiments"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04947.class, "seed;worldTemplateId;levelType;generateStructures;experiments", "seed", "worldTemplateId", "levelType", "generateStructures", "experiments"}, this);
    }

    @SerializedName(value="experiments")
    public Set<String> i() {
        return this.experiments;
    }

    @SerializedName(value="generateStructures")
    public boolean u() {
        return this.generateStructures;
    }

    @SerializedName(value="worldTemplateId")
    public long y() {
        return this.worldTemplateId;
    }

    @SerializedName(value="seed")
    public String N() {
        return this.seed;
    }
}


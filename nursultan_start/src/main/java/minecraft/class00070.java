/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 *  minecraft.class04949
 *  minecraft.class04980
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04942;
import minecraft.class04949;
import minecraft.class04980;
import org.jspecify.annotations.Nullable;

public final class class00070
extends Record
implements class04942 {
    @SerializedName(value="slotId")
    private final int slotId;
    @SerializedName(value="spawnProtection")
    private final int spawnProtection;
    @SerializedName(value="forceGameMode")
    private final boolean forceGameMode;
    @SerializedName(value="difficulty")
    private final int difficulty;
    @SerializedName(value="gameMode")
    private final int gameMode;
    @SerializedName(value="slotName")
    private final String slotName;
    @SerializedName(value="version")
    private final String version;
    @SerializedName(value="compatibility")
    private final class04949 compatibility;
    @SerializedName(value="worldTemplateId")
    private final long templateId;
    @SerializedName(value="worldTemplateImage")
    private final @Nullable String templateImage;
    @SerializedName(value="hardcore")
    private final boolean hardcore;

    @SerializedName(value="forceGameMode")
    public boolean L() {
        return this.forceGameMode;
    }

    @SerializedName(value="version")
    public String M() {
        return this.version;
    }

    public class00070(int n, class04980 class049802, boolean bl) {
        this(n, class049802.N, class049802.y, class049802.L, class049802.u, class049802.N(n), class049802.i, class049802.R, class049802.M, class049802.B, bl);
    }

    public class00070(int n, int n2, boolean bl, int n3, int n4, String string, String string2, class04949 class049492, long l, @Nullable String string3, boolean bl2) {
        this.slotId = n;
        this.spawnProtection = n2;
        this.forceGameMode = bl;
        this.difficulty = n3;
        this.gameMode = n4;
        this.slotName = string;
        this.version = string2;
        this.compatibility = class049492;
        this.templateId = l;
        this.templateImage = string3;
        this.hardcore = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00070.class, "slotId;spawnProtection;forceGameMode;difficulty;gameMode;slotName;version;compatibility;templateId;templateImage;hardcore", "slotId", "spawnProtection", "forceGameMode", "difficulty", "gameMode", "slotName", "version", "compatibility", "templateId", "templateImage", "hardcore"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00070.class, "slotId;spawnProtection;forceGameMode;difficulty;gameMode;slotName;version;compatibility;templateId;templateImage;hardcore", "slotId", "spawnProtection", "forceGameMode", "difficulty", "gameMode", "slotName", "version", "compatibility", "templateId", "templateImage", "hardcore"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00070.class, "slotId;spawnProtection;forceGameMode;difficulty;gameMode;slotName;version;compatibility;templateId;templateImage;hardcore", "slotId", "spawnProtection", "forceGameMode", "difficulty", "gameMode", "slotName", "version", "compatibility", "templateId", "templateImage", "hardcore"}, this);
    }

    @SerializedName(value="compatibility")
    public class04949 B() {
        return this.compatibility;
    }

    @SerializedName(value="worldTemplateId")
    public long Z() {
        return this.templateId;
    }

    @SerializedName(value="gameMode")
    public int i() {
        return this.gameMode;
    }

    @SerializedName(value="hardcore")
    public boolean U() {
        return this.hardcore;
    }

    @SerializedName(value="worldTemplateImage")
    public @Nullable String z() {
        return this.templateImage;
    }

    @SerializedName(value="difficulty")
    public int u() {
        return this.difficulty;
    }

    @SerializedName(value="spawnProtection")
    public int y() {
        return this.spawnProtection;
    }

    @SerializedName(value="slotId")
    public int N() {
        return this.slotId;
    }

    @SerializedName(value="slotName")
    public String R() {
        return this.slotName;
    }
}


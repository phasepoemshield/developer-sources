/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05677
 *  minecraft.class07709
 *  minecraft.class07793
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class05677;
import minecraft.class07709;
import minecraft.class07793;

final class class05644
extends Record {
    private final class07793 sourcePath;
    private final class07793 targetPath;
    private final class05677 op;
    public static final Codec<class05644> N = RecordCodecBuilder.create(instance -> instance.group((App)class07793.N.fieldOf("source").forGetter(class05644::N), (App)class07793.N.fieldOf("target").forGetter(class05644::y), (App)class05677.field_45821.fieldOf("op").forGetter(class05644::L)).apply(instance, class05644::new));

    public class05677 L() {
        return this.op;
    }

    class05644(class07793 class077932, class07793 class077933, class05677 class056772) {
        this.sourcePath = class077932;
        this.targetPath = class077933;
        this.op = class056772;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05644.class, "sourcePath;targetPath;op", "sourcePath", "targetPath", "op"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05644.class, "sourcePath;targetPath;op", "sourcePath", "targetPath", "op"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05644.class, "sourcePath;targetPath;op", "sourcePath", "targetPath", "op"}, this);
    }

    public class07793 y() {
        return this.targetPath;
    }

    public void N(Supplier<class07709> supplier, class07709 class077092) {
        try {
            List list = this.sourcePath.N(class077092);
            if (!list.isEmpty()) {
                this.op.N(supplier.get(), this.targetPath, list);
            }
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
    }

    public class07793 N() {
        return this.sourcePath;
    }
}


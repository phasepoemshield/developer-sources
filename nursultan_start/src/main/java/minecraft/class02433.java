/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00069
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class00069;
import minecraft.class01894;
import minecraft.class02435;

public final class class02433
extends Record {
    private final class01894 vertexShaderId;
    private final class01894 fragmentShaderId;
    private final List<class02435> inputs;
    private final class01894 outputTarget;
    private final Map<String, List<class00069>> uniforms;
    private static final Codec<List<class02435>> M = class02435.N.listOf().validate(list -> {
        ObjectArraySet objectArraySet = new ObjectArraySet(list.size());
        for (class02435 class024352 : list) {
            if (objectArraySet.add(class024352.N())) continue;
            return DataResult.error(() -> "Encountered repeated sampler name: " + class024352.N());
        }
        return DataResult.success((Object)list);
    });
    private static final Codec<Map<String, List<class00069>>> B = Codec.unboundedMap((Codec)Codec.STRING, (Codec)class00069.N.listOf());
    public static final Codec<class02433> N = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("vertex_shader").forGetter(class02433::y), (App)class01894.N.fieldOf("fragment_shader").forGetter(class02433::L), (App)M.optionalFieldOf("inputs", List.of()).forGetter(class02433::u), (App)class01894.N.fieldOf("output").forGetter(class02433::i), (App)B.optionalFieldOf("uniforms", Map.of()).forGetter(class02433::R)).apply(instance, class02433::new));

    public class01894 L() {
        return this.fragmentShaderId;
    }

    public class02433(class01894 class018942, class01894 class018943, List<class02435> list, class01894 class018944, Map<String, List<class00069>> map) {
        this.vertexShaderId = class018942;
        this.fragmentShaderId = class018943;
        this.inputs = list;
        this.outputTarget = class018944;
        this.uniforms = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02433.class, "vertexShaderId;fragmentShaderId;inputs;outputTarget;uniforms", "vertexShaderId", "fragmentShaderId", "inputs", "outputTarget", "uniforms"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02433.class, "vertexShaderId;fragmentShaderId;inputs;outputTarget;uniforms", "vertexShaderId", "fragmentShaderId", "inputs", "outputTarget", "uniforms"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02433.class, "vertexShaderId;fragmentShaderId;inputs;outputTarget;uniforms", "vertexShaderId", "fragmentShaderId", "inputs", "outputTarget", "uniforms"}, this);
    }

    public class01894 i() {
        return this.outputTarget;
    }

    public List<class02435> u() {
        return this.inputs;
    }

    public class01894 y() {
        return this.vertexShaderId;
    }

    public Stream<class01894> N() {
        return Stream.concat(this.inputs.stream().flatMap(class024352 -> class024352.y().stream()), Stream.of(this.outputTarget));
    }

    public Map<String, List<class00069>> R() {
        return this.uniforms;
    }
}


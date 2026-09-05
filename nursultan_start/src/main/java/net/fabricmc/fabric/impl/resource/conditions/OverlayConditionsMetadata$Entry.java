/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 */
package net.fabricmc.fabric.impl.resource.conditions;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.regex.Pattern;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;

public record OverlayConditionsMetadata$Entry(String directory, ResourceCondition condition) {
    public static final Codec<OverlayConditionsMetadata$Entry> CODEC = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.validate(OverlayConditionsMetadata$Entry::validateDirectory).fieldOf("directory").forGetter(OverlayConditionsMetadata$Entry::directory), (App)ResourceCondition.CODEC.fieldOf("condition").forGetter(OverlayConditionsMetadata$Entry::condition)).apply((Applicative)instance, OverlayConditionsMetadata$Entry::new));
    private static final Pattern DIRECTORY_NAME_PATTERN = Pattern.compile("[-_a-zA-Z0-9.]+");

    private static DataResult<String> validateDirectory(String string) {
        boolean bl = DIRECTORY_NAME_PATTERN.matcher(string).matches();
        return bl ? DataResult.success((Object)string) : DataResult.error(() -> "Directory name is invalid");
    }
}


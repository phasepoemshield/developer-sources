/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package page.langeweile.ok_zoomer.config.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Optional;
import org.quiltmc.config.api.metadata.MetadataType;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset$Builder;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset$Range;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface RangeSubset {
    public static final MetadataType<RangeSubset$Range, RangeSubset$Builder> TYPE = MetadataType.create(Optional::empty, RangeSubset$Builder::new);

    public int min();

    public int max();
}


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
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Builder;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface WidgetSize {
    public static final MetadataType<WidgetSize$Size, WidgetSize$Builder> TYPE = MetadataType.create(() -> Optional.of(WidgetSize$Size.FULL), WidgetSize$Builder::new);

    public WidgetSize$Size value();
}


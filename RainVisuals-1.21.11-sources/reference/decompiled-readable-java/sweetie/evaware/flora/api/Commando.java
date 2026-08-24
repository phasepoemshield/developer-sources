/*
 * Decompiled with CFR 0.152.
 */
package sweetie.evaware.flora.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import sweetie.evaware.flora.api.DispatchMode;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface Commando {
    public DispatchMode mode() default DispatchMode.SYNC;

    public byte priority() default 1;
}


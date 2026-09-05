/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class OptionAccessImpl
implements OptionAccess {
    private final Map<String, Option<?>> storage = new HashMap();
    private final Map<String, Consumer<Option<?>>> scheduledOperations = new HashMap();

    @Override
    public Option<?> getOption(String string) {
        return this.storage.get(string);
    }

    public void checkBadOperations() {
        if (!this.scheduledOperations.isEmpty()) {
            YACLConstants.LOGGER.warn("There are scheduled operations on the `OptionAccess` that tried to reference fields that do not exist. The following have been referenced that do not exist: " + String.join((CharSequence)", ", this.scheduledOperations.keySet()));
        }
    }

    public void putOption(String string, Option<?> option) {
        this.storage.put(string, option);
        Consumer<Option<?>> consumer = this.scheduledOperations.remove(string);
        if (consumer != null) {
            consumer.accept(option);
        }
    }

    @Override
    public void scheduleOptionOperation(String string, Consumer<Option<?>> consumer) {
        if (this.storage.containsKey(string)) {
            consumer.accept(this.storage.get(string));
        } else {
            this.scheduledOperations.merge(string, consumer, Consumer::andThen);
        }
    }
}


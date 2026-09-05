/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.loader.impl.mapping;

import java.util.Collection;
import java.util.HashSet;
import net.fabricmc.loader.api.MappingResolver;
import net.fabricmc.loader.impl.launch.FabricLauncherBase;
import net.fabricmc.loader.impl.mapping.RuntimeMappingRegistry;

public final class RuntimeMappingResolver
implements MappingResolver {
    @Override
    public String getCurrentRuntimeNamespace() {
        return FabricLauncherBase.getLauncher().getTargetNamespace();
    }

    @Override
    public String mapFieldName(String namespace, String owner, String name, String descriptor) {
        if (this.isRuntimeNamespace(namespace)) {
            String mapped = RuntimeMappingRegistry.mapFieldName(namespace, owner, name, descriptor);
            return mapped != null ? mapped : name;
        }
        String mapped = RuntimeMappingRegistry.mapFieldName(namespace, owner, name, descriptor);
        return mapped != null ? mapped : name;
    }

    @Override
    public String mapClassName(String namespace, String className) {
        if (this.isRuntimeNamespace(namespace)) {
            return className;
        }
        String mapped = RuntimeMappingRegistry.mapClassName(namespace, className);
        return mapped != null ? mapped : className;
    }

    @Override
    public String unmapClassName(String targetNamespace, String className) {
        if (this.isRuntimeNamespace(targetNamespace)) {
            return className;
        }
        String mapped = RuntimeMappingRegistry.unmapClassName(targetNamespace, className);
        return mapped != null ? mapped : className;
    }

    @Override
    public String mapMethodName(String namespace, String owner, String name, String descriptor) {
        if (this.isRuntimeNamespace(namespace)) {
            String mapped = RuntimeMappingRegistry.mapMethodName(namespace, owner, name, descriptor);
            return mapped != null ? mapped : name;
        }
        String mapped = RuntimeMappingRegistry.mapMethodName(namespace, owner, name, descriptor);
        return mapped != null ? mapped : name;
    }

    @Override
    public Collection<String> getNamespaces() {
        HashSet<String> namespaces = new HashSet<String>(RuntimeMappingRegistry.getRegisteredNamespaces());
        namespaces.add(this.getCurrentRuntimeNamespace());
        return namespaces;
    }

    private boolean isRuntimeNamespace(String namespace) {
        return this.getCurrentRuntimeNamespace().equals(namespace);
    }
}


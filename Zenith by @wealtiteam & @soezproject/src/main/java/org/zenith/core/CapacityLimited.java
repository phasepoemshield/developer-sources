package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Interface;


@FunctionalInterface
public interface CapacityLimited<E> {
   boolean accept(E var1);
}

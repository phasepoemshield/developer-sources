/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Controller;

@FunctionalInterface
public interface ControllerBuilder<T> {
    public Controller<T> build();
}


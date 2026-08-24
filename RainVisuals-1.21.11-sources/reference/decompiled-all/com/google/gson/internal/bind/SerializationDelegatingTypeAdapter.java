package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;

// $VF: Compiled from SerializationDelegatingTypeAdapter.java
public abstract class SerializationDelegatingTypeAdapter<T> extends TypeAdapter<T> {
   public abstract TypeAdapter<T> getSerializationDelegate();
}

package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

// $VF: Compiled from JsonReaderInternalAccess.java
public abstract class JsonReaderInternalAccess {
   public static JsonReaderInternalAccess INSTANCE;

   public abstract void promoteNameToValue(JsonReader var1) throws IOException;
}

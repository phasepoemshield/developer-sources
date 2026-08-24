package org.zenith.config;

import org.zenith.module.Module;

import org.zenith.core.TaskQueue;

import org.zenith.module.Interface;


import com.google.gson.JsonObject;

public interface ProtocolMessage {
   String type();

   JsonObject TaskQueue();
}

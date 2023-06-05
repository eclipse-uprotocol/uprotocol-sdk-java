/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.eclipse.uprotocol.sdk;

import org.eclipse.uprotocol.cloudevent.datamodel.UCloudEventAttributes;
import org.eclipse.uprotocol.uri.datamodel.UUri;

import com.google.rpc.Status;

/**
 *  uP-L2 Event Listener Interace for the uBus
 */
public interface EventListener {

	/**
     * Handle receiving published events from the bus.
	 * 
	 * @param topic Topic the event data was published too
	 * @param data The event data
	 * @param attributes Attributes related to the published data received
	 * @return Status
     */
	Status onEvent(UUri topic, byte[] data, UCloudEventAttributes attributes);
}
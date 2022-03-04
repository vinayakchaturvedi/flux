/*
 * Copyright 2012-2016, the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flipkart.flux.persistence.key;

import com.flipkart.flux.shard.ShardedEntity;

/**
 * The FSM identifier object/key. Sharding is primarily at the FSM level and therefore this identifier is a @ShardedEntity that uses the FSM identifier
 * to identify a shard.
 * 
 * @author regu.b
 *
 */
public class FSMId extends ShardedEntity {
	public String statemachineId;

	public FSMId(String statemachineId) {
		super(statemachineId);
		this.statemachineId = statemachineId;
	}
}

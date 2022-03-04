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
package com.flipkart.flux.persistence.criteria;

import java.sql.Timestamp;

import com.flipkart.flux.domain.Status;
import com.flipkart.flux.shard.ShardId;
import com.flipkart.flux.shard.ShardedEntity;

/**
 * A Criteria for constructing queries on the States data store. The attributes of this class determine the data filters applied when retrieving the 
 * data.   
 * @author regu.b
 *
 */
public class FSMStatusCriteria extends ShardedEntity {

	public ShardId shardId; // needed to identify/specify the shard on which this the query formed by this criteria will execute on
	public String stateMachineName;
	public Timestamp fromTime;
	public Timestamp toTime;
	public String stateName;
	public Status[] statuses;
	public FSMStatusCriteria(ShardId shardId, String stateMachineName, Timestamp fromTime, Timestamp toTime, String stateName,
			Status[] statuses) {
		super(shardId);
		this.stateMachineName = stateMachineName;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.stateName = stateName;
		this.statuses = statuses;
	}	
	public FSMStatusCriteria(ShardId shardId, String stateMachineName, Timestamp fromTime, Timestamp toTime, Status[] statuses) {
		super(shardId);
		this.stateMachineName = stateMachineName;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.statuses = statuses;
	}	
	
}

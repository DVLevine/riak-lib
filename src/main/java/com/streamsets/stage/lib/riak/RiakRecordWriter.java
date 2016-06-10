/**
 * Copyright 2015 StreamSets Inc.
 *
 * Licensed under the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.stage.lib.riak;

import com.streamsets.pipeline.api.Record;
import com.streamsets.pipeline.api.StageException;
import com.streamsets.pipeline.api.base.OnRecordErrorException;

import java.util.Collection;
import java.util.List;

/**
 * Interface for a record writer implementation that writes records to a Riak destination.
 * Implementations may support the inserting of records, or even change log resolution into
 * inserts, updates, and deletes.
 */
// TODO - this is a copy of JdbcRecordWriter. Refactor?
public interface RiakRecordWriter {
  /**
   * Accepts a batch of records to write to a Riak destination.
   * @param batch batch of SDC records
   * @return any records that failed to be written to the destination
   * @throws StageException
   */
  List<OnRecordErrorException> writeBatch(Collection<Record> batch) throws StageException;
}

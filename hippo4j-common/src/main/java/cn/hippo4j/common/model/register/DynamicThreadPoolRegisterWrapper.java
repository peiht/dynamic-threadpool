/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hippo4j.common.model.register;

import cn.hippo4j.common.model.register.notify.DynamicThreadPoolRegisterCoreNotifyParameter;
import cn.hippo4j.common.model.register.notify.DynamicThreadPoolRegisterServerNotifyParameter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dynamic thread-pool register wrapper.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DynamicThreadPoolRegisterWrapper {

    /**
     * Tenant id
     */
    private String tenantId;

    /**
     * Item id
     */
    private String itemId;

    /**
     * Update if exists
     */
    private Boolean updateIfExists = Boolean.TRUE;

    /**
     * Dynamic thread-pool register parameter
     */
    private DynamicThreadPoolRegisterParameter dynamicThreadPoolRegisterParameter;

    /**
     * Dynamic thread-pool core notify parameter
     */
    private DynamicThreadPoolRegisterCoreNotifyParameter dynamicThreadPoolRegisterCoreNotifyParameter;

    /**
     * Dynamic thread-pool server notify parameter
     */
    private DynamicThreadPoolRegisterServerNotifyParameter dynamicThreadPoolRegisterServerNotifyParameter;
}
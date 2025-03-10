/*
 * Copyright 2017 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.linecorp.centraldogma.server.storage.repository;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

/**
 * Useful {@link FindOption} maps.
 */
public final class FindOptions {

    public static final Map<FindOption<?>, ?> FIND_ONE_WITH_CONTENT =
            ImmutableMap.of(FindOption.MAX_ENTRIES, 1);

    public static final Map<FindOption<?>, ?> FIND_ONE_WITHOUT_CONTENT =
            ImmutableMap.of(FindOption.FETCH_CONTENT, false, FindOption.MAX_ENTRIES, 1);

    public static final Map<FindOption<?>, ?> FIND_ALL_WITH_CONTENT = ImmutableMap.of();

    public static final Map<FindOption<?>, ?> FIND_ALL_WITHOUT_CONTENT =
            ImmutableMap.of(FindOption.FETCH_CONTENT, false);

    private FindOptions() {}
}

/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.tooling.model;

import org.gradle.api.Incubating;

import java.io.File;

/**
 * Represents an entry point that uses task name to select tasks executed from a given context.
 *
 * @since 1.12
 */
@Incubating
public interface TaskSelector extends EntryPoint {
    /**
     * Returns the display name.
     * @return Display name of the task
     */
    String getDisplayName();

    /**
     * Returns the project directory used as a starting point for a build invoked by this
     * task selector.
     *
     * @return The project directory associated with this task selector.
     */
    File getProjectDir();
}

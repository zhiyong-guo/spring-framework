/*
 * Copyright 2002-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.aot;

import org.jspecify.annotations.Nullable;

/**
 * Throw when an AOT processor failed.
 *
 * @author Stephane Nicoll
 * @since 6.2
 */
@SuppressWarnings("serial")
public class AotProcessingException extends AotException {

	/**
	 * Create a new instance with the detail message and a root cause, if any.
	 * @param msg the detail message
	 * @param cause the root cause, if any
	 */
	public AotProcessingException(String msg, @Nullable Throwable cause) {
		super(msg, cause);
	}

}

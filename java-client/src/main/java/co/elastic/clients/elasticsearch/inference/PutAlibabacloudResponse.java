/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: inference.put_alibabacloud.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_alibabacloud.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutAlibabacloudResponse extends InferenceEndpointInfoAlibabaCloudAI {
	// ---------------------------------------------------------------------------------------------

	private PutAlibabacloudResponse(Builder builder) {
		super(builder);

	}

	public static PutAlibabacloudResponse of(Function<Builder, ObjectBuilder<PutAlibabacloudResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAlibabacloudResponse}.
	 */

	public static class Builder extends InferenceEndpointInfoAlibabaCloudAI.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutAlibabacloudResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutAlibabacloudResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAlibabacloudResponse build() {
			_checkSingleUse();

			return new PutAlibabacloudResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAlibabacloudResponse}
	 */
	public static final JsonpDeserializer<PutAlibabacloudResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutAlibabacloudResponse::setupPutAlibabacloudResponseDeserializer);

	protected static void setupPutAlibabacloudResponseDeserializer(
			ObjectDeserializer<PutAlibabacloudResponse.Builder> op) {
		InferenceEndpointInfoAlibabaCloudAI.setupInferenceEndpointInfoAlibabaCloudAIDeserializer(op);

	}

}

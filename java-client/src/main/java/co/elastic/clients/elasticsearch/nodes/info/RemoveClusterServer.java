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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: nodes.info.RemoveClusterServer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.RemoveClusterServer">API
 *      specification</a>
 */
@JsonpDeserializable
public class RemoveClusterServer implements JsonpSerializable {
	private final List<String> boundAddress;

	private final String publishAddress;

	// ---------------------------------------------------------------------------------------------

	private RemoveClusterServer(Builder builder) {

		this.boundAddress = ApiTypeHelper.unmodifiableRequired(builder.boundAddress, this, "boundAddress");
		this.publishAddress = ApiTypeHelper.requireNonNull(builder.publishAddress, this, "publishAddress");

	}

	public static RemoveClusterServer of(Function<Builder, ObjectBuilder<RemoveClusterServer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bound_address}
	 */
	public final List<String> boundAddress() {
		return this.boundAddress;
	}

	/**
	 * Required - API name: {@code publish_address}
	 */
	public final String publishAddress() {
		return this.publishAddress;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.boundAddress)) {
			generator.writeKey("bound_address");
			generator.writeStartArray();
			for (String item0 : this.boundAddress) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("publish_address");
		generator.write(this.publishAddress);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoveClusterServer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RemoveClusterServer> {
		private List<String> boundAddress;

		private String publishAddress;

		/**
		 * Required - API name: {@code bound_address}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>boundAddress</code>.
		 */
		public final Builder boundAddress(List<String> list) {
			this.boundAddress = _listAddAll(this.boundAddress, list);
			return this;
		}

		/**
		 * Required - API name: {@code bound_address}
		 * <p>
		 * Adds one or more values to <code>boundAddress</code>.
		 */
		public final Builder boundAddress(String value, String... values) {
			this.boundAddress = _listAdd(this.boundAddress, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code publish_address}
		 */
		public final Builder publishAddress(String value) {
			this.publishAddress = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoveClusterServer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoveClusterServer build() {
			_checkSingleUse();

			return new RemoveClusterServer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoveClusterServer}
	 */
	public static final JsonpDeserializer<RemoveClusterServer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RemoveClusterServer::setupRemoveClusterServerDeserializer);

	protected static void setupRemoveClusterServerDeserializer(ObjectDeserializer<RemoveClusterServer.Builder> op) {

		op.add(Builder::boundAddress, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"bound_address");
		op.add(Builder::publishAddress, JsonpDeserializer.stringDeserializer(), "publish_address");

	}

}

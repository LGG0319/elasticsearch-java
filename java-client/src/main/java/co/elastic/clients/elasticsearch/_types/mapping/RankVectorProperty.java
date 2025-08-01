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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: _types.mapping.RankVectorProperty

/**
 * Technical preview
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.RankVectorProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankVectorProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final RankVectorElementType elementType;

	@Nullable
	private final Integer dims;

	// ---------------------------------------------------------------------------------------------

	private RankVectorProperty(Builder builder) {
		super(builder);

		this.elementType = builder.elementType;
		this.dims = builder.dims;

	}

	public static RankVectorProperty of(Function<Builder, ObjectBuilder<RankVectorProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.RankVectors;
	}

	/**
	 * API name: {@code element_type}
	 */
	@Nullable
	public final RankVectorElementType elementType() {
		return this.elementType;
	}

	/**
	 * API name: {@code dims}
	 */
	@Nullable
	public final Integer dims() {
		return this.dims;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "rank_vectors");
		super.serializeInternal(generator, mapper);
		if (this.elementType != null) {
			generator.writeKey("element_type");
			this.elementType.serialize(generator, mapper);
		}
		if (this.dims != null) {
			generator.writeKey("dims");
			generator.write(this.dims);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankVectorProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankVectorProperty> {
		@Nullable
		private RankVectorElementType elementType;

		@Nullable
		private Integer dims;

		/**
		 * API name: {@code element_type}
		 */
		public final Builder elementType(@Nullable RankVectorElementType value) {
			this.elementType = value;
			return this;
		}

		/**
		 * API name: {@code dims}
		 */
		public final Builder dims(@Nullable Integer value) {
			this.dims = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankVectorProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankVectorProperty build() {
			_checkSingleUse();

			return new RankVectorProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankVectorProperty}
	 */
	public static final JsonpDeserializer<RankVectorProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankVectorProperty::setupRankVectorPropertyDeserializer);

	protected static void setupRankVectorPropertyDeserializer(ObjectDeserializer<RankVectorProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::elementType, RankVectorElementType._DESERIALIZER, "element_type");
		op.add(Builder::dims, JsonpDeserializer.integerDeserializer(), "dims");

		op.ignore("type");
	}

}

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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: cluster.stats.FieldTypesMappings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.FieldTypesMappings">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldTypesMappings implements JsonpSerializable {
	private final List<FieldTypes> fieldTypes;

	private final List<RuntimeFieldTypes> runtimeFieldTypes;

	@Nullable
	private final Long totalFieldCount;

	@Nullable
	private final Long totalDeduplicatedFieldCount;

	@Nullable
	private final String totalDeduplicatedMappingSize;

	@Nullable
	private final Long totalDeduplicatedMappingSizeInBytes;

	private final Map<String, Integer> sourceModes;

	// ---------------------------------------------------------------------------------------------

	private FieldTypesMappings(Builder builder) {

		this.fieldTypes = ApiTypeHelper.unmodifiableRequired(builder.fieldTypes, this, "fieldTypes");
		this.runtimeFieldTypes = ApiTypeHelper.unmodifiableRequired(builder.runtimeFieldTypes, this,
				"runtimeFieldTypes");
		this.totalFieldCount = builder.totalFieldCount;
		this.totalDeduplicatedFieldCount = builder.totalDeduplicatedFieldCount;
		this.totalDeduplicatedMappingSize = builder.totalDeduplicatedMappingSize;
		this.totalDeduplicatedMappingSizeInBytes = builder.totalDeduplicatedMappingSizeInBytes;
		this.sourceModes = ApiTypeHelper.unmodifiableRequired(builder.sourceModes, this, "sourceModes");

	}

	public static FieldTypesMappings of(Function<Builder, ObjectBuilder<FieldTypesMappings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Contains statistics about field data types used in selected nodes.
	 * <p>
	 * API name: {@code field_types}
	 */
	public final List<FieldTypes> fieldTypes() {
		return this.fieldTypes;
	}

	/**
	 * Required - Contains statistics about runtime field data types used in
	 * selected nodes.
	 * <p>
	 * API name: {@code runtime_field_types}
	 */
	public final List<RuntimeFieldTypes> runtimeFieldTypes() {
		return this.runtimeFieldTypes;
	}

	/**
	 * Total number of fields in all non-system indices.
	 * <p>
	 * API name: {@code total_field_count}
	 */
	@Nullable
	public final Long totalFieldCount() {
		return this.totalFieldCount;
	}

	/**
	 * Total number of fields in all non-system indices, accounting for mapping
	 * deduplication.
	 * <p>
	 * API name: {@code total_deduplicated_field_count}
	 */
	@Nullable
	public final Long totalDeduplicatedFieldCount() {
		return this.totalDeduplicatedFieldCount;
	}

	/**
	 * Total size of all mappings after deduplication and compression.
	 * <p>
	 * API name: {@code total_deduplicated_mapping_size}
	 */
	@Nullable
	public final String totalDeduplicatedMappingSize() {
		return this.totalDeduplicatedMappingSize;
	}

	/**
	 * Total size of all mappings, in bytes, after deduplication and compression.
	 * <p>
	 * API name: {@code total_deduplicated_mapping_size_in_bytes}
	 */
	@Nullable
	public final Long totalDeduplicatedMappingSizeInBytes() {
		return this.totalDeduplicatedMappingSizeInBytes;
	}

	/**
	 * Required - Source mode usage count.
	 * <p>
	 * API name: {@code source_modes}
	 */
	public final Map<String, Integer> sourceModes() {
		return this.sourceModes;
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

		if (ApiTypeHelper.isDefined(this.fieldTypes)) {
			generator.writeKey("field_types");
			generator.writeStartArray();
			for (FieldTypes item0 : this.fieldTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.runtimeFieldTypes)) {
			generator.writeKey("runtime_field_types");
			generator.writeStartArray();
			for (RuntimeFieldTypes item0 : this.runtimeFieldTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.totalFieldCount != null) {
			generator.writeKey("total_field_count");
			generator.write(this.totalFieldCount);

		}
		if (this.totalDeduplicatedFieldCount != null) {
			generator.writeKey("total_deduplicated_field_count");
			generator.write(this.totalDeduplicatedFieldCount);

		}
		if (this.totalDeduplicatedMappingSize != null) {
			generator.writeKey("total_deduplicated_mapping_size");
			generator.write(this.totalDeduplicatedMappingSize);

		}
		if (this.totalDeduplicatedMappingSizeInBytes != null) {
			generator.writeKey("total_deduplicated_mapping_size_in_bytes");
			generator.write(this.totalDeduplicatedMappingSizeInBytes);

		}
		if (ApiTypeHelper.isDefined(this.sourceModes)) {
			generator.writeKey("source_modes");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.sourceModes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldTypesMappings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FieldTypesMappings> {
		private List<FieldTypes> fieldTypes;

		private List<RuntimeFieldTypes> runtimeFieldTypes;

		@Nullable
		private Long totalFieldCount;

		@Nullable
		private Long totalDeduplicatedFieldCount;

		@Nullable
		private String totalDeduplicatedMappingSize;

		@Nullable
		private Long totalDeduplicatedMappingSizeInBytes;

		private Map<String, Integer> sourceModes;

		/**
		 * Required - Contains statistics about field data types used in selected nodes.
		 * <p>
		 * API name: {@code field_types}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fieldTypes</code>.
		 */
		public final Builder fieldTypes(List<FieldTypes> list) {
			this.fieldTypes = _listAddAll(this.fieldTypes, list);
			return this;
		}

		/**
		 * Required - Contains statistics about field data types used in selected nodes.
		 * <p>
		 * API name: {@code field_types}
		 * <p>
		 * Adds one or more values to <code>fieldTypes</code>.
		 */
		public final Builder fieldTypes(FieldTypes value, FieldTypes... values) {
			this.fieldTypes = _listAdd(this.fieldTypes, value, values);
			return this;
		}

		/**
		 * Required - Contains statistics about field data types used in selected nodes.
		 * <p>
		 * API name: {@code field_types}
		 * <p>
		 * Adds a value to <code>fieldTypes</code> using a builder lambda.
		 */
		public final Builder fieldTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return fieldTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Required - Contains statistics about runtime field data types used in
		 * selected nodes.
		 * <p>
		 * API name: {@code runtime_field_types}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>runtimeFieldTypes</code>.
		 */
		public final Builder runtimeFieldTypes(List<RuntimeFieldTypes> list) {
			this.runtimeFieldTypes = _listAddAll(this.runtimeFieldTypes, list);
			return this;
		}

		/**
		 * Required - Contains statistics about runtime field data types used in
		 * selected nodes.
		 * <p>
		 * API name: {@code runtime_field_types}
		 * <p>
		 * Adds one or more values to <code>runtimeFieldTypes</code>.
		 */
		public final Builder runtimeFieldTypes(RuntimeFieldTypes value, RuntimeFieldTypes... values) {
			this.runtimeFieldTypes = _listAdd(this.runtimeFieldTypes, value, values);
			return this;
		}

		/**
		 * Required - Contains statistics about runtime field data types used in
		 * selected nodes.
		 * <p>
		 * API name: {@code runtime_field_types}
		 * <p>
		 * Adds a value to <code>runtimeFieldTypes</code> using a builder lambda.
		 */
		public final Builder runtimeFieldTypes(
				Function<RuntimeFieldTypes.Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
			return runtimeFieldTypes(fn.apply(new RuntimeFieldTypes.Builder()).build());
		}

		/**
		 * Total number of fields in all non-system indices.
		 * <p>
		 * API name: {@code total_field_count}
		 */
		public final Builder totalFieldCount(@Nullable Long value) {
			this.totalFieldCount = value;
			return this;
		}

		/**
		 * Total number of fields in all non-system indices, accounting for mapping
		 * deduplication.
		 * <p>
		 * API name: {@code total_deduplicated_field_count}
		 */
		public final Builder totalDeduplicatedFieldCount(@Nullable Long value) {
			this.totalDeduplicatedFieldCount = value;
			return this;
		}

		/**
		 * Total size of all mappings after deduplication and compression.
		 * <p>
		 * API name: {@code total_deduplicated_mapping_size}
		 */
		public final Builder totalDeduplicatedMappingSize(@Nullable String value) {
			this.totalDeduplicatedMappingSize = value;
			return this;
		}

		/**
		 * Total size of all mappings, in bytes, after deduplication and compression.
		 * <p>
		 * API name: {@code total_deduplicated_mapping_size_in_bytes}
		 */
		public final Builder totalDeduplicatedMappingSizeInBytes(@Nullable Long value) {
			this.totalDeduplicatedMappingSizeInBytes = value;
			return this;
		}

		/**
		 * Required - Source mode usage count.
		 * <p>
		 * API name: {@code source_modes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>sourceModes</code>.
		 */
		public final Builder sourceModes(Map<String, Integer> map) {
			this.sourceModes = _mapPutAll(this.sourceModes, map);
			return this;
		}

		/**
		 * Required - Source mode usage count.
		 * <p>
		 * API name: {@code source_modes}
		 * <p>
		 * Adds an entry to <code>sourceModes</code>.
		 */
		public final Builder sourceModes(String key, Integer value) {
			this.sourceModes = _mapPut(this.sourceModes, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldTypesMappings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldTypesMappings build() {
			_checkSingleUse();

			return new FieldTypesMappings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldTypesMappings}
	 */
	public static final JsonpDeserializer<FieldTypesMappings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FieldTypesMappings::setupFieldTypesMappingsDeserializer);

	protected static void setupFieldTypesMappingsDeserializer(ObjectDeserializer<FieldTypesMappings.Builder> op) {

		op.add(Builder::fieldTypes, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER), "field_types");
		op.add(Builder::runtimeFieldTypes, JsonpDeserializer.arrayDeserializer(RuntimeFieldTypes._DESERIALIZER),
				"runtime_field_types");
		op.add(Builder::totalFieldCount, JsonpDeserializer.longDeserializer(), "total_field_count");
		op.add(Builder::totalDeduplicatedFieldCount, JsonpDeserializer.longDeserializer(),
				"total_deduplicated_field_count");
		op.add(Builder::totalDeduplicatedMappingSize, JsonpDeserializer.stringDeserializer(),
				"total_deduplicated_mapping_size");
		op.add(Builder::totalDeduplicatedMappingSizeInBytes, JsonpDeserializer.longDeserializer(),
				"total_deduplicated_mapping_size_in_bytes");
		op.add(Builder::sourceModes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"source_modes");

	}

}

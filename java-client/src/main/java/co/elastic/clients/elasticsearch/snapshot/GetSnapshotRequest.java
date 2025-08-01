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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: snapshot.get.Request

/**
 * Get snapshot information.
 * <p>
 * NOTE: The <code>after</code> parameter and <code>next</code> field enable you
 * to iterate through snapshots with some consistency guarantees regarding
 * concurrent creation or deletion of snapshots. It is guaranteed that any
 * snapshot that exists at the beginning of the iteration and is not
 * concurrently deleted will be seen during the iteration. Snapshots
 * concurrently created may be seen during an iteration.
 * 
 * @see <a href="../doc-files/api-spec.html#snapshot.get.Request">API
 *      specification</a>
 */

public class GetSnapshotRequest extends RequestBase {
	@Nullable
	private final String after;

	@Nullable
	private final String fromSortValue;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeRepository;

	@Nullable
	private final Boolean indexDetails;

	@Nullable
	private final Boolean indexNames;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Integer offset;

	@Nullable
	private final SortOrder order;

	private final String repository;

	@Nullable
	private final Integer size;

	@Nullable
	private final String slmPolicyFilter;

	private final List<String> snapshot;

	@Nullable
	private final SnapshotSort sort;

	private final List<SnapshotState> state;

	@Nullable
	private final Boolean verbose;

	// ---------------------------------------------------------------------------------------------

	private GetSnapshotRequest(Builder builder) {

		this.after = builder.after;
		this.fromSortValue = builder.fromSortValue;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeRepository = builder.includeRepository;
		this.indexDetails = builder.indexDetails;
		this.indexNames = builder.indexNames;
		this.masterTimeout = builder.masterTimeout;
		this.offset = builder.offset;
		this.order = builder.order;
		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.size = builder.size;
		this.slmPolicyFilter = builder.slmPolicyFilter;
		this.snapshot = ApiTypeHelper.unmodifiableRequired(builder.snapshot, this, "snapshot");
		this.sort = builder.sort;
		this.state = ApiTypeHelper.unmodifiable(builder.state);
		this.verbose = builder.verbose;

	}

	public static GetSnapshotRequest of(Function<Builder, ObjectBuilder<GetSnapshotRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * An offset identifier to start pagination from as returned by the next field
	 * in the response body.
	 * <p>
	 * API name: {@code after}
	 */
	@Nullable
	public final String after() {
		return this.after;
	}

	/**
	 * The value of the current sort column at which to start retrieval. It can be a
	 * string <code>snapshot-</code> or a repository name when sorting by snapshot
	 * or repository name. It can be a millisecond time value or a number when
	 * sorting by <code>index-</code> or shard count.
	 * <p>
	 * API name: {@code from_sort_value}
	 */
	@Nullable
	public final String fromSortValue() {
		return this.fromSortValue;
	}

	/**
	 * If <code>false</code>, the request returns an error for any snapshots that
	 * are unavailable.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * If <code>true</code>, the response includes the repository name in each
	 * snapshot.
	 * <p>
	 * API name: {@code include_repository}
	 */
	@Nullable
	public final Boolean includeRepository() {
		return this.includeRepository;
	}

	/**
	 * If <code>true</code>, the response includes additional information about each
	 * index in the snapshot comprising the number of shards in the index, the total
	 * size of the index in bytes, and the maximum number of segments per shard in
	 * the index. The default is <code>false</code>, meaning that this information
	 * is omitted.
	 * <p>
	 * API name: {@code index_details}
	 */
	@Nullable
	public final Boolean indexDetails() {
		return this.indexDetails;
	}

	/**
	 * If <code>true</code>, the response includes the name of each index in each
	 * snapshot.
	 * <p>
	 * API name: {@code index_names}
	 */
	@Nullable
	public final Boolean indexNames() {
		return this.indexNames;
	}

	/**
	 * The period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Numeric offset to start pagination from based on the snapshots matching this
	 * request. Using a non-zero value for this parameter is mutually exclusive with
	 * using the after parameter. Defaults to 0.
	 * <p>
	 * API name: {@code offset}
	 */
	@Nullable
	public final Integer offset() {
		return this.offset;
	}

	/**
	 * The sort order. Valid values are <code>asc</code> for ascending and
	 * <code>desc</code> for descending order. The default behavior is ascending
	 * order.
	 * <p>
	 * API name: {@code order}
	 */
	@Nullable
	public final SortOrder order() {
		return this.order;
	}

	/**
	 * Required - A comma-separated list of snapshot repository names used to limit
	 * the request. Wildcard (<code>*</code>) expressions are supported.
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * The maximum number of snapshots to return. The default is 0, which means to
	 * return all that match the request without limit.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Filter snapshots by a comma-separated list of snapshot lifecycle management
	 * (SLM) policy names that snapshots belong to.
	 * <p>
	 * You can use wildcards (<code>*</code>) and combinations of wildcards followed
	 * by exclude patterns starting with <code>-</code>. For example, the pattern
	 * <code>*,-policy-a-\*</code> will return all snapshots except for those that
	 * were created by an SLM policy with a name starting with
	 * <code>policy-a-</code>. Note that the wildcard pattern <code>*</code> matches
	 * all snapshots created by an SLM policy but not those snapshots that were not
	 * created by an SLM policy. To include snapshots that were not created by an
	 * SLM policy, you can use the special pattern <code>_none</code> that will
	 * match all snapshots without an SLM policy.
	 * <p>
	 * API name: {@code slm_policy_filter}
	 */
	@Nullable
	public final String slmPolicyFilter() {
		return this.slmPolicyFilter;
	}

	/**
	 * Required - A comma-separated list of snapshot names to retrieve Wildcards
	 * (<code>*</code>) are supported.
	 * <ul>
	 * <li>To get information about all snapshots in a registered repository, use a
	 * wildcard (<code>*</code>) or <code>_all</code>.</li>
	 * <li>To get information about any snapshots that are currently running, use
	 * <code>_current</code>.</li>
	 * </ul>
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final List<String> snapshot() {
		return this.snapshot;
	}

	/**
	 * The sort order for the result. The default behavior is sorting by snapshot
	 * start time stamp.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final SnapshotSort sort() {
		return this.sort;
	}

	/**
	 * Only return snapshots with a state found in the given comma-separated list of
	 * snapshot states. The default is all snapshot states.
	 * <p>
	 * API name: {@code state}
	 */
	public final List<SnapshotState> state() {
		return this.state;
	}

	/**
	 * If <code>true</code>, returns additional information about each snapshot such
	 * as the version of Elasticsearch which took the snapshot, the start and end
	 * times of the snapshot, and the number of shards snapshotted.
	 * <p>
	 * NOTE: The parameters <code>size</code>, <code>order</code>,
	 * <code>after</code>, <code>from_sort_value</code>, <code>offset</code>,
	 * <code>slm_policy_filter</code>, and <code>sort</code> are not supported when
	 * you set <code>verbose=false</code> and the sort order for requests with
	 * <code>verbose=false</code> is undefined.
	 * <p>
	 * API name: {@code verbose}
	 */
	@Nullable
	public final Boolean verbose() {
		return this.verbose;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSnapshotRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetSnapshotRequest> {
		@Nullable
		private String after;

		@Nullable
		private String fromSortValue;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeRepository;

		@Nullable
		private Boolean indexDetails;

		@Nullable
		private Boolean indexNames;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Integer offset;

		@Nullable
		private SortOrder order;

		private String repository;

		@Nullable
		private Integer size;

		@Nullable
		private String slmPolicyFilter;

		private List<String> snapshot;

		@Nullable
		private SnapshotSort sort;

		@Nullable
		private List<SnapshotState> state;

		@Nullable
		private Boolean verbose;

		/**
		 * An offset identifier to start pagination from as returned by the next field
		 * in the response body.
		 * <p>
		 * API name: {@code after}
		 */
		public final Builder after(@Nullable String value) {
			this.after = value;
			return this;
		}

		/**
		 * The value of the current sort column at which to start retrieval. It can be a
		 * string <code>snapshot-</code> or a repository name when sorting by snapshot
		 * or repository name. It can be a millisecond time value or a number when
		 * sorting by <code>index-</code> or shard count.
		 * <p>
		 * API name: {@code from_sort_value}
		 */
		public final Builder fromSortValue(@Nullable String value) {
			this.fromSortValue = value;
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error for any snapshots that
		 * are unavailable.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes the repository name in each
		 * snapshot.
		 * <p>
		 * API name: {@code include_repository}
		 */
		public final Builder includeRepository(@Nullable Boolean value) {
			this.includeRepository = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes additional information about each
		 * index in the snapshot comprising the number of shards in the index, the total
		 * size of the index in bytes, and the maximum number of segments per shard in
		 * the index. The default is <code>false</code>, meaning that this information
		 * is omitted.
		 * <p>
		 * API name: {@code index_details}
		 */
		public final Builder indexDetails(@Nullable Boolean value) {
			this.indexDetails = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes the name of each index in each
		 * snapshot.
		 * <p>
		 * API name: {@code index_names}
		 */
		public final Builder indexNames(@Nullable Boolean value) {
			this.indexNames = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Numeric offset to start pagination from based on the snapshots matching this
		 * request. Using a non-zero value for this parameter is mutually exclusive with
		 * using the after parameter. Defaults to 0.
		 * <p>
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable Integer value) {
			this.offset = value;
			return this;
		}

		/**
		 * The sort order. Valid values are <code>asc</code> for ascending and
		 * <code>desc</code> for descending order. The default behavior is ascending
		 * order.
		 * <p>
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable SortOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of snapshot repository names used to limit
		 * the request. Wildcard (<code>*</code>) expressions are supported.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * The maximum number of snapshots to return. The default is 0, which means to
		 * return all that match the request without limit.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Filter snapshots by a comma-separated list of snapshot lifecycle management
		 * (SLM) policy names that snapshots belong to.
		 * <p>
		 * You can use wildcards (<code>*</code>) and combinations of wildcards followed
		 * by exclude patterns starting with <code>-</code>. For example, the pattern
		 * <code>*,-policy-a-\*</code> will return all snapshots except for those that
		 * were created by an SLM policy with a name starting with
		 * <code>policy-a-</code>. Note that the wildcard pattern <code>*</code> matches
		 * all snapshots created by an SLM policy but not those snapshots that were not
		 * created by an SLM policy. To include snapshots that were not created by an
		 * SLM policy, you can use the special pattern <code>_none</code> that will
		 * match all snapshots without an SLM policy.
		 * <p>
		 * API name: {@code slm_policy_filter}
		 */
		public final Builder slmPolicyFilter(@Nullable String value) {
			this.slmPolicyFilter = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of snapshot names to retrieve Wildcards
		 * (<code>*</code>) are supported.
		 * <ul>
		 * <li>To get information about all snapshots in a registered repository, use a
		 * wildcard (<code>*</code>) or <code>_all</code>.</li>
		 * <li>To get information about any snapshots that are currently running, use
		 * <code>_current</code>.</li>
		 * </ul>
		 * <p>
		 * API name: {@code snapshot}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>snapshot</code>.
		 */
		public final Builder snapshot(List<String> list) {
			this.snapshot = _listAddAll(this.snapshot, list);
			return this;
		}

		/**
		 * Required - A comma-separated list of snapshot names to retrieve Wildcards
		 * (<code>*</code>) are supported.
		 * <ul>
		 * <li>To get information about all snapshots in a registered repository, use a
		 * wildcard (<code>*</code>) or <code>_all</code>.</li>
		 * <li>To get information about any snapshots that are currently running, use
		 * <code>_current</code>.</li>
		 * </ul>
		 * <p>
		 * API name: {@code snapshot}
		 * <p>
		 * Adds one or more values to <code>snapshot</code>.
		 */
		public final Builder snapshot(String value, String... values) {
			this.snapshot = _listAdd(this.snapshot, value, values);
			return this;
		}

		/**
		 * The sort order for the result. The default behavior is sorting by snapshot
		 * start time stamp.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable SnapshotSort value) {
			this.sort = value;
			return this;
		}

		/**
		 * Only return snapshots with a state found in the given comma-separated list of
		 * snapshot states. The default is all snapshot states.
		 * <p>
		 * API name: {@code state}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>state</code>.
		 */
		public final Builder state(List<SnapshotState> list) {
			this.state = _listAddAll(this.state, list);
			return this;
		}

		/**
		 * Only return snapshots with a state found in the given comma-separated list of
		 * snapshot states. The default is all snapshot states.
		 * <p>
		 * API name: {@code state}
		 * <p>
		 * Adds one or more values to <code>state</code>.
		 */
		public final Builder state(SnapshotState value, SnapshotState... values) {
			this.state = _listAdd(this.state, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, returns additional information about each snapshot such
		 * as the version of Elasticsearch which took the snapshot, the start and end
		 * times of the snapshot, and the number of shards snapshotted.
		 * <p>
		 * NOTE: The parameters <code>size</code>, <code>order</code>,
		 * <code>after</code>, <code>from_sort_value</code>, <code>offset</code>,
		 * <code>slm_policy_filter</code>, and <code>sort</code> are not supported when
		 * you set <code>verbose=false</code> and the sort order for requests with
		 * <code>verbose=false</code> is undefined.
		 * <p>
		 * API name: {@code verbose}
		 */
		public final Builder verbose(@Nullable Boolean value) {
			this.verbose = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSnapshotRequest build() {
			_checkSingleUse();

			return new GetSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.get}".
	 */
	public static final Endpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.get",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				propsSet |= _repository;
				propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.snapshot.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				propsSet |= _repository;
				propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					params.put("repository", request.repository);
					params.put("snapshot", request.snapshot.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.offset != null) {
					params.put("offset", String.valueOf(request.offset));
				}
				if (request.fromSortValue != null) {
					params.put("from_sort_value", request.fromSortValue);
				}
				if (request.indexNames != null) {
					params.put("index_names", String.valueOf(request.indexNames));
				}
				if (request.indexDetails != null) {
					params.put("index_details", String.valueOf(request.indexDetails));
				}
				if (request.sort != null) {
					params.put("sort", request.sort.jsonValue());
				}
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.includeRepository != null) {
					params.put("include_repository", String.valueOf(request.includeRepository));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.after != null) {
					params.put("after", request.after);
				}
				if (ApiTypeHelper.isDefined(request.state)) {
					params.put("state",
							request.state.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.slmPolicyFilter != null) {
					params.put("slm_policy_filter", request.slmPolicyFilter);
				}
				if (request.order != null) {
					params.put("order", request.order.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetSnapshotResponse._DESERIALIZER);
}

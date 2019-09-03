namespace pro.travelin

@paginated(
  inputToken: "nextToken",
  outputToken: "nextToken",
  pageSize: "pageSize"
)
@protocols([
  { name: "aws.rest-json-1.1" }
])
service Everywhere {
  version: "2019-09-01",
  resources: [ Itenerary ]
}

resource Itenerary {
  identifiers: { iteneraryId: IteneraryId },
  read: GetItenerary,
  list: ListIteneraries
}

string IteneraryId

@readonly
@http(method: "GET", "uri": "/iteneraries/{iteneraryId}", code: 200)
operation GetItenerary(GetIteneraryInput) -> GetIteneraryOutput errors [NoSuchResource]

structure GetIteneraryInput {
  @required
  @httpLabel
  iteneraryId: IteneraryId
}

structure GetIteneraryOutput {
  @required
  name: String
}

@readonly
@paginated(items: "items")
@http(method: "GET", uri: "/iteneraries", code: 200)
operation ListIteneraries(ListItenerariesInput) -> ListItenerariesOutput

structure ListItenerariesInput {
  @httpQuery("nextToken")
  nextToken: String,
  @httpQuery("limit")
  pageSize: Integer
}

structure ListItenerariesOutput {
  @required
  items: ItenerarySummaries,
  nextToken: String
}

list ItenerarySummaries {
  member: ItenerarySummary
}

@references([{resource: Itenerary}])
structure ItenerarySummary {
  @required
  iteneraryId: IteneraryId
}

@error("client")
@httpError(404)
structure NoSuchResource {
  @required
  resourceType: String
}

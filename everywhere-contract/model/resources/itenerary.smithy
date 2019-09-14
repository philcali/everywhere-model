namespace pro.travelin

string IteneraryId

resource Itenerary {
  identifiers: { iteneraryId: IteneraryId },
  read: GetItenerary,
  list: ListIteneraries,
  create: CreateItenerary,
  update: UpdateItenerary,
  delete: DeleteItenerary
}

@idempotent
@http(method: "DELETE", uri: "/iteneraries/{iteneraryId}", code: 204)
operation DeleteItenerary(DeleteIteneraryInput)

structure DeleteIteneraryInput {
  @httpLabel
  @required
  iteneraryId: IteneraryId
}

@http(method: "PUT", uri: "/iteneraries/{iteneraryId}", code: 200)
operation UpdateItenerary(UpdateIteneraryInput) -> UpdateIteneraryOutput errors [NoSuchResource, InvalidInput]

structure UpdateIteneraryInput {
  @httpLabel
  @required
  iteneraryId: IteneraryId,
  name: String,
  description: String,
  startTime: Timestamp,
  endTime: Timestamp
}

structure UpdateIteneraryOutput {
  itenerary: ItenerarySummary
}

@http(method: "POST", uri: "/iteneraries", code: 200)
operation CreateItenerary(CreateIteneraryInput) -> CreateIteneraryOutput errors [ResourceInUse, InvalidInput]

structure CreateIteneraryInput {
  @required
  name: String,
  description: String,
  @required
  startTime: Timestamp,
  endTime: Timestamp
}

structure CreateIteneraryOutput {
  itenerary: ItenerarySummary
}

@readonly
@http(method: "GET", uri: "/iteneraries/{iteneraryId}", code: 200)
operation GetItenerary(GetIteneraryInput) -> GetIteneraryOutput errors [NoSuchResource]

structure GetIteneraryInput {
  @required
  @httpLabel
  iteneraryId: IteneraryId
}

structure GetIteneraryOutput {
  @required
  itenerary: ItenerarySummary
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
  iteneraryId: IteneraryId,
  @required
  name: String,
  description: String,
  startTime: Timestamp,
  endTime: Timestamp
}

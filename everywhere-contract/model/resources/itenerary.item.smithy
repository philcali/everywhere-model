namespace pro.travelin

string ItemId

resource IteneraryItem {
  identifiers: { iteneraryId: IteneraryId, itemId: ItemId },
  read: GetIteneraryItem,
  list: ListIteneraryItems,
  create: CreateIteneraryItem,
  update: UpdateIteneraryItem,
  delete: DeleteIteneraryItem
}

@http(method: "PUT", uri: "/iteneraries/{iteneraryId}/items/{itemId}", code: 200)
operation UpdateIteneraryItem(UpdateIteneraryItemInput) -> UpdateIteneraryItemOutput errors [NoSuchResource, InvalidInput]

structure UpdateIteneraryItemInput {
  @httpLabel
  @required
  iteneraryId: IteneraryId,
  @httpLabel
  @required
  itemId: ItemId,
  description: String,
  startTime: Timestamp,
  endTime: Timestamp
}

structure UpdateIteneraryItemOutput {
  iteneraryItem: IteneraryItemSummary
}

@http(method: "POST", uri: "/iteneraries/{iteneraryId}/items", code: 200)
operation CreateIteneraryItem(CreateIteneraryItemInput) -> CreateIteneraryItemOutput errors [ResourceInUse, InvalidInput]

structure CreateIteneraryItemInput {
  @httpLabel
  @required
  iteneraryId: IteneraryId,
  name: String,
  description: String,
  itemType: String,
  startTime: Timestamp,
  endTime: Timestamp
}

structure CreateIteneraryItemOutput {
  iteneraryItem: IteneraryItemSummary
}

@idempotent
@http(method: "DELETE", uri: "/iteneraries/{iteneraryId}/items/{itemId}", code: 204)
operation DeleteIteneraryItem(DeleteIteneraryItemInput)

structure DeleteIteneraryItemInput {
  @httpLabel
  @required
  iteneraryId: IteneraryId,
  @httpLabel
  @required
  itemId: ItemId
}

@readonly
@http(method: "GET", uri: "/iteneraries/{iteneraryId}/items/{itemId}", code: 200)
operation GetIteneraryItem(GetIteneraryItemInput) -> GetIteneraryItemOutput errors [NoSuchResource]

structure GetIteneraryItemInput {
  @required
  @httpLabel
  iteneraryId: IteneraryId,
  @required
  @httpLabel
  itemId: ItemId
}

structure GetIteneraryItemOutput {
  @required
  iteneraryItem: IteneraryItemSummary
}


@readonly
@paginated(items: "items")
@http(method: "GET", uri: "/iteneraries/{iteneraryId}/items", code: 200)
operation ListIteneraryItems(ListIteneraryItemsInput) -> ListIteneraryItemsOutput

structure ListIteneraryItemsInput {
  @required
  @httpLabel
  iteneraryId: IteneraryId,
  @httpQuery("nextToken")
  nextToken: String,
  @httpQuery("limit")
  pageSize: Integer
}

structure ListIteneraryItemsOutput {
  @required
  items: IteneraryItemSummaries,
  nextToken: String
}

list IteneraryItemSummaries {
  member: IteneraryItemSummary
}

@references([{resource: IteneraryItem}])
structure IteneraryItemSummary {
  @required
  iteneraryId: IteneraryId,
  @required
  itemId: ItemId,
  @required
  name: String,
  description: String,
  @required
  itemType: String,
  startTime: Timestamp,
  endTime: Timestamp
}

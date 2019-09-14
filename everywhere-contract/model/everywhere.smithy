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
  resources: [ Itenerary, IteneraryItem ]
}

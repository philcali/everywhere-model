namespace pro.travelin

@error("client")
@httpError(404)
structure NoSuchResource {
  @required
  resourceType: String
}

@error("client")
@httpError(400)
structure InvalidInput {
  @required
  resourceType: String
}

@error("client")
@httpError(409)
structure ResourceInUse {
  @required
  resourceType: String
}

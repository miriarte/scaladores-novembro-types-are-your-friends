object P4TypeAlias1 {

  def somethingWeird(p1: String, p2: String): Boolean = ???

  val org = "Org1"
  val user = "Warcos"
  val role = "Role2"

  def process(org: String, user: String, role: String): Boolean = ???

  process(org, user, role) // ok

  process(role, org, user) // wow, wait!


}

object P4TypeAlias2{

  type OrgId = String
  type RoleId = String
  type UserId = String

  val orgId: OrgId = "Org1"
  val userId:UserId = "Warcos"
  val roleId:RoleId = "Role2"

  def process2(org: OrgId, user: UserId, role: RoleId): Boolean = ???

  process2(orgId, userId, roleId)

  process2(roleId, orgId, userId)


}

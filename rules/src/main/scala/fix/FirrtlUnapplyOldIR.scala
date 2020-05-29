package fix

import scalafix.v1._
import scala.meta._

class FirrtlUnapplyOldIR extends SemanticRule("FirrtlUnapplyOldIR") {

  val newArity = Map(
    "Reference" -> 4,
    "SubField" -> 4,
    "SubIndex" -> 4,
    "SubAccess" -> 4,
    "DefInstance" -> 4
  )

  override def fix(implicit doc: SemanticDocument): Patch = {
    doc.tree.collect {
      case t @ Pat.Extract(Term.Name(patName), args) if newArity.contains(patName) =>
        Patch.replaceTree(t, t.copy(args = args.padTo(newArity(patName), Pat.Wildcard())).toString)
      case t @ Pat.Extract(Term.Select(q, Term.Name(patName)), args) if newArity.contains(patName) =>
        Patch.replaceTree(t, t.copy(args = args.padTo(newArity(patName), Pat.Wildcard())).toString)
    }.asPatch
  }

}

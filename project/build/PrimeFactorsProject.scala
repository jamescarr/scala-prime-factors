import sbt._

class PrimeFactorsProject(info: ProjectInfo) extends DefaultProject(info){
  val scalatest = "org.scala-tools.testing" % "specs" % "1.6.2.1"
}

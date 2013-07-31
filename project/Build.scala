import sbt._
import Keys._
import play.Project._
 
object ApplicationBuild extends Build {
 
  val appName         = "dm-forms-example"
  val appVersion      = "0.1"

  val appDependencies = Seq(
      "org.dupontmanual" %% "dm-forms" % "0.1-SNAPSHOT"
  )
 
  val main = play.Project(
    appName, appVersion, appDependencies
  ).settings(
    scalaVersion := "2.10.2",
    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  )
 
}

 import play.Project._

 name := "DiagramCreator"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

val appDependencies = Seq(
	"postgresql" % "postgresql" % "9.3-1100.jdbc41",
	javaEbean
)

play.Project.playJavaSettings
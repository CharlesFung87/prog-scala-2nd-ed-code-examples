resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  Classpaths.typesafeResolver
)

//updated from 3.0.0
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")
                

name := "bigdata-wikipedia"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-deprecation")

// grading libraries
libraryDependencies += "junit" % "junit" % "4.10" % "test"
libraryDependencies +=   "org.apache.spark" %% "spark-core" % "1.6.2"

//Include the common dir
commonSourcePackages += "common"

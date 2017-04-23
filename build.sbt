enablePlugins(AndroidApp)

platformTarget := "android-25"

libraryDependencies += "com.android.support" % "appcompat-v7"  % "25.3.1"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

enablePlugins(AndroidProtify)

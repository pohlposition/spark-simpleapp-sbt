//Instructions for creating this Simple App are found here:
//  http://spark.apache.org/docs/latest/quick-start.html

name := "spark-template-sbt"

version := "1.0"

scalaVersion := "2.10.5"
//Databricks uses 2.10.5 (as of 02/12/2016)

libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.6.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.0"


// Your username to login to Databricks
//dbcUsername := "myuser"

// Your password (Can be set as an environment variable)
//dbcPassword := "mypass"

// Gotcha: Setting environment variables in IDE's may differ. IDE's usually don't pick up environment variables from .bash_profile or .bashrc

// The URL to the Databricks REST API
//dbcApiUrl := "https://dogfood.staging.cloud.databricks.com/api/1.2"

// Add any clusters that you would like to deploy your work to. e.g. "My Cluster"
//dbcClusters += "jason"  // Add "ALL_CLUSTERS" if you want to attach your work to all clusters

// An optional parameter to set the location to upload your libraries to in the workspace e.g. "/home/USER/libraries"
// This location must be an existing path.
// NOTE: Specifying this parameter is *strongly* recommended as many jars will be uploaded to your cluster.
// Putting them in one folder will make it easy for your to delete all the libraries at once.
//dbcLibraryPath := "/home/jason@databricks.com/lib/"  // Default is "/"

// Whether to restart the clusters everytime a new version is uploaded to Databricks.
//dbcRestartOnAttach := false // Default true


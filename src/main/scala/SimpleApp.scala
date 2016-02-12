/* SimpleApp.scala
*
* Example Taken From:
*   http://spark.apache.org/docs/latest/quick-start.html
*
* */

import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext

object SimpleApp {
  def main(args: Array[String]) {

    val sc =  SparkContext.getOrCreate()
    val sqlContext = SQLContext.getOrCreate(sc)

    for(t <- sqlContext.tables().collect()) {
      println(t)
    }

  }
}



#!/snap/bin/kotlinc -script

/// At <https://youtu.be/C2w45qRc3aU?t=146>

data class NumberWithLogs (
  val result: Double,
  val logs: List<String>,
)

fun wrapWithLogs(x: Double) = NumberWithLogs(
  result = x,
  logs = emptyList(),
)

fun square(x: NumberWithLogs) = NumberWithLogs(
  result = x.result * x.result,
  logs = x.logs.plusElement("Squared ${x.result} to get ${x.result * x.result}."),
)

fun addOne(x: NumberWithLogs) = NumberWithLogs(
  result = x.result + 1,
  logs = x.logs.plusElement("Added 1 to ${x.result} to get ${x.result + 1}."),
)

println(square(square(wrapWithLogs(2.0))))
println(addOne(wrapWithLogs(5.0)))

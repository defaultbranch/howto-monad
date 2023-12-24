#!/snap/bin/kotlinc -script

/// At <https://youtu.be/C2w45qRc3aU?t=146>

data class NumberWithLogs (
  val result: Double,
  val logs: List<String>,
)

fun square(x: NumberWithLogs) = NumberWithLogs(
  result = x.result * x.result,
  logs = x.logs.plus("Squared ${x.result} to get ${x.result * x.result}."),
)

fun addOne(x: NumberWithLogs) = NumberWithLogs(
  result = x.result + 1,
  logs = x.logs.plus("Added 1 to ${x.result} to get ${x.result + 1}."),
)

fun wrapWithLogs(x: Double) = NumberWithLogs(
  result = x,
  logs = emptyList(),
)

println(square(square(wrapWithLogs(2.0))))
println(addOne(wrapWithLogs(5.0)))

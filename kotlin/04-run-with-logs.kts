#!/snap/bin/kotlinc -script

/// At <https://youtu.be/C2w45qRc3aU?t=254>

data class NumberWithLogs (
  val result: Double,
  val logs: List<String>,
)

fun square(x: Double) = NumberWithLogs(
  result = x * x,
  logs = listOf("Squared ${x} to get ${x * x}."),
)

fun addOne(x: Double) = NumberWithLogs(
  result = x + 1,
  logs = listOf("Added 1 to ${x} to get ${x + 1}."),
)

fun wrapWithLogs(x: Double) = NumberWithLogs(
  result = x,
  logs = emptyList(),
)

fun runWithLogs(
  input: NumberWithLogs,
  transform: (Double) -> NumberWithLogs
): NumberWithLogs {
  val newNumberWithLogs = transform(input.result)
  return NumberWithLogs(
    result = newNumberWithLogs.result,
    logs = input.logs.plus(newNumberWithLogs.logs)
  )
}

val a = wrapWithLogs(5.0)
val b = runWithLogs(a, ::addOne)
val c = runWithLogs(b, ::square)
println(c)

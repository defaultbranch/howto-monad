#!/snap/bin/kotlinc -script

/// At <https://youtu.be/C2w45qRc3aU?t=104>

// code with logging

interface NumberWithLogs {
  val result: Double
  val logs: List<String>
}

fun square(x: Double): NumberWithLogs = object: NumberWithLogs {
  override val result = x * x
  override val logs = listOf("Squared ${x} to get ${x * x}.")
}

fun addOne(x: NumberWithLogs): NumberWithLogs = object: NumberWithLogs {
  override val result = x.result + 1
  override val logs = x.logs.plusElement("Added 1 to ${x.result} to get ${x.result + 1}.")
}

println(addOne(square(2.0)))

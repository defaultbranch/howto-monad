#!/snap/bin/kotlinc -script

/// At <https://youtu.be/C2w45qRc3aU?t=35>

// starting code
fun square(x: Double): Double = x * x
fun addOne(x: Double): Double = x + 1

// starting call
println(addOne(square(2.0)))

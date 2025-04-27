package odevlerim

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun rectanglePerimeter(length: Double, width: Double): Double {
    return 2 * (length + width)
}

fun factorial(n: Int): Long {
    if (n == 0) return 1
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun countA(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}

fun interiorAnglesSum(sides: Int): Int {
    return (sides - 2) * 180
}

fun calculateSalary(daysWorked: Int): Double {
    val hoursWorked = daysWorked * 8
    val regularPay = hoursWorked * 10
    val overtimeHours = if (hoursWorked > 160) hoursWorked - 160 else 0
    val overtimePay = overtimeHours * 20
    return regularPay + overtimePay
}

fun calculateDataFee(dataUsedGB: Double): Double {
    val baseFee = 100.0 // For 50 GB
    val additionalFee = if (dataUsedGB > 50) (dataUsedGB - 50) * 4 else 0.0
    return baseFee + additionalFee
}

fun main() {
    // Test the functions
    println("Celsius to Fahrenheit (25°C): ${celsiusToFahrenheit(25.0)}")
    println("Rectangle Perimeter (length=5, width=10): ${rectanglePerimeter(5.0, 10.0)}")
    println("Factorial of 5: ${factorial(5)}")
    println("Count of 'a' in 'Kotlin': ${countA("Kotlin")}")
    println("Interior Angles Sum of a hexagon (6 sides): ${interiorAnglesSum(6)}")
    println("Salary for 20 workdays: ${calculateSalary(20)}")
    println("Data usage fee for 70 GB: ${calculateDataFee(70.0)}")
}

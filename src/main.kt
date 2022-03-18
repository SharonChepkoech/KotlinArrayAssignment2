fun main(){
    var total=prodIntArray(arrayOf(1,2))
    println(total)
    var totals =sumDecimal(arrayOf(12.3,12,24.7,"boy",37.43F))
    println(totals)
    var totol = returnCharArray(arrayOf('h','a','n','e','p'))
    println(totol)
}
fun prodIntArray(numbers: Array<Int>): Int{
    var product= 1
    numbers.forEach { number->
        product*=number
    }
    return product
}
fun sumDecimal(type:Array<Any>): Double{
    var sum = 0.00
    type.forEach { num->
        if(num is Double) {
            sum += num
        }
    }
    return sum
}
fun returnCharArray(identity:Array<Any>): Int {
    var num = 0
    for (letter in identity)
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            ++num

        }
    return num
}


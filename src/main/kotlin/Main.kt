fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(sumEvenNumbers(numbers))

    val numbers2 = listOf(-2, 5, 0, 10, -1, 3)
    val positive = positiveNumbers(numbers)
    println(positive)

    val chars = listOf('a', 'b', 'c', 'D', 'e', 'f', 'G')
    val vowels = vowels(chars)
    println(vowels)


}
//Write a function that takes a list of integers as input and returns
//the sum of all the even numbers in the list.
fun sumEvenNumbers(numbers: List<Int>): Int {
    var total = 0
    for (num in numbers) {
        if (num % 2 == 0) {
            total += num
        }
    }
    return total
}

//Write a function that takes a list of integers as input and returns a new list
//containing only the positive numbers in the input list.
fun positiveNumbers(numbers: List<Int>): List<Int> {
    val positiveNumbers = mutableListOf<Int>()
    for (num in numbers) {
        if (num > 0) {
            positiveNumbers.add(num)
        }
    }
    return positiveNumbers
}

//Write a function that takes a list of characters as input
//and returns a new list containing only the vowels in the input list.
fun vowels(chars: List<Char>): List<Char> {
    val vowelList = mutableListOf<Char>()
    for (char in chars) {
        if (char.toLowerCase() in listOf('a', 'e', 'i', 'o', 'u')) {
            vowelList.add(char)
        }
    }
    return vowelList
}


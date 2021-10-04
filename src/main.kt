fun main() {
    // Initialize variables
    var count = 0
    var correct = 0
    // Array of questions
    val questions = arrayOf(
        "______ _____ is the main protagonist of the Halo Series."
        ,"The Master Chief is supported by an AI called _______."
        ,"343 ______ _____ is the monitor of Installation 04."
        ,"The _____ caused the downfall of Forerunner civilization"
        ,"The name of the Elite that Master Chief teams up with in Halo 3 is called The _______")
    // Array of Answers
    val answers = arrayOf(
        "master chief"
        ,"cortana"
        ,"guilty spark"
        ,"flood"
        ,"arbiter")

    // Inform the user what this script does
    println("This is a 5 question quiz on Halo knowledge")
    // Print a question from the array and get user input
    do {
        println(questions[count])
        val userInput = readLine()
        val tempAnswer = answers[count]
        count ++
        // Compare user input to answer array
        if (userInput!!.contains(tempAnswer, ignoreCase = true)){
            // Add one to the score and print correct
            println("Correct!")
            correct ++
        }
        // If incorrect the user the correct answer
        else
            println("Incorrect. The correct answer is $tempAnswer")
    // Loop through all 5 questions in the array
    }while (count != 5)
    // Tell the user how many they got right.
    println("You got $correct correct.")
}
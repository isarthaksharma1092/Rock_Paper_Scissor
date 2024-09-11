fun main(){
    print("**************************************************************************************************************\n")
    print("******************************************* ROCK PAPER & SCISSOR *********************************************")

    startGame()
}

fun startGame(){
    //USER INPUT
    print("\n**************************************************************************************************************\n")

    print("\nEnter your Choice ! ROCK PAPER SCISSOR ?:")
    val userInput = readln().uppercase()

    
    if(userInput !in listOf("ROCK","PAPER","SCISSOR"))
    {
        println("Well you made a wrong choice here! , I think its a typo '$userInput'")
        println("Let's re-try")
        startGame()
    }
    
    else{
        println("Player's Choice : ${userInput}")
        val computerInput = playingGame()
        winner(userInput,computerInput)
    }
}


fun playingGame():String
{
    //COMPUTER INPUT
    val computerInput = (1..3).random()
    val ComputerChoice:String = 
    when(computerInput)
    {
        1->"ROCK"
        2->"PAPER"
        3->"SCISSOR"
        else ->"Computer can't make a choice !"
    }

    println("Computer's Choice: $ComputerChoice")
    return ComputerChoice

}

fun winner(userInput:String,ComputerChoice:String)
{
    when{
        userInput == ComputerChoice -> println("uhh Its a Tie.")
        userInput == "ROCK" && ComputerChoice == "SCISSOR" -> println("\nYou win! ROCK beats SCISSOR.")
        userInput == "PAPER" && ComputerChoice == "ROCK" -> println("\nYou win! PAPER beats ROCK.")
        userInput == "SCISSOR" && ComputerChoice == "PAPER" -> println("\nYou win! SCISSOR beats PAPER.")
        ComputerChoice == "ROCK" && userInput == "SCISSOR" -> println("\nYou lose! ROCK beats SCISSOR.")
        ComputerChoice == "PAPER" && userInput == "ROCK" -> println("\nYou lose! PAPER beats ROCK.")
        ComputerChoice == "SCISSOR" && userInput == "PAPER" -> println("\nYou lose! SCISSOR beats PAPER.")
    }

    print("\nDo you wanna go again! (Y/N) : ")
    val temp:String = readln().uppercase()
    if(temp == "Y"||temp ==  "YES"){
        println("\nOkay then lets go for another Round")
        startGame()
    }
    else{
        println("Yeah, I feel tiring too! ")
        println("Lets play sometime later Bye")
    }
}
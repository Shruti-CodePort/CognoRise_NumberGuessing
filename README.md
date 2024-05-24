# CognoRise_NumberGuessing
This code is a Java implementation of a simple Number Guessing Game. The game generates a random number between 1 and 10, and the player has a maximum of 5 attempts to guess the correct number.

Here's a breakdown of how the code works:

1. The program imports the necessary Java utilities (`java.util.Scanner` and `java.util.Random`).
2. The `NumberGuessing` class is defined, which contains the `main` method.
3. The maximum number of attempts allowed is set to 5 using the constant `MAX_ATTEMPTS`.
4. Inside the `main` method, a `Scanner` object is created to read input from the user, and a `Random` object is created to generate a random number.
5. A random number between 1 and 10 is generated using `rand.nextInt(10) + 1` and stored in the `randomNumber` variable.
6. The `attempts` counter is initialized to 0, and the `guessedCorrectly` flag is set to `false`.
7. The program prints a header for the Number Guessing Game.
8. A `while` loop is used to control the game flow, which continues until the player has used all available attempts or guessed the correct number.
9. Inside the loop, the player is prompted to enter their guess between 1 and 10.
10. The `attempts` counter is incremented by 1.
11. If the player's guess matches the `randomNumber`, a congratulatory message is printed, the `guessedCorrectly` flag is set to `true`, and the loop is exited using the `break` statement.
12. If the player's guess is lower than the `randomNumber`, a message indicating that the guess is too low is printed.
13. If the player's guess is higher than the `randomNumber`, a message indicating that the guess is too high is printed.
14. After the loop ends, the program checks the value of the `guessedCorrectly` flag.
15. If `guessedCorrectly` is `false`, it means the player has used all available attempts without guessing the correct number. In this case, the program prints a message revealing the correct number.
16. If `guessedCorrectly` is `true`, it means the player has guessed the correct number. In this case, the program prints a message indicating the number of attempts it took to guess the correct number.

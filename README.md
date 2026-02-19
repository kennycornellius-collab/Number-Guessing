# Number Guessing Game

A Java-based number guessing game that explores AI decision-making strategies through interactive gameplay and automated tournaments. This project demonstrates how different search algorithms perform in competitive scenarios, comparing random guessing against binary search optimization.

## Project Overview

This project was built to understand fundamental AI concepts like search algorithms and heuristics before formal machine learning coursework. While it uses simple game mechanics, it showcases real algorithmic thinking that underlies more complex AI systems.

## AI Strategies Implemented

### Smart AI (Binary Search)
- Uses binary search algorithm to systematically eliminate half the search space with each guess
- Adjusts search range based on "higher/lower" feedback
- Guarantees finding the answer in log₂(n) guesses at most
- On a 1-100 range: averages 6-7 guesses

### Dumb AI (Random Guessing)
- Picks randomly from remaining possibilities
- Tracks already-guessed numbers to avoid repeats
- No strategic narrowing of search space
- On a 1-100 range: highly variable performance

## 🎮 Game Modes

1. **Human vs Human** - Two players compete to guess each other's numbers
2. **Human vs AI Dumb** - Test your skills against random guessing
3. **Human vs AI Smart** - Challenge the binary search algorithm
4. **Tournament Mode** - Run automated AI vs AI games (100-1000 rounds) to compare strategies
5. **Stats Tracker** - View performance metrics across games

## 📊 Tournament Results

Example results from 1000-game tournaments:

**Range: 1-10**
```
AI Smart:  722 wins (72.2%)  |  Avg guesses: ~3-4
AI Dumb:   278 wins (27.8%)  |  Avg guesses: ~5-6
```

**Range: 1-100**
```
AI Smart:  942 wins (94.2%+)  |  Avg guesses: ~5-7
AI Dumb:   58 wins (5.8%)  |  Avg guesses: highly variable
```

**Key Insight:** As the problem size increases, algorithmic efficiency (binary search) dramatically outperforms random guessing. This demonstrates why algorithm choice matters in AI and machine learning.

## 🏗️ Project Structure

```
├── Player.java         # Base class for all player types
├── HumanPlayer.java    # Handles keyboard input from human players
├── AIDumb.java         # Random guessing AI with duplicate tracking
├── AISmart.java        # Binary search AI with adaptive range narrowing
├── Game.java           # Game controller and main loop
└── Stats.java          # Performance tracking across games
```

## 💡 Key OOP Concepts Used

- **Inheritance:** `HumanPlayer`, `AIDumb`, and `AISmart` all extend `Player`
- **Polymorphism:** Game loop calls `makeGuess()` on any `Player` type without knowing the specific implementation
- **Encapsulation:** Each class manages its own state (guess history, search bounds, etc.)
- **Composition:** `Game` contains `Player` objects rather than extending them

## 🚀 How to Run

```bash
# Compile all Java files
javac *.java

# Run the game
java Game
```

Follow the on-screen menu to select a game mode.

## 📈 What I Learned

- **Algorithm design:** How binary search systematically narrows possibilities vs. random guessing
- **Performance analysis:** Using tournaments to empirically compare strategies
- **Object-oriented design:** Building a flexible system where different player types can be swapped seamlessly
- **Git workflow:** Making meaningful commits, working across multiple machines, and maintaining a clean repository
- **Problem-solving:** Debugging scanner conflicts, infinite loops, and stats calculation logic

## 🔮 Future Improvements

- Add AI vs AI mode with both AIs using different strategies (e.g., Smart vs Smart with different ranges)
- Implement a graphical UI to visualize the binary search process
- Add difficulty levels that limit the number of guesses allowed
- Export tournament results to CSV for further analysis
- Add more AI strategies (e.g., weighted random guessing based on probability distributions)

## 🛠️ Technologies

- **Language:** Java
- **Concepts:** Search algorithms, OOP, statistics tracking
- **Tools:** Git, GitHub, VS Code

## 📝 About This Project

Built as a second-semester college project to explore AI/ML concepts through practical implementation. The goal was to create something that bridges the gap between basic programming skills and more advanced AI coursework, focusing on algorithmic thinking and empirical analysis.

---

*Created as part of learning journey into AI and algorithms. Open to feedback and suggestions!*

# RecipeApp

A modern Android application that displays various recipes fetched from an API using **Retrofit**. Built with **Kotlin** and **Jetpack Compose**, this app follows the **MVVM (Model-View-ViewModel) architecture** to ensure clean code and scalability. Users can browse recipes with **images, names, and descriptions**, and navigate seamlessly between screens.

## Features

- Fetch and display recipes using **Retrofit**
- Clean **MVVM architecture** for better maintainability
- **Jetpack Compose** for a modern, declarative UI
- **Navigation Component** for seamless screen transitions
- **LiveData & ViewModel** for efficient state management

## Tech Stack

- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Architecture:** MVVM
- **Networking:** Retrofit
- **Dependency Injection:** Hilt (optional)
- **Navigation:** Jetpack Navigation Component
- **State Management:** LiveData / Flow

## Screenshots

*(Add relevant screenshots of the app UI here)*

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/RecipeApp.git
   ```
2. Open the project in **Android Studio**
3. Sync the project and install dependencies
4. Run the app on an emulator or a real device

## API Integration

This app fetches recipes from a **public API**. Make sure to add your API key (if required) in the appropriate file:

```kotlin
object ApiConstants {
    const val BASE_URL = "https://api.example.com/"
    const val API_KEY = "your_api_key_here"
}
```

## Folder Structure

```
RecipeApp/
│-- app/
│   ├── data/         # Retrofit API calls, Repository
│   ├── ui/           # Compose UI components, Screens
│   ├── viewmodel/    # ViewModels for handling UI logic
│   ├── navigation/   # Navigation management
│   ├── utils/        # Helper classes and constants
│   ├── MainActivity.kt  # Entry point of the app
│   ├── ...
```

## Contributing

Contributions are welcome! Feel free to **fork** this repo, create a **new branch**, and submit a **pull request** with your changes.

## License

This project is licensed under the **MIT License**.

---
Made with ❤️ using Kotlin & Jetpack Compose.


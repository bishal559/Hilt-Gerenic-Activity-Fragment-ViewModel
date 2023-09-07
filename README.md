
# Hilt-Generic Android Activity , Fragment Base and ViewModel Classes with Hilt Integration

This repository contains a set of generic base classes for Android app development, including `BaseActivity`, `BaseFragment`,`BaseViewMdeol`, and Hilt integration. These base classes are designed to help you streamline the development of your Android app by providing a foundation for common functionality.

## Table of Contents

- [BaseActivity](#baseactivity)
- [BaseFragment](#basefragment)
- [BaseViewModel](#baseviewmodel)
- [Hilt Integration](#hilt-integration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## BaseActivity

`BaseActivity` is an abstract base class for Android `AppCompatActivity` that simplifies the setup of data binding, ViewModel integration, and Hilt dependency injection. It provides the following features:

- Data binding setup
- ViewModel integration
- Dependency injection support (Hilt)

### Example Usage:

```kotlin
@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    // Override layoutRes, bindingVariable, and viewModel as needed

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Add your specific code here
    }
}
```

## BaseFragment

`BaseFragment` is an abstract base class for Android `Fragment` that simplifies data binding, ViewModel integration, and Hilt dependency injection, similar to `BaseActivity`. It provides the following features:

- Data binding setup
- ViewModel integration
- Dependency injection support (Hilt)

### Example Usage:

```kotlin
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    // Override layoutRes, bindingVariable, and viewModel as needed

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Add your specific code here
    }
}
```


## BaseViewModel

`BaseViewModel` is an abstract base class for Android `ViewModel`. It's designed to be extended for creating ViewModel classes with Hilt dependency injection support.

### Example Usage:

```kotlin
@HiltViewModel
class MainViewModel @Inject constructor(private val sharedPrefs: SharedPrefs) : BaseViewModel() {
    // Add your specific ViewModel logic here
}
```

## Hilt Integration

Hilt is a dependency injection library for Android. The code in this repository includes Hilt integration for `BaseActivity` and `BaseFragment`. Ensure that your project is set up with Hilt properly to take full advantage of dependency injection.

## Usage

To use these generic base classes in your Android project, you can simply extend them and override the necessary properties and methods according to your specific requirements. Make sure you have Hilt properly integrated into your project for dependency injection.

## Contributing

Contributions, issues, and feature requests are welcome! Feel free to open a pull request or create an issue if you have any suggestions or improvements.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

© 2023 [Bishal Adhikari]. All rights reserved.


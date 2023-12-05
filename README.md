# TELUS TV+ Mobile Test Automation
This project demonstrates basic mobile test automation using Appium for the TELUS TV+ application.
## Prerequisites
- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) installed
- [Maven](https://maven.apache.org/download.cgi) installed
- [Appium](http://appium.io/) installed
- [Xcode](https://developer.apple.com/xcode/) installed for iOS testing
- [Android Studio](https://developer.android.com/studio) installed for Android testing (optional)
## Getting Started
1. **Clone the Repository:**
```bash
git clone <repository-url>
cd telus-tv-mobile-test
```
2. **Install Dependencies:**
```bash
npm install -g appium
```
```bash
appium driver install xcuitest
```


3. **Start Appium Server:**
   Start the Appium server using the following command:
```bash
appium
```
4. **Configure Appium URL:**
   Once Appium is running, note the server URL provided in the console, e.g., `http://127.0.0.1:4723/`. Update the value of `appiumServerUrl` in your test script accordingly.
   ### Configuring Test Parameters

Test parameters such as platform name, device name, Appium server URL, and specific URLs are stored in configuration files. Two configuration files are provided for different environments:

- `config.properties`: Default configuration for local testing.
- `config-staging.properties`: Configuration for the staging environment.

You can add more configuration files as needed for different environments.

Example content of `config.properties`:

```properties
# config.properties

platformName=iOS
deviceName=iPhone 15 Pro
appiumServerUrl=http://127.0.0.1:4723
telus.Url=https://telustvplus.com/#/
telus.expectedTitle=TELUS TV+
```

5. **Run the Test:**
   Running Tests
To run the tests, you can use Maven profiles to specify the desired configuration file. For example, to run the tests with the staging configuration, use the following command:
```bash
mvn test -P staging
```

## Troubleshooting
If you encounter any issues during setup or execution, follow these steps:
- **Check Appium Server Logs:**
  Review the Appium server logs for any error messages.
- **Verify Appium Server URL:**
  Ensure that the `appiumServerUrl` in your test script matches the actual Appium server URL.
- **Install Required Drivers:**
  - For Android, ensure you have the appropriate emulator installed.
  - For iOS, ensure you have Xcode and an iOS simulator set up.
- **Update Appium Version:**
  Ensure you are using a compatible version of Appium. Update Appium if necessary:
  ```bash
  npm install -g appium@latest
  ```
## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


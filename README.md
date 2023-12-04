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
5. **Run the Test:**
   Execute the following command to run the test:
```bash
mvn test -DplatformName=iOS -DdeviceName=iPhone\\ 15\\ Pro -DappiumServerUrl=http://127.0.0.1:4723
```
   **Note:** Adjust parameters based on your platform and device.
## Customization
- **Navigate to Different URL:**
  Update the `driver.get("https://telustvplus.com/#/");` line in the test script with the desired URL.
- **Additional Assertions/Interactions:**
  Extend the test script with additional assertions or interactions as needed.
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

